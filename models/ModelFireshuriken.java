// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFireshuriken extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public ModelFireshuriken() {
		textureWidth = 512;
		textureHeight = 512;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone, 0.0F, -1.5708F, 1.5708F);
		bone.setTextureOffset(8, 18).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(9, 21).addBox(-2.0F, -0.5F, -6.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(15, 13).addBox(-3.0F, -0.5F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(20, 23).addBox(-4.0F, -0.5F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(13, 19).addBox(-1.0F, -0.5F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(12, 27).addBox(1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(11, 15).addBox(3.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(9, 22).addBox(1.0F, -0.5F, -2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(9, 25).addBox(4.0F, -0.5F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(9, 14).addBox(5.0F, -0.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(18, 21).addBox(-1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(16, 23).addBox(0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(6, 14).addBox(1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(12, 14).addBox(2.0F, -0.5F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(6, 27).addBox(3.0F, -0.5F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(13, 17).addBox(-3.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(15, 22).addBox(-5.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(12, 24).addBox(-6.0F, -0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(11, 15).addBox(-6.0F, -0.5F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 9).addBox(-6.0F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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