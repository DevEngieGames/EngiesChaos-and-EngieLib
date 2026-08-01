package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class DDAYHalfTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer > EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 2) {
				EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer <= EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 2) {
				EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaytimer > EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 2) {
				EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaytimer <= EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 2) {
				EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).theendtimer > EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 2) {
				EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if (EngiesChaosModVariables.MapVariables.get(world).theendtimer <= EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 2) {
				EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer > EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 2) {
				EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer <= EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 2) {
				EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}