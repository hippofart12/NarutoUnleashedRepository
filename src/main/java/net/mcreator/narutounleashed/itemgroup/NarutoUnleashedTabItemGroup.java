
package net.mcreator.narutounleashed.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.narutounleashed.item.KunaiItem;
import net.mcreator.narutounleashed.NarutoUnleashedModElements;

@NarutoUnleashedModElements.ModElement.Tag
public class NarutoUnleashedTabItemGroup extends NarutoUnleashedModElements.ModElement {
	public NarutoUnleashedTabItemGroup(NarutoUnleashedModElements instance) {
		super(instance, 124);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnaruto_unleashed_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(KunaiItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
