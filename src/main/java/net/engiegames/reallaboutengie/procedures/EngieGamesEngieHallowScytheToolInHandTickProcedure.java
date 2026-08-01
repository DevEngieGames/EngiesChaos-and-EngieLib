package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class EngieGamesEngieHallowScytheToolInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 10) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Collectors" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 10 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 25) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Unremarkable" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 25 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 45) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Scarcely Lethal" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 45 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 70) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Mildly Menacing" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 70 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 100) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Somewhat Threatening" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 100 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 135) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Uncharitable" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 135 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 175) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Notably Dangerous" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 175 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 225) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Sufficiently Lethal" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 225 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 275) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Truly Feared" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 275 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 350) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Spectacularly Lethal" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 350 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 500) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Essence Spattered" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 750) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Wicked Nasty" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 750 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 999) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Positively Inhumane" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 999 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 1000) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Totally Ordinary" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 1000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 1500) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Engie Destroying" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 1500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 2500) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Rage Inducing" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 2500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 5000) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "World Clearing" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 5000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 7500) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Rare" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 7500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 10000) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Epic" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 10000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 12500) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Legendary" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 12500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 15000) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Mythic" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 17500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 20000) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Exotic" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 20000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 25000) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Engie" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 25000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50525) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "DevEngie's Own" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50525) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "EngieGames's Own" + " " + "EngieGames's Hallow Scythe")));
		}
	}
}