
package net.kconlac.extraindeco.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class ShortscharfenbergcouplerBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public ShortscharfenbergcouplerBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(2, 5, 4, 14, 11, 8), box(3, 5, 0, 13, 11, 1), box(5, 5, 1, 11, 11, 2), box(6, 6, 2, 10, 10, 4), box(3, 6, 8, 7, 10, 10), box(-1, 5, 7, 2, 6, 8));
			case NORTH -> Shapes.or(box(2, 5, 8, 14, 11, 12), box(3, 5, 15, 13, 11, 16), box(5, 5, 14, 11, 11, 15), box(6, 6, 12, 10, 10, 14), box(9, 6, 6, 13, 10, 8), box(14, 5, 8, 17, 6, 9));
			case EAST -> Shapes.or(box(4, 5, 2, 8, 11, 14), box(0, 5, 3, 1, 11, 13), box(1, 5, 5, 2, 11, 11), box(2, 6, 6, 4, 10, 10), box(8, 6, 9, 10, 10, 13), box(7, 5, 14, 8, 6, 17));
			case WEST -> Shapes.or(box(8, 5, 2, 12, 11, 14), box(15, 5, 3, 16, 11, 13), box(14, 5, 5, 15, 11, 11), box(12, 6, 6, 14, 10, 10), box(6, 6, 3, 8, 10, 7), box(8, 5, -1, 9, 6, 2));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}
