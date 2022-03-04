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

import net.mcreator.narutounleashed.entity.DeidaraEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DeidaraRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DeidaraEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldeidara(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/deidara.png");
					}
				};
			});
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class Modeldeidara extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftLeg;
		private final ModelRenderer leftArm;
		private final ModelRenderer rightArm;

		public Modeldeidara() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			addBoxHelper(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false);
			addBoxHelper(head, 8, 0, -1.0F, -6.0F, 6.0F, 3, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, -2.0F, -8.0F, 4.0F, 4, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, -4.0F, -6.0F, 6.0F, 3, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, -4.0F, -3.0F, 6.0F, 3, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, -1.0F, -3.0F, 6.0F, 3, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, 2.0F, -3.0F, 6.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, -2.0F, 0.0F, 6.0F, 3, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, -1.0F, 3.0F, 6.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, 1.0F, 0.0F, 6.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, -3.0F, 0.0F, 6.0F, 1, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, 2.0F, -6.0F, 6.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, 0.0F, -8.0F, 6.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(head, 8, 0, -2.0F, -8.0F, 6.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(head, 9, 0, 3.0F, -8.0F, -5.0F, 1, 8, 1, 0.0F, false);
			addBoxHelper(head, 9, 0, 2.0F, -8.0F, -5.0F, 1, 7, 1, 0.0F, false);
			addBoxHelper(head, 9, 0, 1.0F, -8.0F, -5.0F, 1, 6, 1, 0.0F, false);
			addBoxHelper(head, 9, 0, 0.0F, -8.0F, -5.0F, 1, 4, 1, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			addBoxHelper(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false);
			addBoxHelper(body, 3, 39, -7.0F, 18.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(body, 14, 40, -6.0F, 15.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(body, 1, 48, 5.0F, 15.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(body, 14, 36, 4.0F, 12.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(body, 14, 53, -5.0F, 12.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(body, 15, 48, -6.0F, 18.0F, -4.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(body, 15, 44, 4.0F, 18.0F, -4.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(body, 7, 48, 4.0F, 18.0F, 2.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(body, 6, 51, -6.0F, 18.0F, 2.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(body, 18, 45, -5.0F, 15.0F, 2.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(body, 20, 50, -5.0F, 15.0F, -3.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(body, 11, 49, 4.0F, 15.0F, -3.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(body, 17, 44, 4.0F, 15.0F, 2.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(body, 2, 45, 6.0F, 18.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(body, 14, 44, -4.0F, 12.0F, 2.0F, 8, 3, 1, 0.0F, false);
			addBoxHelper(body, 20, 52, -4.0F, 12.0F, -3.0F, 8, 3, 1, 0.0F, false);
			addBoxHelper(body, 22, 23, -4.0F, 15.0F, 3.0F, 8, 3, 1, 0.0F, false);
			addBoxHelper(body, 17, 26, -5.0F, 18.0F, 4.0F, 10, 3, 1, 0.0F, false);
			addBoxHelper(body, 21, 58, -5.0F, 18.0F, -5.0F, 3, 3, 1, 0.0F, false);
			addBoxHelper(body, 24, 53, 1.0F, 18.0F, -5.0F, 3, 3, 1, 0.0F, false);
			addBoxHelper(body, 21, 52, -4.0F, 15.0F, -4.0F, 3, 3, 1, 0.0F, false);
			addBoxHelper(body, 24, 53, 0.0F, 15.0F, -4.0F, 4, 3, 1, 0.0F, false);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			addBoxHelper(rightLeg, 0, 16, -2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			addBoxHelper(leftLeg, 0, 16, -1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			addBoxHelper(leftArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false);
			addBoxHelper(leftArm, 52, 61, -1.0F, 9.0F, -3.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(leftArm, 8, 54, -1.0F, 7.0F, -3.0F, 4, 2, 1, 0.0F, false);
			addBoxHelper(leftArm, 8, 54, -1.0F, 7.0F, 2.0F, 4, 2, 1, 0.0F, false);
			addBoxHelper(leftArm, 52, 61, -1.0F, 9.0F, 2.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(leftArm, 31, 10, 3.0F, 9.0F, -2.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(leftArm, 5, 47, 3.0F, 7.0F, -2.0F, 1, 2, 4, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			addBoxHelper(rightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false);
			addBoxHelper(rightArm, 6, 46, -3.0F, 7.0F, 2.0F, 4, 2, 1, 0.0F, false);
			addBoxHelper(rightArm, 6, 46, -3.0F, 7.0F, -3.0F, 4, 2, 1, 0.0F, false);
			addBoxHelper(rightArm, 50, 62, -3.0F, 9.0F, 2.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(rightArm, 50, 62, -3.0F, 9.0F, -3.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(rightArm, 50, 62, -4.0F, 9.0F, -2.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(rightArm, 0, 51, -4.0F, 7.0F, -2.0F, 1, 2, 4, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			head.render(ms, vb, i1, i2, f1, f2, f3, f4);
			body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			rightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leftLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leftArm.render(ms, vb, i1, i2, f1, f2, f3, f4);
			rightArm.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
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
