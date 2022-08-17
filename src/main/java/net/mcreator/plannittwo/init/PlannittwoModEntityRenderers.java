
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plannittwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.plannittwo.client.renderer.StillagerRenderer;
import net.mcreator.plannittwo.client.renderer.RenderDragonRenderer;
import net.mcreator.plannittwo.client.renderer.RangedItem2Renderer;
import net.mcreator.plannittwo.client.renderer.PenisRenderer;
import net.mcreator.plannittwo.client.renderer.KillagerRenderer;
import net.mcreator.plannittwo.client.renderer.BowlerbearRenderer;
import net.mcreator.plannittwo.client.renderer.BouncingRodRenderer;
import net.mcreator.plannittwo.client.renderer.AntiGolemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PlannittwoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PlannittwoModEntities.BOWLERBEAR.get(), BowlerbearRenderer::new);
		event.registerEntityRenderer(PlannittwoModEntities.PENIS.get(), PenisRenderer::new);
		event.registerEntityRenderer(PlannittwoModEntities.BOUNCING_ROD.get(), BouncingRodRenderer::new);
		event.registerEntityRenderer(PlannittwoModEntities.STILLAGER.get(), StillagerRenderer::new);
		event.registerEntityRenderer(PlannittwoModEntities.RENDER_DRAGON.get(), RenderDragonRenderer::new);
		event.registerEntityRenderer(PlannittwoModEntities.KILLAGER.get(), KillagerRenderer::new);
		event.registerEntityRenderer(PlannittwoModEntities.RANGED_ITEM_2.get(), RangedItem2Renderer::new);
		event.registerEntityRenderer(PlannittwoModEntities.ANTI_GOLEM.get(), AntiGolemRenderer::new);
	}
}
