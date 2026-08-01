package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class MindscapeTradeUITickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_CRUCIFIX.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 60 && getAmountInGUISlot(entity, 2) < 64) {
			if (((entity instanceof Player _entity8 && _entity8.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu8) ? _menu8.getMenuState(1, "scythetrade", false) : false)
					&& !((entity instanceof Player _entity9 && _entity9.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu9) ? _menu9.getMenuState(1, "bantrade", false) : false)) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIE_SCYTHE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (((entity instanceof Player _entity11 && _entity11.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu11) ? _menu11.getMenuState(1, "bantrade", false) : false)
					&& !((entity instanceof Player _entity12 && _entity12.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu12) ? _menu12.getMenuState(1, "scythetrade", false) : false)) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_BAN_HAMMER.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (!((entity instanceof Player _entity14 && _entity14.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu14) ? _menu14.getMenuState(1, "bantrade", false) : false)
					&& !((entity instanceof Player _entity15 && _entity15.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu15) ? _menu15.getMenuState(1, "scythetrade", false) : false)) {
				if (EngiesChaosModVariables.MapVariables.get(world).itemswap1 == false) {
					entity.getPersistentData().putDouble("itemswap1", (entity.getPersistentData().getDouble("itemswap1") + 0.05));
					if (entity.getPersistentData().getDouble("itemswap1") >= 5) {
						entity.getPersistentData().putDouble("itemswap1", 0);
						entity.getPersistentData().putDouble("itemswap2", 0);
						if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIE_SCYTHE.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(3).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						EngiesChaosModVariables.MapVariables.get(world).itemswap1 = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).itemswap2 = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).itemswap2 == false) {
					entity.getPersistentData().putDouble("itemswap2", (entity.getPersistentData().getDouble("itemswap2") + 0.05));
					if (entity.getPersistentData().getDouble("itemswap2") >= 5) {
						entity.getPersistentData().putDouble("itemswap1", 0);
						entity.getPersistentData().putDouble("itemswap2", 0);
						if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_BAN_HAMMER.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(3).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						EngiesChaosModVariables.MapVariables.get(world).itemswap1 = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).itemswap2 = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 52 && getAmountInGUISlot(entity, 2) < 60) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 48 && getAmountInGUISlot(entity, 2) < 54) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 32 && getAmountInGUISlot(entity, 2) < 48) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 16 && getAmountInGUISlot(entity, 2) < 32) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 60 && getAmountInGUISlot(entity, 2) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_HOE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 48 && getAmountInGUISlot(entity, 1) < 60 && getAmountInGUISlot(entity, 2) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_SHOVEL.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 36 && getAmountInGUISlot(entity, 1) < 48 && getAmountInGUISlot(entity, 2) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_AXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 24 && getAmountInGUISlot(entity, 1) < 36 && getAmountInGUISlot(entity, 2) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 12 && getAmountInGUISlot(entity, 1) < 24 && getAmountInGUISlot(entity, 2) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_SWORD.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (((entity instanceof Player _entity72 && _entity72.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu72) ? _menu72.getMenuState(1, "scythetrade", false) : false)
				&& ((entity instanceof Player _entity73 && _entity73.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu73) ? _menu73.getMenuState(1, "bantrade", false) : false)) {
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