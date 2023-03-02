package com.crispytwig.hearth_and_home.forge;

import com.crispytwig.hearth_and_home.Mod;
import com.crispytwig.hearth_and_home.registry.forge.ModRegistryImpl;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CauldronBlock;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.IRecipeContainer;
import net.minecraftforge.common.crafting.conditions.ItemExistsCondition;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

@net.minecraftforge.fml.common.Mod(Mod.MOD_ID)
@net.minecraftforge.fml.common.Mod.EventBusSubscriber
public class ModForge {
    public ModForge() {
        Mod.init();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModRegistryImpl.BLOCKS.register(bus);
        ModRegistryImpl.ITEMS.register(bus);
        ModRegistryImpl.SOUND_EVENTS.register(bus);
        ModRegistryImpl.ENTITY_TYPES.register(bus);
        ModRegistryImpl.BLOCK_ENTITY_TYPES.register(bus);

        bus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            Mod.registerFlammables();
        });
    }


    @SubscribeEvent
    public static void rightClick(PlayerInteractEvent.RightClickBlock event) {

        Level level = event.getLevel();
        BlockPos pos = event.getHitVec().getBlockPos();
        BlockState state = level.getBlockState(pos);

        if (!state.is(Blocks.WATER_CAULDRON)) return;
        if (state.getValue(LayeredCauldronBlock.LEVEL) == 0) return;

        InteractionHand hand = event.getHand();
        ItemStack itemStack = event.getEntity().getItemInHand(hand);
        ResourceLocation itemId = Registry.ITEM.getKey(itemStack.getItem());
        String itemNamespace = itemId.getNamespace();
        String itemName = itemId.getPath();

        for (DyeColor color : DyeColor.values()) {
            if (!itemName.startsWith(color.toString() + "_")) continue;
            Item result = Items.AIR;

            String substring = itemName.substring(color.toString().length() + 1);
            String probableIdUncolored = itemNamespace + ":" + substring;

            if (ForgeRegistries.ITEMS.containsKey(new ResourceLocation(probableIdUncolored))) {
                result = ForgeRegistries.ITEMS.getDelegate(new ResourceLocation(probableIdUncolored)).get().value();
            }
            probableIdUncolored = itemNamespace + ":white_" + substring;
            if (ForgeRegistries.ITEMS.containsKey(new ResourceLocation(probableIdUncolored))) {
                result = ForgeRegistries.ITEMS.getDelegate(new ResourceLocation(probableIdUncolored)).get().value();
            }

            if (result == Items.AIR || result == itemStack.getItem()) return;
            itemStack.shrink(1);
            event.getEntity().swing(hand);
            event.setUseItem(Event.Result.ALLOW);
            event.getEntity().getInventory().add(new ItemStack(result));
            LayeredCauldronBlock.lowerFillLevel(state, level, pos);
            event.setUseBlock(Event.Result.DENY);
            event.setCanceled(true);
            return;
        }
    }

}