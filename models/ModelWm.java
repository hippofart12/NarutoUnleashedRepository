// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class ModelWm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart bb_main;

	public ModelWm(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(14, 3)
						.addBox(-1.5F, -20.0F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(7, 3)
						.addBox(-3.5F, -7.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
						.addBox(1.5F, -7.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 6)
						.addBox(-1.0F, -7.0F, -3.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 18)
						.addBox(-1.0F, -7.0F, 1.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(-1.0F, -21.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 1024);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}
