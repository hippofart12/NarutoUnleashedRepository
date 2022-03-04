// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelKOH extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer feather1;
	private final ModelRenderer feather2;
	private final ModelRenderer feather3;
	private final ModelRenderer feather4;
	private final ModelRenderer feather5;
	private final ModelRenderer feather6;
	private final ModelRenderer feather7;
	private final ModelRenderer feather8;
	private final ModelRenderer feather9;
	private final ModelRenderer feather10;
	private final ModelRenderer feather11;
	private final ModelRenderer feather12;
	private final ModelRenderer flap1;
	private final ModelRenderer flap2;
	private final ModelRenderer Hat1;
	private final ModelRenderer flap3;
	private final ModelRenderer flap4;
	private final ModelRenderer flap5;

	public ModelKOH() {
		textureWidth = 512;
		textureHeight = 512;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-15.0F, -10.0F, 0.0F, 30.0F, 10.0F, 55.0F, 0.0F, false);
		bone.setTextureOffset(388, 242).addBox(-15.0F, -48.0F, 28.0F, 30.0F, 38.0F, 27.0F, 0.0F, false);
		bone.setTextureOffset(137, 46).addBox(15.0F, -13.0F, 20.0F, 30.0F, 13.0F, 33.0F, 0.0F, false);
		bone.setTextureOffset(115, 0).addBox(-45.0F, -13.0F, 20.0F, 30.0F, 13.0F, 33.0F, 0.0F, false);
		bone.setTextureOffset(0, 146).addBox(-43.0F, -26.0F, 22.0F, 28.0F, 13.0F, 29.0F, 0.0F, false);
		bone.setTextureOffset(180, 92).addBox(-42.0F, -39.0F, 23.0F, 27.0F, 13.0F, 25.0F, 0.0F, false);
		bone.setTextureOffset(94, 217).addBox(-41.0F, -52.0F, 24.0F, 28.0F, 13.0F, 22.0F, 0.0F, false);
		bone.setTextureOffset(208, 0).addBox(-40.0F, -65.0F, 25.0F, 27.0F, 13.0F, 18.0F, 0.0F, false);
		bone.setTextureOffset(85, 175).addBox(15.0F, -26.0F, 21.0F, 28.0F, 13.0F, 29.0F, 0.0F, false);
		bone.setTextureOffset(183, 150).addBox(15.0F, -39.0F, 22.0F, 27.0F, 13.0F, 25.0F, 0.0F, false);
		bone.setTextureOffset(194, 224).addBox(13.0F, -52.0F, 23.0F, 28.0F, 13.0F, 22.0F, 0.0F, false);
		bone.setTextureOffset(230, 31).addBox(13.0F, -65.0F, 24.0F, 27.0F, 13.0F, 18.0F, 0.0F, false);
		bone.setTextureOffset(393, 239).addBox(-13.0F, -86.0F, 25.0F, 26.0F, 38.0F, 28.0F, 0.0F, false);
		bone.setTextureOffset(0, 268).addBox(-14.0F, -34.0F, 20.0F, 28.0F, 24.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(208, 130).addBox(-13.0F, -12.5F, 6.75F, 5.0F, 8.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(94, 78).addBox(-4.5F, -12.5F, 8.75F, 9.0F, 8.0F, 10.0F, 0.0F, false);
		bone.setTextureOffset(22, 29).addBox(0.25F, -15.5F, 9.25F, 4.0F, 3.0F, 9.0F, 0.0F, false);
		bone.setTextureOffset(22, 29).addBox(-4.25F, -15.5F, 9.25F, 4.0F, 3.0F, 9.0F, 0.0F, false);
		bone.setTextureOffset(0, 65).addBox(8.0F, -12.5F, 6.75F, 5.0F, 8.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(94, 65).addBox(-13.0F, -12.5F, 1.75F, 26.0F, 8.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(128, 92).addBox(-13.0F, -33.25F, 8.25F, 26.0F, 3.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(15, 137).addBox(-13.0F, -33.25F, 13.25F, 5.0F, 3.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(115, 46).addBox(8.0F, -33.25F, 13.25F, 5.0F, 3.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(180, 130).addBox(9.0F, -30.25F, 14.25F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(122, 78).addBox(-12.0F, -30.25F, 14.25F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 65).addBox(9.0F, -30.25F, 9.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(38, 8).addBox(5.0F, -30.25F, 9.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 37).addBox(1.0F, -30.25F, 9.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(43, 44).addBox(-12.0F, -30.25F, 9.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(39, 29).addBox(-8.0F, -30.25F, 9.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(38, 0).addBox(-4.0F, -30.25F, 9.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 188).addBox(-12.0F, -14.5F, 2.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 137).addBox(-12.0F, -14.5F, 6.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(133, 12).addBox(-12.0F, -14.5F, 10.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(133, 0).addBox(-12.0F, -14.5F, 14.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(176, 186).addBox(-9.0F, -14.5F, 2.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(180, 103).addBox(-6.0F, -14.5F, 2.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(85, 137).addBox(-3.0F, -14.5F, 2.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(170, 175).addBox(1.25F, -14.5F, 2.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(85, 157).addBox(4.25F, -14.5F, 2.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(156, 65).addBox(7.25F, -14.5F, 2.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(91, 147).addBox(10.25F, -14.5F, 2.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(26, 85).addBox(10.25F, -14.5F, 6.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(22, 65).addBox(10.25F, -14.5F, 10.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(12, 37).addBox(10.25F, -14.5F, 14.75F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(128, 100).addBox(-15.0F, -12.0F, 0.0F, 30.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(272, 224).addBox(-15.0F, -12.0F, 1.0F, 1.0F, 2.0F, 20.0F, 0.0F, false);
		bone.setTextureOffset(0, 29).addBox(14.0F, -12.0F, 1.0F, 1.0F, 2.0F, 20.0F, 0.0F, false);
		bone.setTextureOffset(0, 479).addBox(-15.0F, -34.0F, 8.0F, 1.0F, 22.0F, 13.0F, 0.0F, false);
		bone.setTextureOffset(0, 408).addBox(14.0F, -34.0F, 8.0F, 1.0F, 22.0F, 13.0F, 0.0F, false);
		bone.setTextureOffset(92, 472).addBox(-15.0F, -58.0F, 8.0F, 30.0F, 25.0F, 17.0F, 0.0F, false);
		bone.setTextureOffset(403, 473).addBox(4.0F, -58.0F, 6.0F, 10.0F, 4.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(59, 137).addBox(4.0F, -54.0F, 7.0F, 10.0F, 6.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(137, 46).addBox(-14.0F, -54.0F, 7.0F, 10.0F, 6.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(418, 470).addBox(-14.0F, -58.0F, 6.0F, 10.0F, 4.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(410, 480).addBox(-14.0F, -60.0F, 6.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(425, 466).addBox(-14.0F, -65.0F, 6.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(411, 478).addBox(12.0F, -65.0F, 6.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(415, 461).addBox(-14.5F, -75.0F, 6.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(396, 465).addBox(12.5F, -75.0F, 6.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(425, 476).addBox(-13.75F, -81.0F, 6.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(415, 485).addBox(11.75F, -81.0F, 6.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(411, 473).addBox(7.0F, -60.0F, 6.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(77, 188).addBox(-6.0F, -45.0F, 2.0F, 12.0F, 7.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(37, 137).addBox(-3.0F, -48.0F, 3.0F, 6.0F, 3.0F, 5.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(17.5F, -58.25F, 15.25F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1309F);
		cube_r1.setTextureOffset(480, 0).addBox(-2.0F, 0.25F, -7.25F, 3.0F, 24.0F, 15.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-16.75F, -58.25F, 15.25F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1309F);
		cube_r2.setTextureOffset(480, 0).addBox(-1.25F, -0.5F, -7.25F, 3.0F, 24.0F, 15.0F, 0.0F, false);

		feather1 = new ModelRenderer(this);
		feather1.setRotationPoint(-12.75F, -80.75F, 7.0F);
		bone.addChild(feather1);
		setRotationAngle(feather1, -0.0436F, 0.0F, 0.0F);
		feather1.setTextureOffset(417, 476).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather2 = new ModelRenderer(this);
		feather2.setRotationPoint(0.0F, -5.75F, 0.0F);
		feather1.addChild(feather2);
		setRotationAngle(feather2, -0.0436F, 0.0F, -0.0873F);
		feather2.setTextureOffset(422, 469).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather3 = new ModelRenderer(this);
		feather3.setRotationPoint(0.0F, -5.75F, 0.0F);
		feather2.addChild(feather3);
		setRotationAngle(feather3, -0.1309F, 0.0F, -0.0873F);
		feather3.setTextureOffset(419, 476).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather4 = new ModelRenderer(this);
		feather4.setRotationPoint(0.0F, -5.5F, 0.0F);
		feather3.addChild(feather4);
		setRotationAngle(feather4, -0.2618F, 0.0F, -0.0873F);
		feather4.setTextureOffset(410, 474).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather5 = new ModelRenderer(this);
		feather5.setRotationPoint(0.0F, -5.5F, 0.0F);
		feather4.addChild(feather5);
		setRotationAngle(feather5, -0.3927F, 0.0F, -0.1309F);
		feather5.setTextureOffset(413, 478).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather6 = new ModelRenderer(this);
		feather6.setRotationPoint(0.0F, -5.5F, 0.0F);
		feather5.addChild(feather6);
		setRotationAngle(feather6, -0.3491F, 0.0F, -0.0436F);
		feather6.setTextureOffset(417, 468).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather7 = new ModelRenderer(this);
		feather7.setRotationPoint(12.75F, -80.75F, 7.0F);
		bone.addChild(feather7);
		setRotationAngle(feather7, -0.0436F, 0.0F, 0.0F);
		feather7.setTextureOffset(415, 484).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather8 = new ModelRenderer(this);
		feather8.setRotationPoint(0.0F, -5.75F, 0.0F);
		feather7.addChild(feather8);
		setRotationAngle(feather8, -0.0436F, 0.0F, 0.0873F);
		feather8.setTextureOffset(402, 477).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather9 = new ModelRenderer(this);
		feather9.setRotationPoint(0.0F, -5.75F, 0.0F);
		feather8.addChild(feather9);
		setRotationAngle(feather9, -0.1309F, 0.0F, 0.0873F);
		feather9.setTextureOffset(422, 472).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather10 = new ModelRenderer(this);
		feather10.setRotationPoint(0.0F, -5.5F, 0.0F);
		feather9.addChild(feather10);
		setRotationAngle(feather10, -0.2618F, 0.0F, 0.0873F);
		feather10.setTextureOffset(400, 452).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather11 = new ModelRenderer(this);
		feather11.setRotationPoint(0.0F, -5.5F, 0.0F);
		feather10.addChild(feather11);
		setRotationAngle(feather11, -0.3927F, 0.0F, 0.1309F);
		feather11.setTextureOffset(396, 490).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		feather12 = new ModelRenderer(this);
		feather12.setRotationPoint(0.0F, -5.5F, 0.0F);
		feather11.addChild(feather12);
		setRotationAngle(feather12, -0.3491F, 0.0F, 0.0436F);
		feather12.setTextureOffset(409, 465).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		flap1 = new ModelRenderer(this);
		flap1.setRotationPoint(15.0F, -21.25F, 21.0F);
		bone.addChild(flap1);
		setRotationAngle(flap1, 0.0F, -0.5672F, 0.0F);
		flap1.setTextureOffset(118, 280).addBox(-1.0F, -12.75F, -10.0F, 3.0F, 34.0F, 10.0F, 0.0F, false);
		flap1.setTextureOffset(168, 283).addBox(-1.0F, -8.75F, -19.0F, 3.0F, 30.0F, 9.0F, 0.0F, false);
		flap1.setTextureOffset(220, 288).addBox(-1.0F, 1.25F, -25.0F, 3.0F, 20.0F, 6.0F, 0.0F, false);

		flap2 = new ModelRenderer(this);
		flap2.setRotationPoint(-16.0F, -21.25F, 21.0F);
		bone.addChild(flap2);
		setRotationAngle(flap2, 0.0F, 0.5672F, 0.0F);
		flap2.setTextureOffset(92, 280).addBox(-1.0F, -12.75F, -10.0F, 3.0F, 34.0F, 10.0F, 0.0F, false);
		flap2.setTextureOffset(144, 283).addBox(-1.0F, -8.75F, -19.0F, 3.0F, 30.0F, 9.0F, 0.0F, false);
		flap2.setTextureOffset(115, 0).addBox(-1.0F, 1.25F, -25.0F, 3.0F, 20.0F, 6.0F, 0.0F, false);

		Hat1 = new ModelRenderer(this);
		Hat1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(Hat1);
		Hat1.setTextureOffset(181, 199).addBox(-20.0F, -65.0F, 7.0F, 40.0F, 7.0F, 18.0F, 0.0F, false);
		Hat1.setTextureOffset(0, 242).addBox(-12.0F, -72.0F, 6.0F, 24.0F, 7.0F, 19.0F, 0.0F, false);

		flap3 = new ModelRenderer(this);
		flap3.setRotationPoint(15.5F, -65.0F, 16.25F);
		Hat1.addChild(flap3);
		setRotationAngle(flap3, 0.0F, 0.0F, 0.3054F);
		flap3.setTextureOffset(259, 74).addBox(-8.5F, -10.0F, -9.25F, 13.0F, 13.0F, 18.0F, 0.0F, false);
		flap3.setTextureOffset(264, 259).addBox(-6.5F, -20.0F, -8.25F, 11.0F, 13.0F, 16.0F, 0.0F, false);
		flap3.setTextureOffset(42, 280).addBox(-4.5F, -30.0F, -8.25F, 9.0F, 13.0F, 16.0F, 0.0F, false);

		flap4 = new ModelRenderer(this);
		flap4.setRotationPoint(-13.5F, -65.0F, 16.25F);
		Hat1.addChild(flap4);
		setRotationAngle(flap4, 0.0F, 0.0F, -0.3054F);
		flap4.setTextureOffset(142, 252).addBox(-6.5F, -10.0F, -9.25F, 13.0F, 13.0F, 18.0F, 0.0F, false);
		flap4.setTextureOffset(262, 130).addBox(-6.5F, -20.0F, -8.25F, 11.0F, 13.0F, 16.0F, 0.0F, false);
		flap4.setTextureOffset(279, 172).addBox(-6.5F, -30.0F, -8.25F, 9.0F, 13.0F, 16.0F, 0.0F, false);

		flap5 = new ModelRenderer(this);
		flap5.setRotationPoint(0.75F, -65.0F, 16.25F);
		Hat1.addChild(flap5);
		flap5.setTextureOffset(68, 252).addBox(-10.5F, -10.0F, -9.25F, 19.0F, 10.0F, 18.0F, 0.0F, false);
		flap5.setTextureOffset(204, 259).addBox(-8.0F, -20.0F, -8.25F, 14.0F, 13.0F, 16.0F, 0.0F, false);
		flap5.setTextureOffset(0, 0).addBox(-6.5F, -30.0F, -8.25F, 11.0F, 13.0F, 16.0F, 0.0F, false);
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