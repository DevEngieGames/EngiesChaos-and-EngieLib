package engiegames.engieschaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class CrucifixItem extends Item {
	public CrucifixItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).durability(50).rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}
}