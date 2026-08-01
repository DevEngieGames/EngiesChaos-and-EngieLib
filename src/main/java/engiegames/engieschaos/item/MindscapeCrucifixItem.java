package engiegames.engieschaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class MindscapeCrucifixItem extends Item {
	public MindscapeCrucifixItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).durability(200).rarity(Rarity.EPIC));
	}
}