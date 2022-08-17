
package net.mcreator.plannittwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.plannittwo.entity.AntiGolemEntity;
import net.mcreator.plannittwo.client.model.Modelsnowgolem;

public class AntiGolemRenderer extends MobRenderer<AntiGolemEntity, Modelsnowgolem<AntiGolemEntity>> {
	public AntiGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnowgolem(context.bakeLayer(Modelsnowgolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AntiGolemEntity entity) {
		return new ResourceLocation("plannittwo:textures/snow_golem.png");
	}
}
