package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

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

@Mod.EventBusSubscriber
public class SuperDoomsdayChaosProcedure {
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
			if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "worldborder set 338");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "stopsound @a music minecraft:music.game");
				EngiesChaosModVariables.MapVariables.get(world).superdoomsdaytimer = EngiesChaosModVariables.MapVariables.get(world).superdoomsdaytimer - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds <= 0) {
					if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes != 0) {
						EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = 60;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes = EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).sddaystart = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddayawardadvancement2 = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).sddayhappened = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT))) {
					for (int index0 = 0; index0 < Math.round((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT)) / 2d); index0++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
									Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=engies_chaos:d_day_avalanche,limit=1]");
						EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT))) {
					for (int index1 = 0; index1 < Math.round((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT)) / 2d); index1++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
									Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=engies_chaos:dday_rift,limit=1]");
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT))) {
					for (int index2 = 0; index2 < Math.round((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT)) / 2d); index2++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
									Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=engies_chaos:d_day_spike,limit=1]");
						EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT))) {
					for (int index3 = 0; index3 < Math.round((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT)) / 8d); index3++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
									Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=#engies_chaos:ddaymissiles,limit=1]");
						EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = EngiesChaosModVariables.MapVariables.get(world).lightningcooldown + 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).missilecooldown = EngiesChaosModVariables.MapVariables.get(world).missilecooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).riftcooldown = EngiesChaosModVariables.MapVariables.get(world).riftcooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).spikecooldown = EngiesChaosModVariables.MapVariables.get(world).spikecooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).hordecooldown = EngiesChaosModVariables.MapVariables.get(world).hordecooldown - 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.4) {
						EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos lightning");
						} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
							EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos lightning2");
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
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos lightning");
						} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
							EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos lightning2");
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
				if (EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown <= 0) {
					EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 10));
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (Math.random() <= 0.75) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
									Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos darkness");
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).missilecooldown <= 0) {
					EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 15));
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					MissileSpawnProcedure.execute(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).riftcooldown <= 0) {
					EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 15));
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					RiftSpawnsProcedure.execute(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).spikecooldown <= 0) {
					EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 15));
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					SpikeSpawnsProcedure.execute(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown <= 0) {
					EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 15));
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					AvalancheSpawnProcedure.execute(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).hordecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 15));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						HordeSpawnsProcedure.execute(world);
					}
				}
			}
		}
	}
}