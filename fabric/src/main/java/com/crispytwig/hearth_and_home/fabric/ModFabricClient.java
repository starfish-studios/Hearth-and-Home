package com.crispytwig.hearth_and_home.fabric;

import com.crispytwig.hearth_and_home.client.ModClient;
import com.crispytwig.hearth_and_home.registry.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class ModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModClient.init();
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                ModBlocks.BARRED_GLASS.get(),
                ModBlocks.BARRED_GLASS_PANE.get()
        );
    }
}
