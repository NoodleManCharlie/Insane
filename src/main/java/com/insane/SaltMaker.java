package com.insane;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.Direction;

public class SaltMaker extends HorizontalFacingBlock { // extends HorizontalFacingBlock
	// the codec is required since 1.20.5 however not actually used in Minecraft yet.
	public static final MapCodec<SaltMaker> CODEC = Block.createCodec(SaltMaker::new);
 
   	//public MapCodec<SaltMaker> getCodec() {
    //  return CODEC;
   	//}

	public SaltMaker(Settings settings) {
		super(settings);
		// Define the default block state as including a default facing.
		this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager)
	{
		stateManager.add(FACING);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext context)
	{
		// Rotate the block to face the player upon placement.
		return (BlockState) this.getDefaultState().with(FACING, context.getHorizontalPlayerFacing().getOpposite());
	}

	/*
 
	@Override
	protected MapCodec<? extends SaltMaker> getCodec() {
		return CODEC;
	}
 
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(Properties.HORIZONTAL_FACING);
	}
 
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
		Direction dir = state.get(FACING);
		return switch (dir) {
			case NORTH -> VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
			case SOUTH -> VoxelShapes.cuboid(0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
			case EAST -> VoxelShapes.cuboid(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
			case WEST -> VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f);
			default -> VoxelShapes.fullCube();
		};
	}
 
        @Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
	}
 */

	@Override
	protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
		throw new UnsupportedOperationException("Unimplemented method 'getCodec'");
	}
}
