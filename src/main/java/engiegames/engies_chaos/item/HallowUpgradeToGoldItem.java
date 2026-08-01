package engiegames.engies_chaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class HallowUpgradeToGoldItem extends Item {
	public HallowUpgradeToGoldItem() {
		super(new Item.Properties().tab(null).stacksTo(1));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.engies_chaos.hallow_upgrade_to_gold.description_0"));
		list.add(Component.translatable("item.engies_chaos.hallow_upgrade_to_gold.description_1"));
		list.add(Component.translatable("item.engies_chaos.hallow_upgrade_to_gold.description_2"));
	}
}