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
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.NightmareOutragedEngieEntity;
import engiegames.engies_chaos.entity.NightmareMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.NightmareMadEngieEntity;
import engiegames.engies_chaos.entity.NightmareHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.NightmareEnragedEngieEntity;
import engiegames.engies_chaos.entity.NightmareEngieEntity;
import engiegames.engies_chaos.entity.NightmareAngryEngieEntity;
import engiegames.engies_chaos.entity.MonstrosityEngieEntity;
import engiegames.engies_chaos.entity.MadEngieEntity;
import engiegames.engies_chaos.entity.InsanityOutragedEngieEntity;
import engiegames.engies_chaos.entity.InsanityMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.InsanityMadEngieEntity;
import engiegames.engies_chaos.entity.InsanityHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.InsanityEnragedEngieEntity;
import engiegames.engies_chaos.entity.InsanityEngieEntity;
import engiegames.engies_chaos.entity.InsanityAngryEngieEntity;
import engiegames.engies_chaos.entity.HsotileEngieEntity;
import engiegames.engies_chaos.entity.HostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.EnragedEngieEntity;
import engiegames.engies_chaos.entity.EngiePocOutragedEngieEntity;
import engiegames.engies_chaos.entity.EngiePocMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.EngiePocMadEngieEntity;
import engiegames.engies_chaos.entity.EngiePocHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.EngiePocEnragedEngieEntity;
import engiegames.engies_chaos.entity.EngiePocEngieEntity;
import engiegames.engies_chaos.entity.EngiePocAngryEngieEntity;
import engiegames.engies_chaos.entity.AngryEngieEntity;
import engiegames.engies_chaos.entity.AngryCreatorEntity;
import engiegames.engies_chaos.EngiesChaosMod;

public class HordeSpawner1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_WRATH_TOGGLE) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index0 = 0; index0 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index0++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index1 = 0; index1 < 4; index1++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index2 = 0; index2 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index2++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index3 = 0; index3 < 4; index3++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index4 = 0; index4 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index4++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index5 = 0; index5 < 4; index5++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index6 = 0; index6 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index6++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index7 = 0; index7 < 4; index7++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index8 = 0; index8 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index8++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index9 = 0; index9 < 4; index9++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index10 = 0; index10 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index10++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index11 = 0; index11 < 4; index11++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index12 = 0; index12 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index12++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index13 = 0; index13 < 4; index13++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/hostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index14 = 0; index14 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index14++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index15 = 0; index15 < 4; index15++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index16 = 0; index16 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index16++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index17 = 0; index17 < 4; index17++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index18 = 0; index18 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index18++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index19 = 0; index19 < 4; index19++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index20 = 0; index20 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index20++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index21 = 0; index21 < 4; index21++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index22 = 0; index22 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index22++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index23 = 0; index23 < 4; index23++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index24 = 0; index24 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index24++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index25 = 0; index25 < 4; index25++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index26 = 0; index26 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index26++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index27 = 0; index27 < 4; index27++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/nightmarehostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index28 = 0; index28 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index28++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index29 = 0; index29 < 4; index29++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index30 = 0; index30 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index30++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index31 = 0; index31 < 4; index31++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index32 = 0; index32 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index32++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index33 = 0; index33 < 4; index33++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index34 = 0; index34 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index34++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index35 = 0; index35 < 4; index35++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index36 = 0; index36 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index36++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index37 = 0; index37 < 4; index37++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index38 = 0; index38 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index38++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index39 = 0; index39 < 4; index39++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index40 = 0; index40 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index40++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index41 = 0; index41 < 4; index41++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/insanityhostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index42 = 0; index42 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index42++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index43 = 0; index43 < 4; index43++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index44 = 0; index44 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index44++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index45 = 0; index45 < 4; index45++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index46 = 0; index46 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index46++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index47 = 0; index47 < 4; index47++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index48 = 0; index48 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index48++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index49 = 0; index49 < 4; index49++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index50 = 0; index50 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index50++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index51 = 0; index51 < 4; index51++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index52 = 0; index52 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index52++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index53 = 0; index53 < 4; index53++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index54 = 0; index54 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 4); index54++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index55 = 0; index55 < 4; index55++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiepochostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.THE_END_TOGGLE) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index56 = 0; index56 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index56++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index57 = 0; index57 < 3; index57++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index58 = 0; index58 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index58++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index59 = 0; index59 < 3; index59++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index60 = 0; index60 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index60++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index61 = 0; index61 < 3; index61++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index62 = 0; index62 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index62++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index63 = 0; index63 < 3; index63++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index64 = 0; index64 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index64++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index65 = 0; index65 < 3; index65++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index66 = 0; index66 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index66++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index67 = 0; index67 < 3; index67++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index68 = 0; index68 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index68++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index69 = 0; index69 < 3; index69++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/hostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index70 = 0; index70 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index70++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index71 = 0; index71 < 3; index71++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index72 = 0; index72 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index72++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index73 = 0; index73 < 3; index73++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index74 = 0; index74 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index74++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index75 = 0; index75 < 3; index75++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index76 = 0; index76 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index76++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index77 = 0; index77 < 3; index77++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index78 = 0; index78 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index78++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index79 = 0; index79 < 3; index79++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index80 = 0; index80 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index80++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index81 = 0; index81 < 3; index81++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index82 = 0; index82 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index82++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index83 = 0; index83 < 3; index83++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/nightmarehostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index84 = 0; index84 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index84++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index85 = 0; index85 < 3; index85++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index86 = 0; index86 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index86++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index87 = 0; index87 < 3; index87++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index88 = 0; index88 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index88++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index89 = 0; index89 < 3; index89++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index90 = 0; index90 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index90++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index91 = 0; index91 < 3; index91++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index92 = 0; index92 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index92++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index93 = 0; index93 < 3; index93++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index94 = 0; index94 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index94++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index95 = 0; index95 < 3; index95++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index96 = 0; index96 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index96++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index97 = 0; index97 < 3; index97++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/insanityhostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index98 = 0; index98 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index98++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index99 = 0; index99 < 3; index99++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index100 = 0; index100 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index100++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index101 = 0; index101 < 3; index101++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index102 = 0; index102 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index102++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index103 = 0; index103 < 3; index103++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index104 = 0; index104 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index104++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index105 = 0; index105 < 3; index105++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index106 = 0; index106 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index106++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index107 = 0; index107 < 3; index107++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index108 = 0; index108 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index108++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index109 = 0; index109 < 3; index109++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index110 = 0; index110 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 3); index110++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index111 = 0; index111 < 3; index111++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiepochostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index112 = 0; index112 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index112++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index113 = 0; index113 < 2; index113++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index114 = 0; index114 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index114++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index115 = 0; index115 < 2; index115++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index116 = 0; index116 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index116++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index117 = 0; index117 < 2; index117++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index118 = 0; index118 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index118++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index119 = 0; index119 < 2; index119++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index120 = 0; index120 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index120++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index121 = 0; index121 < 2; index121++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index122 = 0; index122 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index122++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index123 = 0; index123 < 2; index123++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index124 = 0; index124 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index124++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index125 = 0; index125 < 2; index125++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/hostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index126 = 0; index126 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index126++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index127 = 0; index127 < 2; index127++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index128 = 0; index128 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index128++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index129 = 0; index129 < 2; index129++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index130 = 0; index130 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index130++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index131 = 0; index131 < 2; index131++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index132 = 0; index132 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index132++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index133 = 0; index133 < 2; index133++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index134 = 0; index134 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index134++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index135 = 0; index135 < 2; index135++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index136 = 0; index136 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index136++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index137 = 0; index137 < 2; index137++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index138 = 0; index138 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index138++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index139 = 0; index139 < 2; index139++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/nightmarehostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index140 = 0; index140 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index140++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index141 = 0; index141 < 2; index141++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index142 = 0; index142 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index142++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index143 = 0; index143 < 2; index143++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index144 = 0; index144 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index144++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index145 = 0; index145 < 2; index145++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index146 = 0; index146 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index146++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index147 = 0; index147 < 2; index147++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index148 = 0; index148 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index148++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index149 = 0; index149 < 2; index149++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index150 = 0; index150 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index150++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index151 = 0; index151 < 2; index151++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index152 = 0; index152 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index152++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index153 = 0; index153 < 2; index153++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/insanityhostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index154 = 0; index154 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index154++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index155 = 0; index155 < 2; index155++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index156 = 0; index156 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index156++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index157 = 0; index157 < 2; index157++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index158 = 0; index158 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index158++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index159 = 0; index159 < 2; index159++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index160 = 0; index160 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index160++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index161 = 0; index161 < 2; index161++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index162 = 0; index162 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index162++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index163 = 0; index163 < 2; index163++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index164 = 0; index164 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index164++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index165 = 0; index165 < 2; index165++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index166 = 0; index166 < (int) (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount * 2); index166++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						for (int index167 = 0; index167 < 2; index167++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
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
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiepochostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			}
		} else {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index168 = 0; index168 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index168++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index169 = 0; index169 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index169++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index170 = 0; index170 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index170++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index171 = 0; index171 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index171++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index172 = 0; index172 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index172++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index173 = 0; index173 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index173++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index174 = 0; index174 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index174++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/hostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index175 = 0; index175 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index175++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index176 = 0; index176 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index176++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index177 = 0; index177 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index177++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index178 = 0; index178 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index178++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index179 = 0; index179 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index179++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index180 = 0; index180 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index180++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index181 = 0; index181 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index181++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/nightmarehostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index182 = 0; index182 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index182++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index183 = 0; index183 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index183++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index184 = 0; index184 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index184++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index185 = 0; index185 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index185++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index186 = 0; index186 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index186++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index187 = 0; index187 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index187++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index188 = 0; index188 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index188++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/insanityhostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index189 = 0; index189 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index189++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index190 = 0; index190 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index190++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index191 = 0; index191 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index191++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index192 = 0; index192 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index192++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index193 = 0; index193 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index193++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index194 = 0; index194 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index194++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index195 = 0; index195 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index195++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiepochostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			}
		}
	}
}