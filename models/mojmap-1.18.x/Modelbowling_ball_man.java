// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbowling_ball_man<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bowling_ball_man"), "main");
	private final ModelPart bb_main;

	public Modelbowling_ball_man(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(36, 17)
						.addBox(8.0F, -16.0F, -8.0F, 1.0F, 15.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(18, 32)
						.addBox(-9.0F, -16.0F, -8.0F, 1.0F, 15.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(52, 48)
						.addBox(-8.0F, -16.0F, 8.0F, 16.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-8.0F, -16.0F, -9.0F, 16.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-9.0F, -16.0F, -8.0F, 1.0F, 15.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-1.0F, -17.0F, -8.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(18, 26)
						.addBox(-8.0F, -17.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 17)
						.addBox(0.0F, -17.0F, 0.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}