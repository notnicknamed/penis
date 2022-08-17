
package net.mcreator.plannittwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.plannittwo.entity.BowlerbearEntity;
import net.mcreator.plannittwo.client.model.Modelbowler_bear_man;

public class BowlerbearRenderer extends MobRenderer<BowlerbearEntity, Modelbowler_bear_man<BowlerbearEntity>> {
	public BowlerbearRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbowler_bear_man(context.bakeLayer(Modelbowler_bear_man.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BowlerbearEntity entity) {
		return new ResourceLocation("plannittwo:textures/bowler_bear_man.png");
	}
}
