package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class RoughianTradeItemTakenFromRegSlot1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_CRUCIFIX
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(64);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ENGIE_GAMES_HALLOW_BAN_HAMMER.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_ANCHOR
						.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(55);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_HELMET.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(44);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_CHESTPLATE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(33);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu18 ? _menu18.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_LEGGINGS.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(22);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_BOOTS.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(11);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu26 ? _menu26.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_SWORD.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_PICKAXE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(52);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu32 ? _menu32.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_AXE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(39);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu35 ? _menu35.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_SHOVEL.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(26);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu38 ? _menu38.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMES_HOE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(13);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}