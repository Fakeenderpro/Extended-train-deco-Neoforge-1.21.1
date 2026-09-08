package net.kconlac.extraindeco.entity;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.BlockPos;

import net.kconlac.extraindeco.block.StationbenchBlock;
import net.kconlac.extraindeco.ExtraindecoMod;

@EventBusSubscriber(modid = ExtraindecoMod.MODID)
public class BenchSittingHandler {
	private static final double SEAT_HEIGHT = 0.5;

	@SubscribeEvent
	public static void onRightClickBench(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		Level level = event.getLevel();
		BlockPos pos = event.getPos();
		BlockState state = level.getBlockState(pos);
		if (!(state.getBlock() instanceof StationbenchBlock))
			return;
		Player player = event.getEntity();
		if (player.isShiftKeyDown() || player.isPassenger())
			return;
		if (event.getItemStack().getItem() instanceof BlockItem)
			return;
		event.setCanceled(true);
		event.setCancellationResult(InteractionResult.sidedSuccess(level.isClientSide()));
		if (level.isClientSide())
			return;
		if (!level.getEntitiesOfClass(SeatEntity.class, new AABB(pos)).isEmpty())
			return;
		SeatEntity seat = new SeatEntity(level, pos, SEAT_HEIGHT, state.getValue(StationbenchBlock.FACING).toYRot());
		level.addFreshEntity(seat);
		player.startRiding(seat);
	}
}
