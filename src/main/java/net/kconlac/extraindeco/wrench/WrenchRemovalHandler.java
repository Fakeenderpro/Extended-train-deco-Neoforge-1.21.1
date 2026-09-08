package net.kconlac.extraindeco.wrench;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.kconlac.extraindeco.block.ShortscharfenbergcouplerBlock;
import net.kconlac.extraindeco.block.ScharfenbergcouplerBlock;
import net.kconlac.extraindeco.block.TicketmachineBlock;
import net.kconlac.extraindeco.block.StationbenchBlock;
import net.kconlac.extraindeco.block.TraintableBlock;
import net.kconlac.extraindeco.block.TrainbinBlock;
import net.kconlac.extraindeco.block.LuggagerackBlock;
import net.kconlac.extraindeco.block.Signal2Block;
import net.kconlac.extraindeco.block.SignalBlock;
import net.kconlac.extraindeco.block.Platformsign1Block;
import net.kconlac.extraindeco.block.Platformsign2Block;
import net.kconlac.extraindeco.block.Platformsign3Block;
import net.kconlac.extraindeco.block.Platformsign4Block;
import net.kconlac.extraindeco.block.Platformsign5Block;
import net.kconlac.extraindeco.block.Platformsign6Block;
import net.kconlac.extraindeco.block.Platformsign7Block;
import net.kconlac.extraindeco.block.Platformsign8Block;
import net.kconlac.extraindeco.block.Platformsign9Block;
import net.kconlac.extraindeco.block.Platformsign10Block;
import net.kconlac.extraindeco.block.Platformsign1tBlock;
import net.kconlac.extraindeco.block.Platformsign2tBlock;
import net.kconlac.extraindeco.block.PlatformsignbaseBlock;
import net.kconlac.extraindeco.ExtraindecoMod;

import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = ExtraindecoMod.MODID)
public class WrenchRemovalHandler {
	private static final ResourceLocation CREATE_WRENCH = ResourceLocation.fromNamespaceAndPath("create", "wrench");

	// Add one line per block that should be removable with the Create wrench
	private static final Set<Class<?>> WRENCHABLE_BLOCKS = Set.of(
			ScharfenbergcouplerBlock.class,
			TicketmachineBlock.class,
			StationbenchBlock.class,
			TraintableBlock.class,
			TrainbinBlock.class,
			LuggagerackBlock.class,
			Signal2Block.class,
			SignalBlock.class,
			Platformsign1Block.class,
			Platformsign2Block.class,
			Platformsign3Block.class,
			Platformsign4Block.class,
			Platformsign5Block.class,
			Platformsign6Block.class,
			Platformsign7Block.class,
			Platformsign8Block.class,
			Platformsign9Block.class,
			Platformsign10Block.class,
			Platformsign1tBlock.class,
			Platformsign2tBlock.class,
			PlatformsignbaseBlock.class,

			ShortscharfenbergcouplerBlock.class);

	@SubscribeEvent
	public static void onWrenchUsed(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		Player player = event.getEntity();
		if (!player.isShiftKeyDown())
			return;
		ItemStack held = event.getItemStack();
		if (!CREATE_WRENCH.equals(BuiltInRegistries.ITEM.getKey(held.getItem())))
			return;
		Level level = event.getLevel();
		BlockPos pos = event.getPos();
		BlockState state = level.getBlockState(pos);
		if (!WRENCHABLE_BLOCKS.contains(state.getBlock().getClass()))
			return;
		event.setCanceled(true);
		event.setCancellationResult(InteractionResult.sidedSuccess(level.isClientSide()));
		if (!(level instanceof ServerLevel serverLevel))
			return;
		BlockEntity blockEntity = level.getBlockEntity(pos);
		List<ItemStack> drops = Block.getDrops(state, serverLevel, pos, blockEntity, player, held);
		level.removeBlock(pos, false);
		level.levelEvent(2001, pos, Block.getId(state));
		for (ItemStack drop : drops) {
			if (!player.getInventory().add(drop))
				player.drop(drop, false);
		}
	}
}
