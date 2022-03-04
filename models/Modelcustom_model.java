//Made with Blockbench
//Paste this code into your mod.

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer bb_main;

	public Modelcustom_model() {
		textureWidth = 32;
		textureHeight = 1024;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 1, 1, -2.5F, -15.0F, -1.5F, 4, 6, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 20, 1, -2.0F, -9.0F, -1.0F, 3, 4, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 5, 20, -1.5F, -5.0F, -0.5F, 2, 3, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 18, 17, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
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