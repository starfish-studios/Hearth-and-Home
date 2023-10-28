package com.starfish_studios.hearth_and_home.fabric;

import com.starfish_studios.hearth_and_home.client.HearthAndHomeClient;
import com.starfish_studios.hearth_and_home.registry.HNHBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class HearthAndHomeFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HearthAndHomeClient.init();
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                // BARRED GLASS
                HNHBlocks.BARRED_GLASS.get(),
                HNHBlocks.BARRED_GLASS_PANE.get(),

                //Lattice
                HNHBlocks.OAK_LATTICE.get(),
                HNHBlocks.SPRUCE_LATTICE.get(),
                HNHBlocks.BIRCH_LATTICE.get(),
                HNHBlocks.JUNGLE_LATTICE.get(),
                HNHBlocks.ACACIA_LATTICE.get(),
                HNHBlocks.DARK_OAK_LATTICE.get(),
                HNHBlocks.MANGROVE_LATTICE.get(),
                HNHBlocks.CHERRY_LATTICE.get(),
                HNHBlocks.BAMBOO_LATTICE.get(),
                HNHBlocks.CRIMSON_LATTICE.get(),
                HNHBlocks.WARPED_LATTICE.get(),

                //Chimney
                HNHBlocks.COBBLESTONE_CHIMNEY.get(),
                HNHBlocks.MOSSY_COBBLESTONE_CHIMNEY.get(),
                HNHBlocks.STONE_BRICK_CHIMNEY.get(),
                HNHBlocks.MOSSY_STONE_BRICK_CHIMNEY.get(),
                HNHBlocks.GRANITE_CHIMNEY.get(),
                HNHBlocks.DIORITE_CHIMNEY.get(),
                HNHBlocks.ANDESITE_CHIMNEY.get(),
                HNHBlocks.COBBLED_DEEPSLATE_CHIMNEY.get(),
                HNHBlocks.POLISHED_DEEPSLATE_CHIMNEY.get(),
                HNHBlocks.DEEPSLATE_BRICK_CHIMNEY.get(),
                HNHBlocks.DEEPSLATE_TILE_CHIMNEY.get(),
                HNHBlocks.BRICK_CHIMNEY.get(),
                HNHBlocks.MUD_BRICK_CHIMNEY.get(),
                HNHBlocks.SANDSTONE_CHIMNEY.get(),
                HNHBlocks.RED_SANDSTONE_CHIMNEY.get(),
                HNHBlocks.PRISMARINE_CHIMNEY.get(),
                HNHBlocks.NETHER_BRICK_CHIMNEY.get(),
                HNHBlocks.RED_NETHER_BRICK_CHIMNEY.get(),
                HNHBlocks.BLACKSTONE_CHIMNEY.get(),
                HNHBlocks.POLISHED_BLACKSTONE_CHIMNEY.get(),
                HNHBlocks.POLISHED_BLACKSTONE_BRICK_CHIMNEY.get(),
                HNHBlocks.END_STONE_BRICK_CHIMNEY.get(),
                HNHBlocks.COBBLESTONE_BRICK_CHIMNEY.get()
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.translucent(),
            // STAINED BARRED GLASS
                HNHBlocks.WHITE_STAINED_BARRED_GLASS.get(),
                HNHBlocks.WHITE_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.ORANGE_STAINED_BARRED_GLASS.get(),
                HNHBlocks.ORANGE_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.MAGENTA_STAINED_BARRED_GLASS.get(),
                HNHBlocks.MAGENTA_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.LIGHT_BLUE_STAINED_BARRED_GLASS.get(),
                HNHBlocks.LIGHT_BLUE_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.YELLOW_STAINED_BARRED_GLASS.get(),
                HNHBlocks.YELLOW_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.LIME_STAINED_BARRED_GLASS.get(),
                HNHBlocks.LIME_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.PINK_STAINED_BARRED_GLASS.get(),
                HNHBlocks.PINK_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.GRAY_STAINED_BARRED_GLASS.get(),
                HNHBlocks.GRAY_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.LIGHT_GRAY_STAINED_BARRED_GLASS.get(),
                HNHBlocks.LIGHT_GRAY_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.CYAN_STAINED_BARRED_GLASS.get(),
                HNHBlocks.CYAN_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.PURPLE_STAINED_BARRED_GLASS.get(),
                HNHBlocks.PURPLE_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.BLUE_STAINED_BARRED_GLASS.get(),
                HNHBlocks.BLUE_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.BROWN_STAINED_BARRED_GLASS.get(),
                HNHBlocks.BROWN_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.GREEN_STAINED_BARRED_GLASS.get(),
                HNHBlocks.GREEN_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.RED_STAINED_BARRED_GLASS.get(),
                HNHBlocks.RED_STAINED_BARRED_GLASS_PANE.get(),
                HNHBlocks.BLACK_STAINED_BARRED_GLASS.get(),
                HNHBlocks.BLACK_STAINED_BARRED_GLASS_PANE.get()
        );
    }
}
