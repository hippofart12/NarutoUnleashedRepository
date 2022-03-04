// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelthunder extends EntityModel<Entity> {
	private final ModelRenderer l1;
	private final ModelRenderer l2;
	private final ModelRenderer l3;
	private final ModelRenderer l4;
	private final ModelRenderer l5;
	private final ModelRenderer l6;
	private final ModelRenderer l7;
	private final ModelRenderer l8;
	private final ModelRenderer l9;
	private final ModelRenderer l10;
	private final ModelRenderer l11;
	private final ModelRenderer l12;

	public Modelthunder() {
		textureWidth = 32;
		textureHeight = 32;

		l1 = new ModelRenderer(this);
		l1.setRotationPoint(-0.5F, 24.0F, 0.5F);
		setRotationAngle(l1, 0.1745F, 0.0F, 0.0F);
		l1.setTextureOffset(16, 16).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l2 = new ModelRenderer(this);
		l2.setRotationPoint(0.0F, -6.0F, 0.0F);
		l1.addChild(l2);
		setRotationAngle(l2, -0.2618F, 0.0F, 0.0F);
		l2.setTextureOffset(15, 6).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l3 = new ModelRenderer(this);
		l3.setRotationPoint(0.0F, -6.0F, 0.0F);
		l2.addChild(l3);
		setRotationAngle(l3, 0.0873F, 0.0F, 0.0F);
		l3.setTextureOffset(8, 15).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l4 = new ModelRenderer(this);
		l4.setRotationPoint(-0.5F, 24.0F, 0.5F);
		setRotationAngle(l4, -0.0873F, 0.0F, 0.2618F);
		l4.setTextureOffset(0, 14).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l5 = new ModelRenderer(this);
		l5.setRotationPoint(0.0F, -6.0F, 0.0F);
		l4.addChild(l5);
		setRotationAngle(l5, -0.0873F, 0.0F, 0.0F);
		l5.setTextureOffset(12, 0).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l6 = new ModelRenderer(this);
		l6.setRotationPoint(0.0F, -6.0F, 0.0F);
		l5.addChild(l6);
		setRotationAngle(l6, 0.3491F, 0.0F, 0.0F);
		l6.setTextureOffset(12, 12).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l7 = new ModelRenderer(this);
		l7.setRotationPoint(-0.5F, 24.0F, 0.5F);
		setRotationAngle(l7, -0.0873F, 0.0F, -0.0873F);
		l7.setTextureOffset(4, 11).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l8 = new ModelRenderer(this);
		l8.setRotationPoint(0.0F, -6.0F, 0.0F);
		l7.addChild(l8);
		setRotationAngle(l8, -0.3491F, 0.0F, 0.0F);
		l8.setTextureOffset(8, 0).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l9 = new ModelRenderer(this);
		l9.setRotationPoint(0.0F, -6.0F, 0.0F);
		l8.addChild(l9);
		setRotationAngle(l9, 0.2618F, 0.0F, 0.0F);
		l9.setTextureOffset(8, 8).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l10 = new ModelRenderer(this);
		l10.setRotationPoint(-0.5F, 24.0F, 0.5F);
		setRotationAngle(l10, 0.0F, 0.0F, 0.0873F);
		l10.setTextureOffset(0, 7).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l11 = new ModelRenderer(this);
		l11.setRotationPoint(0.0F, -6.0F, 0.0F);
		l10.addChild(l11);
		setRotationAngle(l11, 0.3491F, 0.0F, 0.0F);
		l11.setTextureOffset(4, 4).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		l12 = new ModelRenderer(this);
		l12.setRotationPoint(0.0F, -6.0F, 0.0F);
		l11.addChild(l12);
		setRotationAngle(l12, -0.2618F, 0.0F, 0.0F);
		l12.setTextureOffset(0, 0).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		l1.render(matrixStack, buffer, packedLight, packedOverlay);
		l4.render(matrixStack, buffer, packedLight, packedOverlay);
		l7.render(matrixStack, buffer, packedLight, packedOverlay);
		l10.render(matrixStack, buffer, packedLight, packedOverlay);
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