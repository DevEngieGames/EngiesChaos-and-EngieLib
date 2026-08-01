package engiegames.engieschaos.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class BagelCheeseCookedItem extends Item {
	public BagelCheeseCookedItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_AAE_ITEMS_FOOD).food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.5f).build()));
	}
}