package engiegames.engies_chaos.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

import java.util.List;

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class EngiesBlessingEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("engies_chaos_engies_blessing", item -> Ingredient.of(new ItemStack(EngiesChaosModItems.ECHDEATH.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_AXE.get()), new ItemStack(EngiesChaosModItems.ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ENGIE_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ENGIE_HOE.get()),
			new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_AXE.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_HOE.get()),
			new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_AXE.get()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_SHOVEL.get()),
			new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_HOE.get()), new ItemStack(EngiesChaosModItems.ENGI_AXE.get()), new ItemStack(EngiesChaosModItems.ENGI_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ENGI_SHOVEL.get()),
			new ItemStack(EngiesChaosModItems.ENGIES_SCYTHE.get()), new ItemStack(EngiesChaosModItems.OPERATORS_AXE.get()), new ItemStack(EngiesChaosModItems.OPERATORS_PICKAXE.get()), new ItemStack(EngiesChaosModItems.OPERATORS_SHOVEL.get()),
			new ItemStack(EngiesChaosModItems.OPERATORS_HOE.get()), new ItemStack(EngiesChaosModItems.CYBER_KATANA.get()), new ItemStack(EngiesChaosModItems.BLOOD_BATTLE_AXE.get()), new ItemStack(EngiesChaosModItems.CYBERBLOOD_KATANA.get()),
			new ItemStack(EngiesChaosModItems.CYBERBLOOD_BATTLE_AXE.get()), new ItemStack(EngiesChaosModItems.MINI_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.BIG_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.LARGE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.HUGE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ENORMOUS_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.GIGANTIC_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.MASSIVE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_AXE.get()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_SHOVEL.get()),
			new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_HOE.get()), new ItemStack(EngiesChaosModItems.COMMON_SWORD.get()), new ItemStack(EngiesChaosModItems.COMMON_PICKAXE.get()), new ItemStack(EngiesChaosModItems.COMMON_AXE.get()),
			new ItemStack(EngiesChaosModItems.COMMON_SHOVEL.get()), new ItemStack(EngiesChaosModItems.COMMON_HOE.get()), new ItemStack(EngiesChaosModItems.UNCOMMON_SWORD.get()), new ItemStack(EngiesChaosModItems.UNCOMMON_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.UNCOMMON_AXE.get()), new ItemStack(EngiesChaosModItems.UNCOMMON_SHOVEL.get()), new ItemStack(EngiesChaosModItems.UNCOMMON_HOE.get()), new ItemStack(EngiesChaosModItems.RARE_SWORD.get()),
			new ItemStack(EngiesChaosModItems.RARE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.RARE_AXE.get()), new ItemStack(EngiesChaosModItems.RARE_SHOVEL.get()), new ItemStack(EngiesChaosModItems.RARE_HOE.get()),
			new ItemStack(EngiesChaosModItems.EPIC_SWORD.get()), new ItemStack(EngiesChaosModItems.EPIC_PICKAXE.get()), new ItemStack(EngiesChaosModItems.EPIC_AXE.get()), new ItemStack(EngiesChaosModItems.EPIC_SHOVEL.get()),
			new ItemStack(EngiesChaosModItems.EPIC_HOE.get()), new ItemStack(EngiesChaosModItems.LEGENDARY_SWORD.get()), new ItemStack(EngiesChaosModItems.LEGENDARY_PICKAXE.get()), new ItemStack(EngiesChaosModItems.LEGENDARY_AXE.get()),
			new ItemStack(EngiesChaosModItems.LEGENDARY_SHOVEL.get()), new ItemStack(EngiesChaosModItems.LEGENDARY_HOE.get()), new ItemStack(EngiesChaosModItems.MYTHIC_SWORD.get()), new ItemStack(EngiesChaosModItems.MYTHIC_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.MYTHIC_AXE.get()), new ItemStack(EngiesChaosModItems.MYTHIC_SHOVEL.get()), new ItemStack(EngiesChaosModItems.MYTHIC_HOE.get()), new ItemStack(EngiesChaosModItems.EXOTIC_SWORD.get()),
			new ItemStack(EngiesChaosModItems.EXOTIC_PICKAXE.get()), new ItemStack(EngiesChaosModItems.EXOTIC_AXE.get()), new ItemStack(EngiesChaosModItems.EXOTIC_SHOVEL.get()), new ItemStack(EngiesChaosModItems.EXOTIC_HOE.get()),
			new ItemStack(EngiesChaosModItems.UNOBTAINIUM_SWORD.get()), new ItemStack(EngiesChaosModItems.UNOBTAINIUM_PICKAXE.get()), new ItemStack(EngiesChaosModItems.UNOBTAINIUM_AXE.get()),
			new ItemStack(EngiesChaosModItems.UNOBTAINIUM_SHOVEL.get()), new ItemStack(EngiesChaosModItems.UNOBTAINIUM_HOE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_AXE.get()),
			new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SHOVEL.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_HOE.get()),
			new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_AXE.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_SHOVEL.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_HOE.get()), new ItemStack(EngiesChaosModItems.COMICALLY_MASSIVE_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.MONSTROSITY_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.HWG_SCYTHE.get()), new ItemStack(EngiesChaosModItems.DOOMSDAY_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.SUPER_DOOMSDAY_SCYTHE.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_AXE.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_PICKAXE.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_SHOVEL.get()),
			new ItemStack(EngiesChaosModItems.DOOMS_DAY_HOE.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_AXE.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_SHOVEL.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_HOE.get()), new ItemStack(EngiesChaosModItems.THE_END_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.THE_END_PICKAXE.get()), new ItemStack(EngiesChaosModItems.THE_END_AXE.get()), new ItemStack(EngiesChaosModItems.THE_END_SHOVEL.get()), new ItemStack(EngiesChaosModItems.THE_END_HOE.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ENGIES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ENGIES_AXE.get()), new ItemStack(EngiesChaosModItems.ENGIES_SHOVEL.get()),
			new ItemStack(EngiesChaosModItems.ENGIES_HOE.get()), new ItemStack(EngiesChaosModItems.ENGIES_AIOT.get()), new ItemStack(EngiesChaosModItems.ENGIE_AIOT.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_AIOT.get()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_AIOT.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PAXEL.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_AIOT.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_AIOT.get()),
			new ItemStack(EngiesChaosModItems.THE_END_AIOT.get()), new ItemStack(EngiesChaosModItems.MINI_SCYTHE.get()), new ItemStack(EngiesChaosModItems.SCYTHE.get()), new ItemStack(EngiesChaosModItems.BIG_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.LARGE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.HUGE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ENORMOUS_SCYTHE.get()), new ItemStack(EngiesChaosModItems.GIGANTIC_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.MASSIVE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.DOOMSDAY_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMSDAY_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.THE_END_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ENGIES_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.A_REAL_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_AXE.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_SHOVEL.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_HOE.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ENGIEGAMES_SWORD.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_AXE.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_GAMES_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_HOE.get()), new ItemStack(EngiesChaosModItems.ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_SWORD.get()),
			new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SWORD.get()),
			new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_SWORD.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_SWORD.get()),
			new ItemStack(EngiesChaosModItems.THE_END_SWORD.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_SWORD.get()), new ItemStack(EngiesChaosModItems.ENGIES_SWORD.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_AXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_AXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_AXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_AXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_AXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SHOVEL.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_AXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_AXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_AXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_AXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_AXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_AIOT.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_SWORD.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_AXE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_HOE.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMES_SWORD.get()),
			new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMES_AXE.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMES_SHOVEL.get()),
			new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMES_HOE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MINI_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_BIG_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_LARGE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_HUGE_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENORMOUS_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_GIGANTIC_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MASSIVE_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_BAN_HAMMER.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_MINI_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIG_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_LARGE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_HUGE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENORMOUS_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_GIGANTIC_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MASSIVE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_SCYTHE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_SCYTHE.get()), new ItemStack(EngiesChaosModItems.STARTERS_SWORD.get()),
			new ItemStack(EngiesChaosModItems.STARTERS_PICKAXE.get()), new ItemStack(EngiesChaosModItems.STARTERS_AXE.get()), new ItemStack(EngiesChaosModItems.STARTERS_SHOVEL.get()), new ItemStack(EngiesChaosModItems.STARTERS_HOE.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_GAMES_BAN_HAMMER.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_HALLOW_SCYTHE.get()), new ItemStack(EngiesChaosModItems.OPERATORS_HELMET.get()),
			new ItemStack(EngiesChaosModItems.OPERATORS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.OPERATORS_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.OPERATORS_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.DEVELOPER_HELMET.get()), new ItemStack(EngiesChaosModItems.DEVELOPER_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.DEVELOPER_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.DEVELOPER_BOOTS.get()), new ItemStack(EngiesChaosModItems.CONTRIBUTOR_HELMET.get()), new ItemStack(EngiesChaosModItems.CONTRIBUTOR_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.CONTRIBUTOR_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.CONTRIBUTOR_BOOTS.get()), new ItemStack(EngiesChaosModItems.TESTER_HELMET.get()), new ItemStack(EngiesChaosModItems.TESTER_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.TESTER_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.TESTER_BOOTS.get()), new ItemStack(EngiesChaosModItems.ENGIES_HELMET.get()), new ItemStack(EngiesChaosModItems.ENGIES_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.ENGIES_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.ENGIES_BOOTS.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIES_HELMET.get()),
			new ItemStack(EngiesChaosModItems.ANGRY_ENGIES_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIES_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIES_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.ENRAGED_ENGIES_HELMET.get()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIES_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIES_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.ENRAGED_ENGIES_BOOTS.get()), new ItemStack(EngiesChaosModItems.SHARK_HELMET.get()), new ItemStack(EngiesChaosModItems.SHARK_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.SHARK_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.SHARK_BOOTS.get()), new ItemStack(EngiesChaosModItems.ALBINO_SHARK_HELMET.get()), new ItemStack(EngiesChaosModItems.ALBINO_SHARK_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.ALBINO_SHARK_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.ALBINO_SHARK_BOOTS.get()), new ItemStack(EngiesChaosModItems.RARE_SHARK_HELMET.get()),
			new ItemStack(EngiesChaosModItems.RARE_SHARK_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.RARE_SHARK_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.RARE_SHARK_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_HELMET.get()), new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_BOOTS.get()), new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_HELMET.get()), new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_BOOTS.get()), new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_HELMET.get()),
			new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_SHARK_HELMET.get()), new ItemStack(EngiesChaosModItems.ENGIE_SHARK_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ENGIE_SHARK_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_SHARK_BOOTS.get()), new ItemStack(EngiesChaosModItems.CYBERBLOOD_HELMET.get()), new ItemStack(EngiesChaosModItems.CYBERBLOOD_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.CYBERBLOOD_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.CYBERBLOOD_BOOTS.get()), new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_HELMET.get()),
			new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIES_HELMET.get()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIES_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIES_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIES_BOOTS.get()), new ItemStack(EngiesChaosModItems.COMMON_HELMET.get()), new ItemStack(EngiesChaosModItems.COMMON_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.COMMON_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.COMMON_BOOTS.get()), new ItemStack(EngiesChaosModItems.UNCOMMON_HELMET.get()), new ItemStack(EngiesChaosModItems.UNCOMMON_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.UNCOMMON_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.UNCOMMON_BOOTS.get()), new ItemStack(EngiesChaosModItems.RARE_HELMET.get()), new ItemStack(EngiesChaosModItems.RARE_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.RARE_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.RARE_BOOTS.get()), new ItemStack(EngiesChaosModItems.EPIC_HELMET.get()), new ItemStack(EngiesChaosModItems.EPIC_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.EPIC_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.EPIC_BOOTS.get()), new ItemStack(EngiesChaosModItems.LEGENDARY_HELMET.get()), new ItemStack(EngiesChaosModItems.LEGENDARY_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.LEGENDARY_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.LEGENDARY_BOOTS.get()), new ItemStack(EngiesChaosModItems.MYTHIC_HELMET.get()), new ItemStack(EngiesChaosModItems.MYTHIC_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.MYTHIC_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.MYTHIC_BOOTS.get()), new ItemStack(EngiesChaosModItems.EXOTIC_HELMET.get()), new ItemStack(EngiesChaosModItems.EXOTIC_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.EXOTIC_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.EXOTIC_BOOTS.get()), new ItemStack(EngiesChaosModItems.UNOBTAINIUM_HELMET.get()), new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.UNOBTAINIUM_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.UNOBTAINIUM_BOOTS.get()), new ItemStack(EngiesChaosModItems.CYBER_HELMET.get()), new ItemStack(EngiesChaosModItems.CYBER_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.CYBER_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.CYBER_BOOTS.get()), new ItemStack(EngiesChaosModItems.BLOOD_HELMET.get()), new ItemStack(EngiesChaosModItems.BLOOD_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.BLOOD_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.BLOOD_BOOTS.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIES_HELMET.get()),
			new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIES_HELMET.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIES_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIES_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIES_BOOTS.get()), new ItemStack(EngiesChaosModItems.EPIC_SHARK_HELMET.get()), new ItemStack(EngiesChaosModItems.EPIC_SHARK_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.EPIC_SHARK_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.EPIC_SHARK_BOOTS.get()), new ItemStack(EngiesChaosModItems.HWG_HELMET.get()), new ItemStack(EngiesChaosModItems.HWG_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.HWG_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.HWG_BOOTS.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAYS_HELMET.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAYS_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.DOOMS_DAYS_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAYS_BOOTS.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAYS_HELMET.get()),
			new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAYS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAYS_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAYS_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.THE_ENDS_HELMET.get()), new ItemStack(EngiesChaosModItems.THE_ENDS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.THE_ENDS_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.THE_ENDS_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_GAMESS_HELMET.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMESS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMESS_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_GAMESS_BOOTS.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_HELMET.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_BOOTS.get()), new ItemStack(EngiesChaosModItems.THE_REAL_ENGIE_GAMESS_HELMET.get()),
			new ItemStack(EngiesChaosModItems.THE_REAL_ENGIE_GAMESS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.THE_REAL_ENGIE_GAMESS_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.THE_REAL_ENGIE_GAMESS_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.DISTORTEDS_HELMET.get()), new ItemStack(EngiesChaosModItems.DISTORTEDS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.DISTORTEDS_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.DISTORTEDS_BOOTS.get()), new ItemStack(EngiesChaosModItems.BETA_TESTER_HELMET.get()), new ItemStack(EngiesChaosModItems.BETA_TESTER_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.BETA_TESTER_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.BETA_TESTER_BOOTS.get()), new ItemStack(EngiesChaosModItems.CONTENT_CREATOR_HELMET.get()),
			new ItemStack(EngiesChaosModItems.CONTENT_CREATOR_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.CONTENT_CREATOR_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.CONTENT_CREATOR_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_HELMET.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIES_BOOTS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIES_HELMET.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIES_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIES_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIES_BOOTS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIES_HELMET.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIES_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIES_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIES_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIES_HELMET.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIES_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIES_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIES_BOOTS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_HELMET.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIES_HELMET.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIES_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIES_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIES_BOOTS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAYS_HELMET.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAYS_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAYS_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAYS_BOOTS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAYS_HELMET.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAYS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAYS_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAYS_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_ENDS_HELMET.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_ENDS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_ENDS_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_ENDS_BOOTS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMESS_HELMET.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMESS_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMESS_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMESS_BOOTS.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_HELMET.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_BOOTS.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMESS_HELMET.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMESS_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMESS_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMESS_BOOTS.get()), new ItemStack(EngiesChaosModItems.STARTER_HELMET.get()),
			new ItemStack(EngiesChaosModItems.STARTER_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.STARTER_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.STARTER_BOOTS.get()),
			new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_HELMET.get()), new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_CHESTPLATE.get()), new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_LEGGINGS.get()),
			new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_BOOTS.get()), new ItemStack(Items.WOODEN_SWORD), new ItemStack(Items.WOODEN_SHOVEL), new ItemStack(Items.WOODEN_PICKAXE), new ItemStack(Items.WOODEN_AXE),
			new ItemStack(Items.WOODEN_HOE), new ItemStack(Items.STONE_SWORD), new ItemStack(Items.STONE_SHOVEL), new ItemStack(Items.STONE_PICKAXE), new ItemStack(Items.STONE_AXE), new ItemStack(Items.STONE_HOE), new ItemStack(Items.IRON_SWORD),
			new ItemStack(Items.IRON_SHOVEL), new ItemStack(Items.IRON_PICKAXE), new ItemStack(Items.IRON_AXE), new ItemStack(Items.IRON_HOE), new ItemStack(Items.GOLDEN_SWORD), new ItemStack(Items.GOLDEN_SHOVEL), new ItemStack(Items.GOLDEN_PICKAXE),
			new ItemStack(Items.GOLDEN_AXE), new ItemStack(Items.GOLDEN_HOE), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.DIAMOND_SHOVEL), new ItemStack(Items.DIAMOND_PICKAXE), new ItemStack(Items.DIAMOND_HOE),
			new ItemStack(Items.NETHERITE_SWORD), new ItemStack(Items.NETHERITE_PICKAXE), new ItemStack(Items.LEATHER_HELMET), new ItemStack(Items.LEATHER_CHESTPLATE), new ItemStack(Items.LEATHER_LEGGINGS), new ItemStack(Items.LEATHER_BOOTS),
			new ItemStack(Items.CHAINMAIL_HELMET), new ItemStack(Items.CHAINMAIL_CHESTPLATE), new ItemStack(Items.CHAINMAIL_LEGGINGS), new ItemStack(Items.CHAINMAIL_BOOTS), new ItemStack(Items.IRON_HELMET), new ItemStack(Items.IRON_CHESTPLATE),
			new ItemStack(Items.IRON_LEGGINGS), new ItemStack(Items.IRON_BOOTS), new ItemStack(Items.GOLDEN_HELMET), new ItemStack(Items.GOLDEN_CHESTPLATE), new ItemStack(Items.GOLDEN_LEGGINGS), new ItemStack(Items.GOLDEN_BOOTS),
			new ItemStack(Items.DIAMOND_HELMET), new ItemStack(Items.DIAMOND_CHESTPLATE), new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(Items.NETHERITE_HELMET), new ItemStack(Items.NETHERITE_CHESTPLATE),
			new ItemStack(Items.NETHERITE_LEGGINGS), new ItemStack(Items.NETHERITE_BOOTS), new ItemStack(EngiesChaosModItems.CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_CRUCIFIX.get()),
			new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.THE_END_CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.ENGIE_CRUCIFIX.get()),
			new ItemStack(EngiesChaosModItems.MINDSCAPE_CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMS_DAY_CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMS_DAY_CRUCIFIX.get()),
			new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_GAMES_CRUCIFIX.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_GAMES_CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_CRUCIFIX.get()),
			new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_PICKAXE.get()), new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_AXE.get()),
			new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_SHOVEL.get()), new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_HOE.get()), new ItemStack(EngiesChaosModItems.X_ENGIE_PICKAXE.get()),
			new ItemStack(EngiesChaosModItems.X_ENGIE_AIOT.get()), new ItemStack(EngiesChaosModItems.X_ENGIE_CRUCIFIX.get()), new ItemStack(EngiesChaosModItems.X_ENGIE_HELMET.get()), new ItemStack(EngiesChaosModItems.X_ENGIE_CHESTPLATE.get()),
			new ItemStack(EngiesChaosModItems.X_ENGIE_LEGGINGS.get()), new ItemStack(EngiesChaosModItems.X_ENGIE_BOOTS.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()),
			new ItemStack(EngiesChaosModItems.ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()), new ItemStack(Items.DIAMOND_AXE), new ItemStack(Items.NETHERITE_SHOVEL), new ItemStack(Items.NETHERITE_AXE), new ItemStack(Items.NETHERITE_HOE),
			new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_AIOT.get())).test(new ItemStack(item)));

	public EngiesBlessingEnchantment() {
		super(Enchantment.Rarity.UNCOMMON, ENCHANTMENT_CATEGORY, EquipmentSlot.values());
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
		return 25;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 25;
	}

	@Override
	protected boolean checkCompatibility(Enchantment enchantment) {
		return super.checkCompatibility(enchantment) && !List.of(Enchantments.BINDING_CURSE, Enchantments.SILK_TOUCH, Enchantments.INFINITY_ARROWS, Enchantments.FISHING_LUCK, Enchantments.FISHING_SPEED, Enchantments.LOYALTY, Enchantments.IMPALING,
				Enchantments.RIPTIDE, Enchantments.CHANNELING, Enchantments.MULTISHOT, Enchantments.QUICK_CHARGE, Enchantments.PIERCING).contains(enchantment);
	}
}