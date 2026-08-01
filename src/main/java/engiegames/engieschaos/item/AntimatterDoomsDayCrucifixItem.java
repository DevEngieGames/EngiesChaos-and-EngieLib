package engiegames.engieschaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class AntimatterDoomsDayCrucifixItem extends Item {
	public AntimatterDoomsDayCrucifixItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).durability(150).rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}
}