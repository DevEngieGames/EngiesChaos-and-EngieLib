package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class EngieTradeItemTakenFromDarkSlot2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(11).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_SCYTHE
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(8).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(9).remove(55);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}