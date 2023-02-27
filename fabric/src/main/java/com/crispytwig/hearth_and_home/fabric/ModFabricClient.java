package com.crispytwig.hearth_and_home.fabric;

import com.crispytwig.hearth_and_home.client.ModClient;
import net.fabricmc.api.ClientModInitializer;

public class ModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModClient.init();
//        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
//                AFBlocks.OAK_TABLE.get(),
//        );
    }
}
