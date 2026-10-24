package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class ChallengeInsanityEngiePlushItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE) == false
				|| EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain == true) {
				EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).BYEBYE == false) {
				if (EngiesChaosModVariables.MapVariables.get(world).plushtimeuntildeathforall >= 30) {
					if (EngiesChaosModVariables.MapVariables.get(world).warnonce == false) {
						EngiesChaosModVariables.MapVariables.get(world).warnonce = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A74The plush requires attention " + entity.getDisplayName().getString() + "...")), true);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).BYEBYE == false) {
				if (EngiesChaosModVariables.MapVariables.get(world).plushtimeuntildeathforall >= 15) {
					if (EngiesChaosModVariables.MapVariables.get(world).warnonce == false) {
						EngiesChaosModVariables.MapVariables.get(world).warnonce = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A74The plush requires attention " + entity.getDisplayName().getString() + "...")), true);
					}
				}
			}
		}
	}
}