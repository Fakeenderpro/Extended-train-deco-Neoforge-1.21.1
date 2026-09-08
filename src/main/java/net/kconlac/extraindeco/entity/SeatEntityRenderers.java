package net.kconlac.extraindeco.entity;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.client.renderer.entity.NoopRenderer;

import net.kconlac.extraindeco.ExtraindecoMod;

@EventBusSubscriber(modid = ExtraindecoMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SeatEntityRenderers {
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ExtraindecoModEntities.SEAT, NoopRenderer::new);
	}
}
