
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kconlac.extraindeco.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.kconlac.extraindeco.item.IronpoleItem;
import net.kconlac.extraindeco.item.DisplayItem;
import net.kconlac.extraindeco.ExtraindecoMod;

public class ExtraindecoModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ExtraindecoMod.MODID);
	public static final DeferredItem<Item> TRAIN_TABLE = block(ExtraindecoModBlocks.TRAIN_TABLE);
	public static final DeferredItem<Item> IRONPOLE = REGISTRY.register("ironpole", IronpoleItem::new);
	public static final DeferredItem<Item> TRAINBIN = block(ExtraindecoModBlocks.TRAINBIN);
	public static final DeferredItem<Item> LUGGAGERACK = block(ExtraindecoModBlocks.LUGGAGERACK);
	public static final DeferredItem<Item> PLATFORMSIGNBASE = block(ExtraindecoModBlocks.PLATFORMSIGNBASE);
	public static final DeferredItem<Item> PLATFORMSIGN_1 = block(ExtraindecoModBlocks.PLATFORMSIGN_1);
	public static final DeferredItem<Item> PLATFORMSIGN_2 = block(ExtraindecoModBlocks.PLATFORMSIGN_2);
	public static final DeferredItem<Item> PLATFORMSIGN_3 = block(ExtraindecoModBlocks.PLATFORMSIGN_3);
	public static final DeferredItem<Item> PLATFORMSIGN_4 = block(ExtraindecoModBlocks.PLATFORMSIGN_4);
	public static final DeferredItem<Item> PLATFORMSIGN_5 = block(ExtraindecoModBlocks.PLATFORMSIGN_5);
	public static final DeferredItem<Item> PLATFORMSIGN_6 = block(ExtraindecoModBlocks.PLATFORMSIGN_6);
	public static final DeferredItem<Item> PLATFORMSIGN_7 = block(ExtraindecoModBlocks.PLATFORMSIGN_7);
	public static final DeferredItem<Item> PLATFORMSIGN_8 = block(ExtraindecoModBlocks.PLATFORMSIGN_8);
	public static final DeferredItem<Item> PLATFORMSIGN_9 = block(ExtraindecoModBlocks.PLATFORMSIGN_9);
	public static final DeferredItem<Item> PLATFORMSIGN_10 = block(ExtraindecoModBlocks.PLATFORMSIGN_10);
	public static final DeferredItem<Item> PLATFORMSIGN_1T = block(ExtraindecoModBlocks.PLATFORMSIGN_1T);
	public static final DeferredItem<Item> PLATFORMSIGN_2T = block(ExtraindecoModBlocks.PLATFORMSIGN_2T);
	public static final DeferredItem<Item> SBBBLUE = block(ExtraindecoModBlocks.SBBBLUE);
	public static final DeferredItem<Item> SBBDOORRED = block(ExtraindecoModBlocks.SBBDOORRED);
	public static final DeferredItem<Item> ICDAYLINE_1 = block(ExtraindecoModBlocks.ICDAYLINE_1);
	public static final DeferredItem<Item> ICDAYLINE_2 = block(ExtraindecoModBlocks.ICDAYLINE_2);
	public static final DeferredItem<Item> ICDAYLINE_3 = block(ExtraindecoModBlocks.ICDAYLINE_3);
	public static final DeferredItem<Item> ICDAYLINE_4 = block(ExtraindecoModBlocks.ICDAYLINE_4);
	public static final DeferredItem<Item> TRENITALIALOGO_1 = block(ExtraindecoModBlocks.TRENITALIALOGO_1);
	public static final DeferredItem<Item> TRENITALIALOGOSMALL = block(ExtraindecoModBlocks.TRENITALIALOGOSMALL);
	public static final DeferredItem<Item> TRENITALIALOGO_2 = block(ExtraindecoModBlocks.TRENITALIALOGO_2);
	public static final DeferredItem<Item> TRENITALIALOGO_3 = block(ExtraindecoModBlocks.TRENITALIALOGO_3);
	public static final DeferredItem<Item> TRENITALIALOGO_4 = block(ExtraindecoModBlocks.TRENITALIALOGO_4);
	public static final DeferredItem<Item> SBBLOGO = block(ExtraindecoModBlocks.SBBLOGO);
	public static final DeferredItem<Item> SBBLOGO_2 = block(ExtraindecoModBlocks.SBBLOGO_2);
	public static final DeferredItem<Item> SBBLOGO_3 = block(ExtraindecoModBlocks.SBBLOGO_3);
	public static final DeferredItem<Item> SBBLOGO_4 = block(ExtraindecoModBlocks.SBBLOGO_4);
	public static final DeferredItem<Item> SBBRABE_514 = block(ExtraindecoModBlocks.SBBRABE_514);
	public static final DeferredItem<Item> SBBRABE_5142 = block(ExtraindecoModBlocks.SBBRABE_5142);
	public static final DeferredItem<Item> SBBRABE_5143 = block(ExtraindecoModBlocks.SBBRABE_5143);
	public static final DeferredItem<Item> SBBRABE_5144 = block(ExtraindecoModBlocks.SBBRABE_5144);
	public static final DeferredItem<Item> SBBFLIRTLOGO_1 = block(ExtraindecoModBlocks.SBBFLIRTLOGO_1);
	public static final DeferredItem<Item> SBBFLIRTLOGO_2 = block(ExtraindecoModBlocks.SBBFLIRTLOGO_2);
	public static final DeferredItem<Item> SBBFLIRTLOGO_3 = block(ExtraindecoModBlocks.SBBFLIRTLOGO_3);
	public static final DeferredItem<Item> SBBFLIRTLOGO_4 = block(ExtraindecoModBlocks.SBBFLIRTLOGO_4);
	public static final DeferredItem<Item> DBLOGO_1 = block(ExtraindecoModBlocks.DBLOGO_1);
	public static final DeferredItem<Item> DBLOGO_2 = block(ExtraindecoModBlocks.DBLOGO_2);
	public static final DeferredItem<Item> DPR = block(ExtraindecoModBlocks.DPR);
	public static final DeferredItem<Item> SIGNAL = block(ExtraindecoModBlocks.SIGNAL);
	public static final DeferredItem<Item> SIGNAL_2 = block(ExtraindecoModBlocks.SIGNAL_2);
	public static final DeferredItem<Item> SCHARFENBERGCOUPLER = block(ExtraindecoModBlocks.SCHARFENBERGCOUPLER);
	public static final DeferredItem<Item> SHORTSCHARFENBERGCOUPLER = block(ExtraindecoModBlocks.SHORTSCHARFENBERGCOUPLER);
	public static final DeferredItem<Item> STATIONBENCH = block(ExtraindecoModBlocks.STATIONBENCH);
	public static final DeferredItem<Item> TICKETMACHINE = block(ExtraindecoModBlocks.TICKETMACHINE);
	public static final DeferredItem<Item> DISPLAY = REGISTRY.register("display", DisplayItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
