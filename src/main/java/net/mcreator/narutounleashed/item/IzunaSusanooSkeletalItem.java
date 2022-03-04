
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

import net.mcreator.narutounleashed.procedures.IZSSTickProcedure;
import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NarutoUnleashedModElements.ModElement.Tag
public class IzunaSusanooSkeletalItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:izuna_susanoo_skeletal_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:izuna_susanoo_skeletal_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:izuna_susanoo_skeletal_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:izuna_susanoo_skeletal_boots")
	public static final Item boots = null;

	public IzunaSusanooSkeletalItem(NarutoUnleashedModElements instance) {
		super(instance, 895);
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
				return "izuna_susanoo_skeletal";
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
				armorModel.bipedBody = new Models_madara2().bone;
				armorModel.bipedLeftArm = new Models_madara2().bone3;
				armorModel.bipedRightArm = new Models_madara2().bone3;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/s_izuna2.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				IZSSTickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("izuna_susanoo_skeletal_chestplate"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Models_madara2 extends EntityModel<Entity> {
		private final ModelRenderer bone;
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
		private final ModelRenderer bone2;
		private final ModelRenderer bone2_r1;
		private final ModelRenderer bone2_r2;
		private final ModelRenderer bone2_r3;
		private final ModelRenderer bone2_r4;
		private final ModelRenderer bone2_r5;
		private final ModelRenderer bone2_r6;
		private final ModelRenderer bone2_r7;
		private final ModelRenderer bone3;

		public Models_madara2() {
			textureWidth = 256;
			textureHeight = 256;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -1.5F, 0.0F);
			setRotationAngle(bone, 0.0F, -0.0436F, 0.0F);
			body3 = new ModelRenderer(this);
			body3.setRotationPoint(0.0F, 1.5F, 0.0F);
			bone.addChild(body3);
			body3.setTextureOffset(59, 26).addBox(-12.0F, -13.0F, -10.0F, 24.0F, 11.0F, 20.0F, 0.0F, false);
			body3.setTextureOffset(57, 68).addBox(-10.4063F, 9.0F, -7.0F, 20.0F, 15.0F, 17.0F, 0.0F, false);
			body3_r1 = new ModelRenderer(this);
			body3_r1.setRotationPoint(16.7043F, -9.671F, 0.5019F);
			body3.addChild(body3_r1);
			setRotationAngle(body3_r1, 0.0F, 0.0F, 0.3927F);
			body3_r1.setTextureOffset(141, 16).addBox(-33.959F, 1.6165F, -2.0606F, 7.0F, 22.0F, 7.0F, 0.0F, false);
			body3_r2 = new ModelRenderer(this);
			body3_r2.setRotationPoint(16.7043F, -9.671F, 0.5019F);
			body3.addChild(body3_r2);
			setRotationAngle(body3_r2, 0.0F, 0.0F, -0.3927F);
			body3_r2.setTextureOffset(141, 16).addBox(-3.5F, -11.0F, -3.5F, 7.0F, 22.0F, 7.0F, 0.0F, false);
			body3_r3 = new ModelRenderer(this);
			body3_r3.setRotationPoint(6.0F, 4.0F, 0.0F);
			body3.addChild(body3_r3);
			setRotationAngle(body3_r3, 0.0F, -1.5708F, 0.0F);
			body3_r3.setTextureOffset(139, 107).addBox(-3.9597F, -26.0F, 15.3599F, 11.0F, 11.0F, 11.0F, 0.0F, false);
			body3_r3.setTextureOffset(139, 107).addBox(-5.2683F, -26.0F, -14.6115F, 11.0F, 11.0F, 11.0F, 0.0F, false);
			body3_r4 = new ModelRenderer(this);
			body3_r4.setRotationPoint(-0.25F, 23.3438F, 0.0F);
			body3.addChild(body3_r4);
			setRotationAngle(body3_r4, 0.0F, 0.0F, 0.0436F);
			body3_r4.setTextureOffset(0, 43).addBox(-9.9063F, -25.75F, -10.0F, 20.0F, 25.0F, 20.0F, 0.0F, false);
			body3_r5 = new ModelRenderer(this);
			body3_r5.setRotationPoint(0.25F, 23.5625F, 0.0F);
			body3.addChild(body3_r5);
			setRotationAngle(body3_r5, 0.0F, 0.0F, -0.0436F);
			body3_r5.setTextureOffset(0, 0).addBox(-11.0F, -26.0313F, -10.0F, 21.0F, 26.0F, 20.0F, 0.0F, false);
			body3_r6 = new ModelRenderer(this);
			body3_r6.setRotationPoint(5.1741F, 17.3938F, -8.2147F);
			body3.addChild(body3_r6);
			setRotationAngle(body3_r6, -0.1745F, 0.0F, -0.1745F);
			body3_r6.setTextureOffset(57, 100).addBox(-9.0F, -37.0F, -6.75F, 21.0F, 9.0F, 16.0F, 0.0F, false);
			body3_r7 = new ModelRenderer(this);
			body3_r7.setRotationPoint(5.0F, 17.0F, 0.0F);
			body3.addChild(body3_r7);
			setRotationAngle(body3_r7, 0.0F, 0.0F, -0.1745F);
			body3_r7.setTextureOffset(76, 0).addBox(-9.0F, -37.0F, -4.0F, 21.0F, 9.0F, 14.0F, 0.0F, false);
			body3_r8 = new ModelRenderer(this);
			body3_r8.setRotationPoint(-6.1599F, 17.2255F, -8.1839F);
			body3.addChild(body3_r8);
			setRotationAngle(body3_r8, -0.1745F, 0.0F, 0.1745F);
			body3_r8.setTextureOffset(0, 109).addBox(-11.0F, -37.0F, -6.7813F, 21.0F, 9.0F, 16.0F, 0.0F, false);
			body3_r9 = new ModelRenderer(this);
			body3_r9.setRotationPoint(-6.0F, 17.0F, 0.0F);
			body3.addChild(body3_r9);
			setRotationAngle(body3_r9, 0.0F, 0.0F, 0.1745F);
			body3_r9.setTextureOffset(0, 86).addBox(-11.0F, -37.0F, -4.0F, 21.0F, 9.0F, 14.0F, 0.0F, false);
			body3_r10 = new ModelRenderer(this);
			body3_r10.setRotationPoint(25.3125F, 26.5625F, 0.625F);
			body3.addChild(body3_r10);
			setRotationAngle(body3_r10, -0.3054F, 0.0F, 0.0F);
			body3_r10.setTextureOffset(109, 109).addBox(-48.961F, -29.5378F, -4.2944F, 7.0F, 7.0F, 16.0F, 0.0F, false);
			body3_r10.setTextureOffset(109, 109).addBox(-8.0F, -29.0F, -6.0F, 7.0F, 7.0F, 16.0F, 0.0F, false);
			body3_r11 = new ModelRenderer(this);
			body3_r11.setRotationPoint(25.3125F, 27.1563F, -3.4063F);
			body3.addChild(body3_r11);
			setRotationAngle(body3_r11, 0.1309F, 0.0F, 0.0F);
			body3_r11.setTextureOffset(115, 84).addBox(-48.961F, -28.7666F, -4.2269F, 7.0F, 7.0F, 16.0F, 0.0F, false);
			body3_r11.setTextureOffset(115, 84).addBox(-8.0F, -29.0F, -6.0F, 7.0F, 7.0F, 16.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(1.8173F, -27.0907F, -16.3459F);
			body3.addChild(bone2);
			bone2.setTextureOffset(8, 9).addBox(-2.8038F, -0.8287F, 6.5923F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			bone2_r1 = new ModelRenderer(this);
			bone2_r1.setRotationPoint(-1.8108F, 28.4963F, -13.936F);
			bone2.addChild(bone2_r1);
			setRotationAngle(bone2_r1, -0.3054F, 0.0F, -0.1745F);
			bone2_r1.setTextureOffset(0, 0).addBox(5.3825F, -27.0849F, 15.0422F, 2.0F, 9.0F, 3.0F, 0.0F, false);
			bone2_r2 = new ModelRenderer(this);
			bone2_r2.setRotationPoint(-3.5358F, 27.7088F, -14.011F);
			bone2.addChild(bone2_r2);
			setRotationAngle(bone2_r2, -0.3054F, 0.0F, 0.0F);
			bone2_r2.setTextureOffset(0, 43).addBox(5.3976F, -27.2496F, 14.9902F, 2.0F, 9.0F, 3.0F, 0.0F, false);
			bone2_r2.setTextureOffset(74, 54).addBox(-3.9774F, -27.2496F, 14.9902F, 2.0F, 9.0F, 3.0F, 0.0F, false);
			bone2_r3 = new ModelRenderer(this);
			bone2_r3.setRotationPoint(-12.9483F, 26.9588F, -14.011F);
			bone2.addChild(bone2_r3);
			setRotationAngle(bone2_r3, -0.3054F, 0.0F, 0.1745F);
			bone2_r3.setTextureOffset(81, 0).addBox(4.2575F, -27.4143F, 14.9383F, 2.0F, 9.0F, 3.0F, 0.0F, false);
			bone2_r4 = new ModelRenderer(this);
			bone2_r4.setRotationPoint(5.8392F, 28.8713F, 1.889F);
			bone2.addChild(bone2_r4);
			setRotationAngle(bone2_r4, 0.3927F, 0.0F, 0.0F);
			bone2_r4.setTextureOffset(10, 0).addBox(-5.418F, -19.7456F, 12.6444F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			bone2_r4.setTextureOffset(10, 4).addBox(-11.043F, -19.7456F, 12.6444F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			bone2_r5 = new ModelRenderer(this);
			bone2_r5.setRotationPoint(-2.1858F, 24.1088F, -6.811F);
			bone2.addChild(bone2_r5);
			setRotationAngle(bone2_r5, 0.0436F, 0.0F, 0.0F);
			bone2_r5.setTextureOffset(59, 0).addBox(-5.418F, -29.9439F, 14.3566F, 11.0F, 6.0F, 2.0F, 0.0F, false);
			bone2_r6 = new ModelRenderer(this);
			bone2_r6.setRotationPoint(-2.1858F, 10.2713F, -38.161F);
			bone2.addChild(bone2_r6);
			setRotationAngle(bone2_r6, -1.2217F, 0.0F, 0.0F);
			bone2_r6.setTextureOffset(40, 145).addBox(-5.418F, -61.1921F, -0.6094F, 11.0F, 13.0F, 5.0F, 0.0F, false);
			bone2_r7 = new ModelRenderer(this);
			bone2_r7.setRotationPoint(-11.7858F, 31.3088F, -12.811F);
			bone2.addChild(bone2_r7);
			setRotationAngle(bone2_r7, 0.0F, -1.5708F, 0.0F);
			bone2_r7.setTextureOffset(0, 131).addBox(20.0564F, -37.2F, -16.1283F, 12.0F, 16.0F, 12.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, -1.5F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			bone3.render(matrixStack, buffer, packedLight, packedOverlay);
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
