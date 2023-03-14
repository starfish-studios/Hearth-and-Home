package com.crispytwig.hearth_and_home.util;

import dev.architectury.injectables.annotations.ExpectPlatform;
import io.netty.util.internal.UnstableApi;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.Fluid;

public class Utils {
    @ExpectPlatform
    public static ResourceLocation getID(Block object) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static ResourceLocation getID(Item object) {
        throw new AssertionError();
    }

    public static ResourceLocation getID(EntityType<?> object) {
        return Registry.ENTITY_TYPE.getKey(object);
    }

    public static ResourceLocation getID(BlockEntityType<?> object) {
        return Registry.BLOCK_ENTITY_TYPE.getKey(object);
    }

    //TODO: not sure if this is correct
    public static ResourceLocation getID(Biome object) {
        return BuiltinRegistries.BIOME.getKey(object);
    }

    public static ResourceLocation getID(Fluid object) {
        return Registry.FLUID.getKey(object);
    }

    @UnstableApi
    public static ResourceLocation getID(Object object) {
        if (object instanceof Block b) return getID(b);
        if (object instanceof Item b) return getID(b);
        if (object instanceof EntityType<?> b) return getID(b);
        if (object instanceof BlockEntityType<?> b) return getID(b);
        if (object instanceof Biome b) return getID(b);
        if (object instanceof Fluid b) return getID(b);
        throw new UnsupportedOperationException("Unknown class type " + object.getClass());
    }
}
