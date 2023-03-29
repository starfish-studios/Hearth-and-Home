package com.crispytwig.hearth_and_home.fabric;

import com.crispytwig.hearth_and_home.Mod;
import com.crispytwig.hearth_and_home.events.BlockInteractionEvent;
import com.crispytwig.hearth_and_home.integration.IntegrationHandler;
import com.crispytwig.hearth_and_home.registry.ModBlocks;
import com.crispytwig.hearth_and_home.util.block.BlocksColorInternal;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;

public class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Mod.init();
        ModBlocks.registerFlammables();
        UseBlockCallback.EVENT.register(BlockInteractionEvent::use);
        IntegrationHandler.init();
        IntegrationHandler.postInit();
    }
}