// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelIronSand_Big_Spike extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public ModelIronSand_Big_Spike() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(60, 57).addBox(-16.0F, -52.0F, -16.0F, 32.0F, 52.0F, 32.0F, 0.0F, false);
		bone.setTextureOffset(60, 57).addBox(-13.0F, -84.0F, -13.0F, 26.0F, 32.0F, 26.0F, 0.0F, false);
		bone.setTextureOffset(60, 57).addBox(-7.0F, -116.0F, -7.0F, 14.0F, 32.0F, 14.0F, 0.0F, false);
		bone.setTextureOffset(60, 57).addBox(-3.0F, -148.0F, -3.0F, 6.0F, 32.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}
