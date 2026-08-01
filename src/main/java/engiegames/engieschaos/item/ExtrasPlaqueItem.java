package engiegames.engieschaos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ExtrasPlaqueItem extends Item {
	public ExtrasPlaqueItem() {
		super(new Item.Properties().tab(null).fireResistant().rarity(Rarity.EPIC));
	}
}