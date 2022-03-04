// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelmasswatermissile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "missile"), "main");
	private final ModelPart bb_main;

	public Modelmasswatermissile(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(20, 7)
						.addBox(13.5F, -18.0F, 0.0F, 9.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(6.75F, -36.0F, 0.0F, 9.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(-22.5F, -18.0F, 0.0F, 9.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(-15.75F, -36.0F, 0.0F, 9.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(28, 13)
						.addBox(-9.0F, -85.5F, -4.5F, 18.0F, 72.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(-4.5F, -18.0F, 18.0F, 9.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(-4.5F, -36.0F, 11.25F, 9.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(-4.5F, -36.0F, -11.25F, 9.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(-4.5F, -18.0F, -18.0F, 9.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(-4.5F, -92.25F, 0.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 1800);
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
