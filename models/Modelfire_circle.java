//Made with Blockbench
//Paste this code into your mod.

public static class Modelfire_circle extends ModelBase {
	private final ModelRenderer fireball;
	private final ModelRenderer flameball1;
	private final ModelRenderer flameball2;
	private final ModelRenderer flameball3;
	private final ModelRenderer flameball4;
	private final ModelRenderer flameball5;
	private final ModelRenderer flameball6;
	private final ModelRenderer flameball7;
	private final ModelRenderer flameball8;

	public Modelfire_circle() {
		textureWidth = 512;
		textureHeight = 512;

		fireball = new ModelRenderer(this);
		fireball.setRotationPoint(0.0F, 34.25F, 0.0F);

		flameball1 = new ModelRenderer(this);
		flameball1.setRotationPoint(0.0F, -28.0F, 0.0F);
		fireball.addChild(flameball1);
		flameball1.cubeList.add(new ModelBox(flameball1, 0, 0, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false));
		flameball1.cubeList.add(new ModelBox(flameball1, 0, 0, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false));
		flameball1.cubeList.add(new ModelBox(flameball1, 0, 0, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false));
		flameball1.cubeList.add(new ModelBox(flameball1, 0, 0, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false));

		flameball2 = new ModelRenderer(this);
		flameball2.setRotationPoint(0.0F, -28.0F, 0.0F);
		setRotationAngle(flameball2, 0.0F, 1.5708F, 0.0F);
		fireball.addChild(flameball2);
		flameball2.cubeList.add(new ModelBox(flameball2, 37, 82, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false));
		flameball2.cubeList.add(new ModelBox(flameball2, 37, 82, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false));
		flameball2.cubeList.add(new ModelBox(flameball2, 37, 82, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false));
		flameball2.cubeList.add(new ModelBox(flameball2, 37, 82, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false));

		flameball3 = new ModelRenderer(this);
		flameball3.setRotationPoint(0.0F, -28.0F, 0.0F);
		setRotationAngle(flameball3, 0.0F, 3.1416F, 0.0F);
		fireball.addChild(flameball3);
		flameball3.cubeList.add(new ModelBox(flameball3, 175, 84, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false));
		flameball3.cubeList.add(new ModelBox(flameball3, 175, 84, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false));
		flameball3.cubeList.add(new ModelBox(flameball3, 175, 84, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false));
		flameball3.cubeList.add(new ModelBox(flameball3, 175, 84, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false));

		flameball4 = new ModelRenderer(this);
		flameball4.setRotationPoint(0.0F, -28.0F, 0.0F);
		setRotationAngle(flameball4, 0.0F, -1.5708F, 0.0F);
		fireball.addChild(flameball4);
		flameball4.cubeList.add(new ModelBox(flameball4, 197, 45, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false));
		flameball4.cubeList.add(new ModelBox(flameball4, 197, 45, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false));
		flameball4.cubeList.add(new ModelBox(flameball4, 197, 45, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false));
		flameball4.cubeList.add(new ModelBox(flameball4, 197, 45, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false));

		flameball5 = new ModelRenderer(this);
		flameball5.setRotationPoint(0.0F, -28.0F, 0.0F);
		setRotationAngle(flameball5, 0.0F, -0.7854F, 0.0F);
		fireball.addChild(flameball5);
		flameball5.cubeList.add(new ModelBox(flameball5, 217, 353, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false));
		flameball5.cubeList.add(new ModelBox(flameball5, 217, 353, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false));
		flameball5.cubeList.add(new ModelBox(flameball5, 217, 353, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false));
		flameball5.cubeList.add(new ModelBox(flameball5, 217, 353, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false));

		flameball6 = new ModelRenderer(this);
		flameball6.setRotationPoint(0.0F, -28.0F, 0.0F);
		setRotationAngle(flameball6, 0.0F, 0.7854F, 0.0F);
		fireball.addChild(flameball6);
		flameball6.cubeList.add(new ModelBox(flameball6, 79, 294, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false));
		flameball6.cubeList.add(new ModelBox(flameball6, 79, 294, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false));
		flameball6.cubeList.add(new ModelBox(flameball6, 79, 294, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false));
		flameball6.cubeList.add(new ModelBox(flameball6, 79, 294, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false));

		flameball7 = new ModelRenderer(this);
		flameball7.setRotationPoint(0.0F, -28.0F, 0.0F);
		setRotationAngle(flameball7, 0.0F, 2.3562F, 0.0F);
		fireball.addChild(flameball7);
		flameball7.cubeList.add(new ModelBox(flameball7, 52, 235, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false));
		flameball7.cubeList.add(new ModelBox(flameball7, 52, 235, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false));
		flameball7.cubeList.add(new ModelBox(flameball7, 52, 235, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false));
		flameball7.cubeList.add(new ModelBox(flameball7, 52, 235, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false));

		flameball8 = new ModelRenderer(this);
		flameball8.setRotationPoint(0.0F, -28.0F, 0.0F);
		setRotationAngle(flameball8, 0.0F, -2.3562F, 0.0F);
		fireball.addChild(flameball8);
		flameball8.cubeList.add(new ModelBox(flameball8, 384, 26, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false));
		flameball8.cubeList.add(new ModelBox(flameball8, 384, 26, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false));
		flameball8.cubeList.add(new ModelBox(flameball8, 384, 26, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false));
		flameball8.cubeList.add(new ModelBox(flameball8, 384, 26, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		fireball.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.fireball.rotateAngleY = f2 / 20.f;
	}
}
