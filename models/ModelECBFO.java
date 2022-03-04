//Made with Blockbench
//Paste this code into your mod.

public static class ModelECBFO extends ModelBase {
	private final ModelRenderer exploBigfatOne;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;

	public ModelECBFO() {
		textureWidth = 512;
		textureHeight = 512;

		exploBigfatOne = new ModelRenderer(this);
		exploBigfatOne.setRotationPoint(0.0F, 24.0F, 0.0F);
		exploBigfatOne.cubeList.add(new ModelBox(exploBigfatOne, 0, 0, -48.0F, -48.0F, 0.0F, 48, 48, 48, 0.0F, false));
		exploBigfatOne.cubeList.add(new ModelBox(exploBigfatOne, 0, 96, -45.0F, -96.0F, 3.0F, 42, 48, 42, 0.0F, false));
		exploBigfatOne.cubeList
				.add(new ModelBox(exploBigfatOne, 192, 36, -39.0F, -126.0F, 9.0F, 30, 30, 30, 0.0F, false));
		exploBigfatOne.cubeList
				.add(new ModelBox(exploBigfatOne, 96, 246, -36.0F, -156.0F, 12.0F, 24, 30, 24, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-3.0F, -75.0F, 22.5F);
		exploBigfatOne.addChild(arm1);
		arm1.cubeList.add(new ModelBox(arm1, 144, 0, 0.0F, -13.5F, -3.0F, 72, 30, 6, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 186, 72.0F, -49.5F, -3.0F, 54, 78, 6, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 288, 288, 126.0F, -48.0F, -3.0F, 42, 18, 6, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 270, 126.0F, -22.5F, -3.0F, 42, 24, 6, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 282, 96, 126.0F, 9.0F, -3.0F, 42, 18, 6, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 168, 150, 12.0F, -25.5F, -3.0F, 60, 12, 6, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-46.5F, -75.0F, 22.5F);
		setRotationAngle(arm2, 0.0F, 3.1416F, 0.0F);
		exploBigfatOne.addChild(arm2);
		arm2.cubeList.add(new ModelBox(arm2, 126, 96, 0.0F, -13.5F, -3.0F, 72, 30, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 168, 168, 72.0F, -49.5F, -3.0F, 54, 78, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 282, 36, 126.0F, -48.0F, -3.0F, 42, 18, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 192, 252, 126.0F, -22.5F, -3.0F, 42, 24, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 192, 282, 126.0F, 9.0F, -3.0F, 42, 18, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 168, 132, 12.0F, -25.5F, -3.0F, 60, 12, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		exploBigfatOne.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.arm1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.arm2.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}
