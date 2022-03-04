
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

import net.mcreator.narutounleashed.procedures.ISSTickProcedure;
import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NarutoUnleashedModElements.ModElement.Tag
public class ItachiSusanooSkeletalItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:itachi_susanoo_skeletal_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:itachi_susanoo_skeletal_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:itachi_susanoo_skeletal_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:itachi_susanoo_skeletal_boots")
	public static final Item boots = null;

	public ItachiSusanooSkeletalItem(NarutoUnleashedModElements instance) {
		super(instance, 891);
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
				return "itachi_susanoo_skeletal";
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
				armorModel.bipedBody = new Models_itachi2().body;
				armorModel.bipedLeftArm = new Models_itachi2().bone6;
				armorModel.bipedRightArm = new Models_itachi2().bone6;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/s_itachi2.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				ISSTickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("itachi_susanoo_skeletal_chestplate"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Models_itachi2 extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer unknown_bone;
		private final ModelRenderer unknown_bone_r1;
		private final ModelRenderer unknown_bone_r2;
		private final ModelRenderer unknown_bone_r3;
		private final ModelRenderer unknown_bone_r4;
		private final ModelRenderer unknown_bone_r5;
		private final ModelRenderer unknown_bone2;
		private final ModelRenderer bone7;
		private final ModelRenderer bone7_r1;
		private final ModelRenderer bone7_r2;
		private final ModelRenderer bone7_r3;
		private final ModelRenderer bone7_r4;
		private final ModelRenderer bone7_r5;
		private final ModelRenderer bone7_r6;
		private final ModelRenderer bone7_r7;
		private final ModelRenderer bone7_r8;
		private final ModelRenderer bone7_r9;
		private final ModelRenderer bone7_r10;
		private final ModelRenderer bone7_r11;
		private final ModelRenderer bone7_r12;
		private final ModelRenderer bone7_r13;
		private final ModelRenderer bone7_r14;
		private final ModelRenderer bone7_r15;
		private final ModelRenderer bone7_r16;
		private final ModelRenderer bone7_r17;
		private final ModelRenderer bone;
		private final ModelRenderer bone_r1;
		private final ModelRenderer bone_r2;
		private final ModelRenderer bone2;
		private final ModelRenderer bone2_r1;
		private final ModelRenderer bone3;
		private final ModelRenderer bone3_r1;
		private final ModelRenderer bone4;
		private final ModelRenderer bone4_r1;
		private final ModelRenderer bone4_r2;
		private final ModelRenderer bone4_r3;
		private final ModelRenderer bone4_r4;
		private final ModelRenderer bone5;
		private final ModelRenderer bone5_r1;
		private final ModelRenderer bone5_r2;
		private final ModelRenderer bone5_r3;
		private final ModelRenderer bone5_r4;
		private final ModelRenderer bone6;

		public Models_itachi2() {
			textureWidth = 256;
			textureHeight = 256;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -3.25F, 0.0F);
			unknown_bone = new ModelRenderer(this);
			unknown_bone.setRotationPoint(0.0F, 27.25F, 0.0F);
			body.addChild(unknown_bone);
			unknown_bone_r1 = new ModelRenderer(this);
			unknown_bone_r1.setRotationPoint(-20.0F, -28.0F, -4.0F);
			unknown_bone.addChild(unknown_bone_r1);
			setRotationAngle(unknown_bone_r1, 0.0F, -0.5672F, -0.6109F);
			unknown_bone_r1.setTextureOffset(0, 0).addBox(-7.0F, -6.0F, -1.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			unknown_bone_r1.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, 0.0F, 17.0F, 3.0F, 3.0F, 0.0F, false);
			unknown_bone_r2 = new ModelRenderer(this);
			unknown_bone_r2.setRotationPoint(11.0F, -34.0F, 2.0F);
			unknown_bone.addChild(unknown_bone_r2);
			setRotationAngle(unknown_bone_r2, 0.3927F, 0.5672F, 0.6109F);
			unknown_bone_r2.setTextureOffset(0, 0).addBox(13.0F, -6.0F, -1.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			unknown_bone_r3 = new ModelRenderer(this);
			unknown_bone_r3.setRotationPoint(14.0F, -41.0F, -9.0F);
			unknown_bone.addChild(unknown_bone_r3);
			setRotationAngle(unknown_bone_r3, 1.309F, 0.7418F, 0.6109F);
			unknown_bone_r3.setTextureOffset(0, 0).addBox(7.0F, -9.0F, -10.0F, 4.0F, 7.0F, 2.0F, 0.0F, false);
			unknown_bone_r4 = new ModelRenderer(this);
			unknown_bone_r4.setRotationPoint(10.0F, -32.0F, -7.0F);
			unknown_bone.addChild(unknown_bone_r4);
			setRotationAngle(unknown_bone_r4, 0.2182F, 0.7418F, 0.6109F);
			unknown_bone_r4.setTextureOffset(0, 0).addBox(8.0F, -5.0F, -8.0F, 3.0F, 1.0F, 17.0F, 0.0F, false);
			unknown_bone_r4.setTextureOffset(0, 0).addBox(8.0F, -3.0F, -7.0F, 3.0F, 1.0F, 16.0F, 0.0F, false);
			unknown_bone_r5 = new ModelRenderer(this);
			unknown_bone_r5.setRotationPoint(11.0F, -34.0F, 2.0F);
			unknown_bone.addChild(unknown_bone_r5);
			setRotationAngle(unknown_bone_r5, 0.0F, 0.5672F, 0.6109F);
			unknown_bone_r5.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, 0.0F, 17.0F, 3.0F, 3.0F, 0.0F, false);
			unknown_bone2 = new ModelRenderer(this);
			unknown_bone2.setRotationPoint(0.0F, 27.25F, 0.0F);
			body.addChild(unknown_bone2);
			unknown_bone2.setTextureOffset(34, 34).addBox(-4.0F, -57.0F, 0.0F, 8.0F, 13.0F, 10.0F, 0.0F, false);
			unknown_bone2.setTextureOffset(0, 22).addBox(-4.0F, -56.0F, -1.0F, 8.0F, 16.0F, 9.0F, 0.0F, false);
			unknown_bone2.setTextureOffset(35, 13).addBox(-5.0F, -56.0F, 0.0F, 10.0F, 11.0F, 9.0F, 0.0F, false);
			unknown_bone2.setTextureOffset(40, 110).addBox(-3.0F, -56.0F, 10.0F, 6.0F, 10.0F, 1.0F, 0.0F, false);
			unknown_bone2.setTextureOffset(0, 47).addBox(-3.0F, -53.0F, 8.0F, 6.0F, 10.0F, 1.0F, 0.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(0.0F, 3.25F, 0.0F);
			body.addChild(bone7);
			bone7.setTextureOffset(58, 58).addBox(-2.0F, -7.0F, 7.0F, 4.0F, 31.0F, 3.0F, 0.0F, false);
			bone7.setTextureOffset(17, 84).addBox(-3.0F, -4.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			bone7.setTextureOffset(72, 82).addBox(-3.0F, 2.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			bone7.setTextureOffset(81, 21).addBox(-3.0F, 8.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			bone7.setTextureOffset(0, 79).addBox(-3.0F, 14.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			bone7.setTextureOffset(98, 18).addBox(-10.0F, -3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7.setTextureOffset(41, 98).addBox(1.0F, -3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7.setTextureOffset(78, 97).addBox(1.0F, 3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7.setTextureOffset(19, 97).addBox(1.0F, 9.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7.setTextureOffset(94, 49).addBox(-10.0F, 3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7.setTextureOffset(94, 6).addBox(-10.0F, 9.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r1 = new ModelRenderer(this);
			bone7_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone7.addChild(bone7_r1);
			setRotationAngle(bone7_r1, 0.0F, -2.5307F, 0.0F);
			bone7_r1.setTextureOffset(18, 103).addBox(1.0727F, -15.0F, 8.2298F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r1.setTextureOffset(72, 103).addBox(1.0727F, -21.0F, 8.2298F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r1.setTextureOffset(92, 105).addBox(1.0727F, -27.0F, 8.2298F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r2 = new ModelRenderer(this);
			bone7_r2.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone7.addChild(bone7_r2);
			setRotationAngle(bone7_r2, 0.0F, -0.8727F, 0.0F);
			bone7_r2.setTextureOffset(103, 24).addBox(-1.6948F, -15.0F, -12.27F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r2.setTextureOffset(38, 104).addBox(-1.6948F, -27.0F, -12.27F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r2.setTextureOffset(104, 37).addBox(-1.6948F, -21.0F, -12.27F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r3 = new ModelRenderer(this);
			bone7_r3.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone7.addChild(bone7_r3);
			setRotationAngle(bone7_r3, 0.0F, -1.6581F, 0.0F);
			bone7_r3.setTextureOffset(86, 60).addBox(-3.2637F, -15.0F, 10.301F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r3.setTextureOffset(91, 91).addBox(-3.2637F, -21.0F, 10.301F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r3.setTextureOffset(59, 92).addBox(-3.2637F, -27.0F, 10.301F, 9.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r4 = new ModelRenderer(this);
			bone7_r4.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone7.addChild(bone7_r4);
			setRotationAngle(bone7_r4, 0.0F, -1.5708F, 0.0F);
			bone7_r4.setTextureOffset(91, 12).addBox(-4.2683F, -15.0F, -12.6115F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r4.setTextureOffset(91, 31).addBox(-4.2683F, -21.0F, -12.6115F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r4.setTextureOffset(91, 80).addBox(-4.2683F, -27.0F, -12.6115F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r5 = new ModelRenderer(this);
			bone7_r5.setRotationPoint(-1.0F, 9.0F, 4.0F);
			bone7.addChild(bone7_r5);
			setRotationAngle(bone7_r5, 0.0F, -1.5708F, 0.0F);
			bone7_r5.setTextureOffset(92, 112).addBox(-2.2683F, -25.0F, -12.6115F, 6.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r6 = new ModelRenderer(this);
			bone7_r6.setRotationPoint(1.0F, 9.0F, 0.0F);
			bone7.addChild(bone7_r6);
			setRotationAngle(bone7_r6, 0.0F, -1.5708F, 0.0F);
			bone7_r6.setTextureOffset(86, 70).addBox(1.7317F, -26.0F, -12.6115F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			bone7_r7 = new ModelRenderer(this);
			bone7_r7.setRotationPoint(-22.0F, 9.0F, 0.0F);
			bone7.addChild(bone7_r7);
			setRotationAngle(bone7_r7, 0.0F, -1.5708F, 0.0F);
			bone7_r7.setTextureOffset(39, 87).addBox(1.7317F, -26.0F, -12.6115F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			bone7_r8 = new ModelRenderer(this);
			bone7_r8.setRotationPoint(-22.0F, 9.0F, 4.0F);
			bone7.addChild(bone7_r8);
			setRotationAngle(bone7_r8, 0.0F, -1.5708F, 0.0F);
			bone7_r8.setTextureOffset(112, 103).addBox(-2.2683F, -25.0F, -12.6115F, 6.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r9 = new ModelRenderer(this);
			bone7_r9.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone7.addChild(bone7_r9);
			setRotationAngle(bone7_r9, 0.0F, -1.1345F, 0.0F);
			bone7_r9.setTextureOffset(106, 97).addBox(-2.3728F, -15.0F, 10.6814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r9.setTextureOffset(55, 107).addBox(-2.3728F, -21.0F, 10.6814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r9.setTextureOffset(75, 109).addBox(-2.3728F, -27.0F, 10.6814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r10 = new ModelRenderer(this);
			bone7_r10.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone7.addChild(bone7_r10);
			setRotationAngle(bone7_r10, 0.0F, -2.0944F, 0.0F);
			bone7_r10.setTextureOffset(108, 0).addBox(-3.3666F, -15.0F, -12.814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r10.setTextureOffset(108, 43).addBox(-3.3666F, -21.0F, -12.814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r10.setTextureOffset(20, 109).addBox(-3.3666F, -27.0F, -12.814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r11 = new ModelRenderer(this);
			bone7_r11.setRotationPoint(-28.0F, 2.0F, -5.0F);
			bone7.addChild(bone7_r11);
			setRotationAngle(bone7_r11, 0.0F, 0.1745F, 0.6109F);
			bone7_r11.setTextureOffset(29, 6).addBox(3.0F, -25.0F, 7.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r12 = new ModelRenderer(this);
			bone7_r12.setRotationPoint(15.0F, 11.0F, -8.0F);
			bone7.addChild(bone7_r12);
			setRotationAngle(bone7_r12, 0.0F, -0.1745F, -0.6109F);
			bone7_r12.setTextureOffset(64, 15).addBox(2.0F, -25.0F, 7.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r13 = new ModelRenderer(this);
			bone7_r13.setRotationPoint(-25.0F, 4.0F, -2.0F);
			bone7.addChild(bone7_r13);
			setRotationAngle(bone7_r13, 0.0F, -0.1745F, 0.6109F);
			bone7_r13.setTextureOffset(29, 0).addBox(2.0F, -25.0F, 7.0F, 12.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r14 = new ModelRenderer(this);
			bone7_r14.setRotationPoint(13.0F, 13.0F, 0.0F);
			bone7.addChild(bone7_r14);
			setRotationAngle(bone7_r14, 0.0F, 0.2182F, -0.6109F);
			bone7_r14.setTextureOffset(69, 54).addBox(1.0F, -25.0F, 7.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r15 = new ModelRenderer(this);
			bone7_r15.setRotationPoint(10.0F, 36.0F, -16.0F);
			bone7.addChild(bone7_r15);
			setRotationAngle(bone7_r15, 0.0F, -0.0873F, 0.0F);
			bone7_r15.setTextureOffset(98, 18).addBox(-9.0F, -27.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r15.setTextureOffset(98, 18).addBox(-9.0F, -33.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r16 = new ModelRenderer(this);
			bone7_r16.setRotationPoint(3.0F, 36.0F, -18.0F);
			bone7.addChild(bone7_r16);
			setRotationAngle(bone7_r16, 0.0F, 0.0873F, 0.0F);
			bone7_r16.setTextureOffset(98, 18).addBox(-11.0F, -27.0F, 8.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r16.setTextureOffset(98, 18).addBox(-11.0F, -33.0F, 8.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone7_r17 = new ModelRenderer(this);
			bone7_r17.setRotationPoint(0.0F, 10.0F, 5.0F);
			bone7.addChild(bone7_r17);
			setRotationAngle(bone7_r17, 0.3054F, 0.0F, 0.0F);
			bone7_r17.setTextureOffset(0, 0).addBox(-2.0F, -25.0F, 7.0F, 4.0F, 10.0F, 3.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(15.0F, -14.75F, -9.0F);
			body.addChild(bone);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(-6.0F, 8.0F, -11.0F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, 0.0F, -0.2618F, 0.7418F);
			bone_r1.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r2 = new ModelRenderer(this);
			bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r2);
			setRotationAngle(bone_r2, 1.4399F, 0.7418F, 0.6109F);
			bone_r2.setTextureOffset(0, 0).addBox(7.0F, -14.0F, -9.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			bone_r2.setTextureOffset(0, 0).addBox(8.0F, -15.0F, -9.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			bone_r2.setTextureOffset(0, 0).addBox(9.0F, -14.0F, -9.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			bone_r2.setTextureOffset(0, 0).addBox(10.0F, -13.0F, -9.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-22.0F, 0.25F, -2.0F);
			body.addChild(bone2);
			bone2_r1 = new ModelRenderer(this);
			bone2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone2.addChild(bone2_r1);
			setRotationAngle(bone2_r1, 0.2182F, -0.7418F, -0.6109F);
			bone2_r1.setTextureOffset(0, 0).addBox(-6.0F, -4.0F, -18.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			bone2_r1.setTextureOffset(0, 0).addBox(-6.0F, -3.0F, -18.0F, 3.0F, 1.0F, 17.0F, 0.0F, false);
			bone2_r1.setTextureOffset(0, 0).addBox(-6.0F, -5.0F, -18.0F, 3.0F, 1.0F, 17.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-21.0F, 2.25F, -3.0F);
			body.addChild(bone3);
			setRotationAngle(bone3, 0.0F, 0.6109F, 0.1309F);
			bone3_r1 = new ModelRenderer(this);
			bone3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(bone3_r1);
			setRotationAngle(bone3_r1, 0.2182F, -0.7418F, -0.6109F);
			bone3_r1.setTextureOffset(0, 0).addBox(-6.0F, -4.0F, -20.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			bone3_r1.setTextureOffset(0, 0).addBox(-6.0F, -3.0F, -20.0F, 3.0F, 1.0F, 19.0F, 0.0F, false);
			bone3_r1.setTextureOffset(0, 0).addBox(-6.0F, -5.0F, -20.0F, 3.0F, 1.0F, 19.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(-4.0F, 2.25F, -6.0F);
			body.addChild(bone4);
			setRotationAngle(bone4, 0.1128F, -0.2368F, -0.4498F);
			bone4.setTextureOffset(0, 0).addBox(-20.0F, -16.0F, -17.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);
			bone4_r1 = new ModelRenderer(this);
			bone4_r1.setRotationPoint(-19.0F, -12.0F, -17.0F);
			bone4.addChild(bone4_r1);
			setRotationAngle(bone4_r1, 3.1416F, 0.0F, 0.0F);
			bone4_r1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -4.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
			bone4_r2 = new ModelRenderer(this);
			bone4_r2.setRotationPoint(-19.0F, -15.0F, -17.0F);
			bone4.addChild(bone4_r2);
			setRotationAngle(bone4_r2, 1.5272F, 0.0F, 0.0F);
			bone4_r2.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -4.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
			bone4_r3 = new ModelRenderer(this);
			bone4_r3.setRotationPoint(-17.0F, -13.0F, -13.0F);
			bone4.addChild(bone4_r3);
			setRotationAngle(bone4_r3, 0.0F, 0.2618F, 1.6144F);
			bone4_r3.setTextureOffset(0, 0).addBox(1.424F, -2.8924F, -1.1543F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			bone4_r4 = new ModelRenderer(this);
			bone4_r4.setRotationPoint(-18.0F, -13.0F, -13.0F);
			bone4.addChild(bone4_r4);
			setRotationAngle(bone4_r4, -0.2618F, 0.0F, -0.1745F);
			bone4_r4.setTextureOffset(0, 0).addBox(2.2262F, -1.0364F, -1.2777F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(-8.0F, 1.25F, 6.0F);
			body.addChild(bone5);
			setRotationAngle(bone5, 0.4666F, -0.7674F, -0.6276F);
			bone5.setTextureOffset(0, 0).addBox(-20.0F, -16.0F, -17.0F, 5.0F, 2.0F, 7.0F, 0.0F, false);
			bone5_r1 = new ModelRenderer(this);
			bone5_r1.setRotationPoint(-19.0F, -12.0F, -17.0F);
			bone5.addChild(bone5_r1);
			setRotationAngle(bone5_r1, 3.1416F, 0.0F, 0.0F);
			bone5_r1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -4.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
			bone5_r2 = new ModelRenderer(this);
			bone5_r2.setRotationPoint(-19.0F, -15.0F, -17.0F);
			bone5.addChild(bone5_r2);
			setRotationAngle(bone5_r2, 1.5272F, 0.0F, 0.0F);
			bone5_r2.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -4.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
			bone5_r3 = new ModelRenderer(this);
			bone5_r3.setRotationPoint(-17.0F, -13.0F, -13.0F);
			bone5.addChild(bone5_r3);
			setRotationAngle(bone5_r3, 0.0F, 0.2618F, 1.6144F);
			bone5_r3.setTextureOffset(0, 0).addBox(1.424F, -2.8924F, -1.1543F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			bone5_r4 = new ModelRenderer(this);
			bone5_r4.setRotationPoint(-18.0F, -13.0F, -13.0F);
			bone5.addChild(bone5_r4);
			setRotationAngle(bone5_r4, -0.2618F, 0.0F, -0.1745F);
			bone5_r4.setTextureOffset(0, 0).addBox(2.2262F, -1.0364F, -1.2777F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			bone6.render(matrixStack, buffer, packedLight, packedOverlay);
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
