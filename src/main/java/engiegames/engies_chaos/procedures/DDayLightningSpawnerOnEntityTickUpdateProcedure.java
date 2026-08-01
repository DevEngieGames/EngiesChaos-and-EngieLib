package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

public class DDayLightningSpawnerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 999999, 255, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 999999, 255, false, false));
		if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true || EngiesChaosModVariables.MapVariables.get(world).sddaystart == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true
				|| EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning == true) {
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							{
								EngiesChaosModVariables.PlayerVariables _vars = entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
								_vars.lightningflashnum = 0.25;
								_vars.syncPlayerVariables(entityiterator);
							}
						}
						EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playlightningcornersound = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level().isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
							entityToSpawn.setVisualOnly(true);
							_level.addFreshEntity(entityToSpawn);
						}
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														("damageentity @e[type=player,distance=..10] " + Math.round(Mth.nextDouble(RandomSource.create(), 45, 100)) + " 5 true"));
									}
								}
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @e[type=player,distance=..10] engies_chaos:stunned 5");
							}
						}
					});
				} else {
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
						{
							Entity _ent = entity;
							_ent.teleportTo((entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ())), (entity.getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ())), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
						}
					} else if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
						EngiesChaosModVariables.MapVariables.get(world).playlightningsound = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(1, () -> {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								{
									EngiesChaosModVariables.PlayerVariables _vars = entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
									_vars.lightningflashnum = 0.25;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
							EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (!entity.level().isClientSide())
								entity.discard();
							for (int index0 = 0; index0 < 5; index0++) {
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 4), y, z - Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 4), y, z - Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 4), y, z + Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 4), y, z + Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
							}
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if (entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															("damageentity @e[type=player,distance=..10] " + Math.round(Mth.nextDouble(RandomSource.create(), 45, 100)) + " 5 true"));
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @e[type=player,distance=..10] engies_chaos:stunned 5");
								}
							}
						});
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == false) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning == true) {
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							{
								EngiesChaosModVariables.PlayerVariables _vars = entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
								_vars.lightningflashnum = 0.25;
								_vars.syncPlayerVariables(entityiterator);
							}
						}
						EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playlightningcornersound = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level().isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
							entityToSpawn.setVisualOnly(true);
							_level.addFreshEntity(entityToSpawn);
						}
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														("damageentity @e[type=player,distance=..10] " + Math.round(Mth.nextDouble(RandomSource.create(), 45, 100)) + " 5 true"));
									}
								}
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @e[type=player,distance=..10] engies_chaos:stunned 5");
							}
						}
					});
				} else {
					if (!(world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("engies_chaos:ddaylightningstrikeable")))) {
						{
							Entity _ent = entity;
							_ent.teleportTo((entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ())), (entity.getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ())), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
						}
						EngiesChaosMod.queueServerWork(1, () -> {
							if (!(world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("engies_chaos:ddaylightningstrikeable")))) {
								if (!entity.level().isClientSide())
									entity.discard();
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("engies_chaos:ddaylightningstrikeable")))) {
						if ((world instanceof ServerLevel _serverLevelGR62 && _serverLevelGR62.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
							EngiesChaosModVariables.MapVariables.get(world).playlightningsound = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								for (Entity entityiterator : new ArrayList<>(world.players())) {
									{
										EngiesChaosModVariables.PlayerVariables _vars = entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
										_vars.lightningflashnum = 0.25;
										_vars.syncPlayerVariables(entityiterator);
									}
								}
								if (!entity.level().isClientSide())
									entity.discard();
								EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).playlightningsound2 = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 4), y, z - Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 4), y, z - Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 4), y, z + Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 4), y, z + Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								for (Entity entityiterator : new ArrayList<>(world.players())) {
									if (entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands()
														.performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																		_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																("damageentity @e[type=player,distance=..10] " + Math.round(Mth.nextDouble(RandomSource.create(), 45, 100)) + " 5 true"));
											}
										}
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"effect give @e[type=player,distance=..10] engies_chaos:stunned 5");
									}
								}
							});
						} else if ((world instanceof ServerLevel _serverLevelGR83 && _serverLevelGR83.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
							EngiesChaosModVariables.MapVariables.get(world).playlightningsound = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								for (Entity entityiterator : new ArrayList<>(world.players())) {
									{
										EngiesChaosModVariables.PlayerVariables _vars = entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
										_vars.lightningflashnum = 0.25;
										_vars.syncPlayerVariables(entityiterator);
									}
								}
								EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).playlightningsound2 = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (!entity.level().isClientSide())
									entity.discard();
								for (int index1 = 0; index1 < 2; index1++) {
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 4), y, z - Mth.nextDouble(RandomSource.create(), 1, 4))));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 4), y, z - Mth.nextDouble(RandomSource.create(), 1, 4))));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 4), y, z + Mth.nextDouble(RandomSource.create(), 1, 4))));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 4), y, z + Mth.nextDouble(RandomSource.create(), 1, 4))));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
								}
								for (Entity entityiterator : new ArrayList<>(world.players())) {
									if (entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands()
														.performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																		_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																("damageentity @e[type=player,distance=..10] " + Math.round(Mth.nextDouble(RandomSource.create(), 45, 100)) + " 5 true"));
											}
										}
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"effect give @e[type=player,distance=..10] engies_chaos:stunned 5");
									}
								}
							});
						}
					}
				}
			}
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).ddaystart == true || EngiesChaosModVariables.MapVariables.get(world).sddaystart == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true
				|| EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true)) {
			if (world.getLevelData().isThundering()) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					{
						Entity _ent = entity;
						_ent.teleportTo((entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ())), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ())), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
				} else if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
					if ((world instanceof ServerLevel _serverLevelGR115 && _serverLevelGR115.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == true
							&& (world instanceof ServerLevel _serverLevelGR116 && _serverLevelGR116.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == false) {
						EngiesChaosModVariables.MapVariables.get(world).playlightningsound = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(1, () -> {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								{
									EngiesChaosModVariables.PlayerVariables _vars = entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
									_vars.lightningflashnum = 0.25;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
							EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).playlightningsound4 = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (!entity.level().isClientSide())
								entity.discard();
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 4), y, z - Mth.nextDouble(RandomSource.create(), 1, 4))));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 4), y, z - Mth.nextDouble(RandomSource.create(), 1, 4))));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 4), y, z + Mth.nextDouble(RandomSource.create(), 1, 4))));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 4), y, z + Mth.nextDouble(RandomSource.create(), 1, 4))));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
													_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													("damageentity @e[type=player,distance=..10] " + Math.round(Mth.nextDouble(RandomSource.create(), 45, 100)) + " 5 true"));
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @e[type=player,distance=..10] engies_chaos:stunned 5");
								}
							}
						});
					} else if ((world instanceof ServerLevel _serverLevelGR136 && _serverLevelGR136.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == true
							&& (world instanceof ServerLevel _serverLevelGR137 && _serverLevelGR137.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == true) {
						EngiesChaosModVariables.MapVariables.get(world).playlightningsound = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(1, () -> {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								{
									EngiesChaosModVariables.PlayerVariables _vars = entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
									_vars.lightningflashnum = 0.25;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
							EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).playlightningsound5 = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (!entity.level().isClientSide())
								entity.discard();
							for (int index2 = 0; index2 < 2; index2++) {
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 4), y, z - Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 4), y, z - Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 4), y, z + Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 4), y, z + Mth.nextDouble(RandomSource.create(), 1, 4))));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
													_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													("damageentity @e[type=player,distance=..10] " + Math.round(Mth.nextDouble(RandomSource.create(), 45, 100)) + " 5 true"));
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @e[type=player,distance=..10] engies_chaos:stunned 5");
								}
							}
						});
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							{
								EngiesChaosModVariables.PlayerVariables _vars = entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
								_vars.lightningflashnum = 0.25;
								_vars.syncPlayerVariables(entityiterator);
							}
						}
						if (!entity.level().isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
							entityToSpawn.setVisualOnly(true);
							_level.addFreshEntity(entityToSpawn);
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
												_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												("damageentity @e[type=player,distance=..10] " + Math.round(Mth.nextDouble(RandomSource.create(), 45, 100)) + " 5 true"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @e[type=player,distance=..10] engies_chaos:stunned 5");
							}
						}
					}
				}
			}
		}
	}
}