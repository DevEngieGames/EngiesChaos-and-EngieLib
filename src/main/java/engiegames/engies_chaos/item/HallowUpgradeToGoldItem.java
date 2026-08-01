package engiegames.engies_chaos.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class HallowUpgradeToGoldItem extends Item {
	public HallowUpgradeToGoldItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.engies_chaos.hallow_upgrade_to_gold.description_0"));
		list.add(Component.translatable("item.engies_chaos.hallow_upgrade_to_gold.description_1"));
		list.add(Component.translatable("item.engies_chaos.hallow_upgrade_to_gold.description_2"));
	}
}