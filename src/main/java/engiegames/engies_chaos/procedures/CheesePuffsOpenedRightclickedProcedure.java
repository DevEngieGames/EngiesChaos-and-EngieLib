package engiegames.engies_chaos.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class CheesePuffsOpenedRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(EngiesChaosModItems.CHEESE_BALLS_OPENED.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CHEESE_BALLS_UNOPENED.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CHEESE_BALL.get()).copy();
				_setstack.setCount(10);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			{
				double _setval = (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).cheeseballcount + 10;
				entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cheeseballcount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}