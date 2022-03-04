
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
public class MizukageHatItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:mizukage_hat_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:mizukage_hat_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:mizukage_hat_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:mizukage_hat_boots")
	public static final Item boots = null;

	public MizukageHatItem(NarutoUnleashedModElements instance) {
		super(instance, 656);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 85;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 15}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 36;
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
				return "mizukage_hat";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(NarutoUnleashedTabItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new Modelhat().head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/mizukage_hat.png";
			}
		}.setRegistryName("mizukage_hat_helmet"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelhat extends EntityModel<Entity> {
		private final ModelRenderer head;

		public Modelhat() {
			textureWidth = 268;
			textureHeight = 196;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -3.5F, 0.0F);
			head.setTextureOffset(30, 37).addBox(8.0F, -4.0F, -3.0F, 1.0F, 13.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(16, 37).addBox(-9.0F, -4.0F, -3.0F, 1.0F, 13.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(38, 69).addBox(7.0F, -4.0F, 3.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 69).addBox(7.0F, -4.0F, -4.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 4).addBox(-8.0F, -4.0F, -4.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 68).addBox(6.0F, -4.0F, -5.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 68).addBox(-7.0F, -4.0F, -5.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(44, 42).addBox(-6.0F, -4.0F, -9.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 32).addBox(9.0F, -4.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(26, 26).addBox(-10.0F, -4.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(22, 6).addBox(8.0F, -4.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(14, 22).addBox(-9.0F, -4.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(36, 60).addBox(8.0F, -5.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(26, 56).addBox(-9.0F, -5.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(8, 56).addBox(-8.0F, -5.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(54, 24).addBox(7.0F, -5.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(62, 51).addBox(-8.0F, -6.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(62, 51).addBox(7.0F, -6.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(54, 15).addBox(6.0F, -6.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(52, 52).addBox(-7.0F, -6.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(64, 24).addBox(6.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(6, 59).addBox(5.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(50, 15).addBox(-6.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(24, 37).addBox(-7.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(36, 56).addBox(5.0F, -8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(26, 56).addBox(-6.0F, -8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(18, 56).addBox(4.0F, -8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(54, 27).addBox(-5.0F, -8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(12, 37).addBox(2.0F, -9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 37).addBox(-3.0F, -9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(60, 44).addBox(1.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(18, 56).addBox(-2.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(54, 24).addBox(-3.0F, -9.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(54, 20).addBox(3.0F, -9.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(30, 37).addBox(-4.0F, -9.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 32).addBox(1.0F, -10.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(26, 26).addBox(-2.0F, -10.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(2.0F, -10.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-3.0F, -10.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(26, 21).addBox(-2.0F, -11.0F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(38, 40).addBox(-6.0F, -4.0F, -8.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(38, 33).addBox(-6.0F, -4.0F, 7.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(38, 38).addBox(-6.0F, -4.0F, 8.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(47, 36).addBox(-5.0F, -5.0F, -8.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 33).addBox(-5.0F, -5.0F, 7.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(20, 17).addBox(-5.0F, -5.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 2).addBox(-4.0F, -6.0F, -7.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 0).addBox(-4.0F, -6.0F, 6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 58).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 19).addBox(-4.0F, -6.0F, 5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 19).addBox(-3.0F, -7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 35).addBox(-3.0F, -7.0F, 5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 2).addBox(-3.0F, -7.0F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(-3.0F, -7.0F, 4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 24).addBox(-2.0F, -8.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 4).addBox(-2.0F, -8.0F, 4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(74, 66).addBox(-1.0F, -9.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(74, 49).addBox(-1.0F, -9.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 74).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 74).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(73, 64).addBox(-1.0F, -10.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(73, 62).addBox(-7.0F, -4.0F, 7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(73, 60).addBox(5.0F, -4.0F, 7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(73, 47).addBox(-7.0F, -4.0F, -8.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(73, 45).addBox(5.0F, -4.0F, -8.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(73, 43).addBox(-8.0F, -4.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(73, 28).addBox(-8.0F, -4.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(48, 73).addBox(6.0F, -4.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 73).addBox(6.0F, -4.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 70).addBox(-9.0F, -4.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 68).addBox(-8.0F, -5.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 14).addBox(6.0F, -5.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 12).addBox(6.0F, -5.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 10).addBox(-8.0F, -5.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 8).addBox(-6.0F, -6.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 6).addBox(-6.0F, -6.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 4).addBox(-5.0F, -8.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 72).addBox(-5.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(71, 38).addBox(2.0F, -8.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(71, 36).addBox(-4.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(71, 34).addBox(2.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(71, 32).addBox(-4.0F, -8.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(71, 17).addBox(-3.0F, -8.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(48, 71).addBox(1.0F, -8.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 71).addBox(-3.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(70, 55).addBox(1.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(70, 53).addBox(-7.0F, -5.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(70, 51).addBox(5.0F, -5.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(70, 26).addBox(5.0F, -5.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(70, 24).addBox(-7.0F, -5.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(70, 21).addBox(-5.0F, -6.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(69, 41).addBox(-6.0F, -5.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(69, 30).addBox(4.0F, -5.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(48, 69).addBox(4.0F, -5.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 69).addBox(-6.0F, -5.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 65).addBox(3.0F, -6.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 63).addBox(4.0F, -6.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 61).addBox(4.0F, -6.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 48).addBox(4.0F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 46).addBox(-6.0F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 44).addBox(4.0F, -6.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 66).addBox(3.0F, -6.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 65).addBox(-5.0F, -6.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 65).addBox(2.0F, -7.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 29).addBox(-4.0F, -7.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 21).addBox(2.0F, -7.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 64).addBox(-5.0F, -7.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(63, 34).addBox(-6.0F, -7.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 63).addBox(-4.0F, -7.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 55).addBox(3.0F, -7.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 53).addBox(3.0F, -7.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 51).addBox(-5.0F, -7.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 62).addBox(4.0F, -7.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 61).addBox(4.0F, -7.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 61).addBox(-6.0F, -7.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 48).addBox(3.0F, -8.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 60).addBox(3.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 59).addBox(4.0F, -6.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 59).addBox(-6.0F, -6.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 59).addBox(-9.0F, -4.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 46).addBox(7.0F, -4.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 44).addBox(7.0F, -4.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 17).addBox(-1.0F, -10.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 15).addBox(-1.0F, -11.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 30).addBox(-1.0F, -11.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 6).addBox(-1.0F, -10.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 6).addBox(-1.0F, -10.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 61).addBox(4.0F, -4.0F, -6.0F, 2.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 59).addBox(-6.0F, -4.0F, -6.0F, 2.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 68).addBox(-8.0F, -4.0F, 3.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 65).addBox(6.0F, -4.0F, 4.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 65).addBox(-7.0F, -4.0F, 4.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(22, 65).addBox(5.0F, -4.0F, 5.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 65).addBox(-6.0F, -4.0F, 5.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 65).addBox(4.0F, -4.0F, 6.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(10, 65).addBox(-5.0F, -4.0F, 6.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(6, 65).addBox(3.0F, -5.0F, 6.0F, 1.0F, 14.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 4).addBox(-4.0F, -5.0F, 6.0F, 1.0F, 14.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(50, 0).addBox(-3.0F, -5.0F, 6.0F, 6.0F, 14.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
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
