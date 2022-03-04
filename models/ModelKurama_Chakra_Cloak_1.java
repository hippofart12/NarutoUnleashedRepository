// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelKurama_Chakra_Cloak_1 extends EntityModel<Entity> {
	private final ModelRenderer KuramaCloak1;
	private final ModelRenderer bipedHead;
	private final ModelRenderer ear1;
	private final ModelRenderer ear2;
	private final ModelRenderer ear3;
	private final ModelRenderer bipedHead_r1;
	private final ModelRenderer ear4;
	private final ModelRenderer ear5;
	private final ModelRenderer ear6;
	private final ModelRenderer bipedBody;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer bipedRightLeg;

	public ModelKurama_Chakra_Cloak_1() {
		textureWidth = 16;
		textureHeight = 16;

		KuramaCloak1 = new ModelRenderer(this);
		KuramaCloak1.setRotationPoint(0.0F, 24.5F, 0.0F);

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, -24.3368F, 0.0F);
		KuramaCloak1.addChild(bipedHead);
		bipedHead.setTextureOffset(0, 7).addBox(-4.5072F, -9.04F, -4.4928F, 9.0F, 9.0F, 9.0F, 0.0F, false);

		ear1 = new ModelRenderer(this);
		ear1.setRotationPoint(3.9528F, -7.29F, -3.1428F);
		bipedHead.addChild(ear1);
		setRotationAngle(ear1, 0.0F, 0.0F, 1.0472F);
		ear1.setTextureOffset(0, 7).addBox(-0.92F, -2.04F, -1.08F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		ear2 = new ModelRenderer(this);
		ear2.setRotationPoint(0.0F, -1.89F, 0.0F);
		ear1.addChild(ear2);
		setRotationAngle(ear2, 0.0F, 0.0F, 0.1745F);
		ear2.setTextureOffset(0, 7).addBox(-0.92F, -2.04F, -1.08F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		ear3 = new ModelRenderer(this);
		ear3.setRotationPoint(0.0F, -2.16F, 0.0F);
		ear2.addChild(ear3);
		setRotationAngle(ear3, 0.0F, 0.0F, 0.1745F);

		bipedHead_r1 = new ModelRenderer(this);
		bipedHead_r1.setRotationPoint(0.0F, -0.04F, 0.0F);
		ear3.addChild(bipedHead_r1);
		setRotationAngle(bipedHead_r1, 0.0F, 0.0F, -0.3927F);
		bipedHead_r1.setTextureOffset(0, 7).addBox(-0.92F, -1.73F, -1.08F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		ear4 = new ModelRenderer(this);
		ear4.setRotationPoint(-3.6072F, -7.29F, -3.1428F);
		bipedHead.addChild(ear4);
		setRotationAngle(ear4, 0.0F, 0.0F, -1.0472F);
		ear4.setTextureOffset(0, 7).addBox(-0.92F, -2.04F, -1.08F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		ear5 = new ModelRenderer(this);
		ear5.setRotationPoint(0.0F, -1.89F, 0.0F);
		ear4.addChild(ear5);
		setRotationAngle(ear5, 0.0F, 0.0F, -0.1745F);
		ear5.setTextureOffset(0, 7).addBox(-0.92F, -2.04F, -1.08F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		ear6 = new ModelRenderer(this);
		ear6.setRotationPoint(-1.08F, -2.16F, 0.0F);
		ear5.addChild(ear6);
		setRotationAngle(ear6, 0.0F, 0.0F, 0.1745F);
		ear6.setTextureOffset(0, 7).addBox(0.16F, -2.04F, -1.08F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, -26.9168F, 0.0F);
		KuramaCloak1.addChild(bipedBody);
		bipedBody.setTextureOffset(0, 7).addBox(-4.5072F, 1.9784F, -2.4964F, 9.0F, 12.0F, 5.0F, 0.0F, false);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 11.5668F, 1.35F);
		bipedBody.addChild(tail1);
		setRotationAngle(tail1, 0.3054F, 0.0F, 0.0F);
		tail1.setTextureOffset(0, 7).addBox(-1.6672F, -1.5884F, -0.0864F, 4.0F, 4.0F, 6.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.27F, 0.54F, 5.94F);
		tail1.addChild(tail2);
		setRotationAngle(tail2, 0.1745F, 0.0F, 0.0F);
		tail2.setTextureOffset(0, 7).addBox(-2.3972F, -2.5884F, -0.0864F, 5.0F, 5.0F, 6.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.27F, 0.27F, 5.4F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.3927F, 0.0F, 0.0F);
		tail3.setTextureOffset(0, 7).addBox(-3.1272F, -3.3184F, -0.0864F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, 0.0F, 6.48F);
		tail3.addChild(tail4);
		setRotationAngle(tail4, 0.3491F, 0.0F, 0.0F);
		tail4.setTextureOffset(0, 7).addBox(-2.2072F, -2.3984F, -1.1664F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.346F, -24.6704F, 0.0F);
		KuramaCloak1.addChild(bipedRightArm);
		bipedRightArm.setTextureOffset(0, 7).addBox(-4.008F, -1.268F, -2.4964F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.346F, -24.6704F, 0.0F);
		KuramaCloak1.addChild(bipedLeftArm);
		bipedLeftArm.setTextureOffset(0, 7).addBox(-1.6304F, -1.268F, -2.7464F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.1341F, -13.4384F, -0.25F);
		KuramaCloak1.addChild(bipedLeftLeg);
		bipedLeftLeg.setTextureOffset(0, 7).addBox(-2.7536F, 0.4384F, -2.2464F, 5.0F, 13.0F, 5.0F, 0.0F, false);

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.1341F, -13.4384F, 0.0F);
		KuramaCloak1.addChild(bipedRightLeg);
		bipedRightLeg.setTextureOffset(0, 7).addBox(-2.7536F, 0.4384F, -2.4964F, 5.0F, 13.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		KuramaCloak1.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bipedRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.bipedLeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.bipedHead.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.bipedHead.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.ear4.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.bipedRightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.ear1.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.bipedLeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}
