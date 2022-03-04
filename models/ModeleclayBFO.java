//Made with Blockbench
//Paste this code into your mod.

public static class ModeleclayBFO extends ModelBase {
	private final ModelRenderer explosiveBigFatOne;
	private final ModelRenderer arm3;
	private final ModelRenderer arm2;

	public ModeleclayBFO() {
		textureWidth = 512;
		textureHeight = 512;

		explosiveBigFatOne = new ModelRenderer(this);
		explosiveBigFatOne.setRotationPoint(3.0F, 24.0F, -24.5F);
		explosiveBigFatOne.cubeList
				.add(new ModelBox(explosiveBigFatOne, 0, 0, -28.5F, -48.0F, 0.0F, 48, 48, 48, 0.0F, false));
		explosiveBigFatOne.cubeList
				.add(new ModelBox(explosiveBigFatOne, 5, 5, -25.25F, -96.0F, 2.5F, 42, 48, 42, 0.0F, false));
		explosiveBigFatOne.cubeList
				.add(new ModelBox(explosiveBigFatOne, 192, 35, -20.75F, -125.75F, 8.25F, 30, 30, 30, 0.0F, false));
		explosiveBigFatOne.cubeList
				.add(new ModelBox(explosiveBigFatOne, 11, 197, -17.75F, -155.75F, 11.25F, 24, 30, 24, 0.0F, false));

		arm3 = new ModelRenderer(this);
		arm3.setRotationPoint(16.75F, -62.75F, 22.75F);
		explosiveBigFatOne.addChild(arm3);
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 0.0F, -15.25F, -3.25F, 72, 30, 6, 0.0F, false));
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 72.0F, -54.25F, -4.25F, 54, 78, 8, 0.0F, false));
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 126.0F, 5.75F, -4.25F, 42, 18, 8, 0.0F, false));
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 126.0F, -54.25F, -4.25F, 42, 18, 8, 0.0F, false));
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 126.0F, -27.75F, -4.25F, 42, 24, 8, 0.0F, false));
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 12.0F, -27.25F, -3.25F, 60, 12, 6, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-25.5F, -62.75F, 22.75F);
		setRotationAngle(arm2, 0.0F, 3.1416F, 0.0F);
		explosiveBigFatOne.addChild(arm2);
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, -0.5F, -15.25F, -3.25F, 72, 30, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 71.5F, -54.25F, -4.25F, 54, 78, 8, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 125.5F, 5.75F, -4.25F, 42, 18, 8, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 125.5F, -54.25F, -4.25F, 42, 18, 8, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 125.5F, -27.75F, -4.25F, 42, 24, 8, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 11.5F, -27.25F, -3.25F, 60, 12, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		explosiveBigFatOne.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.arm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}
