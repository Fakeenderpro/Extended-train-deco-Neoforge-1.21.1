
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kconlac.extraindeco.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.kconlac.extraindeco.block.TrenitalialogosmallBlock;
import net.kconlac.extraindeco.block.Trenitalialogo4Block;
import net.kconlac.extraindeco.block.Trenitalialogo3Block;
import net.kconlac.extraindeco.block.Trenitalialogo2Block;
import net.kconlac.extraindeco.block.Trenitalialogo1Block;
import net.kconlac.extraindeco.block.TraintableBlock;
import net.kconlac.extraindeco.block.TrainbinBlock;
import net.kconlac.extraindeco.block.TicketmachineBlock;
import net.kconlac.extraindeco.block.StationbenchBlock;
import net.kconlac.extraindeco.block.SignalBlock;
import net.kconlac.extraindeco.block.Signal2Block;
import net.kconlac.extraindeco.block.ShortscharfenbergcouplerBlock;
import net.kconlac.extraindeco.block.ScharfenbergcouplerBlock;
import net.kconlac.extraindeco.block.Sbbrabe514Block;
import net.kconlac.extraindeco.block.Sbbrabe5144Block;
import net.kconlac.extraindeco.block.Sbbrabe5143Block;
import net.kconlac.extraindeco.block.Sbbrabe5142Block;
import net.kconlac.extraindeco.block.SbblogoBlock;
import net.kconlac.extraindeco.block.Sbblogo4Block;
import net.kconlac.extraindeco.block.Sbblogo3Block;
import net.kconlac.extraindeco.block.Sbblogo2Block;
import net.kconlac.extraindeco.block.Sbbflirtlogo4Block;
import net.kconlac.extraindeco.block.Sbbflirtlogo3Block;
import net.kconlac.extraindeco.block.Sbbflirtlogo2Block;
import net.kconlac.extraindeco.block.Sbbflirtlogo1Block;
import net.kconlac.extraindeco.block.SbbdoorredBlock;
import net.kconlac.extraindeco.block.SbbblueBlock;
import net.kconlac.extraindeco.block.PlatformsignbaseBlock;
import net.kconlac.extraindeco.block.Platformsign9Block;
import net.kconlac.extraindeco.block.Platformsign8Block;
import net.kconlac.extraindeco.block.Platformsign7Block;
import net.kconlac.extraindeco.block.Platformsign6Block;
import net.kconlac.extraindeco.block.Platformsign5Block;
import net.kconlac.extraindeco.block.Platformsign4Block;
import net.kconlac.extraindeco.block.Platformsign3Block;
import net.kconlac.extraindeco.block.Platformsign2tBlock;
import net.kconlac.extraindeco.block.Platformsign2Block;
import net.kconlac.extraindeco.block.Platformsign1tBlock;
import net.kconlac.extraindeco.block.Platformsign1Block;
import net.kconlac.extraindeco.block.Platformsign10Block;
import net.kconlac.extraindeco.block.LuggagerackBlock;
import net.kconlac.extraindeco.block.Icdayline4Block;
import net.kconlac.extraindeco.block.Icdayline3Block;
import net.kconlac.extraindeco.block.Icdayline2Block;
import net.kconlac.extraindeco.block.Icdayline1Block;
import net.kconlac.extraindeco.block.DprBlock;
import net.kconlac.extraindeco.block.Dblogo2Block;
import net.kconlac.extraindeco.block.Dblogo1Block;
import net.kconlac.extraindeco.ExtraindecoMod;

public class ExtraindecoModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ExtraindecoMod.MODID);
	public static final DeferredBlock<Block> TRAIN_TABLE = REGISTRY.register("train_table", TraintableBlock::new);
	public static final DeferredBlock<Block> TRAINBIN = REGISTRY.register("trainbin", TrainbinBlock::new);
	public static final DeferredBlock<Block> LUGGAGERACK = REGISTRY.register("luggagerack", LuggagerackBlock::new);
	public static final DeferredBlock<Block> PLATFORMSIGNBASE = REGISTRY.register("platformsignbase", PlatformsignbaseBlock::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_1 = REGISTRY.register("platformsign_1", Platformsign1Block::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_2 = REGISTRY.register("platformsign_2", Platformsign2Block::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_3 = REGISTRY.register("platformsign_3", Platformsign3Block::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_4 = REGISTRY.register("platformsign_4", Platformsign4Block::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_5 = REGISTRY.register("platformsign_5", Platformsign5Block::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_6 = REGISTRY.register("platformsign_6", Platformsign6Block::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_7 = REGISTRY.register("platformsign_7", Platformsign7Block::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_8 = REGISTRY.register("platformsign_8", Platformsign8Block::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_9 = REGISTRY.register("platformsign_9", Platformsign9Block::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_10 = REGISTRY.register("platformsign_10", Platformsign10Block::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_1T = REGISTRY.register("platformsign_1t", Platformsign1tBlock::new);
	public static final DeferredBlock<Block> PLATFORMSIGN_2T = REGISTRY.register("platformsign_2t", Platformsign2tBlock::new);
	public static final DeferredBlock<Block> SBBBLUE = REGISTRY.register("sbbblue", SbbblueBlock::new);
	public static final DeferredBlock<Block> SBBDOORRED = REGISTRY.register("sbbdoorred", SbbdoorredBlock::new);
	public static final DeferredBlock<Block> ICDAYLINE_1 = REGISTRY.register("icdayline_1", Icdayline1Block::new);
	public static final DeferredBlock<Block> ICDAYLINE_2 = REGISTRY.register("icdayline_2", Icdayline2Block::new);
	public static final DeferredBlock<Block> ICDAYLINE_3 = REGISTRY.register("icdayline_3", Icdayline3Block::new);
	public static final DeferredBlock<Block> ICDAYLINE_4 = REGISTRY.register("icdayline_4", Icdayline4Block::new);
	public static final DeferredBlock<Block> TRENITALIALOGO_1 = REGISTRY.register("trenitalialogo_1", Trenitalialogo1Block::new);
	public static final DeferredBlock<Block> TRENITALIALOGOSMALL = REGISTRY.register("trenitalialogosmall", TrenitalialogosmallBlock::new);
	public static final DeferredBlock<Block> TRENITALIALOGO_2 = REGISTRY.register("trenitalialogo_2", Trenitalialogo2Block::new);
	public static final DeferredBlock<Block> TRENITALIALOGO_3 = REGISTRY.register("trenitalialogo_3", Trenitalialogo3Block::new);
	public static final DeferredBlock<Block> TRENITALIALOGO_4 = REGISTRY.register("trenitalialogo_4", Trenitalialogo4Block::new);
	public static final DeferredBlock<Block> SBBLOGO = REGISTRY.register("sbblogo", SbblogoBlock::new);
	public static final DeferredBlock<Block> SBBLOGO_2 = REGISTRY.register("sbblogo_2", Sbblogo2Block::new);
	public static final DeferredBlock<Block> SBBLOGO_3 = REGISTRY.register("sbblogo_3", Sbblogo3Block::new);
	public static final DeferredBlock<Block> SBBLOGO_4 = REGISTRY.register("sbblogo_4", Sbblogo4Block::new);
	public static final DeferredBlock<Block> SBBRABE_514 = REGISTRY.register("sbbrabe_514", Sbbrabe514Block::new);
	public static final DeferredBlock<Block> SBBRABE_5142 = REGISTRY.register("sbbrabe_5142", Sbbrabe5142Block::new);
	public static final DeferredBlock<Block> SBBRABE_5143 = REGISTRY.register("sbbrabe_5143", Sbbrabe5143Block::new);
	public static final DeferredBlock<Block> SBBRABE_5144 = REGISTRY.register("sbbrabe_5144", Sbbrabe5144Block::new);
	public static final DeferredBlock<Block> SBBFLIRTLOGO_1 = REGISTRY.register("sbbflirtlogo_1", Sbbflirtlogo1Block::new);
	public static final DeferredBlock<Block> SBBFLIRTLOGO_2 = REGISTRY.register("sbbflirtlogo_2", Sbbflirtlogo2Block::new);
	public static final DeferredBlock<Block> SBBFLIRTLOGO_3 = REGISTRY.register("sbbflirtlogo_3", Sbbflirtlogo3Block::new);
	public static final DeferredBlock<Block> SBBFLIRTLOGO_4 = REGISTRY.register("sbbflirtlogo_4", Sbbflirtlogo4Block::new);
	public static final DeferredBlock<Block> DBLOGO_1 = REGISTRY.register("dblogo_1", Dblogo1Block::new);
	public static final DeferredBlock<Block> DBLOGO_2 = REGISTRY.register("dblogo_2", Dblogo2Block::new);
	public static final DeferredBlock<Block> DPR = REGISTRY.register("dpr", DprBlock::new);
	public static final DeferredBlock<Block> SIGNAL = REGISTRY.register("signal", SignalBlock::new);
	public static final DeferredBlock<Block> SIGNAL_2 = REGISTRY.register("signal_2", Signal2Block::new);
	public static final DeferredBlock<Block> SCHARFENBERGCOUPLER = REGISTRY.register("scharfenbergcoupler", ScharfenbergcouplerBlock::new);
	public static final DeferredBlock<Block> SHORTSCHARFENBERGCOUPLER = REGISTRY.register("shortscharfenbergcoupler", ShortscharfenbergcouplerBlock::new);
	public static final DeferredBlock<Block> STATIONBENCH = REGISTRY.register("stationbench", StationbenchBlock::new);
	public static final DeferredBlock<Block> TICKETMACHINE = REGISTRY.register("ticketmachine", TicketmachineBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
