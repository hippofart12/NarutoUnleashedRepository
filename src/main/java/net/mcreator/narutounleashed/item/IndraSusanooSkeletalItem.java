
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

import net.mcreator.narutounleashed.procedures.INSSTickProcedure;
import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NarutoUnleashedModElements.ModElement.Tag
public class IndraSusanooSkeletalItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:indra_susanoo_skeletal_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:indra_susanoo_skeletal_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:indra_susanoo_skeletal_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:indra_susanoo_skeletal_boots")
	public static final Item boots = null;

	public IndraSusanooSkeletalItem(NarutoUnleashedModElements instance) {
		super(instance, 894);
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
				return "indra_susanoo_skeletal";
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
				armorModel.bipedBody = new Models_sasuke2().body;
				armorModel.bipedLeftArm = new Models_sasuke2().bone;
				armorModel.bipedRightArm = new Models_sasuke2().bone;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/s_indra2.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				INSSTickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("indra_susanoo_skeletal_chestplate"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Models_sasuke2 extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer body;
		private final ModelRenderer unknown_bone;
		private final ModelRenderer unknown_bone_r1;
		private final ModelRenderer unknown_bone_r2;
		private final ModelRenderer unknown_bone_r3;
		private final ModelRenderer unknown_bone_r4;
		private final ModelRenderer unknown_bone_r5;
		private final ModelRenderer unknown_bone_r6;
		private final ModelRenderer unknown_bone_r7;
		private final ModelRenderer unknown_bone_r8;
		private final ModelRenderer body3;
		private final ModelRenderer body3_r1;
		private final ModelRenderer body3_r2;
		private final ModelRenderer body3_r3;
		private final ModelRenderer body3_r4;
		private final ModelRenderer body3_r5;
		private final ModelRenderer body3_r6;
		private final ModelRenderer body3_r7;
		private final ModelRenderer body3_r8;
		private final ModelRenderer body3_r9;
		private final ModelRenderer body3_r10;
		private final ModelRenderer body3_r11;
		private final ModelRenderer body3_r12;
		private final ModelRenderer body3_r13;
		private final ModelRenderer body3_r14;
		private final ModelRenderer body3_r15;
		private final ModelRenderer body3_r16;
		private final ModelRenderer body3_r17;
		private final ModelRenderer body3_r18;
		private final ModelRenderer body3_r19;
		private final ModelRenderer body3_r20;
		private final ModelRenderer body3_r21;
		private final ModelRenderer body3_r22;
		private final ModelRenderer body3_r23;
		private final ModelRenderer body3_r24;
		private final ModelRenderer bone2;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;

		public Models_sasuke2() {
			textureWidth = 256;
			textureHeight = 256;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-33.0F, 21.0F, -1.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -3.5F, 0.0F);
			unknown_bone = new ModelRenderer(this);
			unknown_bone.setRotationPoint(0.0F, 27.5F, 0.0F);
			body.addChild(unknown_bone);
			unknown_bone.setTextureOffset(12, 16).addBox(-4.0F, -57.0F, 0.0F, 8.0F, 13.0F, 10.0F, 0.0F, false);
			unknown_bone.setTextureOffset(0, 23).addBox(-4.0F, -56.0F, -1.0F, 8.0F, 16.0F, 9.0F, 0.0F, false);
			unknown_bone.setTextureOffset(12, 16).addBox(-5.0F, -56.0F, 0.0F, 10.0F, 11.0F, 9.0F, 0.0F, false);
			unknown_bone.setTextureOffset(12, 16).addBox(-3.0F, -56.0F, 10.0F, 6.0F, 10.0F, 1.0F, 0.0F, false);
			unknown_bone.setTextureOffset(12, 16).addBox(-3.0F, -53.0F, 8.0F, 6.0F, 10.0F, 1.0F, 0.0F, false);
			unknown_bone_r1 = new ModelRenderer(this);
			unknown_bone_r1.setRotationPoint(11.0F, -7.0F, -3.0F);
			unknown_bone.addChild(unknown_bone_r1);
			setRotationAngle(unknown_bone_r1, 0.0F, -0.8727F, 0.2618F);
			unknown_bone_r1.setTextureOffset(12, 16).addBox(-7.0F, -3.0F, 0.0F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			unknown_bone_r2 = new ModelRenderer(this);
			unknown_bone_r2.setRotationPoint(-6.0F, -60.0F, 3.0F);
			unknown_bone.addChild(unknown_bone_r2);
			setRotationAngle(unknown_bone_r2, 0.0F, 0.0F, 2.4871F);
			unknown_bone_r2.setTextureOffset(12, 16).addBox(-10.0F, -13.0F, 0.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);
			unknown_bone_r3 = new ModelRenderer(this);
			unknown_bone_r3.setRotationPoint(-3.0F, -53.0F, 4.0F);
			unknown_bone.addChild(unknown_bone_r3);
			setRotationAngle(unknown_bone_r3, 0.0F, 0.0F, 1.7017F);
			unknown_bone_r3.setTextureOffset(12, 16).addBox(-9.0F, -11.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r4 = new ModelRenderer(this);
			unknown_bone_r4.setRotationPoint(-17.0F, -50.0F, 4.0F);
			unknown_bone.addChild(unknown_bone_r4);
			setRotationAngle(unknown_bone_r4, 0.0F, 0.0F, 1.3526F);
			unknown_bone_r4.setTextureOffset(12, 16).addBox(-9.0F, -11.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			unknown_bone_r5 = new ModelRenderer(this);
			unknown_bone_r5.setRotationPoint(-7.0F, -43.0F, 3.0F);
			unknown_bone.addChild(unknown_bone_r5);
			setRotationAngle(unknown_bone_r5, 0.0F, 0.0F, 0.5672F);
			unknown_bone_r5.setTextureOffset(12, 16).addBox(-9.0F, -13.0F, 0.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
			unknown_bone_r6 = new ModelRenderer(this);
			unknown_bone_r6.setRotationPoint(-3.0F, -26.0F, 7.0F);
			unknown_bone.addChild(unknown_bone_r6);
			setRotationAngle(unknown_bone_r6, 0.6545F, 0.0F, 0.0F);
			unknown_bone_r6.setTextureOffset(12, 16).addBox(1.0F, -17.0F, -1.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			unknown_bone_r7 = new ModelRenderer(this);
			unknown_bone_r7.setRotationPoint(-15.0F, -27.0F, -24.0F);
			unknown_bone.addChild(unknown_bone_r7);
			setRotationAngle(unknown_bone_r7, 0.3491F, 0.0436F, 1.6144F);
			unknown_bone_r7.setTextureOffset(12, 16).addBox(-1.0F, -3.0F, -1.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
			unknown_bone_r8 = new ModelRenderer(this);
			unknown_bone_r8.setRotationPoint(-20.0F, -25.0F, -23.0F);
			unknown_bone.addChild(unknown_bone_r8);
			setRotationAngle(unknown_bone_r8, 0.0F, 0.2618F, 0.0F);
			unknown_bone_r8.setTextureOffset(12, 16).addBox(0.0F, -3.0F, -1.0F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3 = new ModelRenderer(this);
			body3.setRotationPoint(0.0F, 3.5F, 0.0F);
			body.addChild(body3);
			body3.setTextureOffset(27, 10).addBox(-2.0F, -7.0F, 7.0F, 4.0F, 31.0F, 3.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(-3.0F, -4.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(-3.0F, 2.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(-3.0F, 8.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(-3.0F, 14.0F, 6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(-10.0F, -3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(1.0F, -3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(1.0F, 3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(1.0F, 9.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(1.0F, 14.0F, 7.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(-10.0F, 3.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(-10.0F, 9.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3.setTextureOffset(27, 10).addBox(-8.0F, 14.0F, 7.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r1 = new ModelRenderer(this);
			body3_r1.setRotationPoint(14.0F, -13.0F, 7.0F);
			body3.addChild(body3_r1);
			setRotationAngle(body3_r1, 0.9163F, -0.6109F, 0.0F);
			body3_r1.setTextureOffset(27, 10).addBox(-5.0F, -3.0F, -14.0F, 3.0F, 3.0F, 15.0F, 0.0F, false);
			body3_r2 = new ModelRenderer(this);
			body3_r2.setRotationPoint(-9.0F, -13.0F, 3.0F);
			body3.addChild(body3_r2);
			setRotationAngle(body3_r2, 0.9163F, 0.6109F, 0.0F);
			body3_r2.setTextureOffset(27, 10).addBox(-6.0F, -3.0F, -11.0F, 5.0F, 5.0F, 12.0F, 0.0F, false);
			body3_r2.setTextureOffset(27, 10).addBox(-7.0F, -4.0F, -19.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);
			body3_r3 = new ModelRenderer(this);
			body3_r3.setRotationPoint(-21.0F, 5.0F, 9.0F);
			body3.addChild(body3_r3);
			setRotationAngle(body3_r3, -0.0873F, -0.1309F, 0.0F);
			body3_r3.setTextureOffset(27, 10).addBox(-6.0F, -4.0F, -35.0F, 4.0F, 8.0F, 10.0F, 0.0F, false);
			body3_r4 = new ModelRenderer(this);
			body3_r4.setRotationPoint(-13.0F, 0.0F, 16.0F);
			body3.addChild(body3_r4);
			setRotationAngle(body3_r4, 0.0873F, 0.1309F, 0.0F);
			body3_r4.setTextureOffset(27, 10).addBox(-7.0F, -4.0F, -34.0F, 7.0F, 7.0F, 15.0F, 0.0F, false);
			body3_r5 = new ModelRenderer(this);
			body3_r5.setRotationPoint(5.0F, 25.0F, 0.0F);
			body3.addChild(body3_r5);
			setRotationAngle(body3_r5, 0.0F, -2.5307F, -0.2618F);
			body3_r5.setTextureOffset(27, 10).addBox(1.0727F, -15.0F, 8.2298F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r6 = new ModelRenderer(this);
			body3_r6.setRotationPoint(0.0F, 24.0F, 0.0F);
			body3.addChild(body3_r6);
			setRotationAngle(body3_r6, 0.0F, -2.5307F, 0.0F);
			body3_r6.setTextureOffset(27, 10).addBox(1.0727F, -15.0F, 8.2298F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r6.setTextureOffset(27, 10).addBox(1.0727F, -21.0F, 8.2298F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r6.setTextureOffset(27, 10).addBox(1.0727F, -27.0F, 8.2298F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r7 = new ModelRenderer(this);
			body3_r7.setRotationPoint(0.0F, 24.0F, 0.0F);
			body3.addChild(body3_r7);
			setRotationAngle(body3_r7, 0.0F, -0.8727F, 0.0F);
			body3_r7.setTextureOffset(27, 10).addBox(-1.6948F, -15.0F, -12.27F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r7.setTextureOffset(27, 10).addBox(-1.6948F, -27.0F, -12.27F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r7.setTextureOffset(27, 10).addBox(-1.6948F, -21.0F, -12.27F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r8 = new ModelRenderer(this);
			body3_r8.setRotationPoint(2.0F, 24.0F, 0.0F);
			body3.addChild(body3_r8);
			setRotationAngle(body3_r8, 0.0F, -1.6581F, 0.0F);
			body3_r8.setTextureOffset(27, 10).addBox(-3.2637F, -10.0F, 10.301F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r9 = new ModelRenderer(this);
			body3_r9.setRotationPoint(0.0F, 24.0F, 0.0F);
			body3.addChild(body3_r9);
			setRotationAngle(body3_r9, 0.0F, -1.6581F, 0.0F);
			body3_r9.setTextureOffset(27, 10).addBox(-3.2637F, -15.0F, 10.301F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r9.setTextureOffset(27, 10).addBox(-3.2637F, -21.0F, 10.301F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r9.setTextureOffset(27, 10).addBox(-3.2637F, -27.0F, 10.301F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r10 = new ModelRenderer(this);
			body3_r10.setRotationPoint(-1.0F, 24.0F, 0.0F);
			body3.addChild(body3_r10);
			setRotationAngle(body3_r10, 0.0F, -1.5708F, 0.0F);
			body3_r10.setTextureOffset(27, 10).addBox(-3.2683F, -10.0F, -12.6115F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r11 = new ModelRenderer(this);
			body3_r11.setRotationPoint(0.0F, 24.0F, 0.0F);
			body3.addChild(body3_r11);
			setRotationAngle(body3_r11, 0.0F, -1.5708F, 0.0F);
			body3_r11.setTextureOffset(27, 10).addBox(-4.2683F, -15.0F, -12.6115F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r11.setTextureOffset(27, 10).addBox(-4.2683F, -21.0F, -12.6115F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r11.setTextureOffset(27, 10).addBox(-4.2683F, -27.0F, -12.6115F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r12 = new ModelRenderer(this);
			body3_r12.setRotationPoint(-1.0F, 9.0F, 4.0F);
			body3.addChild(body3_r12);
			setRotationAngle(body3_r12, 0.0F, -1.5708F, 0.0F);
			body3_r12.setTextureOffset(27, 10).addBox(-2.2683F, -25.0F, -12.6115F, 6.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r13 = new ModelRenderer(this);
			body3_r13.setRotationPoint(1.0F, 9.0F, 0.0F);
			body3.addChild(body3_r13);
			setRotationAngle(body3_r13, 0.0F, -1.5708F, 0.0F);
			body3_r13.setTextureOffset(27, 10).addBox(1.7317F, -26.0F, -12.6115F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			body3_r14 = new ModelRenderer(this);
			body3_r14.setRotationPoint(-22.0F, 9.0F, 0.0F);
			body3.addChild(body3_r14);
			setRotationAngle(body3_r14, 0.0F, -1.5708F, 0.0F);
			body3_r14.setTextureOffset(27, 10).addBox(1.7317F, -26.0F, -12.6115F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			body3_r15 = new ModelRenderer(this);
			body3_r15.setRotationPoint(-22.0F, 9.0F, 4.0F);
			body3.addChild(body3_r15);
			setRotationAngle(body3_r15, 0.0F, -1.5708F, 0.0F);
			body3_r15.setTextureOffset(27, 10).addBox(-2.2683F, -25.0F, -12.6115F, 6.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r16 = new ModelRenderer(this);
			body3_r16.setRotationPoint(2.0F, 24.0F, 0.0F);
			body3.addChild(body3_r16);
			setRotationAngle(body3_r16, 0.0F, -1.1345F, 0.0F);
			body3_r16.setTextureOffset(27, 10).addBox(-2.3728F, -10.0F, 10.6814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r17 = new ModelRenderer(this);
			body3_r17.setRotationPoint(0.0F, 24.0F, 0.0F);
			body3.addChild(body3_r17);
			setRotationAngle(body3_r17, 0.0F, -1.1345F, 0.0F);
			body3_r17.setTextureOffset(27, 10).addBox(-2.3728F, -15.0F, 10.6814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r17.setTextureOffset(27, 10).addBox(-2.3728F, -21.0F, 10.6814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r17.setTextureOffset(27, 10).addBox(-2.3728F, -27.0F, 10.6814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r18 = new ModelRenderer(this);
			body3_r18.setRotationPoint(-1.0F, 24.0F, 0.0F);
			body3.addChild(body3_r18);
			setRotationAngle(body3_r18, 0.0F, -2.0944F, 0.0F);
			body3_r18.setTextureOffset(27, 10).addBox(-3.3666F, -10.0F, -12.814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r19 = new ModelRenderer(this);
			body3_r19.setRotationPoint(0.0F, 24.0F, 0.0F);
			body3.addChild(body3_r19);
			setRotationAngle(body3_r19, 0.0F, -2.0944F, 0.0F);
			body3_r19.setTextureOffset(27, 10).addBox(-3.3666F, -15.0F, -12.814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r19.setTextureOffset(27, 10).addBox(-3.3666F, -21.0F, -12.814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r19.setTextureOffset(27, 10).addBox(-3.3666F, -27.0F, -12.814F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r20 = new ModelRenderer(this);
			body3_r20.setRotationPoint(-28.0F, 2.0F, -5.0F);
			body3.addChild(body3_r20);
			setRotationAngle(body3_r20, 0.0F, 0.1745F, 0.6109F);
			body3_r20.setTextureOffset(27, 10).addBox(3.0F, -25.0F, 7.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r21 = new ModelRenderer(this);
			body3_r21.setRotationPoint(15.0F, 11.0F, -8.0F);
			body3.addChild(body3_r21);
			setRotationAngle(body3_r21, 0.0F, -0.1745F, -0.6109F);
			body3_r21.setTextureOffset(27, 10).addBox(2.0F, -25.0F, 7.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r22 = new ModelRenderer(this);
			body3_r22.setRotationPoint(-25.0F, 4.0F, -2.0F);
			body3.addChild(body3_r22);
			setRotationAngle(body3_r22, 0.0F, -0.1745F, 0.6109F);
			body3_r22.setTextureOffset(27, 10).addBox(2.0F, -25.0F, 7.0F, 12.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r23 = new ModelRenderer(this);
			body3_r23.setRotationPoint(13.0F, 13.0F, 0.0F);
			body3.addChild(body3_r23);
			setRotationAngle(body3_r23, 0.0F, 0.2182F, -0.6109F);
			body3_r23.setTextureOffset(27, 10).addBox(1.0F, -25.0F, 7.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
			body3_r24 = new ModelRenderer(this);
			body3_r24.setRotationPoint(0.0F, 10.0F, 5.0F);
			body3.addChild(body3_r24);
			setRotationAngle(body3_r24, 0.3054F, 0.0F, 0.0F);
			body3_r24.setTextureOffset(27, 10).addBox(-2.0F, -25.0F, 7.0F, 4.0F, 10.0F, 3.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(6.0F, 24.5F, -9.0F);
			body.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 0.3054F, 0.0F);
			bone2.setTextureOffset(13, 16).addBox(-17.0F, -19.0F, -24.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			bone2.setTextureOffset(13, 16).addBox(-17.0F, -23.0F, -24.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			bone2.setTextureOffset(13, 16).addBox(-17.0F, -17.0F, -24.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			bone2.setTextureOffset(13, 16).addBox(-17.0F, -21.0F, -24.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 26.5F, -48.0F);
			body.addChild(bone3);
			setRotationAngle(bone3, 0.0F, 1.8326F, 0.0F);
			bone3.setTextureOffset(25, 15).addBox(-17.0F, -25.0F, -27.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
			bone3.setTextureOffset(25, 15).addBox(-17.0F, -21.0F, -27.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
			bone3.setTextureOffset(25, 15).addBox(-17.0F, -19.0F, -27.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
			bone3.setTextureOffset(25, 15).addBox(-17.0F, -23.0F, -27.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(-33.0F, 24.5F, -1.0F);
			body.addChild(bone4);
			setRotationAngle(bone4, 0.0F, -1.2654F, 0.0F);
			bone4.setTextureOffset(9, 17).addBox(-17.0F, -19.0F, -24.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			bone4.setTextureOffset(9, 17).addBox(-17.0F, -23.0F, -24.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			bone4.setTextureOffset(9, 17).addBox(-17.0F, -17.0F, -24.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			bone4.setTextureOffset(9, 17).addBox(-17.0F, -21.0F, -24.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
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
