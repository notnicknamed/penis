// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelStillager_man<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "stillager_man"), "main");
	private final ModelPart bb_main;

	public ModelStillager_man(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(82, 40)
						.addBox(2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(75, 36)
						.addBox(-4.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -671.0F, -2.0F, 9.0F, 670.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 72)
						.addBox(4.0F, -409.0F, -2.0F, 9.0F, 29.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 72)
						.addBox(-12.0F, -409.0F, -2.0F, 9.0F, 29.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 36)
						.addBox(-12.0F, -409.0F, -9.0F, 22.0F, 29.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-12.0F, -692.0F, -9.0F, 28.0F, 29.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(72, 72)
						.addBox(-2.0F, -675.0F, -13.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
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