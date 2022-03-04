// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelzetsub extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer waist;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer head;

	public Modelzetsub() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		waist = new ModelRenderer(this);
		waist.setRotationPoint(0.0F, 12.0F, 0.0F);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightArm.setTextureOffset(40, 16).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		rightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		leftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(2, 0).addBox(-2.0F, -8.0F, -4.0F, 6.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(2, 0).addBox(-3.0F, -6.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 8).addBox(-3.0F, -2.0F, -4.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 8).addBox(-3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 8).addBox(-3.0F, -4.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 8).addBox(-3.0F, -7.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 8).addBox(-4.0F, -6.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 8).addBox(-4.0F, -5.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(15, 8).addBox(1.0F, -9.0F, 1.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(16, 8).addBox(1.0F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(16, 8).addBox(-1.0F, -9.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(16, 8).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(17, 8).addBox(0.0F, -9.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 8).addBox(0.0F, -9.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 9).addBox(0.0F, -9.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 8).addBox(1.0F, -9.0F, -4.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(20, 8).addBox(1.0F, -8.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(19, 8).addBox(0.0F, -8.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 0).addBox(3.0F, -8.0F, -5.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 0).addBox(4.0F, -8.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 1).addBox(4.0F, -8.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 2).addBox(4.0F, -8.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 3).addBox(4.0F, -8.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 2).addBox(4.0F, -8.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 0).addBox(4.0F, -8.0F, 1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 1).addBox(4.0F, -8.0F, 2.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 2).addBox(4.0F, -8.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 2).addBox(3.0F, -8.0F, 4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 0).addBox(2.0F, -8.0F, 4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 1).addBox(1.0F, -8.0F, 4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 0).addBox(0.0F, -8.0F, 4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 0).addBox(-1.0F, -7.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 0).addBox(-1.0F, -4.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		waist.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}