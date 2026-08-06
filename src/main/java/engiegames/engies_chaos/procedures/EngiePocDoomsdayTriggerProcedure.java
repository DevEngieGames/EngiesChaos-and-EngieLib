package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class EngiePocDoomsdayTriggerProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
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
	}
}