package com.crispytwig.hearth_and_home.fabric;

import com.crispytwig.hearth_and_home.Mod;
import com.crispytwig.hearth_and_home.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Mod.init();
        ModBlocks.registerFlammables();
    }

}