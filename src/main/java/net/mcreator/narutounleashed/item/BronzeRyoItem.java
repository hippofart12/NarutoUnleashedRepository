
package net.mcreator.narutounleashed.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.narutounleashed.itemgroup.NarutoUnleashedTabItemGroup;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

@NarutoUnleashedModElements.ModElement.Tag
public class BronzeRyoItem extends NarutoUnleashedModElements.ModElement {
	@ObjectHolder("naruto_unleashed:bronze_ryo")
	public static final Item block = null;

	public BronzeRyoItem(NarutoUnleashedModElements instance) {
		super(instance, 677);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NarutoUnleashedTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bronze_ryo");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
