// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelkisame extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public Modelkisame() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(3, 39).addBox(-7.0F, 18.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(14, 40).addBox(-6.0F, 15.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(1, 48).addBox(5.0F, 15.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(14, 36).addBox(4.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(14, 53).addBox(-5.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(15, 48).addBox(-6.0F, 18.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(15, 44).addBox(4.0F, 18.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(7, 48).addBox(4.0F, 18.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(6, 51).addBox(-6.0F, 18.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(18, 45).addBox(-5.0F, 15.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(20, 50).addBox(-5.0F, 15.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(11, 49).addBox(4.0F, 15.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(17, 44).addBox(4.0F, 15.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(2, 45).addBox(6.0F, 18.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(14, 44).addBox(-4.0F, 12.0F, 2.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(20, 52).addBox(-4.0F, 12.0F, -3.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(22, 23).addBox(-4.0F, 15.0F, 3.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(17, 26).addBox(-5.0F, 18.0F, 4.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(21, 58).addBox(-5.0F, 18.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 53).addBox(1.0F, 18.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(21, 52).addBox(-4.0F, 15.0F, -4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 53).addBox(0.0F, 15.0F, -4.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		rightLeg.setTextureOffset(0, 16).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		leftLeg.setTextureOffset(0, 16).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(42, 2).addBox(0.0F, 9.0F, -6.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		leftArm.setTextureOffset(42, 2).addBox(-1.0F, 8.0F, 4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(42, 2).addBox(0.0F, 9.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(44, 38).addBox(-1.0F, 7.0F, -11.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);
		leftArm.setTextureOffset(44, 38).addBox(-2.0F, 6.0F, -16.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		leftArm.setTextureOffset(44, 38).addBox(-2.0F, 6.0F, -29.0F, 5.0F, 6.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(44, 38).addBox(-3.0F, 5.0F, -26.0F, 7.0F, 8.0F, 5.0F, 0.0F, false);
		leftArm.setTextureOffset(44, 38).addBox(-3.0F, 5.0F, -21.0F, 7.0F, 8.0F, 5.0F, 0.0F, false);
		leftArm.setTextureOffset(52, 61).addBox(-1.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(8, 54).addBox(-1.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(8, 54).addBox(-1.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(52, 61).addBox(-1.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(31, 10).addBox(3.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(5, 47).addBox(3.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		rightArm.setTextureOffset(6, 46).addBox(-3.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		rightArm.setTextureOffset(6, 46).addBox(-3.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		rightArm.setTextureOffset(50, 62).addBox(-3.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightArm.setTextureOffset(50, 62).addBox(-3.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightArm.setTextureOffset(50, 62).addBox(-4.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		rightArm.setTextureOffset(0, 51).addBox(-4.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
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