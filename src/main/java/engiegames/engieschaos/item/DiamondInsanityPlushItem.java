package engiegames.engieschaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class DiamondInsanityPlushItem extends Item {
	public DiamondInsanityPlushItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).rarity(Rarity.RARE));
	}
}