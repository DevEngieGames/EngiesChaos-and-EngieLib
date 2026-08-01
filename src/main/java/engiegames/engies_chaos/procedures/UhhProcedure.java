package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class UhhProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).SharkoKilledByPlayersCount >= 10) {
			EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 250000;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (EngiesChaosModVariables.MapVariables.get(world).SharkoKilledByPlayersCount >= 25) {
			EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 500000;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
	}
}