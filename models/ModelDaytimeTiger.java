// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelDaytimeTiger extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public ModelDaytimeTiger() {
		textureWidth = 800;
		textureHeight = 800;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, -58.5F);
		setRotationAngle(bone, -1.5708F, 0.0F, 0.0F);
		bone.setTextureOffset(74, 194).addBox(-48.0F, -128.0F, -67.0F, 108.0F, 128.0F, 131.0F, 0.0F, false);
		bone.setTextureOffset(190, 416).addBox(-48.0F, -20.0F, -111.0F, 108.0F, 20.0F, 44.0F, 0.0F, false);
		bone.setTextureOffset(157, 239).addBox(36.0F, -34.0F, -107.0F, 17.0F, 14.0F, 26.0F, 0.0F, false);
		bone.setTextureOffset(272, 243).addBox(36.0F, -54.25F, -107.0F, 17.0F, 14.0F, 26.0F, 0.0F, false);
		bone.setTextureOffset(256, 474).addBox(9.75F, -33.0F, -107.0F, 17.0F, 13.0F, 26.0F, 0.0F, false);
		bone.setTextureOffset(128, 276).addBox(9.75F, -53.5F, -107.0F, 17.0F, 13.0F, 26.0F, 0.0F, false);
		bone.setTextureOffset(124, 190).addBox(-15.5F, -36.0F, -107.0F, 17.0F, 16.0F, 26.0F, 0.0F, false);
		bone.setTextureOffset(441, 214).addBox(-15.5F, -57.0F, -107.0F, 17.0F, 16.0F, 26.0F, 0.0F, false);
		bone.setTextureOffset(177, 536).addBox(-41.75F, -53.75F, -107.0F, 17.0F, 12.0F, 26.0F, 0.0F, false);
		bone.setTextureOffset(173, 351).addBox(-48.0F, -86.0F, -111.0F, 108.0F, 34.0F, 44.0F, 0.0F, false);
		bone.setTextureOffset(328, 458).addBox(-40.5F, -123.25F, -73.0F, 36.0F, 34.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(429, 157).addBox(-41.75F, -32.0F, -107.0F, 17.0F, 12.0F, 26.0F, 0.0F, false);
		bone.setTextureOffset(267, 441).addBox(17.75F, -123.25F, -73.0F, 36.0F, 34.0F, 6.0F, 0.0F, false);
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
