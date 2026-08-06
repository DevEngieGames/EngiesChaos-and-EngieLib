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
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class OHBOYProcedure {
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
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE) == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).OHBOY == false) {
					if (world instanceof Level _lvl5 && _lvl5.isDay()) {
						if (EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle == false) {
							if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 6.25) {
								EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.3125;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosMod.queueServerWork(1, () -> {
									EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								});
							} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 6.25 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 12.5) {
								if (Mth.nextDouble(RandomSource.create(), 1, 100) <= EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) {
									EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									EngiesChaosMod.queueServerWork(1, () -> {
										if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart
												&& EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart) == false) {
											DoomsdaySummonProcedure.execute(world);
										}
									});
								} else {
									EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.3125;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(1, () -> {
										EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								}
							} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 12.5 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 18.75) {
								if (Mth.nextDouble(RandomSource.create(), 1, 100) <= EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) {
									EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									EngiesChaosMod.queueServerWork(1, () -> {
										if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart
												&& EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart) == false) {
											DoomsdaySummonProcedure.execute(world);
										}
									});
								} else {
									EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.3125;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(1, () -> {
										EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								}
							} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 18.75 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 25) {
								if (Mth.nextDouble(RandomSource.create(), 1, 100) <= EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) {
									EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									EngiesChaosMod.queueServerWork(1, () -> {
										if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart
												&& EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart) == false) {
											DoomsdaySummonProcedure.execute(world);
										}
									});
								} else {
									EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.3125;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(1, () -> {
										EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								}
							} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 25 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 50) {
								if (Mth.nextDouble(RandomSource.create(), 1, 100) <= EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) {
									EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
										EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
									EngiesChaosMod.queueServerWork(1, () -> {
										if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart
												&& EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart) == false) {
											DoomsdaySummonProcedure.execute(world);
										}
									});
								} else {
									EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 1;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(1, () -> {
										EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								}
							} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 50) {
								EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
									EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
									EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart
											&& EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart) == false) {
										DoomsdaySummonProcedure.execute(world);
									}
								});
							}
						}
					} else if (!(world instanceof Level _lvl20 && _lvl20.isDay())) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}