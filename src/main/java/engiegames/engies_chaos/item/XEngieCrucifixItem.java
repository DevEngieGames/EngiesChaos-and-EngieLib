package engiegames.engies_chaos.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class XEngieCrucifixItem extends Item {
	public XEngieCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(500).enchantable(34));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.engies_chaos.x_engie_crucifix.description_0"));
		list.add(Component.translatable("item.engies_chaos.x_engie_crucifix.description_1"));
		list.add(Component.translatable("item.engies_chaos.x_engie_crucifix.description_2"));
	}
}