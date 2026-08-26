package engiegames.engies_chaos.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class CookedPizzaToSlicesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(EngiesChaosModItems.COOKED_PIZZA.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(EngiesChaosModItems.COOKED_PIZZA.get()).copy();
			_setstack.setCount(4);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}