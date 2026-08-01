package net.engiegames.reallaboutengie.item;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.engiegames.reallaboutengie.procedures.EngieGamesHallowScytheSpecialInformationProcedure;
import net.engiegames.reallaboutengie.procedures.EngieGamesGoldenHallowScytheToolInHandTickProcedure;
import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;
import net.engiegames.reallaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class EngieGamesGoldenHallowScytheItem extends SwordItem {
	public EngieGamesGoldenHallowScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 128000;
			}

			public float getSpeed() {
				return 125f;
			}

			public float getAttackDamageBonus() {
				return 112496f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(AllaboutengieModTabs.TAB_BAN_HAMMERS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		String hoverText = EngieGamesHallowScytheSpecialInformationProcedure.execute(level instanceof Level ? (LevelAccessor) level : null, itemstack);
		if (hoverText != null) {
			for (String line : hoverText.split("\n")) {
				list.add(Component.literal(line));
			}
		}
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EngieGamesGoldenHallowScytheToolInHandTickProcedure.execute(world, entity, itemstack);
	}
}