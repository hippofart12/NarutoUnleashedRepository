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

import net.mcreator.narutounleashed.entity.ZetsuCloneEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ZetsuCloneRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ZetsuCloneEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelzetsub(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/zetsub.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelzetsub extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer waist;
		private final ModelRenderer rightArm;
		private final ModelRenderer leftArm;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftLeg;
		private final ModelRenderer head;

		public Modelzetsub() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			waist = new ModelRenderer(this);
			waist.setRotationPoint(0.0F, 12.0F, 0.0F);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightArm.setTextureOffset(40, 16).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, true);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, true);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			rightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			leftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(2, 0).addBox(-2.0F, -8.0F, -4.0F, 6.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(2, 0).addBox(-3.0F, -6.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 8).addBox(-3.0F, -2.0F, -4.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 8).addBox(-3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 8).addBox(-3.0F, -4.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 8).addBox(-3.0F, -7.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 8).addBox(-4.0F, -6.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 8).addBox(-4.0F, -5.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(15, 8).addBox(1.0F, -9.0F, 1.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(16, 8).addBox(1.0F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(16, 8).addBox(-1.0F, -9.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(16, 8).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(17, 8).addBox(0.0F, -9.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 8).addBox(0.0F, -9.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 9).addBox(0.0F, -9.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 8).addBox(1.0F, -9.0F, -4.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(20, 8).addBox(1.0F, -8.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(19, 8).addBox(0.0F, -8.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 0).addBox(3.0F, -8.0F, -5.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 0).addBox(4.0F, -8.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 1).addBox(4.0F, -8.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 2).addBox(4.0F, -8.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 3).addBox(4.0F, -8.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 2).addBox(4.0F, -8.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 0).addBox(4.0F, -8.0F, 1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 1).addBox(4.0F, -8.0F, 2.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 2).addBox(4.0F, -8.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 2).addBox(3.0F, -8.0F, 4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 0).addBox(2.0F, -8.0F, 4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 1).addBox(1.0F, -8.0F, 4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 0).addBox(0.0F, -8.0F, 4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 0).addBox(-1.0F, -7.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 0).addBox(-1.0F, -4.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			waist.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
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
