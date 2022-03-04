
package net.mcreator.narutounleashed.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

@NarutoUnleashedModElements.ModElement.Tag
public class LightningBladeItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:lightning_blade")
	public static final Item block = null;

	public LightningBladeItem(NarutoUnleashedModElements instance) {
		super(instance, 1678);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 34f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 3f, new Item.Properties().group(NarutoUnleashedTabItemGroup.tab)) {
		}.setRegistryName("lightning_blade"));
	}
}
