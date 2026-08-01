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
public class DDAYSongTickProcedure {
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
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true || EngiesChaosModVariables.MapVariables.get(world).sddaystart == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true
					|| EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 == true) {
					EngiesChaosModVariables.MapVariables.get(world).doomsdaymainsongtimer = EngiesChaosModVariables.MapVariables.get(world).doomsdaymainsongtimer + 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).doomsdaymainsongtimer >= 142) {
						EngiesChaosModVariables.MapVariables.get(world).doomsdaymainsongtimer = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddaymainsongplay = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					EngiesChaosModVariables.MapVariables.get(world).firstplayofaltsoundtrack = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 == false) {
					EngiesChaosModVariables.MapVariables.get(world).doomsdayaltsongtimer = EngiesChaosModVariables.MapVariables.get(world).doomsdayaltsongtimer + 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
						if (EngiesChaosModVariables.MapVariables.get(world).doomsdayaltsongtimer >= 125) {
							EngiesChaosModVariables.MapVariables.get(world).doomsdayaltsongtimer = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ddayaltsongplay = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).doomsdayaltsongtimer >= 100) {
							EngiesChaosModVariables.MapVariables.get(world).doomsdayaltsongtimer = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ddayaltsongplay = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).doomsdayaltsongtimer >= 4.75 && EngiesChaosModVariables.MapVariables.get(world).firstplayofaltsoundtrack == false) {
						EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).firstplayofaltsoundtrack = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}