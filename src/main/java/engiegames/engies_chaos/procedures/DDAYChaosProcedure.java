package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.DDayLightningSpawnerEntity;
import engiegames.engies_chaos.entity.DDayLightningSpawner2Entity;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class DDAYChaosProcedure {
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
			if ((EngiesChaosModVariables.MapVariables.get(world).ddaystart || EngiesChaosModVariables.MapVariables.get(world).sddaystart || EngiesChaosModVariables.MapVariables.get(world).thestart
					|| EngiesChaosModVariables.MapVariables.get(world).engieswrathstart) == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "worldborder set 338");
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a music minecraft:music.game");
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).RX = Math.round(Mth.nextDouble(RandomSource.create(), -168, 168));
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).RY = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ);
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).RZ = Math.round(Mth.nextDouble(RandomSource.create(), -168, 168));
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
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
			}
			if ((EngiesChaosModVariables.MapVariables.get(world).ddaystart || EngiesChaosModVariables.MapVariables.get(world).sddaystart || EngiesChaosModVariables.MapVariables.get(world).thestart) == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.4) {
						EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
							if ((world.getBlockState(new BlockPos(EngiesChaosModVariables.MapVariables.get(world).RX, EngiesChaosModVariables.MapVariables.get(world).RY, EngiesChaosModVariables.MapVariables.get(world).RZ)))
									.is(BlockTags.create(new ResourceLocation("engies_chaos:ddaylightningstrikeable")))) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDayLightningSpawnerEntity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER.get(), _level);
									entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RX,
											(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
											EngiesChaosModVariables.MapVariables.get(world).RZ, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
							EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
								entityToSpawn.moveTo(168, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
							EngiesChaosMod.queueServerWork(10, () -> {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
									entityToSpawn.moveTo(168, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), (-168), world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
								EngiesChaosMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
										entityToSpawn.moveTo((-168), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), (-168), world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
									EngiesChaosMod.queueServerWork(10, () -> {
										if (world instanceof ServerLevel _level) {
											Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
											entityToSpawn.moveTo((-168), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168, world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof Mob _mobToSpawn)
												_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
											_level.addFreshEntity(entityToSpawn);
										}
										EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == false) {
					if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == true) {
						if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.4) {
							EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
								if ((world.getBlockState(new BlockPos(EngiesChaosModVariables.MapVariables.get(world).RX, EngiesChaosModVariables.MapVariables.get(world).RY, EngiesChaosModVariables.MapVariables.get(world).RZ)))
										.is(BlockTags.create(new ResourceLocation("engies_chaos:ddaylightningstrikeable")))) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new DDayLightningSpawnerEntity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER.get(), _level);
										entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RX,
												(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
												EngiesChaosModVariables.MapVariables.get(world).RZ, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
								EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
									entityToSpawn.moveTo(168, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
								EngiesChaosMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
										entityToSpawn.moveTo(168, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), (-168), world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
									EngiesChaosMod.queueServerWork(10, () -> {
										if (world instanceof ServerLevel _level) {
											Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
											entityToSpawn.moveTo((-168), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), (-168), world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof Mob _mobToSpawn)
												_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
											_level.addFreshEntity(entityToSpawn);
										}
										EngiesChaosMod.queueServerWork(10, () -> {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
												entityToSpawn.moveTo((-168), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168, world.getRandom().nextFloat() * 360F, 0);
												if (entityToSpawn instanceof Mob _mobToSpawn)
													_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
												_level.addFreshEntity(entityToSpawn);
											}
											EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = false;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
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
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO, _level, 4,
													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos lightning");
							} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
								EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO, _level, 4,
													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos lightning2");
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
				} else if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == true) {
						if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.1) {
							EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
								if ((world.getBlockState(new BlockPos(EngiesChaosModVariables.MapVariables.get(world).RX, EngiesChaosModVariables.MapVariables.get(world).RY, EngiesChaosModVariables.MapVariables.get(world).RZ)))
										.is(BlockTags.create(new ResourceLocation("engies_chaos:ddaylightningstrikeable")))) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new DDayLightningSpawnerEntity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER.get(), _level);
										entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RX,
												(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
												EngiesChaosModVariables.MapVariables.get(world).RZ, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
								EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
									entityToSpawn.moveTo(168, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
								EngiesChaosMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
										entityToSpawn.moveTo(168, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), (-168), world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
									EngiesChaosMod.queueServerWork(10, () -> {
										if (world instanceof ServerLevel _level) {
											Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
											entityToSpawn.moveTo((-168), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), (-168), world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof Mob _mobToSpawn)
												_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
											_level.addFreshEntity(entityToSpawn);
										}
										EngiesChaosMod.queueServerWork(10, () -> {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
												entityToSpawn.moveTo((-168), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168, world.getRandom().nextFloat() * 360F, 0);
												if (entityToSpawn instanceof Mob _mobToSpawn)
													_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
												_level.addFreshEntity(entityToSpawn);
											}
											EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = false;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										});
									});
								});
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.25) {
							EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO, _level, 4,
													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos lightning");
							} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
								EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO, _level, 4,
													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos lightning2");
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
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayoncleanup == false) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds > 0) {
							EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds - 0.05;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds <= 0) {
							if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes != 0) {
								EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = 60;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes = EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes - 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else {
								if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddayhappened = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(95, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(200, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (Math.random() <= 0.75) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos darkness");
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).missilecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						MissileSpawnProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).riftcooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						RiftSpawnsProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).spikecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						SpikeSpawnsProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						AvalancheSpawnProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).hordecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						HordeSpawnsProcedure.execute(world);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayoncleanup == false) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds > 0) {
							EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds - 0.05;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds <= 0) {
							if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes != 0) {
								EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = 60;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes = EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes - 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else {
								if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).sddayhappened = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(95, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(200, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 15));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (Math.random() <= 0.6) {
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
					if (EngiesChaosModVariables.MapVariables.get(world).hordecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 15));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						HordeSpawnsProcedure.execute(world);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayoncleanup == false) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds > 0) {
							EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds - 0.05;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds <= 0) {
							if (EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes != 0) {
								EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = 60;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes = EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes - 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else {
								if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).theendhappened = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(95, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(200, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 10));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (Math.random() <= 0.45) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos darkness");
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).missilecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 10));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						MissileSpawnProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).riftcooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 10));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						RiftSpawnsProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).spikecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 10));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						SpikeSpawnsProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 10));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						AvalancheSpawnProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).hordecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 10));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						HordeSpawnsProcedure.execute(world);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayoncleanup == false) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds > 0) {
							EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds - 0.05;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds <= 0) {
							if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes != 0) {
								EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = 60;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes = EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes - 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else {
								if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ewrathhappened = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(95, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(200, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (Math.random() <= 0.3) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO, _level, 4,
													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos darkness");
							}
						}
						if (EngiesChaosModVariables.MapVariables.get(world).missilecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							MissileSpawnProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).riftcooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							RiftSpawnsProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).spikecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							SpikeSpawnsProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							AvalancheSpawnProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).hordecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							HordeSpawnsProcedure.execute(world);
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true) {
						if (EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (Math.random() <= 0.15) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO, _level, 4,
													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos darkness");
							}
						}
						if (EngiesChaosModVariables.MapVariables.get(world).missilecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							MissileSpawnProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).riftcooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							RiftSpawnsProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).spikecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							SpikeSpawnsProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							AvalancheSpawnProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).hordecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							HordeSpawnsProcedure.execute(world);
						}
					}
				}
			}
		}
	}
}