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

import net.mcreator.narutounleashed.item.SharkProjectileItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SharkProjectileRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SharkProjectileItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<SharkProjectileItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/water_shark_jutsu.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(SharkProjectileItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelWater_Shark();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(SharkProjectileItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelWater_Shark extends EntityModel<Entity> {
		private final ModelRenderer bone8;
		private final ModelRenderer bone14;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer bone3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r5;
		private final ModelRenderer bone13;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer bone9;
		private final ModelRenderer bone10;
		private final ModelRenderer bone11;
		private final ModelRenderer bone12;
		private final ModelRenderer bone4;
		private final ModelRenderer bone7;
		private final ModelRenderer bone6;
		private final ModelRenderer bone5;

		public ModelWater_Shark() {
			textureWidth = 128;
			textureHeight = 128;
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(0.0F, 20.75F, -5.0F);
			setRotationAngle(bone8, -1.5708F, 0.0F, 1.5708F);
			bone14 = new ModelRenderer(this);
			bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone8.addChild(bone14);
			bone14.setTextureOffset(0, 37).addBox(-1.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, false);
			bone14.setTextureOffset(0, 37).addBox(-8.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-8.0F, -8.0F, -3.0F);
			bone14.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3054F);
			cube_r1.setTextureOffset(36, 0).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-7.0F, 0.0F, -3.0F);
			bone14.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.4363F);
			cube_r2.setTextureOffset(0, 0).addBox(-6.0F, -4.0F, 0.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-3.0F, -3.0F, 4.0F);
			bone14.addChild(bone2);
			bone2.setTextureOffset(0, 13).addBox(-1.0F, -0.5F, -14.0F, 5.0F, 0.0F, 7.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-1.0F, 0.0F, -10.0F);
			bone2.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
			cube_r3.setTextureOffset(4, 40).addBox(0.0F, -1.0F, -5.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-3.0F, -3.0F, 4.0F);
			bone14.addChild(bone3);
			bone3.setTextureOffset(0, 20).addBox(-1.0F, -0.5F, -1.0F, 5.0F, 0.0F, 7.0F, 0.0F, true);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-1.0F, 0.0F, 2.0F);
			bone3.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.4363F, 0.0F);
			cube_r4.setTextureOffset(2, 40).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone14.addChild(bone);
			bone.setTextureOffset(0, 0).addBox(-1.0F, -12.0F, 0.5F, 4.0F, 5.0F, 0.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-2.0F, -8.0F, 0.0F);
			bone.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
			cube_r5.setTextureOffset(7, 7).addBox(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			bone13 = new ModelRenderer(this);
			bone13.setRotationPoint(6.0F, -7.0F, 0.0F);
			bone8.addChild(bone13);
			bone13.setTextureOffset(15, 46).addBox(10.0872F, -0.0038F, -1.5F, 2.0F, 3.0F, 3.0F, -0.25F, true);
			bone13.setTextureOffset(119, 118).addBox(11.0872F, -4.0038F, 0.0F, 5.0F, 11.0F, 0.0F, 0.0F, false);
			bone13.setTextureOffset(5, 35).addBox(5.0872F, -0.5038F, -3.0F, 6.0F, 4.0F, 6.0F, -0.75F, false);
			bone13.setTextureOffset(0, 44).addBox(0.0872F, -0.5038F, -3.0F, 6.0F, 4.0F, 6.0F, -0.25F, true);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(6.0872F, 5.9962F, 0.0F);
			bone13.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, -0.0873F);
			cube_r6.setTextureOffset(5, 42).addBox(-6.0F, -4.5F, -3.0F, 6.0F, 4.0F, 6.0F, -0.25F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(5.0872F, 4.9962F, 0.0F);
			bone13.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3927F);
			cube_r7.setTextureOffset(1, 43).addBox(-1.0F, -3.5F, -3.0F, 7.0F, 4.0F, 6.0F, -0.75F, false);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(10.0872F, 2.4962F, 0.0F);
			bone13.addChild(bone9);
			setRotationAngle(bone9, 0.0F, 0.0F, -0.7854F);
			bone9.setTextureOffset(9, 24).addBox(0.0F, -0.5F, -0.5F, 2.0F, 4.0F, 1.0F, -0.25F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(0.2F, 3.25F, 0.0F);
			bone9.addChild(bone10);
			setRotationAngle(bone10, 0.0F, 0.0F, -0.1745F);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(1.05F, 0.0F, 0.0F);
			bone10.addChild(bone11);
			setRotationAngle(bone11, 0.0F, 0.0F, 0.2007F);
			bone11.setTextureOffset(40, 24).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, -0.25F, false);
			bone12 = new ModelRenderer(this);
			bone12.setRotationPoint(-1.2F, -0.25F, 0.0F);
			bone10.addChild(bone12);
			bone12.setTextureOffset(30, 7).addBox(1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.25F, true);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(10.0872F, 0.4962F, 0.0F);
			bone13.addChild(bone4);
			setRotationAngle(bone4, 0.0F, 0.0F, 0.7854F);
			bone4.setTextureOffset(30, 23).addBox(0.0F, -3.5F, -0.5F, 2.0F, 4.0F, 1.0F, -0.25F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(0.2F, -3.25F, 0.0F);
			bone4.addChild(bone7);
			setRotationAngle(bone7, 0.0F, 0.0F, 0.1745F);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(1.05F, 0.0F, 0.0F);
			bone7.addChild(bone6);
			setRotationAngle(bone6, 0.0F, 0.0F, -0.2007F);
			bone6.setTextureOffset(43, 13).addBox(-0.75F, -2.75F, -0.5F, 1.0F, 3.0F, 1.0F, -0.25F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(-1.2F, 0.25F, 0.0F);
			bone7.addChild(bone5);
			bone5.setTextureOffset(33, 35).addBox(1.0F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.25F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone8.render(matrixStack, buffer, packedLight, packedOverlay);
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
