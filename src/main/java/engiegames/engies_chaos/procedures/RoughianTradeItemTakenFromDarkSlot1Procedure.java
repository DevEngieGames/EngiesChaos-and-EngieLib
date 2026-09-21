package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class RoughianTradeItemTakenFromDarkSlot1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_CRUCIFIX
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(5).remove(64);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(6).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_HALLOW_BAN_HAMMER.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(5).remove(55);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(6).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMESS_HELMET.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(5).remove(44);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(6).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMESS_CHESTPLATE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(9).remove(33);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(6).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMESS_LEGGINGS.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(5).remove(22);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu20 ? _menu20.getSlots().get(6).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMESS_BOOTS.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(5).remove(11);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(6).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_SWORD.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(64);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(6).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_PICKAXE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(52);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu30 ? _menu30.getSlots().get(6).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_AXE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(39);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu33 ? _menu33.getSlots().get(6).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_SHOVEL.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(26);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu36 ? _menu36.getSlots().get(6).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_HOE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(13);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}