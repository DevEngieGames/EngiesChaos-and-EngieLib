package engiegames.engies_chaos.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class EngiesAntimatterBlessingEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("engies_chaos_engies_antimatter_blessing", item -> Ingredient.of(new ItemStack(EngiesChaosModItems.ECHDEATH.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_AXE.get()),
			new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ENGI_PICKAXE.get()), new ItemStack(EngiesChaosModItems.OPERATORS_PICKAXE.get()), new ItemStack(EngiesChaosModItems.CYBER_KATANA.get()),
			new ItemStack(EngiesChaosModItems.BLOOD_BATTLE_AXE.get()), new ItemStack(EngiesChaosModItems.CYBERBLOOD_KATANA.get()), new ItemStack(EngiesChaosModItems.CYBERBLOOD_BATTLE_AXE.get()),
			new ItemStack(EngiesChaosModItems.MINI_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.BIG_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.LARGE_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.HUGE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ENORMOUS_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.GIGANTIC_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.MASSIVE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_HAMMER.get()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.COMMON_SWORD.get()), new ItemStack(EngiesChaosModItems.COMMON_PICKAXE.get()), new ItemStack(EngiesChaosModItems.UNCOMMON_SWORD.get()), new ItemStack(EngiesChaosModItems.UNCOMMON_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.RARE_SWORD.get()), new ItemStack(EngiesChaosModItems.RARE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.EPIC_SWORD.get()), new ItemStack(EngiesChaosModItems.EPIC_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.LEGENDARY_SWORD.get()), new ItemStack(EngiesChaosModItems.LEGENDARY_PICKAXE.get()), new ItemStack(EngiesChaosModItems.MYTHIC_SWORD.get()), new ItemStack(EngiesChaosModItems.MYTHIC_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.EXOTIC_SWORD.get()), new ItemStack(EngiesChaosModItems.EXOTIC_PICKAXE.get()), new ItemStack(EngiesChaosModItems.UNOBTAINIUM_SWORD.get()), new ItemStack(EngiesChaosModItems.UNOBTAINIUM_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.COMICALLY_MASSIVE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.HWG_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.DOOMSDAY_SCYTHE.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMSDAY_SCYTHE.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_PICKAXE.get()), new ItemStack(EngiesChaosModItems.THE_END_SCYTHE.get()), new ItemStack(EngiesChaosModItems.THE_END_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ENGIE_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ENGIES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ENGIES_AIOT.get()), new ItemStack(EngiesChaosModItems.ENGIE_AIOT.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_AIOT.get()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_AIOT.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_AIOT.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_AIOT.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_AIOT.get()),
			new ItemStack(EngiesChaosModItems.THE_END_AIOT.get()), new ItemStack(EngiesChaosModItems.MINI_SCYTHE.get()), new ItemStack(EngiesChaosModItems.SCYTHE.get()), new ItemStack(EngiesChaosModItems.BIG_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.LARGE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.HUGE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ENORMOUS_SCYTHE.get()), new ItemStack(EngiesChaosModItems.GIGANTIC_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.MASSIVE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.DOOMSDAY_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMSDAY_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.THE_END_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ENGIES_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.A_REAL_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ENGIEGAMES_SWORD.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_SWORD.get()),
			new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SWORD.get()),
			new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_SWORD.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_SWORD.get()),
			new ItemStack(EngiesChaosModItems.THE_END_SWORD.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_SWORD.get()), new ItemStack(EngiesChaosModItems.ENGIES_SWORD.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_AIOT.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_SWORD.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_AIOT.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_SWORD.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_AIOT.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_SWORD.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_AIOT.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_SWORD.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_AIOT.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_SWORD.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_AIOT.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_SWORD.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMES_SWORD.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMES_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_MINI_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIG_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_LARGE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_HUGE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENORMOUS_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_GIGANTIC_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MASSIVE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MINI_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIG_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_LARGE_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_HUGE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENORMOUS_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_GIGANTIC_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_MASSIVE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.STARTERS_SWORD.get()), new ItemStack(EngiesChaosModItems.STARTERS_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_GAMES_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_HALLOW_SCYTHE.get()), new ItemStack(EngiesChaosModItems.X_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_AIOT.get()), new ItemStack(EngiesChaosModItems.X_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.X_ENGIE_CRUCIFIX.get()),
			new ItemStack(EngiesChaosModItems.ENGIES_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get())).test(new ItemStack(item)));

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