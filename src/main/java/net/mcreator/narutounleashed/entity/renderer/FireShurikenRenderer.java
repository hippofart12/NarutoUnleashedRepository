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

import net.mcreator.narutounleashed.item.FireShurikenItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FireShurikenRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FireShurikenItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<FireShurikenItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/fireball1.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(FireShurikenItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelFireshuriken();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(FireShurikenItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFireshuriken extends EntityModel<Entity> {
		private final ModelRenderer bone;

		public ModelFireshuriken() {
			textureWidth = 512;
			textureHeight = 512;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone, 0.0F, -1.5708F, 1.5708F);
			bone.setTextureOffset(8, 18).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(9, 21).addBox(-2.0F, -0.5F, -6.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(15, 13).addBox(-3.0F, -0.5F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(20, 23).addBox(-4.0F, -0.5F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(13, 19).addBox(-1.0F, -0.5F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(12, 27).addBox(1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(11, 15).addBox(3.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(9, 22).addBox(1.0F, -0.5F, -2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(9, 25).addBox(4.0F, -0.5F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(9, 14).addBox(5.0F, -0.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(18, 21).addBox(-1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(16, 23).addBox(0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(6, 14).addBox(1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(12, 14).addBox(2.0F, -0.5F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(6, 27).addBox(3.0F, -0.5F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(13, 17).addBox(-3.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(15, 22).addBox(-5.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 24).addBox(-6.0F, -0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(11, 15).addBox(-6.0F, -0.5F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(16, 9).addBox(-6.0F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
