
package net.mcreator.narutounleashed.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.narutounleashed.procedures.MSATickProcedure;
import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NarutoUnleashedModElements.ModElement.Tag
public class MadaraSusanooArmoredItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:madara_susanoo_armored_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:madara_susanoo_armored_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:madara_susanoo_armored_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:madara_susanoo_armored_boots")
	public static final Item boots = null;

	public MadaraSusanooArmoredItem(NarutoUnleashedModElements instance) {
		super(instance, 901);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 45, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 0;
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
				return "madara_susanoo_armored";
			}

			@Override
			public float getToughness() {
				return 6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 2f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(NarutoUnleashedTabItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Models_madara3().susanoo;
				armorModel.bipedLeftArm = new Models_madara3().bone36;
				armorModel.bipedRightArm = new Models_madara3().bone36;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/s_madara3.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				MSATickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("madara_susanoo_armored_chestplate"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Models_madara3 extends EntityModel<Entity> {
		private final ModelRenderer susanoo;
		private final ModelRenderer bone;
		private final ModelRenderer bone23;
		private final ModelRenderer bone17;
		private final ModelRenderer bone22;
		private final ModelRenderer bone12;
		private final ModelRenderer bone16;
		private final ModelRenderer bone18;
		private final ModelRenderer bone19;
		private final ModelRenderer bone20;
		private final ModelRenderer bone21;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone8;
		private final ModelRenderer bone9;
		private final ModelRenderer bone10;
		private final ModelRenderer bone15;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer bone24;
		private final ModelRenderer bone25;
		private final ModelRenderer bone26;
		private final ModelRenderer bone27;
		private final ModelRenderer bone28;
		private final ModelRenderer bone29;
		private final ModelRenderer bone30;
		private final ModelRenderer bone40;
		private final ModelRenderer bone40_r1;
		private final ModelRenderer bone40_r2;
		private final ModelRenderer bone11;
		private final ModelRenderer bone2;
		private final ModelRenderer bone2_r1;
		private final ModelRenderer bone2_r2;
		private final ModelRenderer bone13;
		private final ModelRenderer bone13_r1;
		private final ModelRenderer bone7;
		private final ModelRenderer bone14;
		private final ModelRenderer bone14_r1;
		private final ModelRenderer bone14_r2;
		private final ModelRenderer bone14_r3;
		private final ModelRenderer bone14_r4;
		private final ModelRenderer bone14_r5;
		private final ModelRenderer bone35;
		private final ModelRenderer bone35_r1;
		private final ModelRenderer bone37;
		private final ModelRenderer bone37_r1;
		private final ModelRenderer bone38;
		private final ModelRenderer bone38_r1;
		private final ModelRenderer bone31;
		private final ModelRenderer bone31_r1;
		private final ModelRenderer bone31_r2;
		private final ModelRenderer bone31_r3;
		private final ModelRenderer bone31_r4;
		private final ModelRenderer bone32;
		private final ModelRenderer bone32_r1;
		private final ModelRenderer bone33;
		private final ModelRenderer bone33_r1;
		private final ModelRenderer bone34;
		private final ModelRenderer bone34_r1;
		private final ModelRenderer bone36;

		public Models_madara3() {
			textureWidth = 512;
			textureHeight = 512;
			susanoo = new ModelRenderer(this);
			susanoo.setRotationPoint(0.0F, -1.5F, 0.0F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(1.9F, 13.5F, 0.0F);
			susanoo.addChild(bone);
			bone23 = new ModelRenderer(this);
			bone23.setRotationPoint(-1.9F, 0.0F, 0.0F);
			bone.addChild(bone23);
			bone17 = new ModelRenderer(this);
			bone17.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone17);
			setRotationAngle(bone17, 0.0F, -0.7854F, 0.0F);
			bone17.setTextureOffset(269, 166).addBox(-16.006F, -36.26F, -3.18F, 31.0F, 36.0F, 6.0F, 0.0F, false);
			bone22 = new ModelRenderer(this);
			bone22.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone22);
			setRotationAngle(bone22, 0.0F, -2.7489F, 0.0F);
			bone22.setTextureOffset(218, 224).addBox(-16.006F, -36.26F, -3.18F, 31.0F, 36.0F, 6.0F, 0.0F, false);
			bone12 = new ModelRenderer(this);
			bone12.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone12);
			bone12.setTextureOffset(278, 76).addBox(-16.006F, -36.26F, -3.18F, 31.0F, 36.0F, 6.0F, 0.0F, false);
			bone16 = new ModelRenderer(this);
			bone16.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone16);
			setRotationAngle(bone16, 0.0F, -0.3927F, 0.0F);
			bone16.setTextureOffset(0, 272).addBox(-16.006F, -36.26F, -3.18F, 31.0F, 36.0F, 6.0F, 0.0F, false);
			bone18 = new ModelRenderer(this);
			bone18.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone18);
			setRotationAngle(bone18, 0.0F, -1.1781F, 0.0F);
			bone18.setTextureOffset(212, 264).addBox(-16.006F, -36.26F, -3.18F, 31.0F, 36.0F, 6.0F, 0.0F, false);
			bone19 = new ModelRenderer(this);
			bone19.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone19);
			setRotationAngle(bone19, 0.0F, -1.5708F, 0.0F);
			bone19.setTextureOffset(74, 260).addBox(-16.006F, -36.26F, -3.18F, 31.0F, 36.0F, 6.0F, 0.0F, false);
			bone20 = new ModelRenderer(this);
			bone20.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone20);
			setRotationAngle(bone20, 0.0F, -1.9635F, 0.0F);
			bone20.setTextureOffset(240, 0).addBox(-16.006F, -36.26F, -3.18F, 31.0F, 36.0F, 6.0F, 0.0F, false);
			bone21 = new ModelRenderer(this);
			bone21.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone21);
			setRotationAngle(bone21, 0.0F, -2.3562F, 0.0F);
			bone21.setTextureOffset(0, 232).addBox(-16.006F, -36.26F, -3.18F, 31.0F, 36.0F, 6.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(-1.9F, 20.0F, -5.0F);
			bone.addChild(bone5);
			setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
			bone5.setTextureOffset(100, 20).addBox(-2.0F, -56.4005F, -21.7278F, 4.0F, 17.0F, 3.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(8.4224F, -21.6367F, -9.4152F);
			bone5.addChild(bone6);
			setRotationAngle(bone6, 0.0F, -0.7854F, 0.0F);
			bone6.setTextureOffset(100, 20).addBox(-16.0667F, -34.7957F, -1.3445F, 5.0F, 17.0F, 5.0F, 0.0F, false);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(5.6F, -21.6367F, -9.4152F);
			bone5.addChild(bone8);
			setRotationAngle(bone8, 0.0F, -2.7489F, 0.0F);
			bone8.setTextureOffset(100, 20).addBox(-3.2457F, -34.7957F, 1.9662F, 12.0F, 17.0F, 6.0F, 0.0F, false);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(5.6F, -21.6367F, -9.4152F);
			bone5.addChild(bone9);
			bone9.setTextureOffset(100, 20).addBox(-12.5372F, -34.7957F, -3.0516F, 13.0F, 17.0F, 6.0F, 0.0F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(5.6F, -21.6367F, -9.4152F);
			bone5.addChild(bone10);
			setRotationAngle(bone10, 0.0F, -0.3927F, 0.0F);
			bone10.setTextureOffset(100, 20).addBox(-13.6759F, -34.7957F, -3.749F, 9.0F, 17.0F, 6.0F, 0.0F, false);
			bone15 = new ModelRenderer(this);
			bone15.setRotationPoint(5.6F, -21.6367F, -9.4152F);
			bone5.addChild(bone15);
			setRotationAngle(bone15, 0.0F, -2.3562F, 0.0F);
			bone15.setTextureOffset(100, 20).addBox(-6.088F, -34.7957F, 6.22F, 5.0F, 17.0F, 5.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-1.9F, 11.0F, 0.0F);
			bone.addChild(bone3);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, -0.223F, 0.0F);
			bone3.addChild(bone4);
			setRotationAngle(bone4, 0.0F, -0.7854F, 0.0F);
			bone4.setTextureOffset(177, 183).addBox(-19.7194F, -33.1686F, -3.9178F, 39.0F, 34.0F, 7.0F, 0.0F, false);
			bone24 = new ModelRenderer(this);
			bone24.setRotationPoint(0.0F, -0.223F, 0.0F);
			bone3.addChild(bone24);
			setRotationAngle(bone24, 0.0F, -2.7489F, 0.0F);
			bone24.setTextureOffset(155, 34).addBox(-19.7194F, -33.1686F, -3.9178F, 39.0F, 34.0F, 7.0F, 0.0F, false);
			bone25 = new ModelRenderer(this);
			bone25.setRotationPoint(0.0F, -0.223F, 0.0F);
			bone3.addChild(bone25);
			bone25.setTextureOffset(92, 149).addBox(-19.7194F, -33.1686F, -3.9178F, 39.0F, 34.0F, 7.0F, 0.0F, false);
			bone26 = new ModelRenderer(this);
			bone26.setRotationPoint(0.0F, -0.223F, 0.0F);
			bone3.addChild(bone26);
			setRotationAngle(bone26, 0.0F, -0.3927F, 0.0F);
			bone26.setTextureOffset(0, 149).addBox(-19.7194F, -33.1686F, -3.9178F, 39.0F, 34.0F, 7.0F, 0.0F, false);
			bone27 = new ModelRenderer(this);
			bone27.setRotationPoint(0.0F, -0.223F, 0.0F);
			bone3.addChild(bone27);
			setRotationAngle(bone27, 0.0F, -1.1781F, 0.0F);
			bone27.setTextureOffset(92, 108).addBox(-19.7194F, -33.1686F, -3.9178F, 39.0F, 34.0F, 7.0F, 0.0F, false);
			bone28 = new ModelRenderer(this);
			bone28.setRotationPoint(0.0F, -0.223F, 0.0F);
			bone3.addChild(bone28);
			setRotationAngle(bone28, 0.0F, -1.5708F, 0.0F);
			bone28.setTextureOffset(0, 108).addBox(-19.7194F, -33.1686F, -3.9178F, 39.0F, 34.0F, 7.0F, 0.0F, false);
			bone29 = new ModelRenderer(this);
			bone29.setRotationPoint(0.0F, -0.223F, 0.0F);
			bone3.addChild(bone29);
			setRotationAngle(bone29, 0.0F, -1.9635F, 0.0F);
			bone29.setTextureOffset(70, 0).addBox(-19.7194F, -33.1686F, -3.9178F, 39.0F, 34.0F, 7.0F, 0.0F, false);
			bone30 = new ModelRenderer(this);
			bone30.setRotationPoint(0.0F, -0.223F, 0.0F);
			bone3.addChild(bone30);
			setRotationAngle(bone30, 0.0F, -2.3562F, 0.0F);
			bone30.setTextureOffset(63, 67).addBox(-19.7194F, -33.1686F, -3.9178F, 39.0F, 34.0F, 7.0F, 0.0F, false);
			bone40 = new ModelRenderer(this);
			bone40.setRotationPoint(-1.9F, 14.0F, 0.0F);
			bone.addChild(bone40);
			bone40.setTextureOffset(1, 1).addBox(-8.1F, -63.0F, -9.0F, 16.0F, 13.0F, 17.0F, 0.0F, false);
			bone40.setTextureOffset(427, 474).addBox(-5.1F, -68.0F, -9.0F, 10.0F, 6.0F, 0.0F, 0.0F, false);
			bone40.setTextureOffset(427, 474).addBox(-7.1F, -66.0F, -9.0F, 14.0F, 4.0F, 0.0F, 0.0F, false);
			bone40.setTextureOffset(184, 114).addBox(-29.1F, -56.0F, -6.0F, 10.0F, 29.0F, 0.0F, 0.0F, false);
			bone40_r1 = new ModelRenderer(this);
			bone40_r1.setRotationPoint(25.0F, 6.0F, 7.0F);
			bone40.addChild(bone40_r1);
			setRotationAngle(bone40_r1, 0.0F, 0.0F, -0.8727F);
			bone40_r1.setTextureOffset(213, 100).addBox(17.9F, -80.0F, 1.0F, 18.0F, 13.0F, 0.0F, 0.0F, false);
			bone40_r2 = new ModelRenderer(this);
			bone40_r2.setRotationPoint(33.0F, 21.0F, 46.0F);
			bone40.addChild(bone40_r2);
			setRotationAngle(bone40_r2, 0.3054F, 1.5708F, 0.0F);
			bone40_r2.setTextureOffset(0, 68).addBox(44.9F, -66.0F, 8.0F, 0.0F, 16.0F, 6.0F, 0.0F, false);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(-1.9F, 12.0F, 0.0F);
			bone.addChild(bone11);
			bone11.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 25.5F, 0.0F);
			susanoo.addChild(bone2);
			bone2.setTextureOffset(250, 122).addBox(-20.0F, -34.0F, -27.0F, 18.0F, 10.0F, 10.0F, 0.0F, false);
			bone2.setTextureOffset(112, 109).addBox(-1.0191F, -47.436F, -21.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
			bone2_r1 = new ModelRenderer(this);
			bone2_r1.setRotationPoint(2.9809F, -33.436F, -18.0F);
			bone2.addChild(bone2_r1);
			setRotationAngle(bone2_r1, 0.0F, 0.0F, -0.2182F);
			bone2_r1.setTextureOffset(112, 109).addBox(-4.0F, -8.0F, -7.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			bone2_r1.setTextureOffset(112, 109).addBox(-4.0F, -7.0F, -9.0F, 5.0F, 16.0F, 10.0F, 0.0F, false);
			bone2_r2 = new ModelRenderer(this);
			bone2_r2.setRotationPoint(-0.052F, -32.7867F, -18.0F);
			bone2.addChild(bone2_r2);
			setRotationAngle(bone2_r2, 0.0F, 0.0F, 0.2182F);
			bone2_r2.setTextureOffset(112, 109).addBox(-5.0F, -8.0F, -5.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			bone2_r2.setTextureOffset(112, 109).addBox(-5.0F, -8.0F, -9.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			bone2_r2.setTextureOffset(112, 109).addBox(-4.0F, -7.0F, -9.0F, 5.0F, 16.0F, 10.0F, 0.0F, false);
			bone13 = new ModelRenderer(this);
			bone13.setRotationPoint(-15.0F, -32.0F, -22.0F);
			bone2.addChild(bone13);
			setRotationAngle(bone13, 0.6109F, 0.0F, 0.0F);
			bone13_r1 = new ModelRenderer(this);
			bone13_r1.setRotationPoint(0.0F, 0.4211F, -0.4929F);
			bone13.addChild(bone13_r1);
			setRotationAngle(bone13_r1, 0.0F, 1.5708F, 0.0F);
			bone13_r1.setTextureOffset(250, 122).addBox(-25.0F, -1.0F, 25.0F, 25.0F, 10.0F, 10.0F, 0.0F, false);
			bone13_r1.setTextureOffset(250, 122).addBox(-25.0F, -1.0F, -5.0F, 25.0F, 10.0F, 10.0F, 0.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(25.0F, 25.5F, 0.0F);
			susanoo.addChild(bone7);
			bone7.setTextureOffset(250, 122).addBox(-23.0F, -34.0F, -27.0F, 18.0F, 10.0F, 10.0F, 0.0F, false);
			bone14 = new ModelRenderer(this);
			bone14.setRotationPoint(0.0F, 25.5F, 0.0F);
			susanoo.addChild(bone14);
			bone14.setTextureOffset(101, 0).addBox(-1.0F, -68.0F, -9.0F, 2.0F, 5.0F, 31.0F, 0.0F, false);
			bone14.setTextureOffset(232, 224).addBox(-7.0F, -64.0F, 21.0F, 14.0F, 64.0F, 1.0F, 0.0F, false);
			bone14.setTextureOffset(232, 224).addBox(-13.0F, -57.0F, 21.0F, 26.0F, 57.0F, 1.0F, 0.0F, false);
			bone14.setTextureOffset(232, 224).addBox(-19.0F, -50.0F, 21.0F, 38.0F, 50.0F, 1.0F, 0.0F, false);
			bone14.setTextureOffset(232, 224).addBox(-24.0F, -37.0F, 21.0F, 48.0F, 37.0F, 1.0F, 0.0F, false);
			bone14.setTextureOffset(232, 224).addBox(-28.0F, -14.0F, 21.0F, 57.0F, 15.0F, 1.0F, 0.0F, false);
			bone14_r1 = new ModelRenderer(this);
			bone14_r1.setRotationPoint(0.0F, -63.7127F, -15.8278F);
			bone14.addChild(bone14_r1);
			setRotationAngle(bone14_r1, 0.4363F, 0.0F, 0.0F);
			bone14_r1.setTextureOffset(101, 0).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 11.0F, 0.0F, false);
			bone14_r2 = new ModelRenderer(this);
			bone14_r2.setRotationPoint(-20.8961F, -46.3835F, 0.0F);
			bone14.addChild(bone14_r2);
			setRotationAngle(bone14_r2, 0.0F, 0.0F, -1.3526F);
			bone14_r2.setTextureOffset(77, 8).addBox(-49.0F, -1.0F, -9.0F, 49.0F, 5.0F, 31.0F, 0.0F, false);
			bone14_r3 = new ModelRenderer(this);
			bone14_r3.setRotationPoint(-17.2496F, -50.5534F, 0.0F);
			bone14.addChild(bone14_r3);
			setRotationAngle(bone14_r3, 0.0F, 0.0F, -0.8727F);
			bone14_r3.setTextureOffset(77, 8).addBox(-6.0F, -1.0F, -9.0F, 6.0F, 5.0F, 31.0F, 0.0F, false);
			bone14_r4 = new ModelRenderer(this);
			bone14_r4.setRotationPoint(-5.1599F, -64.985F, 0.0F);
			bone14.addChild(bone14_r4);
			setRotationAngle(bone14_r4, 0.0F, 0.0F, -0.8727F);
			bone14_r4.setTextureOffset(157, 36).addBox(-19.0F, -1.0F, -9.0F, 19.0F, 5.0F, 31.0F, 0.0F, false);
			bone14_r5 = new ModelRenderer(this);
			bone14_r5.setRotationPoint(0.0F, -67.0F, 0.0F);
			bone14.addChild(bone14_r5);
			setRotationAngle(bone14_r5, 0.0F, 0.0F, -0.3927F);
			bone14_r5.setTextureOffset(80, 264).addBox(-6.0F, -1.0F, -9.0F, 6.0F, 5.0F, 31.0F, 0.0F, false);
			bone35 = new ModelRenderer(this);
			bone35.setRotationPoint(0.0F, -67.0F, 0.0F);
			bone14.addChild(bone35);
			setRotationAngle(bone35, 0.4363F, 0.0F, 0.0F);
			bone35_r1 = new ModelRenderer(this);
			bone35_r1.setRotationPoint(0.0F, -2.4492F, -13.0474F);
			bone35.addChild(bone35_r1);
			setRotationAngle(bone35_r1, 0.0F, 0.0F, -0.3927F);
			bone35_r1.setTextureOffset(77, 8).addBox(-5.5148F, -2.1713F, -5.7189F, 6.0F, 5.0F, 11.0F, 0.0F, false);
			bone37 = new ModelRenderer(this);
			bone37.setRotationPoint(-5.1599F, -64.985F, 0.0F);
			bone14.addChild(bone37);
			setRotationAngle(bone37, 0.4363F, 0.0F, 0.0F);
			bone37_r1 = new ModelRenderer(this);
			bone37_r1.setRotationPoint(0.0F, -3.7433F, -15.8851F);
			bone37.addChild(bone37_r1);
			setRotationAngle(bone37_r1, 0.0F, 0.0F, -0.8727F);
			bone37_r1.setTextureOffset(77, 8).addBox(-3.0F, -1.0F, 7.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone37_r1.setTextureOffset(77, 8).addBox(-6.0F, -1.0F, 6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			bone37_r1.setTextureOffset(77, 8).addBox(-11.0F, -1.0F, 5.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			bone37_r1.setTextureOffset(77, 8).addBox(-19.0F, -1.0F, 3.0F, 19.0F, 2.0F, 2.0F, 0.0F, false);
			bone37_r1.setTextureOffset(77, 8).addBox(-24.0F, -1.0F, -2.0F, 24.0F, 5.0F, 5.0F, 0.0F, false);
			bone38 = new ModelRenderer(this);
			bone38.setRotationPoint(-20.8961F, -46.3835F, 0.0F);
			bone14.addChild(bone38);
			setRotationAngle(bone38, 0.1309F, 0.0F, 0.0F);
			bone38_r1 = new ModelRenderer(this);
			bone38_r1.setRotationPoint(-0.0226F, -1.0886F, -16.8947F);
			bone38.addChild(bone38_r1);
			setRotationAngle(bone38_r1, 0.0F, 0.0F, -1.2654F);
			bone38_r1.setTextureOffset(77, 8).addBox(-12.6993F, -0.0463F, 6.0F, 13.0F, 5.0F, 2.0F, 0.0F, false);
			bone31 = new ModelRenderer(this);
			bone31.setRotationPoint(0.0F, 25.5F, -1.0F);
			susanoo.addChild(bone31);
			setRotationAngle(bone31, -3.1416F, 0.0F, 3.1416F);
			bone31_r1 = new ModelRenderer(this);
			bone31_r1.setRotationPoint(-20.8961F, -46.3835F, 0.0F);
			bone31.addChild(bone31_r1);
			setRotationAngle(bone31_r1, 0.0F, 0.0F, -1.3526F);
			bone31_r1.setTextureOffset(77, 8).addBox(-49.0F, -1.0F, -23.0F, 49.0F, 5.0F, 31.0F, 0.0F, false);
			bone31_r2 = new ModelRenderer(this);
			bone31_r2.setRotationPoint(-17.2496F, -50.5534F, 0.0F);
			bone31.addChild(bone31_r2);
			setRotationAngle(bone31_r2, 0.0F, 0.0F, -0.8727F);
			bone31_r2.setTextureOffset(77, 8).addBox(-6.0F, -1.0F, -23.0F, 6.0F, 5.0F, 31.0F, 0.0F, false);
			bone31_r3 = new ModelRenderer(this);
			bone31_r3.setRotationPoint(-5.1599F, -64.985F, 0.0F);
			bone31.addChild(bone31_r3);
			setRotationAngle(bone31_r3, 0.0F, 0.0F, -0.8727F);
			bone31_r3.setTextureOffset(77, 8).addBox(-19.0F, -1.0F, -23.0F, 19.0F, 5.0F, 31.0F, 0.0F, false);
			bone31_r4 = new ModelRenderer(this);
			bone31_r4.setRotationPoint(0.0F, -67.0F, 0.0F);
			bone31.addChild(bone31_r4);
			setRotationAngle(bone31_r4, 0.0F, 0.0F, -0.3927F);
			bone31_r4.setTextureOffset(77, 8).addBox(-6.0F, -1.0F, -23.0F, 6.0F, 5.0F, 31.0F, 0.0F, false);
			bone32 = new ModelRenderer(this);
			bone32.setRotationPoint(0.0F, -67.0F, 0.0F);
			bone31.addChild(bone32);
			setRotationAngle(bone32, -0.4363F, 0.0F, 0.0F);
			bone32_r1 = new ModelRenderer(this);
			bone32_r1.setRotationPoint(0.0F, -3.2944F, 15.86F);
			bone32.addChild(bone32_r1);
			setRotationAngle(bone32_r1, 0.0F, 0.0F, -0.3927F);
			bone32_r1.setTextureOffset(77, 8).addBox(-6.0F, -1.0F, -9.0F, 6.0F, 5.0F, 11.0F, 0.0F, false);
			bone33 = new ModelRenderer(this);
			bone33.setRotationPoint(-5.1599F, -64.985F, 0.0F);
			bone31.addChild(bone33);
			setRotationAngle(bone33, -0.4363F, 0.0F, 0.0F);
			bone33_r1 = new ModelRenderer(this);
			bone33_r1.setRotationPoint(0.0F, -3.3207F, 15.9788F);
			bone33.addChild(bone33_r1);
			setRotationAngle(bone33_r1, 0.0F, 0.0F, -0.8727F);
			bone33_r1.setTextureOffset(77, 8).addBox(-3.0F, -1.0F, -9.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone33_r1.setTextureOffset(77, 8).addBox(-6.0F, -1.0F, -8.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			bone33_r1.setTextureOffset(125, 10).addBox(-9.0F, -1.0F, -7.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
			bone33_r1.setTextureOffset(77, 8).addBox(-12.0F, -1.0F, -6.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
			bone33_r1.setTextureOffset(77, 8).addBox(-24.0F, -1.0F, -5.0F, 24.0F, 5.0F, 6.0F, 0.0F, false);
			bone34 = new ModelRenderer(this);
			bone34.setRotationPoint(-20.8961F, -46.3835F, 0.0F);
			bone31.addChild(bone34);
			setRotationAngle(bone34, -0.1309F, 0.0F, 0.0F);
			bone34_r1 = new ModelRenderer(this);
			bone34_r1.setRotationPoint(0.0F, -1.0424F, 16.9033F);
			bone34.addChild(bone34_r1);
			setRotationAngle(bone34_r1, 0.0F, 0.0F, -1.2654F);
			bone34_r1.setTextureOffset(77, 8).addBox(-13.6993F, -0.0463F, -9.0F, 14.0F, 5.0F, 2.0F, 0.0F, false);
			bone36 = new ModelRenderer(this);
			bone36.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			susanoo.render(matrixStack, buffer, packedLight, packedOverlay);
			bone36.render(matrixStack, buffer, packedLight, packedOverlay);
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
