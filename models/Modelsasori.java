// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelsasori extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public Modelsasori() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, 9.0F, -11.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, -3.0F, -16.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 38).addBox(-4.0F, 9.0F, -18.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 38).addBox(-5.0F, 10.0F, -21.0F, 10.0F, 1.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 38).addBox(-6.0F, 10.0F, -23.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(45, 62).addBox(-6.0F, 11.0F, -24.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(16, 16).addBox(-4.0F, -3.0F, -12.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(44, 9).addBox(-1.0F, 7.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(44, 9).addBox(-1.0F, 6.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(44, 9).addBox(-1.0F, 5.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(44, 9).addBox(-1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(44, 9).addBox(-1.0F, -7.0F, 7.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(44, 9).addBox(-2.0F, -15.0F, 7.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(44, 9).addBox(-1.0F, -19.0F, 7.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 38).addBox(-4.0F, 8.0F, -8.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(40, 38).addBox(-4.0F, 7.0F, -2.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(40, 38).addBox(-4.0F, 6.0F, 4.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(40, 38).addBox(-4.0F, 1.0F, 9.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 38).addBox(-4.0F, -5.0F, 8.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 38).addBox(-4.0F, -11.0F, 7.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(4, 37).addBox(4.0F, 2.0F, -18.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(4, 37).addBox(-5.0F, 2.0F, -18.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(4, 35).addBox(4.0F, 2.0F, -21.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(4, 35).addBox(-6.0F, 2.0F, -21.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(55, 60).addBox(6.0F, 5.0F, -24.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(55, 60).addBox(-7.0F, 5.0F, -24.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(55, 60).addBox(6.0F, 8.0F, -24.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(55, 60).addBox(-7.0F, 8.0F, -24.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(55, 60).addBox(6.0F, 2.0F, -24.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(55, 60).addBox(-7.0F, 2.0F, -24.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(2, 36).addBox(6.0F, 2.0F, -23.0F, 1.0F, 9.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(2, 36).addBox(-7.0F, 2.0F, -23.0F, 1.0F, 9.0F, 2.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftArm.setTextureOffset(40, 16).addBox(-1.0F, 10.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(52, 61).addBox(-1.0F, 21.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(8, 54).addBox(-1.0F, 19.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(8, 54).addBox(-1.0F, 19.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(52, 61).addBox(-1.0F, 21.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(51, 59).addBox(-2.0F, 21.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(51, 59).addBox(3.0F, 21.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(5, 47).addBox(-2.0F, 19.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(5, 47).addBox(3.0F, 19.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightArm.setTextureOffset(40, 16).addBox(-3.0F, 10.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		rightArm.setTextureOffset(6, 46).addBox(-3.0F, 19.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		rightArm.setTextureOffset(6, 46).addBox(-3.0F, 19.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		rightArm.setTextureOffset(50, 62).addBox(-3.0F, 21.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightArm.setTextureOffset(50, 62).addBox(-3.0F, 21.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightArm.setTextureOffset(50, 62).addBox(-4.0F, 21.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		rightArm.setTextureOffset(50, 62).addBox(1.0F, 21.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		rightArm.setTextureOffset(0, 51).addBox(-4.0F, 19.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		rightArm.setTextureOffset(0, 51).addBox(1.0F, 19.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
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
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}