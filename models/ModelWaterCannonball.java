// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelWaterCannonball extends ModelBase {
	private final ModelRenderer bone;

	public ModelWaterCannonball() {
		textureWidth = 33;
		textureHeight = 1024;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.0F, 28.0F, -4.0F);
		bone.cubeList.add(new ModelBox(bone, 1, 4, -8.0F, -8.0F, 0.0F, 8, 8, 8, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 3, 7, -7.0F, -7.0F, -0.5F, 6, 6, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 5, -8.5F, -7.0F, 1.0F, 9, 6, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 5, 6, -7.0F, -8.5F, 1.0F, 6, 9, 6, 0.0F, false));
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
