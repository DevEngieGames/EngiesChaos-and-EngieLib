package engiegames.engieschaos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModMenus;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class MindscapeTradeUITickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Player _entity0 && _entity0.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(1, "scythetrade", false) : false)
				|| !((entity instanceof Player _entity1 && _entity1.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu1) ? _menu1.getMenuState(1, "bantrade", false) : false)) {
			EngiesChaosModVariables.MapVariables.get(world).checkboxbothnomarked = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).checkboxbothmarked = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (((entity instanceof Player _entity2 && _entity2.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(1, "scythetrade", false) : false)
				&& ((entity instanceof Player _entity3 && _entity3.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu3) ? _menu3.getMenuState(1, "bantrade", false) : false)) {
			EngiesChaosModVariables.MapVariables.get(world).checkboxbothnomarked = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).checkboxbothmarked = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (!((entity instanceof Player _entity4 && _entity4.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu4) ? _menu4.getMenuState(1, "scythetrade", false) : false)
				&& !((entity instanceof Player _entity5 && _entity5.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu5) ? _menu5.getMenuState(1, "bantrade", false) : false) && getAmountInGUISlot(entity, 0) >= 64
				&& getAmountInGUISlot(entity, 1) >= 60 && getAmountInGUISlot(entity, 1) < 64) {
			EngiesChaosModVariables.MapVariables.get(world).checkboxbothnomarked = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).checkboxbothmarked = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
		if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_CRUCIFIX.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 60 && getAmountInGUISlot(entity, 2) < 64) {
			if (((entity instanceof Player _entity17 && _entity17.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu17) ? _menu17.getMenuState(1, "scythetrade", false) : false)
					&& !((entity instanceof Player _entity18 && _entity18.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu18) ? _menu18.getMenuState(1, "bantrade", false) : false)) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIE_SCYTHE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (((entity instanceof Player _entity20 && _entity20.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu20) ? _menu20.getMenuState(1, "bantrade", false) : false)
					&& !((entity instanceof Player _entity21 && _entity21.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu21) ? _menu21.getMenuState(1, "scythetrade", false) : false)) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINDSCAPE_ENGIES_BAN_HAMMER.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (!((entity instanceof Player _entity23 && _entity23.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu23) ? _menu23.getMenuState(1, "bantrade", false) : false)
					&& !((entity instanceof Player _entity24 && _entity24.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu24) ? _menu24.getMenuState(1, "scythetrade", false) : false)) {
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
		} else if (((entity instanceof Player _entity81 && _entity81.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu81) ? _menu81.getMenuState(1, "scythetrade", false) : false)
				&& ((entity instanceof Player _entity82 && _entity82.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu82) ? _menu82.getMenuState(1, "bantrade", false) : false)) {
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