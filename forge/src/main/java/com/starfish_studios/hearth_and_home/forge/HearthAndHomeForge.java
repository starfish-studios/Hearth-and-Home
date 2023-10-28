package com.starfish_studios.hearth_and_home.forge;

import com.starfish_studios.hearth_and_home.HearthAndHome;
//import com.starfish_studios.hearth_and_home.events.BlockInteractionEvent;
//import com.starfish_studios.hearth_and_home.integration.IntegrationHandler;
import com.starfish_studios.hearth_and_home.registry.HNHBlocks;
import com.starfish_studios.hearth_and_home.registry.forge.HNHRegistryImpl;
import com.starfish_studios.hearth_and_home.registry.forge.HNHTabsImpl;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@net.minecraftforge.fml.common.Mod(HearthAndHome.MOD_ID)
@net.minecraftforge.fml.common.Mod.EventBusSubscriber
public class HearthAndHomeForge {
    public HearthAndHomeForge() {
        HearthAndHome.init();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        HNHRegistryImpl.BLOCKS.register(bus);
        HNHRegistryImpl.ITEMS.register(bus);
        HNHRegistryImpl.SOUND_EVENTS.register(bus);
        HNHRegistryImpl.ENTITY_TYPES.register(bus);
        HNHRegistryImpl.BLOCK_ENTITY_TYPES.register(bus);
        HNHTabsImpl.register(bus);

        bus.addListener(this::setup);
//        bus.addListener(this::setupComplete);


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            HNHBlocks.registerFlammables();
        });
//        IntegrationHandler.init();
    }

//    private void setupComplete(final FMLLoadCompleteEvent event) {
//        IntegrationHandler.postInit();
//    }



//    @SubscribeEvent
//    public static void rightClick(PlayerInteractEvent.RightClickBlock event) {
//        BlockInteractionEvent.use(event.getEntity(), event.getLevel(), event.getHand(), event.getHitVec());
//    }

}