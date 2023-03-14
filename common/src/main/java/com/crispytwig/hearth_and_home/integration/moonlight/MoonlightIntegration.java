package com.crispytwig.hearth_and_home.integration.moonlight;

import net.mehvahdjukaar.moonlight.api.set.BlocksColorAPI;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class MoonlightIntegration {

    public static Item changeColor(Item old, DyeColor newColor) {
        return BlocksColorAPI.changeColor(old, newColor);
    }
}
