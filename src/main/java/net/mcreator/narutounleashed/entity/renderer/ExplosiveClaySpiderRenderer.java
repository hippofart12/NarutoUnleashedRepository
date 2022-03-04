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

import net.mcreator.narutounleashed.entity.ExplosiveClaySpiderEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ExplosiveClaySpiderRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ExplosiveClaySpiderEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelECS(), 0.3f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/explosiveclayspider.png");
					}
				};
			});
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class ModelECS extends EntityModel<Entity> {
		private final ModelRenderer exploSPIDER;
		private final ModelRenderer Body;
		private final ModelRenderer head;
		private final ModelRenderer LEftLeg1;
		private final ModelRenderer Joint;
		private final ModelRenderer RIGHTLeg1;
		private final ModelRenderer Joint5;
		private final ModelRenderer RIGHTLeg2;
		private final ModelRenderer Joint6;
		private final ModelRenderer RIGHTLeg3;
		private final ModelRenderer Joint7;
		private final ModelRenderer RIGHTLeg4;
		private final ModelRenderer Joint8;
		private final ModelRenderer LEftLeg2;
		private final ModelRenderer Joint2;
		private final ModelRenderer LEftLeg3;
		private final ModelRenderer Joint3;
		private final ModelRenderer LEftLeg4;
		private final ModelRenderer Joint4;

		public ModelECS() {
			textureWidth = 64;
			textureHeight = 64;
			exploSPIDER = new ModelRenderer(this);
			exploSPIDER.setRotationPoint(0.0F, 24.0F, 0.0F);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, -0.25F);
			exploSPIDER.addChild(Body);
			addBoxHelper(Body, 0, 12, -6.0F, -5.0F, 0.25F, 6, 5, 7, 0.0F, false);
			addBoxHelper(Body, 0, 0, -6.0F, -5.0F, -7.0F, 6, 5, 7, 0.0F, false);
			addBoxHelper(Body, 34, 34, -5.5F, -4.5F, 0.0F, 5, 4, 0, 0.0F, false);
			addBoxHelper(Body, 6, 36, -5.5F, -3.25F, -7.25F, 5, 3, 0, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, -7.25F);
			Body.addChild(head);
			addBoxHelper(head, 22, 22, -5.0F, -4.0F, -3.75F, 4, 4, 4, 0.0F, false);
			addBoxHelper(head, 0, 36, -5.75F, -3.0F, -7.75F, 1, 3, 4, 0.0F, false);
			addBoxHelper(head, 28, 34, -1.25F, -3.0F, -7.75F, 1, 3, 4, 0.0F, false);
			addBoxHelper(head, 34, 21, -5.5F, -2.25F, -8.5F, 1, 2, 3, 0.0F, false);
			addBoxHelper(head, 14, 24, -1.5F, -2.25F, -8.5F, 1, 2, 3, 0.0F, false);
			LEftLeg1 = new ModelRenderer(this);
			LEftLeg1.setRotationPoint(0.0F, -3.25F, -5.25F);
			setRotationAngle(LEftLeg1, 0.0F, 0.1745F, 0.1745F);
			Body.addChild(LEftLeg1);
			addBoxHelper(LEftLeg1, 33, 13, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false);
			Joint = new ModelRenderer(this);
			Joint.setRotationPoint(5.75F, -0.5F, 0.0F);
			setRotationAngle(Joint, 0.0F, 0.0F, 0.6109F);
			LEftLeg1.addChild(Joint);
			addBoxHelper(Joint, 33, 1, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false);
			RIGHTLeg1 = new ModelRenderer(this);
			RIGHTLeg1.setRotationPoint(-6.0F, -3.25F, -5.25F);
			setRotationAngle(RIGHTLeg1, 0.0F, 2.9671F, -0.1745F);
			Body.addChild(RIGHTLeg1);
			addBoxHelper(RIGHTLeg1, 26, 18, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false);
			Joint5 = new ModelRenderer(this);
			Joint5.setRotationPoint(5.75F, -0.5F, 0.0F);
			setRotationAngle(Joint5, 0.0F, 0.0F, 0.6109F);
			RIGHTLeg1.addChild(Joint5);
			addBoxHelper(Joint5, 26, 9, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false);
			RIGHTLeg2 = new ModelRenderer(this);
			RIGHTLeg2.setRotationPoint(-6.0F, -3.25F, -1.75F);
			setRotationAngle(RIGHTLeg2, 0.0F, 3.0543F, -0.1745F);
			Body.addChild(RIGHTLeg2);
			addBoxHelper(RIGHTLeg2, 26, 6, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false);
			Joint6 = new ModelRenderer(this);
			Joint6.setRotationPoint(5.75F, -0.5F, 0.0F);
			setRotationAngle(Joint6, 0.0F, 0.0F, 0.6109F);
			RIGHTLeg2.addChild(Joint6);
			addBoxHelper(Joint6, 0, 24, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false);
			RIGHTLeg3 = new ModelRenderer(this);
			RIGHTLeg3.setRotationPoint(-6.0F, -3.25F, 2.0F);
			setRotationAngle(RIGHTLeg3, 0.0F, -3.0543F, -0.1745F);
			Body.addChild(RIGHTLeg3);
			addBoxHelper(RIGHTLeg3, 19, 15, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false);
			Joint7 = new ModelRenderer(this);
			Joint7.setRotationPoint(5.75F, -0.5F, 0.0F);
			setRotationAngle(Joint7, 0.0F, 0.0F, 0.6109F);
			RIGHTLeg3.addChild(Joint7);
			addBoxHelper(Joint7, 19, 12, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false);
			RIGHTLeg4 = new ModelRenderer(this);
			RIGHTLeg4.setRotationPoint(-6.0F, -3.25F, 5.5F);
			setRotationAngle(RIGHTLeg4, 0.0F, -2.8798F, -0.1745F);
			Body.addChild(RIGHTLeg4);
			addBoxHelper(RIGHTLeg4, 19, 3, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false);
			Joint8 = new ModelRenderer(this);
			Joint8.setRotationPoint(5.75F, -0.5F, 0.0F);
			setRotationAngle(Joint8, 0.0F, 0.0F, 0.6109F);
			RIGHTLeg4.addChild(Joint8);
			addBoxHelper(Joint8, 19, 0, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false);
			LEftLeg2 = new ModelRenderer(this);
			LEftLeg2.setRotationPoint(0.0F, -3.25F, -1.75F);
			setRotationAngle(LEftLeg2, 0.0F, 0.0873F, 0.1745F);
			Body.addChild(LEftLeg2);
			addBoxHelper(LEftLeg2, 16, 33, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false);
			Joint2 = new ModelRenderer(this);
			Joint2.setRotationPoint(5.75F, -0.5F, 0.0F);
			setRotationAngle(Joint2, 0.0F, 0.0F, 0.6109F);
			LEftLeg2.addChild(Joint2);
			addBoxHelper(Joint2, 0, 33, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false);
			LEftLeg3 = new ModelRenderer(this);
			LEftLeg3.setRotationPoint(0.0F, -3.25F, 2.0F);
			setRotationAngle(LEftLeg3, 0.0F, -0.0873F, 0.1745F);
			Body.addChild(LEftLeg3);
			addBoxHelper(LEftLeg3, 30, 31, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false);
			Joint3 = new ModelRenderer(this);
			Joint3.setRotationPoint(5.75F, -0.5F, 0.0F);
			setRotationAngle(Joint3, 0.0F, 0.0F, 0.6109F);
			LEftLeg3.addChild(Joint3);
			addBoxHelper(Joint3, 16, 30, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false);
			LEftLeg4 = new ModelRenderer(this);
			LEftLeg4.setRotationPoint(0.0F, -3.25F, 5.5F);
			setRotationAngle(LEftLeg4, 0.0F, -0.1745F, 0.1745F);
			Body.addChild(LEftLeg4);
			addBoxHelper(LEftLeg4, 0, 30, -0.25F, -0.5F, -1.0F, 6, 1, 2, 0.0F, false);
			Joint4 = new ModelRenderer(this);
			Joint4.setRotationPoint(5.75F, -0.5F, 0.0F);
			setRotationAngle(Joint4, 0.0F, 0.0F, 0.6109F);
			LEftLeg4.addChild(Joint4);
			addBoxHelper(Joint4, 0, 27, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			exploSPIDER.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.RIGHTLeg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LEftLeg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.LEftLeg4.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.LEftLeg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.LEftLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RIGHTLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.RIGHTLeg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.RIGHTLeg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
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
