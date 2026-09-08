
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kconlac.extraindeco.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.kconlac.extraindeco.ExtraindecoMod;

public class ExtraindecoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtraindecoMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> B = REGISTRY.register("b",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.extraindeco.b")).icon(() -> new ItemStack(ExtraindecoModBlocks.TRAIN_TABLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ExtraindecoModBlocks.TRAIN_TABLE.get().asItem());
				tabData.accept(ExtraindecoModBlocks.TRAINBIN.get().asItem());
				tabData.accept(ExtraindecoModBlocks.LUGGAGERACK.get().asItem());
				tabData.accept(ExtraindecoModBlocks.STATIONBENCH.get().asItem());
				tabData.accept(ExtraindecoModBlocks.TICKETMACHINE.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGNBASE.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_1.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_2.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_3.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_4.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_5.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_6.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_7.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_8.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_9.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_10.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_1T.get().asItem());
				tabData.accept(ExtraindecoModBlocks.PLATFORMSIGN_2T.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBBLUE.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBDOORRED.get().asItem());
				tabData.accept(ExtraindecoModBlocks.ICDAYLINE_1.get().asItem());
				tabData.accept(ExtraindecoModBlocks.ICDAYLINE_2.get().asItem());
				tabData.accept(ExtraindecoModBlocks.ICDAYLINE_3.get().asItem());
				tabData.accept(ExtraindecoModBlocks.ICDAYLINE_4.get().asItem());
				tabData.accept(ExtraindecoModBlocks.TRENITALIALOGO_1.get().asItem());
				tabData.accept(ExtraindecoModBlocks.TRENITALIALOGOSMALL.get().asItem());
				tabData.accept(ExtraindecoModBlocks.TRENITALIALOGO_2.get().asItem());
				tabData.accept(ExtraindecoModBlocks.TRENITALIALOGO_3.get().asItem());
				tabData.accept(ExtraindecoModBlocks.TRENITALIALOGO_4.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBLOGO.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBLOGO_2.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBLOGO_3.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBLOGO_4.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBRABE_514.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBRABE_5142.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBRABE_5143.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBRABE_5144.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBFLIRTLOGO_1.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBFLIRTLOGO_2.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBFLIRTLOGO_3.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SBBFLIRTLOGO_4.get().asItem());
				tabData.accept(ExtraindecoModBlocks.DBLOGO_1.get().asItem());
				tabData.accept(ExtraindecoModBlocks.DBLOGO_2.get().asItem());
				tabData.accept(ExtraindecoModBlocks.DPR.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SIGNAL.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SIGNAL_2.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SCHARFENBERGCOUPLER.get().asItem());
				tabData.accept(ExtraindecoModBlocks.SHORTSCHARFENBERGCOUPLER.get().asItem());
				tabData.accept(ExtraindecoModItems.IRONPOLE.get());
				tabData.accept(ExtraindecoModItems.DISPLAY.get());
			}).build());
}
