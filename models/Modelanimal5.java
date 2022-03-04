// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelanimal5 extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;
	private final ModelRenderer body_r7;
	private final ModelRenderer pernadireita;
	private final ModelRenderer pernadireita_r1;
	private final ModelRenderer pernadireita_r2;
	private final ModelRenderer pernadireitaATRAS;
	private final ModelRenderer pernadireitaATRAS_r1;
	private final ModelRenderer pernadireitaATRAS_r2;
	private final ModelRenderer pernaesquerda;
	private final ModelRenderer pernaesquerda_r1;
	private final ModelRenderer pernaesquerda_r2;
	private final ModelRenderer pernaesquerdaATRAS;
	private final ModelRenderer pernaesquerdaATRAS_r1;
	private final ModelRenderer pernaesquerdaATRAS_r2;

	public Modelanimal5() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.0F, -17.5F);
		head.setTextureOffset(66, 35).addBox(-9.0F, -3.0F, -9.5F, 9.0F, 9.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(66, 35).addBox(1.0F, -3.0F, -9.5F, 9.0F, 9.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(77, 53).addBox(2.0F, 2.0F, -12.5F, 7.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(78, 53).addBox(-8.0F, 2.0F, -12.5F, 7.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(51, 45).addBox(4.0F, 0.0F, -11.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(51, 42).addBox(-6.0F, 0.0F, -11.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 30.0F, 17.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.3491F, 0.0F);
		head_r1.setTextureOffset(7, 46).addBox(-6.0F, -31.0F, -29.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(78, 52).addBox(-8.0F, -29.0F, -30.0F, 7.0F, 4.0F, 3.0F, 0.0F, false);
		head_r1.setTextureOffset(66, 35).addBox(-9.0F, -33.0F, -27.0F, 9.0F, 9.0F, 8.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, 30.0F, 17.5F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, -0.4363F, 0.0F);
		head_r2.setTextureOffset(0, 44).addBox(3.0F, -31.0F, -29.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(77, 52).addBox(0.0F, -29.0F, -30.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
		head_r2.setTextureOffset(66, 35).addBox(0.0F, -33.0F, -27.0F, 9.0F, 9.0F, 8.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, 30.0F, 17.5F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, -0.6109F, 0.0F, 0.0F);
		head_r3.setTextureOffset(0, 35).addBox(-1.0F, -22.9699F, -41.4681F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		head_r3.setTextureOffset(28, 66).addBox(-3.0F, -20.9699F, -42.4681F, 8.0F, 4.0F, 4.0F, 0.0F, false);
		head_r3.setTextureOffset(66, 35).addBox(-4.0F, -25.9699F, -38.4681F, 10.0F, 10.0F, 8.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(0.0F, 30.0F, 17.5F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, -0.6109F, 0.2618F, 0.0F);
		head_r4.setTextureOffset(0, 40).addBox(-7.0F, -22.9699F, -40.4681F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		head_r4.setTextureOffset(78, 52).addBox(-9.0F, -20.9699F, -41.4681F, 7.0F, 4.0F, 3.0F, 0.0F, false);
		head_r4.setTextureOffset(66, 35).addBox(-10.0F, -24.9699F, -38.4681F, 9.0F, 9.0F, 8.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(0.0F, 30.0F, 17.5F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, -0.6109F, -0.2618F, 0.0F);
		head_r5.setTextureOffset(7, 42).addBox(4.0F, -22.9699F, -40.4681F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		head_r5.setTextureOffset(78, 52).addBox(2.0F, -20.9699F, -41.4681F, 7.0F, 4.0F, 3.0F, 0.0F, false);
		head_r5.setTextureOffset(66, 35).addBox(1.0F, -24.9699F, -38.4681F, 9.0F, 9.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 35).addBox(-9.0F, -35.0F, -19.0F, 18.0F, 16.0F, 15.0F, 0.0F, false);
		body.setTextureOffset(70, 92).addBox(-2.0F, -26.9581F, 24.0911F, 4.0F, 5.0F, 9.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.1745F, 0.0F, 0.0F);
		body_r1.setTextureOffset(66, 106).addBox(-2.0F, -30.9581F, 13.0912F, 4.0F, 5.0F, 8.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 0).addBox(-8.0F, -30.9581F, -9.9088F, 16.0F, 12.0F, 23.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, -0.1745F, 1.1345F, 0.0F);
		body_r2.setTextureOffset(79, 0).addBox(-18.8809F, -28.6464F, -18.0192F, 11.0F, 3.0F, 7.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, -0.1745F, 0.5236F, 0.0F);
		body_r3.setTextureOffset(114, 69).addBox(-14.5F, -29.9054F, -10.8789F, 10.0F, 3.0F, 4.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, -0.1745F, -0.5236F, 0.0F);
		body_r4.setTextureOffset(38, 114).addBox(4.5F, -29.9054F, -10.8789F, 10.0F, 3.0F, 4.0F, 0.0F, false);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r5);
		setRotationAngle(body_r5, -0.1745F, -1.1345F, 0.0F);
		body_r5.setTextureOffset(34, 92).addBox(7.8809F, -28.6464F, -18.0192F, 11.0F, 3.0F, 7.0F, 0.0F, false);

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r6);
		setRotationAngle(body_r6, 0.0F, 0.4363F, 0.0F);
		body_r6.setTextureOffset(54, 54).addBox(-6.0F, -33.0F, -19.0F, 6.0F, 9.0F, 12.0F, 0.0F, false);

		body_r7 = new ModelRenderer(this);
		body_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r7);
		setRotationAngle(body_r7, 0.0F, -0.4363F, 0.0F);
		body_r7.setTextureOffset(55, 0).addBox(0.0F, -33.0F, -19.0F, 6.0F, 9.0F, 12.0F, 0.0F, false);

		pernadireita = new ModelRenderer(this);
		pernadireita.setRotationPoint(-6.0F, 4.75F, -6.25F);
		pernadireita.setTextureOffset(48, 102).addBox(-4.0F, 15.25F, -6.75F, 5.0F, 4.0F, 8.0F, 0.0F, false);

		pernadireita_r1 = new ModelRenderer(this);
		pernadireita_r1.setRotationPoint(6.0F, 19.25F, 6.25F);
		pernadireita.addChild(pernadireita_r1);
		setRotationAngle(pernadireita_r1, -0.1745F, 0.0F, 0.0873F);
		pernadireita_r1.setTextureOffset(112, 112).addBox(-10.3296F, -9.2017F, -10.9696F, 5.0F, 9.0F, 6.0F, 0.0F,
				false);

		pernadireita_r2 = new ModelRenderer(this);
		pernadireita_r2.setRotationPoint(6.0F, 19.25F, 6.25F);
		pernadireita.addChild(pernadireita_r2);
		setRotationAngle(pernadireita_r2, 0.0F, 0.0F, 0.0873F);
		pernadireita_r2.setTextureOffset(0, 101).addBox(-10.3296F, -20.549F, -9.0F, 5.0F, 11.0F, 6.0F, 0.0F, false);

		pernadireitaATRAS = new ModelRenderer(this);
		pernadireitaATRAS.setRotationPoint(-5.75F, 7.0F, 13.5F);
		pernadireitaATRAS.setTextureOffset(96, 69).addBox(-4.25F, 13.0F, -5.5F, 5.0F, 4.0F, 8.0F, 0.0F, false);

		pernadireitaATRAS_r1 = new ModelRenderer(this);
		pernadireitaATRAS_r1.setRotationPoint(5.75F, 17.0F, -13.5F);
		pernadireitaATRAS.addChild(pernadireitaATRAS_r1);
		setRotationAngle(pernadireitaATRAS_r1, -0.1745F, 0.0F, 0.0873F);
		pernadireitaATRAS_r1.setTextureOffset(84, 113).addBox(-10.1553F, -10.7126F, 9.0725F, 5.0F, 8.0F, 6.0F, 0.0F,
				false);

		pernadireitaATRAS_r2 = new ModelRenderer(this);
		pernadireitaATRAS_r2.setRotationPoint(5.75F, 17.0F, -13.5F);
		pernadireitaATRAS.addChild(pernadireitaATRAS_r2);
		setRotationAngle(pernadireitaATRAS_r2, 0.1745F, 0.0F, 0.0873F);
		pernadireitaATRAS_r2.setTextureOffset(96, 96).addBox(-10.2424F, -15.7477F, 12.4928F, 5.0F, 11.0F, 6.0F, 0.0F,
				false);

		pernaesquerda = new ModelRenderer(this);
		pernaesquerda.setRotationPoint(6.0F, 5.25F, -6.5F);
		pernaesquerda.setTextureOffset(22, 102).addBox(-1.0F, 14.75F, -6.5F, 5.0F, 4.0F, 8.0F, 0.0F, false);

		pernaesquerda_r1 = new ModelRenderer(this);
		pernaesquerda_r1.setRotationPoint(-6.0F, 18.75F, 6.5F);
		pernaesquerda.addChild(pernaesquerda_r1);
		setRotationAngle(pernaesquerda_r1, -0.1745F, 0.0F, -0.0873F);
		pernaesquerda_r1.setTextureOffset(109, 4).addBox(5.3296F, -9.2017F, -10.9696F, 5.0F, 9.0F, 6.0F, 0.0F, false);

		pernaesquerda_r2 = new ModelRenderer(this);
		pernaesquerda_r2.setRotationPoint(-6.0F, 18.75F, 6.5F);
		pernaesquerda.addChild(pernaesquerda_r2);
		setRotationAngle(pernaesquerda_r2, 0.0F, 0.0F, -0.0873F);
		pernaesquerda_r2.setTextureOffset(100, 30).addBox(5.3296F, -20.549F, -9.0F, 5.0F, 11.0F, 6.0F, 0.0F, false);

		pernaesquerdaATRAS = new ModelRenderer(this);
		pernaesquerdaATRAS.setRotationPoint(5.75F, 7.0F, 14.0F);
		pernaesquerdaATRAS.setTextureOffset(96, 84).addBox(-0.75F, 13.0F, -6.0F, 5.0F, 4.0F, 8.0F, 0.0F, false);

		pernaesquerdaATRAS_r1 = new ModelRenderer(this);
		pernaesquerdaATRAS_r1.setRotationPoint(-5.75F, 17.0F, -14.0F);
		pernaesquerdaATRAS.addChild(pernaesquerdaATRAS_r1);
		setRotationAngle(pernaesquerdaATRAS_r1, -0.1745F, 0.0F, -0.0873F);
		pernaesquerdaATRAS_r1.setTextureOffset(16, 114).addBox(5.1553F, -10.7126F, 9.0725F, 5.0F, 8.0F, 6.0F, 0.0F,
				false);

		pernaesquerdaATRAS_r2 = new ModelRenderer(this);
		pernaesquerdaATRAS_r2.setRotationPoint(-5.75F, 17.0F, -14.0F);
		pernaesquerdaATRAS.addChild(pernaesquerdaATRAS_r2);
		setRotationAngle(pernaesquerdaATRAS_r2, 0.1745F, 0.0F, -0.0873F);
		pernaesquerdaATRAS_r2.setTextureOffset(0, 0).addBox(5.2424F, -15.7477F, 12.4928F, 5.0F, 11.0F, 6.0F, 0.0F,
				false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		pernadireita.render(matrixStack, buffer, packedLight, packedOverlay);
		pernadireitaATRAS.render(matrixStack, buffer, packedLight, packedOverlay);
		pernaesquerda.render(matrixStack, buffer, packedLight, packedOverlay);
		pernaesquerdaATRAS.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.pernaesquerdaATRAS.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.pernaesquerda.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.pernadireitaATRAS.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.pernadireita.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}