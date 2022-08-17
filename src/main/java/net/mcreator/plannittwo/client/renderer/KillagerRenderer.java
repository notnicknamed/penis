
package net.mcreator.plannittwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.plannittwo.entity.KillagerEntity;
import net.mcreator.plannittwo.client.model.Modelvillager;

public class KillagerRenderer extends MobRenderer<KillagerEntity, Modelvillager<KillagerEntity>> {
	public KillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvillager(context.bakeLayer(Modelvillager.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KillagerEntity entity) {
		return new ResourceLocation("plannittwo:textures/farmer.png");
	}
}
