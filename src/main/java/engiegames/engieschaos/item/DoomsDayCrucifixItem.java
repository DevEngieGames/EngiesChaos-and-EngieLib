package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class DoomsDayCrucifixItem extends Item {
	public DoomsDayCrucifixItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).durability(75).rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.engies_chaos.dooms_day_crucifix.description_0"));
	}
}