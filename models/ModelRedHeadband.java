// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelRedHeadband extends EntityModel<Entity> {
	private final ModelRenderer head;

	public ModelRedHeadband() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(19, 0).addBox(-1.5F, -7.5F, -5.75F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(1, 7).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 3.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(4, 10).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 3.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(3, 3).addBox(-5.0F, -8.0F, -4.25F, 1.0F, 3.0F, 9.0F, 0.0F, true);
		head.setTextureOffset(2, 4).addBox(4.0F, -8.0F, -4.25F, 1.0F, 3.0F, 9.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
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
