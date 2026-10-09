package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class ThunderstormChaosProcedure {
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
		if (world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
			if ((EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart && EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart
					&& EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart) == false) {
				if (EngiesChaosModVariables.MapVariables.get(world).extremelightningenabled == true) {
					EngiesChaosModVariables.MapVariables.get(world).RX = Mth.nextInt(RandomSource.create(), -168, 168);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).RZ = Mth.nextInt(RandomSource.create(), -168, 168);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).tstormlightning = EngiesChaosModVariables.MapVariables.get(world).tstormlightning + 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).tstormlightning >= 0.85) {
						EngiesChaosModVariables.MapVariables.get(world).tstormlightning = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							{
								double _setval = 0.25;
								entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.lightningflashnum = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s weather engies_chaos:extreme_lightning_strike");
								}
							}
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
								}
							}
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(
										(entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + EngiesChaosModVariables.MapVariables.get(world).RX,
										Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
												(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX
														+ EngiesChaosModVariables.MapVariables.get(world).RX),
												(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ
														+ EngiesChaosModVariables.MapVariables.get(world).RZ))),
										(entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + EngiesChaosModVariables.MapVariables.get(world).RZ)));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
							for (int index0 = 0; index0 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 6)); index0++) {
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(
											(entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + EngiesChaosModVariables.MapVariables.get(world).RX
													+ Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)),
											Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
													(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX
															+ EngiesChaosModVariables.MapVariables.get(world).RX),
													(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ
															+ EngiesChaosModVariables.MapVariables.get(world).RZ))),
											(entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + EngiesChaosModVariables.MapVariables.get(world).RZ
													+ Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL,
														new Vec3(
																((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX
																		+ EngiesChaosModVariables.MapVariables.get(world).RX),
																Math.round(
																		world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
																				(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX
																						+ EngiesChaosModVariables.MapVariables.get(world).RX),
																				(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ
																						+ EngiesChaosModVariables.MapVariables.get(world).RZ))),
																((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ
																		+ EngiesChaosModVariables.MapVariables.get(world).RZ)),
														Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).extremelightningenabled == false) {
					if (EngiesChaosModVariables.MapVariables.get(world).heavylightningenabled == true) {
						EngiesChaosModVariables.MapVariables.get(world).RX = Mth.nextInt(RandomSource.create(), -168, 168);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).RZ = Mth.nextInt(RandomSource.create(), -168, 168);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).tstormlightning = EngiesChaosModVariables.MapVariables.get(world).tstormlightning + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).tstormlightning >= 1) {
							EngiesChaosModVariables.MapVariables.get(world).tstormlightning = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								{
									double _setval = 0.25;
									entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.lightningflashnum = _setval;
										capability.syncPlayerVariables(entityiterator);
									});
								}
								{
									Entity _ent = entityiterator;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s weather engies_chaos:ddaylightning");
									}
								}
								{
									Entity _ent = entityiterator;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:ddaylightning weather @s ~ ~ ~ 0.5");
									}
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(
											(entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + EngiesChaosModVariables.MapVariables.get(world).RX,
											Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
													(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX
															+ EngiesChaosModVariables.MapVariables.get(world).RX),
													(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ
															+ EngiesChaosModVariables.MapVariables.get(world).RZ))),
											(entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ
													+ EngiesChaosModVariables.MapVariables.get(world).RZ)));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								for (int index1 = 0; index1 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 6)); index1++) {
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(
												(entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX
														+ EngiesChaosModVariables.MapVariables.get(world).RX + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)),
												Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
														(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX
																+ EngiesChaosModVariables.MapVariables.get(world).RX),
														(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ
																+ EngiesChaosModVariables.MapVariables.get(world).RZ))),
												(entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ
														+ EngiesChaosModVariables.MapVariables.get(world).RZ + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)))));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL,
													new Vec3(
															((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX
																	+ EngiesChaosModVariables.MapVariables.get(world).RX),
															Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
																	(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX
																			+ EngiesChaosModVariables.MapVariables.get(world).RX),
																	(int) ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ
																			+ EngiesChaosModVariables.MapVariables.get(world).RZ))),
															((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ
																	+ EngiesChaosModVariables.MapVariables.get(world).RZ)),
													Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											("damages @a[distance=..6.25] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
							}
						}
					}
				}
			}
		}
	}
}