package net.mcreator.narutounleashed.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.narutounleashed.entity.RinneganCentipedeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RinneganCentipedeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RinneganCentipedeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcaminhoanimal(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/caminhoanimal.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelcaminhoanimal extends EntityModel<Entity> {
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
		private final ModelRenderer Head;
		private final ModelRenderer unknown_bone_r11;
		private final ModelRenderer unknown_bone_r12;
		private final ModelRenderer unknown_bone_r13;

		public Modelcaminhoanimal() {
			textureWidth = 240;
			textureHeight = 240;
			unknown_bone = new ModelRenderer(this);
			unknown_bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			unknown_bone.setTextureOffset(166, 211).addBox(-5.0F, -6.0F, -8.0F, 10.0F, 4.0F, 16.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(5.0F, -5.0F, -8.0F, 1.0F, 3.0F, 16.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(-1.0F, -5.0F, 16.0F, 1.0F, 3.0F, 16.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(-12.0F, -5.0F, 16.0F, 1.0F, 3.0F, 16.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(-6.0F, -5.0F, -8.0F, 1.0F, 3.0F, 16.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(-4.0F, -8.0F, 44.0F, 8.0F, 2.0F, 16.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(-4.0F, -8.0F, -8.0F, 8.0F, 2.0F, 16.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(-10.0F, -8.0F, 17.0F, 8.0F, 2.0F, 16.0F, 0.0F, false);
			unknown_bone.setTextureOffset(21, 211).addBox(5.0F, -4.0F, -6.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(28, 212).addBox(-8.0F, -4.0F, -6.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(37, 213).addBox(-8.0F, -4.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(22, 209).addBox(-8.0F, -4.0F, 2.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(18, 220).addBox(-9.0F, -4.0F, 6.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(2, 219).addBox(5.0F, -4.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(19, 214).addBox(5.0F, -4.0F, 2.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(16, 202).addBox(5.0F, -4.0F, 6.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(23, 214).addBox(2.0F, -4.0F, 11.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(36, 217).addBox(-12.0F, -4.0F, 11.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(-5.0F, -6.0F, 42.0F, 10.0F, 4.0F, 16.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(-5.0F, -6.0F, 58.0F, 10.0F, 4.0F, 3.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(5.0F, -5.0F, 47.0F, 3.0F, 2.0F, 11.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(-8.0F, -5.0F, 47.0F, 3.0F, 2.0F, 11.0F, 0.0F, false);
			unknown_bone.setTextureOffset(166, 211).addBox(-11.0F, -6.0F, 15.0F, 10.0F, 4.0F, 16.0F, 0.0F, false);
			unknown_bone.setTextureOffset(13, 214).addBox(-14.0F, -4.0F, 15.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(19, 210).addBox(0.0F, -4.0F, 15.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(12, 217).addBox(-14.0F, -4.0F, 19.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(28, 219).addBox(-1.0F, -4.0F, 19.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(18, 222).addBox(-14.0F, -4.0F, 23.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(13, 217).addBox(-1.0F, -4.0F, 23.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(33, 219).addBox(-14.0F, -4.0F, 27.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(29, 214).addBox(-12.0F, -4.0F, 33.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(24, 215).addBox(-1.0F, -4.0F, 27.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(15, 215).addBox(0.0F, -4.0F, 31.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(17, 208).addBox(2.0F, -4.0F, 35.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(10, 213).addBox(4.0F, -4.0F, 39.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(20, 215).addBox(5.0F, -4.0F, 43.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(29, 216).addBox(-9.0F, -4.0F, 45.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(24, 216).addBox(-9.0F, -4.0F, 41.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone.setTextureOffset(30, 218).addBox(-11.0F, -4.0F, 37.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r1 = new ModelRenderer(this);
			unknown_bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r1);
			setRotationAngle(unknown_bone_r1, 0.0F, -0.5236F, 0.0F);
			unknown_bone_r1.setTextureOffset(166, 211).addBox(-3.0143F, -5.0F, 4.1842F, 1.0F, 3.0F, 16.0F, 0.0F, false);
			unknown_bone_r1.setTextureOffset(166, 211).addBox(8.1459F, -5.0F, 3.5143F, 1.0F, 3.0F, 16.0F, 0.0F, false);
			unknown_bone_r1.setTextureOffset(166, 211).addBox(-0.7823F, -8.0F, 4.0503F, 8.0F, 2.0F, 16.0F, 0.0F, false);
			unknown_bone_r1.setTextureOffset(166, 211).addBox(-1.7823F, -6.0F, 4.0503F, 10.0F, 4.0F, 16.0F, 0.0F, false);
			unknown_bone_r2 = new ModelRenderer(this);
			unknown_bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r2);
			setRotationAngle(unknown_bone_r2, 0.0F, 0.4363F, 0.0F);
			unknown_bone_r2.setTextureOffset(166, 211).addBox(-24.6557F, -5.0F, 22.4255F, 2.0F, 2.0F, 16.0F, 0.0F, false);
			unknown_bone_r2.setTextureOffset(166, 211).addBox(-13.78F, -5.0F, 27.4969F, 2.0F, 2.0F, 15.0F, 0.0F, false);
			unknown_bone_r2.setTextureOffset(166, 211).addBox(-22.2657F, -8.0F, 24.177F, 8.0F, 2.0F, 16.0F, 0.0F, false);
			unknown_bone_r2.setTextureOffset(166, 211).addBox(-23.2657F, -6.0F, 24.177F, 10.0F, 4.0F, 16.0F, 0.0F, false);
			unknown_bone_r3 = new ModelRenderer(this);
			unknown_bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r3);
			setRotationAngle(unknown_bone_r3, 0.0F, 0.0F, 1.0472F);
			unknown_bone_r3.setTextureOffset(10, 211).addBox(1.3038F, -9.5981F, 43.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r3.setTextureOffset(15, 208).addBox(0.8038F, -8.7321F, 39.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r3.setTextureOffset(26, 214).addBox(-0.1962F, -7.0F, 35.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r3.setTextureOffset(21, 216).addBox(-1.1962F, -5.2679F, 31.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r3.setTextureOffset(7, 214).addBox(-1.6962F, -4.4019F, 27.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r3.setTextureOffset(26, 216).addBox(-1.6962F, -4.4019F, 23.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r3.setTextureOffset(15, 216).addBox(-1.6962F, -4.4019F, 19.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r3.setTextureOffset(25, 220).addBox(-0.6962F, -6.134F, 15.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r4 = new ModelRenderer(this);
			unknown_bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r4);
			setRotationAngle(unknown_bone_r4, 0.0F, 0.0F, -0.8727F);
			unknown_bone_r4.setTextureOffset(28, 208).addBox(-7.7042F, -9.9349F, 45.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r4.setTextureOffset(12, 216).addBox(-7.7042F, -9.9349F, 41.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r4.setTextureOffset(6, 212).addBox(-8.347F, -10.7009F, 37.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r4.setTextureOffset(29, 208).addBox(-9.6326F, -12.233F, 33.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r4.setTextureOffset(21, 219).addBox(-10.9182F, -13.7651F, 27.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r4.setTextureOffset(34, 212).addBox(-10.9182F, -13.7651F, 23.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r4.setTextureOffset(24, 218).addBox(-10.9182F, -13.7651F, 19.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r4.setTextureOffset(18, 221).addBox(-10.9182F, -13.7651F, 15.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r5 = new ModelRenderer(this);
			unknown_bone_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r5);
			setRotationAngle(unknown_bone_r5, 0.0F, -0.7854F, 0.0F);
			unknown_bone_r5.setTextureOffset(15, 220).addBox(47.7981F, -5.0F, 41.1357F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			unknown_bone_r6 = new ModelRenderer(this);
			unknown_bone_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r6);
			setRotationAngle(unknown_bone_r6, 0.0F, -0.8727F, 0.0F);
			unknown_bone_r6.setTextureOffset(21, 217).addBox(43.0682F, -5.0F, 39.8075F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			unknown_bone_r7 = new ModelRenderer(this);
			unknown_bone_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r7);
			setRotationAngle(unknown_bone_r7, 0.0F, 0.5236F, 0.0F);
			unknown_bone_r7.setTextureOffset(21, 221).addBox(-38.141F, -5.0F, 50.5263F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			unknown_bone_r7.setTextureOffset(24, 211).addBox(-29.3468F, -5.0F, 53.2942F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			unknown_bone_r8 = new ModelRenderer(this);
			unknown_bone_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r8);
			setRotationAngle(unknown_bone_r8, -1.0472F, 0.0F, 0.0F);
			unknown_bone_r8.setTextureOffset(166, 211).addBox(-6.0F, 3.0885F, -23.0622F, 1.0F, 3.0F, 16.0F, 0.0F, false);
			unknown_bone_r8.setTextureOffset(166, 211).addBox(5.0F, 3.0885F, -23.0622F, 1.0F, 3.0F, 16.0F, 0.0F, false);
			unknown_bone_r8.setTextureOffset(166, 211).addBox(-4.0F, -1.2417F, -20.5622F, 8.0F, 3.0F, 16.0F, 0.0F, false);
			unknown_bone_r8.setTextureOffset(166, 211).addBox(-5.0F, 1.7224F, -21.6961F, 10.0F, 4.0F, 16.0F, 0.0F, false);
			unknown_bone_r9 = new ModelRenderer(this);
			unknown_bone_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r9);
			setRotationAngle(unknown_bone_r9, 0.0F, 0.0F, 0.8727F);
			unknown_bone_r9.setTextureOffset(35, 219).addBox(1.1772F, -7.487F, 11.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r9.setTextureOffset(14, 222).addBox(2.4628F, -9.019F, 6.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r9.setTextureOffset(32, 215).addBox(2.4628F, -9.019F, 2.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r9.setTextureOffset(20, 223).addBox(2.4628F, -9.019F, -2.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r9.setTextureOffset(20, 207).addBox(2.4628F, -9.019F, -6.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r10 = new ModelRenderer(this);
			unknown_bone_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r10);
			setRotationAngle(unknown_bone_r10, 0.0F, 0.0F, -0.7854F);
			unknown_bone_r10.setTextureOffset(24, 222).addBox(-10.985F, -11.1483F, 11.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r10.setTextureOffset(18, 228).addBox(-8.8636F, -9.027F, 6.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r10.setTextureOffset(20, 217).addBox(-8.1565F, -8.3198F, 2.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r10.setTextureOffset(7, 212).addBox(-8.1565F, -8.3198F, -2.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r10.setTextureOffset(20, 218).addBox(-8.1565F, -8.3198F, -6.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -16.0F, -13.5F);
			unknown_bone.addChild(Head);
			Head.setTextureOffset(166, 211).addBox(-5.0F, -5.0F, -20.5F, 10.0F, 8.0F, 24.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(5.0F, -4.0F, -13.5F, 2.0F, 7.0F, 13.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(7.0F, -3.0F, -13.5F, 2.0F, 5.0F, 11.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(-7.0F, -4.0F, -12.5F, 2.0F, 7.0F, 12.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(-9.0F, -3.0F, -12.5F, 2.0F, 5.0F, 10.0F, 0.0F, false);
			Head.setTextureOffset(220, 9).addBox(-2.0F, -12.0F, -13.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(218, 10).addBox(-2.0F, 3.0F, -13.5F, 5.0F, 5.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(228, 128).addBox(5.0F, -5.0F, -18.5F, 0.0F, 4.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(5.0F, -5.2F, -18.5F, 0.0F, 0.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(181, 193).addBox(-5.4F, -5.2F, -18.5F, 0.0F, 0.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(229, 129).addBox(-5.4F, -5.0F, -18.5F, 0.0F, 4.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(-8.0F, -1.0F, -17.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(-7.0F, -1.0F, -17.5F, 2.0F, 4.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(7.0F, -1.0F, -17.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(5.0F, -1.0F, -17.5F, 2.0F, 4.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(5.0F, 0.0F, -20.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(166, 211).addBox(-7.0F, 0.0F, -20.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			unknown_bone_r11 = new ModelRenderer(this);
			unknown_bone_r11.setRotationPoint(0.0F, 16.0F, 13.5F);
			Head.addChild(unknown_bone_r11);
			setRotationAngle(unknown_bone_r11, 0.0F, -0.6981F, 0.0F);
			unknown_bone_r11.setTextureOffset(24, 217).addBox(-31.7484F, -16.0F, -26.738F, 2.0F, 3.0F, 5.0F, 0.0F, false);
			unknown_bone_r11.setTextureOffset(21, 212).addBox(-18.3294F, -16.0F, -34.0816F, 2.0F, 3.0F, 5.0F, 0.0F, false);
			unknown_bone_r12 = new ModelRenderer(this);
			unknown_bone_r12.setRotationPoint(0.0F, 16.0F, 13.5F);
			Head.addChild(unknown_bone_r12);
			setRotationAngle(unknown_bone_r12, 0.0F, 0.7854F, 0.0F);
			unknown_bone_r12.setTextureOffset(20, 208).addBox(19.1629F, -16.0F, -31.636F, 2.0F, 3.0F, 4.0F, 0.0F, false);
			unknown_bone_r12.setTextureOffset(32, 225).addBox(30.4767F, -16.0F, -23.1508F, 2.0F, 3.0F, 4.0F, 0.0F, false);
			unknown_bone_r13 = new ModelRenderer(this);
			unknown_bone_r13.setRotationPoint(0.0F, 16.0F, 13.5F);
			Head.addChild(unknown_bone_r13);
			setRotationAngle(unknown_bone_r13, 0.6109F, 0.0F, 0.0F);
			unknown_bone_r13.setTextureOffset(221, 13).addBox(-2.0F, -21.9256F, -17.2492F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			unknown_bone.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
