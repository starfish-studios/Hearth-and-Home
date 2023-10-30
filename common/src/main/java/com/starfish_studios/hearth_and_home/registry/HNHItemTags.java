package com.starfish_studios.hearth_and_home.registry;

import com.starfish_studios.hearth_and_home.HearthAndHome;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class HNHItemTags {

    public static final TagKey<Item> NOT_WASHABLE = itemTag("not_washable");

    public static final TagKey<Item> TRIMS = itemTag("trims");
    public static final TagKey<Item> PARQUETS = itemTag("parquets");
    public static final TagKey<Item> SANDED_WOOD = itemTag("sanded_wood");
    public static final TagKey<Item> LATTICES = itemTag("lattices");
    public static final TagKey<Item> SHINGLES = itemTag("shingles");
    public static final TagKey<Item> CHIMNEYS = itemTag("chimneys");
    public static final TagKey<Item> COLUMNS = itemTag("columns");
    public static final TagKey<Item> TERRACOTTA_BRICKS = itemTag("terracotta_bricks");
    public static final TagKey<Item> TILES = itemTag("tiles");

    private static TagKey<Item> itemTag(String name) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(HearthAndHome.MOD_ID, name));
    }
}
