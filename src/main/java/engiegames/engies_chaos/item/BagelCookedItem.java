package engiegames.engies_chaos.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class BagelCookedItem extends Item {
	public BagelCookedItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_AAE_ITEMS_FOOD).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.3f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 30;
	}
}