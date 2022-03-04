// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Models_kakashi2 extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer unknown_bone;
	private final ModelRenderer unknown_bone_r1;
	private final ModelRenderer unknown_bone_r2;
	private final ModelRenderer unknown_bone_r3;
	private final ModelRenderer unknown_bone_r4;
	private final ModelRenderer unknown_bone_r5;
	private final ModelRenderer unknown_bone_r6;
	private final ModelRenderer unknown_bone_r7;
	private final ModelRenderer unknown_bone_r8;
	private final ModelRenderer unknown_bone_r9;
	private final ModelRenderer unknown_bone_r10;
	private final ModelRenderer unknown_bone2;
	private final ModelRenderer unknown_bone2_r1;
	private final ModelRenderer unknown_bone2_r2;
	private final ModelRenderer unknown_bone2_r3;
	private final ModelRenderer unknown_bone2_r4;
	private final ModelRenderer unknown_bone2_r5;
	private final ModelRenderer unknown_bone3;
	private final ModelRenderer unknown_bone3_r1;
	private final ModelRenderer unknown_bone3_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone3_r2;
	private final ModelRenderer bone3_r3;
	private final ModelRenderer bone3_r4;
	private final ModelRenderer bone3_r5;
	private final ModelRenderer bone3_r6;
	private final ModelRenderer bone3_r7;
	private final ModelRenderer bone3_r8;
	private final ModelRenderer bone3_r9;
	private final ModelRenderer bone3_r10;
	private final ModelRenderer bone3_r11;
	private final ModelRenderer bone3_r12;
	private final ModelRenderer bone3_r13;
	private final ModelRenderer bone3_r14;
	private final ModelRenderer bone3_r15;
	private final ModelRenderer bone3_r16;
	private final ModelRenderer bone3_r17;
	private final ModelRenderer bone3_r18;
	private final ModelRenderer bone3_r19;
	private final ModelRenderer bone3_r20;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone_r3;
	private final ModelRenderer bone_r4;
	private final ModelRenderer bone2;

	public Models_kakashi2() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -6.25F, 0.0F);

		unknown_bone = new ModelRenderer(this);
		unknown_bone.setRotationPoint(0.0F, 30.25F, 0.0F);
		body.addChild(unknown_bone);

		unknown_bone_r1 = new ModelRenderer(this);
		unknown_bone_r1.setRotationPoint(23.0F, -25.0F, -27.0F);
		unknown_bone.addChild(unknown_bone_r1);
		setRotationAngle(unknown_bone_r1, -2.1817F, 0.0F, 0.0F);
		unknown_bone_r1.setTextureOffset(21, 43).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		unknown_bone_r2 = new ModelRenderer(this);
		unknown_bone_r2.setRotationPoint(23.0F, -25.0F, -27.0F);
		unknown_bone.addChild(unknown_bone_r2);
		setRotationAngle(unknown_bone_r2, -1.0036F, 0.0F, 0.0F);
		unknown_bone_r2.setTextureOffset(0, 103).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		unknown_bone_r3 = new ModelRenderer(this);
		unknown_bone_r3.setRotationPoint(17.0F, -24.0F, -25.0F);
		unknown_bone.addChild(unknown_bone_r3);
		setRotationAngle(unknown_bone_r3, -2.2253F, 0.5236F, -0.1309F);
		unknown_bone_r3.setTextureOffset(104, 87).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		unknown_bone_r4 = new ModelRenderer(this);
		unknown_bone_r4.setRotationPoint(17.0F, -24.0F, -25.0F);
		unknown_bone.addChild(unknown_bone_r4);
		setRotationAngle(unknown_bone_r4, -1.0036F, 0.5236F, -0.1309F);
		unknown_bone_r4.setTextureOffset(105, 105).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		unknown_bone_r5 = new ModelRenderer(this);
		unknown_bone_r5.setRotationPoint(20.0F, -24.0F, -26.0F);
		unknown_bone.addChild(unknown_bone_r5);
		setRotationAngle(unknown_bone_r5, -2.0508F, 0.2618F, -0.1309F);
		unknown_bone_r5.setTextureOffset(105, 77).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		unknown_bone_r6 = new ModelRenderer(this);
		unknown_bone_r6.setRotationPoint(20.0F, -24.0F, -26.0F);
		unknown_bone.addChild(unknown_bone_r6);
		setRotationAngle(unknown_bone_r6, -1.0036F, 0.2618F, -0.1309F);
		unknown_bone_r6.setTextureOffset(9, 107).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		unknown_bone_r7 = new ModelRenderer(this);
		unknown_bone_r7.setRotationPoint(26.0F, -24.0F, -25.0F);
		unknown_bone.addChild(unknown_bone_r7);
		setRotationAngle(unknown_bone_r7, -2.138F, -0.5672F, 0.2182F);
		unknown_bone_r7.setTextureOffset(38, 107).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		unknown_bone_r8 = new ModelRenderer(this);
		unknown_bone_r8.setRotationPoint(26.0F, -24.0F, -25.0F);
		unknown_bone.addChild(unknown_bone_r8);
		setRotationAngle(unknown_bone_r8, -1.0036F, -0.5672F, 0.0436F);
		unknown_bone_r8.setTextureOffset(52, 107).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		unknown_bone_r9 = new ModelRenderer(this);
		unknown_bone_r9.setRotationPoint(28.0F, -24.0F, -17.0F);
		unknown_bone.addChild(unknown_bone_r9);
		setRotationAngle(unknown_bone_r9, -1.0036F, -0.9599F, 0.0436F);
		unknown_bone_r9.setTextureOffset(92, 0).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		unknown_bone_r10 = new ModelRenderer(this);
		unknown_bone_r10.setRotationPoint(25.0F, -19.0F, -24.0F);
		unknown_bone.addChild(unknown_bone_r10);
		setRotationAngle(unknown_bone_r10, -0.0873F, 0.0F, 0.0F);
		unknown_bone_r10.setTextureOffset(29, 13).addBox(-8.0F, -3.0F, 0.0F, 8.0F, 3.0F, 10.0F, 0.0F, false);

		unknown_bone2 = new ModelRenderer(this);
		unknown_bone2.setRotationPoint(0.0F, 30.25F, 0.0F);
		body.addChild(unknown_bone2);

		unknown_bone2_r1 = new ModelRenderer(this);
		unknown_bone2_r1.setRotationPoint(22.0F, -22.0F, -14.0F);
		unknown_bone2.addChild(unknown_bone2_r1);
		setRotationAngle(unknown_bone2_r1, -1.2654F, -0.1745F, -0.3054F);
		unknown_bone2_r1.setTextureOffset(69, 79).addBox(-4.0F, -17.0F, -1.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		unknown_bone2_r1.setTextureOffset(20, 77).addBox(-3.0F, -14.0F, 0.0F, 3.0F, 15.0F, 3.0F, 0.0F, false);

		unknown_bone2_r2 = new ModelRenderer(this);
		unknown_bone2_r2.setRotationPoint(19.0F, -24.0F, -1.0F);
		unknown_bone2.addChild(unknown_bone2_r2);
		setRotationAngle(unknown_bone2_r2, -0.2182F, -0.3927F, -0.3491F);
		unknown_bone2_r2.setTextureOffset(32, 83).addBox(-3.0F, -16.0F, 0.0F, 3.0F, 15.0F, 3.0F, 0.0F, false);

		unknown_bone2_r3 = new ModelRenderer(this);
		unknown_bone2_r3.setRotationPoint(-24.0F, -13.0F, -6.0F);
		unknown_bone2.addChild(unknown_bone2_r3);
		setRotationAngle(unknown_bone2_r3, -0.3927F, -0.3491F, 0.2618F);
		unknown_bone2_r3.setTextureOffset(79, 10).addBox(-3.0F, -18.0F, -1.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		unknown_bone2_r4 = new ModelRenderer(this);
		unknown_bone2_r4.setRotationPoint(-22.0F, -13.0F, -6.0F);
		unknown_bone2.addChild(unknown_bone2_r4);
		setRotationAngle(unknown_bone2_r4, -0.3927F, -0.3491F, 0.0436F);
		unknown_bone2_r4.setTextureOffset(85, 33).addBox(-2.0F, -14.0F, 0.0F, 3.0F, 14.0F, 3.0F, 0.0F, false);

		unknown_bone2_r5 = new ModelRenderer(this);
		unknown_bone2_r5.setRotationPoint(-22.0F, -29.0F, 0.0F);
		unknown_bone2.addChild(unknown_bone2_r5);
		setRotationAngle(unknown_bone2_r5, -0.2182F, 0.3927F, 0.6981F);
		unknown_bone2_r5.setTextureOffset(0, 85).addBox(-2.0F, -14.0F, 0.0F, 3.0F, 15.0F, 3.0F, 0.0F, false);

		unknown_bone3 = new ModelRenderer(this);
		unknown_bone3.setRotationPoint(0.0F, 30.25F, 0.0F);
		body.addChild(unknown_bone3);
		unknown_bone3.setTextureOffset(0, 0).addBox(-4.0F, -57.0F, 0.0F, 8.0F, 13.0F, 10.0F, 0.0F, false);
		unknown_bone3.setTextureOffset(59, 3).addBox(3.0F, -56.0F, -1.0F, 1.0F, 9.0F, 9.0F, 0.0F, false);
		unknown_bone3.setTextureOffset(0, 43).addBox(-4.0F, -56.0F, -1.0F, 6.0F, 9.0F, 9.0F, 0.0F, false);
		unknown_bone3.setTextureOffset(0, 0).addBox(3.0F, -47.0F, -1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		unknown_bone3.setTextureOffset(52, 52).addBox(-4.0F, -47.0F, -1.0F, 6.0F, 7.0F, 9.0F, 0.0F, false);
		unknown_bone3.setTextureOffset(36, 0).addBox(-4.0F, -44.0F, 0.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		unknown_bone3.setTextureOffset(0, 23).addBox(-5.0F, -56.0F, 0.0F, 10.0F, 11.0F, 9.0F, 0.0F, false);
		unknown_bone3.setTextureOffset(78, 104).addBox(-3.0F, -56.0F, 10.0F, 6.0F, 10.0F, 1.0F, 0.0F, false);
		unknown_bone3.setTextureOffset(29, 101).addBox(-3.0F, -53.0F, 8.0F, 6.0F, 10.0F, 1.0F, 0.0F, false);

		unknown_bone3_r1 = new ModelRenderer(this);
		unknown_bone3_r1.setRotationPoint(11.0F, -12.0F, -3.0F);
		unknown_bone3.addChild(unknown_bone3_r1);
		setRotationAngle(unknown_bone3_r1, 0.0F, -0.8727F, 0.2618F);
		unknown_bone3_r1.setTextureOffset(101, 56).addBox(-7.0F, -3.0F, 0.0F, 7.0F, 3.0F, 3.0F, 0.0F, false);

		unknown_bone3_r2 = new ModelRenderer(this);
		unknown_bone3_r2.setRotationPoint(-3.0F, -26.0F, 7.0F);
		unknown_bone3.addChild(unknown_bone3_r2);
		setRotationAngle(unknown_bone3_r2, 0.6545F, 0.0F, 0.0F);
		unknown_bone3_r2.setTextureOffset(26, 0).addBox(1.0F, -17.0F, -1.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 6.25F, 0.0F);
		body.addChild(bone3);
		bone3.setTextureOffset(38, 38).addBox(-2.0F, -7.0F, 7.0F, 4.0F, 31.0F, 3.0F, 0.0F, false);
		bone3.setTextureOffset(70, 0).addBox(-3.0F, -4.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		bone3.setTextureOffset(69, 69).addBox(-3.0F, 2.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		bone3.setTextureOffset(47, 68).addBox(-3.0F, 8.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		bone3.setTextureOffset(20, 67).addBox(-3.0F, 14.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		bone3.setTextureOffset(85, 92).addBox(-10.0F, -3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
		bone3.setTextureOffset(91, 24).addBox(1.0F, -3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
		bone3.setTextureOffset(66, 89).addBox(1.0F, 3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
		bone3.setTextureOffset(91, 71).addBox(1.0F, 9.0F, 7.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
		bone3.setTextureOffset(88, 76).addBox(-10.0F, 3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
		bone3.setTextureOffset(44, 88).addBox(-8.0F, 9.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(5.0F, 20.0F, 0.0F);
		bone3.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.0F, -2.5307F, -0.2618F);
		bone3_r1.setTextureOffset(92, 50).addBox(1.0727F, -15.0F, 8.2298F, 7.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r2 = new ModelRenderer(this);
		bone3_r2.setRotationPoint(0.0F, 23.0F, 0.0F);
		bone3.addChild(bone3_r2);
		setRotationAngle(bone3_r2, 0.0F, -2.5307F, 0.0F);
		bone3_r2.setTextureOffset(94, 9).addBox(1.0727F, -20.0F, 8.2298F, 7.0F, 3.0F, 3.0F, 0.0F, false);
		bone3_r2.setTextureOffset(58, 95).addBox(1.0727F, -26.0F, 8.2298F, 7.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r3 = new ModelRenderer(this);
		bone3_r3.setRotationPoint(0.0F, 22.0F, 0.0F);
		bone3.addChild(bone3_r3);
		setRotationAngle(bone3_r3, 0.0F, -0.8727F, 0.0F);
		bone3_r3.setTextureOffset(94, 30).addBox(-1.6948F, -25.0F, -12.27F, 7.0F, 3.0F, 3.0F, 0.0F, false);
		bone3_r3.setTextureOffset(12, 95).addBox(-1.6948F, -19.0F, -12.27F, 7.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r4 = new ModelRenderer(this);
		bone3_r4.setRotationPoint(2.0F, 19.0F, 0.0F);
		bone3.addChild(bone3_r4);
		setRotationAngle(bone3_r4, 0.0F, -1.6581F, 0.0F);
		bone3_r4.setTextureOffset(12, 61).addBox(-3.2637F, -10.0F, 10.301F, 8.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r5 = new ModelRenderer(this);
		bone3_r5.setRotationPoint(0.0F, 23.0F, 0.0F);
		bone3.addChild(bone3_r5);
		setRotationAngle(bone3_r5, 0.0F, -1.6581F, 0.0F);
		bone3_r5.setTextureOffset(73, 53).addBox(-3.2637F, -20.0F, 10.301F, 8.0F, 3.0F, 3.0F, 0.0F, false);
		bone3_r5.setTextureOffset(86, 65).addBox(-3.2637F, -26.0F, 10.301F, 8.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r6 = new ModelRenderer(this);
		bone3_r6.setRotationPoint(-1.0F, 19.0F, 0.0F);
		bone3.addChild(bone3_r6);
		setRotationAngle(bone3_r6, 0.0F, -1.5708F, 0.0F);
		bone3_r6.setTextureOffset(96, 17).addBox(-3.2683F, -10.0F, -12.6115F, 7.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r7 = new ModelRenderer(this);
		bone3_r7.setRotationPoint(0.0F, 23.0F, 0.0F);
		bone3.addChild(bone3_r7);
		setRotationAngle(bone3_r7, 0.0F, -1.5708F, 0.0F);
		bone3_r7.setTextureOffset(82, 59).addBox(-4.2683F, -20.0F, -12.6115F, 8.0F, 3.0F, 3.0F, 0.0F, false);
		bone3_r7.setTextureOffset(86, 86).addBox(-4.2683F, -26.0F, -12.6115F, 8.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r8 = new ModelRenderer(this);
		bone3_r8.setRotationPoint(-1.0F, 9.0F, 4.0F);
		bone3.addChild(bone3_r8);
		setRotationAngle(bone3_r8, 0.0F, -1.5708F, 0.0F);
		bone3_r8.setTextureOffset(92, 104).addBox(-2.2683F, -25.0F, -12.6115F, 6.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r9 = new ModelRenderer(this);
		bone3_r9.setRotationPoint(1.0F, 9.0F, 0.0F);
		bone3.addChild(bone3_r9);
		setRotationAngle(bone3_r9, 0.0F, -1.5708F, 0.0F);
		bone3_r9.setTextureOffset(0, 75).addBox(1.7317F, -26.0F, -12.6115F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		bone3_r10 = new ModelRenderer(this);
		bone3_r10.setRotationPoint(-22.0F, 9.0F, 0.0F);
		bone3.addChild(bone3_r10);
		setRotationAngle(bone3_r10, 0.0F, -1.5708F, 0.0F);
		bone3_r10.setTextureOffset(49, 78).addBox(1.7317F, -26.0F, -12.6115F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		bone3_r11 = new ModelRenderer(this);
		bone3_r11.setRotationPoint(-22.0F, 9.0F, 4.0F);
		bone3.addChild(bone3_r11);
		setRotationAngle(bone3_r11, 0.0F, -1.5708F, 0.0F);
		bone3_r11.setTextureOffset(105, 62).addBox(-2.2683F, -25.0F, -12.6115F, 6.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r12 = new ModelRenderer(this);
		bone3_r12.setRotationPoint(2.0F, 19.0F, 0.0F);
		bone3.addChild(bone3_r12);
		setRotationAngle(bone3_r12, 0.0F, -1.1345F, 0.0F);
		bone3_r12.setTextureOffset(97, 36).addBox(-2.3728F, -10.0F, 10.6814F, 7.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r13 = new ModelRenderer(this);
		bone3_r13.setRotationPoint(0.0F, 23.0F, 0.0F);
		bone3.addChild(bone3_r13);
		setRotationAngle(bone3_r13, 0.0F, -1.1345F, 0.0F);
		bone3_r13.setTextureOffset(97, 42).addBox(-2.3728F, -20.0F, 10.6814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
		bone3_r13.setTextureOffset(58, 101).addBox(-2.3728F, -26.0F, 10.6814F, 7.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r14 = new ModelRenderer(this);
		bone3_r14.setRotationPoint(-1.0F, 19.0F, 0.0F);
		bone3.addChild(bone3_r14);
		setRotationAngle(bone3_r14, 0.0F, -2.0944F, 0.0F);
		bone3_r14.setTextureOffset(75, 98).addBox(-3.3666F, -10.0F, -12.814F, 7.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r15 = new ModelRenderer(this);
		bone3_r15.setRotationPoint(0.0F, 23.0F, 0.0F);
		bone3.addChild(bone3_r15);
		setRotationAngle(bone3_r15, 0.0F, -2.0944F, 0.0F);
		bone3_r15.setTextureOffset(95, 98).addBox(-3.3666F, -20.0F, -12.814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
		bone3_r15.setTextureOffset(9, 101).addBox(-3.3666F, -26.0F, -12.814F, 7.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r16 = new ModelRenderer(this);
		bone3_r16.setRotationPoint(-28.0F, 2.0F, -5.0F);
		bone3.addChild(bone3_r16);
		setRotationAngle(bone3_r16, 0.0F, 0.1745F, 0.6109F);
		bone3_r16.setTextureOffset(52, 44).addBox(3.0F, -25.0F, 7.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r17 = new ModelRenderer(this);
		bone3_r17.setRotationPoint(15.0F, 11.0F, -8.0F);
		bone3.addChild(bone3_r17);
		setRotationAngle(bone3_r17, 0.0F, -0.1745F, -0.6109F);
		bone3_r17.setTextureOffset(66, 21).addBox(2.0F, -25.0F, 7.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r18 = new ModelRenderer(this);
		bone3_r18.setRotationPoint(-25.0F, 4.0F, -2.0F);
		bone3.addChild(bone3_r18);
		setRotationAngle(bone3_r18, 0.0F, -0.1745F, 0.6109F);
		bone3_r18.setTextureOffset(29, 26).addBox(2.0F, -25.0F, 7.0F, 12.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r19 = new ModelRenderer(this);
		bone3_r19.setRotationPoint(13.0F, 13.0F, 0.0F);
		bone3.addChild(bone3_r19);
		setRotationAngle(bone3_r19, 0.0F, 0.2182F, -0.6109F);
		bone3_r19.setTextureOffset(66, 27).addBox(1.0F, -25.0F, 7.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);

		bone3_r20 = new ModelRenderer(this);
		bone3_r20.setRotationPoint(0.0F, 10.0F, 5.0F);
		bone3.addChild(bone3_r20);
		setRotationAngle(bone3_r20, 0.3054F, 0.0F, 0.0F);
		bone3_r20.setTextureOffset(44, 94).addBox(-2.0F, -25.0F, 7.0F, 4.0F, 10.0F, 3.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-22.0F, 25.25F, -8.0F);
		body.addChild(bone);
		setRotationAngle(bone, -0.3927F, -0.3491F, -0.0436F);
		bone.setTextureOffset(52, 26).addBox(-1.0F, -9.0F, -4.0F, 3.0F, 10.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(103, 0).addBox(0.0F, -4.0F, -6.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(2.0F, 2.0F, 0.0F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, -1.3526F);
		bone_r1.setTextureOffset(0, 61).addBox(0.0F, -3.0F, -4.0F, 2.0F, 6.0F, 8.0F, 0.0F, false);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(5.0F, -1.0F, 0.0F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 0.0F, 3.0107F);
		bone_r2.setTextureOffset(34, 72).addBox(0.0F, -2.0F, -4.0F, 2.0F, 3.0F, 8.0F, 0.0F, false);

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(3.0F, -3.0F, 0.0F);
		bone.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 0.0F, 1.4835F);
		bone_r3.setTextureOffset(73, 42).addBox(0.0F, -2.0F, -4.0F, 2.0F, 3.0F, 8.0F, 0.0F, false);

		bone_r4 = new ModelRenderer(this);
		bone_r4.setRotationPoint(3.0F, 0.0F, -4.0F);
		bone.addChild(bone_r4);
		setRotationAngle(bone_r4, 0.0F, -1.6144F, 0.0F);
		bone_r4.setTextureOffset(38, 32).addBox(0.0F, -4.0F, -3.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
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