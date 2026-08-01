package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModEntities;
import engiegames.engieschaos.entity.MadEngieOldRiftedEntity;
import engiegames.engieschaos.entity.EnragedEngieOldRiftedEntity;
import engiegames.engieschaos.entity.BloodyEngieRiftedEntity;
import engiegames.engieschaos.entity.AngryEngieOldRiftedEntity;
import engiegames.engieschaos.entity.AngryCreatorRiftedEntity;
import engiegames.engieschaos.EngiesChaosMod;

public class DDAYRiftOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("riftspawntimer", (entity.getPersistentData().getDouble("riftspawntimer") + 0.05));
		if (entity.getPersistentData().getDouble("riftspawntimer") >= 5) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).riftspawnoneentity == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.riftspawnoneentity = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (Math.random() <= 0.2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MadEngieOldRiftedEntity(EngiesChaosModEntities.MAD_ENGIE_OLD_RIFTED.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.2 && Math.random() <= 0.4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AngryEngieOldRiftedEntity(EngiesChaosModEntities.ANGRY_ENGIE_OLD_RIFTED.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.4 && Math.random() <= 0.6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedEngieOldRiftedEntity(EngiesChaosModEntities.ENRAGED_ENGIE_OLD_RIFTED.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.6 && Math.random() <= 0.8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AngryCreatorRiftedEntity(EngiesChaosModEntities.ANGRY_CREATOR_RIFTED.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.8 && Math.random() <= 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BloodyEngieRiftedEntity(EngiesChaosModEntities.BLOODY_ENGIE_RIFTED.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			EngiesChaosMod.queueServerWork(200, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
			});
		}
	}
}