// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwatershuriken extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelwatershuriken() {
		textureWidth = 32;
		textureHeight = 1024;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone, 1.5708F, 0.0F, 0.0F);
		bone.setTextureOffset(17, 3).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(6, 9).addBox(-2.0F, -0.5F, -6.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(7, 30).addBox(-3.0F, -0.5F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(23, 25).addBox(-4.0F, -0.5F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(7, 11).addBox(-1.0F, -0.5F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(19, 25).addBox(1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(3, 28).addBox(3.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(5, 29).addBox(1.0F, -0.5F, -2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(13, 29).addBox(4.0F, -0.5F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(13, 32).addBox(5.0F, -0.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(18, 16).addBox(-1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(13, 12).addBox(0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(13, 22).addBox(1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(26, 12).addBox(2.0F, -0.5F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(28, 9).addBox(3.0F, -0.5F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(15, 19).addBox(-3.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(24, 9).addBox(-5.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(13, 21).addBox(-6.0F, -0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 12).addBox(-6.0F, -0.5F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(3, 12).addBox(-6.0F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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