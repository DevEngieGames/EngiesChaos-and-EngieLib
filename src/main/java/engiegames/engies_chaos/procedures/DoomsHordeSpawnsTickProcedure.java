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
public class DoomsHordeSpawnsTickProcedure {
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
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer <= (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 3 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer <= (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 4 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer <= (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 2 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer <= (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 3 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer <= (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 1 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer <= (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 2 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer <= (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 0 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer <= (EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime / 4) * 1 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime <= (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 3 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime <= (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 4 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime <= (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 2 + 5) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime <= (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 3 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime <= (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 1 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime <= (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 2 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime <= (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 0 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime <= (EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime / 4) * 1 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 3 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 4 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 2 + 5) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 3 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 1 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 2 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 0 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).theendmaxtime / 4) * 1 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 3 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 4 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 2 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 3 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 1 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 2 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 0 + 10) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime <= (EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime / 4) * 1 - 15) {
						EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}