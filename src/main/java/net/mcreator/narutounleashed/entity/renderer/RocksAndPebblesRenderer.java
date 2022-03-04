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

import net.mcreator.narutounleashed.item.RocksAndPebblesItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RocksAndPebblesRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RocksAndPebblesItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<RocksAndPebblesItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/rootsandpebbles.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(RocksAndPebblesItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelRAP();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(RocksAndPebblesItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRAP extends EntityModel<Entity> {
		private final ModelRenderer Root1;
		private final ModelRenderer Root2;
		private final ModelRenderer Root3;
		private final ModelRenderer Root4;
		private final ModelRenderer Root5;
		private final ModelRenderer pebble;
		private final ModelRenderer pebble2;
		private final ModelRenderer pebble3;
		private final ModelRenderer pebble4;

		public ModelRAP() {
			textureWidth = 16;
			textureHeight = 16;
			Root1 = new ModelRenderer(this);
			Root1.setRotationPoint(0.0F, 24.0F, 0.0F);
			Root1.setTextureOffset(2, 2).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Root1.setTextureOffset(2, 2).addBox(-1.0F, -6.25F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Root1.setTextureOffset(2, 2).addBox(-1.0F, -10.5F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			Root2 = new ModelRenderer(this);
			Root2.setRotationPoint(4.75F, 21.25F, -3.5F);
			setRotationAngle(Root2, 0.0F, -1.5708F, 0.0F);
			Root2.setTextureOffset(2, 7).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Root2.setTextureOffset(2, 7).addBox(-1.0F, -6.25F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Root2.setTextureOffset(2, 7).addBox(-1.0F, -10.5F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			Root3 = new ModelRenderer(this);
			Root3.setRotationPoint(-5.25F, 19.75F, -1.0F);
			setRotationAngle(Root3, 0.0F, 1.5708F, 0.0F);
			Root3.setTextureOffset(4, 1).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Root3.setTextureOffset(4, 1).addBox(-1.0F, -6.25F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Root3.setTextureOffset(4, 1).addBox(-1.0F, -10.5F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			Root4 = new ModelRenderer(this);
			Root4.setRotationPoint(0.75F, 22.75F, 4.25F);
			setRotationAngle(Root4, 0.0F, 1.5708F, 0.0F);
			Root4.setTextureOffset(0, 11).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Root4.setTextureOffset(0, 11).addBox(-1.0F, -6.25F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Root4.setTextureOffset(0, 11).addBox(-1.0F, -10.5F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			Root5 = new ModelRenderer(this);
			Root5.setRotationPoint(-4.25F, 23.5F, 4.25F);
			setRotationAngle(Root5, 3.1416F, 0.0F, 3.1416F);
			Root5.setTextureOffset(0, 6).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Root5.setTextureOffset(0, 6).addBox(-1.0F, -6.25F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Root5.setTextureOffset(0, 6).addBox(-1.0F, -10.5F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			pebble = new ModelRenderer(this);
			pebble.setRotationPoint(-4.25F, 23.5F, -2.5F);
			pebble.setTextureOffset(12, 4).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble.setTextureOffset(12, 4).addBox(-1.0F, -2.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble.setTextureOffset(12, 4).addBox(-2.5F, -2.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble2 = new ModelRenderer(this);
			pebble2.setRotationPoint(3.75F, 21.5F, -1.75F);
			setRotationAngle(pebble2, 0.0F, -1.5708F, 0.0F);
			pebble2.setTextureOffset(11, 1).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble2.setTextureOffset(11, 1).addBox(-1.0F, -2.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble2.setTextureOffset(11, 1).addBox(-2.5F, -2.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble3 = new ModelRenderer(this);
			pebble3.setRotationPoint(3.75F, 13.5F, 3.0F);
			setRotationAngle(pebble3, -3.1416F, 0.0F, 3.1416F);
			pebble3.setTextureOffset(12, 10).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble3.setTextureOffset(12, 10).addBox(-1.0F, -2.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble3.setTextureOffset(12, 10).addBox(-2.5F, -2.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble4 = new ModelRenderer(this);
			pebble4.setRotationPoint(-0.5F, 16.25F, 6.75F);
			setRotationAngle(pebble4, 0.0F, -1.5708F, 0.0F);
			pebble4.setTextureOffset(10, 12).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble4.setTextureOffset(10, 12).addBox(-1.0F, -2.0F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pebble4.setTextureOffset(10, 12).addBox(-2.5F, -2.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Root1.render(matrixStack, buffer, packedLight, packedOverlay);
			Root2.render(matrixStack, buffer, packedLight, packedOverlay);
			Root3.render(matrixStack, buffer, packedLight, packedOverlay);
			Root4.render(matrixStack, buffer, packedLight, packedOverlay);
			Root5.render(matrixStack, buffer, packedLight, packedOverlay);
			pebble.render(matrixStack, buffer, packedLight, packedOverlay);
			pebble2.render(matrixStack, buffer, packedLight, packedOverlay);
			pebble3.render(matrixStack, buffer, packedLight, packedOverlay);
			pebble4.render(matrixStack, buffer, packedLight, packedOverlay);
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
