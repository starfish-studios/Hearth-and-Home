package com.crispytwig.hearth_and_home.events;

import com.crispytwig.hearth_and_home.integration.IntegrationHandler;
import com.crispytwig.hearth_and_home.util.block.BlocksColorAPI;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class BlockInteractionEvent {
    public static InteractionResult use(Player player, Level level, InteractionHand hand, BlockHitResult pos) {
        BlockState state = level.getBlockState(pos.getBlockPos());

        if (state.is(Blocks.WATER_CAULDRON) && state.getValue(LayeredCauldronBlock.LEVEL) != 0) return cauldronWashing(player, level, hand, pos);

        return InteractionResult.PASS;
    }

    public static InteractionResult cauldronWashing(Player player, Level level, InteractionHand hand, BlockHitResult pos) {
        BlockState state = level.getBlockState(pos.getBlockPos());
        ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.is(Items.AIR)) return InteractionResult.PASS;

        Item result = IntegrationHandler.changeColor(itemStack.getItem(), null);

        if (result == null || result == itemStack.getItem()) return InteractionResult.PASS;

        player.swing(hand);

        CompoundTag nbt = itemStack.getTag();
        ItemStack resultStack = new ItemStack(result);
        itemStack.shrink(1);
        if (nbt != null) resultStack.getOrCreateTag().merge(nbt);
        player.getInventory().add(resultStack);


        LayeredCauldronBlock.lowerFillLevel(state, level, pos.getBlockPos());
        return InteractionResult.SUCCESS;
    }
}
