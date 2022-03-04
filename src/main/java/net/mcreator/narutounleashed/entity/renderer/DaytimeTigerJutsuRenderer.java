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

import net.mcreator.narutounleashed.item.DaytimeTigerJutsuItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DaytimeTigerJutsuRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DaytimeTigerJutsuItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<DaytimeTigerJutsuItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/eightgates-daytime_tiger.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(DaytimeTigerJutsuItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelDaytimeTiger();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(DaytimeTigerJutsuItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelDaytimeTiger extends EntityModel<Entity> {
		private final ModelRenderer bone;

		public ModelDaytimeTiger() {
			textureWidth = 800;
			textureHeight = 800;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, -58.5F);
			setRotationAngle(bone, -1.5708F, 0.0F, 0.0F);
			bone.setTextureOffset(74, 194).addBox(-48.0F, -128.0F, -67.0F, 108.0F, 128.0F, 131.0F, 0.0F, false);
			bone.setTextureOffset(190, 416).addBox(-48.0F, -20.0F, -111.0F, 108.0F, 20.0F, 44.0F, 0.0F, false);
			bone.setTextureOffset(157, 239).addBox(36.0F, -34.0F, -107.0F, 17.0F, 14.0F, 26.0F, 0.0F, false);
			bone.setTextureOffset(272, 243).addBox(36.0F, -54.25F, -107.0F, 17.0F, 14.0F, 26.0F, 0.0F, false);
			bone.setTextureOffset(256, 474).addBox(9.75F, -33.0F, -107.0F, 17.0F, 13.0F, 26.0F, 0.0F, false);
			bone.setTextureOffset(128, 276).addBox(9.75F, -53.5F, -107.0F, 17.0F, 13.0F, 26.0F, 0.0F, false);
			bone.setTextureOffset(124, 190).addBox(-15.5F, -36.0F, -107.0F, 17.0F, 16.0F, 26.0F, 0.0F, false);
			bone.setTextureOffset(441, 214).addBox(-15.5F, -57.0F, -107.0F, 17.0F, 16.0F, 26.0F, 0.0F, false);
			bone.setTextureOffset(177, 536).addBox(-41.75F, -53.75F, -107.0F, 17.0F, 12.0F, 26.0F, 0.0F, false);
			bone.setTextureOffset(173, 351).addBox(-48.0F, -86.0F, -111.0F, 108.0F, 34.0F, 44.0F, 0.0F, false);
			bone.setTextureOffset(328, 458).addBox(-40.5F, -123.25F, -73.0F, 36.0F, 34.0F, 6.0F, 0.0F, false);
			bone.setTextureOffset(429, 157).addBox(-41.75F, -32.0F, -107.0F, 17.0F, 12.0F, 26.0F, 0.0F, false);
			bone.setTextureOffset(267, 441).addBox(17.75F, -123.25F, -73.0F, 36.0F, 34.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
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
