// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfenix extends EntityModel<Entity> {
	private final ModelRenderer unknown_bone;
	private final ModelRenderer unknown_bone_r1;
	private final ModelRenderer unknown_bone_r2;

	public Modelfenix() {
		textureWidth = 512;
		textureHeight = 512;

		unknown_bone = new ModelRenderer(this);
		unknown_bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		unknown_bone.setTextureOffset(115, 91).addBox(-7.0F, -5.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		unknown_bone.setTextureOffset(115, 91).addBox(4.0F, -7.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		unknown_bone.setTextureOffset(115, 91).addBox(-1.0F, -10.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		unknown_bone.setTextureOffset(115, 91).addBox(-6.0F, -8.0F, -7.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		unknown_bone.setTextureOffset(115, 91).addBox(-1.0F, -6.0F, 5.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		unknown_bone.setTextureOffset(115, 91).addBox(-1.0F, -8.0F, -10.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		unknown_bone.setTextureOffset(115, 91).addBox(0.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		unknown_bone.setTextureOffset(115, 91).addBox(-5.0F, -7.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		unknown_bone_r1 = new ModelRenderer(this);
		unknown_bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r1);
		setRotationAngle(unknown_bone_r1, -0.0873F, 0.0F, 0.0F);
		unknown_bone_r1.setTextureOffset(115, 91).addBox(0.0F, -5.647F, -7.9888F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r1.setTextureOffset(115, 91).addBox(-5.0F, -5.9085F, -5.0002F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r1.setTextureOffset(115, 91).addBox(-6.0F, -3.53F, 2.2346F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r1.setTextureOffset(115, 91).addBox(5.0F, -5.1737F, -1.9245F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r1.setTextureOffset(115, 91).addBox(0.0F, -8.511F, 1.7989F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r1.setTextureOffset(115, 91).addBox(0.0F, -4.9619F, 7.1284F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		unknown_bone_r2 = new ModelRenderer(this);
		unknown_bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r2);
		setRotationAngle(unknown_bone_r2, 0.0873F, 0.0F, 0.0F);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(1.0F, -8.2164F, -6.8596F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(4.0F, -6.6101F, 0.0266F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(6.0F, -6.6101F, 0.0266F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(-1.0F, -8.2164F, -6.8596F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(1.0F, -9.3372F, 3.2767F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(-1.0F, -9.3372F, 3.2767F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(-6.0F, -7.9549F, -3.871F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(-4.0F, -7.9549F, -3.871F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(-5.0F, -4.3562F, 2.8409F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(-7.0F, -4.3562F, 2.8409F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(-1.0F, -4.9167F, 7.909F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		unknown_bone_r2.setTextureOffset(115, 91).addBox(1.0F, -5.0038F, 7.9128F, 1.0F, 1.0F, 3.0F, 0.0F, false);
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
	}
}