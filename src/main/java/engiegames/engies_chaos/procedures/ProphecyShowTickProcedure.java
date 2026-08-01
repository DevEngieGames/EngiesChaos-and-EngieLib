package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class ProphecyShowTickProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD && !world.isClientSide()) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer > (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 3 - 1
						&& EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer < (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 3 + 1) {
					EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer > (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 1 - 1
						&& EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer < (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 1 + 1) {
					EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaytimer > (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 3 - 1
						&& EngiesChaosModVariables.MapVariables.get(world).superdoomsdaytimer < (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 3 + 1) {
					EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaytimer > (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 1 - 1
						&& EngiesChaosModVariables.MapVariables.get(world).superdoomsdaytimer < (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 1 + 1) {
					EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).theendtimer > (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 3 - 1
						&& EngiesChaosModVariables.MapVariables.get(world).theendtimer < (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 3 + 1) {
					EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).theendtimer > (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 1 - 1
						&& EngiesChaosModVariables.MapVariables.get(world).theendtimer < (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 1 + 1) {
					EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer > (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 3 - 1
						&& EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer < (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 3 + 1) {
					EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer > (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 1 - 1
						&& EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer < (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 1 + 1) {
					EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}