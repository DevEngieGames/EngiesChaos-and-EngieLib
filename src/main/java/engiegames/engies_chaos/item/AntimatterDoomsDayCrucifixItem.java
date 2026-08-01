package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatterDoomsDayCrucifixItem extends Item {
	public AntimatterDoomsDayCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(150).enchantable(22));
	}
}