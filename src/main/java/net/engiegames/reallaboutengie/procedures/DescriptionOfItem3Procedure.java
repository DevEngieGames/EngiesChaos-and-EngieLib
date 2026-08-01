package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.engiegames.reallaboutengie.init.AllaboutengieModEnchantments;

public class DescriptionOfItem3Procedure {
	public static String execute(LevelAccessor world, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("playerfailedtechnochallenge") == false) {
			if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0 && !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)
					&& !(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0)) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7c- Engie's \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get())) + "\n" + "- Deals more damage to mobs essentially killing them in one hit with any weapon."
						+ "\n" + "However, this will not work with the following mobs: Any Passive Mob, (Hostile) DoomsDay, (Hostile) Super DoomsDay, (Hostile) The End, DISTORTED [I know someone tried.], and Punisher." + "\n"
						+ "- More coin and essence drops per enchantment level!";
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0 && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0
					&& !(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0)) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7c- Engie's \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get())) + "\n" + "- - Deals more damage to mobs essentially killing them in one hit with any weapon."
						+ "\n" + "However, this will not work with the following mobs: Any Passive Mob, (Hostile) DoomsDay, (Hostile) Super DoomsDay, (Hostile) The End, DISTORTED [I know someone tried.], and Punisher." + "\n"
						+ "- - More coin and essence drops per enchantment level!" + "\n" + "This is increased due to the item being enchanted with Fortune "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)) + "!";
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0 && !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)
					&& EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7e- \u00A7cEngie's \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get())) + "\n" + "- - Deals more damage to mobs essentially killing them in one hit with any weapon."
						+ "\n" + "However, this will not work with the following mobs: Any Passive Mob, (Hostile) DoomsDay, (Hostile) Super DoomsDay, (Hostile) The End, DISTORTED [I know someone tried.], and Punisher." + "\n"
						+ "- - More coin and essence drops per enchantment level!" + "\n" + "\u00A7e- \u00A7cEngie's \u00A7dAnti\u00A75matter \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get())) + "\n" + "- - Increases players chance of getting antimatter coins and essences!"
						+ (itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5);
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0 && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0
					&& EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7c- Engie's \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get())) + "\n" + "- - Deals more damage to mobs essentially killing them in one hit with any weapon."
						+ "\n" + "However, this will not work with the following mobs: Any Passive Mob, (Hostile) DoomsDay, (Hostile) Super DoomsDay, (Hostile) The End, DISTORTED [I know someone tried.], and Punisher." + "\n"
						+ "- - More coin and essence drops per enchantment level!" + "\n" + "This is increased due to the item being enchanted with Fortune "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)) + "!" + "\n" + "\u00A7e- \u00A7cEngie's \u00A7dAnti\u00A75matter \u00A76Blessing" + "\n"
						+ "\u00A73Enchantment Level: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get())) + "\n"
						+ "- - Increases players chance of getting antimatter coins and essences!" + "\n" + "This is increased due to the item being enchanted with Fortune "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)) + "!";
			} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0) && !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)
					&& EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7e- \u00A7cEngie's \u00A7dAnti\u00A75matter \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get())) + "\n" + "- - Increases players chance of getting antimatter coins and essences!";
			} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0) && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0
					&& EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get())) + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7e- \u00A7cEngie's \u00A7dAnti\u00A75matter \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get())) + "\n" + "- - Increases players chance of getting antimatter coins and essences!"
						+ "\n" + "This is increased due to the item being enchanted with Fortune " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)) + "!";
			} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0) && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0
					&& !(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0)) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7r- No RE:AAE enchantments found.";
			} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0) && !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)
					&& !(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0)) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7r- No RE:AAE enchantments found.";
			}
		} else if (itemstack.getOrCreateTag().getBoolean("playerfailedtechnochallenge") == true) {
			if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0 && !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)
					&& !(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0)) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7c- Engie's \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get())) + "\n" + "- More ore drops per enchantment level!";
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0 && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0
					&& !(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0)) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7c- Engie's \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get())) + "\n" + "- More ore drops per enchantment level!" + "\n"
						+ "This is increased due to the item being enchanted with Fortune " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)) + "!";
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0 && !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)
					&& EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7e- \u00A7cEngie's \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get())) + "\n" + "- More ore drops per enchantment level!" + "\n"
						+ "\u00A7e- \u00A7cEngie's \u00A7dAnti\u00A75matter \u00A76Blessing" + "\n" + "[\"\",{\"text\":\"- - \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Enchantment Level: \",\"bold\":true,\"color\":\"dark_purple\"}]"
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get())) + "\n" + "- - Increases players chance of getting antimatter engie ore!";
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0 && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0
					&& EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7c- Engie's \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get())) + "\n" + "- More ore drops per enchantment level!" + "\n"
						+ "This is increased due to the item being enchanted with Fortune " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)) + "!" + "\n"
						+ "\u00A7e- \u00A7cEngie's \u00A7dAnti\u00A75matter \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get())) + "\n" + "- - Increases players chance of getting antimatter engie ore!" + "\n"
						+ "This is increased due to the item being enchanted with Fortune " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)) + "!";
			} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0) && !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)
					&& EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7e- \u00A7cEngie's \u00A7dAnti\u00A75matter \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get())) + "\n" + "- - Increases players chance of getting antimatter engie ore!";
			} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0) && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0
					&& EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7e- \u00A7cEngie's \u00A7dAnti\u00A75matter \u00A76Blessing" + "\n" + "\u00A73Enchantment Level: "
						+ new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get())) + "\n" + "- - Increases players chance of getting antimatter coins and essences!"
						+ "\n" + "This is increased due to the item being enchanted with Fortune " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)) + "!";
			} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0) && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0
					&& !(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0)) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7r- No RE:AAE enchantments found.";
			} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), itemstack) != 0) && !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)
					&& !(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get(), itemstack) != 0)) {
				return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
						+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7r- No RE:AAE enchantments found.";
			}
		}
		return ("Current chance of antimatter drops for item: " + new java.text.DecimalFormat("\u00A7e##").format(itemstack.getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_ANTIMATTER_BLESSING.get()) + 5) + "%" + "\n")
				+ "\u00A7eCustom Enchantments:" + "\n" + "\u00A7r- No RE:AAE enchantments found.";
	}
}