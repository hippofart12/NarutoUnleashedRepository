// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelWaterDragon extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone_r3;
	private final ModelRenderer bone_r4;
	private final ModelRenderer bone_r5;
	private final ModelRenderer bone_r6;

	public ModelWaterDragon() {
		textureWidth = 1024;
		textureHeight = 1024;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 134, 2, -1.0F, -6.0F, -7.0F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, -3.0F, -13.0F, -6.0F, 6, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, -3.0F, -14.0F, -5.0F, 6, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, -3.0F, -15.0F, -4.0F, 6, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, -3.0F, -16.0F, -3.0F, 6, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, 2.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, -3.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, -1.0F, -11.0F, -7.0F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, 1.0F, -7.0F, -7.0F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, 1.0F, -12.0F, -7.0F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, -3.0F, -7.0F, -7.0F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 2, -3.0F, -12.0F, -7.0F, 2, 1, 1, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 1.3963F, 0.0F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 173, 24, 3.0F, -13.0F, -4.0F, 3, 2, 1, 0.0F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 173, 24, 3.0F, -6.0F, -4.0F, 3, 1, 1, 0.0F, false));

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 1.5708F, 0.0F);
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, 0.0F, -16.0F, -1.0F, 2, 3, 2, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, -1.0F, -15.0F, -1.0F, 1, 1, 2, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, 0.0F, -15.0F, 1.0F, 2, 1, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, 0.0F, -15.0F, -2.0F, 2, 1, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, -1.0F, -11.0F, -4.0F, 3, 1, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, -5.0F, -10.0F, 3.0F, 4, 2, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, 4.0F, -11.0F, 3.0F, 1, 5, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, 4.0F, -11.0F, -4.0F, 1, 5, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, 5.0F, -10.0F, 3.0F, 1, 4, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, 5.0F, -10.0F, -4.0F, 1, 4, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, -1.0F, -11.0F, 2.0F, 5, 4, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, -1.0F, -11.0F, -3.0F, 5, 4, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, -5.0F, -10.0F, -4.0F, 4, 2, 1, 0.0F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 237, 58, -1.0F, -8.0F, -4.0F, 3, 1, 1, 0.0F, false));

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 1.4835F, 0.0F);
		bone_r3.cubeList.add(new ModelBox(bone_r3, 129, 56, 1.0F, -12.0F, -4.0F, 3, 1, 1, 0.0F, false));
		bone_r3.cubeList.add(new ModelBox(bone_r3, 129, 56, 1.0F, -7.0F, -4.0F, 3, 1, 1, 0.0F, false));

		bone_r4 = new ModelRenderer(this);
		bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r4);
		setRotationAngle(bone_r4, 0.0F, -1.5708F, 0.0F);
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, -2.0F, -13.0F, -3.0F, 2, 2, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 1.0F, -8.0F, -3.0F, 4, 1, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, -2.0F, -7.0F, -3.0F, 4, 1, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, -4.0F, -6.0F, -3.0F, 3, 1, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, -4.0F, -11.0F, -3.0F, 1, 6, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, -6.0F, -5.0F, -3.0F, 2, 1, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 11.0F, -11.0F, -3.0F, 3, 1, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 8.0F, -12.0F, -3.0F, 3, 3, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 5.0F, -13.0F, -3.0F, 3, 5, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 2.0F, -14.0F, -3.0F, 3, 6, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 1.0F, -15.0F, -3.0F, 1, 7, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 1.0F, -16.0F, -3.0F, 6, 1, 1, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 6.0F, -17.0F, -3.0F, 4, 1, 1, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 6.0F, -17.0F, 2.0F, 4, 1, 1, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 1.0F, -16.0F, 2.0F, 6, 1, 1, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 0.0F, -14.0F, -3.0F, 1, 3, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, 0.0F, -17.0F, -3.0F, 1, 2, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, -2.0F, -17.0F, -3.0F, 2, 1, 6, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, -2.0F, -11.0F, -4.0F, 3, 1, 1, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 85, 2, -2.0F, -8.0F, -4.0F, 3, 1, 1, 0.0F, false));

		bone_r5 = new ModelRenderer(this);
		bone_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r5);
		setRotationAngle(bone_r5, 0.0F, -1.4835F, 0.0F);
		bone_r5.cubeList.add(new ModelBox(bone_r5, 73, 12, -4.0F, -12.0F, -4.0F, 3, 1, 1, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 73, 12, -4.0F, -7.0F, -4.0F, 3, 1, 1, 0.0F, false));

		bone_r6 = new ModelRenderer(this);
		bone_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r6);
		setRotationAngle(bone_r6, 0.0F, -1.3963F, 0.0F);
		bone_r6.cubeList.add(new ModelBox(bone_r6, 124, 208, -6.0F, -13.0F, -4.0F, 3, 2, 1, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 124, 208, -6.0F, -6.0F, -4.0F, 3, 1, 1, 0.0F, false));
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
