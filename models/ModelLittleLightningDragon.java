// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelLittleLightningDragon extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone_r3;
	private final ModelRenderer bone_r4;
	private final ModelRenderer bone_r5;
	private final ModelRenderer bone_r6;

	public ModelLittleLightningDragon() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 50).addBox(-1.2F, -5.0F, -5.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(60, 64).addBox(-2.6F, -10.8F, -4.8F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(60, 64).addBox(-2.6F, -11.6F, -4.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(32, 64).addBox(-2.6F, -11.6F, -3.2F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(24, 0).addBox(-2.6F, -12.6F, -2.4F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 46).addBox(1.4F, -13.0F, -1.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 46).addBox(-2.6F, -13.0F, -1.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(-1.2F, -9.0F, -5.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(0.4F, -5.8F, -5.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(0.4F, -9.8F, -5.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(-2.8F, -5.8F, -5.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(-2.8F, -9.8F, -5.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 1.3963F, 0.0F);
		bone_r1.setTextureOffset(0, 72).addBox(2.8F, -10.8F, -3.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone_r1.setTextureOffset(72, 74).addBox(2.8F, -5.0F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 1.5708F, 0.0F);
		bone_r2.setTextureOffset(56, 70).addBox(-0.4F, -12.4F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(40, 34).addBox(-1.0F, -12.2F, -0.8F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 46).addBox(-0.4F, -12.2F, 0.8F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 46).addBox(-0.4F, -12.2F, -1.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(72, 60).addBox(-0.4F, -9.0F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(68, 28).addBox(-3.8F, -8.4F, 2.4F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 0).addBox(3.0F, -8.8F, 2.4F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 0).addBox(3.0F, -8.8F, -3.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 24).addBox(3.8F, -7.8F, 2.4F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 24).addBox(3.8F, -7.8F, -3.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(48, 14).addBox(-0.8F, -8.6F, 1.6F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(48, 14).addBox(-0.8F, -8.6F, -2.4F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(68, 28).addBox(-3.8F, -8.4F, -3.2F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(72, 60).addBox(-0.4F, -6.6F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 1.4835F, 0.0F);
		bone_r3.setTextureOffset(72, 8).addBox(1.2F, -9.8F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r3.setTextureOffset(72, 8).addBox(1.2F, -5.8F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r4 = new ModelRenderer(this);
		bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r4);
		setRotationAngle(bone_r4, 0.0F, -1.5708F, 0.0F);
		bone_r4.setTextureOffset(40, 48).addBox(-2.0F, -10.8F, -2.4F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(40, 30).addBox(1.0F, -6.6F, -2.4F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(40, 30).addBox(-1.4F, -5.8F, -2.4F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(48, 0).addBox(-2.8F, -5.0F, -2.4F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(0, 48).addBox(-3.4F, -9.0F, -2.4F, 1.0F, 5.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(60, 14).addBox(-5.2F, -4.2F, -2.4F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(48, 0).addBox(9.2F, -9.0F, -2.4F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(24, 12).addBox(6.8F, -9.2F, -2.4F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(0, 24).addBox(4.4F, -10.4F, -2.4F, 2.0F, 4.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(0, 0).addBox(2.0F, -11.4F, -2.4F, 2.0F, 5.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(24, 34).addBox(0.6F, -12.4F, -2.4F, 1.0F, 6.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(24, 30).addBox(0.6F, -13.0F, -2.4F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r4.setTextureOffset(52, 44).addBox(5.0F, -13.8F, -2.4F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r4.setTextureOffset(52, 44).addBox(5.0F, -13.8F, 1.6F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r4.setTextureOffset(24, 30).addBox(0.6F, -13.0F, 1.6F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r4.setTextureOffset(16, 60).addBox(-0.2F, -10.8F, -2.4F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(60, 44).addBox(-0.2F, -14.0F, -2.4F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(60, 14).addBox(-2.0F, -13.8F, -2.4F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		bone_r4.setTextureOffset(72, 4).addBox(-1.2F, -9.0F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r4.setTextureOffset(72, 4).addBox(-1.2F, -6.6F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r5 = new ModelRenderer(this);
		bone_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r5);
		setRotationAngle(bone_r5, 0.0F, -1.4835F, 0.0F);
		bone_r5.setTextureOffset(72, 0).addBox(-2.8F, -9.8F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r5.setTextureOffset(72, 0).addBox(-2.8F, -5.8F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r6 = new ModelRenderer(this);
		bone_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r6);
		setRotationAngle(bone_r6, 0.0F, -1.3963F, 0.0F);
		bone_r6.setTextureOffset(68, 34).addBox(-4.4F, -10.8F, -3.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone_r6.setTextureOffset(68, 70).addBox(-4.4F, -5.0F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
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
