package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatterEngieGamesCrucifixItem extends Item {
	public AntimatterEngieGamesCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(350).enchantable(22));
	}
}