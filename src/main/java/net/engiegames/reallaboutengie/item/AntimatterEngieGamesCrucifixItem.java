package net.engiegames.reallaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;

public class AntimatterEngieGamesCrucifixItem extends Item {
	public AntimatterEngieGamesCrucifixItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS).durability(350).rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}
}