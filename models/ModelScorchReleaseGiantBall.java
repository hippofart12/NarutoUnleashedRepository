// Made with Blockbench 3.9.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelScorchReleaseGiantBall extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public ModelScorchReleaseGiantBall() {
		textureWidth = 300;
		textureHeight = 150;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-32.0F, -32.0F, -32.0F, 64.0F, 64.0F, 64.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-24.0F, -33.0F, -24.0F, 48.0F, 66.0F, 48.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-33.0F, -24.0F, -24.0F, 66.0F, 48.0F, 48.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-24.0F, -24.0F, -33.0F, 48.0F, 48.0F, 66.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
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
