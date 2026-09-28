package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import java.util.Comparator;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.EngieGamesOutragedEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesMadEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesHostileEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesEnragedEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesAngryEngieEntity;
import engiegames.engies_chaos.EngiesChaosMod;

public class HordeSpawner2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 1) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index0 = 0; index0 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index0++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMadEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index1 = 0; index1 < 5; index1++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMadEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index2 = 0; index2 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index2++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesAngryEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index3 = 0; index3 < 5; index3++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesAngryEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index4 = 0; index4 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index4++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesEnragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index5 = 0; index5 < 5; index5++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesEnragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 4) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index6 = 0; index6 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index6++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesOutragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index7 = 0; index7 < 5; index7++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesOutragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 5) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index8 = 0; index8 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index8++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index9 = 0; index9 < 5; index9++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 6) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index10 = 0; index10 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index10++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index11 = 0; index11 < 5; index11++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 7) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index12 = 0; index12 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index12++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index13 = 0; index13 < 5; index13++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiegameshostile")))) {
							entityiterator.getPersistentData().putBoolean("hordespawned", true);
						}
					}
				}
			});
		} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 1) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index14 = 0; index14 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index14++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMadEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index15 = 0; index15 < 5; index15++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMadEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index16 = 0; index16 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index16++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesAngryEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index17 = 0; index17 < 5; index17++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesAngryEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index18 = 0; index18 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index18++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesEnragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index19 = 0; index19 < 5; index19++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesEnragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 4) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index20 = 0; index20 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index20++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesOutragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index21 = 0; index21 < 5; index21++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesOutragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 5) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index22 = 0; index22 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index22++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index23 = 0; index23 < 5; index23++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 6) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index24 = 0; index24 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index24++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index25 = 0; index25 < 5; index25++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 7) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index26 = 0; index26 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index26++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index27 = 0; index27 < 5; index27++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiegameshostile")))) {
							entityiterator.getPersistentData().putBoolean("hordespawned", true);
						}
					}
				}
			});
		} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 1) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index28 = 0; index28 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index28++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMadEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index29 = 0; index29 < 5; index29++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMadEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index30 = 0; index30 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index30++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesAngryEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index31 = 0; index31 < 5; index31++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesAngryEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index32 = 0; index32 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index32++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesEnragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index33 = 0; index33 < 5; index33++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesEnragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 4) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index34 = 0; index34 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index34++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesOutragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index35 = 0; index35 < 5; index35++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesOutragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 5) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index36 = 0; index36 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index36++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index37 = 0; index37 < 5; index37++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 6) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index38 = 0; index38 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index38++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index39 = 0; index39 < 5; index39++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 7) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index40 = 0; index40 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index40++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index41 = 0; index41 < 5; index41++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiegameshostile")))) {
							entityiterator.getPersistentData().putBoolean("hordespawned", true);
						}
					}
				}
			});
		} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 1) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index42 = 0; index42 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index42++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMadEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index43 = 0; index43 < 5; index43++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMadEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index44 = 0; index44 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index44++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesAngryEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index45 = 0; index45 < 5; index45++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesAngryEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index46 = 0; index46 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index46++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesEnragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index47 = 0; index47 < 5; index47++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesEnragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 4) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index48 = 0; index48 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index48++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesOutragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index49 = 0; index49 < 5; index49++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesOutragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 5) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index50 = 0; index50 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index50++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index51 = 0; index51 < 5; index51++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 6) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index52 = 0; index52 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index52++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index53 = 0; index53 < 5; index53++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 7) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
					for (int index54 = 0; index54 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 5); index54++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
					for (int index55 = 0; index55 < 5; index55++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			EngiesChaosMod.queueServerWork(1, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiegameshostile")))) {
							entityiterator.getPersistentData().putBoolean("hordespawned", true);
						}
					}
				}
			});
		}
	}
}