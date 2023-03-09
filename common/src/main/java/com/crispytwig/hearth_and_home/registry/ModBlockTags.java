package com.crispytwig.hearth_and_home.registry;

import com.crispytwig.hearth_and_home.Mod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {

    public static final TagKey<Block> TRIMS = blockTag("trims");
    public static final TagKey<Block> CHIMNEYS = blockTag("chimneys");
    public static final TagKey<Block> COLUMNS = blockTag("columns");
    public static final TagKey<Block> PARQUETS = blockTag("parquets");
    public static final TagKey<Block> SHINGLES = blockTag("shingles");
    public static final TagKey<Block> SANDED_WOOD = blockTag("sanded_wood");
    public static final TagKey<Block> TERRACOTTA_BRICKS = blockTag("terracotta_bricks");
    public static final TagKey<Block> TILES = blockTag("tiles");


    private static TagKey<Block> blockTag(String name) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(Mod.MOD_ID, name));
    }
}
