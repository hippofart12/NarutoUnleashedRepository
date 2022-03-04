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

import net.mcreator.narutounleashed.entity.ExplosiveClayBigBirdEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ExplosiveClayBigBirdRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ExplosiveClayBigBirdEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelECBB(), 0.8f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/explobirdbig.png");
					}
				};
			});
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class ModelECBB extends EntityModel<Entity> {
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

		public ModelECBB() {
			textureWidth = 512;
			textureHeight = 512;
			ExploBird = new ModelRenderer(this);
			ExploBird.setRotationPoint(0.0F, 24.0F, 0.0F);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			ExploBird.addChild(Body);
			addBoxHelper(Body, 0, 0, -18.0F, -36.0F, -24.0F, 40, 24, 52, 0.0F, false);
			addBoxHelper(Body, 80, 188, -14.0F, -33.0F, 28.0F, 32, 20, 4, 0.0F, false);
			addBoxHelper(Body, 112, 84, 0.0F, -43.0F, 32.0F, 4, 12, 40, 0.0F, false);
			addBoxHelper(Body, 168, 168, 0.0F, -31.0F, 32.0F, 4, 12, 32, 0.0F, false);
			addBoxHelper(Body, 0, 0, 0.0F, -19.0F, 32.0F, 4, 8, 20, 0.0F, false);
			addBoxHelper(Body, 132, 0, 0.0F, -47.0F, 36.0F, 4, 4, 40, 0.0F, false);
			addBoxHelper(Body, 160, 84, 0.0F, -51.0F, 44.0F, 4, 4, 36, 0.0F, false);
			addBoxHelper(Body, 120, 136, 0.0F, -59.0F, 48.0F, 4, 8, 36, 0.0F, false);
			addBoxHelper(Body, 148, 44, 0.0F, -63.0F, 56.0F, 4, 4, 36, 0.0F, false);
			addBoxHelper(Body, 128, 188, 0.0F, -67.0F, 64.0F, 4, 4, 24, 0.0F, false);
			addBoxHelper(Body, 0, 76, -14.0F, -37.0F, -20.0F, 32, 4, 44, 0.0F, false);
			addBoxHelper(Body, 0, 180, -10.0F, -44.0F, -40.0F, 24, 24, 16, 0.0F, false);
			Foot = new ModelRenderer(this);
			Foot.setRotationPoint(16.0F, -12.0F, 6.0F);
			Body.addChild(Foot);
			addBoxHelper(Foot, 208, 168, -6.0F, 0.0F, -6.0F, 12, 12, 12, 0.0F, false);
			addBoxHelper(Foot, 16, 112, -2.0F, 8.0F, 6.0F, 4, 4, 4, 0.0F, false);
			toe1 = new ModelRenderer(this);
			toe1.setRotationPoint(0.0F, 9.0F, -6.0F);
			Foot.addChild(toe1);
			addBoxHelper(toe1, 68, 212, -2.0F, -3.0F, -12.0F, 4, 6, 12, 0.0F, false);
			addBoxHelper(toe1, 124, 112, -2.0F, -1.0F, -16.0F, 4, 4, 4, 0.0F, false);
			toe3 = new ModelRenderer(this);
			toe3.setRotationPoint(-4.0F, 9.0F, -5.0F);
			setRotationAngle(toe3, 0.0F, 0.2618F, 0.0F);
			Foot.addChild(toe3);
			addBoxHelper(toe3, 160, 180, -2.0F, -3.0F, -12.0F, 4, 6, 12, 0.0F, false);
			addBoxHelper(toe3, 108, 112, -2.0F, -1.0F, -16.0F, 4, 4, 4, 0.0F, false);
			toe2 = new ModelRenderer(this);
			toe2.setRotationPoint(4.0F, 9.0F, -5.0F);
			setRotationAngle(toe2, 0.0F, -0.1745F, 0.0F);
			Foot.addChild(toe2);
			addBoxHelper(toe2, 204, 100, -2.0F, -3.0F, -12.0F, 4, 6, 12, 0.0F, false);
			addBoxHelper(toe2, 92, 124, -2.0F, -1.0F, -16.0F, 4, 4, 4, 0.0F, false);
			Foot2 = new ModelRenderer(this);
			Foot2.setRotationPoint(-12.0F, -12.0F, 6.0F);
			Body.addChild(Foot2);
			addBoxHelper(Foot2, 0, 28, -6.0F, 0.0F, -6.0F, 12, 12, 12, 0.0F, false);
			addBoxHelper(Foot2, 0, 112, -2.0F, 8.0F, 6.0F, 4, 4, 4, 0.0F, false);
			toe4 = new ModelRenderer(this);
			toe4.setRotationPoint(0.0F, 9.0F, -6.0F);
			Foot2.addChild(toe4);
			addBoxHelper(toe4, 160, 102, -2.0F, -3.0F, -12.0F, 4, 6, 12, 0.0F, false);
			addBoxHelper(toe4, 28, 108, -2.0F, -1.0F, -16.0F, 4, 4, 4, 0.0F, false);
			toe5 = new ModelRenderer(this);
			toe5.setRotationPoint(-4.0F, 9.0F, -5.0F);
			setRotationAngle(toe5, 0.0F, 0.2618F, 0.0F);
			Foot2.addChild(toe5);
			addBoxHelper(toe5, 160, 84, -2.0F, -3.0F, -12.0F, 4, 6, 12, 0.0F, false);
			addBoxHelper(toe5, 20, 76, -2.0F, -1.0F, -16.0F, 4, 4, 4, 0.0F, false);
			toe6 = new ModelRenderer(this);
			toe6.setRotationPoint(4.0F, 9.0F, -5.0F);
			setRotationAngle(toe6, 0.0F, -0.1745F, 0.0F);
			Foot2.addChild(toe6);
			addBoxHelper(toe6, 120, 148, -2.0F, -3.0F, -12.0F, 4, 6, 12, 0.0F, false);
			addBoxHelper(toe6, 36, 28, -2.0F, -1.0F, -16.0F, 4, 4, 4, 0.0F, false);
			Wing1 = new ModelRenderer(this);
			Wing1.setRotationPoint(21.0F, -27.0F, -9.0F);
			Body.addChild(Wing1);
			addBoxHelper(Wing1, 204, 92, 0.0F, 7.0F, -2.0F, 28, 4, 4, 0.0F, false);
			addBoxHelper(Wing1, 180, 0, 0.0F, -13.0F, -2.0F, 32, 20, 4, 0.0F, false);
			addBoxHelper(Wing1, 192, 44, 4.0F, -21.0F, -2.0F, 28, 8, 4, 0.0F, false);
			addBoxHelper(Wing1, 180, 32, 8.0F, -25.0F, -2.0F, 36, 4, 4, 0.0F, false);
			addBoxHelper(Wing1, 64, 180, 12.0F, -29.0F, -2.0F, 40, 4, 4, 0.0F, false);
			addBoxHelper(Wing1, 204, 84, 24.0F, -33.0F, -2.0F, 28, 4, 4, 0.0F, false);
			addBoxHelper(Wing1, 200, 124, 28.0F, -37.0F, -2.0F, 28, 4, 4, 0.0F, false);
			addBoxHelper(Wing1, 28, 0, 36.0F, -21.0F, -2.0F, 4, 12, 4, 0.0F, false);
			addBoxHelper(Wing1, 0, 124, 32.0F, -21.0F, -2.0F, 4, 20, 4, 0.0F, false);
			Wing2 = new ModelRenderer(this);
			Wing2.setRotationPoint(-17.0F, -27.0F, -9.0F);
			setRotationAngle(Wing2, 0.0F, 3.1416F, 0.0F);
			Body.addChild(Wing2);
			addBoxHelper(Wing2, 192, 72, 0.0F, 7.0F, -2.0F, 28, 4, 4, 0.0F, false);
			addBoxHelper(Wing2, 164, 144, 0.0F, -13.0F, -2.0F, 32, 20, 4, 0.0F, false);
			addBoxHelper(Wing2, 92, 136, 4.0F, -21.0F, -2.0F, 28, 8, 4, 0.0F, false);
			addBoxHelper(Wing2, 180, 24, 8.0F, -25.0F, -2.0F, 36, 4, 4, 0.0F, false);
			addBoxHelper(Wing2, 164, 136, 12.0F, -29.0F, -2.0F, 40, 4, 4, 0.0F, false);
			addBoxHelper(Wing2, 192, 64, 24.0F, -33.0F, -2.0F, 28, 4, 4, 0.0F, false);
			addBoxHelper(Wing2, 192, 56, 28.0F, -37.0F, -2.0F, 28, 4, 4, 0.0F, false);
			addBoxHelper(Wing2, 100, 212, 32.0F, -21.0F, -2.0F, 4, 20, 4, 0.0F, false);
			addBoxHelper(Wing2, 0, 0, 36.0F, -21.0F, -2.0F, 4, 12, 4, 0.0F, false);
			addBoxHelper(Wing2, 116, 212, 32.0F, -21.0F, -2.0F, 4, 20, 4, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -35.5F, -44.25F);
			Body.addChild(Head);
			addBoxHelper(Head, 0, 124, -14.0F, -20.5F, -23.75F, 32, 28, 28, 0.0F, false);
			flap1 = new ModelRenderer(this);
			flap1.setRotationPoint(2.0F, -20.5F, -9.75F);
			Head.addChild(flap1);
			addBoxHelper(flap1, 132, 0, -2.0F, -24.0F, -6.0F, 4, 24, 12, 0.0F, false);
			flap3 = new ModelRenderer(this);
			flap3.setRotationPoint(2.0F, -16.5F, -0.75F);
			setRotationAngle(flap3, -0.6981F, 0.0F, 0.0F);
			Head.addChild(flap3);
			addBoxHelper(flap3, 0, 76, -2.0F, -24.0F, -6.0F, 4, 24, 12, 0.0F, false);
			flap2 = new ModelRenderer(this);
			flap2.setRotationPoint(2.0F, -16.5F, -18.75F);
			setRotationAngle(flap2, 0.6981F, 0.0F, 0.0F);
			Head.addChild(flap2);
			addBoxHelper(flap2, 108, 76, -2.0F, -24.0F, -6.0F, 4, 24, 12, 0.0F, false);
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
