package engiegames.engies_chaos.item;

import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class PickaxeBaseItem extends Item {
	public PickaxeBaseItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}