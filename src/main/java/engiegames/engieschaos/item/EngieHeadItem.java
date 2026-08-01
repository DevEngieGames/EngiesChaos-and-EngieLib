package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import java.util.List;

import engiegames.engieschaos.procedures.EngieHeadPlayerFinishesUsingItemProcedure;
import engiegames.engieschaos.init.EngiesChaosModTabs;

public class EngieHeadItem extends Item {
	public EngieHeadItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_AAE_ITEMS_FOOD).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(10).saturationMod(5f).alwaysEat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.engies_chaos.engie_head.description_0"));
		list.add(Component.translatable("item.engies_chaos.engie_head.description_1"));
		list.add(Component.translatable("item.engies_chaos.engie_head.description_2"));
		list.add(Component.translatable("item.engies_chaos.engie_head.description_3"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		EngieHeadPlayerFinishesUsingItemProcedure.execute(world, entity);
		return retval;
	}
}