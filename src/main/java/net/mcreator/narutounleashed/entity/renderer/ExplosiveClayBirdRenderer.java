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

import net.mcreator.narutounleashed.entity.ExplosiveClayBirdEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ExplosiveClayBirdRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ExplosiveClayBirdEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelECB(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/explobird.png");
					}
				};
			});
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class ModelECB extends EntityModel<Entity> {
		private final ModelRenderer ExploBird;
		private final ModelRenderer Body;
		private final ModelRenderer Foot;
		private final ModelRenderer toe1;
		private final ModelRenderer toe3;
		private final ModelRenderer toe2;
		private final ModelRenderer Foot2;
		private final ModelRenderer toe4;
		private final ModelRenderer toe5;
		private final ModelRenderer toe6;
		private final ModelRenderer Wing1;
		private final ModelRenderer Wing2;
		private final ModelRenderer Head;
		private final ModelRenderer flap1;
		private final ModelRenderer flap3;
		private final ModelRenderer flap2;

		public ModelECB() {
			textureWidth = 128;
			textureHeight = 128;
			ExploBird = new ModelRenderer(this);
			ExploBird.setRotationPoint(0.0F, 24.0F, 0.0F);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			ExploBird.addChild(Body);
			addBoxHelper(Body, 0, 0, -4.5F, -9.0F, -6.0F, 10, 6, 13, 0.0F, false);
			addBoxHelper(Body, 20, 47, -3.5F, -8.25F, 7.0F, 8, 5, 1, 0.0F, false);
			addBoxHelper(Body, 28, 21, 0.0F, -10.75F, 8.0F, 1, 3, 10, 0.0F, false);
			addBoxHelper(Body, 42, 42, 0.0F, -7.75F, 8.0F, 1, 3, 8, 0.0F, false);
			addBoxHelper(Body, 0, 0, 0.0F, -4.75F, 8.0F, 1, 2, 5, 0.0F, false);
			addBoxHelper(Body, 33, 0, 0.0F, -11.75F, 9.0F, 1, 1, 10, 0.0F, false);
			addBoxHelper(Body, 40, 21, 0.0F, -12.75F, 11.0F, 1, 1, 9, 0.0F, false);
			addBoxHelper(Body, 30, 34, 0.0F, -14.75F, 12.0F, 1, 2, 9, 0.0F, false);
			addBoxHelper(Body, 37, 11, 0.0F, -15.75F, 14.0F, 1, 1, 9, 0.0F, false);
			addBoxHelper(Body, 32, 47, 0.0F, -16.75F, 16.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(Body, 0, 19, -3.5F, -9.25F, -5.0F, 8, 1, 11, 0.0F, false);
			addBoxHelper(Body, 0, 45, -2.5F, -11.0F, -10.0F, 6, 6, 4, 0.0F, false);
			Foot = new ModelRenderer(this);
			Foot.setRotationPoint(4.0F, -3.0F, 1.5F);
			Body.addChild(Foot);
			addBoxHelper(Foot, 52, 42, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F, false);
			addBoxHelper(Foot, 4, 28, -0.5F, 2.0F, 1.5F, 1, 1, 1, 0.0F, false);
			toe1 = new ModelRenderer(this);
			toe1.setRotationPoint(0.0F, 2.25F, -1.5F);
			Foot.addChild(toe1);
			addBoxHelper(toe1, 17, 53, -0.5F, -0.25F, -3.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(toe1, 31, 28, -0.5F, -0.25F, -4.0F, 1, 1, 1, 0.0F, false);
			toe3 = new ModelRenderer(this);
			toe3.setRotationPoint(-1.0F, 2.25F, -1.25F);
			setRotationAngle(toe3, 0.0F, 0.2618F, 0.0F);
			Foot.addChild(toe3);
			addBoxHelper(toe3, 40, 45, -0.5F, -0.25F, -3.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(toe3, 27, 28, -0.5F, -0.25F, -4.0F, 1, 1, 1, 0.0F, false);
			toe2 = new ModelRenderer(this);
			toe2.setRotationPoint(1.0F, 2.25F, -1.25F);
			setRotationAngle(toe2, 0.0F, -0.1745F, 0.0F);
			Foot.addChild(toe2);
			addBoxHelper(toe2, 51, 25, -0.5F, -0.25F, -3.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(toe2, 23, 31, -0.5F, -0.25F, -4.0F, 1, 1, 1, 0.0F, false);
			Foot2 = new ModelRenderer(this);
			Foot2.setRotationPoint(-3.0F, -3.0F, 1.5F);
			Body.addChild(Foot2);
			addBoxHelper(Foot2, 0, 7, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F, false);
			addBoxHelper(Foot2, 0, 28, -0.5F, 2.0F, 1.5F, 1, 1, 1, 0.0F, false);
			toe4 = new ModelRenderer(this);
			toe4.setRotationPoint(0.0F, 2.25F, -1.5F);
			Foot2.addChild(toe4);
			addBoxHelper(toe4, 40, 25, -0.5F, -0.25F, -3.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(toe4, 7, 27, -0.5F, -0.25F, -4.0F, 1, 1, 1, 0.0F, false);
			toe5 = new ModelRenderer(this);
			toe5.setRotationPoint(-1.0F, 2.25F, -1.25F);
			setRotationAngle(toe5, 0.0F, 0.2618F, 0.0F);
			Foot2.addChild(toe5);
			addBoxHelper(toe5, 40, 21, -0.5F, -0.25F, -3.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(toe5, 5, 19, -0.5F, -0.25F, -4.0F, 1, 1, 1, 0.0F, false);
			toe6 = new ModelRenderer(this);
			toe6.setRotationPoint(1.0F, 2.25F, -1.25F);
			setRotationAngle(toe6, 0.0F, -0.1745F, 0.0F);
			Foot2.addChild(toe6);
			addBoxHelper(toe6, 30, 37, -0.5F, -0.25F, -3.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(toe6, 9, 7, -0.5F, -0.25F, -4.0F, 1, 1, 1, 0.0F, false);
			Wing1 = new ModelRenderer(this);
			Wing1.setRotationPoint(5.25F, -6.75F, -2.25F);
			Body.addChild(Wing1);
			addBoxHelper(Wing1, 51, 23, 0.0F, 1.75F, -0.5F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Wing1, 45, 0, 0.0F, -3.25F, -0.5F, 8, 5, 1, 0.0F, false);
			addBoxHelper(Wing1, 48, 11, 1.0F, -5.25F, -0.5F, 7, 2, 1, 0.0F, false);
			addBoxHelper(Wing1, 45, 8, 2.0F, -6.25F, -0.5F, 9, 1, 1, 0.0F, false);
			addBoxHelper(Wing1, 16, 45, 3.0F, -7.25F, -0.5F, 10, 1, 1, 0.0F, false);
			addBoxHelper(Wing1, 51, 21, 6.0F, -8.25F, -0.5F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Wing1, 50, 31, 7.0F, -9.25F, -0.5F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Wing1, 7, 0, 9.0F, -5.25F, -0.5F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Wing1, 29, 53, 8.0F, -5.25F, -0.5F, 1, 5, 1, 0.0F, false);
			Wing2 = new ModelRenderer(this);
			Wing2.setRotationPoint(-4.25F, -6.75F, -2.25F);
			setRotationAngle(Wing2, 0.0F, 3.1416F, 0.0F);
			Body.addChild(Wing2);
			addBoxHelper(Wing2, 48, 18, 0.0F, 1.75F, -0.5F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Wing2, 41, 36, 0.0F, -3.25F, -0.5F, 8, 5, 1, 0.0F, false);
			addBoxHelper(Wing2, 23, 34, 1.0F, -5.25F, -0.5F, 7, 2, 1, 0.0F, false);
			addBoxHelper(Wing2, 45, 6, 2.0F, -6.25F, -0.5F, 9, 1, 1, 0.0F, false);
			addBoxHelper(Wing2, 41, 34, 3.0F, -7.25F, -0.5F, 10, 1, 1, 0.0F, false);
			addBoxHelper(Wing2, 48, 16, 6.0F, -8.25F, -0.5F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Wing2, 48, 14, 7.0F, -9.25F, -0.5F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Wing2, 16, 12, 8.0F, -5.25F, -0.5F, 1, 5, 1, 0.0F, false);
			addBoxHelper(Wing2, 0, 0, 9.0F, -5.25F, -0.5F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Wing2, 0, 31, 8.0F, -5.25F, -0.5F, 1, 5, 1, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.5F, -9.75F, -11.25F);
			Body.addChild(Head);
			addBoxHelper(Head, 0, 31, -4.0F, -4.25F, -5.75F, 8, 7, 7, 0.0F, false);
			flap1 = new ModelRenderer(this);
			flap1.setRotationPoint(0.0F, -4.25F, -2.25F);
			Head.addChild(flap1);
			addBoxHelper(flap1, 33, 0, -0.5F, -6.0F, -1.5F, 1, 6, 3, 0.0F, false);
			flap3 = new ModelRenderer(this);
			flap3.setRotationPoint(0.0F, -3.25F, 0.0F);
			setRotationAngle(flap3, -0.6981F, 0.0F, 0.0F);
			Head.addChild(flap3);
			addBoxHelper(flap3, 0, 19, -0.5F, -6.0F, -1.5F, 1, 6, 3, 0.0F, false);
			flap2 = new ModelRenderer(this);
			flap2.setRotationPoint(0.0F, -3.25F, -4.5F);
			setRotationAngle(flap2, 0.6981F, 0.0F, 0.0F);
			Head.addChild(flap2);
			addBoxHelper(flap2, 27, 19, -0.5F, -6.0F, -1.5F, 1, 6, 3, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			ExploBird.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Foot2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Foot.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Wing2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Wing1.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
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
