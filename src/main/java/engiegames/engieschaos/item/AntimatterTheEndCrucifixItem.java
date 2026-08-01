package engiegames.engieschaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class AntimatterTheEndCrucifixItem extends Item {
	public AntimatterTheEndCrucifixItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).durability(250).rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}
}