package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ChallengeInsanityEngiePlushItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).BYEBYE == true) {
				if (entity.getPersistentData().getDouble("plushtimeuntildeathforall") >= 5) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("The plush requires attention " + entity.getDisplayName().getString() + "...")), false);
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).BYEBYE == false) {
				if (entity.getPersistentData().getDouble("plushtimeuntildeathforall") >= 10) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("The plush requires attention " + entity.getDisplayName().getString() + "...")), false);
				}
			}
		}
	}
}