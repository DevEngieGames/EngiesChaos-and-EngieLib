package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.EngiesChaosMod;

public class UncommonTradeButtonClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.UNCOMMON_TRADER_BOX.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(56);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOMMON_TRADER_BOX.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!(entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel && _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.UNCOMMON_BOOTS
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(44);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOMMON_BOOTS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!(entity instanceof ServerPlayer _plr15 && _plr15.level() instanceof ServerLevel && _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu18 ? _menu18.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.UNCOMMON_LEGGINGS
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(32);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOMMON_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!(entity instanceof ServerPlayer _plr24 && _plr24.level() instanceof ServerLevel && _plr24.getAdvancements().getOrStartProgress(_plr24.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.UNCOMMON_CHESTPLATE
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(20);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOMMON_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!(entity instanceof ServerPlayer _plr33 && _plr33.level() instanceof ServerLevel && _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu36 ? _menu36.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.UNCOMMON_HELMET
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(8);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOMMON_HELMET.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!(entity instanceof ServerPlayer _plr42 && _plr42.level() instanceof ServerLevel && _plr42.getAdvancements().getOrStartProgress(_plr42.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu45 ? _menu45.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.UNCOMMON_HOE
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(60);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOMMON_HOE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!(entity instanceof ServerPlayer _plr51 && _plr51.level() instanceof ServerLevel && _plr51.getAdvancements().getOrStartProgress(_plr51.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu54 ? _menu54.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.UNCOMMON_SHOVEL
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(48);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOMMON_SHOVEL.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!(entity instanceof ServerPlayer _plr60 && _plr60.level() instanceof ServerLevel && _plr60.getAdvancements().getOrStartProgress(_plr60.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu63 ? _menu63.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.UNCOMMON_AXE
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(36);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOMMON_AXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!(entity instanceof ServerPlayer _plr69 && _plr69.level() instanceof ServerLevel && _plr69.getAdvancements().getOrStartProgress(_plr69.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu72 ? _menu72.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.UNCOMMON_PICKAXE
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(24);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOMMON_PICKAXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!(entity instanceof ServerPlayer _plr78 && _plr78.level() instanceof ServerLevel && _plr78.getAdvancements().getOrStartProgress(_plr78.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu81 ? _menu81.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.UNCOMMON_SWORD
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(12);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOMMON_SWORD.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!(entity instanceof ServerPlayer _plr87 && _plr87.level() instanceof ServerLevel && _plr87.getAdvancements().getOrStartProgress(_plr87.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			});
		}
	}
}