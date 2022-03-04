
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

import net.mcreator.narutounleashed.procedures.ISCTickProcedure;
import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NarutoUnleashedModElements.ModElement.Tag
public class ItachiSusanooCageItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:itachi_susanoo_cage_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:itachi_susanoo_cage_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:itachi_susanoo_cage_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:itachi_susanoo_cage_boots")
	public static final Item boots = null;

	public ItachiSusanooCageItem(NarutoUnleashedModElements instance) {
		super(instance, 883);
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
				return "itachi_susanoo_cage";
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
				armorModel.bipedBody = new ModelSusanooCage().Cage;
				armorModel.bipedLeftArm = new ModelSusanooCage().bone;
				armorModel.bipedRightArm = new ModelSusanooCage().bone2;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/susanoo_itachi1.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				ISCTickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("itachi_susanoo_cage_chestplate"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelSusanooCage extends EntityModel<Entity> {
		private final ModelRenderer Cage;
		private final ModelRenderer Lefttop;
		private final ModelRenderer Lefttop2;
		private final ModelRenderer Lefttop3;
		private final ModelRenderer bipedBody_r1;
		private final ModelRenderer Lefttop4;
		private final ModelRenderer bipedBody_r2;
		private final ModelRenderer Lefttop5;
		private final ModelRenderer Lefttop6;
		private final ModelRenderer Lefttop7;
		private final ModelRenderer bipedBody_r3;
		private final ModelRenderer Lefttop8;
		private final ModelRenderer bipedBody_r4;
		private final ModelRenderer Lefttop9;
		private final ModelRenderer Lefttop10;
		private final ModelRenderer Lefttop11;
		private final ModelRenderer bipedBody_r5;
		private final ModelRenderer Lefttop12;
		private final ModelRenderer bipedBody_r6;
		private final ModelRenderer Lefttop13;
		private final ModelRenderer Lefttop14;
		private final ModelRenderer Lefttop15;
		private final ModelRenderer bipedBody_r7;
		private final ModelRenderer Lefttop16;
		private final ModelRenderer bipedBody_r8;
		private final ModelRenderer Lefttop17;
		private final ModelRenderer Lefttop18;
		private final ModelRenderer Lefttop19;
		private final ModelRenderer bipedBody_r9;
		private final ModelRenderer Lefttop20;
		private final ModelRenderer bipedBody_r10;
		private final ModelRenderer Lefttop21;
		private final ModelRenderer Lefttop22;
		private final ModelRenderer Lefttop23;
		private final ModelRenderer bipedBody_r11;
		private final ModelRenderer Lefttop24;
		private final ModelRenderer bipedBody_r12;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;

		public ModelSusanooCage() {
			textureWidth = 16;
			textureHeight = 16;
			Cage = new ModelRenderer(this);
			Cage.setRotationPoint(0.0F, 0.0F, 0.0F);
			Cage.setTextureOffset(0, 0).addBox(-2.25F, 3.0F, 10.75F, 4.0F, 13.0F, 3.0F, 0.0F, false);
			Lefttop = new ModelRenderer(this);
			Lefttop.setRotationPoint(12.5F, 1.5F, -6.0F);
			Cage.addChild(Lefttop);
			Lefttop.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			Lefttop2 = new ModelRenderer(this);
			Lefttop2.setRotationPoint(0.25F, 0.0F, 0.75F);
			Lefttop.addChild(Lefttop2);
			setRotationAngle(Lefttop2, 0.0F, 0.6109F, 0.0F);
			Lefttop2.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop3 = new ModelRenderer(this);
			Lefttop3.setRotationPoint(0.25F, 0.0F, 11.25F);
			Lefttop.addChild(Lefttop3);
			setRotationAngle(Lefttop3, 0.0F, -0.6545F, 0.0F);
			Lefttop3.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			bipedBody_r1 = new ModelRenderer(this);
			bipedBody_r1.setRotationPoint(1.5F, 0.0F, 8.0F);
			Lefttop3.addChild(bipedBody_r1);
			setRotationAngle(bipedBody_r1, 0.0F, -0.4363F, 0.0F);
			bipedBody_r1.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Lefttop4 = new ModelRenderer(this);
			Lefttop4.setRotationPoint(-1.0F, 0.0F, 9.75F);
			Lefttop3.addChild(Lefttop4);
			setRotationAngle(Lefttop4, 0.0F, -0.6545F, 0.0F);
			bipedBody_r2 = new ModelRenderer(this);
			bipedBody_r2.setRotationPoint(1.5F, 0.0F, 0.0F);
			Lefttop4.addChild(bipedBody_r2);
			setRotationAngle(bipedBody_r2, 0.0F, -0.2618F, 0.0F);
			bipedBody_r2.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop5 = new ModelRenderer(this);
			Lefttop5.setRotationPoint(-11.0F, 0.0F, 18.5F);
			Lefttop.addChild(Lefttop5);
			setRotationAngle(Lefttop5, 0.0F, 0.0F, -3.1416F);
			Lefttop5.setTextureOffset(16, 16).addBox(12.5F, -1.5F, -18.5F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			Lefttop6 = new ModelRenderer(this);
			Lefttop6.setRotationPoint(14.25F, 0.0F, -17.75F);
			Lefttop5.addChild(Lefttop6);
			setRotationAngle(Lefttop6, 0.0F, 0.6109F, 0.0F);
			Lefttop6.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop7 = new ModelRenderer(this);
			Lefttop7.setRotationPoint(14.25F, 0.0F, -7.25F);
			Lefttop5.addChild(Lefttop7);
			setRotationAngle(Lefttop7, 0.0F, -0.6545F, 0.0F);
			Lefttop7.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			bipedBody_r3 = new ModelRenderer(this);
			bipedBody_r3.setRotationPoint(1.5F, 0.0F, 8.0F);
			Lefttop7.addChild(bipedBody_r3);
			setRotationAngle(bipedBody_r3, 0.0F, -0.4363F, 0.0F);
			bipedBody_r3.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Lefttop8 = new ModelRenderer(this);
			Lefttop8.setRotationPoint(-1.0F, 0.0F, 9.75F);
			Lefttop7.addChild(Lefttop8);
			setRotationAngle(Lefttop8, 0.0F, -0.6545F, 0.0F);
			bipedBody_r4 = new ModelRenderer(this);
			bipedBody_r4.setRotationPoint(1.5F, 0.0F, 0.0F);
			Lefttop8.addChild(bipedBody_r4);
			setRotationAngle(bipedBody_r4, 0.0F, -0.2618F, 0.0F);
			bipedBody_r4.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop9 = new ModelRenderer(this);
			Lefttop9.setRotationPoint(12.5F, 9.5F, -6.0F);
			Cage.addChild(Lefttop9);
			Lefttop9.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			Lefttop10 = new ModelRenderer(this);
			Lefttop10.setRotationPoint(0.25F, 0.0F, 0.75F);
			Lefttop9.addChild(Lefttop10);
			setRotationAngle(Lefttop10, 0.0F, 0.6109F, 0.0F);
			Lefttop10.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop11 = new ModelRenderer(this);
			Lefttop11.setRotationPoint(0.25F, 0.0F, 11.25F);
			Lefttop9.addChild(Lefttop11);
			setRotationAngle(Lefttop11, 0.0F, -0.6545F, 0.0F);
			Lefttop11.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			bipedBody_r5 = new ModelRenderer(this);
			bipedBody_r5.setRotationPoint(1.5F, 0.0F, 8.0F);
			Lefttop11.addChild(bipedBody_r5);
			setRotationAngle(bipedBody_r5, 0.0F, -0.4363F, 0.0F);
			bipedBody_r5.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Lefttop12 = new ModelRenderer(this);
			Lefttop12.setRotationPoint(-1.0F, 0.0F, 9.75F);
			Lefttop11.addChild(Lefttop12);
			setRotationAngle(Lefttop12, 0.0F, -0.6545F, 0.0F);
			bipedBody_r6 = new ModelRenderer(this);
			bipedBody_r6.setRotationPoint(1.5F, 0.0F, 0.0F);
			Lefttop12.addChild(bipedBody_r6);
			setRotationAngle(bipedBody_r6, 0.0F, -0.2618F, 0.0F);
			bipedBody_r6.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop13 = new ModelRenderer(this);
			Lefttop13.setRotationPoint(-11.0F, 0.0F, 18.5F);
			Lefttop9.addChild(Lefttop13);
			setRotationAngle(Lefttop13, 0.0F, 0.0F, -3.1416F);
			Lefttop13.setTextureOffset(16, 16).addBox(12.5F, -1.5F, -18.5F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			Lefttop14 = new ModelRenderer(this);
			Lefttop14.setRotationPoint(14.25F, 0.0F, -17.75F);
			Lefttop13.addChild(Lefttop14);
			setRotationAngle(Lefttop14, 0.0F, 0.6109F, 0.0F);
			Lefttop14.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop15 = new ModelRenderer(this);
			Lefttop15.setRotationPoint(14.25F, 0.0F, -7.25F);
			Lefttop13.addChild(Lefttop15);
			setRotationAngle(Lefttop15, 0.0F, -0.6545F, 0.0F);
			Lefttop15.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			bipedBody_r7 = new ModelRenderer(this);
			bipedBody_r7.setRotationPoint(1.5F, 0.0F, 8.0F);
			Lefttop15.addChild(bipedBody_r7);
			setRotationAngle(bipedBody_r7, 0.0F, -0.4363F, 0.0F);
			bipedBody_r7.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Lefttop16 = new ModelRenderer(this);
			Lefttop16.setRotationPoint(-1.0F, 0.0F, 9.75F);
			Lefttop15.addChild(Lefttop16);
			setRotationAngle(Lefttop16, 0.0F, -0.6545F, 0.0F);
			bipedBody_r8 = new ModelRenderer(this);
			bipedBody_r8.setRotationPoint(1.5F, 0.0F, 0.0F);
			Lefttop16.addChild(bipedBody_r8);
			setRotationAngle(bipedBody_r8, 0.0F, -0.2618F, 0.0F);
			bipedBody_r8.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop17 = new ModelRenderer(this);
			Lefttop17.setRotationPoint(12.5F, 17.5F, -6.0F);
			Cage.addChild(Lefttop17);
			Lefttop17.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			Lefttop18 = new ModelRenderer(this);
			Lefttop18.setRotationPoint(0.25F, 0.0F, 0.75F);
			Lefttop17.addChild(Lefttop18);
			setRotationAngle(Lefttop18, 0.0F, 0.6109F, 0.0F);
			Lefttop18.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop19 = new ModelRenderer(this);
			Lefttop19.setRotationPoint(0.25F, 0.0F, 11.25F);
			Lefttop17.addChild(Lefttop19);
			setRotationAngle(Lefttop19, 0.0F, -0.6545F, 0.0F);
			Lefttop19.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			bipedBody_r9 = new ModelRenderer(this);
			bipedBody_r9.setRotationPoint(1.5F, 0.0F, 8.0F);
			Lefttop19.addChild(bipedBody_r9);
			setRotationAngle(bipedBody_r9, 0.0F, -0.4363F, 0.0F);
			bipedBody_r9.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Lefttop20 = new ModelRenderer(this);
			Lefttop20.setRotationPoint(-1.0F, 0.0F, 9.75F);
			Lefttop19.addChild(Lefttop20);
			setRotationAngle(Lefttop20, 0.0F, -0.6545F, 0.0F);
			bipedBody_r10 = new ModelRenderer(this);
			bipedBody_r10.setRotationPoint(1.5F, 0.0F, 0.0F);
			Lefttop20.addChild(bipedBody_r10);
			setRotationAngle(bipedBody_r10, 0.0F, -0.2618F, 0.0F);
			bipedBody_r10.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop21 = new ModelRenderer(this);
			Lefttop21.setRotationPoint(-11.0F, 0.0F, 18.5F);
			Lefttop17.addChild(Lefttop21);
			setRotationAngle(Lefttop21, 0.0F, 0.0F, -3.1416F);
			Lefttop21.setTextureOffset(16, 16).addBox(12.5F, -1.5F, -18.5F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			Lefttop22 = new ModelRenderer(this);
			Lefttop22.setRotationPoint(14.25F, 0.0F, -17.75F);
			Lefttop21.addChild(Lefttop22);
			setRotationAngle(Lefttop22, 0.0F, 0.6109F, 0.0F);
			Lefttop22.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			Lefttop23 = new ModelRenderer(this);
			Lefttop23.setRotationPoint(14.25F, 0.0F, -7.25F);
			Lefttop21.addChild(Lefttop23);
			setRotationAngle(Lefttop23, 0.0F, -0.6545F, 0.0F);
			Lefttop23.setTextureOffset(16, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			bipedBody_r11 = new ModelRenderer(this);
			bipedBody_r11.setRotationPoint(1.5F, 0.0F, 8.0F);
			Lefttop23.addChild(bipedBody_r11);
			setRotationAngle(bipedBody_r11, 0.0F, -0.4363F, 0.0F);
			bipedBody_r11.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Lefttop24 = new ModelRenderer(this);
			Lefttop24.setRotationPoint(-1.0F, 0.0F, 9.75F);
			Lefttop23.addChild(Lefttop24);
			setRotationAngle(Lefttop24, 0.0F, -0.6545F, 0.0F);
			bipedBody_r12 = new ModelRenderer(this);
			bipedBody_r12.setRotationPoint(1.5F, 0.0F, 0.0F);
			Lefttop24.addChild(bipedBody_r12);
			setRotationAngle(bipedBody_r12, 0.0F, -0.2618F, 0.0F);
			bipedBody_r12.setTextureOffset(16, 16).addBox(-3.0F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone2);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Cage.render(matrixStack, buffer, packedLight, packedOverlay);
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
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
