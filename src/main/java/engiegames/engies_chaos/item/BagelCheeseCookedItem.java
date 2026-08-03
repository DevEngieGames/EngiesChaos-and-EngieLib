package engiegames.engies_chaos.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class BagelCheeseCookedItem extends Item {
	public BagelCheeseCookedItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_FOOD).food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.5f).build()));
	}
}