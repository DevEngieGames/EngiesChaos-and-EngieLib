package engiegames.engieschaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SharkosPlaqueItem extends Item {
	public SharkosPlaqueItem() {
		super(new Item.Properties().tab(null).fireResistant().rarity(Rarity.EPIC));
	}
}