package net.engiegames.reallaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnragedZombiesPlaqueItem extends Item {
	public EnragedZombiesPlaqueItem() {
		super(new Item.Properties().tab(null).fireResistant().rarity(Rarity.EPIC));
	}
}