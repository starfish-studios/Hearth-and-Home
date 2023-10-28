package com.starfish_studios.hearth_and_home.util;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class Utils {
    @ExpectPlatform
    public static ResourceLocation getID(Block object) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static ResourceLocation getID(Item object) {
        throw new AssertionError();
    }

    public static ResourceLocation getID(Object object) {
        if (object instanceof Block b) return getID(b);
        if (object instanceof Item b) return getID(b);
        throw new UnsupportedOperationException("Unknown class type " + object.getClass());
    }

    @ExpectPlatform
    public static boolean isModLoaded(String id) {
        throw new AssertionError();
    }

    public static void hurtStack(Player player, ItemStack stack, InteractionHand hand) {
        if (player.isCreative()) return;
        if (stack.isDamageableItem()) {
            stack.hurtAndBreak(1, player, (playerx) -> playerx.broadcastBreakEvent(hand));
            return;
        }
        stack.shrink(1);
    }
}
