package engiegames.engieschaos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.init.EngiesChaosModMenus;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class AntimatterEngieGamesTradeUITickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 64 && getAmountInGUISlot(entity, 0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_CRUCIFIX.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(3).getItem() : ItemStack.EMPTY).enchant(Enchantments.MENDING, 1);
		} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 60 && getAmountInGUISlot(entity, 2) < 64 && getAmountInGUISlot(entity, 0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_SWORD.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 48 && getAmountInGUISlot(entity, 2) < 60 && getAmountInGUISlot(entity, 0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 36 && getAmountInGUISlot(entity, 2) < 48 && getAmountInGUISlot(entity, 0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_AXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 24 && getAmountInGUISlot(entity, 2) < 36 && getAmountInGUISlot(entity, 0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_SHOVEL.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 12 && getAmountInGUISlot(entity, 2) < 24 && getAmountInGUISlot(entity, 0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_HOE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 1) >= 48 && getAmountInGUISlot(entity, 1) < 64 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 1) >= 32 && getAmountInGUISlot(entity, 1) < 48 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 1) >= 16 && getAmountInGUISlot(entity, 1) < 32 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}