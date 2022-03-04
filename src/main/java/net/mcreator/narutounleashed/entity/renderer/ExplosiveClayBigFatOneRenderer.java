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

import net.mcreator.narutounleashed.entity.ExplosiveClayBigFatOneEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ExplosiveClayBigFatOneRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ExplosiveClayBigFatOneEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeleclaybigfo(), 1.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/explobigfatone.png");
					}
				};
			});
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class Modeleclaybigfo extends EntityModel<Entity> {
		private final ModelRenderer BigFatOne;

		public Modeleclaybigfo() {
			textureWidth = 512;
			textureHeight = 512;
			BigFatOne = new ModelRenderer(this);
			BigFatOne.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(BigFatOne, 17, 74, -80.0F, -80.0F, 0.0F, 80, 80, 80, 0.0F, false);
			addBoxHelper(BigFatOne, 17, 42, -70.0F, -140.0F, 10.0F, 60, 60, 60, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, -10.0F, -120.0F, 40.0F, 60, 30, 5, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, -130.0F, -120.0F, 40.0F, 60, 30, 5, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, -175.0F, -130.0F, 40.0F, 45, 50, 5, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, 50.0F, -130.0F, 40.0F, 45, 50, 5, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, 95.0F, -130.0F, 40.0F, 45, 15, 5, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, -220.0F, -130.0F, 40.0F, 45, 15, 5, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, -220.0F, -95.0F, 40.0F, 45, 15, 5, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, -220.0F, -112.25F, 40.0F, 45, 15, 5, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, 95.0F, -112.5F, 40.0F, 45, 15, 5, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, 95.0F, -95.0F, 40.0F, 45, 15, 5, 0.0F, false);
			addBoxHelper(BigFatOne, 0, 0, -60.0F, -190.0F, 20.0F, 40, 50, 40, 0.0F, false);
			addBoxHelper(BigFatOne, 142, 71, -55.0F, -230.0F, 25.0F, 30, 40, 30, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			BigFatOne.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

		}
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}
