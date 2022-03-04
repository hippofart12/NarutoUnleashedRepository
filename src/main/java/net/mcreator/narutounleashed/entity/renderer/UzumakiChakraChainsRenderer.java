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

import net.mcreator.narutounleashed.item.UzumakiChakraChainsItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class UzumakiChakraChainsRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(UzumakiChakraChainsItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<UzumakiChakraChainsItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/chakrachain.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(UzumakiChakraChainsItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelCC();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(UzumakiChakraChainsItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelCC extends EntityModel<Entity> {
		private final ModelRenderer Chain;
		private final ModelRenderer Chain2;
		private final ModelRenderer Chain3;
		private final ModelRenderer Chain4;
		private final ModelRenderer Chain5;

		public ModelCC() {
			textureWidth = 16;
			textureHeight = 16;
			Chain = new ModelRenderer(this);
			Chain.setRotationPoint(0.5F, 24.0F, 1.0F);
			Chain.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain2 = new ModelRenderer(this);
			Chain2.setRotationPoint(0.0F, -6.0F, 0.0F);
			Chain.addChild(Chain2);
			setRotationAngle(Chain2, 0.0F, 1.5272F, 0.0F);
			Chain2.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain2.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain2.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain2.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain3 = new ModelRenderer(this);
			Chain3.setRotationPoint(0.0F, -6.25F, 0.0F);
			Chain2.addChild(Chain3);
			setRotationAngle(Chain3, 0.0F, 1.5272F, 0.0F);
			Chain3.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain3.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain3.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain3.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain4 = new ModelRenderer(this);
			Chain4.setRotationPoint(0.0F, -6.25F, 0.0F);
			Chain3.addChild(Chain4);
			setRotationAngle(Chain4, 0.0F, 1.5272F, 0.0F);
			Chain4.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain4.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain4.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain4.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain5 = new ModelRenderer(this);
			Chain5.setRotationPoint(0.0F, -6.0F, 0.0F);
			Chain4.addChild(Chain5);
			setRotationAngle(Chain5, 0.0F, 1.5272F, 0.0F);
			Chain5.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain5.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain5.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain5.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Chain.render(matrixStack, buffer, packedLight, packedOverlay);
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
