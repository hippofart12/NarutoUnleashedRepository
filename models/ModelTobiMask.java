// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelTobiMask extends EntityModel<Entity> {
	private final ModelRenderer bipedHead;

	public ModelTobiMask() {
		textureWidth = 150;
		textureHeight = 100;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.setTextureOffset(0, 57).addBox(-4.5F, -3.5F, -5.0F, 9.0F, 4.0F, 1.0F, 0.0F, false);
		bipedHead.setTextureOffset(12, 61).addBox(-4.01F, -6.25F, -4.75F, 0.0F, 5.0F, 9.0F, 0.0F, false);
		bipedHead.setTextureOffset(14, 70).addBox(-4.0F, -6.25F, 4.25F, 8.0F, 5.0F, 0.0F, 0.0F, false);
		bipedHead.setTextureOffset(12, 61).addBox(4.01F, -6.25F, -4.75F, 0.0F, 5.0F, 9.0F, 0.0F, false);
		bipedHead.setTextureOffset(5, 56).addBox(-4.5F, -8.5F, -5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bipedHead.setTextureOffset(5, 56).addBox(-3.5F, -5.5F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bipedHead.setTextureOffset(1, 57).addBox(-3.5F, -8.5F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		bipedHead.setTextureOffset(1, 57).addBox(-0.5F, -5.5F, -5.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bipedHead.render(matrixStack, buffer, packedLight, packedOverlay);
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