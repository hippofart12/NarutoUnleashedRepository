// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelRFS extends EntityModel<Entity> {
	private final ModelRenderer Fireball;

	public ModelRFS() {
		textureWidth = 6000;
		textureHeight = 6000;

		Fireball = new ModelRenderer(this);
		Fireball.setRotationPoint(0.0F, 8.0F, 0.0F);
		Fireball.setTextureOffset(0, 0).addBox(-128.0F, -199.0F, -128.0F, 256.0F, 327.0F, 256.0F, 0.0F, false);
		Fireball.setTextureOffset(240, 240).addBox(-112.0F, -183.0F, -144.0F, 224.0F, 295.0F, 16.0F, 0.0F, false);
		Fireball.setTextureOffset(192, 0).addBox(-112.0F, -183.0F, 128.0F, 224.0F, 295.0F, 16.0F, 0.0F, false);
		Fireball.setTextureOffset(120, 228).addBox(128.0F, -183.0F, -112.0F, 16.0F, 295.0F, 224.0F, 0.0F, false);
		Fireball.setTextureOffset(0, 188).addBox(-144.0F, -183.0F, -112.0F, 16.0F, 295.0F, 224.0F, 0.0F, false);
		Fireball.setTextureOffset(168, 168).addBox(-112.0F, 57.0F, -112.0F, 224.0F, 87.0F, 224.0F, 0.0F, false);
		Fireball.setTextureOffset(0, 128).addBox(-112.0F, -215.0F, -112.0F, 224.0F, 87.0F, 224.0F, 0.0F, false);
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
