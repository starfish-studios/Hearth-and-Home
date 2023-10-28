package com.starfish_studios.hearth_and_home.registry.forge;

import com.starfish_studios.hearth_and_home.HearthAndHome;
import com.starfish_studios.hearth_and_home.registry.HNHBlocks;
import com.starfish_studios.hearth_and_home.registry.HNHRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class HNHTabsImpl {
    public static final RegistryObject<CreativeModeTab> HNH_TAB = HNHRegistryImpl.MOD_TABS.register(HearthAndHome.MOD_ID, () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(HNHBlocks.BRICK_CHIMNEY.get().asItem()))
            .title(Component.translatable("item_group." + HearthAndHome.MOD_ID + ".tab"))
            .displayItems(((parameters, output) -> {
                output.acceptAll(HNHRegistry.getAllModItems());
            })).build());

    public static void register(IEventBus eventBus) {
        HNHRegistryImpl.MOD_TABS.register(eventBus);
    }
}