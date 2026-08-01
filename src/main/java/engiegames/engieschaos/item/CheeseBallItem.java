package engiegames.engieschaos.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class CheeseBallItem extends Item {
	public CheeseBallItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_AAE_ITEMS_FOOD).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.2f).build()));
	}
}