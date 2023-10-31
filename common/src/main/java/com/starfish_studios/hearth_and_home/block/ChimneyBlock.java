package com.starfish_studios.hearth_and_home.block;

import com.starfish_studios.hearth_and_home.block.properties.ModBlockStateProperties;
import com.starfish_studios.hearth_and_home.registry.HNHSoundEvents;
import com.starfish_studios.hearth_and_home.util.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class ChimneyBlock extends Block implements SimpleWaterloggedBlock {
    protected static final VoxelShape NECK = Block.box(2.0, 0.0, 2.0, 14.0, 8.0, 14.0);
    protected static final VoxelShape LIP = Block.box(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape COLUMN = Block.box(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    public static final BooleanProperty TOP = ModBlockStateProperties.TOP;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    private static final VoxelShape VIRTUAL_FENCE_POST = Block.box(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
    private static final int SMOKE_DISTANCE = 5;

    public ChimneyBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(TOP, true).setValue(WATERLOGGED, false));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        LevelAccessor levelAccessor = context.getLevel();
        BlockPos blockPos = context.getClickedPos();

        boolean top = getTopState(levelAccessor.getBlockState(blockPos.above()));

        boolean bl = levelAccessor.getFluidState(blockPos).getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(TOP, top).setValue(WATERLOGGED, bl);
    }

    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return state.getValue(TOP) ? Shapes.or(NECK, LIP) : COLUMN;
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (!state.getValue(LIT) || !state.getValue(TOP)) return;

        if (random.nextInt(10) == 0) {
            level.playLocalSound(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, HNHSoundEvents.CHIMNEY_CRACKLE.get(), SoundSource.BLOCKS, 0.5F + random.nextFloat(), random.nextFloat() * 0.7F + 0.6F, false);
        }

        if (random.nextInt(5) == 0) {
            for(int i = 0; i < random.nextInt(1) + 1; ++i) {
                level.addParticle(ParticleTypes.LAVA, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, (random.nextFloat() / 2.0F), 5.0E-5, (random.nextFloat() / 2.0F));
            }
        }
        SimpleParticleType simpleParticleType = ParticleTypes.CAMPFIRE_COSY_SMOKE;
        level.addAlwaysVisibleParticle(simpleParticleType, true, pos.getX() + 0.5 + random.nextDouble() / 3.0 * (random.nextBoolean() ? 1 : -1), pos.getY() + random.nextDouble() + random.nextDouble(), pos.getZ() + 0.5 + random.nextDouble() / 3.0 * (random.nextBoolean() ? 1 : -1), 0.0, 0.07, 0.0);
        level.addParticle(ParticleTypes.SMOKE, pos.getX() + 0.5 + random.nextDouble() / 4.0 * (random.nextBoolean() ? 1 : -1), pos.getY() + 0.4, pos.getZ() + 0.5 + random.nextDouble() / 4.0 * (random.nextBoolean() ? 1 : -1), 0.0, 0.005, 0.0);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.is(ItemTags.SHOVELS) && state.getValue(LIT)) {
            level.setBlock(pos, state.setValue(LIT, false), 3);
            player.getItemInHand(hand).hurtAndBreak(1, player, (playerx) -> playerx.broadcastBreakEvent(hand));
            level.playSound(null, pos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS);
            player.swing(hand);
            return InteractionResult.SUCCESS;
        }
        if (stack.is(ItemTags.CREEPER_IGNITERS) && !state.getValue(LIT)) {
            level.setBlock(pos, state.setValue(LIT, true), 3);
            //stack.shrink(1);
            Utils.hurtStack(player, stack, hand);
            level.playSound(null, pos, SoundEvents.FIRECHARGE_USE, SoundSource.BLOCKS);
            player.swing(hand);
            return InteractionResult.SUCCESS;
        }

        return super.use(state, level, pos, player, hand, hit);
    }

    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos currentPos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));

        if (direction == Direction.UP) {
            state = state.setValue(TOP, getTopState(neighborState));
            if (neighborState.getBlock() instanceof ChimneyBlock) state = state.setValue(LIT, neighborState.getValue(LIT));
            return state;
        }

        return super.updateShape(state, direction, neighborState, level, currentPos, neighborPos);
    }

    public boolean getTopState(BlockState above) {
        return !(above.getBlock() instanceof ChimneyBlock);
    }

    public boolean placeLiquid(LevelAccessor level, BlockPos pos, BlockState state, FluidState fluidState) {
        if (state.getValue(BlockStateProperties.WATERLOGGED) && fluidState.getType() == Fluids.WATER) return false;

        if (state.getValue(LIT) && !level.isClientSide()) level.playSound(null, pos, SoundEvents.GENERIC_EXTINGUISH_FIRE, SoundSource.BLOCKS, 1.0F, 1.0F);

        level.setBlock(pos, state.setValue(WATERLOGGED, true).setValue(LIT, false), 3);
        level.scheduleTick(pos, fluidState.getType(), fluidState.getType().getTickDelay(level));
        return true;
    }

    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT, WATERLOGGED, TOP);
    }

    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type) {
        return true;
    }
}