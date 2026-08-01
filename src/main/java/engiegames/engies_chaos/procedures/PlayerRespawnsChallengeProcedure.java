package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class PlayerRespawnsChallengeProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain == true) {
				EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}