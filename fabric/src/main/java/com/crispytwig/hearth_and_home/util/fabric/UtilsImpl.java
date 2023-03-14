package com.crispytwig.hearth_and_home.util.fabric;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class UtilsImpl {
    public static ResourceLocation getID(Block object) {
        return Registry.BLOCK.getKey(object);
    }

    public static ResourceLocation getID(Item object) {
        return Registry.ITEM.getKey(object);
    }
}
