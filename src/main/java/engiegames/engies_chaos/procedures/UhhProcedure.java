package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class UhhProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).SharkoKilledByPlayersCount >= 10) {
			EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 250000;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (EngiesChaosModVariables.MapVariables.get(world).SharkoKilledByPlayersCount >= 25) {
			EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 525000;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
	}
}