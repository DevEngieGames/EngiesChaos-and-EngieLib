package net.engiegames.reallaboutengie.item;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.engiegames.reallaboutengie.procedures.DescriptionOfItem2Procedure;
import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;
import net.engiegames.reallaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class AntimatterEngiesHoeItem extends HoeItem {
	public AntimatterEngiesHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 20000;
			}

			public float getSpeed() {
				return 92f;
			}

			public float getAttackDamageBonus() {
				return 974f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
			}
		}, 0, 5.4f, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		String hoverText = DescriptionOfItem2Procedure.execute(level instanceof Level ? (LevelAccessor) level : null, itemstack);
		if (hoverText != null) {
			for (String line : hoverText.split("\n")) {
				list.add(Component.literal(line));
			}
		}
	}
}