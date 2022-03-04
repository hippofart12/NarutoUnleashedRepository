
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
public class GreenAnbuMaskItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:green_anbu_mask_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:green_anbu_mask_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:green_anbu_mask_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:green_anbu_mask_boots")
	public static final Item boots = null;

	public GreenAnbuMaskItem(NarutoUnleashedModElements instance) {
		super(instance, 644);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 35;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 7}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 25;
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
				return "green_anbu_mask";
			}

			@Override
			public float getToughness() {
				return 1.2000000000000002f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.03f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(NarutoUnleashedTabItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new ModelAnbuMask().bipedHead;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/greenanbumask.png";
			}
		}.setRegistryName("green_anbu_mask_helmet"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelAnbuMask extends EntityModel<Entity> {
		private final ModelRenderer bipedHead;

		public ModelAnbuMask() {
			textureWidth = 64;
			textureHeight = 32;
			bipedHead = new ModelRenderer(this);
			bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
			bipedHead.setTextureOffset(18, 18).addBox(-5.0F, -9.25F, -5.0F, 10.0F, 10.0F, 1.0F, 0.0F, false);
			bipedHead.setTextureOffset(3, 0).addBox(4.001F, -5.25F, -4.75F, 0.0F, 1.0F, 9.0F, 0.0F, false);
			bipedHead.setTextureOffset(3, 0).addBox(-4.001F, -5.25F, -4.75F, 0.0F, 1.0F, 9.0F, 0.0F, false);
			bipedHead.setTextureOffset(8, 9).addBox(-4.0F, -5.25F, 4.25F, 8.0F, 1.0F, 0.0F, 0.0F, false);
			bipedHead.setTextureOffset(41, 27).addBox(2.0F, -12.25F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bipedHead.setTextureOffset(41, 27).addBox(-5.0F, -12.25F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bipedHead.render(matrixStack, buffer, packedLight, packedOverlay);
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
