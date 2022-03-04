// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelanimal3 extends EntityModel<Entity> {
	private final ModelRenderer unknown_bone;
	private final ModelRenderer RightWing;
	private final ModelRenderer unknown_bone_r5;
	private final ModelRenderer unknown_bone_r7;
	private final ModelRenderer LeftWing;
	private final ModelRenderer unknown_bone_r4;
	private final ModelRenderer unknown_bone_r6;
	private final ModelRenderer head;
	private final ModelRenderer unknown_bone_r2;
	private final ModelRenderer unknown_bone_r3;
	private final ModelRenderer unknown_bone_r1;
	private final ModelRenderer unknown_bone_r8;
	private final ModelRenderer unknown_bone_r9;
	private final ModelRenderer unknown_bone_r10;
	private final ModelRenderer unknown_bone_r11;
	private final ModelRenderer unknown_bone_r12;
	private final ModelRenderer unknown_bone_r13;
	private final ModelRenderer unknown_bone_r14;

	public Modelanimal3() {
		textureWidth = 64;
		textureHeight = 64;

		unknown_bone = new ModelRenderer(this);
		unknown_bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(unknown_bone, 0.0F, -1.5708F, 0.0F);
		unknown_bone.setTextureOffset(0, 44).addBox(-1.0F, -24.0F, -6.0F, 16.0F, 7.0F, 13.0F, 0.0F, false);
		unknown_bone.setTextureOffset(0, 0).addBox(8.0801F, -11.5456F, 4.0F, 5.0F, 2.0F, 3.0F, 0.0F, false);
		unknown_bone.setTextureOffset(0, 0).addBox(8.0801F, -11.5456F, -6.0F, 5.0F, 2.0F, 3.0F, 0.0F, false);
		unknown_bone.setTextureOffset(0, 0).addBox(6.0801F, -10.5456F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		unknown_bone.setTextureOffset(0, 0).addBox(6.0801F, -10.5456F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		unknown_bone.setTextureOffset(2, 47).addBox(15.0F, -24.0F, -5.0F, 2.0F, 6.0F, 11.0F, 0.0F, false);
		unknown_bone.setTextureOffset(0, 51).addBox(-1.0F, -26.0F, -5.0F, 17.0F, 2.0F, 11.0F, 0.0F, false);
		unknown_bone.setTextureOffset(0, 58).addBox(-1.0F, -23.0F, 7.0F, 17.0F, 5.0F, 1.0F, 0.0F, false);
		unknown_bone.setTextureOffset(0, 58).addBox(-1.0F, -23.0F, -7.0F, 17.0F, 5.0F, 1.0F, 0.0F, false);

		RightWing = new ModelRenderer(this);
		RightWing.setRotationPoint(2.5F, -23.75F, 6.0F);
		unknown_bone.addChild(RightWing);
		RightWing.setTextureOffset(0, 49).addBox(-2.5F, -6.25F, 9.0F, 3.0F, 2.0F, 13.0F, 0.0F, false);
		RightWing.setTextureOffset(0, 50).addBox(0.5F, -5.25F, 9.0F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		unknown_bone_r5 = new ModelRenderer(this);
		unknown_bone_r5.setRotationPoint(-2.5F, 23.75F, -6.0F);
		RightWing.addChild(unknown_bone_r5);
		setRotationAngle(unknown_bone_r5, 0.6109F, 0.0F, 0.0F);
		unknown_bone_r5.setTextureOffset(0, 50).addBox(3.0F, -15.1171F, 16.8298F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		unknown_bone_r5.setTextureOffset(0, 47).addBox(0.0F, -16.1171F, 14.8298F, 3.0F, 2.0F, 15.0F, 0.0F, false);

		unknown_bone_r7 = new ModelRenderer(this);
		unknown_bone_r7.setRotationPoint(-2.5F, 23.75F, -6.0F);
		RightWing.addChild(unknown_bone_r7);
		setRotationAngle(unknown_bone_r7, 0.0F, 0.2618F, 0.0F);
		unknown_bone_r7.setTextureOffset(0, 51).addBox(-3.8637F, -29.0F, 26.9647F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		unknown_bone_r7.setTextureOffset(0, 49).addBox(-6.7615F, -30.0F, 26.1883F, 3.0F, 2.0F, 13.0F, 0.0F, false);

		LeftWing = new ModelRenderer(this);
		LeftWing.setRotationPoint(2.5F, -23.75F, -6.0F);
		unknown_bone.addChild(LeftWing);
		LeftWing.setTextureOffset(0, 49).addBox(-2.5F, -6.25F, -20.0F, 3.0F, 2.0F, 13.0F, 0.0F, false);
		LeftWing.setTextureOffset(0, 50).addBox(0.5F, -5.25F, -20.0F, 13.0F, 1.0F, 13.0F, 0.0F, false);

		unknown_bone_r4 = new ModelRenderer(this);
		unknown_bone_r4.setRotationPoint(-2.5F, 23.75F, 6.0F);
		LeftWing.addChild(unknown_bone_r4);
		setRotationAngle(unknown_bone_r4, -0.6109F, 0.0F, 0.0F);
		unknown_bone_r4.setTextureOffset(0, 51).addBox(3.0F, -16.3069F, -28.4835F, 13.0F, 1.0F, 12.0F, 0.0F, false);
		unknown_bone_r4.setTextureOffset(0, 47).addBox(0.0F, -17.3069F, -28.4835F, 3.0F, 2.0F, 15.0F, 0.0F, false);

		unknown_bone_r6 = new ModelRenderer(this);
		unknown_bone_r6.setRotationPoint(-2.5F, 23.75F, 6.0F);
		LeftWing.addChild(unknown_bone_r6);
		setRotationAngle(unknown_bone_r6, 0.0F, -0.3491F, 0.0F);
		unknown_bone_r6.setTextureOffset(0, 51).addBox(-5.6382F, -29.0F, -35.9479F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		unknown_bone_r6.setTextureOffset(0, 49).addBox(-8.4572F, -30.0F, -35.9218F, 3.0F, 2.0F, 13.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-8.5F, -29.0F, 0.0F);
		unknown_bone.addChild(head);
		head.setTextureOffset(0, 25).addBox(-13.5F, -2.0F, -2.0F, 14.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-9.5F, 3.0F, -3.0F, 10.0F, 3.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-9.5F, -4.0F, -3.0F, 5.0F, 10.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-14.5F, -1.0F, -3.0F, 5.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-14.5F, -1.0F, 3.0F, 5.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-9.5F, -5.0F, -2.0F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-9.5F, -4.0F, 3.0F, 5.0F, 10.0F, 1.0F, 0.0F, false);

		unknown_bone_r2 = new ModelRenderer(this);
		unknown_bone_r2.setRotationPoint(8.5F, 29.0F, 0.0F);
		head.addChild(unknown_bone_r2);
		setRotationAngle(unknown_bone_r2, 0.0F, 0.0F, 0.4363F);
		unknown_bone_r2.setTextureOffset(0, 0).addBox(-32.4337F, -15.9133F, -2.0F, 7.0F, 3.0F, 5.0F, 0.0F, false);

		unknown_bone_r3 = new ModelRenderer(this);
		unknown_bone_r3.setRotationPoint(8.5F, 29.0F, 0.0F);
		head.addChild(unknown_bone_r3);
		setRotationAngle(unknown_bone_r3, 0.0F, 0.0F, -0.5236F);
		unknown_bone_r3.setTextureOffset(0, 0).addBox(-6.1436F, -37.1244F, 3.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		unknown_bone_r3.setTextureOffset(0, 0).addBox(-6.1436F, -37.1244F, -3.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		unknown_bone_r3.setTextureOffset(0, 0).addBox(-7.1436F, -38.1244F, -2.0F, 9.0F, 3.0F, 5.0F, 0.0F, false);
		unknown_bone_r3.setTextureOffset(0, 0).addBox(7.1683F, -34.7018F, -2.0F, 8.0F, 3.0F, 5.0F, 0.0F, false);
		unknown_bone_r3.setTextureOffset(0, 58).addBox(23.0263F, -12.1699F, -7.0F, 17.0F, 2.0F, 4.0F, 0.0F, false);
		unknown_bone_r3.setTextureOffset(0, 58).addBox(23.0263F, -12.1699F, 4.0F, 17.0F, 2.0F, 4.0F, 0.0F, false);

		unknown_bone_r1 = new ModelRenderer(this);
		unknown_bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r1);
		setRotationAngle(unknown_bone_r1, 0.0F, 0.0F, 0.6981F);
		unknown_bone_r1.setTextureOffset(0, 51).addBox(-25.5888F, -18.8703F, -3.0F, 15.0F, 6.0F, 7.0F, 0.0F, false);

		unknown_bone_r8 = new ModelRenderer(this);
		unknown_bone_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r8);
		setRotationAngle(unknown_bone_r8, 0.0F, 0.0F, -0.4363F);
		unknown_bone_r8.setTextureOffset(0, 55).addBox(23.4489F, -13.0762F, -3.0F, 18.0F, 2.0F, 7.0F, 0.0F, false);

		unknown_bone_r9 = new ModelRenderer(this);
		unknown_bone_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r9);
		setRotationAngle(unknown_bone_r9, 0.0F, 0.0F, 0.3491F);
		unknown_bone_r9.setTextureOffset(14, 49).addBox(5.2494F, -20.9281F, -6.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		unknown_bone_r9.setTextureOffset(17, 51).addBox(5.2494F, -20.9281F, 4.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		unknown_bone_r10 = new ModelRenderer(this);
		unknown_bone_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r10);
		setRotationAngle(unknown_bone_r10, 0.0F, -0.5236F, 0.0F);
		unknown_bone_r10.setTextureOffset(0, 0).addBox(3.3616F, -10.5456F, -11.3927F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		unknown_bone_r10.setTextureOffset(0, 0).addBox(8.3616F, -10.5456F, -2.7325F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		unknown_bone_r11 = new ModelRenderer(this);
		unknown_bone_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r11);
		setRotationAngle(unknown_bone_r11, 0.0F, 0.4363F, 0.0F);
		unknown_bone_r11.setTextureOffset(0, 0).addBox(8.0371F, -10.5456F, 1.2588F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		unknown_bone_r11.setTextureOffset(0, 0).addBox(3.811F, -10.5456F, 10.3218F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		unknown_bone_r12 = new ModelRenderer(this);
		unknown_bone_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r12);
		setRotationAngle(unknown_bone_r12, -0.4363F, 0.0F, 0.0F);
		unknown_bone_r12.setTextureOffset(52, 0).addBox(11.0F, -30.8065F, -8.9326F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		unknown_bone_r13 = new ModelRenderer(this);
		unknown_bone_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r13);
		setRotationAngle(unknown_bone_r13, 0.7854F, 0.0F, 0.0F);
		unknown_bone_r13.setTextureOffset(52, 0).addBox(-6.0F, -25.798F, 14.3095F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		unknown_bone_r14 = new ModelRenderer(this);
		unknown_bone_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r14);
		setRotationAngle(unknown_bone_r14, 0.2618F, 0.0F, 0.0F);
		unknown_bone_r14.setTextureOffset(52, 0).addBox(1.0F, -16.2235F, 5.8978F, 3.0F, 5.0F, 3.0F, 0.0F, false);
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
		this.RightWing.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftWing.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}