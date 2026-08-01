package net.engiegames.reallaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DimensionsPlaqueItem extends Item {
	public DimensionsPlaqueItem() {
		super(new Item.Properties().tab(null).fireResistant().rarity(Rarity.EPIC));
	}
}