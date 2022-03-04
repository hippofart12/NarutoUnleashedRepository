// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelmarioneteThirdKaze extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer Flaps1;
	private final ModelRenderer flap1;
	private final ModelRenderer body_r1;
	private final ModelRenderer flap2;
	private final ModelRenderer body_r2;
	private final ModelRenderer flap3;
	private final ModelRenderer body_r3;
	private final ModelRenderer flap6;
	private final ModelRenderer body_r4;
	private final ModelRenderer flap7;
	private final ModelRenderer body_r5;
	private final ModelRenderer flap8;
	private final ModelRenderer body_r6;
	private final ModelRenderer flap9;
	private final ModelRenderer body_r7;
	private final ModelRenderer flap4;
	private final ModelRenderer body_r8;
	private final ModelRenderer flap5;
	private final ModelRenderer body_r9;
	private final ModelRenderer Flaps2;
	private final ModelRenderer flap10;
	private final ModelRenderer body_r10;
	private final ModelRenderer flap11;
	private final ModelRenderer body_r11;
	private final ModelRenderer flap12;
	private final ModelRenderer body_r12;
	private final ModelRenderer flap13;
	private final ModelRenderer body_r13;
	private final ModelRenderer flap14;
	private final ModelRenderer body_r14;
	private final ModelRenderer flap15;
	private final ModelRenderer body_r15;
	private final ModelRenderer flap16;
	private final ModelRenderer body_r16;
	private final ModelRenderer flap17;
	private final ModelRenderer body_r17;
	private final ModelRenderer flap18;
	private final ModelRenderer body_r18;
	private final ModelRenderer rightarm;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;
	private final ModelRenderer head_r10;
	private final ModelRenderer head_r11;
	private final ModelRenderer head_r12;
	private final ModelRenderer head_r13;
	private final ModelRenderer head_r14;
	private final ModelRenderer head_r15;
	private final ModelRenderer head_r16;
	private final ModelRenderer head_r17;
	private final ModelRenderer leftarm;

	public ModelmarioneteThirdKaze() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(40, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(40, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(40, 0).addBox(-4.0F, 12.0F, -2.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(22, 50).addBox(1.0F, 9.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(22, 50).addBox(-3.0F, 9.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		Flaps1 = new ModelRenderer(this);
		Flaps1.setRotationPoint(0.0F, 24.75F, 0.0F);
		body.addChild(Flaps1);

		flap1 = new ModelRenderer(this);
		flap1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Flaps1.addChild(flap1);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(3.75F, -24.0F, 0.0F);
		flap1.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, 0.5672F);
		body_r1.setTextureOffset(46, 6).addBox(-0.75F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		flap2 = new ModelRenderer(this);
		flap2.setRotationPoint(3.5F, -24.0F, 0.0F);
		Flaps1.addChild(flap2);
		setRotationAngle(flap2, 0.0F, 0.0F, -0.3927F);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap2.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, 0.5672F);
		body_r2.setTextureOffset(46, 6).addBox(-0.75F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		flap3 = new ModelRenderer(this);
		flap3.setRotationPoint(3.5F, -24.0F, 0.0F);
		Flaps1.addChild(flap3);
		setRotationAngle(flap3, 0.0F, 0.0F, 0.4363F);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap3.addChild(body_r3);
		setRotationAngle(body_r3, 0.0F, 0.0F, 0.5672F);
		body_r3.setTextureOffset(46, 6).addBox(-0.75F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		flap6 = new ModelRenderer(this);
		flap6.setRotationPoint(2.25F, -24.0F, 0.0F);
		Flaps1.addChild(flap6);
		setRotationAngle(flap6, 0.0F, -0.0873F, 0.4363F);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap6.addChild(body_r4);
		setRotationAngle(body_r4, 0.0F, 0.0F, 0.5672F);
		body_r4.setTextureOffset(46, 6).addBox(-0.75F, -7.0F, 1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		flap7 = new ModelRenderer(this);
		flap7.setRotationPoint(2.25F, -24.0F, 0.0F);
		Flaps1.addChild(flap7);
		setRotationAngle(flap7, 0.2182F, -0.0873F, 0.3054F);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap7.addChild(body_r5);
		setRotationAngle(body_r5, 0.0F, 0.0F, 0.5672F);
		body_r5.setTextureOffset(46, 6).addBox(-0.75F, -9.0F, 0.0F, 1.0F, 9.0F, 2.0F, 0.0F, false);

		flap8 = new ModelRenderer(this);
		flap8.setRotationPoint(2.25F, -24.0F, 0.0F);
		Flaps1.addChild(flap8);
		setRotationAngle(flap8, 0.1745F, 0.4363F, 0.3054F);

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap8.addChild(body_r6);
		setRotationAngle(body_r6, 0.0F, 0.0F, 0.5672F);
		body_r6.setTextureOffset(46, 6).addBox(-0.75F, -8.0F, 0.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);

		flap9 = new ModelRenderer(this);
		flap9.setRotationPoint(2.25F, -24.0F, 0.0F);
		Flaps1.addChild(flap9);
		setRotationAngle(flap9, 0.4363F, -0.48F, 0.48F);

		body_r7 = new ModelRenderer(this);
		body_r7.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap9.addChild(body_r7);
		setRotationAngle(body_r7, 0.0F, 0.0F, 0.5672F);
		body_r7.setTextureOffset(46, 6).addBox(-0.75F, -6.0F, -1.0F, 1.0F, 6.0F, 3.0F, 0.0F, false);

		flap4 = new ModelRenderer(this);
		flap4.setRotationPoint(3.5F, -24.0F, -1.0F);
		Flaps1.addChild(flap4);
		setRotationAngle(flap4, 0.0F, 0.0F, 0.1745F);

		body_r8 = new ModelRenderer(this);
		body_r8.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap4.addChild(body_r8);
		setRotationAngle(body_r8, 0.0F, 0.0F, 0.5672F);
		body_r8.setTextureOffset(46, 6).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		flap5 = new ModelRenderer(this);
		flap5.setRotationPoint(3.5F, -24.0F, 3.25F);
		Flaps1.addChild(flap5);
		setRotationAngle(flap5, 0.0F, 0.0F, 0.1745F);

		body_r9 = new ModelRenderer(this);
		body_r9.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap5.addChild(body_r9);
		setRotationAngle(body_r9, 0.0F, 0.0F, 0.5672F);
		body_r9.setTextureOffset(46, 6).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		Flaps2 = new ModelRenderer(this);
		Flaps2.setRotationPoint(0.0F, 24.5F, 0.0F);
		body.addChild(Flaps2);
		setRotationAngle(Flaps2, 0.0F, 3.1416F, 0.0F);

		flap10 = new ModelRenderer(this);
		flap10.setRotationPoint(0.0F, 0.0F, 0.0F);
		Flaps2.addChild(flap10);

		body_r10 = new ModelRenderer(this);
		body_r10.setRotationPoint(3.75F, -24.0F, 0.0F);
		flap10.addChild(body_r10);
		setRotationAngle(body_r10, 0.0F, 0.0F, 0.5672F);
		body_r10.setTextureOffset(46, 6).addBox(-0.75F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		flap11 = new ModelRenderer(this);
		flap11.setRotationPoint(3.5F, -24.0F, 0.0F);
		Flaps2.addChild(flap11);
		setRotationAngle(flap11, 0.0F, 0.0F, -0.3927F);

		body_r11 = new ModelRenderer(this);
		body_r11.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap11.addChild(body_r11);
		setRotationAngle(body_r11, 0.0F, 0.0F, 0.5672F);
		body_r11.setTextureOffset(46, 6).addBox(-0.75F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		flap12 = new ModelRenderer(this);
		flap12.setRotationPoint(3.5F, -24.0F, 0.0F);
		Flaps2.addChild(flap12);
		setRotationAngle(flap12, 0.0F, 0.0F, 0.4363F);

		body_r12 = new ModelRenderer(this);
		body_r12.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap12.addChild(body_r12);
		setRotationAngle(body_r12, 0.0F, 0.0F, 0.5672F);
		body_r12.setTextureOffset(46, 6).addBox(-0.75F, -9.0F, -2.0F, 1.0F, 9.0F, 2.0F, 0.0F, false);

		flap13 = new ModelRenderer(this);
		flap13.setRotationPoint(2.25F, -24.0F, 0.0F);
		Flaps2.addChild(flap13);
		setRotationAngle(flap13, 0.0F, -0.0873F, 0.4363F);

		body_r13 = new ModelRenderer(this);
		body_r13.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap13.addChild(body_r13);
		setRotationAngle(body_r13, 0.0F, 0.0F, 0.5672F);
		body_r13.setTextureOffset(46, 6).addBox(-0.75F, -8.0F, 0.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);

		flap14 = new ModelRenderer(this);
		flap14.setRotationPoint(2.25F, -24.0F, 0.0F);
		Flaps2.addChild(flap14);
		setRotationAngle(flap14, 0.2182F, -0.0873F, 0.3054F);

		body_r14 = new ModelRenderer(this);
		body_r14.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap14.addChild(body_r14);
		setRotationAngle(body_r14, 0.0F, 0.0F, 0.5672F);
		body_r14.setTextureOffset(46, 6).addBox(-0.75F, -8.0F, -2.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);

		flap15 = new ModelRenderer(this);
		flap15.setRotationPoint(2.25F, -24.0F, 0.0F);
		Flaps2.addChild(flap15);
		setRotationAngle(flap15, 0.1745F, 0.4363F, 0.3054F);

		body_r15 = new ModelRenderer(this);
		body_r15.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap15.addChild(body_r15);
		setRotationAngle(body_r15, 0.0F, 0.0F, 0.5672F);
		body_r15.setTextureOffset(46, 6).addBox(-0.75F, -9.0F, -2.0F, 1.0F, 9.0F, 2.0F, 0.0F, false);

		flap16 = new ModelRenderer(this);
		flap16.setRotationPoint(2.25F, -24.0F, 0.0F);
		Flaps2.addChild(flap16);
		setRotationAngle(flap16, 0.4363F, -0.48F, 0.48F);

		body_r16 = new ModelRenderer(this);
		body_r16.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap16.addChild(body_r16);
		setRotationAngle(body_r16, 0.0F, 0.0F, 0.5672F);
		body_r16.setTextureOffset(46, 6).addBox(-0.75F, -5.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		flap17 = new ModelRenderer(this);
		flap17.setRotationPoint(3.5F, -24.0F, -1.0F);
		Flaps2.addChild(flap17);
		setRotationAngle(flap17, 0.0F, 0.0F, 0.1745F);

		body_r17 = new ModelRenderer(this);
		body_r17.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap17.addChild(body_r17);
		setRotationAngle(body_r17, 0.0F, 0.0F, 0.5672F);
		body_r17.setTextureOffset(46, 6).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		flap18 = new ModelRenderer(this);
		flap18.setRotationPoint(3.5F, -24.0F, 3.25F);
		Flaps2.addChild(flap18);
		setRotationAngle(flap18, 0.0F, 0.0F, 0.1745F);

		body_r18 = new ModelRenderer(this);
		body_r18.setRotationPoint(0.25F, 0.0F, 0.0F);
		flap18.addChild(body_r18);
		setRotationAngle(body_r18, 0.0F, 0.0F, 0.5672F);
		body_r18.setTextureOffset(46, 6).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightarm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		rightarm.setTextureOffset(22, 50).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-22.0F, 17.0F, -1.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.7854F);
		head_r1.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-18.0F, 20.0F, -1.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.6545F);
		head_r2.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(12.0F, 24.0F, -1.0F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.0F, 0.0F, -0.1745F);
		head_r3.setTextureOffset(10, 0).addBox(-4.0F, -33.0F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(16.0F, 22.0F, -1.0F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, 0.0F, -0.3491F);
		head_r4.setTextureOffset(10, 0).addBox(-4.0F, -33.0F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(12.0F, 22.0F, -1.0F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, 0.0F, 0.0F, -0.2618F);
		head_r5.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(3.75F, -4.5F, -2.5F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, -0.3054F, 0.0F, -0.1745F);
		head_r6.setTextureOffset(26, 8).addBox(-0.255F, -2.903F, -0.5F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(-20.0F, 19.0F, 1.0F);
		head.addChild(head_r7);
		setRotationAngle(head_r7, 0.0F, 0.0F, 0.6981F);
		head_r7.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(16.0F, 26.0F, 3.0F);
		head.addChild(head_r8);
		setRotationAngle(head_r8, 0.0F, 0.0F, -0.2618F);
		head_r8.setTextureOffset(22, 9).addBox(-4.0F, -35.0F, -4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(-9.0F, 27.0F, 3.0F);
		head.addChild(head_r9);
		setRotationAngle(head_r9, 0.0F, 0.0F, 0.2618F);
		head_r9.setTextureOffset(10, 0).addBox(-4.0F, -35.0F, -4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

		head_r10 = new ModelRenderer(this);
		head_r10.setRotationPoint(14.0F, 24.0F, 6.0F);
		head.addChild(head_r10);
		setRotationAngle(head_r10, 0.0F, 0.0F, -0.2182F);
		head_r10.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		head_r10.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -6.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		head_r11 = new ModelRenderer(this);
		head_r11.setRotationPoint(-7.0F, 26.0F, 6.0F);
		head.addChild(head_r11);
		setRotationAngle(head_r11, 0.0F, 0.0F, 0.2182F);
		head_r11.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		head_r11.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -6.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		head_r11.setTextureOffset(21, 9).addBox(-4.0F, -32.0F, -5.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		head_r11.setTextureOffset(17, 9).addBox(-4.0F, -32.0F, -3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		head_r11.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -8.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		head_r12 = new ModelRenderer(this);
		head_r12.setRotationPoint(14.0F, 25.0F, 5.0F);
		head.addChild(head_r12);
		setRotationAngle(head_r12, 0.0F, 0.0F, -0.2182F);
		head_r12.setTextureOffset(9, 2).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		head_r12.setTextureOffset(17, 9).addBox(-4.0F, -32.0F, -2.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		head_r12.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -7.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		head_r13 = new ModelRenderer(this);
		head_r13.setRotationPoint(17.0F, 22.0F, 1.0F);
		head.addChild(head_r13);
		setRotationAngle(head_r13, 0.0F, 0.0F, -0.3491F);
		head_r13.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		head_r14 = new ModelRenderer(this);
		head_r14.setRotationPoint(-3.5F, -5.25F, -2.5F);
		head.addChild(head_r14);
		setRotationAngle(head_r14, -0.1745F, 0.0F, 0.2618F);
		head_r14.setTextureOffset(26, 8).addBox(-1.0426F, -1.9489F, -0.5F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		head_r15 = new ModelRenderer(this);
		head_r15.setRotationPoint(-12.0F, 22.0F, -1.0F);
		head.addChild(head_r15);
		setRotationAngle(head_r15, 0.0F, 0.0F, 0.48F);
		head_r15.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		head_r16 = new ModelRenderer(this);
		head_r16.setRotationPoint(-6.0F, 24.0F, 3.0F);
		head.addChild(head_r16);
		setRotationAngle(head_r16, 0.0873F, 0.0F, 0.0F);
		head_r16.setTextureOffset(18, 8).addBox(3.0F, -32.0F, 3.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		head_r16.setTextureOffset(28, 8).addBox(5.0F, -32.0F, 3.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		head_r16.setTextureOffset(21, 8).addBox(7.0F, -32.0F, 3.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		head_r16.setTextureOffset(18, 9).addBox(9.0F, -32.0F, 3.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);

		head_r17 = new ModelRenderer(this);
		head_r17.setRotationPoint(-5.0F, 24.0F, 6.0F);
		head.addChild(head_r17);
		setRotationAngle(head_r17, 0.1745F, 0.0F, 0.0F);
		head_r17.setTextureOffset(16, 9).addBox(3.0F, -32.0F, 3.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		head_r17.setTextureOffset(8, 1).addBox(5.0F, -32.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		head_r17.setTextureOffset(22, 9).addBox(7.0F, -32.0F, 3.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.setTextureOffset(40, 19).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(22, 50).addBox(0.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}
