package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class MindscapeTradeTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_CRUCIFIX.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 55 && getAmountInGUISlot(entity, 1) < 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 44 && getAmountInGUISlot(entity, 1) < 55) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 33 && getAmountInGUISlot(entity, 1) < 44) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 22 && getAmountInGUISlot(entity, 1) < 33) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 11 && getAmountInGUISlot(entity, 1) < 22) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_SWORD.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 52 && getAmountInGUISlot(entity, 0) < 64 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 39 && getAmountInGUISlot(entity, 0) < 52 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_AXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 26 && getAmountInGUISlot(entity, 0) < 39 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_SHOVEL.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 13 && getAmountInGUISlot(entity, 0) < 26 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_HOE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
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