// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelChakra_Black_Pipes extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public ModelChakra_Black_Pipes() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(9, 87).addBox(-2.0F, -17.0F, 0.0F, 2.0F, 17.0F, 2.0F, 0.0F, true);
		bone.setTextureOffset(11, 82).addBox(-1.25F, -18.5F, 0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(52, 81).addBox(-0.75F, -20.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
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