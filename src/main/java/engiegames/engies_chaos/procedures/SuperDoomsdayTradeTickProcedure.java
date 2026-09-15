package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class SuperDoomsdayTradeTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_CRUCIFIX.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMSDAY_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMSDAY_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 44 && getAmountInGUISlot(entity, 1) < 55) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAYS_HELMET.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAYS_CHESTPLATE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAYS_LEGGINGS.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAYS_BOOTS.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_SWORD.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_PICKAXE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_AXE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_SHOVEL.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_HOE.get()).copy();
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
		if (getAmountInGUISlot(entity, 4) >= 64 && getAmountInGUISlot(entity, 5) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMS_DAY_CRUCIFIX.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 4) >= 64 && getAmountInGUISlot(entity, 5) >= 55 && getAmountInGUISlot(entity, 5) < 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 4) >= 64 && getAmountInGUISlot(entity, 5) >= 44 && getAmountInGUISlot(entity, 5) < 55) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAYS_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 4) >= 64 && getAmountInGUISlot(entity, 5) >= 33 && getAmountInGUISlot(entity, 5) < 44) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAYS_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 4) >= 64 && getAmountInGUISlot(entity, 5) >= 22 && getAmountInGUISlot(entity, 5) < 33) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAYS_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 4) >= 64 && getAmountInGUISlot(entity, 5) >= 11 && getAmountInGUISlot(entity, 5) < 22) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAYS_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 4) >= 64 && getAmountInGUISlot(entity, 5) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_SWORD.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 4) >= 52 && getAmountInGUISlot(entity, 4) < 64 && getAmountInGUISlot(entity, 5) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 4) >= 39 && getAmountInGUISlot(entity, 4) < 52 && getAmountInGUISlot(entity, 5) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_AXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 4) >= 26 && getAmountInGUISlot(entity, 4) < 39 && getAmountInGUISlot(entity, 5) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_SHOVEL.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 4) >= 13 && getAmountInGUISlot(entity, 4) < 26 && getAmountInGUISlot(entity, 5) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_HOE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (getAmountInGUISlot(entity, 8) >= 64 && getAmountInGUISlot(entity, 9) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DOOMS_DAY_CRUCIFIX.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 8) >= 64 && getAmountInGUISlot(entity, 9) >= 55 && getAmountInGUISlot(entity, 9) < 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMSDAY_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMS_DAY_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 8) >= 64 && getAmountInGUISlot(entity, 9) >= 44 && getAmountInGUISlot(entity, 9) < 55) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMSDAYS_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 8) >= 64 && getAmountInGUISlot(entity, 9) >= 33 && getAmountInGUISlot(entity, 9) < 44) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_DOOMSDAYS_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 8) >= 64 && getAmountInGUISlot(entity, 9) >= 22 && getAmountInGUISlot(entity, 9) < 33) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMSDAYS_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 8) >= 64 && getAmountInGUISlot(entity, 9) >= 11 && getAmountInGUISlot(entity, 9) < 22) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMSDAYS_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 8) >= 64 && getAmountInGUISlot(entity, 9) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMS_DAY_SWORD.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 8) >= 52 && getAmountInGUISlot(entity, 8) < 64 && getAmountInGUISlot(entity, 9) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMS_DAY_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 8) >= 39 && getAmountInGUISlot(entity, 8) < 52 && getAmountInGUISlot(entity, 9) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMS_DAY_AXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 8) >= 26 && getAmountInGUISlot(entity, 8) < 39 && getAmountInGUISlot(entity, 9) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMS_DAY_SHOVEL.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 8) >= 13 && getAmountInGUISlot(entity, 8) < 26 && getAmountInGUISlot(entity, 9) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMS_DAY_HOE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(10).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(11).set(_setstack);
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