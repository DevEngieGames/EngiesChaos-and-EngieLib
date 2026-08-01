package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DoomsDayCrucifixItem extends Item {
	public DoomsDayCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(75).enchantable(22));
	}
}