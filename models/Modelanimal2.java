// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelanimal2 extends EntityModel<Entity> {
	private final ModelRenderer unknown_bone;
	private final ModelRenderer unknown_bone_r1;
	private final ModelRenderer unknown_bone_r2;
	private final ModelRenderer unknown_bone_r3;
	private final ModelRenderer unknown_bone_r4;
	private final ModelRenderer Leg3;
	private final ModelRenderer unknown_bone_r5;
	private final ModelRenderer Leg4;
	private final ModelRenderer unknown_bone_r6;
	private final ModelRenderer Leg2;
	private final ModelRenderer unknown_bone_r7;
	private final ModelRenderer Leg1;
	private final ModelRenderer unknown_bone_r8;
	private final ModelRenderer Head;
	private final ModelRenderer unknown_bone_r9;
	private final ModelRenderer unknown_bone_r10;
	private final ModelRenderer unknown_bone_r11;
	private final ModelRenderer unknown_bone_r12;
	private final ModelRenderer unknown_bone_r13;
	private final ModelRenderer unknown_bone_r14;
	private final ModelRenderer unknown_bone_r15;
	private final ModelRenderer unknown_bone_r16;
	private final ModelRenderer unknown_bone_r17;

	public Modelanimal2() {
		textureWidth = 128;
		textureHeight = 128;

		unknown_bone = new ModelRenderer(this);
		unknown_bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		unknown_bone.setTextureOffset(7, 104).addBox(-6.0F, -16.0F, -10.0F, 12.0F, 11.0F, 11.0F, 0.0F, false);
		unknown_bone.setTextureOffset(13, 109).addBox(-7.0F, -15.0F, -9.0F, 1.0F, 9.0F, 9.0F, 0.0F, false);
		unknown_bone.setTextureOffset(11, 102).addBox(6.0F, -15.0F, -9.0F, 1.0F, 9.0F, 9.0F, 0.0F, false);
		unknown_bone.setTextureOffset(10, 109).addBox(-5.0F, -17.0F, -9.0F, 10.0F, 1.0F, 9.0F, 0.0F, false);
		unknown_bone.setTextureOffset(12, 106).addBox(-4.0F, -14.0F, 1.0F, 9.0F, 9.0F, 9.0F, 0.0F, false);
		unknown_bone.setTextureOffset(11, 117).addBox(-4.0F, -15.0F, 1.0F, 9.0F, 1.0F, 6.0F, 0.0F, false);
		unknown_bone.setTextureOffset(22, 102).addBox(-5.0F, -14.0F, 1.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);
		unknown_bone.setTextureOffset(19, 104).addBox(5.0F, -14.0F, 1.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);
		unknown_bone.setTextureOffset(18, 116).addBox(-3.0F, -13.0F, 10.0F, 7.0F, 8.0F, 1.0F, 0.0F, false);

		unknown_bone_r1 = new ModelRenderer(this);
		unknown_bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r1);
		setRotationAngle(unknown_bone_r1, -0.5236F, 0.0F, 0.0F);
		unknown_bone_r1.setTextureOffset(23, 110).addBox(-1.0F, -16.5622F, 3.1699F, 2.0F, 3.0F, 4.0F, 0.0F, false);

		unknown_bone_r2 = new ModelRenderer(this);
		unknown_bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r2);
		setRotationAngle(unknown_bone_r2, 0.0F, 0.0F, -0.6981F);
		unknown_bone_r2.setTextureOffset(23, 41).addBox(-4.4628F, -9.981F, -8.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		unknown_bone_r3 = new ModelRenderer(this);
		unknown_bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r3);
		setRotationAngle(unknown_bone_r3, 0.5236F, 0.0F, 0.0F);
		unknown_bone_r3.setTextureOffset(15, 108).addBox(-4.0F, -15.732F, -5.3398F, 8.0F, 6.0F, 7.0F, 0.0F, false);

		unknown_bone_r4 = new ModelRenderer(this);
		unknown_bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r4);
		setRotationAngle(unknown_bone_r4, 0.2618F, 0.0F, 0.0F);
		unknown_bone_r4.setTextureOffset(26, 108).addBox(-1.0F, -7.38F, 14.3194F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		Leg3 = new ModelRenderer(this);
		Leg3.setRotationPoint(-4.25F, -10.75F, 8.75F);
		unknown_bone.addChild(Leg3);
		Leg3.setTextureOffset(22, 106).addBox(-1.75F, -1.25F, -1.75F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		Leg3.setTextureOffset(77, 7).addBox(-1.75F, 8.75F, -2.75F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Leg3.setTextureOffset(5, 0).addBox(-1.75F, 8.75F, -3.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Leg3.setTextureOffset(27, 22).addBox(0.25F, 8.75F, -3.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		unknown_bone_r5 = new ModelRenderer(this);
		unknown_bone_r5.setRotationPoint(4.25F, 10.75F, -8.75F);
		Leg3.addChild(unknown_bone_r5);
		setRotationAngle(unknown_bone_r5, -0.3491F, 0.0F, 0.0F);
		unknown_bone_r5.setTextureOffset(12, 111).addBox(-6.0F, -6.6816F, 5.37F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Leg4 = new ModelRenderer(this);
		Leg4.setRotationPoint(5.5F, -10.75F, 8.75F);
		unknown_bone.addChild(Leg4);
		Leg4.setTextureOffset(13, 103).addBox(-1.5F, -1.25F, -1.75F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		Leg4.setTextureOffset(37, 77).addBox(-1.5F, 8.75F, -2.75F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Leg4.setTextureOffset(0, 28).addBox(0.5F, 8.75F, -3.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Leg4.setTextureOffset(4, 28).addBox(-1.5F, 8.75F, -3.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		unknown_bone_r6 = new ModelRenderer(this);
		unknown_bone_r6.setRotationPoint(-5.5F, 10.75F, -8.75F);
		Leg4.addChild(unknown_bone_r6);
		setRotationAngle(unknown_bone_r6, -0.3491F, 0.0F, 0.0F);
		unknown_bone_r6.setTextureOffset(17, 108).addBox(4.0F, -6.6816F, 5.37F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Leg2 = new ModelRenderer(this);
		Leg2.setRotationPoint(6.75F, -13.25F, -3.5F);
		unknown_bone.addChild(Leg2);
		Leg2.setTextureOffset(27, 108).addBox(-1.75F, -0.75F, -1.5F, 3.0F, 11.0F, 3.0F, 0.0F, false);
		Leg2.setTextureOffset(77, 46).addBox(-1.75F, 11.25F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Leg2.setTextureOffset(35, 22).addBox(0.25F, 11.25F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Leg2.setTextureOffset(0, 40).addBox(-1.75F, 11.25F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		unknown_bone_r7 = new ModelRenderer(this);
		unknown_bone_r7.setRotationPoint(-6.75F, 13.25F, 3.5F);
		Leg2.addChild(unknown_bone_r7);
		setRotationAngle(unknown_bone_r7, -0.3491F, 0.0F, 0.0F);
		unknown_bone_r7.setTextureOffset(15, 110).addBox(5.0F, -2.5774F, -5.9063F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Leg1 = new ModelRenderer(this);
		Leg1.setRotationPoint(-6.75F, -13.25F, -3.5F);
		unknown_bone.addChild(Leg1);
		Leg1.setTextureOffset(9, 111).addBox(-1.25F, -0.75F, -1.5F, 3.0F, 11.0F, 3.0F, 0.0F, false);
		Leg1.setTextureOffset(76, 71).addBox(-1.25F, 11.25F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Leg1.setTextureOffset(0, 44).addBox(-1.25F, 11.25F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Leg1.setTextureOffset(3, 42).addBox(0.75F, 11.25F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		unknown_bone_r8 = new ModelRenderer(this);
		unknown_bone_r8.setRotationPoint(6.75F, 13.25F, 3.5F);
		Leg1.addChild(unknown_bone_r8);
		setRotationAngle(unknown_bone_r8, -0.3491F, 0.0F, 0.0F);
		unknown_bone_r8.setTextureOffset(9, 116).addBox(-8.0F, -2.5774F, -5.9063F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -14.0F, -9.5F);
		unknown_bone.addChild(Head);
		Head.setTextureOffset(39, 15).addBox(-4.0F, -5.0F, -5.5F, 8.0F, 8.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(44, 65).addBox(-2.0F, 0.0F, -6.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(10, 113).addBox(-5.0F, -6.0F, -7.5F, 10.0F, 4.0F, 4.0F, 0.0F, false);

		unknown_bone_r9 = new ModelRenderer(this);
		unknown_bone_r9.setRotationPoint(0.0F, 14.0F, 9.5F);
		Head.addChild(unknown_bone_r9);
		setRotationAngle(unknown_bone_r9, 0.3491F, 0.0F, 0.0F);
		unknown_bone_r9.setTextureOffset(30, 41).addBox(8.0F, -22.0841F, -15.8796F, 4.0F, 4.0F, 9.0F, 0.0F, false);
		unknown_bone_r9.setTextureOffset(46, 0).addBox(-12.0F, -22.0841F, -15.8796F, 4.0F, 4.0F, 9.0F, 0.0F, false);

		unknown_bone_r10 = new ModelRenderer(this);
		unknown_bone_r10.setRotationPoint(0.0F, 14.0F, 9.5F);
		Head.addChild(unknown_bone_r10);
		setRotationAngle(unknown_bone_r10, 0.2618F, 0.0F, 0.0F);
		unknown_bone_r10.setTextureOffset(47, 41).addBox(-4.0F, -26.3108F, -10.1692F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		unknown_bone_r11 = new ModelRenderer(this);
		unknown_bone_r11.setRotationPoint(0.0F, 14.0F, 9.5F);
		Head.addChild(unknown_bone_r11);
		setRotationAngle(unknown_bone_r11, 0.0873F, 0.4363F, 0.0F);
		unknown_bone_r11.setTextureOffset(58, 41).addBox(-1.2045F, -17.4801F, -24.4549F, 7.0F, 4.0F, 4.0F, 0.0F, false);

		unknown_bone_r12 = new ModelRenderer(this);
		unknown_bone_r12.setRotationPoint(0.0F, 14.0F, 9.5F);
		Head.addChild(unknown_bone_r12);
		setRotationAngle(unknown_bone_r12, 0.1745F, -0.6109F, -0.0873F);
		unknown_bone_r12.setTextureOffset(20, 61).addBox(-8.7707F, -18.0935F, -23.7106F, 7.0F, 4.0F, 4.0F, 0.0F, false);

		unknown_bone_r13 = new ModelRenderer(this);
		unknown_bone_r13.setRotationPoint(0.0F, 14.0F, 9.5F);
		Head.addChild(unknown_bone_r13);
		setRotationAngle(unknown_bone_r13, 0.0F, 0.0F, -0.1745F);
		unknown_bone_r13.setTextureOffset(62, 13).addBox(-7.8643F, -20.4632F, -17.25F, 7.0F, 4.0F, 4.0F, 0.0F, false);

		unknown_bone_r14 = new ModelRenderer(this);
		unknown_bone_r14.setRotationPoint(0.0F, 14.0F, 9.5F);
		Head.addChild(unknown_bone_r14);
		setRotationAngle(unknown_bone_r14, 0.0F, 0.0F, 0.1745F);
		unknown_bone_r14.setTextureOffset(63, 63).addBox(0.8871F, -20.2902F, -17.25F, 7.0F, 4.0F, 4.0F, 0.0F, false);

		unknown_bone_r15 = new ModelRenderer(this);
		unknown_bone_r15.setRotationPoint(0.0F, 14.0F, 9.5F);
		Head.addChild(unknown_bone_r15);
		setRotationAngle(unknown_bone_r15, 0.7854F, 0.0F, 0.0F);
		unknown_bone_r15.setTextureOffset(0, 22).addBox(1.0F, -27.725F, -0.2697F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		unknown_bone_r16 = new ModelRenderer(this);
		unknown_bone_r16.setRotationPoint(0.0F, 14.0F, 9.5F);
		Head.addChild(unknown_bone_r16);
		setRotationAngle(unknown_bone_r16, 0.0F, 0.0F, 0.4363F);
		unknown_bone_r16.setTextureOffset(29, 107).addBox(-10.4989F, -14.2291F, -13.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);

		unknown_bone_r17 = new ModelRenderer(this);
		unknown_bone_r17.setRotationPoint(0.0F, 14.0F, 9.5F);
		Head.addChild(unknown_bone_r17);
		setRotationAngle(unknown_bone_r17, 0.0F, 0.0F, -0.4363F);
		unknown_bone_r17.setTextureOffset(33, 106).addBox(9.9215F, -15.1354F, -13.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		unknown_bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}