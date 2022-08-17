package net.mcreator.plannittwo.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbowler_bear_man<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("plannittwo", "modelbowler_bear_man"),
			"main");
	public final ModelPart bb_main;

	public Modelbowler_bear_man(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 44).addBox(-6.0F, -8.0F, 2.0F, 3.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(38, 53)
						.addBox(1.0F, -8.0F, -6.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 49)
						.addBox(-6.0F, -8.0F, -6.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 15)
						.addBox(1.0F, -8.0F, 2.0F, 3.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -20.0F, -7.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-8.0F, -21.0F, 5.0F, 14.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 38)
						.addBox(-7.0F, -19.0F, -13.0F, 12.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-6.0F, -14.0F, -16.0F, 10.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(4.0F, -20.0F, -11.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -20.0F, -11.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
