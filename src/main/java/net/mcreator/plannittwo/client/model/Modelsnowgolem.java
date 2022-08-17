package net.mcreator.plannittwo.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modelsnowgolem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("plannittwo", "modelsnowgolem"), "main");
	public final ModelPart RightLeg;

	public Modelsnowgolem(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition LeftLeg = RightLeg.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(38, 14).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, -11.0F, 0.0F));
		PartDefinition head = LeftLeg.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 24).addBox(-6.0F, -11.0F, -6.0F, 12.0F, 11.0F, 12.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, -9.0F, 0.0F));
		PartDefinition LeftArm = LeftLeg.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(36, 4).addBox(1.0F, -4.0F, -1.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition RightArm = LeftLeg.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(36, 0).addBox(1.0F, 2.0F, -1.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 2.3562F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightLeg.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
