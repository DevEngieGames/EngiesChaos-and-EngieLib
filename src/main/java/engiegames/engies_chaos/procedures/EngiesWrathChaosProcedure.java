package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class EngiesWrathChaosProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD && !world.isClientSide()) {
			if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true && EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO,
									_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "worldborder set 338");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO,
									_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "stopsound @a music minecraft:music.game");
				EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer = EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds <= 0) {
					if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes != 0) {
						EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = 60;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes = EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).engieswrathstart = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddayawardadvancement2 = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ewrathhappened = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = EngiesChaosModVariables.MapVariables.get(world).lightningcooldown + 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.4) {
						EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4,
												"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"EngieLib EChaos lightning");
						} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
							EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4,
												"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"EngieLib EChaos lightning2");
							EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(10, () -> {
								EngiesChaosMod.queueServerWork(10, () -> {
									EngiesChaosMod.queueServerWork(10, () -> {
										EngiesChaosMod.queueServerWork(10, () -> {
											EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = false;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										});
									});
								});
							});
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == false) {
					if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.5) {
						EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4,
												"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"EngieLib EChaos lightning");
						} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
							EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4,
												"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"EngieLib EChaos lightning2");
							EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(10, () -> {
								EngiesChaosMod.queueServerWork(10, () -> {
									EngiesChaosMod.queueServerWork(10, () -> {
										EngiesChaosMod.queueServerWork(10, () -> {
											EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = false;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										});
									});
								});
							});
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown <= 0) {
					EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 5, 6));
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (Math.random() <= 0.25) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands()
									.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())),
											Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos darkness");
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount >= (world instanceof ServerLevel _serverLevelGR45 ? _serverLevelGR45.getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT) : 0)) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4, "",
										Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("kill @e[type=engies_chaos:d_day_avalanche,limit=" + Math.round(EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount / 2) + "]"));
					EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = Math.round(EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount / 2);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount >= (world instanceof ServerLevel _serverLevelGR50 ? _serverLevelGR50.getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT) : 0)) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4,
												"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("kill @e[type=engies_chaos:dday_rift,limit=" + Math.round(EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount / 2) + "]"));
					EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = Math.round(EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount / 2);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount >= (world instanceof ServerLevel _serverLevelGR55 ? _serverLevelGR55.getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT) : 0)) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4, "",
										Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("kill @e[type=engies_chaos:d_day_spike,limit=" + Math.round(EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount / 2) + "]"));
					EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = Math.round(EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount / 2);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount >= (world instanceof ServerLevel _serverLevelGR60 ? _serverLevelGR60.getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT) : 0)) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4, "",
										Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("kill @e[type=#engies_chaos:ddaymissiles,limit=" + Math.round(EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount / 2) + "]"));
					EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = Math.round(EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount / 2);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount >= (world instanceof ServerLevel _serverLevelGR65 ? _serverLevelGR65.getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT) : 0)) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4, "",
										Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("kill @e[type=#allaboutengie:mobs/rifted,limit=" + Math.round(EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount / 2) + "]"));
					EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount = Math.round(EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount / 2);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				EngiesChaosModVariables.MapVariables.get(world).missilecooldown = EngiesChaosModVariables.MapVariables.get(world).missilecooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).riftcooldown = EngiesChaosModVariables.MapVariables.get(world).riftcooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).spikecooldown = EngiesChaosModVariables.MapVariables.get(world).spikecooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (EngiesChaosModVariables.MapVariables.get(world).missilecooldown <= 0) {
					EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 5, 6));
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesWrathMissilesProcedure.execute(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).riftcooldown <= 0) {
					EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 5, 6));
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesWrathRiftsProcedure.execute(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).spikecooldown <= 0) {
					EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 5, 6));
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesWrathSpikesProcedure.execute(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown <= 0) {
					EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 5, 6));
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesWrathAvalanchesProcedure.execute(world);
				}
			}
		}
	}
}