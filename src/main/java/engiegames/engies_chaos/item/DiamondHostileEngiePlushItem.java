package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondHostileEngiePlushItem extends Item {
	public DiamondHostileEngiePlushItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}