
package net.mcreator.plannittwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.plannittwo.entity.StillagerEntity;
import net.mcreator.plannittwo.client.model.Modeltest;

public class StillagerRenderer extends MobRenderer<StillagerEntity, Modeltest<StillagerEntity>> {
	public StillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltest(context.bakeLayer(Modeltest.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StillagerEntity entity) {
		return new ResourceLocation("plannittwo:textures/test.png");
	}
}
