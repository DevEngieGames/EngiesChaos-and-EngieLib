package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class AntimatterTheEndTradeUIWhileTHisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_CRUCIFIX.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 60 && getAmountInGUISlot(entity, 1) < 64) {
			if (((entity instanceof Player _entity6 && _entity6.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu6) ? _menu6.getMenuState(1, "scythetrade", false) : false)
					&& !((entity instanceof Player _entity7 && _entity7.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu7) ? _menu7.getMenuState(1, "bantrade", false) : false)) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_SCYTHE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (((entity instanceof Player _entity9 && _entity9.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu9) ? _menu9.getMenuState(1, "bantrade", false) : false)
					&& !((entity instanceof Player _entity10 && _entity10.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu10) ? _menu10.getMenuState(1, "scythetrade", false) : false)) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_BAN_HAMMER.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (!((entity instanceof Player _entity12 && _entity12.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu12) ? _menu12.getMenuState(1, "bantrade", false) : false)
					&& !((entity instanceof Player _entity13 && _entity13.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu13) ? _menu13.getMenuState(1, "scythetrade", false) : false)) {
				if (EngiesChaosModVariables.MapVariables.get(world).itemswap1 == false) {
					entity.getPersistentData().putDouble("itemswap1", (entity.getPersistentData().getDouble("itemswap1") + 0.05));
					if (entity.getPersistentData().getDouble("itemswap1") >= 5) {
						entity.getPersistentData().putDouble("itemswap1", 0);
						entity.getPersistentData().putDouble("itemswap2", 0);
						if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_SCYTHE.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(2).set(_setstack);
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
							ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_BAN_HAMMER.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(2).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						EngiesChaosModVariables.MapVariables.get(world).itemswap1 = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).itemswap2 = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 52 && getAmountInGUISlot(entity, 1) < 60) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_ENDS_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 48 && getAmountInGUISlot(entity, 1) < 54) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_ENDS_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 32 && getAmountInGUISlot(entity, 1) < 48) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_ENDS_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 16 && getAmountInGUISlot(entity, 1) < 32) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_ENDS_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 60 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_HOE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 48 && getAmountInGUISlot(entity, 0) < 60 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_SHOVEL.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 36 && getAmountInGUISlot(entity, 0) < 48 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_AXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 24 && getAmountInGUISlot(entity, 0) < 36 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 12 && getAmountInGUISlot(entity, 0) < 24 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_SWORD.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (((entity instanceof Player _entity61 && _entity61.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu61) ? _menu61.getMenuState(1, "scythetrade", false) : false)
				&& ((entity instanceof Player _entity62 && _entity62.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu62) ? _menu62.getMenuState(1, "bantrade", false) : false)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
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