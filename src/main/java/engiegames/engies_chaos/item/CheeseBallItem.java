package engiegames.engies_chaos.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class CheeseBallItem extends Item {
	public CheeseBallItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_FOOD).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.2f).build()));
	}
}