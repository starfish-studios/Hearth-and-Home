package com.starfish_studios.hearth_and_home.util.fabric;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class UtilsImpl {
    public static ResourceLocation getID(Block object) {
        return BuiltInRegistries.BLOCK.getKey(object);
    }

    public static ResourceLocation getID(Item object) {
        return BuiltInRegistries.ITEM.getKey(object);
    }

    public static boolean isModLoaded(String id) {
        return FabricLoader.getInstance().isModLoaded(id);
    }
}
