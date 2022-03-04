// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelLightningDragon extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone_r3;
	private final ModelRenderer bone_r4;
	private final ModelRenderer bone_r5;
	private final ModelRenderer bone_r6;

	public ModelLightningDragon() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 50).addBox(-2.0F, -12.0F, -14.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(60, 64).addBox(-6.0F, -26.0F, -12.0F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(60, 64).addBox(-6.0F, -28.0F, -10.0F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(32, 64).addBox(-6.0F, -30.0F, -8.0F, 12.0F, 6.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(24, 0).addBox(-6.0F, -32.0F, -6.0F, 12.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(16, 46).addBox(4.0F, -32.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(16, 46).addBox(-6.0F, -32.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(-2.0F, -22.0F, -14.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(2.0F, -14.0F, -14.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(2.0F, -24.0F, -14.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(-6.0F, -14.0F, -14.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(-6.0F, -24.0F, -14.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 1.3963F, 0.0F);
		bone_r1.setTextureOffset(0, 72).addBox(6.0F, -26.0F, -8.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		bone_r1.setTextureOffset(72, 74).addBox(6.0F, -12.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 1.5708F, 0.0F);
		bone_r2.setTextureOffset(56, 70).addBox(0.0F, -32.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		bone_r2.setTextureOffset(40, 34).addBox(-2.0F, -30.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 46).addBox(0.0F, -30.0F, 2.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 46).addBox(0.0F, -30.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(72, 60).addBox(-2.0F, -22.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(68, 28).addBox(-10.0F, -20.0F, 6.0F, 8.0F, 4.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 0).addBox(8.0F, -22.0F, 6.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 0).addBox(8.0F, -22.0F, -8.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 24).addBox(10.0F, -20.0F, 6.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 24).addBox(10.0F, -20.0F, -8.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(48, 14).addBox(-2.0F, -22.0F, 4.0F, 10.0F, 8.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(48, 14).addBox(-2.0F, -22.0F, -6.0F, 10.0F, 8.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(68, 28).addBox(-10.0F, -20.0F, -8.0F, 8.0F, 4.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(72, 60).addBox(-2.0F, -16.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 1.4835F, 0.0F);
		bone_r3.setTextureOffset(72, 8).addBox(2.0F, -24.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r3.setTextureOffset(72, 8).addBox(2.0F, -14.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		bone_r4 = new ModelRenderer(this);
		bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r4);
		setRotationAngle(bone_r4, 0.0F, -1.5708F, 0.0F);
		bone_r4.setTextureOffset(40, 48).addBox(-4.0F, -26.0F, -6.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(40, 30).addBox(2.0F, -16.0F, -6.0F, 8.0F, 2.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(40, 30).addBox(-4.0F, -14.0F, -6.0F, 8.0F, 2.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(48, 0).addBox(-8.0F, -12.0F, -6.0F, 6.0F, 2.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(0, 48).addBox(-8.0F, -22.0F, -6.0F, 2.0F, 12.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(60, 14).addBox(-12.0F, -10.0F, -6.0F, 4.0F, 2.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(48, 0).addBox(22.0F, -22.0F, -6.0F, 6.0F, 2.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(24, 12).addBox(16.0F, -24.0F, -6.0F, 6.0F, 6.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(0, 24).addBox(10.0F, -26.0F, -6.0F, 6.0F, 10.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(0, 0).addBox(4.0F, -28.0F, -6.0F, 6.0F, 12.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(24, 34).addBox(2.0F, -30.0F, -6.0F, 2.0F, 14.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(24, 30).addBox(2.0F, -32.0F, -6.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r4.setTextureOffset(52, 44).addBox(12.0F, -34.0F, -6.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r4.setTextureOffset(52, 44).addBox(12.0F, -34.0F, 4.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r4.setTextureOffset(24, 30).addBox(2.0F, -32.0F, 4.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r4.setTextureOffset(16, 60).addBox(0.0F, -28.0F, -6.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(60, 44).addBox(0.0F, -34.0F, -6.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(60, 14).addBox(-4.0F, -34.0F, -6.0F, 4.0F, 2.0F, 12.0F, 0.0F, false);
		bone_r4.setTextureOffset(72, 4).addBox(-4.0F, -22.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r4.setTextureOffset(72, 4).addBox(-4.0F, -16.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		bone_r5 = new ModelRenderer(this);
		bone_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r5);
		setRotationAngle(bone_r5, 0.0F, -1.4835F, 0.0F);
		bone_r5.setTextureOffset(72, 0).addBox(-8.0F, -24.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r5.setTextureOffset(72, 0).addBox(-8.0F, -14.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		bone_r6 = new ModelRenderer(this);
		bone_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r6);
		setRotationAngle(bone_r6, 0.0F, -1.3963F, 0.0F);
		bone_r6.setTextureOffset(68, 34).addBox(-12.0F, -26.0F, -8.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		bone_r6.setTextureOffset(68, 70).addBox(-12.0F, -12.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
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
