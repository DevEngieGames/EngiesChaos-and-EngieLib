package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EngieGamesCrucifixItem extends Item {
	public EngieGamesCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(175).enchantable(22));
	}
}