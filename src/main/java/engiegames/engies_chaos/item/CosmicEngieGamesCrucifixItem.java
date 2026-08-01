package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CosmicEngieGamesCrucifixItem extends Item {
	public CosmicEngieGamesCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(400).enchantable(22));
	}
}