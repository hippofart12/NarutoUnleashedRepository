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

import net.mcreator.narutounleashed.item.WaterDragonItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WaterDragonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WaterDragonItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<WaterDragonItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/water_flow.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(WaterDragonItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelWaterDragon();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(WaterDragonItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.0.1
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelWaterDragon extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone_r1;
		private final ModelRenderer bone_r2;
		private final ModelRenderer bone_r3;
		private final ModelRenderer bone_r4;
		private final ModelRenderer bone_r5;
		private final ModelRenderer bone_r6;

		public ModelWaterDragon() {
			textureWidth = 1024;
			textureHeight = 1024;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(bone, 134, 2, -1.0F, -6.0F, -7.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, -3.0F, -13.0F, -6.0F, 6, 2, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, -3.0F, -14.0F, -5.0F, 6, 2, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, -3.0F, -15.0F, -4.0F, 6, 3, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, -3.0F, -16.0F, -3.0F, 6, 4, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, 2.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, -3.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, -1.0F, -11.0F, -7.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, 1.0F, -7.0F, -7.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, 1.0F, -12.0F, -7.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, -3.0F, -7.0F, -7.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(bone, 134, 2, -3.0F, -12.0F, -7.0F, 2, 1, 1, 0.0F, false);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, 0.0F, 1.3963F, 0.0F);
			addBoxHelper(bone_r1, 173, 24, 3.0F, -13.0F, -4.0F, 3, 2, 1, 0.0F, false);
			addBoxHelper(bone_r1, 173, 24, 3.0F, -6.0F, -4.0F, 3, 1, 1, 0.0F, false);
			bone_r2 = new ModelRenderer(this);
			bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r2);
			setRotationAngle(bone_r2, 0.0F, 1.5708F, 0.0F);
			addBoxHelper(bone_r2, 237, 58, 0.0F, -16.0F, -1.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, -1.0F, -15.0F, -1.0F, 1, 1, 2, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, 0.0F, -15.0F, 1.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, 0.0F, -15.0F, -2.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, -1.0F, -11.0F, -4.0F, 3, 1, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, -5.0F, -10.0F, 3.0F, 4, 2, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, 4.0F, -11.0F, 3.0F, 1, 5, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, 4.0F, -11.0F, -4.0F, 1, 5, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, 5.0F, -10.0F, 3.0F, 1, 4, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, 5.0F, -10.0F, -4.0F, 1, 4, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, -1.0F, -11.0F, 2.0F, 5, 4, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, -1.0F, -11.0F, -3.0F, 5, 4, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, -5.0F, -10.0F, -4.0F, 4, 2, 1, 0.0F, false);
			addBoxHelper(bone_r2, 237, 58, -1.0F, -8.0F, -4.0F, 3, 1, 1, 0.0F, false);
			bone_r3 = new ModelRenderer(this);
			bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r3);
			setRotationAngle(bone_r3, 0.0F, 1.4835F, 0.0F);
			addBoxHelper(bone_r3, 129, 56, 1.0F, -12.0F, -4.0F, 3, 1, 1, 0.0F, false);
			addBoxHelper(bone_r3, 129, 56, 1.0F, -7.0F, -4.0F, 3, 1, 1, 0.0F, false);
			bone_r4 = new ModelRenderer(this);
			bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r4);
			setRotationAngle(bone_r4, 0.0F, -1.5708F, 0.0F);
			addBoxHelper(bone_r4, 85, 2, -2.0F, -13.0F, -3.0F, 2, 2, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 1.0F, -8.0F, -3.0F, 4, 1, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, -2.0F, -7.0F, -3.0F, 4, 1, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, -4.0F, -6.0F, -3.0F, 3, 1, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, -4.0F, -11.0F, -3.0F, 1, 6, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, -6.0F, -5.0F, -3.0F, 2, 1, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 11.0F, -11.0F, -3.0F, 3, 1, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 8.0F, -12.0F, -3.0F, 3, 3, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 5.0F, -13.0F, -3.0F, 3, 5, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 2.0F, -14.0F, -3.0F, 3, 6, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 1.0F, -15.0F, -3.0F, 1, 7, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 1.0F, -16.0F, -3.0F, 6, 1, 1, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 6.0F, -17.0F, -3.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 6.0F, -17.0F, 2.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 1.0F, -16.0F, 2.0F, 6, 1, 1, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 0.0F, -14.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, 0.0F, -17.0F, -3.0F, 1, 2, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, -2.0F, -17.0F, -3.0F, 2, 1, 6, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, -2.0F, -11.0F, -4.0F, 3, 1, 1, 0.0F, false);
			addBoxHelper(bone_r4, 85, 2, -2.0F, -8.0F, -4.0F, 3, 1, 1, 0.0F, false);
			bone_r5 = new ModelRenderer(this);
			bone_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r5);
			setRotationAngle(bone_r5, 0.0F, -1.4835F, 0.0F);
			addBoxHelper(bone_r5, 73, 12, -4.0F, -12.0F, -4.0F, 3, 1, 1, 0.0F, false);
			addBoxHelper(bone_r5, 73, 12, -4.0F, -7.0F, -4.0F, 3, 1, 1, 0.0F, false);
			bone_r6 = new ModelRenderer(this);
			bone_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r6);
			setRotationAngle(bone_r6, 0.0F, -1.3963F, 0.0F);
			addBoxHelper(bone_r6, 124, 208, -6.0F, -13.0F, -4.0F, 3, 2, 1, 0.0F, false);
			addBoxHelper(bone_r6, 124, 208, -6.0F, -6.0F, -4.0F, 3, 1, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			bone.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

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
