//Made with Blockbench
//Paste this code into your mod.

public static class ModelDemonLantern extends ModelBase {
	private final ModelRenderer bb_main;

	public ModelDemonLantern() {
		textureWidth = 512;
		textureHeight = 512;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 264, 426, -5.0F, -3.0F, 0.0F, 5, 3, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 293, 417, -5.5F, -7.0F, 2.0F, 6, 4, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 101, 308, -5.5F, -11.0F, 0.0F, 6, 4, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 464, 456, -6.0F, -7.0F, -1.0F, 7, 2, 3, 0.0F, false));
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
