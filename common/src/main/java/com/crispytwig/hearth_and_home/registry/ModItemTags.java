package com.crispytwig.hearth_and_home.registry;

import com.crispytwig.hearth_and_home.Mod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModItemTags {

    public static final TagKey<Item> NOT_WASHABLE = itemTag("not_washable");

    private static TagKey<Item> itemTag(String name) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(Mod.MOD_ID, name));
    }
}
