package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.DDAYRiftEntity;

public class RiftSpawnsProcedure {
	public static void execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true) {
			if (Math.random() > 0.125) {
				EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
					entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
							world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true) {
			if (Math.random() > 0.25) {
				if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true) {
					for (int index0 = 0; index0 < 2; index0++) {
						EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
							entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == false) {
					EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
						entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
								world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Mth.nextInt(RandomSource.create(), 1, 100) <= 35) {
						EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
							entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
			if (Math.random() > 0.375) {
				if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true) {
					for (int index1 = 0; index1 < 3; index1++) {
						EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
							entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == false) {
					EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
						entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
								world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Mth.nextInt(RandomSource.create(), 1, 100) <= 35) {
						EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
							entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Mth.nextInt(RandomSource.create(), 1, 100) <= 35) {
							EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
								entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true) {
			if (Math.random() > 0.5) {
				if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true) {
					for (int index2 = 0; index2 < 5; index2++) {
						EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
							entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == false) {
					EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
						entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
								world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Mth.nextInt(RandomSource.create(), 1, 100) <= 35) {
						EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
							entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Mth.nextInt(RandomSource.create(), 1, 100) <= 35) {
							EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
								entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Mth.nextInt(RandomSource.create(), 1, 100) <= 35) {
								EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
									entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
											world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Mth.nextInt(RandomSource.create(), 1, 100) <= 35) {
									EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
										entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
				}
			}
		} else {
			EngiesChaosModVariables.MapVariables.get(world).RiftRX = Mth.nextInt(RandomSource.create(), -175, 175);
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).RiftRZ = Mth.nextInt(RandomSource.create(), -175, 175);
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
				entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RiftRX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 125), EngiesChaosModVariables.MapVariables.get(world).RiftRZ,
						world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}