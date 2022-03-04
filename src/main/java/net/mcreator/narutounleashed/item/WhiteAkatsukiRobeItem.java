
package net.mcreator.narutounleashed.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

import java.util.List;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NarutoUnleashedModElements.ModElement.Tag
public class WhiteAkatsukiRobeItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:white_akatsuki_robe_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_unleashed:white_akatsuki_robe_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_unleashed:white_akatsuki_robe_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_unleashed:white_akatsuki_robe_boots")
	public static final Item boots = null;

	public WhiteAkatsukiRobeItem(NarutoUnleashedModElements instance) {
		super(instance, 396);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 50;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{0, 0, 10, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 8;
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
				return "white_akatsuki_robe";
			}

			@Override
			public float getToughness() {
				return 1.7000000000000002f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(NarutoUnleashedTabItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modelakatsuki().body;
				armorModel.bipedLeftArm = new Modelakatsuki().leftArm;
				armorModel.bipedRightArm = new Modelakatsuki().rightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("White"));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_unleashed:textures/r8.png";
			}
		}.setRegistryName("white_akatsuki_robe_chestplate"));
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class Modelakatsuki extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer leftArm;
		private final ModelRenderer rightArm;

		public Modelakatsuki() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			addBoxHelper(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false);
			addBoxHelper(body, 42, 48, -5.0F, 20.0F, -4.0F, 5, 1, 1, 0.0F, false);
			addBoxHelper(body, 42, 48, 1.0F, 20.0F, -4.0F, 5, 1, 1, 0.0F, false);
			addBoxHelper(body, 4, 49, -5.0F, 17.0F, -4.0F, 5, 3, 1, 0.0F, false);
			addBoxHelper(body, 30, 25, -5.0F, 14.0F, -4.0F, 5, 3, 1, 0.0F, false);
			addBoxHelper(body, 19, 24, -5.0F, 14.0F, 3.0F, 10, 3, 1, 0.0F, false);
			addBoxHelper(body, 17, 27, -5.0F, 17.0F, 3.0F, 11, 3, 1, 0.0F, false);
			addBoxHelper(body, 42, 41, -5.0F, 20.0F, 3.0F, 11, 1, 1, 0.0F, false);
			addBoxHelper(body, 19, 21, -5.0F, 11.0F, 2.0F, 10, 3, 1, 0.0F, false);
			addBoxHelper(body, 48, 47, 0.0F, 14.0F, -4.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(body, 48, 47, -1.0F, 11.0F, -3.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(body, 48, 47, 0.0F, 17.0F, -4.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(body, 4, 49, 1.0F, 17.0F, -4.0F, 5, 3, 1, 0.0F, false);
			addBoxHelper(body, 36, 25, 1.0F, 14.0F, -4.0F, 4, 3, 1, 0.0F, false);
			addBoxHelper(body, 4, 49, 6.0F, 18.0F, -3.0F, 1, 2, 6, 0.0F, false);
			addBoxHelper(body, 39, 43, -6.0F, 20.0F, -3.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(body, 4, 49, -6.0F, 18.0F, -3.0F, 1, 2, 6, 0.0F, false);
			addBoxHelper(body, 40, 42, 6.0F, 20.0F, -3.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(body, 4, 49, 5.0F, 15.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(body, 4, 49, -6.0F, 15.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(body, 4, 49, 4.0F, 12.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(body, 4, 49, -5.0F, 12.0F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(body, 35, 22, 0.0F, 11.0F, -3.0F, 4, 3, 1, 0.0F, false);
			addBoxHelper(body, 31, 21, -4.0F, 11.0F, -3.0F, 3, 3, 1, 0.0F, false);
			addBoxHelper(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(head);
			addBoxHelper(head, 2, 33, -4.0F, -2.0F, 4.0F, 8, 2, 1, 0.0F, false);
			addBoxHelper(head, 2, 33, -4.0F, 0.0F, 2.0F, 8, 1, 2, 0.0F, false);
			addBoxHelper(head, 2, 33, -4.0F, 0.0F, -4.0F, 8, 1, 2, 0.0F, false);
			addBoxHelper(head, 42, 46, -1.0F, -2.0F, -5.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(head, 2, 33, -4.0F, -2.0F, -5.0F, 3, 2, 1, 0.0F, false);
			addBoxHelper(head, 2, 33, 0.0F, -2.0F, -5.0F, 5, 2, 1, 0.0F, false);
			addBoxHelper(head, 2, 33, 4.0F, -2.0F, -5.0F, 1, 2, 10, 0.0F, false);
			addBoxHelper(head, 2, 33, -5.0F, -2.0F, -5.0F, 1, 2, 10, 0.0F, false);
			addBoxHelper(head, 39, 35, 4.0F, -3.0F, -5.0F, 1, 1, 10, 0.0F, false);
			addBoxHelper(head, 39, 35, -5.0F, -3.0F, -5.0F, 1, 1, 10, 0.0F, false);
			addBoxHelper(head, 45, 41, -4.0F, -3.0F, -5.0F, 8, 1, 1, 0.0F, false);
			addBoxHelper(head, 45, 41, -4.0F, -3.0F, 4.0F, 8, 1, 1, 0.0F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			addBoxHelper(leftArm, 42, 45, -1.0F, 9.0F, -3.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(leftArm, 42, 45, -1.0F, 9.0F, 2.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(leftArm, 42, 45, 3.0F, 9.0F, -2.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(leftArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			addBoxHelper(rightArm, 46, 50, -3.0F, 9.0F, -3.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(rightArm, 46, 50, -3.0F, 9.0F, 2.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(rightArm, 46, 50, -4.0F, 9.0F, -2.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(rightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leftArm.render(ms, vb, i1, i2, f1, f2, f3, f4);
			rightArm.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

		}
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}
