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

import net.mcreator.narutounleashed.entity.RockBoulderEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RockBoulderRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RockBoulderEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRockBoulder(), 0.6f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/rock.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRockBoulder extends EntityModel<Entity> {
		private final ModelRenderer bb_main;

		public ModelRockBoulder() {
			textureWidth = 100;
			textureHeight = 100;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(4, 23).addBox(-12.0F, -24.0F, -12.0F, 24.0F, 24.0F, 24.0F, 0.0F, false);
			bb_main.setTextureOffset(6, 36).addBox(12.0F, -22.0F, -10.0F, 3.0F, 20.0F, 20.0F, 0.0F, false);
			bb_main.setTextureOffset(10, 26).addBox(-15.0F, -22.0F, -10.0F, 3.0F, 20.0F, 20.0F, 0.0F, false);
			bb_main.setTextureOffset(47, 2).addBox(-10.0F, -22.0F, -15.0F, 20.0F, 20.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(36, 9).addBox(-10.0F, -22.0F, 12.0F, 20.0F, 20.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(9, 11).addBox(-10.0F, 0.0F, -10.0F, 20.0F, 3.0F, 20.0F, 0.0F, false);
			bb_main.setTextureOffset(20, 24).addBox(-10.0F, -27.0F, -10.0F, 20.0F, 3.0F, 20.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

		}
	}

}
