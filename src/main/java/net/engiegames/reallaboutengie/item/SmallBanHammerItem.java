package net.engiegames.reallaboutengie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;
import net.engiegames.reallaboutengie.init.AllaboutengieModItems;

public class SmallBanHammerItem extends SwordItem {
	public SmallBanHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 400;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 96f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ENGI_GEM.get()));
			}
		}, 3, -3f, new Item.Properties().tab(AllaboutengieModTabs.TAB_BAN_HAMMERS));
	}
}