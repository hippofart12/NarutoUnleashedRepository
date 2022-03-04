// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelkonanwithwings extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer Wing1;
	private final ModelRenderer Wing2;
	private final ModelRenderer Wing3;
	private final ModelRenderer Wing4;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;

	public Modelkonanwithwings() {
		textureWidth = 128;
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

		Wing1 = new ModelRenderer(this);
		Wing1.setRotationPoint(0.0F, 5.5F, 2.0F);
		body.addChild(Wing1);
		setRotationAngle(Wing1, 0.0F, -0.829F, -0.2182F);
		Wing1.setTextureOffset(104, 0).addBox(0.0F, -4.5F, 0.0F, 12.0F, 9.0F, 0.0F, 0.0F, false);

		Wing2 = new ModelRenderer(this);
		Wing2.setRotationPoint(12.0F, 0.0F, 0.0F);
		Wing1.addChild(Wing2);
		setRotationAngle(Wing2, 0.1745F, 0.4363F, 0.0F);
		Wing2.setTextureOffset(94, 54).addBox(0.0F, -5.5F, 0.0F, 17.0F, 10.0F, 0.0F, 0.0F, false);

		Wing3 = new ModelRenderer(this);
		Wing3.setRotationPoint(0.0F, 5.5F, 2.0F);
		body.addChild(Wing3);
		setRotationAngle(Wing3, 0.0F, -0.829F, -2.9234F);
		Wing3.setTextureOffset(68, 26).addBox(0.0F, -4.5F, 0.0F, 12.0F, 9.0F, 0.0F, 0.0F, false);

		Wing4 = new ModelRenderer(this);
		Wing4.setRotationPoint(12.0F, 1.0F, 0.0F);
		Wing3.addChild(Wing4);
		setRotationAngle(Wing4, -0.1745F, 0.4363F, 0.0F);
		Wing4.setTextureOffset(94, 31).addBox(0.0F, -5.5F, 0.0F, 17.0F, 10.0F, 0.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		rightleg.setTextureOffset(0, 16).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(1.9F, 12.0F, 0.0F);
		leftleg.setTextureOffset(0, 16).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(52, 61).addBox(-1.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(8, 54).addBox(-1.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(8, 54).addBox(-1.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(52, 61).addBox(-1.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(52, 59).addBox(3.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(5, 47).addBox(3.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightarm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		rightarm.setTextureOffset(6, 46).addBox(-3.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(6, 46).addBox(-3.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(50, 62).addBox(-3.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(50, 62).addBox(-3.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(50, 62).addBox(-4.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		rightarm.setTextureOffset(0, 51).addBox(-4.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.Wing4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Wing3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Wing2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Wing1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}
