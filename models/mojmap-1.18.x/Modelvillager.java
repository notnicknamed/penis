// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelvillager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "villager"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart arms;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Sword;

	public Modelvillager(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.arms = root.getChild("arms");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Sword = root.getChild("Sword");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(20, 16).addBox(
				-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(10, 24).addBox(-1.0F,
				-1.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 34)
						.addBox(-4.0F, -24.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -24.0F, -3.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition arms = partdefinition.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(44, 0)
						.addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 34)
						.addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 8)
						.addBox(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(28, 34)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(28, 0)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition Sword = partdefinition.addOrReplaceChild("Sword",
				CubeListBuilder.create().texOffs(53, 21)
						.addBox(-1.0F, -1.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 52)
						.addBox(-1.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 52)
						.addBox(-1.0F, -2.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 52)
						.addBox(-1.0F, -2.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 52)
						.addBox(-1.0F, -2.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 32)
						.addBox(-1.0F, -1.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-1.0F, -3.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 52)
						.addBox(-1.0F, -4.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 24)
						.addBox(-1.0F, -4.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 52)
						.addBox(-1.0F, -4.0F, -16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 52)
						.addBox(-1.0F, -5.0F, -16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 52)
						.addBox(-1.0F, -6.0F, -17.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.0F, -7.0F, -19.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 52)
						.addBox(-1.0F, -5.0F, -17.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-1.0F, -4.0F, -19.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -5.0F, -19.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 37)
						.addBox(-1.0F, -3.0F, -21.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 51)
						.addBox(-1.0F, -4.0F, -21.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 50)
						.addBox(-1.0F, -5.0F, -20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 4)
						.addBox(-1.0F, -4.0F, -20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 36)
						.addBox(-1.0F, -9.0F, -21.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 34)
						.addBox(-1.0F, -10.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-1.0F, -11.0F, -23.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 32)
						.addBox(-1.0F, -12.0F, -24.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 29)
						.addBox(-1.0F, -13.0F, -25.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(-1.0F, -14.0F, -26.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 48)
						.addBox(-1.0F, -6.0F, -19.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 24)
						.addBox(-1.0F, -6.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 46)
						.addBox(-1.0F, -7.0F, -20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 50)
						.addBox(-1.0F, -8.0F, -21.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 50)
						.addBox(-1.0F, -9.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 50)
						.addBox(-1.0F, -10.0F, -23.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 50)
						.addBox(-1.0F, -11.0F, -24.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 50)
						.addBox(-1.0F, -12.0F, -25.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 22)
						.addBox(-1.0F, -13.0F, -26.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.0F, -16.0F, -27.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 35)
						.addBox(-1.0F, -16.0F, -26.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 20)
						.addBox(-1.0F, -15.0F, -24.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 49)
						.addBox(-1.0F, -14.0F, -23.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 48)
						.addBox(-1.0F, -13.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 47)
						.addBox(-1.0F, -12.0F, -21.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 21)
						.addBox(-1.0F, -11.0F, -20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 46)
						.addBox(-1.0F, -10.0F, -19.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 22)
						.addBox(-1.0F, -9.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 20)
						.addBox(-1.0F, -8.0F, -17.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 10)
						.addBox(-1.0F, -9.0F, -16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-1.0F, -10.0F, -15.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 8)
						.addBox(-1.0F, -9.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 24)
						.addBox(-1.0F, -8.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 52)
						.addBox(-1.0F, -5.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 52)
						.addBox(-1.0F, -6.0F, -16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-1.0F, -8.0F, -16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 35)
						.addBox(-1.0F, -9.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 34)
						.addBox(-1.0F, -9.0F, -20.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-1.0F, -10.0F, -21.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 31)
						.addBox(-1.0F, -11.0F, -22.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 30)
						.addBox(-1.0F, -12.0F, -23.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 29)
						.addBox(-1.0F, -13.0F, -24.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-1.0F, -14.0F, -25.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-1.0F, -15.0F, -26.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-1.0F, -8.0F, -20.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 26)
						.addBox(-1.0F, -3.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 30)
						.addBox(-1.0F, -3.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 28)
						.addBox(-1.0F, -3.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 10.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Sword.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.zRot = headPitch / (180F / (float) Math.PI);
		this.LeftLeg.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}