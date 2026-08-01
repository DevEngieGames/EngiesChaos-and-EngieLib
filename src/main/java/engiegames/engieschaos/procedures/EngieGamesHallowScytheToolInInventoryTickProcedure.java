package engiegames.engieschaos.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;

import engiegames.engieschaos.init.EngiesChaosModItems;
import engiegames.engieschaos.EngiesChaosMod;

public class EngieGamesHallowScytheToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 10) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Strange" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 10 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 25) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Unremarkable" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 25 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 45) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Scarcely Lethal" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 45 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 70) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Mildly Menacing" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 70 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 100) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Somewhat Threatening" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 100 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 135) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Uncharitable" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 135 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 175) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Notably Dangerous" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 175 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 225) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Sufficiently Lethal" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 225 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 275) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Truly Feared" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 275 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 350) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Spectacularly Lethal" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 350 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Essence Spattered" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 750) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Wicked Nasty" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 750 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 999) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Positively Inhumane" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 999 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 1000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Totally Ordinary" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 1000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 1500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Engie Destroying" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 1500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 2500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Rage Inducing" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 2500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 5000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "World Clearing" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 5000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 7500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Rare" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 7500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 10000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Epic" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 10000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 12500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Legendary" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 12500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 15000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Mythic" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 17500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 20000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Exotic" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 20000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 25000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Engie" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 25000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "DevEngie's Own" + " " + "EngieGames's Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50525) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(EngiesChaosModItems.ENGIE_GAMES_HALLOW_SCYTHE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				{
					CompoundTag _nbtTag = new ItemStack(EngiesChaosModItems.ENGIE_GAMES_HALLOW_SCYTHE.get()).getTag();
					if (_nbtTag != null)
						new ItemStack(EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()).setTag(_nbtTag.copy());
				}
			});
			EngiesChaosMod.queueServerWork(2, () -> {
				new ItemStack(EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()).getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 20210);
			});
		}
	}
}