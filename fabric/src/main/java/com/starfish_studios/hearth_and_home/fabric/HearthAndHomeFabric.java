package com.starfish_studios.hearth_and_home.fabric;

import com.starfish_studios.hearth_and_home.HearthAndHome;
//import com.starfish_studios.hearth_and_home.events.BlockInteractionEvent;
//import com.starfish_studios.hearth_and_home.integration.IntegrationHandler;
import com.starfish_studios.hearth_and_home.registry.HNHBlocks;
import com.starfish_studios.hearth_and_home.registry.fabric.HNHTabsImpl;
import net.fabricmc.api.ModInitializer;

public class HearthAndHomeFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        HearthAndHome.init();
        HNHBlocks.registerFlammables();
//        UseBlockCallback.EVENT.register(BlockInteractionEvent::use);
        HNHTabsImpl.register();
//        IntegrationHandler.init();
//        IntegrationHandler.postInit();
    }
}