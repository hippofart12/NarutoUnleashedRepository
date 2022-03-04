//Made with Blockbench
//Paste this code into your mod.

public static class ModelLightningball extends ModelBase {
	private final ModelRenderer bone;

	public ModelLightningball() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 15, -4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 29, -3.0F, -4.0F, -3.0F, 6, 0, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 9, -3.0F, 4.5F, -3.0F, 6, 0, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 26, 37, -3.0F, -3.0F, -4.5F, 6, 6, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 15, 40, -3.0F, -3.0F, 4.0F, 6, 6, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 26, 7, 4.0F, -3.0F, -3.0F, 0, 6, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 29, -4.5F, -3.0F, -3.0F, 0, 6, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
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
