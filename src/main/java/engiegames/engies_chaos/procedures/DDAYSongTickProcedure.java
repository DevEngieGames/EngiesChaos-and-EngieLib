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
public class DDAYSongTickProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
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