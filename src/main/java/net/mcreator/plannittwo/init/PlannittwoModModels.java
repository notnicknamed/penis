
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plannittwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.plannittwo.client.model.Modelvillager;
import net.mcreator.plannittwo.client.model.Modeltest;
import net.mcreator.plannittwo.client.model.Modelsnowgolem;
import net.mcreator.plannittwo.client.model.Modelenderdragon;
import net.mcreator.plannittwo.client.model.Modelbowling_ball_man;
import net.mcreator.plannittwo.client.model.Modelbowler_bear_man;
import net.mcreator.plannittwo.client.model.ModelStillager_man;
import net.mcreator.plannittwo.client.model.ModelBullet_man;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PlannittwoModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbowling_ball_man.LAYER_LOCATION, Modelbowling_ball_man::createBodyLayer);
		event.registerLayerDefinition(Modelbowler_bear_man.LAYER_LOCATION, Modelbowler_bear_man::createBodyLayer);
		event.registerLayerDefinition(ModelStillager_man.LAYER_LOCATION, ModelStillager_man::createBodyLayer);
		event.registerLayerDefinition(Modeltest.LAYER_LOCATION, Modeltest::createBodyLayer);
		event.registerLayerDefinition(Modelvillager.LAYER_LOCATION, Modelvillager::createBodyLayer);
		event.registerLayerDefinition(ModelBullet_man.LAYER_LOCATION, ModelBullet_man::createBodyLayer);
		event.registerLayerDefinition(Modelsnowgolem.LAYER_LOCATION, Modelsnowgolem::createBodyLayer);
		event.registerLayerDefinition(Modelenderdragon.LAYER_LOCATION, Modelenderdragon::createBodyLayer);
	}
}
