package com.starfish_studios.hearth_and_home.registry;

import com.starfish_studios.hearth_and_home.HearthAndHome;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class HNHBlockTags {

    public static final TagKey<Block> TRIMS = blockTag("trims");
    public static final TagKey<Block> CHIMNEYS = blockTag("chimneys");
    public static final TagKey<Block> COLUMNS = blockTag("columns");
    public static final TagKey<Block> PARQUETS = blockTag("parquets");
    public static final TagKey<Block> SHINGLES = blockTag("shingles");
    public static final TagKey<Block> SANDED_WOOD = blockTag("sanded_wood");
    public static final TagKey<Block> TERRACOTTA_BRICKS = blockTag("terracotta_bricks");
    public static final TagKey<Block> TILES = blockTag("tiles");


    private static TagKey<Block> blockTag(String name) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(HearthAndHome.MOD_ID, name));
    }
}
