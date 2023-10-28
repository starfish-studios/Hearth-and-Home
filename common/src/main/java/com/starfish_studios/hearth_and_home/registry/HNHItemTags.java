package com.starfish_studios.hearth_and_home.registry;

import com.starfish_studios.hearth_and_home.HearthAndHome;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class HNHItemTags {

    public static final TagKey<Item> NOT_WASHABLE = itemTag("not_washable");

    private static TagKey<Item> itemTag(String name) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(HearthAndHome.MOD_ID, name));
    }
}
