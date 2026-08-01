package engiegames.engies_chaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MonstrosityEngieEssenceItem extends Item {
	public MonstrosityEngieEssenceItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}