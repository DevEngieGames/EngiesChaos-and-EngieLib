package engiegames.engies_chaos.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class BagelCheeseItem extends Item {
	public BagelCheeseItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_AAE_ITEMS_FOOD).food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.4f).build()));
	}
}