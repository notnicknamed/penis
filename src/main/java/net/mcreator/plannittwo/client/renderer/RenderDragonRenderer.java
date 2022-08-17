
package net.mcreator.plannittwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.plannittwo.entity.RenderDragonEntity;
import net.mcreator.plannittwo.client.model.Modelenderdragon;

public class RenderDragonRenderer extends MobRenderer<RenderDragonEntity, Modelenderdragon<RenderDragonEntity>> {
	public RenderDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenderdragon(context.bakeLayer(Modelenderdragon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RenderDragonEntity entity) {
		return new ResourceLocation("plannittwo:textures/enderdragon.png");
	}
}
