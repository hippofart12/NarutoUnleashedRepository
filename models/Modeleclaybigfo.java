//Made with Blockbench
//Paste this code into your mod.

public static class Modeleclaybigfo extends ModelBase {
	private final ModelRenderer BigFatOne;

	public Modeleclaybigfo() {
		textureWidth = 512;
		textureHeight = 512;

		BigFatOne = new ModelRenderer(this);
		BigFatOne.setRotationPoint(0.0F, 24.0F, 0.0F);
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 17, 74, -80.0F, -80.0F, 0.0F, 80, 80, 80, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 17, 42, -70.0F, -140.0F, 10.0F, 60, 60, 60, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, -10.0F, -120.0F, 40.0F, 60, 30, 5, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, -130.0F, -120.0F, 40.0F, 60, 30, 5, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, -175.0F, -130.0F, 40.0F, 45, 50, 5, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, 50.0F, -130.0F, 40.0F, 45, 50, 5, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, 95.0F, -130.0F, 40.0F, 45, 15, 5, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, -220.0F, -130.0F, 40.0F, 45, 15, 5, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, -220.0F, -95.0F, 40.0F, 45, 15, 5, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, -220.0F, -112.25F, 40.0F, 45, 15, 5, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, 95.0F, -112.5F, 40.0F, 45, 15, 5, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, 95.0F, -95.0F, 40.0F, 45, 15, 5, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 0, 0, -60.0F, -190.0F, 20.0F, 40, 50, 40, 0.0F, false));
		BigFatOne.cubeList.add(new ModelBox(BigFatOne, 142, 71, -55.0F, -230.0F, 25.0F, 30, 40, 30, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		BigFatOne.render(f5);
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
