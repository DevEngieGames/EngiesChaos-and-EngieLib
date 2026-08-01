package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatterSuperDoomsDayCrucifixItem extends Item {
	public AntimatterSuperDoomsDayCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(200).enchantable(22));
	}
}