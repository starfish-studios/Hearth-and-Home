package com.starfish_studios.hearth_and_home.forge;

import com.starfish_studios.hearth_and_home.HearthAndHome;
import com.starfish_studios.hearth_and_home.client.HearthAndHomeClient;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@net.minecraftforge.fml.common.Mod.EventBusSubscriber(modid = HearthAndHome.MOD_ID, bus = net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD)
public class HearthAndHomeForgeClient {

    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        HearthAndHomeClient.init();
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {

    }


}
