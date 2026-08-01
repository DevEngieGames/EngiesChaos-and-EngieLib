package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnragedZombiesPlaqueItem extends Item {
	public EnragedZombiesPlaqueItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant());
	}
}