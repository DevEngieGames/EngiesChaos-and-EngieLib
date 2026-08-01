package net.engiegames.reallaboutengie.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;

public class BrownieItem extends Item {
	public BrownieItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_FOOD).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).build()));
	}
}