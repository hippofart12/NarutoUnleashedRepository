// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelLavaball extends EntityModel<Entity> {
	private final ModelRenderer Fireball;

	public ModelLavaball() {
		textureWidth = 512;
		textureHeight = 512;

		Fireball = new ModelRenderer(this);
		Fireball.setRotationPoint(0.0F, 8.0F, 0.0F);
		Fireball.setTextureOffset(114, 73).addBox(-32.0F, -32.0F, -32.0F, 64.0F, 64.0F, 64.0F, 0.0F, false);
		Fireball.setTextureOffset(80, 43).addBox(-28.0F, -28.0F, -36.0F, 56.0F, 56.0F, 4.0F, 0.0F, false);
		Fireball.setTextureOffset(18, 220).addBox(-28.0F, -28.0F, 32.0F, 56.0F, 56.0F, 4.0F, 0.0F, false);
		Fireball.setTextureOffset(110, 88).addBox(32.0F, -28.0F, -28.0F, 4.0F, 56.0F, 56.0F, 0.0F, false);
		Fireball.setTextureOffset(63, 67).addBox(-36.0F, -28.0F, -28.0F, 4.0F, 56.0F, 56.0F, 0.0F, false);
		Fireball.setTextureOffset(57, 153).addBox(-28.0F, 32.0F, -28.0F, 56.0F, 4.0F, 56.0F, 0.0F, false);
		Fireball.setTextureOffset(90, 239).addBox(-28.0F, -36.0F, -28.0F, 56.0F, 4.0F, 56.0F, 0.0F, false);
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
