package com.starfish_studios.hearth_and_home.registry.fabric;

import com.starfish_studios.hearth_and_home.HearthAndHome;
import com.starfish_studios.hearth_and_home.registry.HNHBlocks;
import com.starfish_studios.hearth_and_home.registry.HNHRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class HNHTabsImpl {
    public static final CreativeModeTab HNH_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            new ResourceLocation(HearthAndHome.MOD_ID, "tab"),
            FabricItemGroup.builder().title(Component.translatable("item_group." + HearthAndHome.MOD_ID + ".tab"))
                    .icon(() -> new ItemStack(HNHBlocks.BRICK_CHIMNEY.get().asItem())).displayItems((parameters, output) -> {
                        output.acceptAll(HNHRegistry.getAllModItems());
                    }).build());

    public static void register() {}
}