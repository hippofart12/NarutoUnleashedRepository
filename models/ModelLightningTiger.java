// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelLightningTiger extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public ModelLightningTiger() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-2.0F, -6.0F, 0.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-1.5F, -4.0F, -2.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-1.75F, -5.5F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(1.75F, -5.5F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-1.5F, -5.0F, 6.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-1.25F, -4.0F, 12.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(1.25F, -4.0F, 12.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-1.5F, -7.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(1.5F, -7.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
