// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelNinjaspider extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body0;
	private final ModelRenderer body1;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg5;
	private final ModelRenderer leg6;
	private final ModelRenderer leg7;

	public ModelNinjaspider() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, -3.0F);
		head.setTextureOffset(32, 4).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);

		body0 = new ModelRenderer(this);
		body0.setRotationPoint(0.0F, 15.0F, 0.0F);
		body0.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, true);

		body1 = new ModelRenderer(this);
		body1.setRotationPoint(0.0F, 15.0F, 9.0F);
		body1.setTextureOffset(0, 12).addBox(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, 0.0F, true);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(4.0F, 15.0F, 2.0F);
		setRotationAngle(leg0, 0.0F, -0.6109F, 0.6109F);
		leg0.setTextureOffset(18, 0).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, true);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-4.0F, 15.0F, 2.0F);
		setRotationAngle(leg1, 0.0F, 0.6109F, -0.6109F);
		leg1.setTextureOffset(18, 0).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, true);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(4.0F, 15.0F, 1.0F);
		setRotationAngle(leg2, 0.0F, -0.1745F, 0.6109F);
		leg2.setTextureOffset(18, 0).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, true);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-4.0F, 15.0F, 1.0F);
		setRotationAngle(leg3, 0.0F, 0.1745F, -0.6109F);
		leg3.setTextureOffset(18, 0).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, true);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(4.0F, 15.0F, 0.0F);
		setRotationAngle(leg4, 0.0F, 0.1745F, 0.6109F);
		leg4.setTextureOffset(18, 0).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, true);

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(-4.0F, 15.0F, 0.0F);
		setRotationAngle(leg5, 0.0F, -0.1745F, -0.6109F);
		leg5.setTextureOffset(18, 0).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, true);

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(4.0F, 15.0F, -1.0F);
		setRotationAngle(leg6, 0.0F, 0.6109F, 0.6109F);
		leg6.setTextureOffset(18, 0).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, true);

		leg7 = new ModelRenderer(this);
		leg7.setRotationPoint(-4.0F, 15.0F, -1.0F);
		setRotationAngle(leg7, 0.0F, -0.6109F, -0.6109F);
		leg7.setTextureOffset(18, 0).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body0.render(matrixStack, buffer, packedLight, packedOverlay);
		body1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		leg5.render(matrixStack, buffer, packedLight, packedOverlay);
		leg6.render(matrixStack, buffer, packedLight, packedOverlay);
		leg7.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg5.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg6.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg7.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}
