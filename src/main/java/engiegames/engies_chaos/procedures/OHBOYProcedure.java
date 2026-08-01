package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class OHBOYProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD && !world.isClientSide()) {
			if ((world instanceof ServerLevel _serverLevelGR4 && _serverLevelGR4.getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE)) == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).OHBOY == false) {
					if (world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						if (world instanceof Level _lvl7 && _lvl7.isDay()) {
							if (EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle == false) {
								if (EngiesChaosModVariables.MapVariables.get(world).riskcooldown == true) {
									EngiesChaosModVariables.MapVariables.get(world).riskcooldownnumb = EngiesChaosModVariables.MapVariables.get(world).riskcooldownnumb + 0.05;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									if (EngiesChaosModVariables.MapVariables.get(world).riskcooldownnumb >= 5) {
										EngiesChaosModVariables.MapVariables.get(world).riskcooldown = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).riskcooldownnumb = 0;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
								} else if (EngiesChaosModVariables.MapVariables.get(world).riskcooldown == false) {
									if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 5) {
										EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.5;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosMod.queueServerWork(1, () -> {
											EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										});
									} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 5 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 15) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 100)) + Math.random() <= EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) {
											EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(1, () -> {
												DoomsdaySummonProcedure.execute(world);
											});
										} else {
											EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.25;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(1, () -> {
												EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 = true;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											});
										}
									} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 15 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 25) {
										if (true) {
											EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(1, () -> {
												DoomsdaySummonProcedure.execute(world);
											});
										} else {
											EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.25;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(1, () -> {
												EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 = true;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											});
										}
									} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 25 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 35) {
										if (true) {
											EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(1, () -> {
												DoomsdaySummonProcedure.execute(world);
											});
										} else {
											EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.25;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(1, () -> {
												EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 = true;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											});
										}
									} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 35 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 75) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 100)) + Math.random() <= EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) {
											EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(1, () -> {
												DoomsdaySummonProcedure.execute(world);
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
									} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 75) {
										EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosMod.queueServerWork(1, () -> {
											DoomsdaySummonProcedure.execute(world);
										});
									}
								}
							}
						} else if (!(world instanceof Level _lvl20 && _lvl20.isDay())) {
							EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					}
				}
			}
		}
	}
}