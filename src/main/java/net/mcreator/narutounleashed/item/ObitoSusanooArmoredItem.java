
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

import net.mcreator.narutounleashed.procedures.OSATickProcedure;
import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NarutoUnleashedModElements.ModElement.Tag
public class ObitoSusanooArmoredItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:obito_susanoo_armored_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:obito_susanoo_armored_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:obito_susanoo_armored_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:obito_susanoo_armored_boots")
	public static final Item boots = null;

	public ObitoSusanooArmoredItem(NarutoUnleashedModElements instance) {
		super(instance, 900);
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
				return "obito_susanoo_armored";
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
				armorModel.bipedBody = new Models_kakashi3().susanoo;
				armorModel.bipedLeftArm = new Models_kakashi3().bone74;
				armorModel.bipedRightArm = new Models_kakashi3().bone74;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/s_kakashi3.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				OSATickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("obito_susanoo_armored_chestplate"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Models_kakashi3 extends EntityModel<Entity> {
		private final ModelRenderer susanoo;
		private final ModelRenderer unknown_bone;
		private final ModelRenderer unknown_bone_r1;
		private final ModelRenderer unknown_bone_r2;
		private final ModelRenderer unknown_bone_r3;
		private final ModelRenderer unknown_bone_r4;
		private final ModelRenderer unknown_bone_r5;
		private final ModelRenderer unknown_bone_r6;
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
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone86;
		private final ModelRenderer bone9;
		private final ModelRenderer bone8;
		private final ModelRenderer bone87;
		private final ModelRenderer bone2;
		private final ModelRenderer bone7;
		private final ModelRenderer bone11;
		private final ModelRenderer bone14;
		private final ModelRenderer bone15;
		private final ModelRenderer bone41;
		private final ModelRenderer bone13;
		private final ModelRenderer bone10;
		private final ModelRenderer bone82;
		private final ModelRenderer bone83;
		private final ModelRenderer bone84;
		private final ModelRenderer bone85;
		private final ModelRenderer bone42;
		private final ModelRenderer bone43;
		private final ModelRenderer bone44;
		private final ModelRenderer bone45;
		private final ModelRenderer bone46;
		private final ModelRenderer bone47;
		private final ModelRenderer bone48;
		private final ModelRenderer bone49;
		private final ModelRenderer bone50;
		private final ModelRenderer bone51;
		private final ModelRenderer bone61;
		private final ModelRenderer bone62;
		private final ModelRenderer bone63;
		private final ModelRenderer bone64;
		private final ModelRenderer bone65;
		private final ModelRenderer bone66;
		private final ModelRenderer bone67;
		private final ModelRenderer bone68;
		private final ModelRenderer bone69;
		private final ModelRenderer bone52;
		private final ModelRenderer bone53;
		private final ModelRenderer bone54;
		private final ModelRenderer bone55;
		private final ModelRenderer bone56;
		private final ModelRenderer bone57;
		private final ModelRenderer bone58;
		private final ModelRenderer bone59;
		private final ModelRenderer bone60;
		private final ModelRenderer bone72;
		private final ModelRenderer bone73;
		private final ModelRenderer bone76;
		private final ModelRenderer bone77;
		private final ModelRenderer bone78;
		private final ModelRenderer bone79;
		private final ModelRenderer bone80;
		private final ModelRenderer bone81;
		private final ModelRenderer bone74;

		public Models_kakashi3() {
			textureWidth = 512;
			textureHeight = 512;
			susanoo = new ModelRenderer(this);
			susanoo.setRotationPoint(0.0F, -5.75F, 0.0F);
			unknown_bone = new ModelRenderer(this);
			unknown_bone.setRotationPoint(-38.6125F, -7.75F, -14.4766F);
			susanoo.addChild(unknown_bone);
			setRotationAngle(unknown_bone, 1.5708F, 0.0F, 0.0F);
			unknown_bone_r1 = new ModelRenderer(this);
			unknown_bone_r1.setRotationPoint(1.313F, 0.5F, -3.7233F);
			unknown_bone.addChild(unknown_bone_r1);
			setRotationAngle(unknown_bone_r1, 0.0F, 1.1781F, 0.0F);
			unknown_bone_r1.setTextureOffset(1, 0).addBox(-3.0F, -1.0F, 4.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			unknown_bone_r2 = new ModelRenderer(this);
			unknown_bone_r2.setRotationPoint(-0.5185F, 0.5F, 0.5564F);
			unknown_bone.addChild(unknown_bone_r2);
			setRotationAngle(unknown_bone_r2, 0.0F, 0.3927F, 0.0F);
			unknown_bone_r2.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			unknown_bone_r3 = new ModelRenderer(this);
			unknown_bone_r3.setRotationPoint(2.4634F, 0.5F, 0.0276F);
			unknown_bone.addChild(unknown_bone_r3);
			setRotationAngle(unknown_bone_r3, 0.0F, -1.309F, 0.0F);
			unknown_bone_r3.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			unknown_bone_r4 = new ModelRenderer(this);
			unknown_bone_r4.setRotationPoint(2.2453F, 0.5F, -4.9676F);
			unknown_bone.addChild(unknown_bone_r4);
			setRotationAngle(unknown_bone_r4, 0.0F, 0.0436F, 0.0F);
			unknown_bone_r4.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			unknown_bone_r5 = new ModelRenderer(this);
			unknown_bone_r5.setRotationPoint(-0.6158F, 0.5F, -5.8697F);
			unknown_bone.addChild(unknown_bone_r5);
			setRotationAngle(unknown_bone_r5, 0.0F, 1.2654F, 0.0F);
			unknown_bone_r5.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			unknown_bone_r6 = new ModelRenderer(this);
			unknown_bone_r6.setRotationPoint(1.6125F, 0.5F, -1.5234F);
			unknown_bone.addChild(unknown_bone_r6);
			setRotationAngle(unknown_bone_r6, 0.0F, 0.9599F, 0.0F);
			unknown_bone_r6.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(1.9F, 17.75F, 0.0F);
			susanoo.addChild(bone);
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
			bone70.setTextureOffset(172, 29).addBox(2.7695F, -54.9914F, -11.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			bone71 = new ModelRenderer(this);
			bone71.setRotationPoint(-5.0F, 1.0F, 0.0F);
			bone40.addChild(bone71);
			setRotationAngle(bone71, 0.0F, 0.0F, 0.0436F);
			bone71.setTextureOffset(164, 75).addBox(2.7695F, -54.9914F, -11.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
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
			bone86 = new ModelRenderer(this);
			bone86.setRotationPoint(0.0F, -1.9F, 0.0F);
			bone40.addChild(bone86);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(-7.84F, 2.24F, 0.0F);
			bone86.addChild(bone9);
			setRotationAngle(bone9, 0.0F, 0.4712F, 0.0F);
			bone9.setTextureOffset(376, 388).addBox(10.841F, -60.24F, -9.594F, 5.0F, 2.0F, 6.0F, 0.0F, false);
			bone9.setTextureOffset(376, 388).addBox(10.841F, -59.68F, -10.042F, 6.0F, 2.0F, 6.0F, 0.0F, false);
			bone9.setTextureOffset(376, 388).addBox(17.113F, -59.68F, -8.922F, 0.0F, 3.0F, 1.0F, 0.0F, false);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(0.0F, 2.24F, 0.0F);
			bone86.addChild(bone8);
			setRotationAngle(bone8, 0.0F, -0.48F, 0.0F);
			bone8.setTextureOffset(376, 388).addBox(-10.8925F, -59.68F, -13.405F, 6.0F, 2.0F, 6.0F, 0.0F, false);
			bone8.setTextureOffset(376, 388).addBox(-10.8925F, -59.68F, -12.285F, 0.0F, 3.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(376, 388).addBox(-9.3245F, -60.24F, -12.957F, 5.0F, 2.0F, 6.0F, 0.0F, false);
			bone87 = new ModelRenderer(this);
			bone87.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone86.addChild(bone87);
			bone87.setTextureOffset(376, 388).addBox(-3.472F, -57.44F, -16.92F, 6.0F, 2.0F, 6.0F, 0.0F, false);
			bone87.setTextureOffset(376, 388).addBox(-2.24F, -58.0F, -15.8F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			bone87.setTextureOffset(261, 247).addBox(-0.784F, -57.44F, -16.92F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			bone87.setTextureOffset(248, 241).addBox(-2.352F, -57.44F, -16.92F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(11.9F, 19.75F, 1.0F);
			susanoo.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 0.0F, -0.4363F);
			bone2.setTextureOffset(74, 300).addBox(11.0F, -30.0F, -6.0F, 10.0F, 29.0F, 11.0F, 0.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(-48.1F, 19.75F, 1.0F);
			susanoo.addChild(bone7);
			setRotationAngle(bone7, 0.0F, 0.0F, 0.4363F);
			bone7.setTextureOffset(148, 266).addBox(11.9665F, -51.3725F, -6.0F, 10.0F, 35.0F, 11.0F, 0.0F, false);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(25.5897F, 8.6982F, 27.0F);
			bone7.addChild(bone11);
			setRotationAngle(bone11, 0.3054F, 0.8727F, 0.0F);
			bone11.setTextureOffset(174, 296).addBox(10.1234F, -41.8132F, -29.3251F, 11.0F, 11.0F, 16.0F, 0.0F, false);
			bone11.setTextureOffset(286, 142).addBox(11.1234F, -40.8132F, -37.3251F, 9.0F, 4.0F, 20.0F, 0.0F, false);
			bone11.setTextureOffset(169, 75).addBox(16.1234F, -40.8132F, -42.3251F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone11.setTextureOffset(147, 41).addBox(16.1234F, -44.8132F, -42.3251F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			bone11.setTextureOffset(161, 107).addBox(13.1234F, -40.8132F, -42.3251F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone11.setTextureOffset(62, 6).addBox(13.1234F, -44.8132F, -42.3251F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			bone14 = new ModelRenderer(this);
			bone14.setRotationPoint(-11.0687F, 3.6914F, -14.9952F);
			bone11.addChild(bone14);
			setRotationAngle(bone14, 0.0F, -0.3054F, 0.0F);
			bone14.setTextureOffset(155, 75).addBox(21.0337F, -44.5047F, -34.676F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone14.setTextureOffset(180, 29).addBox(21.0337F, -47.5047F, -34.676F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone15 = new ModelRenderer(this);
			bone15.setRotationPoint(-11.0687F, 3.6914F, -14.9952F);
			bone11.addChild(bone15);
			setRotationAngle(bone15, 0.0F, 0.3054F, 0.0F);
			bone15.setTextureOffset(85, 149).addBox(27.8797F, -44.5047F, -18.6231F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone15.setTextureOffset(177, 105).addBox(27.8797F, -47.5047F, -18.6231F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone41 = new ModelRenderer(this);
			bone41.setRotationPoint(7.9739F, 4.0277F, -1.0932F);
			bone11.addChild(bone41);
			setRotationAngle(bone41, 0.0F, 1.0036F, 0.0F);
			bone41.setTextureOffset(85, 108).addBox(27.8796F, -44.5047F, -18.6231F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone41.setTextureOffset(173, 100).addBox(27.8796F, -47.5047F, -18.6231F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone13 = new ModelRenderer(this);
			bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone11.addChild(bone13);
			setRotationAngle(bone13, -0.5672F, 0.0F, 0.0F);
			bone13.setTextureOffset(177, 100).addBox(11.1234F, -14.9932F, -51.2594F, 8.0F, 4.0F, 10.0F, 0.0F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(19.5199F, 3.2533F, 27.0F);
			bone7.addChild(bone10);
			setRotationAngle(bone10, 0.2098F, -0.8036F, -0.387F);
			bone10.setTextureOffset(174, 296).addBox(13.1585F, -42.4866F, -64.9733F, 11.0F, 11.0F, 16.0F, 0.0F, false);
			bone10.setTextureOffset(286, 142).addBox(14.1585F, -41.4866F, -72.9733F, 9.0F, 4.0F, 20.0F, 0.0F, false);
			bone10.setTextureOffset(169, 75).addBox(19.1585F, -41.4866F, -77.9733F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone10.setTextureOffset(147, 41).addBox(19.1585F, -45.4866F, -77.9733F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			bone10.setTextureOffset(164, 100).addBox(16.1585F, -41.4866F, -77.9733F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone10.setTextureOffset(62, 6).addBox(16.1585F, -45.4866F, -77.9733F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			bone82 = new ModelRenderer(this);
			bone82.setRotationPoint(-11.0687F, 3.6914F, -14.9952F);
			bone10.addChild(bone82);
			setRotationAngle(bone82, 0.0F, -0.3054F, 0.0F);
			bone82.setTextureOffset(155, 75).addBox(13.2088F, -45.1781F, -69.587F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone82.setTextureOffset(180, 29).addBox(13.2088F, -48.1781F, -69.587F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone83 = new ModelRenderer(this);
			bone83.setRotationPoint(-11.0687F, 3.6914F, -14.9952F);
			bone10.addChild(bone83);
			setRotationAngle(bone83, 0.0F, 0.3054F, 0.0F);
			bone83.setTextureOffset(85, 149).addBox(41.494F, -45.1781F, -51.7087F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone83.setTextureOffset(177, 105).addBox(41.494F, -48.1781F, -51.7087F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone84 = new ModelRenderer(this);
			bone84.setRotationPoint(-38.548F, 4.2318F, -97.4837F);
			bone10.addChild(bone84);
			setRotationAngle(bone84, 0.0F, -0.9076F, 0.0F);
			bone84.setTextureOffset(85, 108).addBox(59.5759F, -45.1781F, -35.217F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			bone84.setTextureOffset(173, 100).addBox(59.5759F, -48.1781F, -35.217F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone85 = new ModelRenderer(this);
			bone85.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone10.addChild(bone85);
			setRotationAngle(bone85, -0.5672F, 0.0F, 0.0F);
			bone85.setTextureOffset(177, 100).addBox(14.1585F, 3.5926F, -81.6866F, 8.0F, 4.0F, 10.0F, 0.0F, false);
			bone42 = new ModelRenderer(this);
			bone42.setRotationPoint(-3.0F, 25.75F, -5.0F);
			susanoo.addChild(bone42);
			bone43 = new ModelRenderer(this);
			bone43.setRotationPoint(-5.3945F, -49.669F, 22.1114F);
			bone42.addChild(bone43);
			bone44 = new ModelRenderer(this);
			bone44.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone43.addChild(bone44);
			bone44.setTextureOffset(49, 261).addBox(-1.1856F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone45 = new ModelRenderer(this);
			bone45.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone43.addChild(bone45);
			setRotationAngle(bone45, 0.0F, -0.3927F, 0.0F);
			bone45.setTextureOffset(49, 261).addBox(-1.1856F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone46 = new ModelRenderer(this);
			bone46.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone43.addChild(bone46);
			setRotationAngle(bone46, 0.0F, -0.7854F, 0.0F);
			bone46.setTextureOffset(49, 261).addBox(-1.1856F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone47 = new ModelRenderer(this);
			bone47.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone43.addChild(bone47);
			setRotationAngle(bone47, 0.0F, -1.1781F, 0.0F);
			bone47.setTextureOffset(49, 261).addBox(-1.1856F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone48 = new ModelRenderer(this);
			bone48.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone43.addChild(bone48);
			setRotationAngle(bone48, 0.0F, -1.5708F, 0.0F);
			bone48.setTextureOffset(49, 261).addBox(-1.1856F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone49 = new ModelRenderer(this);
			bone49.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone43.addChild(bone49);
			setRotationAngle(bone49, 0.0F, -1.9635F, 0.0F);
			bone49.setTextureOffset(49, 261).addBox(-1.1856F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone50 = new ModelRenderer(this);
			bone50.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone43.addChild(bone50);
			setRotationAngle(bone50, 0.0F, -2.3562F, 0.0F);
			bone50.setTextureOffset(49, 261).addBox(-1.1856F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone51 = new ModelRenderer(this);
			bone51.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone43.addChild(bone51);
			setRotationAngle(bone51, 0.0F, -2.7489F, 0.0F);
			bone51.setTextureOffset(49, 261).addBox(-1.1856F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone61 = new ModelRenderer(this);
			bone61.setRotationPoint(-5.3945F, -52.9887F, 22.1114F);
			bone42.addChild(bone61);
			setRotationAngle(bone61, 0.0F, 0.0F, 0.3927F);
			bone62 = new ModelRenderer(this);
			bone62.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone61.addChild(bone62);
			bone62.setTextureOffset(49, 261).addBox(-1.1856F, -2.6676F, -0.2964F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			bone63 = new ModelRenderer(this);
			bone63.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone61.addChild(bone63);
			setRotationAngle(bone63, 0.0F, -0.3927F, 0.0F);
			bone63.setTextureOffset(49, 261).addBox(-1.1856F, -2.6676F, -0.2964F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			bone64 = new ModelRenderer(this);
			bone64.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone61.addChild(bone64);
			setRotationAngle(bone64, 0.0F, -0.7854F, 0.0F);
			bone64.setTextureOffset(49, 261).addBox(-1.1856F, -2.6676F, -0.2964F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			bone65 = new ModelRenderer(this);
			bone65.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone61.addChild(bone65);
			setRotationAngle(bone65, 0.0F, -1.1781F, 0.0F);
			bone65.setTextureOffset(49, 261).addBox(-1.1856F, -2.6676F, -0.2964F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			bone66 = new ModelRenderer(this);
			bone66.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone61.addChild(bone66);
			setRotationAngle(bone66, 0.0F, -1.5708F, 0.0F);
			bone66.setTextureOffset(49, 261).addBox(-1.1856F, -2.6676F, -0.2964F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			bone67 = new ModelRenderer(this);
			bone67.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone61.addChild(bone67);
			setRotationAngle(bone67, 0.0F, -1.9635F, 0.0F);
			bone67.setTextureOffset(49, 261).addBox(-1.1856F, -2.6676F, -0.2964F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			bone68 = new ModelRenderer(this);
			bone68.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone61.addChild(bone68);
			setRotationAngle(bone68, 0.0F, -2.3562F, 0.0F);
			bone68.setTextureOffset(49, 261).addBox(-1.1856F, -2.6676F, -0.2964F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			bone69 = new ModelRenderer(this);
			bone69.setRotationPoint(0.5928F, -0.2964F, -29.3436F);
			bone61.addChild(bone69);
			setRotationAngle(bone69, 0.0F, -2.7489F, 0.0F);
			bone69.setTextureOffset(49, 261).addBox(-1.1856F, -2.6676F, -0.2964F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			bone52 = new ModelRenderer(this);
			bone52.setRotationPoint(-4.2089F, -46.705F, 26.261F);
			bone42.addChild(bone52);
			setRotationAngle(bone52, 0.0F, 0.0F, -0.3927F);
			bone53 = new ModelRenderer(this);
			bone53.setRotationPoint(0.8892F, -0.2964F, -33.4932F);
			bone52.addChild(bone53);
			bone53.setTextureOffset(49, 261).addBox(-1.482F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone54 = new ModelRenderer(this);
			bone54.setRotationPoint(0.8892F, -0.2964F, -33.4932F);
			bone52.addChild(bone54);
			setRotationAngle(bone54, 0.0F, -0.3927F, 0.0F);
			bone54.setTextureOffset(49, 261).addBox(-1.482F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone55 = new ModelRenderer(this);
			bone55.setRotationPoint(0.8892F, -0.2964F, -33.4932F);
			bone52.addChild(bone55);
			setRotationAngle(bone55, 0.0F, -0.7854F, 0.0F);
			bone55.setTextureOffset(49, 261).addBox(-1.482F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone56 = new ModelRenderer(this);
			bone56.setRotationPoint(0.8892F, -0.2964F, -33.4932F);
			bone52.addChild(bone56);
			setRotationAngle(bone56, 0.0F, -1.1781F, 0.0F);
			bone56.setTextureOffset(49, 261).addBox(-1.482F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone57 = new ModelRenderer(this);
			bone57.setRotationPoint(0.8892F, -0.2964F, -33.4932F);
			bone52.addChild(bone57);
			setRotationAngle(bone57, 0.0F, -1.5708F, 0.0F);
			bone57.setTextureOffset(49, 261).addBox(-1.482F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone58 = new ModelRenderer(this);
			bone58.setRotationPoint(0.8892F, -0.2964F, -33.4932F);
			bone52.addChild(bone58);
			setRotationAngle(bone58, 0.0F, -1.9635F, 0.0F);
			bone58.setTextureOffset(49, 261).addBox(-1.482F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone59 = new ModelRenderer(this);
			bone59.setRotationPoint(0.8892F, -0.2964F, -33.4932F);
			bone52.addChild(bone59);
			setRotationAngle(bone59, 0.0F, -2.3562F, 0.0F);
			bone59.setTextureOffset(49, 261).addBox(-1.482F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone60 = new ModelRenderer(this);
			bone60.setRotationPoint(0.8892F, -0.2964F, -33.4932F);
			bone52.addChild(bone60);
			setRotationAngle(bone60, 0.0F, -2.7489F, 0.0F);
			bone60.setTextureOffset(49, 261).addBox(-1.482F, -3.2604F, -0.2964F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone72 = new ModelRenderer(this);
			bone72.setRotationPoint(-4.0F, 38.75F, 6.0F);
			susanoo.addChild(bone72);
			bone72.setTextureOffset(183, 238).addBox(-1.0F, -78.0F, -16.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone73 = new ModelRenderer(this);
			bone73.setRotationPoint(0.0F, -74.0F, -16.0F);
			bone72.addChild(bone73);
			setRotationAngle(bone73, -0.7854F, 0.0F, 0.0F);
			bone73.setTextureOffset(197, 231).addBox(-1.0F, -9.8284F, -2.8284F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone76 = new ModelRenderer(this);
			bone76.setRotationPoint(-5.0F, 38.75F, 6.0F);
			susanoo.addChild(bone76);
			setRotationAngle(bone76, 0.0F, 0.0F, 0.0873F);
			bone76.setTextureOffset(221, 0).addBox(-1.0F, -78.0F, -16.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone77 = new ModelRenderer(this);
			bone77.setRotationPoint(0.0F, -74.0F, -16.0F);
			bone76.addChild(bone77);
			setRotationAngle(bone77, -0.7854F, 0.0F, 0.0F);
			bone77.setTextureOffset(214, 135).addBox(-1.0F, -9.8284F, -2.8284F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone78 = new ModelRenderer(this);
			bone78.setRotationPoint(-20.0F, 35.75F, 7.0F);
			susanoo.addChild(bone78);
			setRotationAngle(bone78, 0.0F, 0.0F, 0.3491F);
			bone78.setTextureOffset(214, 124).addBox(-1.0F, -78.0F, -16.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone79 = new ModelRenderer(this);
			bone79.setRotationPoint(0.0F, -74.0F, -16.0F);
			bone78.addChild(bone79);
			setRotationAngle(bone79, -0.7854F, 0.0F, 0.0F);
			bone79.setTextureOffset(37, 190).addBox(-1.0F, -9.8284F, -2.8284F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone80 = new ModelRenderer(this);
			bone80.setRotationPoint(24.0F, 33.75F, 6.0F);
			susanoo.addChild(bone80);
			setRotationAngle(bone80, 0.0F, 0.0F, -0.4363F);
			bone80.setTextureOffset(184, 156).addBox(-1.0F, -78.0F, -16.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone81 = new ModelRenderer(this);
			bone81.setRotationPoint(0.0F, -74.0F, -16.0F);
			bone80.addChild(bone81);
			setRotationAngle(bone81, -0.7854F, 0.0F, 0.0F);
			bone81.setTextureOffset(162, 0).addBox(-1.0F, -9.8284F, -2.8284F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone74 = new ModelRenderer(this);
			bone74.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			susanoo.render(matrixStack, buffer, packedLight, packedOverlay);
			bone74.render(matrixStack, buffer, packedLight, packedOverlay);
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
