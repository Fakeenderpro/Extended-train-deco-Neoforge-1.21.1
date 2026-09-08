
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

public class ScharfenbergcouplerBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public ScharfenbergcouplerBlock() {
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
			default -> Shapes.or(box(2, 5, 12, 14, 11, 16), box(6, 6, 5, 10, 10, 12), box(5, 5, 2, 11, 11, 5), box(3, 5, 0, 13, 11, 2), box(3, 6, 16, 7, 10, 18), box(-1, 5, 15, 2, 6, 16));
			case NORTH -> Shapes.or(box(2, 5, 0, 14, 11, 4), box(6, 6, 4, 10, 10, 11), box(5, 5, 11, 11, 11, 14), box(3, 5, 14, 13, 11, 16), box(9, 6, -2, 13, 10, 0), box(14, 5, 0, 17, 6, 1));
			case EAST -> Shapes.or(box(12, 5, 2, 16, 11, 14), box(5, 6, 6, 12, 10, 10), box(2, 5, 5, 5, 11, 11), box(0, 5, 3, 2, 11, 13), box(16, 6, 9, 18, 10, 13), box(15, 5, 14, 16, 6, 17));
			case WEST -> Shapes.or(box(0, 5, 2, 4, 11, 14), box(4, 6, 6, 11, 10, 10), box(11, 5, 5, 14, 11, 11), box(14, 5, 3, 16, 11, 13), box(-2, 6, 3, 0, 10, 7), box(0, 5, -1, 1, 6, 2));
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
