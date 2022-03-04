// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelInhalingMaw extends EntityModel<Entity> {
	private final ModelRenderer ring1;
	private final ModelRenderer ring2;
	private final ModelRenderer ring3;

	public ModelInhalingMaw() {
		textureWidth = 64;
		textureHeight = 64;

		ring1 = new ModelRenderer(this);
		ring1.setRotationPoint(0.0F, 24.0F, 0.0F);
		ring1.setTextureOffset(0, 0).addBox(-6.0F, -8.25F, -6.0F, 12.0F, 0.0F, 12.0F, 0.0F, false);

		ring2 = new ModelRenderer(this);
		ring2.setRotationPoint(0.0F, 24.0F, 0.0F);
		ring2.setTextureOffset(0, 12).addBox(-5.0F, -4.25F, -5.0F, 10.0F, 0.0F, 10.0F, 0.0F, false);

		ring3 = new ModelRenderer(this);
		ring3.setRotationPoint(0.0F, 24.0F, 0.0F);
		ring3.setTextureOffset(0, 22).addBox(-4.0F, -0.25F, -4.0F, 8.0F, 0.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		ring1.render(matrixStack, buffer, packedLight, packedOverlay);
		ring2.render(matrixStack, buffer, packedLight, packedOverlay);
		ring3.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.ring3.rotateAngleY = f2 / 20.f;
		this.ring2.rotateAngleY = f2;
		this.ring1.rotateAngleY = f2 / 20.f;
	}
}
