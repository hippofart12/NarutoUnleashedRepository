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

import net.mcreator.narutounleashed.entity.NinjaSnowmanSummonedEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NinjaSnowmanSummonedRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NinjaSnowmanSummonedEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelNinjasnowgolem(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/snow_golem.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelNinjasnowgolem extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer arm1;
		private final ModelRenderer arm2;
		private final ModelRenderer piece1;
		private final ModelRenderer piece2;

		public ModelNinjasnowgolem() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 4.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, true);
			arm1 = new ModelRenderer(this);
			arm1.setRotationPoint(-5.25F, 7.0F, 0.0F);
			arm1.setTextureOffset(32, 0).addBox(-5.75F, -1.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F, true);
			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(4.25F, 7.25F, 0.0F);
			arm2.setTextureOffset(32, 0).addBox(-5.25F, -1.25F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F, true);
			piece1 = new ModelRenderer(this);
			piece1.setRotationPoint(0.0F, 13.0F, 0.0F);
			piece1.setTextureOffset(0, 16).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, -0.5F, true);
			piece2 = new ModelRenderer(this);
			piece2.setRotationPoint(0.0F, 24.0F, 0.0F);
			piece2.setTextureOffset(0, 36).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, -0.5F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			arm1.render(matrixStack, buffer, packedLight, packedOverlay);
			arm2.render(matrixStack, buffer, packedLight, packedOverlay);
			piece1.render(matrixStack, buffer, packedLight, packedOverlay);
			piece2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.arm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}

}
