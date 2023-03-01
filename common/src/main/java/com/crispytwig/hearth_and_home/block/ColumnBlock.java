package com.crispytwig.hearth_and_home.block;

import com.crispytwig.hearth_and_home.block.properties.ModBlockStateProperties;
import com.crispytwig.hearth_and_home.block.properties.ColumnType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import org.jetbrains.annotations.Nullable;

public class ColumnBlock extends Block {
    public static final EnumProperty<ColumnType> TYPE = ModBlockStateProperties.COLUMN_TYPE;

    public ColumnBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(TYPE, ColumnType.NONE));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState blockstate = this.defaultBlockState().setValue(TYPE, ColumnType.NONE);
        Level level = context.getLevel();
        BlockPos clickedPos = context.getClickedPos();
        blockstate = blockstate.setValue(TYPE, getType(blockstate, level.getBlockState(clickedPos.above()), level.getBlockState(clickedPos.below())));
        return blockstate;
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (level.isClientSide) return;
        ColumnType type = getType(state, level.getBlockState(pos.above()), level.getBlockState(pos.below()));
        if (state.getValue(TYPE) != type) {
            state = state.setValue(TYPE, type);
        }
        level.setBlock(pos, state, 3);
    }

    public ColumnType getType(BlockState state, BlockState above, BlockState below) {
        boolean shape_above_same = above.is(state.getBlock());
        boolean shape_below_same = below.is(state.getBlock());

        if (shape_above_same && !shape_below_same) {
            return ColumnType.BOTTOM;
        } else if (!shape_above_same && shape_below_same) {
            return ColumnType.TOP;
        } else if (shape_above_same) {
            return ColumnType.MIDDLE;
        }
        return ColumnType.NONE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(TYPE);
    }
}
