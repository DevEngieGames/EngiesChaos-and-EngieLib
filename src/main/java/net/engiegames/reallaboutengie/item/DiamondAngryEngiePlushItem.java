package net.engiegames.reallaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;

public class DiamondAngryEngiePlushItem extends Item {
	public DiamondAngryEngiePlushItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS).rarity(Rarity.RARE));
	}
}