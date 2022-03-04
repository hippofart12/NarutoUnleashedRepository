//Made with Blockbench
//Paste this code into your mod.

public static class Modelakatsuki extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public Modelakatsuki() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 42, 48, -5.0F, 20.0F, -4.0F, 5, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 42, 48, 1.0F, 20.0F, -4.0F, 5, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 4, 49, -5.0F, 17.0F, -4.0F, 5, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 30, 25, -5.0F, 14.0F, -4.0F, 5, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 19, 24, -5.0F, 14.0F, 3.0F, 10, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 17, 27, -5.0F, 17.0F, 3.0F, 11, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 42, 41, -5.0F, 20.0F, 3.0F, 11, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 19, 21, -5.0F, 11.0F, 2.0F, 10, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 48, 47, 0.0F, 14.0F, -4.0F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 48, 47, -1.0F, 11.0F, -3.0F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 48, 47, 0.0F, 17.0F, -4.0F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 4, 49, 1.0F, 17.0F, -4.0F, 5, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 36, 25, 1.0F, 14.0F, -4.0F, 4, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 4, 49, 6.0F, 18.0F, -3.0F, 1, 2, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 39, 43, -6.0F, 20.0F, -3.0F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 4, 49, -6.0F, 18.0F, -3.0F, 1, 2, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 40, 42, 6.0F, 20.0F, -3.0F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 4, 49, 5.0F, 15.0F, -3.0F, 1, 3, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 4, 49, -6.0F, 15.0F, -3.0F, 1, 3, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 4, 49, 4.0F, 12.0F, -3.0F, 1, 3, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 4, 49, -5.0F, 12.0F, -3.0F, 1, 3, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 35, 22, 0.0F, 11.0F, -3.0F, 4, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 31, 21, -4.0F, 11.0F, -3.0F, 3, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		head.cubeList.add(new ModelBox(head, 2, 33, -4.0F, -2.0F, 4.0F, 8, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 2, 33, -4.0F, 0.0F, 2.0F, 8, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 2, 33, -4.0F, 0.0F, -4.0F, 8, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 42, 46, -1.0F, -2.0F, -5.0F, 1, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 2, 33, -4.0F, -2.0F, -5.0F, 3, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 2, 33, 0.0F, -2.0F, -5.0F, 5, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 2, 33, 4.0F, -2.0F, -5.0F, 1, 2, 10, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 2, 33, -5.0F, -2.0F, -5.0F, 1, 2, 10, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 39, 35, 4.0F, -3.0F, -5.0F, 1, 1, 10, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 39, 35, -5.0F, -3.0F, -5.0F, 1, 1, 10, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 45, 41, -4.0F, -3.0F, -5.0F, 8, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 45, 41, -4.0F, -3.0F, 4.0F, 8, 1, 1, 0.0F, false));

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftArm.cubeList.add(new ModelBox(leftArm, 42, 45, -1.0F, 9.0F, -3.0F, 4, 1, 1, 0.0F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 42, 45, -1.0F, 9.0F, 2.0F, 4, 1, 1, 0.0F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 42, 45, 3.0F, 9.0F, -2.0F, 1, 1, 4, 0.0F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightArm.cubeList.add(new ModelBox(rightArm, 46, 50, -3.0F, 9.0F, -3.0F, 4, 1, 1, 0.0F, false));
		rightArm.cubeList.add(new ModelBox(rightArm, 46, 50, -3.0F, 9.0F, 2.0F, 4, 1, 1, 0.0F, false));
		rightArm.cubeList.add(new ModelBox(rightArm, 46, 50, -4.0F, 9.0F, -2.0F, 1, 1, 4, 0.0F, false));
		rightArm.cubeList.add(new ModelBox(rightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		leftArm.render(f5);
		rightArm.render(f5);
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