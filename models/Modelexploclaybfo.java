//Made with Blockbench
//Paste this code into your mod.

public static class Modelexploclaybfo extends ModelBase {
	private final ModelRenderer explosiveBigFatOne;
	private final ModelRenderer arm3;
	private final ModelRenderer arm2;

	public Modelexploclaybfo() {
		textureWidth = 512;
		textureHeight = 512;

		explosiveBigFatOne = new ModelRenderer(this);
		explosiveBigFatOne.setRotationPoint(3.0F, 24.0F, -24.5F);
		explosiveBigFatOne.cubeList
				.add(new ModelBox(explosiveBigFatOne, 0, 0, -21.375F, -36.0F, 0.0F, 36, 36, 36, 0.0F, false));
		explosiveBigFatOne.cubeList
				.add(new ModelBox(explosiveBigFatOne, 5, 5, -19.4375F, -72.0F, 1.875F, 32, 36, 32, 0.0F, false));
		explosiveBigFatOne.cubeList
				.add(new ModelBox(explosiveBigFatOne, 192, 35, -16.0625F, -94.8125F, 6.1875F, 23, 23, 23, 0.0F, false));
		explosiveBigFatOne.cubeList.add(
				new ModelBox(explosiveBigFatOne, 11, 197, -13.3125F, -117.3125F, 8.4375F, 18, 23, 18, 0.0F, false));

		arm3 = new ModelRenderer(this);
		arm3.setRotationPoint(11.8125F, -47.0625F, 23.1875F);
		explosiveBigFatOne.addChild(arm3);
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 0.75F, -11.9375F, -8.5625F, 54, 23, 5, 0.0F, false));
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 54.25F, -41.1875F, -9.3125F, 41, 59, 6, 0.0F, false));
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 94.75F, 3.8125F, -9.3125F, 32, 14, 6, 0.0F, false));
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 94.75F, -41.1875F, -9.3125F, 32, 14, 6, 0.0F, false));
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 94.75F, -20.8125F, -9.3125F, 32, 18, 6, 0.0F, false));
		arm3.cubeList.add(new ModelBox(arm3, 5, 5, 9.75F, -20.4375F, -8.5625F, 45, 9, 5, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-19.875F, -47.0625F, 23.1875F);
		setRotationAngle(arm2, 0.0F, 3.1416F, 0.0F);
		explosiveBigFatOne.addChild(arm2);
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 0.375F, -11.9375F, -8.5625F, 54, 23, 5, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 53.875F, -41.1875F, -9.3125F, 41, 59, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 94.375F, 3.8125F, -9.3125F, 32, 14, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 94.375F, -41.1875F, -9.3125F, 32, 14, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 94.375F, -20.8125F, -9.3125F, 32, 18, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 5, 5, 9.375F, -20.4375F, -8.5625F, 45, 9, 5, 0.0F, false));
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
		this.arm3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}
