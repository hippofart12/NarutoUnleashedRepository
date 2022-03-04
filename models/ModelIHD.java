// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelIHD extends EntityModel<Entity> {
	private final ModelRenderer Fireball;

	public ModelIHD() {
		textureWidth = 512;
		textureHeight = 512;

		Fireball = new ModelRenderer(this);
		Fireball.setRotationPoint(0.0F, 8.0F, 0.0F);
		Fireball.setTextureOffset(0, 0).addBox(-16.0F, -16.0F, -16.0F, 32.0F, 32.0F, 32.0F, 0.0F, false);
		Fireball.setTextureOffset(240, 240).addBox(-14.0F, -14.0F, -18.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(192, 0).addBox(-14.0F, -14.0F, 16.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(120, 228).addBox(16.0F, -14.0F, -14.0F, 2.0F, 28.0F, 28.0F, 0.0F, false);
		Fireball.setTextureOffset(0, 188).addBox(-18.0F, -14.0F, -14.0F, 2.0F, 28.0F, 28.0F, 0.0F, false);
		Fireball.setTextureOffset(168, 168).addBox(-14.0F, 16.0F, -14.0F, 28.0F, 2.0F, 28.0F, 0.0F, false);
		Fireball.setTextureOffset(0, 128).addBox(-14.0F, -18.0F, -14.0F, 28.0F, 2.0F, 28.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Fireball.render(matrixStack, buffer, packedLight, packedOverlay);
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
