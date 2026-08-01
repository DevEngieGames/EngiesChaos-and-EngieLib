package net.engiegames.reallaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;

import java.util.List;

public class AntimatterMonstrosityEngieEssenceItem extends Item {
	public AntimatterMonstrosityEngieEssenceItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.allaboutengie.antimatter_monstrosity_engie_essence.description_0"));
	}
}