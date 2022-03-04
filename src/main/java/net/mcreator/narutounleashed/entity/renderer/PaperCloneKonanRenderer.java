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

import net.mcreator.narutounleashed.entity.PaperCloneKonanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PaperCloneKonanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PaperCloneKonanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPaperClonekonan(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/konan_-_with_wings.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelPaperClonekonan extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftleg;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;

		public ModelPaperClonekonan() {
			textureWidth = 128;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(69, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(74, 7).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-7.0F, 18.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-6.0F, 15.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(5.0F, 15.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(4.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-5.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-6.0F, 18.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(4.0F, 18.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(4.0F, 18.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-6.0F, 18.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-5.0F, 15.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-5.0F, 15.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(4.0F, 15.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(4.0F, 15.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(6.0F, 18.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-4.0F, 12.0F, 2.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-4.0F, 12.0F, -3.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-4.0F, 15.0F, 3.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-5.0F, 18.0F, 4.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-5.0F, 18.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(1.0F, 18.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(-4.0F, 15.0F, -4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(74, 7).addBox(0.0F, 15.0F, -4.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			rightleg.setTextureOffset(75, 42).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(1.9F, 12.0F, 0.0F);
			leftleg.setTextureOffset(75, 39).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftarm.setTextureOffset(112, 10).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(112, 10).addBox(-1.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(112, 10).addBox(-1.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(112, 10).addBox(-1.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(112, 10).addBox(-1.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(112, 10).addBox(3.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(112, 10).addBox(3.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightarm.setTextureOffset(86, 9).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(86, 9).addBox(-3.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(86, 9).addBox(-3.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(86, 9).addBox(-3.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(86, 9).addBox(-3.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(86, 9).addBox(-4.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(86, 9).addBox(-4.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
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
