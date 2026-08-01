package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class BrowniesOpenedInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).browniescount >= 16) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(EngiesChaosModItems.BROWNIES_OPENED.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BROWNIES_EMPTY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			{
				EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.browniescount = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}