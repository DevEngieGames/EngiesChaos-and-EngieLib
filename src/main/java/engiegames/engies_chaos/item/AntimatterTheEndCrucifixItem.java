package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatterTheEndCrucifixItem extends Item {
	public AntimatterTheEndCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(250).enchantable(22));
	}
}