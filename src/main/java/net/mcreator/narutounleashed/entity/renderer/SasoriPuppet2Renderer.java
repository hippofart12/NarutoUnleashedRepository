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

import net.mcreator.narutounleashed.entity.SasoriPuppet2Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SasoriPuppet2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SasoriPuppet2Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmarionete(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/marionete.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelmarionete extends EntityModel<Entity> {
		private final ModelRenderer rightleg;
		private final ModelRenderer body;
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
		private final ModelRenderer leftleg;

		public Modelmarionete() {
			textureWidth = 64;
			textureHeight = 64;
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(22, 50).addBox(1.0F, 9.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(22, 50).addBox(-3.0F, 9.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightarm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(22, 50).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-22.0F, 17.0F, -1.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.7854F);
			head_r1.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-18.0F, 20.0F, -1.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.6545F);
			head_r2.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(12.0F, 24.0F, -1.0F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, -0.1745F);
			head_r3.setTextureOffset(10, 0).addBox(-4.0F, -33.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(16.0F, 22.0F, -1.0F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.3491F);
			head_r4.setTextureOffset(10, 0).addBox(-4.0F, -33.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(12.0F, 22.0F, -1.0F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 0.0F, 0.0F, -0.2618F);
			head_r5.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(25.0F, 15.0F, 1.0F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, -0.6981F);
			head_r6.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(-20.0F, 19.0F, 1.0F);
			head.addChild(head_r7);
			setRotationAngle(head_r7, 0.0F, 0.0F, 0.6981F);
			head_r7.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r8 = new ModelRenderer(this);
			head_r8.setRotationPoint(16.0F, 26.0F, 3.0F);
			head.addChild(head_r8);
			setRotationAngle(head_r8, 0.0F, 0.0F, -0.2618F);
			head_r8.setTextureOffset(22, 7).addBox(-4.0F, -35.0F, -4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			head_r9 = new ModelRenderer(this);
			head_r9.setRotationPoint(-9.0F, 27.0F, 3.0F);
			head.addChild(head_r9);
			setRotationAngle(head_r9, 0.0F, 0.0F, 0.2618F);
			head_r9.setTextureOffset(10, 0).addBox(-4.0F, -35.0F, -4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			head_r10 = new ModelRenderer(this);
			head_r10.setRotationPoint(14.0F, 24.0F, 6.0F);
			head.addChild(head_r10);
			setRotationAngle(head_r10, 0.0F, 0.0F, -0.2182F);
			head_r10.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head_r10.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -6.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head_r11 = new ModelRenderer(this);
			head_r11.setRotationPoint(-7.0F, 26.0F, 6.0F);
			head.addChild(head_r11);
			setRotationAngle(head_r11, 0.0F, 0.0F, 0.2182F);
			head_r11.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head_r11.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -6.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head_r11.setTextureOffset(9, 2).addBox(-4.0F, -32.0F, -5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r11.setTextureOffset(17, 9).addBox(-4.0F, -32.0F, -3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r11.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -8.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r12 = new ModelRenderer(this);
			head_r12.setRotationPoint(14.0F, 25.0F, 5.0F);
			head.addChild(head_r12);
			setRotationAngle(head_r12, 0.0F, 0.0F, -0.2182F);
			head_r12.setTextureOffset(9, 2).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r12.setTextureOffset(17, 9).addBox(-4.0F, -32.0F, -2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r12.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -7.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r13 = new ModelRenderer(this);
			head_r13.setRotationPoint(17.0F, 22.0F, 1.0F);
			head.addChild(head_r13);
			setRotationAngle(head_r13, 0.0F, 0.0F, -0.3491F);
			head_r13.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r14 = new ModelRenderer(this);
			head_r14.setRotationPoint(-11.0F, 24.0F, 1.0F);
			head.addChild(head_r14);
			setRotationAngle(head_r14, 0.0F, 0.0F, 0.3491F);
			head_r14.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r15 = new ModelRenderer(this);
			head_r15.setRotationPoint(-12.0F, 22.0F, -1.0F);
			head.addChild(head_r15);
			setRotationAngle(head_r15, 0.0F, 0.0F, 0.48F);
			head_r15.setTextureOffset(10, 0).addBox(-4.0F, -32.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head_r16 = new ModelRenderer(this);
			head_r16.setRotationPoint(-6.0F, 24.0F, 3.0F);
			head.addChild(head_r16);
			setRotationAngle(head_r16, 0.0873F, 0.0F, 0.0F);
			head_r16.setTextureOffset(18, 8).addBox(3.0F, -32.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head_r16.setTextureOffset(28, 8).addBox(5.0F, -32.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head_r16.setTextureOffset(21, 8).addBox(7.0F, -32.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head_r16.setTextureOffset(10, 0).addBox(9.0F, -32.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head_r17 = new ModelRenderer(this);
			head_r17.setRotationPoint(-5.0F, 24.0F, 6.0F);
			head.addChild(head_r17);
			setRotationAngle(head_r17, 0.1745F, 0.0F, 0.0F);
			head_r17.setTextureOffset(16, 9).addBox(3.0F, -32.0F, 3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head_r17.setTextureOffset(8, 1).addBox(5.0F, -32.0F, 3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head_r17.setTextureOffset(0, 9).addBox(7.0F, -32.0F, 3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftarm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(22, 50).addBox(0.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(1.9F, 12.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
