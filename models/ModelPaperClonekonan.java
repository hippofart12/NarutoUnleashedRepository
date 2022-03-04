// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelPaperClonekonan extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;

	public ModelPaperClonekonan() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(69, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(74, 7).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-7.0F, 18.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-6.0F, 15.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(5.0F, 15.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(4.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-5.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-6.0F, 18.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(4.0F, 18.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(4.0F, 18.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-6.0F, 18.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-5.0F, 15.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-5.0F, 15.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(4.0F, 15.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(4.0F, 15.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(6.0F, 18.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-4.0F, 12.0F, 2.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-4.0F, 12.0F, -3.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-4.0F, 15.0F, 3.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-5.0F, 18.0F, 4.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-5.0F, 18.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(1.0F, 18.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(-4.0F, 15.0F, -4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(74, 7).addBox(0.0F, 15.0F, -4.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		rightleg.setTextureOffset(75, 42).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(1.9F, 12.0F, 0.0F);
		leftleg.setTextureOffset(75, 39).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.setTextureOffset(112, 10).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(112, 10).addBox(-1.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(112, 10).addBox(-1.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(112, 10).addBox(-1.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(112, 10).addBox(-1.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(112, 10).addBox(3.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(112, 10).addBox(3.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightarm.setTextureOffset(86, 9).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		rightarm.setTextureOffset(86, 9).addBox(-3.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(86, 9).addBox(-3.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(86, 9).addBox(-3.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(86, 9).addBox(-3.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(86, 9).addBox(-4.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		rightarm.setTextureOffset(86, 9).addBox(-4.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
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
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}
