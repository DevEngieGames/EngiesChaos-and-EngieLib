package engiegames.engies_chaos.item;

import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class ShovelBaseItem extends Item {
	public ShovelBaseItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}