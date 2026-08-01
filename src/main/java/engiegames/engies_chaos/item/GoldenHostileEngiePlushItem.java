package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GoldenHostileEngiePlushItem extends Item {
	public GoldenHostileEngiePlushItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}