package com.crispytwig.mod_template.fabric;

import com.crispytwig.mod_template.client.ModClient;
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
