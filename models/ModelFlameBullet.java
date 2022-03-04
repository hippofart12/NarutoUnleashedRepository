//Made with Blockbench
//Paste this code into your mod.

public static class ModelFlameBullet extends ModelBase {
	private final ModelRenderer bb_main;

	public ModelFlameBullet() {
		textureWidth = 512;
		textureHeight = 512;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 193, 225, -2.0F, -4.0F, 0.0F, 2, 4, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 77, 121, -2.5F, -10.0F, -0.5F, 3, 6, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 170, 90, -3.5F, -16.0F, -1.5F, 5, 6, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
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
