// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfieryexplosiveblast extends EntityModel<Entity> {
	private final ModelRenderer Fireball;

	public Modelfieryexplosiveblast() {
		textureWidth = 512;
		textureHeight = 512;

		Fireball = new ModelRenderer(this);
		Fireball.setRotationPoint(0.0F, 8.0F, 0.0F);
		Fireball.setTextureOffset(0, 0).addBox(-18.8F, -45.8F, -19.2F, 38.0F, 65.0F, 38.0F, 0.0F, false);
		Fireball.setTextureOffset(240, 240).addBox(-17.2F, -44.2F, -21.6F, 34.0F, 61.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(192, 0).addBox(-17.2F, -44.2F, 19.2F, 34.0F, 61.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(120, 228).addBox(19.6F, -44.2F, -16.8F, 2.0F, 61.0F, 34.0F, 0.0F, false);
		Fireball.setTextureOffset(0, 188).addBox(-21.2F, -44.2F, -16.8F, 2.0F, 61.0F, 34.0F, 0.0F, false);
		Fireball.setTextureOffset(168, 168).addBox(-17.2F, -7.4F, -16.8F, 34.0F, 29.0F, 34.0F, 0.0F, false);
		Fireball.setTextureOffset(0, 128).addBox(-17.2F, -48.2F, -16.8F, 34.0F, 29.0F, 34.0F, 0.0F, false);
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
