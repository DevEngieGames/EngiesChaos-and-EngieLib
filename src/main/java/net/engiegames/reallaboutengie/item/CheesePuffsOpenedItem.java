package net.engiegames.reallaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.engiegames.reallaboutengie.procedures.CheesePuffsOpenedRightclickedProcedure;
import net.engiegames.reallaboutengie.procedures.CheesePuffsOpenedItemInInventoryTickProcedure;
import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;

public class CheesePuffsOpenedItem extends Item {
	public CheesePuffsOpenedItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_FOOD));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		CheesePuffsOpenedRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CheesePuffsOpenedRightclickedProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		CheesePuffsOpenedItemInInventoryTickProcedure.execute(entity);
	}
}