package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class ProphecyTickProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD && !world.isClientSide()) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophshow == true) {
				EngiesChaosModVariables.MapVariables.get(world).ddayprophnumbertotal = EngiesChaosModVariables.MapVariables.get(world).ddayprophnumbertotal + 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumbertotal >= 8) {
					EngiesChaosModVariables.MapVariables.get(world).ddayprophnumbertotal = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumbertotal >= 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 0) {
							if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
							if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 2;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 2;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 2;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 2;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
							if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 3;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 3;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 3;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 3;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
							if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 4;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 4;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 4;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
								EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 4;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
						}
					}
				}
			}
		}
	}
}