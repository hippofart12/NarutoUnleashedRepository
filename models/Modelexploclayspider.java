//Made with Blockbench
//Paste this code into your mod.

public static class Modelexploclayspider extends ModelBase {
	private final ModelRenderer exploSPIDER;
	private final ModelRenderer Body;
	private final ModelRenderer head;
	private final ModelRenderer LEftLeg1;
	private final ModelRenderer Joint;
	private final ModelRenderer RIGHTLeg1;
	private final ModelRenderer Joint5;
	private final ModelRenderer RIGHTLeg2;
	private final ModelRenderer Joint6;
	private final ModelRenderer RIGHTLeg3;
	private final ModelRenderer Joint7;
	private final ModelRenderer RIGHTLeg4;
	private final ModelRenderer Joint8;
	private final ModelRenderer LEftLeg2;
	private final ModelRenderer Joint2;
	private final ModelRenderer LEftLeg3;
	private final ModelRenderer Joint3;
	private final ModelRenderer LEftLeg4;
	private final ModelRenderer Joint4;

	public Modelexploclayspider() {
		textureWidth = 64;
		textureHeight = 64;

		exploSPIDER = new ModelRenderer(this);
		exploSPIDER.setRotationPoint(0.0F, 24.0F, 0.0F);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, -0.25F);
		exploSPIDER.addChild(Body);
		Body.cubeList.add(new ModelBox(Body, 0, 12, -6.0F, -5.0F, 0.25F, 6, 5, 7, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -6.0F, -5.0F, -7.0F, 6, 5, 7, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 34, -5.5F, -4.5F, 0.0F, 5, 4, 0, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 6, 36, -5.5F, -3.25F, -7.25F, 5, 3, 0, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.25F);
		Body.addChild(head);
		head.cubeList.add(new ModelBox(head, 22, 22, -5.0F, -4.0F, -11.5F, 4, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 36, -5.75F, -3.0F, -15.5F, 1, 3, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 28, 34, -1.25F, -3.0F, -15.5F, 1, 3, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 34, 21, -5.5F, -2.25F, -16.25F, 1, 2, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 14, 24, -1.5F, -2.25F, -16.25F, 1, 2, 3, 0.0F, false));

		LEftLeg1 = new ModelRenderer(this);
		LEftLeg1.setRotationPoint(0.0F, -3.25F, -5.25F);
		setRotationAngle(LEftLeg1, 0.0F, 0.1745F, 0.1745F);
		Body.addChild(LEftLeg1);
		LEftLeg1.cubeList.add(new ModelBox(LEftLeg1, 33, 13, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false));

		Joint = new ModelRenderer(this);
		Joint.setRotationPoint(5.75F, -0.5F, 0.0F);
		setRotationAngle(Joint, 0.0F, 0.0F, 0.6109F);
		LEftLeg1.addChild(Joint);
		Joint.cubeList.add(new ModelBox(Joint, 33, 1, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));

		RIGHTLeg1 = new ModelRenderer(this);
		RIGHTLeg1.setRotationPoint(-6.0F, -3.25F, -5.25F);
		setRotationAngle(RIGHTLeg1, 0.0F, 2.9671F, -0.1745F);
		Body.addChild(RIGHTLeg1);
		RIGHTLeg1.cubeList.add(new ModelBox(RIGHTLeg1, 26, 18, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false));

		Joint5 = new ModelRenderer(this);
		Joint5.setRotationPoint(5.75F, -0.5F, 0.0F);
		setRotationAngle(Joint5, 0.0F, 0.0F, 0.6109F);
		RIGHTLeg1.addChild(Joint5);
		Joint5.cubeList.add(new ModelBox(Joint5, 26, 9, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));

		RIGHTLeg2 = new ModelRenderer(this);
		RIGHTLeg2.setRotationPoint(-6.0F, -3.25F, -1.75F);
		setRotationAngle(RIGHTLeg2, 0.0F, 3.0543F, -0.1745F);
		Body.addChild(RIGHTLeg2);
		RIGHTLeg2.cubeList.add(new ModelBox(RIGHTLeg2, 26, 6, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false));

		Joint6 = new ModelRenderer(this);
		Joint6.setRotationPoint(5.75F, -0.5F, 0.0F);
		setRotationAngle(Joint6, 0.0F, 0.0F, 0.6109F);
		RIGHTLeg2.addChild(Joint6);
		Joint6.cubeList.add(new ModelBox(Joint6, 0, 24, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));

		RIGHTLeg3 = new ModelRenderer(this);
		RIGHTLeg3.setRotationPoint(-6.0F, -3.25F, 2.0F);
		setRotationAngle(RIGHTLeg3, 0.0F, -3.0543F, -0.1745F);
		Body.addChild(RIGHTLeg3);
		RIGHTLeg3.cubeList.add(new ModelBox(RIGHTLeg3, 19, 15, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false));

		Joint7 = new ModelRenderer(this);
		Joint7.setRotationPoint(5.75F, -0.5F, 0.0F);
		setRotationAngle(Joint7, 0.0F, 0.0F, 0.6109F);
		RIGHTLeg3.addChild(Joint7);
		Joint7.cubeList.add(new ModelBox(Joint7, 19, 12, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));

		RIGHTLeg4 = new ModelRenderer(this);
		RIGHTLeg4.setRotationPoint(-6.0F, -3.25F, 5.5F);
		setRotationAngle(RIGHTLeg4, 0.0F, -2.8798F, -0.1745F);
		Body.addChild(RIGHTLeg4);
		RIGHTLeg4.cubeList.add(new ModelBox(RIGHTLeg4, 19, 3, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false));

		Joint8 = new ModelRenderer(this);
		Joint8.setRotationPoint(5.75F, -0.5F, 0.0F);
		setRotationAngle(Joint8, 0.0F, 0.0F, 0.6109F);
		RIGHTLeg4.addChild(Joint8);
		Joint8.cubeList.add(new ModelBox(Joint8, 19, 0, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));

		LEftLeg2 = new ModelRenderer(this);
		LEftLeg2.setRotationPoint(0.0F, -3.25F, -1.75F);
		setRotationAngle(LEftLeg2, 0.0F, 0.0873F, 0.1745F);
		Body.addChild(LEftLeg2);
		LEftLeg2.cubeList.add(new ModelBox(LEftLeg2, 16, 33, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false));

		Joint2 = new ModelRenderer(this);
		Joint2.setRotationPoint(5.75F, -0.5F, 0.0F);
		setRotationAngle(Joint2, 0.0F, 0.0F, 0.6109F);
		LEftLeg2.addChild(Joint2);
		Joint2.cubeList.add(new ModelBox(Joint2, 0, 33, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));

		LEftLeg3 = new ModelRenderer(this);
		LEftLeg3.setRotationPoint(0.0F, -3.25F, 2.0F);
		setRotationAngle(LEftLeg3, 0.0F, -0.0873F, 0.1745F);
		Body.addChild(LEftLeg3);
		LEftLeg3.cubeList.add(new ModelBox(LEftLeg3, 30, 31, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false));

		Joint3 = new ModelRenderer(this);
		Joint3.setRotationPoint(5.75F, -0.5F, 0.0F);
		setRotationAngle(Joint3, 0.0F, 0.0F, 0.6109F);
		LEftLeg3.addChild(Joint3);
		Joint3.cubeList.add(new ModelBox(Joint3, 16, 30, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));

		LEftLeg4 = new ModelRenderer(this);
		LEftLeg4.setRotationPoint(0.0F, -3.25F, 5.5F);
		setRotationAngle(LEftLeg4, 0.0F, -0.1745F, 0.1745F);
		Body.addChild(LEftLeg4);
		LEftLeg4.cubeList.add(new ModelBox(LEftLeg4, 0, 30, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false));

		Joint4 = new ModelRenderer(this);
		Joint4.setRotationPoint(5.75F, -0.5F, 0.0F);
		setRotationAngle(Joint4, 0.0F, 0.0F, 0.6109F);
		LEftLeg4.addChild(Joint4);
		Joint4.cubeList.add(new ModelBox(Joint4, 0, 27, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		exploSPIDER.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RIGHTLeg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LEftLeg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.LEftLeg4.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.LEftLeg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.LEftLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RIGHTLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.RIGHTLeg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.RIGHTLeg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}
