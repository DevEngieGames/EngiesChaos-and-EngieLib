package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatterEngieCrucifixItem extends Item {
	public AntimatterEngieCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(300).enchantable(22));
	}
}