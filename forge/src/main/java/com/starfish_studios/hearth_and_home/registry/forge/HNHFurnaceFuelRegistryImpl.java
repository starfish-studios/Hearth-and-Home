package com.starfish_studios.hearth_and_home.registry.forge;

import com.google.common.collect.Maps;
import com.starfish_studios.hearth_and_home.mixin.forge.AbstractFurnaceBlockEntityAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;

import java.util.Map;

public class HNHFurnaceFuelRegistryImpl {
    public static final Map<Item, Integer> BURN_TIMES = Maps.newLinkedHashMap();

    public static void register(ItemLike item, int burnTicks) {
        BURN_TIMES.put(item.asItem(), burnTicks);
    }

    public static void register(TagKey<Item> tag, int burnTicks) {
        AbstractFurnaceBlockEntityAccessor.invokeAdd(BURN_TIMES, tag, burnTicks);
    }
}
