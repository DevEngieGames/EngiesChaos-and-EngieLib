package net.engiegames.reallaboutengie.item;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.engiegames.reallaboutengie.procedures.DescriptionOfItem3Procedure;
import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;
import net.engiegames.reallaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class XEngiePickaxeItem extends PickaxeItem {
	public XEngiePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 128000;
			}

			public float getSpeed() {
				return 250f;
			}

			public float getAttackDamageBonus() {
				return 2498f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()),
						new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()),
						new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.ENRAGED_COIN.get()), new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()),
						new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()), new ItemStack(AllaboutengieModItems.THE_END_COIN.get()), new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()),
						new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()),
						new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()), new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()), new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()),
						new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
			}
		}, 1, 21f, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		String hoverText = DescriptionOfItem3Procedure.execute(level instanceof Level ? (LevelAccessor) level : null, itemstack);
		if (hoverText != null) {
			for (String line : hoverText.split("\n")) {
				list.add(Component.literal(line));
			}
		}
	}
}