// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelSusanooSkeletal extends EntityModel<Entity> {
	private final ModelRenderer Cage;
	private final ModelRenderer neck;
	private final ModelRenderer Cage_r1;
	private final ModelRenderer arm;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer arm3;
	private final ModelRenderer arm4;
	private final ModelRenderer arm5;
	private final ModelRenderer arm6;
	private final ModelRenderer arm7;
	private final ModelRenderer neck2;
	private final ModelRenderer Cage_r2;
	private final ModelRenderer neck3;
	private final ModelRenderer Cage_r3;
	private final ModelRenderer Lefttop;
	private final ModelRenderer Lefttop2;
	private final ModelRenderer Lefttop3;
	private final ModelRenderer bipedBody_r1;
	private final ModelRenderer Lefttop4;
	private final ModelRenderer bipedBody_r2;
	private final ModelRenderer Lefttop5;
	private final ModelRenderer Lefttop6;
	private final ModelRenderer Lefttop7;
	private final ModelRenderer bipedBody_r3;
	private final ModelRenderer Lefttop8;
	private final ModelRenderer bipedBody_r4;
	private final ModelRenderer Lefttop9;
	private final ModelRenderer Lefttop10;
	private final ModelRenderer Lefttop11;
	private final ModelRenderer bipedBody_r5;
	private final ModelRenderer Lefttop12;
	private final ModelRenderer bipedBody_r6;
	private final ModelRenderer Lefttop13;
	private final ModelRenderer Lefttop14;
	private final ModelRenderer Lefttop15;
	private final ModelRenderer bipedBody_r7;
	private final ModelRenderer Lefttop16;
	private final ModelRenderer bipedBody_r8;
	private final ModelRenderer Lefttop17;
	private final ModelRenderer Lefttop18;
	private final ModelRenderer Lefttop19;
	private final ModelRenderer bipedBody_r9;
	private final ModelRenderer Lefttop20;
	private final ModelRenderer bipedBody_r10;
	private final ModelRenderer Lefttop21;
	private final ModelRenderer Lefttop22;
	private final ModelRenderer Lefttop23;
	private final ModelRenderer bipedBody_r11;
	private final ModelRenderer Lefttop24;
	private final ModelRenderer bipedBody_r12;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public ModelSusanooSkeletal() {
		textureWidth = 128;
		textureHeight = 128;

		Cage = new ModelRenderer(this);
		Cage.setRotationPoint(0.0F, 0.0F, 0.0F);
		Cage.setTextureOffset(0, 0).addBox(-2.25F, 3.0F, 10.75F, 4.0F, 13.0F, 3.0F, 0.0F, false);
		Cage.setTextureOffset(0, 0).addBox(-2.25F, 19.0F, 10.75F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 24.0F, 0.0F);
		Cage.addChild(neck);
		neck.setTextureOffset(0, 0).addBox(-2.25F, -30.0F, 10.75F, 4.0F, 6.0F, 3.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(-5.0F, -37.3687F, 4.088F, 10.0F, 2.0F, 3.0F, 0.0F, false);
		neck.setTextureOffset(0, 0).addBox(-1.75F, -41.3687F, 4.088F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		neck.setTextureOffset(0, 112).addBox(-4.25F, -49.3687F, 0.838F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Cage_r1 = new ModelRenderer(this);
		Cage_r1.setRotationPoint(0.0F, -30.0F, 13.75F);
		neck.addChild(Cage_r1);
		setRotationAngle(Cage_r1, 0.7418F, 0.0F, 0.0F);
		Cage_r1.setTextureOffset(0, 0).addBox(-2.25F, -10.0F, -3.0F, 4.0F, 10.0F, 3.0F, 0.0F, false);

		arm = new ModelRenderer(this);
		arm.setRotationPoint(0.0F, -36.75F, 5.5F);
		neck.addChild(arm);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(5.0F, 0.0F, 1.5F);
		arm.addChild(arm1);
		setRotationAngle(arm1, 0.0436F, 0.3054F, 0.2182F);
		arm1.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -3.0F, 13.0F, 2.0F, 3.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(13.0F, 0.0F, 0.0F);
		arm1.addChild(arm2);
		setRotationAngle(arm2, 0.0F, 0.7854F, 0.2182F);
		arm2.setTextureOffset(0, 0).addBox(0.0F, -1.5F, -3.5F, 13.0F, 3.0F, 4.0F, 0.0F, false);

		arm3 = new ModelRenderer(this);
		arm3.setRotationPoint(13.0F, 0.25F, 0.5F);
		arm2.addChild(arm3);
		setRotationAngle(arm3, 0.0F, 0.4363F, 0.0F);
		arm3.setTextureOffset(0, 0).addBox(0.0F, -2.75F, -5.0F, 13.0F, 5.0F, 6.0F, 0.0F, false);

		arm4 = new ModelRenderer(this);
		arm4.setRotationPoint(0.0F, -36.75F, 5.5F);
		neck.addChild(arm4);
		setRotationAngle(arm4, 0.0F, 3.1416F, 0.0F);

		arm5 = new ModelRenderer(this);
		arm5.setRotationPoint(5.0F, 0.0F, -1.5F);
		arm4.addChild(arm5);
		setRotationAngle(arm5, -0.0436F, -0.3054F, 0.2182F);
		arm5.setTextureOffset(0, 0).addBox(0.0F, -1.0F, 0.0F, 13.0F, 2.0F, 3.0F, 0.0F, false);

		arm6 = new ModelRenderer(this);
		arm6.setRotationPoint(13.0F, 0.0F, 0.0F);
		arm5.addChild(arm6);
		setRotationAngle(arm6, 0.0F, -0.7854F, 0.2182F);
		arm6.setTextureOffset(0, 0).addBox(0.0F, -1.5F, -0.5F, 13.0F, 3.0F, 4.0F, 0.0F, false);

		arm7 = new ModelRenderer(this);
		arm7.setRotationPoint(13.0F, 0.25F, -0.5F);
		arm6.addChild(arm7);
		setRotationAngle(arm7, 0.0F, -0.4363F, 0.0F);
		arm7.setTextureOffset(0, 0).addBox(0.0F, -2.75F, -1.0F, 13.0F, 5.0F, 6.0F, 0.0F, false);

		neck2 = new ModelRenderer(this);
		neck2.setRotationPoint(0.0F, -6.0F, 1.75F);
		Cage.addChild(neck2);
		setRotationAngle(neck2, 0.0F, 0.9163F, 0.0F);
		neck2.setTextureOffset(0, 0).addBox(-2.25F, 0.0F, 10.75F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		Cage_r2 = new ModelRenderer(this);
		Cage_r2.setRotationPoint(0.0F, 0.0F, 13.75F);
		neck2.addChild(Cage_r2);
		setRotationAngle(Cage_r2, 0.7418F, 0.0F, 0.0F);
		Cage_r2.setTextureOffset(0, 0).addBox(-2.25F, -10.0F, -3.0F, 4.0F, 10.0F, 3.0F, 0.0F, false);

		neck3 = new ModelRenderer(this);
		neck3.setRotationPoint(0.0F, -6.0F, 1.75F);
		Cage.addChild(neck3);
		setRotationAngle(neck3, 0.0F, -0.9163F, 0.0F);
		neck3.setTextureOffset(0, 0).addBox(-2.25F, 0.0F, 10.75F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		Cage_r3 = new ModelRenderer(this);
		Cage_r3.setRotationPoint(0.0F, 0.0F, 13.75F);
		neck3.addChild(Cage_r3);
		setRotationAngle(Cage_r3, 0.7418F, 0.0F, 0.0F);
		Cage_r3.setTextureOffset(0, 0).addBox(-2.25F, -10.0F, -3.0F, 4.0F, 10.0F, 3.0F, 0.0F, false);

		Lefttop = new ModelRenderer(this);
		Lefttop.setRotationPoint(12.5F, 1.5F, -6.0F);
		Cage.addChild(Lefttop);
		Lefttop.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 12.0F, 0.0F, false);

		Lefttop2 = new ModelRenderer(this);
		Lefttop2.setRotationPoint(0.25F, 0.0F, 0.75F);
		Lefttop.addChild(Lefttop2);
		setRotationAngle(Lefttop2, 0.0F, 0.6109F, 0.0F);
		Lefttop2.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop3 = new ModelRenderer(this);
		Lefttop3.setRotationPoint(0.25F, 0.0F, 11.25F);
		Lefttop.addChild(Lefttop3);
		setRotationAngle(Lefttop3, 0.0F, -0.6545F, 0.0F);
		Lefttop3.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		bipedBody_r1 = new ModelRenderer(this);
		bipedBody_r1.setRotationPoint(1.5F, 0.0F, 8.0F);
		Lefttop3.addChild(bipedBody_r1);
		setRotationAngle(bipedBody_r1, 0.0F, -0.4363F, 0.0F);
		bipedBody_r1.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Lefttop4 = new ModelRenderer(this);
		Lefttop4.setRotationPoint(-1.0F, 0.0F, 9.75F);
		Lefttop3.addChild(Lefttop4);
		setRotationAngle(Lefttop4, 0.0F, -0.6545F, 0.0F);

		bipedBody_r2 = new ModelRenderer(this);
		bipedBody_r2.setRotationPoint(1.5F, 0.0F, 0.0F);
		Lefttop4.addChild(bipedBody_r2);
		setRotationAngle(bipedBody_r2, 0.0F, -0.2618F, 0.0F);
		bipedBody_r2.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop5 = new ModelRenderer(this);
		Lefttop5.setRotationPoint(-11.0F, 0.0F, 18.5F);
		Lefttop.addChild(Lefttop5);
		setRotationAngle(Lefttop5, 0.0F, 0.0F, -3.1416F);
		Lefttop5.setTextureOffset(16, 16).addBox(12.5F, -1.5F, -18.5F, 3.0F, 3.0F, 12.0F, 0.0F, false);

		Lefttop6 = new ModelRenderer(this);
		Lefttop6.setRotationPoint(14.25F, 0.0F, -17.75F);
		Lefttop5.addChild(Lefttop6);
		setRotationAngle(Lefttop6, 0.0F, 0.6109F, 0.0F);
		Lefttop6.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop7 = new ModelRenderer(this);
		Lefttop7.setRotationPoint(14.25F, 0.0F, -7.25F);
		Lefttop5.addChild(Lefttop7);
		setRotationAngle(Lefttop7, 0.0F, -0.6545F, 0.0F);
		Lefttop7.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		bipedBody_r3 = new ModelRenderer(this);
		bipedBody_r3.setRotationPoint(1.5F, 0.0F, 8.0F);
		Lefttop7.addChild(bipedBody_r3);
		setRotationAngle(bipedBody_r3, 0.0F, -0.4363F, 0.0F);
		bipedBody_r3.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Lefttop8 = new ModelRenderer(this);
		Lefttop8.setRotationPoint(-1.0F, 0.0F, 9.75F);
		Lefttop7.addChild(Lefttop8);
		setRotationAngle(Lefttop8, 0.0F, -0.6545F, 0.0F);

		bipedBody_r4 = new ModelRenderer(this);
		bipedBody_r4.setRotationPoint(1.5F, 0.0F, 0.0F);
		Lefttop8.addChild(bipedBody_r4);
		setRotationAngle(bipedBody_r4, 0.0F, -0.2618F, 0.0F);
		bipedBody_r4.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop9 = new ModelRenderer(this);
		Lefttop9.setRotationPoint(12.5F, 9.5F, -6.0F);
		Cage.addChild(Lefttop9);
		Lefttop9.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 12.0F, 0.0F, false);

		Lefttop10 = new ModelRenderer(this);
		Lefttop10.setRotationPoint(0.25F, 0.0F, 0.75F);
		Lefttop9.addChild(Lefttop10);
		setRotationAngle(Lefttop10, 0.0F, 0.6109F, 0.0F);
		Lefttop10.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop11 = new ModelRenderer(this);
		Lefttop11.setRotationPoint(0.25F, 0.0F, 11.25F);
		Lefttop9.addChild(Lefttop11);
		setRotationAngle(Lefttop11, 0.0F, -0.6545F, 0.0F);
		Lefttop11.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		bipedBody_r5 = new ModelRenderer(this);
		bipedBody_r5.setRotationPoint(1.5F, 0.0F, 8.0F);
		Lefttop11.addChild(bipedBody_r5);
		setRotationAngle(bipedBody_r5, 0.0F, -0.4363F, 0.0F);
		bipedBody_r5.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Lefttop12 = new ModelRenderer(this);
		Lefttop12.setRotationPoint(-1.0F, 0.0F, 9.75F);
		Lefttop11.addChild(Lefttop12);
		setRotationAngle(Lefttop12, 0.0F, -0.6545F, 0.0F);

		bipedBody_r6 = new ModelRenderer(this);
		bipedBody_r6.setRotationPoint(1.5F, 0.0F, 0.0F);
		Lefttop12.addChild(bipedBody_r6);
		setRotationAngle(bipedBody_r6, 0.0F, -0.2618F, 0.0F);
		bipedBody_r6.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop13 = new ModelRenderer(this);
		Lefttop13.setRotationPoint(-11.0F, 0.0F, 18.5F);
		Lefttop9.addChild(Lefttop13);
		setRotationAngle(Lefttop13, 0.0F, 0.0F, -3.1416F);
		Lefttop13.setTextureOffset(16, 16).addBox(12.5F, -1.5F, -18.5F, 3.0F, 3.0F, 12.0F, 0.0F, false);

		Lefttop14 = new ModelRenderer(this);
		Lefttop14.setRotationPoint(14.25F, 0.0F, -17.75F);
		Lefttop13.addChild(Lefttop14);
		setRotationAngle(Lefttop14, 0.0F, 0.6109F, 0.0F);
		Lefttop14.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop15 = new ModelRenderer(this);
		Lefttop15.setRotationPoint(14.25F, 0.0F, -7.25F);
		Lefttop13.addChild(Lefttop15);
		setRotationAngle(Lefttop15, 0.0F, -0.6545F, 0.0F);
		Lefttop15.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		bipedBody_r7 = new ModelRenderer(this);
		bipedBody_r7.setRotationPoint(1.5F, 0.0F, 8.0F);
		Lefttop15.addChild(bipedBody_r7);
		setRotationAngle(bipedBody_r7, 0.0F, -0.4363F, 0.0F);
		bipedBody_r7.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Lefttop16 = new ModelRenderer(this);
		Lefttop16.setRotationPoint(-1.0F, 0.0F, 9.75F);
		Lefttop15.addChild(Lefttop16);
		setRotationAngle(Lefttop16, 0.0F, -0.6545F, 0.0F);

		bipedBody_r8 = new ModelRenderer(this);
		bipedBody_r8.setRotationPoint(1.5F, 0.0F, 0.0F);
		Lefttop16.addChild(bipedBody_r8);
		setRotationAngle(bipedBody_r8, 0.0F, -0.2618F, 0.0F);
		bipedBody_r8.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop17 = new ModelRenderer(this);
		Lefttop17.setRotationPoint(12.5F, 17.5F, -6.0F);
		Cage.addChild(Lefttop17);
		Lefttop17.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 12.0F, 0.0F, false);

		Lefttop18 = new ModelRenderer(this);
		Lefttop18.setRotationPoint(0.25F, 0.0F, 0.75F);
		Lefttop17.addChild(Lefttop18);
		setRotationAngle(Lefttop18, 0.0F, 0.6109F, 0.0F);
		Lefttop18.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop19 = new ModelRenderer(this);
		Lefttop19.setRotationPoint(0.25F, 0.0F, 11.25F);
		Lefttop17.addChild(Lefttop19);
		setRotationAngle(Lefttop19, 0.0F, -0.6545F, 0.0F);
		Lefttop19.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		bipedBody_r9 = new ModelRenderer(this);
		bipedBody_r9.setRotationPoint(1.5F, 0.0F, 8.0F);
		Lefttop19.addChild(bipedBody_r9);
		setRotationAngle(bipedBody_r9, 0.0F, -0.4363F, 0.0F);
		bipedBody_r9.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Lefttop20 = new ModelRenderer(this);
		Lefttop20.setRotationPoint(-1.0F, 0.0F, 9.75F);
		Lefttop19.addChild(Lefttop20);
		setRotationAngle(Lefttop20, 0.0F, -0.6545F, 0.0F);

		bipedBody_r10 = new ModelRenderer(this);
		bipedBody_r10.setRotationPoint(1.5F, 0.0F, 0.0F);
		Lefttop20.addChild(bipedBody_r10);
		setRotationAngle(bipedBody_r10, 0.0F, -0.2618F, 0.0F);
		bipedBody_r10.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop21 = new ModelRenderer(this);
		Lefttop21.setRotationPoint(-11.0F, 0.0F, 18.5F);
		Lefttop17.addChild(Lefttop21);
		setRotationAngle(Lefttop21, 0.0F, 0.0F, -3.1416F);
		Lefttop21.setTextureOffset(16, 16).addBox(12.5F, -1.5F, -18.5F, 3.0F, 3.0F, 12.0F, 0.0F, false);

		Lefttop22 = new ModelRenderer(this);
		Lefttop22.setRotationPoint(14.25F, 0.0F, -17.75F);
		Lefttop21.addChild(Lefttop22);
		setRotationAngle(Lefttop22, 0.0F, 0.6109F, 0.0F);
		Lefttop22.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		Lefttop23 = new ModelRenderer(this);
		Lefttop23.setRotationPoint(14.25F, 0.0F, -7.25F);
		Lefttop21.addChild(Lefttop23);
		setRotationAngle(Lefttop23, 0.0F, -0.6545F, 0.0F);
		Lefttop23.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		bipedBody_r11 = new ModelRenderer(this);
		bipedBody_r11.setRotationPoint(1.5F, 0.0F, 8.0F);
		Lefttop23.addChild(bipedBody_r11);
		setRotationAngle(bipedBody_r11, 0.0F, -0.4363F, 0.0F);
		bipedBody_r11.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Lefttop24 = new ModelRenderer(this);
		Lefttop24.setRotationPoint(-1.0F, 0.0F, 9.75F);
		Lefttop23.addChild(Lefttop24);
		setRotationAngle(Lefttop24, 0.0F, -0.6545F, 0.0F);

		bipedBody_r12 = new ModelRenderer(this);
		bipedBody_r12.setRotationPoint(1.5F, 0.0F, 0.0F);
		Lefttop24.addChild(bipedBody_r12);
		setRotationAngle(bipedBody_r12, 0.0F, -0.2618F, 0.0F);
		bipedBody_r12.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone2);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Cage.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
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
