package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class ProphecyTickProcedure {
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
			if (EngiesChaosModVariables.MapVariables.get(world).prophallowticking == true) {
				EngiesChaosModVariables.MapVariables.get(world).ProphecyTimerTotal = EngiesChaosModVariables.MapVariables.get(world).ProphecyTimerTotal + 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).ProphecyTimerTotal = 0;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).ProphecyTimerTotal >= 13) {
				EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).prophallowticking = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophshow == true) {
				EngiesChaosModVariables.MapVariables.get(world).ProphecyShowTimer = EngiesChaosModVariables.MapVariables.get(world).ProphecyShowTimer + 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).ProphecyDisasterRevealTimer = EngiesChaosModVariables.MapVariables.get(world).ProphecyDisasterRevealTimer + 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).ProphecyShowTimer = 0;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).ProphecyDisasterRevealTimer = 0;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).ProphecyDisasterRevealTimer >= 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait == false) {
					EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 0) {
						EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb = Math.round(Mth.nextInt(RandomSource.create(), 1, 7));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 59));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
						EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 2;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb = Math.round(Mth.nextInt(RandomSource.create(), 1, 7));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 59));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
						EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 3;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb = Math.round(Mth.nextInt(RandomSource.create(), 1, 7));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 59));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
						EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb = Math.round(Mth.nextInt(RandomSource.create(), 1, 7));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 45, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true) {
							EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes = Math.round(Mth.nextInt(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes == 10) {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 45));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes == 1) {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 60));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextInt(RandomSource.create(), 1, 59));
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							});
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait == true) {
					EngiesChaosModVariables.MapVariables.get(world).ProphecyDisasterRevealTimer = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).ProphecyShowTimer >= 9) {
				EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}