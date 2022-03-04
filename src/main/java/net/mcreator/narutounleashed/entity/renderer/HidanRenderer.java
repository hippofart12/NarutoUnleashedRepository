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

import net.mcreator.narutounleashed.entity.HidanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HidanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HidanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelhidan(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/hidan.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelhidan extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftleg;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;

		public Modelhidan() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(3, 39).addBox(-7.0F, 18.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(14, 40).addBox(-6.0F, 15.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(1, 48).addBox(5.0F, 15.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(14, 36).addBox(4.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(14, 53).addBox(-5.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(15, 48).addBox(-6.0F, 18.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(15, 44).addBox(4.0F, 18.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(7, 48).addBox(4.0F, 18.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(6, 51).addBox(-6.0F, 18.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(18, 45).addBox(-5.0F, 15.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 50).addBox(-5.0F, 15.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(11, 49).addBox(4.0F, 15.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(17, 44).addBox(4.0F, 15.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(2, 45).addBox(6.0F, 18.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(14, 44).addBox(-4.0F, 12.0F, 2.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 52).addBox(-4.0F, 12.0F, -3.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(22, 23).addBox(-4.0F, 15.0F, 3.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(17, 26).addBox(-5.0F, 18.0F, 4.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 58).addBox(-5.0F, 18.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 53).addBox(1.0F, 18.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 52).addBox(-4.0F, 15.0F, -4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 53).addBox(0.0F, 15.0F, -4.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			rightleg.setTextureOffset(0, 16).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(1.9F, 12.0F, 0.0F);
			leftleg.setTextureOffset(0, 16).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftarm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(52, 61).addBox(-1.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(8, 54).addBox(-1.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(8, 54).addBox(-1.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(52, 61).addBox(-1.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(54, 59).addBox(3.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(5, 47).addBox(3.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightarm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(47, 42).addBox(-1.0F, 6.0F, -19.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(47, 42).addBox(-1.0F, 6.0F, -24.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(47, 42).addBox(-1.0F, 6.0F, -29.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(52, 7).addBox(-1.0F, 7.0F, -24.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(51, 4).addBox(-1.0F, 7.0F, -29.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(51, 4).addBox(-1.0F, 7.0F, -30.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(52, 7).addBox(-1.0F, 7.0F, -19.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 39).addBox(-1.0F, 10.0F, -19.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 39).addBox(-1.0F, 10.0F, -24.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 39).addBox(-1.0F, 10.0F, -29.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 39).addBox(-1.0F, 12.0F, -18.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 39).addBox(-1.0F, 12.0F, -23.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 39).addBox(-1.0F, 12.0F, -28.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 39).addBox(-1.0F, 15.0F, -27.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 39).addBox(-1.0F, 15.0F, -22.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 39).addBox(-1.0F, 18.0F, -26.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 39).addBox(-1.0F, 15.0F, -17.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 42).addBox(-1.0F, 17.0F, -21.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 42).addBox(-1.0F, 20.0F, -25.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 42).addBox(-1.0F, 19.0F, -27.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 42).addBox(-1.0F, 16.0F, -28.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(58, 42).addBox(-1.0F, 14.0F, -29.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(47, 42).addBox(-1.0F, 8.0F, -27.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			rightarm.setTextureOffset(47, 42).addBox(-1.0F, 8.0F, -22.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			rightarm.setTextureOffset(47, 42).addBox(-1.0F, 8.0F, -17.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			rightarm.setTextureOffset(57, 32).addBox(-1.0F, 8.0F, -8.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(57, 32).addBox(-1.0F, 8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(57, 32).addBox(-1.0F, 8.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(57, 32).addBox(-1.0F, 8.0F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(57, 32).addBox(-1.0F, 9.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(6, 46).addBox(-3.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(6, 46).addBox(-3.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(50, 62).addBox(-3.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(50, 62).addBox(-3.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(50, 62).addBox(-4.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 51).addBox(-4.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
