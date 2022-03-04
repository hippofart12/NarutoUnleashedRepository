
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

import net.mcreator.narutounleashed.procedures.ISATickProcedure;
import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NarutoUnleashedModElements.ModElement.Tag
public class ItachiSusanooArmoredItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:itachi_susanoo_armored_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:itachi_susanoo_armored_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:itachi_susanoo_armored_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:itachi_susanoo_armored_boots")
	public static final Item boots = null;

	public ItachiSusanooArmoredItem(NarutoUnleashedModElements instance) {
		super(instance, 899);
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
				return "itachi_susanoo_armored";
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
				armorModel.bipedBody = new Models_itachi3().Susanoo;
				armorModel.bipedLeftArm = new Models_itachi3().bone49;
				armorModel.bipedRightArm = new Models_itachi3().bone49;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/s_itachi3.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				ISATickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("itachi_susanoo_armored_chestplate"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Models_itachi3 extends EntityModel<Entity> {
		private final ModelRenderer Susanoo;
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
		private final ModelRenderer bone31;
		private final ModelRenderer bone32;
		private final ModelRenderer bone33;
		private final ModelRenderer bone34;
		private final ModelRenderer bone35;
		private final ModelRenderer bone36;
		private final ModelRenderer bone37;
		private final ModelRenderer bone38;
		private final ModelRenderer bone39;
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
		private final ModelRenderer bone70;
		private final ModelRenderer bone71;
		private final ModelRenderer bone42;
		private final ModelRenderer bone43;
		private final ModelRenderer bone44;
		private final ModelRenderer bone10;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone2;
		private final ModelRenderer bone82;
		private final ModelRenderer bone83;
		private final ModelRenderer bone84;
		private final ModelRenderer bone85;
		private final ModelRenderer bone86;
		private final ModelRenderer bone87;
		private final ModelRenderer bone88;
		private final ModelRenderer bone89;
		private final ModelRenderer bone90;
		private final ModelRenderer bone7;
		private final ModelRenderer bone11;
		private final ModelRenderer bone46;
		private final ModelRenderer bone14;
		private final ModelRenderer bone15;
		private final ModelRenderer bone41;
		private final ModelRenderer bone13;
		private final ModelRenderer bone8;
		private final ModelRenderer bone9;
		private final ModelRenderer bone72;
		private final ModelRenderer bone73;
		private final ModelRenderer bone76;
		private final ModelRenderer bone77;
		private final ModelRenderer bone78;
		private final ModelRenderer bone79;
		private final ModelRenderer bone80;
		private final ModelRenderer bone81;
		private final ModelRenderer bone45;
		private final ModelRenderer bone48;
		private final ModelRenderer bone47;
		private final ModelRenderer bone49;

		public Models_itachi3() {
			textureWidth = 512;
			textureHeight = 512;
			Susanoo = new ModelRenderer(this);
			Susanoo.setRotationPoint(0.0F, -11.0F, 0.0F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(1.9F, 23.0F, 0.0F);
			Susanoo.addChild(bone);
			bone23 = new ModelRenderer(this);
			bone23.setRotationPoint(-1.9F, 0.0F, 0.0F);
			bone.addChild(bone23);
			bone17 = new ModelRenderer(this);
			bone17.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone17);
			setRotationAngle(bone17, 0.0F, -0.7854F, 0.0F);
			bone17.setTextureOffset(269, 166).addBox(-16.006F, -34.26F, -3.18F, 31.0F, 34.0F, 6.0F, 0.0F, false);
			bone22 = new ModelRenderer(this);
			bone22.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone22);
			setRotationAngle(bone22, 0.0F, -2.7489F, 0.0F);
			bone22.setTextureOffset(218, 224).addBox(-16.006F, -34.26F, -3.18F, 31.0F, 34.0F, 6.0F, 0.0F, false);
			bone12 = new ModelRenderer(this);
			bone12.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone12);
			bone12.setTextureOffset(278, 76).addBox(-16.006F, -34.26F, -3.18F, 31.0F, 34.0F, 6.0F, 0.0F, false);
			bone16 = new ModelRenderer(this);
			bone16.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone16);
			setRotationAngle(bone16, 0.0F, -0.3927F, 0.0F);
			bone16.setTextureOffset(0, 272).addBox(-16.006F, -34.26F, -3.18F, 31.0F, 34.0F, 6.0F, 0.0F, false);
			bone18 = new ModelRenderer(this);
			bone18.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone18);
			setRotationAngle(bone18, 0.0F, -1.1781F, 0.0F);
			bone18.setTextureOffset(212, 264).addBox(-16.006F, -34.26F, -3.18F, 31.0F, 34.0F, 6.0F, 0.0F, false);
			bone19 = new ModelRenderer(this);
			bone19.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone19);
			setRotationAngle(bone19, 0.0F, -1.5708F, 0.0F);
			bone19.setTextureOffset(74, 260).addBox(-16.006F, -34.26F, -3.18F, 31.0F, 34.0F, 6.0F, 0.0F, false);
			bone20 = new ModelRenderer(this);
			bone20.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone20);
			setRotationAngle(bone20, 0.0F, -1.9635F, 0.0F);
			bone20.setTextureOffset(240, 0).addBox(-16.006F, -34.26F, -3.18F, 31.0F, 34.0F, 6.0F, 0.0F, false);
			bone21 = new ModelRenderer(this);
			bone21.setRotationPoint(0.0F, -0.72F, 0.0F);
			bone23.addChild(bone21);
			setRotationAngle(bone21, 0.0F, -2.3562F, 0.0F);
			bone21.setTextureOffset(0, 232).addBox(-16.006F, -34.26F, -3.18F, 31.0F, 34.0F, 6.0F, 0.0F, false);
			bone31 = new ModelRenderer(this);
			bone31.setRotationPoint(-7.9F, -9.0F, 0.0F);
			bone.addChild(bone31);
			setRotationAngle(bone31, 0.0F, 0.0F, 0.2182F);
			bone32 = new ModelRenderer(this);
			bone32.setRotationPoint(-0.42F, -1.26F, 0.0F);
			bone31.addChild(bone32);
			setRotationAngle(bone32, 0.0F, -0.7854F, 0.0F);
			bone32.setTextureOffset(286, 286).addBox(-16.6236F, -28.805F, -4.8611F, 35.0F, 11.0F, 7.0F, 0.0F, false);
			bone33 = new ModelRenderer(this);
			bone33.setRotationPoint(-0.42F, -1.26F, 0.0F);
			bone31.addChild(bone33);
			setRotationAngle(bone33, 0.0F, -2.7489F, 0.0F);
			bone33.setTextureOffset(284, 58).addBox(-19.7471F, -28.805F, -4.2398F, 35.0F, 11.0F, 7.0F, 0.0F, false);
			bone34 = new ModelRenderer(this);
			bone34.setRotationPoint(-0.42F, -1.26F, 0.0F);
			bone31.addChild(bone34);
			bone34.setTextureOffset(269, 206).addBox(-16.0628F, -28.805F, -3.507F, 35.0F, 11.0F, 7.0F, 0.0F, false);
			bone35 = new ModelRenderer(this);
			bone35.setRotationPoint(-0.42F, -1.26F, 0.0F);
			bone31.addChild(bone35);
			setRotationAngle(bone35, 0.0F, -0.3927F, 0.0F);
			bone35.setTextureOffset(251, 124).addBox(-16.2085F, -28.805F, -4.2398F, 35.0F, 11.0F, 7.0F, 0.0F, false);
			bone36 = new ModelRenderer(this);
			bone36.setRotationPoint(-0.42F, -1.26F, 0.0F);
			bone31.addChild(bone36);
			setRotationAngle(bone36, 0.0F, -1.1781F, 0.0F);
			bone36.setTextureOffset(249, 40).addBox(-17.2449F, -28.805F, -5.2762F, 35.0F, 11.0F, 7.0F, 0.0F, false);
			bone37 = new ModelRenderer(this);
			bone37.setRotationPoint(-0.42F, -1.26F, 0.0F);
			bone31.addChild(bone37);
			setRotationAngle(bone37, 0.0F, -1.5708F, 0.0F);
			bone37.setTextureOffset(74, 239).addBox(-17.9778F, -28.805F, -5.422F, 35.0F, 11.0F, 7.0F, 0.0F, false);
			bone38 = new ModelRenderer(this);
			bone38.setRotationPoint(-0.42F, -1.26F, 0.0F);
			bone31.addChild(bone38);
			setRotationAngle(bone38, 0.0F, -1.9635F, 0.0F);
			bone38.setTextureOffset(155, 82).addBox(-18.7106F, -28.805F, -5.2762F, 35.0F, 11.0F, 7.0F, 0.0F, false);
			bone39 = new ModelRenderer(this);
			bone39.setRotationPoint(-0.42F, -1.26F, 0.0F);
			bone31.addChild(bone39);
			setRotationAngle(bone39, 0.0F, -2.3562F, 0.0F);
			bone39.setTextureOffset(70, 41).addBox(-19.3319F, -28.805F, -4.8611F, 35.0F, 11.0F, 7.0F, 0.0F, false);
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
			bone40.setTextureOffset(116, 300).addBox(-11.1F, -57.0F, -10.0F, 4.0F, 5.0F, 18.0F, 0.0F, false);
			bone40.setTextureOffset(0, 0).addBox(-9.1F, -64.0F, -9.0F, 18.0F, 14.0F, 17.0F, 0.0F, false);
			bone40.setTextureOffset(280, 246).addBox(-9.1F, -70.0F, -10.0F, 18.0F, 3.0F, 18.0F, 0.0F, false);
			bone40.setTextureOffset(162, 0).addBox(-10.1F, -67.0F, -11.0F, 20.0F, 10.0F, 19.0F, 0.0F, false);
			bone40.setTextureOffset(0, 68).addBox(1.9F, -68.0F, 8.0F, 0.0F, 16.0F, 6.0F, 0.0F, false);
			bone40.setTextureOffset(184, 114).addBox(-17.1F, -77.0F, -3.0F, 10.0F, 29.0F, 0.0F, 0.0F, false);
			bone40.setTextureOffset(213, 100).addBox(-9.1F, -82.0F, 1.0F, 18.0F, 13.0F, 0.0F, 0.0F, false);
			bone40.setTextureOffset(184, 156).addBox(6.9F, -59.0F, -10.0F, 4.0F, 9.0F, 18.0F, 0.0F, false);
			bone40.setTextureOffset(292, 224).addBox(-7.1F, -72.0F, -7.0F, 13.0F, 6.0F, 14.0F, 0.0F, false);
			bone40.setTextureOffset(162, 11).addBox(-2.1F, -68.0F, -12.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			bone70 = new ModelRenderer(this);
			bone70.setRotationPoint(-6.0F, 0.0F, 0.0F);
			bone40.addChild(bone70);
			setRotationAngle(bone70, 0.0F, 0.0F, 0.1309F);
			bone71 = new ModelRenderer(this);
			bone71.setRotationPoint(-5.0F, 1.0F, 0.0F);
			bone40.addChild(bone71);
			bone71.setTextureOffset(164, 75).addBox(-2.2305F, -53.9914F, -11.0F, 15.0F, 3.0F, 1.0F, 0.0F, false);
			bone71.setTextureOffset(164, 75).addBox(8.7695F, -55.9914F, -12.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			bone42 = new ModelRenderer(this);
			bone42.setRotationPoint(-5.0F, -3.0F, 0.0F);
			bone40.addChild(bone42);
			bone42.setTextureOffset(164, 75).addBox(-2.2305F, -53.9914F, -11.0F, 15.0F, 1.0F, 1.0F, 0.0F, false);
			bone42.setTextureOffset(164, 75).addBox(4.7695F, -52.9914F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone43 = new ModelRenderer(this);
			bone43.setRotationPoint(6.0F, 4.0F, -2.0F);
			bone40.addChild(bone43);
			setRotationAngle(bone43, 0.0F, 0.4363F, 0.0F);
			bone43.setTextureOffset(248, 241).addBox(-2.1F, -63.0F, -21.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			bone44 = new ModelRenderer(this);
			bone44.setRotationPoint(6.0F, 4.0F, -2.0F);
			bone40.addChild(bone44);
			setRotationAngle(bone44, 0.0F, 0.4363F, 0.0F);
			bone44.setTextureOffset(248, 241).addBox(-3.1F, -63.0F, -14.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(3.0F, 0.0F, 3.0F);
			bone40.addChild(bone10);
			setRotationAngle(bone10, 0.0F, 0.48F, 0.0F);
			bone10.setTextureOffset(491, 494).addBox(7.9F, -65.0F, -4.0F, 2.0F, 8.0F, 6.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(19.0F, 2.0F, 0.0F);
			bone40.addChild(bone5);
			setRotationAngle(bone5, 0.0F, 0.0F, -0.2618F);
			bone5.setTextureOffset(0, 102).addBox(-2.1F, -67.0F, -12.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
			bone5.setTextureOffset(22, 102).addBox(-2.1F, -68.0F, -12.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(-23.0F, 2.0F, 0.0F);
			bone40.addChild(bone6);
			setRotationAngle(bone6, 0.0F, 0.0F, 0.2618F);
			bone6.setTextureOffset(53, 0).addBox(-1.7498F, -67.8441F, -12.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
			bone6.setTextureOffset(34, 102).addBox(3.2502F, -68.8441F, -12.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(11.9F, 25.0F, 1.0F);
			Susanoo.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 0.0F, -0.4363F);
			bone2.setTextureOffset(282, 304).addBox(11.0F, -12.0F, -17.0F, 11.0F, 11.0F, 16.0F, 0.0F, false);
			bone2.setTextureOffset(37, 190).addBox(12.0F, -11.0F, -24.0F, 9.0F, 9.0F, 19.0F, 0.0F, false);
			bone2.setTextureOffset(0, 190).addBox(11.0F, -11.0F, -26.0F, 10.0F, 9.0F, 7.0F, 0.0F, false);
			bone2.setTextureOffset(109, 201).addBox(13.0F, -12.0F, -27.0F, 3.0F, 5.0F, 8.0F, 0.0F, false);
			bone2.setTextureOffset(74, 300).addBox(11.0F, -30.0F, -6.0F, 10.0F, 29.0F, 11.0F, 0.0F, false);
			bone82 = new ModelRenderer(this);
			bone82.setRotationPoint(-30.1483F, -2.9228F, -1.0F);
			bone2.addChild(bone82);
			bone83 = new ModelRenderer(this);
			bone83.setRotationPoint(52.5F, -3.5F, -6.5F);
			bone82.addChild(bone83);
			bone83.setTextureOffset(146, 224).addBox(-0.5F, -3.5F, -17.5F, 1.0F, 7.0F, 35.0F, 0.0F, false);
			bone83.setTextureOffset(0, 0).addBox(0.5F, -35.5F, -17.5F, 0.0F, 39.0F, 35.0F, 0.0F, false);
			bone84 = new ModelRenderer(this);
			bone84.setRotationPoint(52.5F, -3.5F, -6.5F);
			bone82.addChild(bone84);
			setRotationAngle(bone84, -0.3927F, 0.0F, 0.0F);
			bone84.setTextureOffset(214, 124).addBox(-0.5F, -3.5F, -17.5F, 1.0F, 7.0F, 35.0F, 0.0F, false);
			bone85 = new ModelRenderer(this);
			bone85.setRotationPoint(52.5F, -3.5F, -6.5F);
			bone82.addChild(bone85);
			setRotationAngle(bone85, -0.7854F, 0.0F, 0.0F);
			bone85.setTextureOffset(214, 82).addBox(-0.5F, -3.5F, -17.5F, 1.0F, 7.0F, 35.0F, 0.0F, false);
			bone86 = new ModelRenderer(this);
			bone86.setRotationPoint(52.5F, -3.5F, -6.5F);
			bone82.addChild(bone86);
			setRotationAngle(bone86, -1.1781F, 0.0F, 0.0F);
			bone86.setTextureOffset(212, 40).addBox(-0.5F, -3.5F, -17.5F, 1.0F, 7.0F, 35.0F, 0.0F, false);
			bone87 = new ModelRenderer(this);
			bone87.setRotationPoint(52.5F, -3.5F, -6.5F);
			bone82.addChild(bone87);
			setRotationAngle(bone87, -1.5708F, 0.0F, 0.0F);
			bone87.setTextureOffset(109, 197).addBox(-0.5F, -3.5F, -17.5F, 1.0F, 7.0F, 35.0F, 0.0F, false);
			bone88 = new ModelRenderer(this);
			bone88.setRotationPoint(52.5F, -3.5F, -6.5F);
			bone82.addChild(bone88);
			setRotationAngle(bone88, -1.9635F, 0.0F, 0.0F);
			bone88.setTextureOffset(72, 190).addBox(-0.5F, -3.5F, -17.5F, 1.0F, 7.0F, 35.0F, 0.0F, false);
			bone89 = new ModelRenderer(this);
			bone89.setRotationPoint(52.5F, -3.5F, -6.5F);
			bone82.addChild(bone89);
			setRotationAngle(bone89, -2.3562F, 0.0F, 0.0F);
			bone89.setTextureOffset(0, 190).addBox(-0.5F, -3.5F, -17.5F, 1.0F, 7.0F, 35.0F, 0.0F, false);
			bone90 = new ModelRenderer(this);
			bone90.setRotationPoint(52.5F, -3.5F, -6.5F);
			bone82.addChild(bone90);
			setRotationAngle(bone90, -2.7489F, 0.0F, 0.0F);
			bone90.setTextureOffset(177, 114).addBox(-0.5F, -3.5F, -17.5F, 1.0F, 7.0F, 35.0F, 0.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(-48.1F, 25.0F, 1.0F);
			Susanoo.addChild(bone7);
			setRotationAngle(bone7, 0.0F, 0.0F, 0.4363F);
			bone7.setTextureOffset(228, 304).addBox(11.9665F, -27.3725F, -17.0F, 11.0F, 11.0F, 16.0F, 0.0F, false);
			bone7.setTextureOffset(0, 74).addBox(12.9665F, -26.3725F, -24.0F, 9.0F, 9.0F, 19.0F, 0.0F, false);
			bone7.setTextureOffset(148, 266).addBox(11.9665F, -51.3725F, -6.0F, 10.0F, 35.0F, 11.0F, 0.0F, false);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(24.7445F, 6.8856F, 27.0F);
			bone7.addChild(bone11);
			setRotationAngle(bone11, 0.3054F, 0.8727F, 0.0F);
			bone11.setTextureOffset(174, 296).addBox(10.1234F, -41.8132F, -29.3251F, 11.0F, 11.0F, 16.0F, 0.0F, false);
			bone46 = new ModelRenderer(this);
			bone46.setRotationPoint(-22.8466F, -43.4512F, -0.1677F);
			bone11.addChild(bone46);
			setRotationAngle(bone46, 0.0F, 0.0F, 1.3526F);
			bone46.setTextureOffset(286, 142).addBox(11.1233F, -40.8132F, -37.3251F, 9.0F, 4.0F, 20.0F, 0.0F, false);
			bone46.setTextureOffset(169, 75).addBox(16.1233F, -40.8132F, -42.3251F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone46.setTextureOffset(147, 41).addBox(16.1233F, -44.8132F, -42.3251F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			bone46.setTextureOffset(164, 100).addBox(13.1233F, -40.8132F, -42.3251F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone46.setTextureOffset(62, 6).addBox(13.1233F, -44.8132F, -42.3251F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			bone14 = new ModelRenderer(this);
			bone14.setRotationPoint(-11.0687F, 3.6915F, -14.9952F);
			bone46.addChild(bone14);
			setRotationAngle(bone14, 0.0F, -0.3054F, 0.0F);
			bone14.setTextureOffset(155, 75).addBox(21.0337F, -44.5047F, -34.676F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone14.setTextureOffset(180, 29).addBox(21.0337F, -47.5047F, -34.676F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone15 = new ModelRenderer(this);
			bone15.setRotationPoint(-11.0687F, 3.6915F, -14.9952F);
			bone46.addChild(bone15);
			setRotationAngle(bone15, 0.0F, 0.3054F, 0.0F);
			bone15.setTextureOffset(85, 149).addBox(27.8796F, -44.5047F, -18.6231F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone15.setTextureOffset(177, 105).addBox(27.8796F, -47.5047F, -18.6231F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone41 = new ModelRenderer(this);
			bone41.setRotationPoint(26.037F, 3.4325F, -2.6326F);
			bone46.addChild(bone41);
			setRotationAngle(bone41, 0.0F, 1.9199F, 0.0F);
			bone41.setTextureOffset(85, 108).addBox(31.4345F, -43.9107F, -8.0396F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone41.setTextureOffset(173, 100).addBox(31.4345F, -46.9107F, -8.0396F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone13 = new ModelRenderer(this);
			bone13.setRotationPoint(12.4961F, 44.2388F, 1.6665F);
			bone46.addChild(bone13);
			setRotationAngle(bone13, -0.5672F, 0.0F, 0.0F);
			bone13.setTextureOffset(177, 100).addBox(-1.3727F, -51.4084F, -76.4344F, 8.0F, 4.0F, 10.0F, 0.0F, false);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(5.0F, -10.0F, -4.0F);
			Susanoo.addChild(bone8);
			setRotationAngle(bone8, -0.2182F, 0.0F, -1.5708F);
			bone8.setTextureOffset(37, 74).addBox(-27.0F, -27.0F, -26.0F, 9.0F, 12.0F, 3.0F, 0.0F, false);
			bone8.setTextureOffset(74, 190).addBox(-27.0F, -17.0F, -26.0F, 9.0F, 3.0F, 7.0F, 0.0F, false);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(0.0F, -9.3254F, 5.1026F);
			bone8.addChild(bone9);
			setRotationAngle(bone9, 0.3491F, 0.0F, 0.0F);
			bone9.setTextureOffset(0, 0).addBox(-20.0F, -24.0F, -22.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);
			bone72 = new ModelRenderer(this);
			bone72.setRotationPoint(-4.0F, 44.0F, 6.0F);
			Susanoo.addChild(bone72);
			bone72.setTextureOffset(183, 238).addBox(-1.0F, -78.0F, -16.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone73 = new ModelRenderer(this);
			bone73.setRotationPoint(0.0F, -74.0F, -16.0F);
			bone72.addChild(bone73);
			setRotationAngle(bone73, -0.7854F, 0.0F, 0.0F);
			bone73.setTextureOffset(197, 231).addBox(-1.0F, -9.8284F, -2.8284F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone76 = new ModelRenderer(this);
			bone76.setRotationPoint(-5.0F, 44.0F, 6.0F);
			Susanoo.addChild(bone76);
			setRotationAngle(bone76, 0.0F, 0.0F, 0.0873F);
			bone76.setTextureOffset(221, 0).addBox(-1.0F, -78.0F, -16.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone77 = new ModelRenderer(this);
			bone77.setRotationPoint(0.0F, -74.0F, -16.0F);
			bone76.addChild(bone77);
			setRotationAngle(bone77, -0.7854F, 0.0F, 0.0F);
			bone77.setTextureOffset(214, 135).addBox(-1.0F, -9.8284F, -2.8284F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone78 = new ModelRenderer(this);
			bone78.setRotationPoint(-20.0F, 41.0F, 7.0F);
			Susanoo.addChild(bone78);
			setRotationAngle(bone78, 0.0F, 0.0F, 0.3491F);
			bone78.setTextureOffset(214, 124).addBox(-1.0F, -78.0F, -16.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone79 = new ModelRenderer(this);
			bone79.setRotationPoint(0.0F, -74.0F, -16.0F);
			bone78.addChild(bone79);
			setRotationAngle(bone79, -0.7854F, 0.0F, 0.0F);
			bone79.setTextureOffset(37, 190).addBox(-1.0F, -9.8284F, -2.8284F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone80 = new ModelRenderer(this);
			bone80.setRotationPoint(24.0F, 39.0F, 6.0F);
			Susanoo.addChild(bone80);
			setRotationAngle(bone80, 0.0F, 0.0F, -0.4363F);
			bone80.setTextureOffset(184, 156).addBox(-1.0F, -78.0F, -16.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone81 = new ModelRenderer(this);
			bone81.setRotationPoint(0.0F, -74.0F, -16.0F);
			bone80.addChild(bone81);
			setRotationAngle(bone81, -0.7854F, 0.0F, 0.0F);
			bone81.setTextureOffset(162, 0).addBox(-1.0F, -9.8284F, -2.8284F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone45 = new ModelRenderer(this);
			bone45.setRotationPoint(0.0F, 35.0F, 0.0F);
			Susanoo.addChild(bone45);
			bone45.setTextureOffset(212, 467).addBox(-19.0F, -52.0F, -22.0F, 3.0F, 40.0F, 3.0F, 0.0F, false);
			bone45.setTextureOffset(200, 462).addBox(-21.0F, -51.0F, -20.0F, 2.0F, 27.0F, 0.0F, 0.0F, false);
			bone48 = new ModelRenderer(this);
			bone48.setRotationPoint(-18.0F, 2.0F, -20.0F);
			bone45.addChild(bone48);
			setRotationAngle(bone48, 0.0F, 3.1416F, 0.0F);
			bone48.setTextureOffset(200, 462).addBox(-4.0F, -52.0F, 1.0F, 2.0F, 27.0F, 0.0F, 0.0F, false);
			bone47 = new ModelRenderer(this);
			bone47.setRotationPoint(0.0F, 35.0F, 0.0F);
			Susanoo.addChild(bone47);
			bone47.setTextureOffset(465, 409).addBox(-40.0F, -26.0F, -26.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
			bone47.setTextureOffset(465, 409).addBox(-40.0F, -39.0F, -26.0F, 12.0F, 11.0F, 12.0F, 0.0F, false);
			bone47.setTextureOffset(486, 414).addBox(-36.0F, -42.0F, -22.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);
			bone47.setTextureOffset(420, 414).addBox(-39.0F, -33.0F, -25.0F, 10.0F, 14.0F, 10.0F, 0.0F, false);
			bone49 = new ModelRenderer(this);
			bone49.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Susanoo.render(matrixStack, buffer, packedLight, packedOverlay);
			bone49.render(matrixStack, buffer, packedLight, packedOverlay);
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
