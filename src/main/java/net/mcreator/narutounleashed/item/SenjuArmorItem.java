
package net.mcreator.narutounleashed.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NarutoUnleashedModElements.ModElement.Tag
public class SenjuArmorItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:senju_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:senju_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:senju_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:senju_armor_boots")
	public static final Item boots = null;

	public SenjuArmorItem(NarutoUnleashedModElements instance) {
		super(instance, 657);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 80;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 18, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 43;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "senju_armor";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.16f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(NarutoUnleashedTabItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new ModelSenju_Armor().bipedBody;
				armorModel.bipedLeftArm = new ModelSenju_Armor().bipedLeftArm;
				armorModel.bipedRightArm = new ModelSenju_Armor().bipedRightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/senju_armor.png";
			}
		}.setRegistryName("senju_armor_chestplate"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelSenju_Armor extends EntityModel<Entity> {
		private final ModelRenderer bipedBody;
		private final ModelRenderer bipedBody_r1;
		private final ModelRenderer bipedBody_r2;
		private final ModelRenderer bipedBody_r3;
		private final ModelRenderer bipedBody_r4;
		private final ModelRenderer bipedBody_r5;
		private final ModelRenderer bipedRightArm;
		private final ModelRenderer bipedLeftArm_r1;
		private final ModelRenderer bipedLeftArm;
		private final ModelRenderer bipedLeftArm_r2;

		public ModelSenju_Armor() {
			textureWidth = 64;
			textureHeight = 64;
			bipedBody = new ModelRenderer(this);
			bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
			bipedBody.setTextureOffset(0, 0).addBox(-4.0F, 3.0F, 1.5F, 8.0F, 9.0F, 1.0F, 0.0F, false);
			bipedBody.setTextureOffset(25, 19).addBox(-4.0F, 0.0F, -2.001F, 8.0F, 3.0F, 0.0F, 0.0F, false);
			bipedBody.setTextureOffset(20, 16).addBox(-4.0F, 0.0F, 2.001F, 8.0F, 3.0F, 0.0F, 0.0F, false);
			bipedBody_r1 = new ModelRenderer(this);
			bipedBody_r1.setRotationPoint(-4.0F, 0.0F, 0.0F);
			bipedBody.addChild(bipedBody_r1);
			setRotationAngle(bipedBody_r1, 0.0F, 0.0F, -0.3491F);
			bipedBody_r1.setTextureOffset(12, 26).addBox(-0.25F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			bipedBody_r2 = new ModelRenderer(this);
			bipedBody_r2.setRotationPoint(4.0F, 0.0F, 0.0F);
			bipedBody.addChild(bipedBody_r2);
			setRotationAngle(bipedBody_r2, 0.0F, 0.0F, 0.3491F);
			bipedBody_r2.setTextureOffset(0, 27).addBox(-0.75F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			bipedBody_r3 = new ModelRenderer(this);
			bipedBody_r3.setRotationPoint(3.0F, 12.0F, 0.0F);
			bipedBody.addChild(bipedBody_r3);
			setRotationAngle(bipedBody_r3, 0.0F, 0.0F, -0.2182F);
			bipedBody_r3.setTextureOffset(13, 15).addBox(0.5F, -0.75F, -2.5F, 1.0F, 6.0F, 5.0F, 0.0F, false);
			bipedBody_r4 = new ModelRenderer(this);
			bipedBody_r4.setRotationPoint(-4.0F, 12.0F, 0.0F);
			bipedBody.addChild(bipedBody_r4);
			setRotationAngle(bipedBody_r4, 0.0F, 0.0F, 0.2182F);
			bipedBody_r4.setTextureOffset(18, 0).addBox(-0.5F, -0.75F, -2.5F, 1.0F, 6.0F, 5.0F, 0.0F, false);
			bipedBody_r5 = new ModelRenderer(this);
			bipedBody_r5.setRotationPoint(0.0F, 7.5F, -2.0F);
			bipedBody.addChild(bipedBody_r5);
			setRotationAngle(bipedBody_r5, 0.0F, 3.1416F, 0.0F);
			bipedBody_r5.setTextureOffset(0, 0).addBox(-4.0F, -4.5F, -0.5F, 8.0F, 9.0F, 1.0F, 0.0F, false);
			bipedRightArm = new ModelRenderer(this);
			bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			bipedRightArm.setTextureOffset(30, 8).addBox(-3.0F, 6.0F, -2.001F, 4.0F, 3.0F, 0.0F, 0.0F, false);
			bipedRightArm.setTextureOffset(6, 23).addBox(1.001F, 6.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			bipedRightArm.setTextureOffset(18, 23).addBox(-3.0F, 6.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			bipedRightArm.setTextureOffset(30, 5).addBox(-3.0F, 6.0F, 2.001F, 4.0F, 3.0F, 0.0F, 0.0F, false);
			bipedRightArm.setTextureOffset(0, 22).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			bipedLeftArm_r1 = new ModelRenderer(this);
			bipedLeftArm_r1.setRotationPoint(-3.0F, -2.0F, 0.0F);
			bipedRightArm.addChild(bipedLeftArm_r1);
			setRotationAngle(bipedLeftArm_r1, 0.0F, 0.0F, -0.4363F);
			bipedLeftArm_r1.setTextureOffset(20, 11).addBox(-3.5F, -0.75F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			bipedLeftArm = new ModelRenderer(this);
			bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			bipedLeftArm.setTextureOffset(25, 0).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			bipedLeftArm.setTextureOffset(32, 11).addBox(-1.0F, 6.0F, -2.001F, 4.0F, 3.0F, 0.0F, 0.0F, false);
			bipedLeftArm.setTextureOffset(30, 30).addBox(-1.0F, 6.0F, 2.001F, 4.0F, 3.0F, 0.0F, 0.0F, false);
			bipedLeftArm.setTextureOffset(26, 23).addBox(3.001F, 6.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			bipedLeftArm.setTextureOffset(22, 26).addBox(-1.0F, 6.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			bipedLeftArm_r2 = new ModelRenderer(this);
			bipedLeftArm_r2.setRotationPoint(3.0F, -2.0F, 0.0F);
			bipedLeftArm.addChild(bipedLeftArm_r2);
			setRotationAngle(bipedLeftArm_r2, 0.0F, 0.0F, 0.4363F);
			bipedLeftArm_r2.setTextureOffset(21, 22).addBox(-0.5F, -0.75F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bipedBody.render(matrixStack, buffer, packedLight, packedOverlay);
			bipedRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			bipedLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
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
