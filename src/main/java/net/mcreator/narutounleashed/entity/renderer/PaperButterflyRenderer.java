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

import net.mcreator.narutounleashed.entity.PaperButterflyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PaperButterflyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PaperButterflyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPaperButterFly(), 0f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/paper_butterfly.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelPaperButterFly extends EntityModel<Entity> {
		private final ModelRenderer wing1;
		private final ModelRenderer wing2;
		private final ModelRenderer bb_main;

		public ModelPaperButterFly() {
			textureWidth = 75;
			textureHeight = 64;
			wing1 = new ModelRenderer(this);
			wing1.setRotationPoint(0.0F, 24.0F, 3.0F);
			setRotationAngle(wing1, 0.0F, 0.0F, -0.0873F);
			wing1.setTextureOffset(4, 39).addBox(0.0F, 0.0F, -3.0F, 3.0F, 0.0F, 6.0F, 0.0F, false);
			wing2 = new ModelRenderer(this);
			wing2.setRotationPoint(-1.0F, 24.0F, 3.0F);
			setRotationAngle(wing2, 0.0F, 0.0F, 0.0873F);
			wing2.setTextureOffset(46, 39).addBox(-3.0F, 0.0F, -3.0F, 3.0F, 0.0F, 6.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 57).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			wing1.render(matrixStack, buffer, packedLight, packedOverlay);
			wing2.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.wing1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.wing2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}

}
