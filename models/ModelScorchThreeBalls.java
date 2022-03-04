// Made with Blockbench 3.9.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelScorchThreeBalls extends EntityModel<Entity> {
	private final ModelRenderer Ball;
	private final ModelRenderer Ball2;
	private final ModelRenderer Ball3;

	public ModelScorchThreeBalls() {
		textureWidth = 862;
		textureHeight = 400;

		Ball = new ModelRenderer(this);
		Ball.setRotationPoint(0.0F, 24.0F, 0.0F);
		Ball.setTextureOffset(113, 165).addBox(14.0F, -36.0F, -2.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		Ball.setTextureOffset(113, 165).addBox(15.0F, -35.0F, -2.5F, 8.0F, 8.0F, 11.0F, 0.0F, false);
		Ball.setTextureOffset(113, 165).addBox(13.5F, -35.0F, -1.0F, 11.0F, 8.0F, 8.0F, 0.0F, false);
		Ball.setTextureOffset(113, 165).addBox(15.0F, -36.5F, -1.0F, 8.0F, 11.0F, 8.0F, 0.0F, false);

		Ball2 = new ModelRenderer(this);
		Ball2.setRotationPoint(-35.0F, 24.0F, 0.0F);
		Ball2.setTextureOffset(230, 100).addBox(12.0F, -34.0F, -2.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		Ball2.setTextureOffset(230, 100).addBox(13.0F, -33.0F, -2.5F, 8.0F, 8.0F, 11.0F, 0.0F, false);
		Ball2.setTextureOffset(230, 100).addBox(11.5F, -33.0F, -1.0F, 11.0F, 8.0F, 8.0F, 0.0F, false);
		Ball2.setTextureOffset(230, 100).addBox(13.0F, -34.5F, -1.0F, 8.0F, 11.0F, 8.0F, 0.0F, false);

		Ball3 = new ModelRenderer(this);
		Ball3.setRotationPoint(-16.5F, 9.0F, 0.0F);
		Ball3.setTextureOffset(168, 124).addBox(11.5F, -34.0F, -2.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		Ball3.setTextureOffset(168, 124).addBox(12.5F, -33.0F, -2.5F, 8.0F, 8.0F, 11.0F, 0.0F, false);
		Ball3.setTextureOffset(168, 124).addBox(11.0F, -33.0F, -1.0F, 11.0F, 8.0F, 8.0F, 0.0F, false);
		Ball3.setTextureOffset(168, 124).addBox(12.5F, -34.5F, -1.0F, 8.0F, 11.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Ball.render(matrixStack, buffer, packedLight, packedOverlay);
		Ball2.render(matrixStack, buffer, packedLight, packedOverlay);
		Ball3.render(matrixStack, buffer, packedLight, packedOverlay);
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
