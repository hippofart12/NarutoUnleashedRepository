//Made with Blockbench
//Paste this code into your mod.

public static class Modeldeidara extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public Modeldeidara() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, -1.0F, -6.0F, 6.0F, 3, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, -2.0F, -8.0F, 4.0F, 4, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, -4.0F, -6.0F, 6.0F, 3, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, -4.0F, -3.0F, 6.0F, 3, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, -1.0F, -3.0F, 6.0F, 3, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, 2.0F, -3.0F, 6.0F, 2, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, -2.0F, 0.0F, 6.0F, 3, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, -1.0F, 3.0F, 6.0F, 2, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, 1.0F, 0.0F, 6.0F, 2, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, -3.0F, 0.0F, 6.0F, 1, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, 2.0F, -6.0F, 6.0F, 2, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, 0.0F, -8.0F, 6.0F, 2, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, -2.0F, -8.0F, 6.0F, 2, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 9, 0, 3.0F, -8.0F, -5.0F, 1, 8, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 9, 0, 2.0F, -8.0F, -5.0F, 1, 7, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 9, 0, 1.0F, -8.0F, -5.0F, 1, 6, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 9, 0, 0.0F, -8.0F, -5.0F, 1, 4, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 3, 39, -7.0F, 18.0F, -3.0F, 1, 3, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 14, 40, -6.0F, 15.0F, -3.0F, 1, 3, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 1, 48, 5.0F, 15.0F, -3.0F, 1, 3, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 14, 36, 4.0F, 12.0F, -3.0F, 1, 3, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 14, 53, -5.0F, 12.0F, -3.0F, 1, 3, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 15, 48, -6.0F, 18.0F, -4.0F, 2, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 15, 44, 4.0F, 18.0F, -4.0F, 2, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 7, 48, 4.0F, 18.0F, 2.0F, 2, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 6, 51, -6.0F, 18.0F, 2.0F, 2, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 18, 45, -5.0F, 15.0F, 2.0F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 20, 50, -5.0F, 15.0F, -3.0F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 11, 49, 4.0F, 15.0F, -3.0F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 17, 44, 4.0F, 15.0F, 2.0F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 2, 45, 6.0F, 18.0F, -3.0F, 1, 3, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 14, 44, -4.0F, 12.0F, 2.0F, 8, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 20, 52, -4.0F, 12.0F, -3.0F, 8, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 22, 23, -4.0F, 15.0F, 3.0F, 8, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 17, 26, -5.0F, 18.0F, 4.0F, 10, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 21, 58, -5.0F, 18.0F, -5.0F, 3, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 24, 53, 1.0F, 18.0F, -5.0F, 3, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 21, 52, -4.0F, 15.0F, -4.0F, 3, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 24, 53, 0.0F, 15.0F, -4.0F, 4, 3, 1, 0.0F, false));

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 16, -2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 16, -1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftArm.cubeList.add(new ModelBox(leftArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 52, 61, -1.0F, 9.0F, -3.0F, 4, 1, 1, 0.0F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 8, 54, -1.0F, 7.0F, -3.0F, 4, 2, 1, 0.0F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 8, 54, -1.0F, 7.0F, 2.0F, 4, 2, 1, 0.0F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 52, 61, -1.0F, 9.0F, 2.0F, 4, 1, 1, 0.0F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 31, 10, 3.0F, 9.0F, -2.0F, 1, 1, 4, 0.0F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 5, 47, 3.0F, 7.0F, -2.0F, 1, 2, 4, 0.0F, false));

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightArm.cubeList.add(new ModelBox(rightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		rightArm.cubeList.add(new ModelBox(rightArm, 6, 46, -3.0F, 7.0F, 2.0F, 4, 2, 1, 0.0F, false));
		rightArm.cubeList.add(new ModelBox(rightArm, 6, 46, -3.0F, 7.0F, -3.0F, 4, 2, 1, 0.0F, false));
		rightArm.cubeList.add(new ModelBox(rightArm, 50, 62, -3.0F, 9.0F, 2.0F, 4, 1, 1, 0.0F, false));
		rightArm.cubeList.add(new ModelBox(rightArm, 50, 62, -3.0F, 9.0F, -3.0F, 4, 1, 1, 0.0F, false));
		rightArm.cubeList.add(new ModelBox(rightArm, 50, 62, -4.0F, 9.0F, -2.0F, 1, 1, 4, 0.0F, false));
		rightArm.cubeList.add(new ModelBox(rightArm, 0, 51, -4.0F, 7.0F, -2.0F, 1, 2, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightLeg.render(f5);
		leftLeg.render(f5);
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
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}