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

import net.mcreator.narutounleashed.entity.SasoriOutOfShellEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SasoriOutOfShellRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SasoriOutOfShellEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsasori1(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/sasori1.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelsasori1 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftLeg;
		private final ModelRenderer leftArm;
		private final ModelRenderer rightArm;

		public Modelsasori1() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(22, 19).addBox(-4.0F, 0.0F, 1.0F, 8.0F, 12.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 37).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 7.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(20, 18).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 5.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(20, 17).addBox(-4.0F, 0.0F, -2.0F, 1.0F, 12.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(20, 17).addBox(3.0F, 0.0F, -2.0F, 1.0F, 12.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-8.0F, 3.0F, 2.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(2.0F, 3.0F, 2.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(8.0F, 3.0F, 3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-14.0F, 3.0F, 3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-14.0F, 4.0F, 4.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-14.0F, -1.0F, 4.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-11.0F, 2.0F, 4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(8.0F, 2.0F, 4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(2.0F, 3.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(5.0F, 2.0F, 4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(14.0F, 2.0F, 4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(11.0F, 0.0F, 4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(11.0F, 4.0F, 4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(11.0F, -3.0F, 4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(11.0F, 7.0F, 4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(11.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(12.0F, 10.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-17.0F, 2.0F, 4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-8.0F, 2.0F, 4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(17.0F, 2.0F, 4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(20.0F, 2.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-5.0F, 3.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-20.0F, 2.0F, 4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 40).addBox(-23.0F, 2.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-14.0F, 12.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-14.0F, 8.0F, 4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-13.0F, -5.0F, 4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-12.0F, -9.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			rightLeg.setTextureOffset(0, 16).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			leftLeg.setTextureOffset(16, 48).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
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
