package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.engiegames.reallaboutengie.init.AllaboutengieModEntities;
import net.engiegames.reallaboutengie.entity.SharkoEntity;
import net.engiegames.reallaboutengie.entity.RareSharkoEntity;
import net.engiegames.reallaboutengie.entity.MythicSharkoEntity;
import net.engiegames.reallaboutengie.entity.LegendarySharkoEntity;
import net.engiegames.reallaboutengie.entity.ExoticSharkoEntity;
import net.engiegames.reallaboutengie.entity.EpicSharkoEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRare2Entity;
import net.engiegames.reallaboutengie.entity.EngieSharkoEntity;
import net.engiegames.reallaboutengie.entity.BigSharkoEntity;
import net.engiegames.reallaboutengie.entity.BigRareSharkoEntity;
import net.engiegames.reallaboutengie.entity.BigMythicSharkoEntity;
import net.engiegames.reallaboutengie.entity.BigLegendarySharkoEntity;
import net.engiegames.reallaboutengie.entity.BigExoticSharkoEntity;
import net.engiegames.reallaboutengie.entity.BigEpicSharkoEntity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoRareEntity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoRare2Entity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoEntity;
import net.engiegames.reallaboutengie.entity.BigAlbinoSharkoEntity;
import net.engiegames.reallaboutengie.entity.AlbinoSharkoEntity;

public class ChanceForBigSharkoProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.25) {
			if (entity instanceof SharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigSharkoEntity(AllaboutengieModEntities.BIG_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof AlbinoSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigAlbinoSharkoEntity(AllaboutengieModEntities.BIG_ALBINO_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof RareSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigRareSharkoEntity(AllaboutengieModEntities.BIG_RARE_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EpicSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigEpicSharkoEntity(AllaboutengieModEntities.BIG_EPIC_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof LegendarySharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigLegendarySharkoEntity(AllaboutengieModEntities.BIG_LEGENDARY_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof MythicSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigMythicSharkoEntity(AllaboutengieModEntities.BIG_MYTHIC_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof ExoticSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigExoticSharkoEntity(AllaboutengieModEntities.BIG_EXOTIC_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigEngieSharkoEntity(AllaboutengieModEntities.BIG_ENGIE_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoRareEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigEngieSharkoRareEntity(AllaboutengieModEntities.BIG_ENGIE_SHARKO_RARE.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoRare2Entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigEngieSharkoRare2Entity(AllaboutengieModEntities.BIG_TIGER_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}