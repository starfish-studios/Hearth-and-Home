package com.crispytwig.hearth_and_home.forge;

import com.crispytwig.hearth_and_home.Mod;
import com.crispytwig.hearth_and_home.client.ModClient;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@net.minecraftforge.fml.common.Mod.EventBusSubscriber(modid = Mod.MOD_ID, bus = net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD)
public class ModForgeClient {

    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        ModClient.init();
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {

    }


}
