package com.crispytwig.hearth_and_home.integration;

import com.crispytwig.hearth_and_home.integration.moonlight.MoonlightIntegration;
import com.crispytwig.hearth_and_home.util.Utils;
import com.crispytwig.hearth_and_home.util.block.BlocksColorAPI;
import com.crispytwig.hearth_and_home.util.block.BlocksColorInternal;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class IntegrationHandler {

    public static void init() {
        // The BlocksColorAPI is copied from moonlight lib so there's no need to run it twice.
        if (!Utils.isModLoaded("moonlight")) BlocksColorInternal.setup();
    }

    public static Item changeColor(Item old, DyeColor newColor) {
        if (Utils.isModLoaded("moonlight")) return MoonlightIntegration.changeColor(old, newColor);
        return BlocksColorAPI.changeColor(old, newColor);
    }
}
