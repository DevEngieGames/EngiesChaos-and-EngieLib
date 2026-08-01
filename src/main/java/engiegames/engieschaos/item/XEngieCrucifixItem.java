package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class XEngieCrucifixItem extends Item {
	public XEngieCrucifixItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).durability(525).rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 34;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.engies_chaos.x_engie_crucifix.description_0"));
		list.add(Component.translatable("item.engies_chaos.x_engie_crucifix.description_1"));
		list.add(Component.translatable("item.engies_chaos.x_engie_crucifix.description_2"));
	}
}