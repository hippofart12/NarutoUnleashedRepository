
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
public class UzumakiBackChainsItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:uzumaki_back_chains_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:uzumaki_back_chains_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:uzumaki_back_chains_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:uzumaki_back_chains_boots")
	public static final Item boots = null;

	public UzumakiBackChainsItem(NarutoUnleashedModElements instance) {
		super(instance, 805);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 73;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 11, 2}[slot.getIndex()];
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
				return "uzumaki_back_chains";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.6f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(NarutoUnleashedTabItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new ModelUCC().chains;
				armorModel.bipedLeftArm = new ModelUCC().Chain;
				armorModel.bipedRightArm = new ModelUCC().Chain6;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/chakrachain.png";
			}
		}.setRegistryName("uzumaki_back_chains_chestplate"));
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelUCC extends EntityModel<Entity> {
		private final ModelRenderer chains;
		private final ModelRenderer Chain;
		private final ModelRenderer Chain2;
		private final ModelRenderer Chain3;
		private final ModelRenderer Chain4;
		private final ModelRenderer Chain5;
		private final ModelRenderer Chain6;
		private final ModelRenderer Chain7;
		private final ModelRenderer Chain8;
		private final ModelRenderer Chain9;
		private final ModelRenderer Chain10;

		public ModelUCC() {
			textureWidth = 16;
			textureHeight = 16;
			chains = new ModelRenderer(this);
			chains.setRotationPoint(0.0F, 2.25F, 0.0F);
			Chain = new ModelRenderer(this);
			Chain.setRotationPoint(0.5F, 3.75F, 1.25F);
			chains.addChild(Chain);
			setRotationAngle(Chain, -0.4363F, 0.0F, 0.5236F);
			Chain.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain2 = new ModelRenderer(this);
			Chain2.setRotationPoint(0.0F, -6.0F, 0.0F);
			Chain.addChild(Chain2);
			setRotationAngle(Chain2, 0.0F, 1.4835F, 0.5672F);
			Chain2.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain2.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain2.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain2.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain3 = new ModelRenderer(this);
			Chain3.setRotationPoint(0.0F, -6.25F, 0.0F);
			Chain2.addChild(Chain3);
			setRotationAngle(Chain3, -0.6545F, 1.5272F, 0.0F);
			Chain3.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain3.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain3.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain3.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain4 = new ModelRenderer(this);
			Chain4.setRotationPoint(0.0F, -6.25F, 0.0F);
			Chain3.addChild(Chain4);
			setRotationAngle(Chain4, -0.1745F, 1.309F, -0.0436F);
			Chain4.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain4.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain4.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain4.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain5 = new ModelRenderer(this);
			Chain5.setRotationPoint(0.0F, -6.0F, 0.0F);
			Chain4.addChild(Chain5);
			setRotationAngle(Chain5, 1.1345F, 1.5272F, 0.0F);
			Chain5.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain5.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain5.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain5.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain6 = new ModelRenderer(this);
			Chain6.setRotationPoint(0.5F, 3.75F, 1.25F);
			chains.addChild(Chain6);
			setRotationAngle(Chain6, -0.4363F, 0.0F, -0.5236F);
			Chain6.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain6.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain6.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain6.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain7 = new ModelRenderer(this);
			Chain7.setRotationPoint(0.0F, -6.0F, 0.0F);
			Chain6.addChild(Chain7);
			setRotationAngle(Chain7, 0.0F, 1.4835F, -0.5672F);
			Chain7.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain7.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain7.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain7.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain8 = new ModelRenderer(this);
			Chain8.setRotationPoint(0.0F, -6.25F, 0.0F);
			Chain7.addChild(Chain8);
			setRotationAngle(Chain8, -0.6545F, 1.5272F, 0.0F);
			Chain8.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain8.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain8.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain8.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain9 = new ModelRenderer(this);
			Chain9.setRotationPoint(0.0F, -6.25F, 0.0F);
			Chain8.addChild(Chain9);
			setRotationAngle(Chain9, -0.1745F, -1.309F, 0.0436F);
			Chain9.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain9.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain9.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain9.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain10 = new ModelRenderer(this);
			Chain10.setRotationPoint(0.0F, -7.5F, 0.0F);
			Chain9.addChild(Chain10);
			setRotationAngle(Chain10, -1.1345F, 1.5272F, 0.0F);
			Chain10.setTextureOffset(3, 1).addBox(1.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain10.setTextureOffset(3, 1).addBox(-3.5F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			Chain10.setTextureOffset(3, 1).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Chain10.setTextureOffset(3, 1).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			chains.render(matrixStack, buffer, packedLight, packedOverlay);
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
