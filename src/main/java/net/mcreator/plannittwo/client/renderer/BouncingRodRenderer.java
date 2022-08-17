
package net.mcreator.plannittwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.plannittwo.entity.BouncingRodEntity;
import net.mcreator.plannittwo.client.model.ModelStillager_man;

public class BouncingRodRenderer extends MobRenderer<BouncingRodEntity, ModelStillager_man<BouncingRodEntity>> {
	public BouncingRodRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStillager_man(context.bakeLayer(ModelStillager_man.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BouncingRodEntity entity) {
		return new ResourceLocation("plannittwo:textures/stillager_man.png");
	}
}
