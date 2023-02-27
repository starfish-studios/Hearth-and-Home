package com.crispytwig.mod_template.fabric;

import com.crispytwig.mod_template.Mod;
import net.fabricmc.api.ModInitializer;

public class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Mod.init();
        Mod.registerFlammables();
    }

}