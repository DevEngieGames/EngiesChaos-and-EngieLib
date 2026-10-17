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
import engiegames.engies_chaos.entity.DDaySpikeEntity;
import engiegames.engies_chaos.EngiesChaosMod;

public class SpikeSpawnsProcedure {
	public static void execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true) {
			for (int index0 = 0; index0 < 50; index0++) {
				if (Math.random() > 0.125) {
					EngiesChaosModVariables.MapVariables.get(world).SpikeRX = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).SpikeRZ = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(5, () -> {
						EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new DDaySpikeEntity(EngiesChaosModEntities.D_DAY_SPIKE.get(), _level);
							entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).SpikeRX,
									(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).SpikeRX, (int) EngiesChaosModVariables.MapVariables.get(world).SpikeRZ)),
									EngiesChaosModVariables.MapVariables.get(world).SpikeRZ, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					});
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true) {
			for (int index1 = 0; index1 < 50; index1++) {
				if (Math.random() > 0.25) {
					EngiesChaosModVariables.MapVariables.get(world).SpikeRX = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).SpikeRZ = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(5, () -> {
						EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new DDaySpikeEntity(EngiesChaosModEntities.D_DAY_SPIKE.get(), _level);
							entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).SpikeRX,
									(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).SpikeRX, (int) EngiesChaosModVariables.MapVariables.get(world).SpikeRZ)),
									EngiesChaosModVariables.MapVariables.get(world).SpikeRZ, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					});
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
			for (int index2 = 0; index2 < 50; index2++) {
				if (Math.random() > 0.375) {
					EngiesChaosModVariables.MapVariables.get(world).SpikeRX = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).SpikeRZ = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(5, () -> {
						EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new DDaySpikeEntity(EngiesChaosModEntities.D_DAY_SPIKE.get(), _level);
							entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).SpikeRX,
									(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).SpikeRX, (int) EngiesChaosModVariables.MapVariables.get(world).SpikeRZ)),
									EngiesChaosModVariables.MapVariables.get(world).SpikeRZ, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					});
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true) {
			for (int index3 = 0; index3 < 50; index3++) {
				if (Math.random() > 0.5) {
					EngiesChaosModVariables.MapVariables.get(world).SpikeRX = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).SpikeRZ = Mth.nextInt(RandomSource.create(), -175, 175);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(5, () -> {
						EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new DDaySpikeEntity(EngiesChaosModEntities.D_DAY_SPIKE.get(), _level);
							entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).SpikeRX,
									(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).SpikeRX, (int) EngiesChaosModVariables.MapVariables.get(world).SpikeRZ)),
									EngiesChaosModVariables.MapVariables.get(world).SpikeRZ, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					});
				}
			}
		}
	}
}