package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class RoughianEngieGamesTradeUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_TESSERACT
						.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_TESSERACT
						.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_TESSERACT
						.get()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getItem() == EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(0).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 64 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_CRUCIFIX.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(3).getItem() : ItemStack.EMPTY)
						.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING), 1);
				(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(3).getItem() : ItemStack.EMPTY)
						.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("engies_chaos:engies_blessing"))), 10);
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 60 && getAmountInGUISlot(entity, 2) < 64 && getAmountInGUISlot(entity, 0) >= 64) {
				if (EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount == 0) {
					if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GAMES_ANCHOR.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GAMES_HALLOW_SCYTHE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 48 && getAmountInGUISlot(entity, 2) < 60 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_PICKAXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 36 && getAmountInGUISlot(entity, 2) < 48 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_AXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 24 && getAmountInGUISlot(entity, 2) < 36 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_SHOVEL.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 12 && getAmountInGUISlot(entity, 2) < 24 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_HOE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_HELMET.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 48 && getAmountInGUISlot(entity, 1) < 64 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 32 && getAmountInGUISlot(entity, 1) < 48 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 16 && getAmountInGUISlot(entity, 1) < 32 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_BOOTS.get()).copy();
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
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu72 ? _menu72.getSlots().get(0).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu74 ? _menu74.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu76 ? _menu76.getSlots().get(2).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu78 ? _menu78.getSlots().get(0).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu80 ? _menu80.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu82 ? _menu82.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu84 ? _menu84.getSlots().get(0).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu86 ? _menu86.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu88 ? _menu88.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 64 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_CRUCIFIX.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu94 ? _menu94.getSlots().get(3).getItem() : ItemStack.EMPTY)
						.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING), 1);
				(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu96 ? _menu96.getSlots().get(3).getItem() : ItemStack.EMPTY)
						.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("engies_chaos:engies_blessing"))), 10);
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 60 && getAmountInGUISlot(entity, 2) < 64 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_HALLOW_SCYTHE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 48 && getAmountInGUISlot(entity, 2) < 60 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_PICKAXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 36 && getAmountInGUISlot(entity, 2) < 48 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_AXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 24 && getAmountInGUISlot(entity, 2) < 36 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_SHOVEL.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) >= 12 && getAmountInGUISlot(entity, 2) < 24 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_HOE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 64 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_HELMET.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 48 && getAmountInGUISlot(entity, 1) < 64 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 32 && getAmountInGUISlot(entity, 1) < 48 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (getAmountInGUISlot(entity, 1) >= 16 && getAmountInGUISlot(entity, 1) < 32 && getAmountInGUISlot(entity, 2) == 0 && getAmountInGUISlot(entity, 0) >= 64) {
				if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_BOOTS.get()).copy();
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