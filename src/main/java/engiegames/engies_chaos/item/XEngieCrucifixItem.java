package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class XEngieCrucifixItem extends Item {
	public XEngieCrucifixItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).durability(525).rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 34;
	}
}