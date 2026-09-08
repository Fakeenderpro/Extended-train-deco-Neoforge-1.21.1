package net.kconlac.extraindeco.entity;

import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.kconlac.extraindeco.ExtraindecoMod;

@EventBusSubscriber(modid = ExtraindecoMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ExtraindecoModEntities {
	public static EntityType<SeatEntity> SEAT;

	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(Registries.ENTITY_TYPE, helper -> {
			SEAT = EntityType.Builder.<SeatEntity>of(SeatEntity::new, MobCategory.MISC).sized(0.01f, 0.01f).noSummon().noSave().fireImmune().clientTrackingRange(8).updateInterval(20).build("seat");
			helper.register(ResourceLocation.fromNamespaceAndPath(ExtraindecoMod.MODID, "seat"), SEAT);
		});
	}
}
