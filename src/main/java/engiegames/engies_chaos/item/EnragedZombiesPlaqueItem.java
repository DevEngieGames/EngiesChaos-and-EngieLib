package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class EnragedZombiesPlaqueItem extends Item {
	public EnragedZombiesPlaqueItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).fireResistant().rarity(Rarity.EPIC));
	}
}