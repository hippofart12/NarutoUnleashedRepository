package net.mcreator.narutounleashed.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.narutounleashed.entity.Pain6Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Pain6Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Pain6Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelpain6(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/pain6.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelpain6 extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;
		private final ModelRenderer body_r4;
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer leftArm;
		private final ModelRenderer leftArm_r1;
		private final ModelRenderer leftArm_r2;
		private final ModelRenderer leftArm_r3;
		private final ModelRenderer leftLeg;
		private final ModelRenderer leftLeg_r1;
		private final ModelRenderer rightArm;
		private final ModelRenderer rightArm_r1;
		private final ModelRenderer rightArm_r2;
		private final ModelRenderer rightArm_r3;
		private final ModelRenderer rightItem;
		private final ModelRenderer rightLeg;
		private final ModelRenderer rightLeg_r1;
		private final ModelRenderer bone;

		public Modelpain6() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(7.0F, 24.0F, 5.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.4363F, 0.0F, 0.0F);
			body_r1.setTextureOffset(94, 115).addBox(-4.0F, -13.0F, 2.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
			body_r1.setTextureOffset(50, 84).addBox(-10.0F, -13.0F, 12.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body_r1.setTextureOffset(56, 64).addBox(-8.0F, -13.0F, 12.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r1.setTextureOffset(44, 63).addBox(-5.0F, -13.0F, 12.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body_r1.setTextureOffset(42, 79).addBox(-10.0F, -13.0F, 8.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body_r1.setTextureOffset(50, 66).addBox(-8.0F, -13.0F, 8.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r1.setTextureOffset(32, 74).addBox(-5.0F, -13.0F, 8.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body_r1.setTextureOffset(64, 123).addBox(-10.0F, -13.0F, 2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body_r1.setTextureOffset(65, 36).addBox(-8.0F, -13.0F, 2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			body_r1.setTextureOffset(67, 78).addBox(-5.0F, -13.0F, 2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body_r1.setTextureOffset(87, 65).addBox(-6.0F, -13.0F, 2.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
			body_r1.setTextureOffset(80, 115).addBox(-9.0F, -13.0F, 2.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
			body_r1.setTextureOffset(54, 115).addBox(-11.0F, -13.0F, 2.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
			body_r1.setTextureOffset(0, 33).addBox(-11.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(2.0F, -33.0F, 13.0F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 2.9671F, 0.0F, 0.0F);
			body_r2.setTextureOffset(46, 86).addBox(-3.0F, -13.0F, 19.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(28, 100).addBox(-4.0F, -13.0F, 18.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(5, 78).addBox(-5.0F, -13.0F, 17.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(13, 64).addBox(0.0F, -13.0F, 10.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(69, 18).addBox(-3.0F, -13.0F, 10.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(109, 62).addBox(-5.0F, -13.0F, 10.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(51, 84).addBox(0.0F, -13.0F, 14.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(73, 15).addBox(-3.0F, -13.0F, 14.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(92, 53).addBox(-5.0F, -13.0F, 14.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(8, 17).addBox(-5.0F, -13.0F, 10.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(30, 105).addBox(-6.0F, -13.0F, 8.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			body_r2.setTextureOffset(101, 96).addBox(-4.0F, -13.0F, 8.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			body_r2.setTextureOffset(54, 98).addBox(-1.0F, -13.0F, 8.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			body_r2.setTextureOffset(2, 114).addBox(1.0F, -13.0F, 8.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			body_r2.setTextureOffset(45, 121).addBox(-6.0F, -13.0F, 2.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(2.0F, -13.0F, 28.0F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, 2.0944F, 0.0F, 0.0F);
			body_r3.setTextureOffset(82, 112).addBox(-6.0F, -13.0F, 2.0F, 8.0F, 1.0F, 15.0F, 0.0F, false);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(2.0F, 12.0F, 24.0F);
			body.addChild(body_r4);
			setRotationAngle(body_r4, 1.309F, 0.0F, 0.0F);
			body_r4.setTextureOffset(0, 111).addBox(-6.0F, -13.0F, 2.0F, 8.0F, 1.0F, 16.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 2.75F, -4.5F);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, 24.25F, 1.5F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0F);
			head_r1.setTextureOffset(0, 0).addBox(2.0F, -32.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 0).addBox(-3.0F, -32.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(32, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 2).addBox(4.0F, -32.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 2).addBox(-5.0F, -32.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 2).addBox(4.0F, -32.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 2).addBox(-5.0F, -32.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 2).addBox(4.0F, -32.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 2).addBox(-5.0F, -32.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(12, 0).addBox(-4.0F, -32.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(12, 0).addBox(-2.0F, -32.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(12, 0).addBox(1.0F, -32.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(12, 0).addBox(3.0F, -32.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftArm_r1 = new ModelRenderer(this);
			leftArm_r1.setRotationPoint(0.0F, 0.0F, -3.25F);
			leftArm.addChild(leftArm_r1);
			setRotationAngle(leftArm_r1, 0.0F, -1.4835F, -1.6581F);
			leftArm_r1.setTextureOffset(0, 0).addBox(-1.8161F, -1.0004F, -1.4959F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			leftArm_r2 = new ModelRenderer(this);
			leftArm_r2.setRotationPoint(0.25F, 1.25F, -2.25F);
			leftArm.addChild(leftArm_r2);
			setRotationAngle(leftArm_r2, -0.3491F, -2.5307F, -0.5236F);
			leftArm_r2.setTextureOffset(0, 0).addBox(-2.3789F, -1.5335F, -1.4987F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			leftArm_r3 = new ModelRenderer(this);
			leftArm_r3.setRotationPoint(0.5F, 2.5F, -5.25F);
			leftArm.addChild(leftArm_r3);
			setRotationAngle(leftArm_r3, 0.0F, 0.1745F, -0.0873F);
			leftArm_r3.setTextureOffset(0, 0).addBox(-1.5827F, -1.8908F, -1.7149F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			leftLeg.setTextureOffset(12, 2).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftLeg_r1 = new ModelRenderer(this);
			leftLeg_r1.setRotationPoint(-0.9F, 12.0F, 0.0F);
			leftLeg.addChild(leftLeg_r1);
			setRotationAngle(leftLeg_r1, 0.0F, 0.0F, -0.0873F);
			leftLeg_r1.setTextureOffset(40, 40).addBox(-0.1F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightArm_r1 = new ModelRenderer(this);
			rightArm_r1.setRotationPoint(0.75F, 1.25F, -3.25F);
			rightArm.addChild(rightArm_r1);
			setRotationAngle(rightArm_r1, -0.6981F, 1.5708F, 0.9599F);
			rightArm_r1.setTextureOffset(0, 0).addBox(-2.2499F, -0.1443F, -2.173F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightArm_r2 = new ModelRenderer(this);
			rightArm_r2.setRotationPoint(0.25F, 1.5F, -2.5F);
			rightArm.addChild(rightArm_r2);
			setRotationAngle(rightArm_r2, -0.4363F, 2.3562F, 0.3491F);
			rightArm_r2.setTextureOffset(0, 0).addBox(-1.3904F, -0.8545F, -2.4017F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightArm_r3 = new ModelRenderer(this);
			rightArm_r3.setRotationPoint(0.0F, 1.25F, -5.25F);
			rightArm.addChild(rightArm_r3);
			setRotationAngle(rightArm_r3, 0.0F, -0.1745F, 0.0873F);
			rightArm_r3.setTextureOffset(0, 0).addBox(-2.8005F, -0.602F, -1.6474F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightItem = new ModelRenderer(this);
			rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
			rightArm.addChild(rightItem);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			rightLeg_r1 = new ModelRenderer(this);
			rightLeg_r1.setRotationPoint(0.9F, 12.0F, 0.0F);
			rightLeg.addChild(rightLeg_r1);
			setRotationAngle(rightLeg_r1, 0.0F, 0.0F, 0.0873F);
			rightLeg_r1.setTextureOffset(24, 40).addBox(-3.9F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(11.0F, 19.0F, 0.0F);
			setRotationAngle(bone, 0.0F, 0.0F, -0.6981F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.leftArm_r2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftArm_r3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftArm_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.rightArm_r2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.rightArm_r1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightArm_r3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
