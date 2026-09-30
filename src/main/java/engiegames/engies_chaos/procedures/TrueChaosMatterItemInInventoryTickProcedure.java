package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class TrueChaosMatterItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		EngiesChaosModVariables.MapVariables.get(world).unlockedtruechaos = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		if (itemstack.getCount() > 1) {
			itemstack.setCount(1);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u00A74ONLY ONE."), true);
		}
	}
}