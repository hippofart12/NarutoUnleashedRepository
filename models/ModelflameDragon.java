// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelflameDragon extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone_r3;
	private final ModelRenderer bone_r4;
	private final ModelRenderer bone_r5;
	private final ModelRenderer bone_r6;

	public ModelflameDragon() {
		textureWidth = 512;
		textureHeight = 512;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(137, 108).addBox(-1.0F, -6.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(-3.0F, -13.0F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(-3.0F, -14.0F, -5.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(-3.0F, -15.0F, -4.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(-3.0F, -16.0F, -3.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(2.0F, -16.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(-3.0F, -16.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(-1.0F, -11.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(1.0F, -7.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(1.0F, -12.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(-3.0F, -7.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 108).addBox(-3.0F, -12.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 1.3963F, 0.0F);
		bone_r1.setTextureOffset(176, 130).addBox(3.0F, -13.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone_r1.setTextureOffset(176, 130).addBox(3.0F, -6.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 1.5708F, 0.0F);
		bone_r2.setTextureOffset(240, 164).addBox(0.0F, -16.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(-1.0F, -15.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(0.0F, -15.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(0.0F, -15.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(-1.0F, -11.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(-5.0F, -10.0F, 3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(4.0F, -11.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(4.0F, -11.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(5.0F, -10.0F, 3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(5.0F, -10.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(-1.0F, -11.0F, 2.0F, 5.0F, 4.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(-1.0F, -11.0F, -3.0F, 5.0F, 4.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(-5.0F, -10.0F, -4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(240, 164).addBox(-1.0F, -8.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 1.4835F, 0.0F);
		bone_r3.setTextureOffset(132, 162).addBox(1.0F, -12.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r3.setTextureOffset(132, 162).addBox(1.0F, -7.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r4 = new ModelRenderer(this);
		bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r4);
		setRotationAngle(bone_r4, 0.0F, -1.5708F, 0.0F);
		bone_r4.setTextureOffset(88, 108).addBox(-2.0F, -13.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(1.0F, -8.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(-2.0F, -7.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(-4.0F, -6.0F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(-4.0F, -11.0F, -3.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(-6.0F, -5.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(11.0F, -11.0F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(8.0F, -12.0F, -3.0F, 3.0F, 3.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(5.0F, -13.0F, -3.0F, 3.0F, 5.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(2.0F, -14.0F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(1.0F, -15.0F, -3.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(1.0F, -16.0F, -3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(6.0F, -17.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(6.0F, -17.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(1.0F, -16.0F, 2.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(0.0F, -14.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(0.0F, -17.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(-2.0F, -17.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(-2.0F, -11.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r4.setTextureOffset(88, 108).addBox(-2.0F, -8.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r5 = new ModelRenderer(this);
		bone_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r5);
		setRotationAngle(bone_r5, 0.0F, -1.4835F, 0.0F);
		bone_r5.setTextureOffset(76, 118).addBox(-4.0F, -12.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r5.setTextureOffset(76, 118).addBox(-4.0F, -7.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r6 = new ModelRenderer(this);
		bone_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r6);
		setRotationAngle(bone_r6, 0.0F, -1.3963F, 0.0F);
		bone_r6.setTextureOffset(127, 314).addBox(-6.0F, -13.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone_r6.setTextureOffset(127, 314).addBox(-6.0F, -6.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
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
