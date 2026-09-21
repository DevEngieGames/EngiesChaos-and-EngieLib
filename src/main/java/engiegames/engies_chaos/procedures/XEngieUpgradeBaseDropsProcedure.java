package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.EngiesChaosMod;

public class XEngieUpgradeBaseDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		EngiesChaosMod.queueServerWork(2, () -> {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("countuntilbasedrop") >= 525) {
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("countuntilbasedrop", 0);
				if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 10)) == 1) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), new ItemStack(EngiesChaosModItems.HELMET_BASE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0, 0, 0, 1);
				} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 10)) == 2) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), new ItemStack(EngiesChaosModItems.CHESTPLATE_BASE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0, 0, 0, 1);
				} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 10)) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), new ItemStack(EngiesChaosModItems.LEGGINGS_BASE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0, 0, 0, 1);
				} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 10)) == 4) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), new ItemStack(EngiesChaosModItems.BOOTS_BASE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0, 0, 0, 1);
				} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 10)) == 5) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), new ItemStack(EngiesChaosModItems.CRUCIFIX_BASE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0, 0, 0, 1);
				} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 10)) == 6) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), new ItemStack(EngiesChaosModItems.SWORD_BASE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0, 0, 0, 1);
				} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 10)) == 7) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), new ItemStack(EngiesChaosModItems.PICKAXE_BASE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0, 0, 0, 1);
				} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 10)) == 8) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), new ItemStack(EngiesChaosModItems.AXE_BASE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0, 0, 0, 1);
				} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 10)) == 9) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), new ItemStack(EngiesChaosModItems.SHOVEL_BASE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0, 0, 0, 1);
				} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 10)) == 10) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), new ItemStack(EngiesChaosModItems.AIOT_BASE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0, 0, 0, 1);
				}
			}
		});
	}
}