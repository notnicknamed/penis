// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "test"), "main");
	private final ModelPart bb_main;

	public Modeltest(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(51, 17)
						.addBox(-4.0F, -6.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-6.0F, -27.0F, -4.0F, 12.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 29)
						.addBox(-5.0F, -22.0F, -3.0F, 10.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -25.0F, -5.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -28.0F, -8.0F, 18.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-5.0F, -36.0F, -5.0F, 9.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(54, 51)
						.addBox(5.0F, -22.0F, -3.0F, 4.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 51)
						.addBox(-9.0F, -22.0F, -3.0F, 4.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 17)
						.addBox(-1.0F, -7.0F, -14.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(4, 6)
						.addBox(-2.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(0.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
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