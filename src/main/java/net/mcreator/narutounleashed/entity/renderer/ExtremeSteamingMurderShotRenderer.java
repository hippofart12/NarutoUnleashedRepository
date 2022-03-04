package net.mcreator.narutounleashed.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.narutounleashed.item.ExtremeSteamingMurderShotItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ExtremeSteamingMurderShotRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ExtremeSteamingMurderShotItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<ExtremeSteamingMurderShotItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/scorch_release_balls.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(ExtremeSteamingMurderShotItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelScorchThreeBalls();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(ExtremeSteamingMurderShotItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 3.9.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelScorchThreeBalls extends EntityModel<Entity> {
		private final ModelRenderer Ball;
		private final ModelRenderer Ball2;
		private final ModelRenderer Ball3;

		public ModelScorchThreeBalls() {
			textureWidth = 862;
			textureHeight = 400;
			Ball = new ModelRenderer(this);
			Ball.setRotationPoint(0.0F, 24.0F, 0.0F);
			Ball.setTextureOffset(113, 165).addBox(14.0F, -36.0F, -2.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			Ball.setTextureOffset(113, 165).addBox(15.0F, -35.0F, -2.5F, 8.0F, 8.0F, 11.0F, 0.0F, false);
			Ball.setTextureOffset(113, 165).addBox(13.5F, -35.0F, -1.0F, 11.0F, 8.0F, 8.0F, 0.0F, false);
			Ball.setTextureOffset(113, 165).addBox(15.0F, -36.5F, -1.0F, 8.0F, 11.0F, 8.0F, 0.0F, false);
			Ball2 = new ModelRenderer(this);
			Ball2.setRotationPoint(-35.0F, 24.0F, 0.0F);
			Ball2.setTextureOffset(230, 100).addBox(12.0F, -34.0F, -2.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			Ball2.setTextureOffset(230, 100).addBox(13.0F, -33.0F, -2.5F, 8.0F, 8.0F, 11.0F, 0.0F, false);
			Ball2.setTextureOffset(230, 100).addBox(11.5F, -33.0F, -1.0F, 11.0F, 8.0F, 8.0F, 0.0F, false);
			Ball2.setTextureOffset(230, 100).addBox(13.0F, -34.5F, -1.0F, 8.0F, 11.0F, 8.0F, 0.0F, false);
			Ball3 = new ModelRenderer(this);
			Ball3.setRotationPoint(-16.5F, 9.0F, 0.0F);
			Ball3.setTextureOffset(168, 124).addBox(11.5F, -34.0F, -2.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			Ball3.setTextureOffset(168, 124).addBox(12.5F, -33.0F, -2.5F, 8.0F, 8.0F, 11.0F, 0.0F, false);
			Ball3.setTextureOffset(168, 124).addBox(11.0F, -33.0F, -1.0F, 11.0F, 8.0F, 8.0F, 0.0F, false);
			Ball3.setTextureOffset(168, 124).addBox(12.5F, -34.5F, -1.0F, 8.0F, 11.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Ball.render(matrixStack, buffer, packedLight, packedOverlay);
			Ball2.render(matrixStack, buffer, packedLight, packedOverlay);
			Ball3.render(matrixStack, buffer, packedLight, packedOverlay);
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
