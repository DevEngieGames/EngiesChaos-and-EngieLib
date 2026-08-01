package engiegames.engies_chaos.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import java.util.List;

import engiegames.engies_chaos.procedures.EngieHeadPlayerFinishesUsingItemProcedure;

public class EngieHeadItem extends Item {
	public EngieHeadItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(10).saturationModifier(5f).alwaysEdible().build()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.engies_chaos.engie_head.description_0"));
		list.add(Component.translatable("item.engies_chaos.engie_head.description_1"));
		list.add(Component.translatable("item.engies_chaos.engie_head.description_2"));
		list.add(Component.translatable("item.engies_chaos.engie_head.description_3"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		EngieHeadPlayerFinishesUsingItemProcedure.execute(world, entity);
		return retval;
	}
}