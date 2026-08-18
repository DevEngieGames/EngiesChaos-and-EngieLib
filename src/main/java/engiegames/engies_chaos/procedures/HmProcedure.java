package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class HmProcedure {
	@SubscribeEvent
	public static void onPlayerInBed(PlayerSleepInBedEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		EngiesChaosModVariables.MapVariables.get(world).previoustime = world.dayTime();
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosMod.queueServerWork(20 * 6, () -> {
			if (world.dayTime() >= 0) {
				EngiesChaosModVariables.MapVariables.get(world).timeticks = EngiesChaosModVariables.MapVariables.get(world).timeticks + 24000 - EngiesChaosModVariables.MapVariables.get(world).previoustime;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		});
	}
}