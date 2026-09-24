package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.PureInsanityEntity;
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
import engiegames.engies_chaos.entity.InsanityEntity;
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
import engiegames.engies_chaos.entity.EngieGamesOutragedEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesMadEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesHostileEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesEnragedEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesAngryEngieEntity;
import engiegames.engies_chaos.entity.AngryEngieEntity;
import engiegames.engies_chaos.entity.AngryCreatorEntity;

public class UnluckyBlockBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (getEntityGameType(entity) == GameType.SURVIVAL) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("randomdrop1") instanceof IntegerProperty _getip2 ? blockstate.getValue(_getip2) : -1) == 1) {
				if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 1) {
					for (int index0 = 0; index0 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 4)); index0++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 2) {
					for (int index1 = 0; index1 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 4)); index1++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 3) {
					for (int index2 = 0; index2 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 4)); index2++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 4) {
					for (int index3 = 0; index3 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 4)); index3++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 5) {
					for (int index4 = 0; index4 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 4)); index4++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 6) {
					for (int index5 = 0; index5 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 4)); index5++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 7) {
					for (int index6 = 0; index6 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 4)); index6++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("randomdrop1") instanceof IntegerProperty _getip25 ? blockstate.getValue(_getip25) : -1) == 2) {
				if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 1) {
					for (int index7 = 0; index7 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 2, 8)); index7++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 2) {
					for (int index8 = 0; index8 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 2, 8)); index8++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 3) {
					for (int index9 = 0; index9 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 2, 8)); index9++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 4) {
					for (int index10 = 0; index10 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 2, 8)); index10++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 5) {
					for (int index11 = 0; index11 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 2, 8)); index11++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 6) {
					for (int index12 = 0; index12 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 2, 8)); index12++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 7) {
					for (int index13 = 0; index13 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 2, 8)); index13++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("randomdrop1") instanceof IntegerProperty _getip48 ? blockstate.getValue(_getip48) : -1) == 3) {
				if (Math.round(Mth.nextInt(RandomSource.create(), 1, 9)) == 1) {
					for (int index14 = 0; index14 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 12)); index14++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 9)) == 2) {
					for (int index15 = 0; index15 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 12)); index15++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 9)) == 3) {
					for (int index16 = 0; index16 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 12)); index16++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 9)) == 4) {
					for (int index17 = 0; index17 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 12)); index17++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 9)) == 5) {
					for (int index18 = 0; index18 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 12)); index18++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 9)) == 6) {
					for (int index19 = 0; index19 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 12)); index19++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 9)) == 7) {
					for (int index20 = 0; index20 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 12)); index20++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 9)) == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new InsanityEntity(EngiesChaosModEntities.INSANITY.get(), _level);
						entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 9)) == 9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PureInsanityEntity(EngiesChaosModEntities.PURE_INSANITY.get(), _level);
						entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("randomdrop1") instanceof IntegerProperty _getip84 ? blockstate.getValue(_getip84) : -1) == 4) {
				if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 1) {
					for (int index21 = 0; index21 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 4, 16)); index21++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 2) {
					for (int index22 = 0; index22 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 4, 16)); index22++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 3) {
					for (int index23 = 0; index23 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 4, 16)); index23++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 4) {
					for (int index24 = 0; index24 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 4, 16)); index24++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 5) {
					for (int index25 = 0; index25 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 4, 16)); index25++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 6) {
					for (int index26 = 0; index26 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 4, 16)); index26++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 7) {
					for (int index27 = 0; index27 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 4, 16)); index27++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("randomdrop1") instanceof IntegerProperty _getip107 ? blockstate.getValue(_getip107) : -1) == 5) {
				if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 1) {
					for (int index28 = 0; index28 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 5, 20)); index28++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMadEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 2) {
					for (int index29 = 0; index29 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 5, 20)); index29++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesAngryEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 3) {
					for (int index30 = 0; index30 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 5, 20)); index30++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesEnragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 4) {
					for (int index31 = 0; index31 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 5, 20)); index31++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesOutragedEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 5) {
					for (int index32 = 0; index32 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 5, 20)); index32++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 6) {
					for (int index33 = 0; index33 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 5, 20)); index33++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.round(Mth.nextInt(RandomSource.create(), 1, 7)) == 7) {
					for (int index34 = 0; index34 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 5, 20)); index34++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngieGamesHostileEngieEntity(EngiesChaosModEntities.ENGIE_GAMES_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level.isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}