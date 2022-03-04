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

import net.mcreator.narutounleashed.entity.ZetsuEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ZetsuRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ZetsuEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelzetsu(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("naruto_unleashed:textures/zetsu.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelzetsu extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftLeg;
		private final ModelRenderer leftArm;
		private final ModelRenderer rightArm;

		public Modelzetsu() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-6.0F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-7.0F, -15.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-6.0F, -22.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(5.0F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(6.0F, -15.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(5.0F, -22.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(1.0F, -8.0F, 4.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(1.0F, -8.0F, -5.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(1.0F, -18.0F, 4.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(1.0F, -18.0F, -5.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(1.0F, -23.0F, 4.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-5.0F, -23.0F, -5.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(1.0F, -23.0F, 1.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-5.0F, -23.0F, -5.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-6.0F, -14.0F, 4.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-6.0F, -14.0F, -5.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-5.0F, -4.0F, 4.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-6.0F, 0.0F, -4.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-6.0F, 0.0F, 2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(5.0F, 0.0F, 2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(5.0F, 0.0F, -4.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-5.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-2.0F, -13.0F, 4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-2.0F, -13.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-3.0F, -7.0F, 4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-3.0F, -7.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-1.0F, -3.0F, 4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-1.0F, -3.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-3.0F, -17.0F, 4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-3.0F, -17.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-3.0F, -23.0F, 4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-1.0F, -23.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-3.0F, -23.0F, 3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(-1.0F, -23.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(3, 39).addBox(-7.0F, 18.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(14, 40).addBox(-6.0F, 15.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(1, 48).addBox(5.0F, 15.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(14, 36).addBox(4.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(14, 53).addBox(-5.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(15, 48).addBox(-6.0F, 18.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(15, 44).addBox(4.0F, 18.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(7, 48).addBox(4.0F, 18.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(6, 51).addBox(-6.0F, 18.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(18, 45).addBox(-5.0F, 15.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 50).addBox(-5.0F, 15.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(11, 49).addBox(4.0F, 15.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(17, 44).addBox(4.0F, 15.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(2, 45).addBox(6.0F, 18.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(14, 44).addBox(-4.0F, 12.0F, 2.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 52).addBox(-4.0F, 12.0F, -3.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(22, 23).addBox(-4.0F, 15.0F, 3.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(17, 26).addBox(-5.0F, 18.0F, 4.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 58).addBox(-5.0F, 18.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 53).addBox(1.0F, 18.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 52).addBox(-4.0F, 15.0F, -4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 53).addBox(0.0F, 15.0F, -4.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			rightLeg.setTextureOffset(0, 16).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			leftLeg.setTextureOffset(0, 16).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftArm.setTextureOffset(52, 61).addBox(-1.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			leftArm.setTextureOffset(8, 54).addBox(-1.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			leftArm.setTextureOffset(8, 54).addBox(-1.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			leftArm.setTextureOffset(52, 61).addBox(-1.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			leftArm.setTextureOffset(31, 10).addBox(3.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			leftArm.setTextureOffset(5, 47).addBox(3.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightArm.setTextureOffset(6, 46).addBox(-3.0F, 7.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			rightArm.setTextureOffset(6, 46).addBox(-3.0F, 7.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			rightArm.setTextureOffset(50, 62).addBox(-3.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			rightArm.setTextureOffset(50, 62).addBox(-3.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			rightArm.setTextureOffset(50, 62).addBox(-4.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			rightArm.setTextureOffset(0, 51).addBox(-4.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
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

}
