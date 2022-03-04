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

import net.mcreator.narutounleashed.entity.FirecircleEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FirecircleRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FirecircleEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelfire_circle(), 0f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/fireball1.png");
					}
				};
			});
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class Modelfire_circle extends EntityModel<Entity> {
		private final ModelRenderer fireball;
		private final ModelRenderer flameball1;
		private final ModelRenderer flameball2;
		private final ModelRenderer flameball3;
		private final ModelRenderer flameball4;
		private final ModelRenderer flameball5;
		private final ModelRenderer flameball6;
		private final ModelRenderer flameball7;
		private final ModelRenderer flameball8;

		public Modelfire_circle() {
			textureWidth = 512;
			textureHeight = 512;
			fireball = new ModelRenderer(this);
			fireball.setRotationPoint(0.0F, 34.25F, 0.0F);
			flameball1 = new ModelRenderer(this);
			flameball1.setRotationPoint(0.0F, -28.0F, 0.0F);
			fireball.addChild(flameball1);
			addBoxHelper(flameball1, 0, 0, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false);
			addBoxHelper(flameball1, 0, 0, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false);
			addBoxHelper(flameball1, 0, 0, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false);
			addBoxHelper(flameball1, 0, 0, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false);
			flameball2 = new ModelRenderer(this);
			flameball2.setRotationPoint(0.0F, -28.0F, 0.0F);
			setRotationAngle(flameball2, 0.0F, 1.5708F, 0.0F);
			fireball.addChild(flameball2);
			addBoxHelper(flameball2, 37, 82, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false);
			addBoxHelper(flameball2, 37, 82, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false);
			addBoxHelper(flameball2, 37, 82, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false);
			addBoxHelper(flameball2, 37, 82, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false);
			flameball3 = new ModelRenderer(this);
			flameball3.setRotationPoint(0.0F, -28.0F, 0.0F);
			setRotationAngle(flameball3, 0.0F, 3.1416F, 0.0F);
			fireball.addChild(flameball3);
			addBoxHelper(flameball3, 175, 84, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false);
			addBoxHelper(flameball3, 175, 84, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false);
			addBoxHelper(flameball3, 175, 84, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false);
			addBoxHelper(flameball3, 175, 84, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false);
			flameball4 = new ModelRenderer(this);
			flameball4.setRotationPoint(0.0F, -28.0F, 0.0F);
			setRotationAngle(flameball4, 0.0F, -1.5708F, 0.0F);
			fireball.addChild(flameball4);
			addBoxHelper(flameball4, 197, 45, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false);
			addBoxHelper(flameball4, 197, 45, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false);
			addBoxHelper(flameball4, 197, 45, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false);
			addBoxHelper(flameball4, 197, 45, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false);
			flameball5 = new ModelRenderer(this);
			flameball5.setRotationPoint(0.0F, -28.0F, 0.0F);
			setRotationAngle(flameball5, 0.0F, -0.7854F, 0.0F);
			fireball.addChild(flameball5);
			addBoxHelper(flameball5, 217, 353, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false);
			addBoxHelper(flameball5, 217, 353, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false);
			addBoxHelper(flameball5, 217, 353, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false);
			addBoxHelper(flameball5, 217, 353, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false);
			flameball6 = new ModelRenderer(this);
			flameball6.setRotationPoint(0.0F, -28.0F, 0.0F);
			setRotationAngle(flameball6, 0.0F, 0.7854F, 0.0F);
			fireball.addChild(flameball6);
			addBoxHelper(flameball6, 79, 294, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false);
			addBoxHelper(flameball6, 79, 294, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false);
			addBoxHelper(flameball6, 79, 294, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false);
			addBoxHelper(flameball6, 79, 294, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false);
			flameball7 = new ModelRenderer(this);
			flameball7.setRotationPoint(0.0F, -28.0F, 0.0F);
			setRotationAngle(flameball7, 0.0F, 2.3562F, 0.0F);
			fireball.addChild(flameball7);
			addBoxHelper(flameball7, 52, 235, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false);
			addBoxHelper(flameball7, 52, 235, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false);
			addBoxHelper(flameball7, 52, 235, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false);
			addBoxHelper(flameball7, 52, 235, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false);
			flameball8 = new ModelRenderer(this);
			flameball8.setRotationPoint(0.0F, -28.0F, 0.0F);
			setRotationAngle(flameball8, 0.0F, -2.3562F, 0.0F);
			fireball.addChild(flameball8);
			addBoxHelper(flameball8, 384, 26, -8.0F, -8.0F, 48.0F, 16, 16, 16, 0.0F, false);
			addBoxHelper(flameball8, 384, 26, -8.5F, -7.0F, 49.0F, 17, 14, 14, 0.0F, false);
			addBoxHelper(flameball8, 384, 26, -7.0F, -7.0F, 47.5F, 14, 14, 17, 0.0F, false);
			addBoxHelper(flameball8, 384, 26, -7.0F, -8.5F, 49.0F, 14, 17, 14, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			fireball.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.fireball.rotateAngleY = f2 / 20.f;
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
