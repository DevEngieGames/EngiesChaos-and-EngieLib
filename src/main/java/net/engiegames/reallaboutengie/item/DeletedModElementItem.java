package net.engiegames.reallaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class DeletedModElementItem extends Item {
	public DeletedModElementItem() {
		super(new Item.Properties().tab(null));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.allaboutengie.deleted_mod_element.description_0"));
		list.add(Component.translatable("item.allaboutengie.deleted_mod_element.description_1"));
	}
}