package com.starfish_studios.hearth_and_home.util.forge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;

public class UtilsImpl {
    public static ResourceLocation getID(Block object) {
        return ForgeRegistries.BLOCKS.getKey(object);
    }

    public static ResourceLocation getID(Item object) {
        return ForgeRegistries.ITEMS.getKey(object);
    }

    public static boolean isModLoaded(String id) {
        return ModList.get().isLoaded(id);
    }
}
