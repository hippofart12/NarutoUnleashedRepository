// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelAnbuChestArmor extends EntityModel<Entity> {
	private final ModelRenderer bipedBody;
	private final ModelRenderer strap1;
	private final ModelRenderer bipedBody_r1;
	private final ModelRenderer strap2;
	private final ModelRenderer bipedBody_r2;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;

	public ModelAnbuChestArmor() {
		textureWidth = 150;
		textureHeight = 100;

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.setTextureOffset(28, 38).addBox(-4.0F, 2.0F, -2.5F, 8.0F, 10.0F, 5.0F, 0.0F, false);
		bipedBody.setTextureOffset(43, 45).addBox(-4.0F, 0.0F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		bipedBody.setTextureOffset(41, 44).addBox(3.0F, 0.0F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		bipedBody.setTextureOffset(29, 43).addBox(-3.5F, 6.0F, -3.0F, 7.0F, 6.0F, 1.0F, 0.0F, false);

		strap1 = new ModelRenderer(this);
		strap1.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.addChild(strap1);

		bipedBody_r1 = new ModelRenderer(this);
		bipedBody_r1.setRotationPoint(3.5F, -24.0F, 0.0F);
		strap1.addChild(bipedBody_r1);
		setRotationAngle(bipedBody_r1, 0.0F, 0.0F, 0.9599F);
		bipedBody_r1.setTextureOffset(42, 45).addBox(0.0F, -0.75F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		strap2 = new ModelRenderer(this);
		strap2.setRotationPoint(-8.0F, 24.0F, 0.0F);
		bipedBody.addChild(strap2);

		bipedBody_r2 = new ModelRenderer(this);
		bipedBody_r2.setRotationPoint(3.5F, -24.0F, 0.0F);
		strap2.addChild(bipedBody_r2);
		setRotationAngle(bipedBody_r2, 0.0F, 0.0F, -0.9599F);
		bipedBody_r2.setTextureOffset(45, 47).addBox(-0.25F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.setTextureOffset(44, 46).addBox(-4.0F, 3.5F, -2.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		bipedRightArm.setTextureOffset(6, 12).addBox(-3.0F, 3.5F, -2.001F, 4.0F, 6.0F, 0.0F, 0.0F, false);
		bipedRightArm.setTextureOffset(40, 16).addBox(-3.0F, 3.5F, 2.001F, 4.0F, 6.0F, 0.0F, 0.0F, false);

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.setTextureOffset(42, 45).addBox(3.0F, 3.5F, -2.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		bipedLeftArm.setTextureOffset(39, 71).addBox(-1.0F, 3.5F, -2.001F, 4.0F, 6.0F, 0.0F, 0.0F, false);
		bipedLeftArm.setTextureOffset(40, 16).addBox(-1.0F, 3.5F, 2.001F, 4.0F, 6.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bipedBody.render(matrixStack, buffer, packedLight, packedOverlay);
		bipedRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		bipedLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}
