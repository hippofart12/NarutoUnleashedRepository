
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

import net.mcreator.narutounleashed.procedures.SHISATickProcedure;
import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NarutoUnleashedModElements.ModElement.Tag
public class ShisuiSusanooArmoredItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:shisui_susanoo_armored_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:shisui_susanoo_armored_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:shisui_susanoo_armored_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:shisui_susanoo_armored_boots")
	public static final Item boots = null;

	public ShisuiSusanooArmoredItem(NarutoUnleashedModElements instance) {
		super(instance, 905);
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
				return "shisui_susanoo_armored";
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
				armorModel.bipedBody = new Models_shisui3().bone;
				armorModel.bipedLeftArm = new Models_shisui3().bone66;
				armorModel.bipedRightArm = new Models_shisui3().bone66;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/s_shisui3.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				SHISATickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("shisui_susanoo_armored_chestplate"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Models_shisui3 extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone28;
		private final ModelRenderer bone29;
		private final ModelRenderer bone34;
		private final ModelRenderer bone35;
		private final ModelRenderer bone36;
		private final ModelRenderer bone30;
		private final ModelRenderer bone31;
		private final ModelRenderer bone32;
		private final ModelRenderer bone33;
		private final ModelRenderer bone55;
		private final ModelRenderer bone56;
		private final ModelRenderer bone57;
		private final ModelRenderer bone58;
		private final ModelRenderer bone59;
		private final ModelRenderer bone60;
		private final ModelRenderer bone61;
		private final ModelRenderer bone62;
		private final ModelRenderer bone63;
		private final ModelRenderer bone46;
		private final ModelRenderer bone47;
		private final ModelRenderer bone48;
		private final ModelRenderer bone49;
		private final ModelRenderer bone50;
		private final ModelRenderer bone51;
		private final ModelRenderer bone52;
		private final ModelRenderer bone53;
		private final ModelRenderer bone54;
		private final ModelRenderer bone37;
		private final ModelRenderer bone38;
		private final ModelRenderer bone39;
		private final ModelRenderer bone40;
		private final ModelRenderer bone41;
		private final ModelRenderer bone42;
		private final ModelRenderer bone43;
		private final ModelRenderer bone44;
		private final ModelRenderer bone45;
		private final ModelRenderer bone21;
		private final ModelRenderer bone64;
		private final ModelRenderer bone26;
		private final ModelRenderer bone25;
		private final ModelRenderer bone23;
		private final ModelRenderer bone27;
		private final ModelRenderer bone24;
		private final ModelRenderer bone14;
		private final ModelRenderer bone15;
		private final ModelRenderer bone16;
		private final ModelRenderer bone17;
		private final ModelRenderer bone12;
		private final ModelRenderer bone13;
		private final ModelRenderer bone10;
		private final ModelRenderer bone11;
		private final ModelRenderer bone2;
		private final ModelRenderer bone9;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer bone5;
		private final ModelRenderer bone18;
		private final ModelRenderer bone19;
		private final ModelRenderer bone20;
		private final ModelRenderer bone22;
		private final ModelRenderer bone7;
		private final ModelRenderer bone8;
		private final ModelRenderer bone6;
		private final ModelRenderer bone65;
		private final ModelRenderer bone66;

		public Models_shisui3() {
			textureWidth = 512;
			textureHeight = 512;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -7.25F, 0.0F);
			bone.setTextureOffset(0, 0).addBox(-14.1F, -18.75F, -12.0F, 28.0F, 3.0F, 22.0F, 0.0F, false);
			bone.setTextureOffset(266, 73).addBox(11.9F, -31.75F, -3.7F, 17.0F, 16.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(102, 117).addBox(-8.4F, -52.05F, -6.0F, 17.0F, 16.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(126, 262).addBox(-28.5F, -30.65F, 1.6F, 17.0F, 16.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(0, 58).addBox(-8.1F, -32.75F, -15.0F, 16.0F, 14.0F, 22.0F, 0.0F, false);
			bone.setTextureOffset(100, 0).addBox(-7.1F, -18.75F, -15.0F, 14.0F, 1.0F, 22.0F, 0.0F, false);
			bone.setTextureOffset(119, 119).addBox(-9.1F, -38.75F, -13.7F, 18.0F, 3.0F, 18.0F, 0.0F, false);
			bone.setTextureOffset(0, 25).addBox(-9.1F, -35.75F, -15.2F, 18.0F, 11.0F, 22.0F, 0.0F, false);
			bone.setTextureOffset(233, 116).addBox(-7.1F, -40.75F, -10.0F, 14.0F, 6.0F, 12.0F, 0.0F, false);
			bone.setTextureOffset(160, 262).addBox(-1.1F, -42.75F, -11.0F, 2.0F, 4.0F, 14.0F, 0.0F, false);
			bone28 = new ModelRenderer(this);
			bone28.setRotationPoint(-6.0F, 31.25F, 0.0F);
			bone.addChild(bone28);
			bone29 = new ModelRenderer(this);
			bone29.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone28.addChild(bone29);
			bone29.setTextureOffset(152, 236).addBox(-10.88F, -22.24F, -2.24F, 13.0F, 22.0F, 4.0F, 0.0F, false);
			bone34 = new ModelRenderer(this);
			bone34.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone28.addChild(bone34);
			setRotationAngle(bone34, 0.0F, 0.3927F, 0.0F);
			bone34.setTextureOffset(32, 255).addBox(-10.88F, -22.24F, -2.24F, 12.0F, 22.0F, 4.0F, 0.0F, false);
			bone35 = new ModelRenderer(this);
			bone35.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone28.addChild(bone35);
			setRotationAngle(bone35, 0.0F, 0.7854F, 0.0F);
			bone35.setTextureOffset(253, 134).addBox(-10.88F, -22.24F, -2.24F, 12.0F, 22.0F, 4.0F, 0.0F, false);
			bone36 = new ModelRenderer(this);
			bone36.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone28.addChild(bone36);
			setRotationAngle(bone36, 0.0F, 1.1781F, 0.0F);
			bone36.setTextureOffset(250, 250).addBox(-10.88F, -22.24F, -2.24F, 12.0F, 22.0F, 4.0F, 0.0F, false);
			bone30 = new ModelRenderer(this);
			bone30.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone28.addChild(bone30);
			setRotationAngle(bone30, 0.0F, -0.3927F, 0.0F);
			bone30.setTextureOffset(256, 160).addBox(-10.88F, -22.24F, -2.24F, 12.0F, 22.0F, 4.0F, 0.0F, false);
			bone31 = new ModelRenderer(this);
			bone31.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone28.addChild(bone31);
			setRotationAngle(bone31, 0.0F, -0.7854F, 0.0F);
			bone31.setTextureOffset(96, 262).addBox(-10.88F, -22.24F, -2.24F, 11.0F, 22.0F, 4.0F, 0.0F, false);
			bone32 = new ModelRenderer(this);
			bone32.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone28.addChild(bone32);
			setRotationAngle(bone32, 0.0F, -1.1781F, 0.0F);
			bone32.setTextureOffset(64, 256).addBox(-10.88F, -22.24F, -2.24F, 12.0F, 22.0F, 4.0F, 0.0F, false);
			bone33 = new ModelRenderer(this);
			bone33.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone28.addChild(bone33);
			setRotationAngle(bone33, 0.0F, -1.5708F, 0.0F);
			bone33.setTextureOffset(142, 57).addBox(-10.88F, -22.24F, -6.24F, 21.0F, 22.0F, 8.0F, 0.0F, false);
			bone55 = new ModelRenderer(this);
			bone55.setRotationPoint(-6.0F, 12.25F, 0.0F);
			bone.addChild(bone55);
			bone56 = new ModelRenderer(this);
			bone56.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone55.addChild(bone56);
			bone56.setTextureOffset(92, 188).addBox(-12.344F, -22.912F, -2.912F, 17.0F, 29.0F, 5.0F, 0.0F, false);
			bone57 = new ModelRenderer(this);
			bone57.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone55.addChild(bone57);
			setRotationAngle(bone57, 0.0F, 0.3927F, 0.0F);
			bone57.setTextureOffset(200, 48).addBox(-12.344F, -22.912F, -2.912F, 16.0F, 29.0F, 5.0F, 0.0F, false);
			bone58 = new ModelRenderer(this);
			bone58.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone55.addChild(bone58);
			setRotationAngle(bone58, 0.0F, 0.7854F, 0.0F);
			bone58.setTextureOffset(40, 221).addBox(-12.344F, -22.912F, -2.912F, 15.0F, 29.0F, 5.0F, 0.0F, false);
			bone59 = new ModelRenderer(this);
			bone59.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone55.addChild(bone59);
			setRotationAngle(bone59, 0.0F, 1.1781F, 0.0F);
			bone59.setTextureOffset(216, 180).addBox(-12.344F, -22.912F, -2.912F, 15.0F, 29.0F, 5.0F, 0.0F, false);
			bone60 = new ModelRenderer(this);
			bone60.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone55.addChild(bone60);
			setRotationAngle(bone60, 0.0F, -0.3927F, 0.0F);
			bone60.setTextureOffset(216, 216).addBox(-12.344F, -22.912F, -2.912F, 15.0F, 29.0F, 5.0F, 0.0F, false);
			bone61 = new ModelRenderer(this);
			bone61.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone55.addChild(bone61);
			setRotationAngle(bone61, 0.0F, -0.7854F, 0.0F);
			bone61.setTextureOffset(228, 82).addBox(-12.344F, -22.912F, -2.912F, 14.0F, 29.0F, 5.0F, 0.0F, false);
			bone62 = new ModelRenderer(this);
			bone62.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone55.addChild(bone62);
			setRotationAngle(bone62, 0.0F, -1.1781F, 0.0F);
			bone62.setTextureOffset(213, 146).addBox(-12.344F, -22.912F, -2.912F, 15.0F, 29.0F, 5.0F, 0.0F, false);
			bone63 = new ModelRenderer(this);
			bone63.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone55.addChild(bone63);
			setRotationAngle(bone63, 0.0F, -1.5708F, 0.0F);
			bone63.setTextureOffset(80, 25).addBox(-12.344F, -22.912F, -8.112F, 24.0F, 29.0F, 11.0F, 0.0F, false);
			bone46 = new ModelRenderer(this);
			bone46.setRotationPoint(42.6F, 12.25F, 0.0F);
			bone.addChild(bone46);
			setRotationAngle(bone46, -3.1416F, 0.0F, 3.1416F);
			bone47 = new ModelRenderer(this);
			bone47.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone46.addChild(bone47);
			bone47.setTextureOffset(48, 187).addBox(23.7984F, -22.912F, -0.416F, 17.0F, 29.0F, 5.0F, 0.0F, false);
			bone48 = new ModelRenderer(this);
			bone48.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone46.addChild(bone48);
			setRotationAngle(bone48, 0.0F, 0.3927F, 0.0F);
			bone48.setTextureOffset(191, 112).addBox(20.092F, -22.912F, 13.2251F, 16.0F, 29.0F, 5.0F, 0.0F, false);
			bone49 = new ModelRenderer(this);
			bone49.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone46.addChild(bone49);
			setRotationAngle(bone49, 0.0F, 0.7854F, 0.0F);
			bone49.setTextureOffset(208, 0).addBox(11.4476F, -22.912F, 24.4095F, 15.0F, 29.0F, 5.0F, 0.0F, false);
			bone50 = new ModelRenderer(this);
			bone50.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone46.addChild(bone50);
			setRotationAngle(bone50, 0.0F, 1.1781F, 0.0F);
			bone50.setTextureOffset(0, 205).addBox(-0.8189F, -22.912F, 31.4344F, 15.0F, 29.0F, 5.0F, 0.0F, false);
			bone51 = new ModelRenderer(this);
			bone51.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone46.addChild(bone51);
			setRotationAngle(bone51, 0.0F, -0.3927F, 0.0F);
			bone51.setTextureOffset(176, 202).addBox(22.0024F, -22.912F, -14.4371F, 15.0F, 29.0F, 5.0F, 0.0F, false);
			bone52 = new ModelRenderer(this);
			bone52.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone46.addChild(bone52);
			setRotationAngle(bone52, 0.0F, -0.7854F, 0.0F);
			bone52.setTextureOffset(80, 222).addBox(14.9775F, -22.912F, -26.7036F, 14.0F, 29.0F, 5.0F, 0.0F, false);
			bone53 = new ModelRenderer(this);
			bone53.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone46.addChild(bone53);
			setRotationAngle(bone53, 0.0F, -1.1781F, 0.0F);
			bone53.setTextureOffset(136, 202).addBox(3.7931F, -22.912F, -35.3481F, 15.0F, 29.0F, 5.0F, 0.0F, false);
			bone54 = new ModelRenderer(this);
			bone54.setRotationPoint(-1.8832F, -6.416F, -1.248F);
			bone46.addChild(bone54);
			setRotationAngle(bone54, 0.0F, -1.5708F, 0.0F);
			bone54.setTextureOffset(76, 76).addBox(-9.848F, -22.912F, -44.2544F, 24.0F, 29.0F, 11.0F, 0.0F, false);
			bone37 = new ModelRenderer(this);
			bone37.setRotationPoint(17.0F, 31.25F, 0.0F);
			bone.addChild(bone37);
			setRotationAngle(bone37, -3.1416F, 0.0F, 3.1416F);
			bone38 = new ModelRenderer(this);
			bone38.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone37.addChild(bone38);
			bone38.setTextureOffset(118, 236).addBox(-0.232F, -22.24F, -0.32F, 13.0F, 22.0F, 4.0F, 0.0F, false);
			bone39 = new ModelRenderer(this);
			bone39.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone37.addChild(bone39);
			setRotationAngle(bone39, 0.0F, 0.3927F, 0.0F);
			bone39.setTextureOffset(218, 250).addBox(-1.7773F, -22.24F, 3.6087F, 12.0F, 22.0F, 4.0F, 0.0F, false);
			bone40 = new ModelRenderer(this);
			bone40.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone37.addChild(bone40);
			setRotationAngle(bone40, 0.0F, 0.7854F, 0.0F);
			bone40.setTextureOffset(248, 0).addBox(-4.7084F, -22.24F, 6.6469F, 12.0F, 22.0F, 4.0F, 0.0F, false);
			bone41 = new ModelRenderer(this);
			bone41.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone37.addChild(bone41);
			setRotationAngle(bone41, 0.0F, 1.1781F, 0.0F);
			bone41.setTextureOffset(186, 246).addBox(-8.579F, -22.24F, 8.3322F, 12.0F, 22.0F, 4.0F, 0.0F, false);
			bone42 = new ModelRenderer(this);
			bone42.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone37.addChild(bone42);
			setRotationAngle(bone42, 0.0F, -0.3927F, 0.0F);
			bone42.setTextureOffset(242, 47).addBox(-0.3078F, -22.24F, -4.541F, 12.0F, 22.0F, 4.0F, 0.0F, false);
			bone43 = new ModelRenderer(this);
			bone43.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone37.addChild(bone43);
			setRotationAngle(bone43, 0.0F, -0.7854F, 0.0F);
			bone43.setTextureOffset(256, 216).addBox(-1.9931F, -22.24F, -8.4116F, 11.0F, 22.0F, 4.0F, 0.0F, false);
			bone44 = new ModelRenderer(this);
			bone44.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone37.addChild(bone44);
			setRotationAngle(bone44, 0.0F, -1.1781F, 0.0F);
			bone44.setTextureOffset(0, 239).addBox(-5.0313F, -22.24F, -11.3427F, 12.0F, 22.0F, 4.0F, 0.0F, false);
			bone45 = new ModelRenderer(this);
			bone45.setRotationPoint(-0.064F, -0.32F, -0.96F);
			bone37.addChild(bone45);
			setRotationAngle(bone45, 0.0F, -1.5708F, 0.0F);
			bone45.setTextureOffset(119, 140).addBox(-8.96F, -22.24F, -16.888F, 21.0F, 22.0F, 8.0F, 0.0F, false);
			bone21 = new ModelRenderer(this);
			bone21.setRotationPoint(-1.0F, 31.25F, -3.0F);
			bone.addChild(bone21);
			setRotationAngle(bone21, 0.0F, -0.1309F, 0.0F);
			bone21.setTextureOffset(266, 98).addBox(0.8608F, -33.0F, -12.2974F, 17.0F, 6.0F, 3.0F, 0.0F, false);
			bone21.setTextureOffset(146, 87).addBox(0.8608F, -40.0F, -12.2974F, 17.0F, 6.0F, 3.0F, 0.0F, false);
			bone64 = new ModelRenderer(this);
			bone64.setRotationPoint(8.9316F, 0.0F, 1.9558F);
			bone21.addChild(bone64);
			setRotationAngle(bone64, 0.0F, 0.0F, -0.1309F);
			bone64.setTextureOffset(86, 65).addBox(-2.7991F, -47.2068F, -14.2944F, 17.0F, 6.0F, 3.0F, 0.0F, false);
			bone26 = new ModelRenderer(this);
			bone26.setRotationPoint(2.0F, 25.25F, -3.0F);
			bone.addChild(bone26);
			setRotationAngle(bone26, 0.0F, -0.1309F, -0.0873F);
			bone25 = new ModelRenderer(this);
			bone25.setRotationPoint(-4.0F, 37.25F, -3.0F);
			bone.addChild(bone25);
			setRotationAngle(bone25, 0.0F, -0.1309F, 0.0873F);
			bone25.setTextureOffset(266, 89).addBox(0.8217F, -33.0F, -12.5949F, 17.0F, 6.0F, 3.0F, 0.0F, false);
			bone23 = new ModelRenderer(this);
			bone23.setRotationPoint(-18.0F, 31.25F, -1.0F);
			bone.addChild(bone23);
			setRotationAngle(bone23, 0.0F, 0.1309F, 0.0F);
			bone23.setTextureOffset(262, 26).addBox(0.9F, -40.0F, -12.0F, 17.0F, 6.0F, 3.0F, 0.0F, false);
			bone23.setTextureOffset(256, 186).addBox(0.9F, -33.0F, -12.0F, 17.0F, 6.0F, 3.0F, 0.0F, false);
			bone27 = new ModelRenderer(this);
			bone27.setRotationPoint(-21.0F, 23.25F, -1.0F);
			bone.addChild(bone27);
			setRotationAngle(bone27, 0.0F, 0.1309F, 0.0873F);
			bone27.setTextureOffset(150, 48).addBox(0.9F, -40.0F, -12.0F, 17.0F, 6.0F, 3.0F, 0.0F, false);
			bone24 = new ModelRenderer(this);
			bone24.setRotationPoint(-19.0F, 31.25F, -1.0F);
			bone.addChild(bone24);
			setRotationAngle(bone24, 0.0F, 0.1309F, -0.0873F);
			bone24.setTextureOffset(150, 0).addBox(3.7966F, -24.5463F, -11.6187F, 17.0F, 6.0F, 3.0F, 0.0F, false);
			bone14 = new ModelRenderer(this);
			bone14.setRotationPoint(22.0F, 38.25F, 0.0F);
			bone.addChild(bone14);
			setRotationAngle(bone14, 0.0F, 0.0F, -0.2618F);
			bone14.setTextureOffset(0, 168).addBox(5.9F, -47.0F, -7.0F, 12.0F, 25.0F, 12.0F, 0.0F, false);
			bone15 = new ModelRenderer(this);
			bone15.setRotationPoint(-45.0F, 32.25F, 0.0F);
			bone.addChild(bone15);
			setRotationAngle(bone15, 0.0F, 0.0F, 0.2618F);
			bone15.setTextureOffset(165, 165).addBox(5.9F, -47.0F, -7.0F, 12.0F, 25.0F, 12.0F, 0.0F, false);
			bone16 = new ModelRenderer(this);
			bone16.setRotationPoint(-40.0F, 12.25F, -43.0F);
			bone.addChild(bone16);
			setRotationAngle(bone16, -1.4835F, 0.0F, 0.3054F);
			bone16.setTextureOffset(160, 11).addBox(5.9F, -47.0F, -7.0F, 12.0F, 25.0F, 12.0F, 0.0F, false);
			bone17 = new ModelRenderer(this);
			bone17.setRotationPoint(23.0F, 36.25F, -39.0F);
			bone.addChild(bone17);
			setRotationAngle(bone17, -1.0472F, 0.0F, -0.3054F);
			bone17.setTextureOffset(56, 150).addBox(5.9F, -47.0F, -7.0F, 12.0F, 25.0F, 12.0F, 0.0F, false);
			bone12 = new ModelRenderer(this);
			bone12.setRotationPoint(26.0F, 29.25F, 0.0F);
			bone.addChild(bone12);
			setRotationAngle(bone12, 0.0F, 0.0F, -0.3491F);
			bone12.setTextureOffset(51, 116).addBox(1.584F, -48.8794F, -9.0F, 17.0F, 17.0F, 17.0F, 0.0F, false);
			bone13 = new ModelRenderer(this);
			bone13.setRotationPoint(-43.0F, 23.25F, 0.0F);
			bone.addChild(bone13);
			setRotationAngle(bone13, 0.0F, 0.0F, 0.3491F);
			bone13.setTextureOffset(0, 94).addBox(0.216F, -48.8794F, -9.0F, 17.0F, 17.0F, 17.0F, 0.0F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(16.0F, 30.25F, -20.0F);
			bone.addChild(bone10);
			setRotationAngle(bone10, -0.3054F, 0.0F, -0.2618F);
			bone10.setTextureOffset(0, 58).addBox(-0.3588F, -63.0788F, -14.7095F, 8.0F, 3.0F, 2.0F, 0.0F, false);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(-24.0F, 28.25F, -20.0F);
			bone.addChild(bone11);
			setRotationAngle(bone11, -0.3054F, 0.0F, 0.2618F);
			bone11.setTextureOffset(0, 40).addBox(0.1588F, -63.0788F, -14.7095F, 8.0F, 3.0F, 2.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 28.25F, -15.0F);
			bone.addChild(bone2);
			setRotationAngle(bone2, -0.2618F, 0.0F, 0.0F);
			bone2.setTextureOffset(0, 25).addBox(-2.1F, -61.7412F, -14.9659F, 4.0F, 12.0F, 3.0F, 0.0F, false);
			bone2.setTextureOffset(0, 18).addBox(-3.1F, -51.7412F, -13.9659F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(0.0F, 28.25F, 18.0F);
			bone.addChild(bone9);
			setRotationAngle(bone9, 0.3491F, 0.0F, 0.0F);
			bone9.setTextureOffset(16, 0).addBox(3.9F, -60.0F, -15.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			bone9.setTextureOffset(58, 25).addBox(-5.1F, -58.658F, -14.0603F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			bone9.setTextureOffset(16, 16).addBox(-6.1F, -60.0F, -15.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(10.0F, 31.25F, 5.0F);
			bone.addChild(bone3);
			setRotationAngle(bone3, 0.0F, 0.7854F, 0.0F);
			bone3.setTextureOffset(242, 200).addBox(1.9F, -63.0F, -13.4142F, 7.0F, 2.0F, 14.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(-18.0F, 32.25F, -3.0F);
			bone.addChild(bone4);
			setRotationAngle(bone4, 0.0F, -0.7854F, 0.0F);
			bone4.setTextureOffset(78, 0).addBox(1.9F, -64.0F, -13.4142F, 7.0F, 2.0F, 14.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(-26.0F, 21.25F, 0.0F);
			bone.addChild(bone5);
			setRotationAngle(bone5, 0.0F, 0.0F, 0.5236F);
			bone5.setTextureOffset(51, 94).addBox(-2.466F, -71.366F, -11.0F, 2.0F, 5.0F, 10.0F, 0.0F, false);
			bone18 = new ModelRenderer(this);
			bone18.setRotationPoint(-3.0F, 38.25F, 8.0F);
			bone.addChild(bone18);
			setRotationAngle(bone18, 0.0436F, 0.0F, 0.3054F);
			bone18.setTextureOffset(152, 170).addBox(-31.0F, -29.0F, -25.0F, 2.0F, 27.0F, 2.0F, 0.0F, false);
			bone18.setTextureOffset(88, 171).addBox(-38.0F, -28.0F, -32.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);
			bone18.setTextureOffset(0, 136).addBox(-37.0F, -45.0F, -31.0F, 14.0F, 18.0F, 14.0F, 0.0F, false);
			bone18.setTextureOffset(130, 100).addBox(-38.0F, -45.0F, -32.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);
			bone19 = new ModelRenderer(this);
			bone19.setRotationPoint(-29.0F, -60.0F, -25.0F);
			bone18.addChild(bone19);
			setRotationAngle(bone19, 0.0F, -0.7854F, 0.0F);
			bone19.setTextureOffset(178, 87).addBox(-5.0F, 0.0F, -4.0F, 10.0F, 15.0F, 10.0F, 0.0F, false);
			bone19.setTextureOffset(208, 34).addBox(-6.0F, 0.0F, -5.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
			bone20 = new ModelRenderer(this);
			bone20.setRotationPoint(-29.0F, -75.0F, -25.0F);
			bone18.addChild(bone20);
			setRotationAngle(bone20, 0.0F, -1.5708F, 0.0F);
			bone20.setTextureOffset(0, 265).addBox(-3.0F, 0.0F, -3.0F, 7.0F, 15.0F, 7.0F, 0.0F, false);
			bone20.setTextureOffset(267, 36).addBox(-4.0F, 0.0F, -4.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
			bone22 = new ModelRenderer(this);
			bone22.setRotationPoint(-29.0F, -90.0F, -25.0F);
			bone18.addChild(bone22);
			setRotationAngle(bone22, 0.0F, -2.3562F, 0.0F);
			bone22.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(-48.0F, 2.25F, 0.0F);
			bone.addChild(bone7);
			setRotationAngle(bone7, 0.0F, 0.0F, 1.0036F);
			bone7.setTextureOffset(244, 26).addBox(-2.466F, -71.366F, -11.0F, 2.0F, 5.0F, 14.0F, 0.0F, false);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(36.0F, 22.25F, 0.0F);
			bone.addChild(bone8);
			setRotationAngle(bone8, 0.0F, 0.0F, -1.0036F);
			bone8.setTextureOffset(177, 146).addBox(23.6969F, -72.0731F, -11.0F, 2.0F, 5.0F, 14.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(29.0F, 20.25F, 0.0F);
			bone.addChild(bone6);
			setRotationAngle(bone6, 0.0F, 0.0F, -0.5236F);
			bone6.setTextureOffset(54, 58).addBox(-2.466F, -71.366F, -11.0F, 2.0F, 5.0F, 14.0F, 0.0F, false);
			bone65 = new ModelRenderer(this);
			bone65.setRotationPoint(0.0F, 31.25F, 0.0F);
			bone.addChild(bone65);
			bone65.setTextureOffset(446, 41).addBox(-4.0F, -44.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);
			bone66 = new ModelRenderer(this);
			bone66.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			bone66.render(matrixStack, buffer, packedLight, packedOverlay);
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
