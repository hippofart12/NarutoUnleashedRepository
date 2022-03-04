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

import net.mcreator.narutounleashed.entity.Kakazu2Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Kakazu2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Kakazu2Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelkakuzo2(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/kakuzo1.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelkakuzo2 extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer rightArm;
		private final ModelRenderer rightItem;
		private final ModelRenderer leftArm;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftLeg;
		private final ModelRenderer bone3;
		private final ModelRenderer bone2;
		private final ModelRenderer bone4;
		private final ModelRenderer bone5;

		public Modelkakuzo2() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(body, 0.2618F, 0.0F, 0.0F);
			body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -6.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, -5.0F);
			setRotationAngle(head, 0.1309F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -6.7059F, -3.1704F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -6.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightItem = new ModelRenderer(this);
			rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
			rightArm.addChild(rightItem);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -6.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			rightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			leftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone3, 0.4363F, 0.0F, 0.0F);
			bone3.setTextureOffset(20, 51).addBox(-1.0F, -12.0F, 7.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);
			bone3.setTextureOffset(37, 59).addBox(-4.0F, -12.0F, 8.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(34, 59).addBox(-4.0F, -12.0F, 10.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(35, 56).addBox(-4.0F, -12.0F, 12.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(29, 42).addBox(-4.0F, -12.0F, 14.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(29, 43).addBox(-4.0F, -12.0F, 16.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(30, 42).addBox(-4.0F, -12.0F, 18.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone2, 1.4835F, 0.0F, 0.0F);
			bone2.setTextureOffset(21, 51).addBox(-1.0F, 10.0F, 19.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);
			bone2.setTextureOffset(29, 43).addBox(-4.0F, 10.0F, 20.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(32, 57).addBox(-4.0F, 10.0F, 22.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(31, 42).addBox(-4.0F, 10.0F, 24.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(30, 42).addBox(-4.0F, 10.0F, 26.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(32, 57).addBox(-4.0F, 10.0F, 28.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(30, 42).addBox(-4.0F, 10.0F, 30.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone4, 2.0071F, 0.0F, 0.0F);
			bone4.setTextureOffset(20, 51).addBox(-1.0F, 24.0F, 21.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);
			bone4.setTextureOffset(29, 41).addBox(-4.0F, 24.0F, 22.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone4.setTextureOffset(27, 43).addBox(-4.0F, 24.0F, 24.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone4.setTextureOffset(25, 39).addBox(-4.0F, 24.0F, 26.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone4.setTextureOffset(31, 38).addBox(-4.0F, 24.0F, 28.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone4.setTextureOffset(30, 41).addBox(-4.0F, 24.0F, 30.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone4.setTextureOffset(29, 45).addBox(-4.0F, 24.0F, 32.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone5, 0.6981F, 0.0F, 0.0F);
			bone5.setTextureOffset(52, 6).addBox(-4.0F, -26.0F, 32.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone5.setTextureOffset(52, 6).addBox(-3.0F, -27.0F, 32.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone5.setTextureOffset(52, 6).addBox(-2.0F, -28.0F, 32.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone5.setTextureOffset(52, 6).addBox(-1.0F, -29.0F, 32.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			bone3.render(matrixStack, buffer, packedLight, packedOverlay);
			bone2.render(matrixStack, buffer, packedLight, packedOverlay);
			bone4.render(matrixStack, buffer, packedLight, packedOverlay);
			bone5.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
