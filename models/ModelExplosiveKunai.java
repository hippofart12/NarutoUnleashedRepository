//Made with Blockbench
//Paste this code into your mod.

public static class ModelExplosiveKunai extends ModelBase {
	private final ModelRenderer kunai;
	private final ModelRenderer k1;

	public ModelExplosiveKunai() {
		textureWidth = 92;
		textureHeight = 58;

		kunai = new ModelRenderer(this);
		kunai.setRotationPoint(-0.0183F, 24.0F, -0.75F);
		setRotationAngle(kunai, -1.5708F, 0.0F, 0.0F);
		kunai.cubeList.add(new ModelBox(kunai, 38, 13, 0.0183F, -2.0F, -8.0F, 0, 2, 8, 0.0F, false));

		k1 = new ModelRenderer(this);
		k1.setRotationPoint(0.0009F, -0.4816F, -12.2491F);
		setRotationAngle(k1, 0.0F, 0.0F, -1.5708F);
		kunai.addChild(k1);
		k1.cubeList.add(new ModelBox(k1, 38, 13, 0.2679F, -1.2688F, 4.2491F, 0, 2, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		kunai.render(f5);
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
