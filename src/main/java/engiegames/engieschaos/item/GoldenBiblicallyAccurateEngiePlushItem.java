package engiegames.engieschaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class GoldenBiblicallyAccurateEngiePlushItem extends Item {
	public GoldenBiblicallyAccurateEngiePlushItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).rarity(Rarity.UNCOMMON));
	}
}