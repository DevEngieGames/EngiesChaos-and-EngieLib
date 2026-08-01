package net.engiegames.reallaboutengie.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.engiegames.reallaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class EngiesAntimatterBlessingEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("allaboutengie_engies_antimatter_blessing",
			item -> Ingredient.of(new ItemStack(AllaboutengieModItems.ECHDEATH.get()), new ItemStack(AllaboutengieModItems.ENGIE_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_AXE.get()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ENGI_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.OPERATORS_PICKAXE.get()), new ItemStack(AllaboutengieModItems.CYBER_KATANA.get()), new ItemStack(AllaboutengieModItems.BLOOD_BATTLE_AXE.get()),
					new ItemStack(AllaboutengieModItems.CYBERBLOOD_KATANA.get()), new ItemStack(AllaboutengieModItems.CYBERBLOOD_BATTLE_AXE.get()), new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER.get()),
					new ItemStack(AllaboutengieModItems.BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER.get()),
					new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER.get()),
					new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.CODE_REDEEMERS_HAMMER.get()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.COMMON_SWORD.get()), new ItemStack(AllaboutengieModItems.COMMON_PICKAXE.get()), new ItemStack(AllaboutengieModItems.UNCOMMON_SWORD.get()),
					new ItemStack(AllaboutengieModItems.UNCOMMON_PICKAXE.get()), new ItemStack(AllaboutengieModItems.RARE_SWORD.get()), new ItemStack(AllaboutengieModItems.RARE_PICKAXE.get()), new ItemStack(AllaboutengieModItems.EPIC_SWORD.get()),
					new ItemStack(AllaboutengieModItems.EPIC_PICKAXE.get()), new ItemStack(AllaboutengieModItems.LEGENDARY_SWORD.get()), new ItemStack(AllaboutengieModItems.LEGENDARY_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.MYTHIC_SWORD.get()), new ItemStack(AllaboutengieModItems.MYTHIC_PICKAXE.get()), new ItemStack(AllaboutengieModItems.EXOTIC_SWORD.get()),
					new ItemStack(AllaboutengieModItems.EXOTIC_PICKAXE.get()), new ItemStack(AllaboutengieModItems.UNOBTAINIUM_SWORD.get()), new ItemStack(AllaboutengieModItems.UNOBTAINIUM_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get()), new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.COMICALLY_MASSIVE_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.HWG_SCYTHE.get()),
					new ItemStack(AllaboutengieModItems.DOOMSDAY_SCYTHE.get()), new ItemStack(AllaboutengieModItems.SUPER_DOOMSDAY_SCYTHE.get()), new ItemStack(AllaboutengieModItems.DOOMS_DAY_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_PICKAXE.get()), new ItemStack(AllaboutengieModItems.THE_END_SCYTHE.get()), new ItemStack(AllaboutengieModItems.THE_END_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.ENGIE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ENGIES_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ENGIES_PAXEL.get()), new ItemStack(AllaboutengieModItems.ENGIE_PAXEL.get()),
					new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PAXEL.get()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PAXEL.get()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PAXEL.get()),
					new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_PAXEL.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PAXEL.get()), new ItemStack(AllaboutengieModItems.DOOMS_DAY_PAXEL.get()),
					new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_PAXEL.get()), new ItemStack(AllaboutengieModItems.THE_END_PAXEL.get()), new ItemStack(AllaboutengieModItems.MINI_SCYTHE.get()), new ItemStack(AllaboutengieModItems.SCYTHE.get()),
					new ItemStack(AllaboutengieModItems.BIG_SCYTHE.get()), new ItemStack(AllaboutengieModItems.LARGE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.HUGE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ENORMOUS_SCYTHE.get()),
					new ItemStack(AllaboutengieModItems.GIGANTIC_SCYTHE.get()), new ItemStack(AllaboutengieModItems.MASSIVE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()),
					new ItemStack(AllaboutengieModItems.MONSTROSITY_SCYTHE.get()), new ItemStack(AllaboutengieModItems.DOOMSDAY_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.SUPER_DOOMSDAY_BAN_HAMMER.get()),
					new ItemStack(AllaboutengieModItems.THE_END_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ENGIES_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.A_REAL_BAN_HAMMER.get()),
					new ItemStack(AllaboutengieModItems.MINDSCAPE_ENGIES_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.MINDSCAPE_ENGIE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.MINDSCAPE_ENGIES_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.MINDSCAPE_ENGIES_PAXEL.get()), new ItemStack(AllaboutengieModItems.ENGIEGAMES_SWORD.get()), new ItemStack(AllaboutengieModItems.ENGIE_GAMES_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.ENGIE_SWORD.get()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_SWORD.get()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_SWORD.get()),
					new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_SWORD.get()), new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_SWORD.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_SWORD.get()),
					new ItemStack(AllaboutengieModItems.DOOMS_DAY_SWORD.get()), new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_SWORD.get()), new ItemStack(AllaboutengieModItems.THE_END_SWORD.get()),
					new ItemStack(AllaboutengieModItems.MINDSCAPE_ENGIES_SWORD.get()), new ItemStack(AllaboutengieModItems.ENGIES_SWORD.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_SWORD.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_PAXEL.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_SWORD.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_PAXEL.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_SWORD.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_PAXEL.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_SWORD.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_PAXEL.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SWORD.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_PAXEL.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_SWORD.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_PAXEL.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_SWORD.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_PAXEL.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_SWORD.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_PAXEL.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_SWORD.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_PAXEL.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_SWORD.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_PICKAXE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_PAXEL.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_SWORD.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_PICKAXE.get()), new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_GAMES_SWORD.get()), new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_GAMES_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_MINI_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_BIG_BAN_HAMMER.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_LARGE_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_HUGE_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENORMOUS_BAN_HAMMER.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_GIGANTIC_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_MASSIVE_BAN_HAMMER.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_BAN_HAMMER.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_BAN_HAMMER.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_MINI_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_SCYTHE.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_BIG_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_LARGE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_HUGE_SCYTHE.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_ENORMOUS_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_GIGANTIC_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_MASSIVE_SCYTHE.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_SCYTHE.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_SCYTHE.get()),
					new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.STARTERS_SWORD.get()), new ItemStack(AllaboutengieModItems.STARTERS_PICKAXE.get()),
					new ItemStack(AllaboutengieModItems.ENGIE_GAMES_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ENGIE_GAMES_HALLOW_SCYTHE.get()), new ItemStack(AllaboutengieModItems.X_ENGIE_PAXEL.get()),
					new ItemStack(AllaboutengieModItems.ROUGHIAN_ENGIE_GAMES_PAXEL.get()), new ItemStack(AllaboutengieModItems.X_ENGIE_PICKAXE.get()), new ItemStack(AllaboutengieModItems.X_ENGIE_CRUCIFIX.get()),
					new ItemStack(AllaboutengieModItems.ENGIES_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()))
					.test(new ItemStack(item)));

	public EngiesAntimatterBlessingEnchantment() {
		super(Enchantment.Rarity.VERY_RARE, ENCHANTMENT_CATEGORY, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}

	@Override
	public int getMaxLevel() {
		return 50;
	}

	@Override
	protected boolean checkCompatibility(Enchantment enchantment) {
		return super.checkCompatibility(enchantment) && !List.of(Enchantments.BINDING_CURSE, Enchantments.VANISHING_CURSE).contains(enchantment);
	}
}