package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class TrueChaosMatterRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).truechaosenabledbydev == true) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u00A74YOU ARE NOT ALLOWED TO CHANGE WHAT THE DEVELOPER ENABLED."), true);
		} else if (EngiesChaosModVariables.MapVariables.get(world).truechaosenabledbydev == false) {
			if (!(entity instanceof Player _plrCldCheck2 && _plrCldCheck2.getCooldowns().isOnCooldown(itemstack.getItem()))) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 1200);
				EngiesChaosModVariables.MapVariables.get(world).engiestruewrath = !EngiesChaosModVariables.MapVariables.get(world).engiestruewrath;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if (entity instanceof Player _plrCldCheck6 && _plrCldCheck6.getCooldowns().isOnCooldown(itemstack.getItem())) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A74You have to wait silly."), true);
			}
		}
	}
}