package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class EngieTradeUITickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_COIN.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_COIN.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_COIN.get()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_CRUCIFIX.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 60 && getAmountInGUISlot(entity, 1) < 64) {
				if (((entity instanceof Player _entity14 && _entity14.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu14) ? _menu14.getMenuState(1, "scythetrade", false) : false)
						&& !((entity instanceof Player _entity15 && _entity15.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu15) ? _menu15.getMenuState(1, "bantrade", false) : false)) {
					if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SCYTHE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (((entity instanceof Player _entity17 && _entity17.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu17) ? _menu17.getMenuState(1, "bantrade", false) : false)
						&& !((entity instanceof Player _entity18 && _entity18.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu18) ? _menu18.getMenuState(1, "scythetrade", false) : false)) {
					if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_BAN_HAMMER.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (!((entity instanceof Player _entity20 && _entity20.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu20) ? _menu20.getMenuState(1, "bantrade", false) : false)
						&& !((entity instanceof Player _entity21 && _entity21.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu21) ? _menu21.getMenuState(1, "scythetrade", false) : false)) {
					if (EngiesChaosModVariables.MapVariables.get(world).itemswap1 == false) {
						entity.getPersistentData().putDouble("itemswap1", (entity.getPersistentData().getDouble("itemswap1") + 0.05));
						if (entity.getPersistentData().getDouble("itemswap1") >= 5) {
							entity.getPersistentData().putDouble("itemswap1", 0);
							entity.getPersistentData().putDouble("itemswap2", 0);
							if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
								ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SCYTHE.get()).copy();
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
								ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_BAN_HAMMER.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GAMESS_BOOTS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 48 && getAmountInGUISlot(entity, 1) < 54) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GAMESS_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 32 && getAmountInGUISlot(entity, 1) < 48) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GAMESS_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 16 && getAmountInGUISlot(entity, 1) < 32) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GAMESS_HELMET.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 60 && getAmountInGUISlot(entity, 1) == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_HOE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 48 && getAmountInGUISlot(entity, 0) < 60 && getAmountInGUISlot(entity, 1) == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_SHOVEL.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 36 && getAmountInGUISlot(entity, 0) < 48 && getAmountInGUISlot(entity, 1) == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_AXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 24 && getAmountInGUISlot(entity, 0) < 36 && getAmountInGUISlot(entity, 1) == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_PICKAXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 12 && getAmountInGUISlot(entity, 0) < 24 && getAmountInGUISlot(entity, 1) == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_SWORD.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (((entity instanceof Player _entity69 && _entity69.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu69) ? _menu69.getMenuState(1, "scythetrade", false) : false)
					&& ((entity instanceof Player _entity70 && _entity70.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu70) ? _menu70.getMenuState(1, "bantrade", false) : false)) {
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
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu73 ? _menu73.getSlots().get(0).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_COIN.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu75 ? _menu75.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_COIN.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu77 ? _menu77.getSlots().get(0).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_COIN.get()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu79 ? _menu79.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_CRUCIFIX.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 60 && getAmountInGUISlot(entity, 1) < 64) {
				if (((entity instanceof Player _entity87 && _entity87.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu87) ? _menu87.getMenuState(1, "scythetrade", false) : false)
						&& !((entity instanceof Player _entity88 && _entity88.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu88) ? _menu88.getMenuState(1, "bantrade", false) : false)) {
					if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_SCYTHE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (((entity instanceof Player _entity90 && _entity90.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu90) ? _menu90.getMenuState(1, "bantrade", false) : false)
						&& !((entity instanceof Player _entity91 && _entity91.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu91) ? _menu91.getMenuState(1, "scythetrade", false) : false)) {
					if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_BAN_HAMMER.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(2).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (!((entity instanceof Player _entity93 && _entity93.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu93) ? _menu93.getMenuState(1, "bantrade", false) : false)
						&& !((entity instanceof Player _entity94 && _entity94.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu94) ? _menu94.getMenuState(1, "scythetrade", false) : false)) {
					if (EngiesChaosModVariables.MapVariables.get(world).itemswap1 == false) {
						entity.getPersistentData().putDouble("itemswap1", (entity.getPersistentData().getDouble("itemswap1") + 0.05));
						if (entity.getPersistentData().getDouble("itemswap1") >= 5) {
							entity.getPersistentData().putDouble("itemswap1", 0);
							entity.getPersistentData().putDouble("itemswap2", 0);
							if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
								ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_SCYTHE.get()).copy();
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
								ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_BAN_HAMMER.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMESS_BOOTS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 48 && getAmountInGUISlot(entity, 1) < 54) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMESS_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 32 && getAmountInGUISlot(entity, 1) < 48) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMESS_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 16 && getAmountInGUISlot(entity, 1) < 32) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMESS_HELMET.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 60 && getAmountInGUISlot(entity, 1) == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_HOE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 48 && getAmountInGUISlot(entity, 0) < 60 && getAmountInGUISlot(entity, 1) == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_SHOVEL.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 36 && getAmountInGUISlot(entity, 0) < 48 && getAmountInGUISlot(entity, 1) == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_AXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 24 && getAmountInGUISlot(entity, 0) < 36 && getAmountInGUISlot(entity, 1) == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_PICKAXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 0) >= 12 && getAmountInGUISlot(entity, 0) < 24 && getAmountInGUISlot(entity, 1) == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_SWORD.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (((entity instanceof Player _entity142 && _entity142.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu142) ? _menu142.getMenuState(1, "scythetrade", false) : false)
					&& ((entity instanceof Player _entity143 && _entity143.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu143) ? _menu143.getMenuState(1, "bantrade", false) : false)) {
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