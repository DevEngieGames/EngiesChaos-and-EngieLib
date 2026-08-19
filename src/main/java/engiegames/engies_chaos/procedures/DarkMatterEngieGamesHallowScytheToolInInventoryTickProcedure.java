package engiegames.engies_chaos.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class DarkMatterEngieGamesHallowScytheToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 10) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Strange" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 10 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 25) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Unremarkable" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 25 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 45) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Scarcely Lethal" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 45 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 70) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Mildly Menacing" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 70 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 100) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Somewhat Threatening" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 100 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 135) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Uncharitable" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 135 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 175) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Notably Dangerous" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 175 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 225) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Sufficiently Lethal" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 225 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 275) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Truly Feared" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 275 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 350) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Spectacularly Lethal" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 350 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Essence Spattered" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 750) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Wicked Nasty" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 750 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 999) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Positively Inhumane" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 999 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 1000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Totally Ordinary" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 1000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 1500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Engie Destroying" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 1500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 2500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Rage Inducing" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 2500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 5000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "World Clearing" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 5000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 7500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Rare" + " " + "Dark Matter EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 7500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 10000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Epic" + " " + "Dark Matter Hallow's Scythe")));
			itemstack.getOrCreateTag().putBoolean("givenupgradeitem", false);
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 10000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 12500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Legendary" + " " + "Dark Matter Hallow's Scythe")));
			if (itemstack.getOrCreateTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HALLOW_UPGRADE_TO_GOLD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				itemstack.getOrCreateTag().putBoolean("givenupgradeitem", true);
			}
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 12500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 15000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Mythic" + " " + "Dark Matter Hallow's Scythe")));
			if (itemstack.getOrCreateTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HALLOW_UPGRADE_TO_GOLD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				itemstack.getOrCreateTag().putBoolean("givenupgradeitem", true);
			}
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 15000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 20000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Exotic" + " " + "Dark Matter Hallow's Scythe")));
			if (itemstack.getOrCreateTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HALLOW_UPGRADE_TO_GOLD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				itemstack.getOrCreateTag().putBoolean("givenupgradeitem", true);
			}
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 20000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 25000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Engie" + " " + "Dark Matter Hallow's Scythe")));
			if (itemstack.getOrCreateTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HALLOW_UPGRADE_TO_GOLD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				itemstack.getOrCreateTag().putBoolean("givenupgradeitem", true);
			}
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 25000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "DevEngie's Own" + " " + "Dark Matter Hallow's Scythe")));
			if (itemstack.getOrCreateTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HALLOW_UPGRADE_TO_GOLD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				itemstack.getOrCreateTag().putBoolean("givenupgradeitem", true);
			}
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50527) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "EngieGames's Own" + " " + "Dark Matter Hallow's Scythe")));
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 50525);
			if (itemstack.getOrCreateTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HALLOW_UPGRADE_TO_GOLD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				itemstack.getOrCreateTag().putBoolean("givenupgradeitem", true);
			}
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50527) {
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 0);
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("allaboutengie:items/stunavilible")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}