package com.crispytwig.hearth_and_home.forge;

import com.crispytwig.hearth_and_home.Mod;
import com.crispytwig.hearth_and_home.events.BlockInteractionEvent;
import com.crispytwig.hearth_and_home.integration.IntegrationHandler;
import com.crispytwig.hearth_and_home.registry.ModBlocks;
import com.crispytwig.hearth_and_home.registry.forge.ModRegistryImpl;
import com.crispytwig.hearth_and_home.util.block.BlocksColorAPI;
import com.crispytwig.hearth_and_home.util.block.BlocksColorInternal;
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
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
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
        bus.addListener(this::setupComplete);


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModBlocks.registerFlammables();
        });
        IntegrationHandler.init();
    }

    private void setupComplete(final FMLLoadCompleteEvent event) {
        IntegrationHandler.postInit();
    }



    @SubscribeEvent
    public static void rightClick(PlayerInteractEvent.RightClickBlock event) {
        BlockInteractionEvent.use(event.getEntity(), event.getLevel(), event.getHand(), event.getHitVec());
    }

}