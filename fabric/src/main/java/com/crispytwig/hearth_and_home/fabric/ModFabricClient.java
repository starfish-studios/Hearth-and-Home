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
            // BARRED GLASS
                ModBlocks.BARRED_GLASS.get(),
                ModBlocks.BARRED_GLASS_PANE.get()
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.translucent(),
            // STAINED BARRED GLASS
                ModBlocks.WHITE_STAINED_BARRED_GLASS.get(),
                ModBlocks.WHITE_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.ORANGE_STAINED_BARRED_GLASS.get(),
                ModBlocks.ORANGE_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.MAGENTA_STAINED_BARRED_GLASS.get(),
                ModBlocks.MAGENTA_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.LIGHT_BLUE_STAINED_BARRED_GLASS.get(),
                ModBlocks.LIGHT_BLUE_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.YELLOW_STAINED_BARRED_GLASS.get(),
                ModBlocks.YELLOW_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.LIME_STAINED_BARRED_GLASS.get(),
                ModBlocks.LIME_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.PINK_STAINED_BARRED_GLASS.get(),
                ModBlocks.PINK_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.GRAY_STAINED_BARRED_GLASS.get(),
                ModBlocks.GRAY_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.LIGHT_GRAY_STAINED_BARRED_GLASS.get(),
                ModBlocks.LIGHT_GRAY_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.CYAN_STAINED_BARRED_GLASS.get(),
                ModBlocks.CYAN_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.PURPLE_STAINED_BARRED_GLASS.get(),
                ModBlocks.PURPLE_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.BLUE_STAINED_BARRED_GLASS.get(),
                ModBlocks.BLUE_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.BROWN_STAINED_BARRED_GLASS.get(),
                ModBlocks.BROWN_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.GREEN_STAINED_BARRED_GLASS.get(),
                ModBlocks.GREEN_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.RED_STAINED_BARRED_GLASS.get(),
                ModBlocks.RED_STAINED_BARRED_GLASS_PANE.get(),
                ModBlocks.BLACK_STAINED_BARRED_GLASS.get(),
                ModBlocks.BLACK_STAINED_BARRED_GLASS_PANE.get()
        );
    }
}
