package net.engiegames.reallaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;

public class NetheriteEnragedEngiePlushItem extends Item {
	public NetheriteEnragedEngiePlushItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS).rarity(Rarity.EPIC));
	}
}