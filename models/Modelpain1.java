// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelpain1 extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;
	private final ModelRenderer head_r10;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm_r1;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg_r1;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm_r1;
	private final ModelRenderer rightItem;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg_r1;
	private final ModelRenderer bone;

	public Modelpain1() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(4.0F, 34.0F, 7.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.1745F, 0.0F, -0.1745F);
		body_r1.setTextureOffset(0, 34).addBox(-3.0F, -24.0F, -2.0F, 7.0F, 13.0F, 1.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-6.0F, 34.0F, 7.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.1745F, 0.0F, 0.0873F);
		body_r2.setTextureOffset(0, 34).addBox(0.0F, -24.0F, -2.0F, 5.0F, 13.0F, 1.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(3.0F, 35.0F, 7.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, 0.1745F, 0.0F, -0.1745F);
		body_r3.setTextureOffset(49, 38).addBox(4.0F, -24.0F, -5.0F, 1.0F, 12.0F, 4.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-12.0F, 33.0F, 7.0F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, 0.1745F, 0.0F, 0.1745F);
		body_r4.setTextureOffset(0, 36).addBox(4.0F, -24.0F, -5.0F, 1.0F, 12.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(41, 0).addBox(0.0F, -9.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 0).addBox(-1.0F, -9.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 0).addBox(-1.0F, -9.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 0).addBox(0.0F, -9.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 0).addBox(0.0F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 0).addBox(-1.0F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 0).addBox(-1.0F, -9.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 0).addBox(0.0F, -9.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-4.0F, 15.0F, 5.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.1745F);
		head_r1.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-5.0F, 15.0F, 1.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.1745F);
		head_r2.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(41, 0).addBox(3.0F, -25.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(-6.0F, 15.0F, 7.0F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.0F, 0.0F, 0.1745F);
		head_r3.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(-2.0F, 16.0F, 6.0F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, 0.0F, -0.1745F);
		head_r4.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r4.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r4.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(-1.0F, 16.0F, 0.0F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, 0.0F, 0.0F, -0.1745F);
		head_r5.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r5.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r5.setTextureOffset(41, 0).addBox(3.0F, -25.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r5.setTextureOffset(41, 0).addBox(3.0F, -25.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r5.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(-3.0F, 16.0F, 5.0F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, 0.0F, 0.0F, -0.1745F);
		head_r6.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r6.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(5.0F, 15.0F, 5.0F);
		head.addChild(head_r7);
		setRotationAngle(head_r7, 0.0F, 0.0F, -0.5236F);
		head_r7.setTextureOffset(41, 0).addBox(2.0F, -24.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head_r7.setTextureOffset(41, 0).addBox(2.0F, -24.0F, -9.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(1.0F, 16.0F, 7.0F);
		head.addChild(head_r8);
		setRotationAngle(head_r8, 0.0F, 0.0F, -0.3491F);
		head_r8.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r8.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(-6.0F, 13.0F, -9.0F);
		head.addChild(head_r9);
		setRotationAngle(head_r9, -0.6981F, 0.0F, 0.0F);
		head_r9.setTextureOffset(41, 0).addBox(3.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r9.setTextureOffset(41, 0).addBox(8.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r9.setTextureOffset(41, 0).addBox(6.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r9.setTextureOffset(41, 0).addBox(5.0F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r10 = new ModelRenderer(this);
		head_r10.setRotationPoint(-8.0F, 14.0F, 4.0F);
		head.addChild(head_r10);
		setRotationAngle(head_r10, 0.0F, 0.0F, 0.3491F);
		head_r10.setTextureOffset(41, 0).addBox(3.0F, -24.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head_r10.setTextureOffset(41, 0).addBox(3.0F, -24.0F, -8.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setRotationPoint(-3.0F, 22.0F, 0.0F);
		leftArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, 0.0F, 0.0F, -0.0873F);
		leftArm_r1.setTextureOffset(40, 16).addBox(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		leftLeg.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setRotationPoint(-0.9F, 12.0F, 0.0F);
		leftLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, 0.0F, 0.0F, -0.0873F);
		leftLeg_r1.setTextureOffset(0, 16).addBox(-0.1F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);

		rightArm_r1 = new ModelRenderer(this);
		rightArm_r1.setRotationPoint(3.0F, 22.0F, 0.0F);
		rightArm.addChild(rightArm_r1);
		setRotationAngle(rightArm_r1, 0.0F, 0.0F, 0.0873F);
		rightArm_r1.setTextureOffset(40, 16).addBox(-8.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightItem = new ModelRenderer(this);
		rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
		rightArm.addChild(rightItem);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setRotationPoint(0.9F, 12.0F, 0.0F);
		rightLeg.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, 0.0F, 0.0F, 0.0873F);
		rightLeg_r1.setTextureOffset(16, 48).addBox(-3.9F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(11.0F, 19.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, -0.6981F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}