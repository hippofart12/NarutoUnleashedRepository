// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelCC extends EntityModel<Entity> {
	private final ModelRenderer Chain;
	private final ModelRenderer Chain2;
	private final ModelRenderer Chain3;
	private final ModelRenderer Chain4;
	private final ModelRenderer Chain5;

	public ModelCC() {
		textureWidth = 16;
		textureHeight = 16;

		Chain = new ModelRenderer(this);
		Chain.setRotationPoint(0.5F, 24.0F, 1.0F);
		Chain.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Chain.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Chain.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Chain.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Chain2 = new ModelRenderer(this);
		Chain2.setRotationPoint(0.0F, -6.0F, 0.0F);
		Chain.addChild(Chain2);
		setRotationAngle(Chain2, 0.0F, 1.5272F, 0.0F);
		Chain2.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Chain2.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Chain2.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Chain2.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Chain3 = new ModelRenderer(this);
		Chain3.setRotationPoint(0.0F, -6.25F, 0.0F);
		Chain2.addChild(Chain3);
		setRotationAngle(Chain3, 0.0F, 1.5272F, 0.0F);
		Chain3.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Chain3.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Chain3.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Chain3.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Chain4 = new ModelRenderer(this);
		Chain4.setRotationPoint(0.0F, -6.25F, 0.0F);
		Chain3.addChild(Chain4);
		setRotationAngle(Chain4, 0.0F, 1.5272F, 0.0F);
		Chain4.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Chain4.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Chain4.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Chain4.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Chain5 = new ModelRenderer(this);
		Chain5.setRotationPoint(0.0F, -6.0F, 0.0F);
		Chain4.addChild(Chain5);
		setRotationAngle(Chain5, 0.0F, 1.5272F, 0.0F);
		Chain5.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Chain5.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Chain5.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Chain5.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Chain.render(matrixStack, buffer, packedLight, packedOverlay);
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
