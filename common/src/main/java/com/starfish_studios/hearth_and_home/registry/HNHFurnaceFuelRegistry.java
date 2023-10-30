package com.starfish_studios.hearth_and_home.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;

public class HNHFurnaceFuelRegistry {
    public static void init() {
        register(HNHItemTags.SANDED_WOOD, 300);
        register(HNHItemTags.LATTICES, 300);
        register(HNHItemTags.TRIMS, 300);
        register(HNHItemTags.PARQUETS, 300);
    }

    @ExpectPlatform
    public static void register(ItemLike item, int burnTicks) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void register(TagKey<Item> tag, int burnTicks) {
        throw new AssertionError();
    }
}