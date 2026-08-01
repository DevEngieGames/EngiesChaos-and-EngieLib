package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class DayNightCheckProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.dayTime() - 12000 < 0) {
			EngiesChaosModVariables.MapVariables.get(world).DayCheck = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).NightCheck = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (world.dayTime() - 12000 >= 0) {
			EngiesChaosModVariables.MapVariables.get(world).NightCheck = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DayCheck = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
	}
}