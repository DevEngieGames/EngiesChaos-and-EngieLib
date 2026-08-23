package engiegames.engies_chaos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

import engiegames.engies_chaos.entity.EnragedTNTEntity;

public class TNTSpawnTNTDeathProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (!world.getEntitiesOfClass(EnragedTNTEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(2 / 2d), e -> true).isEmpty()) {
					if (entity.isUnderWater()) {
						if (!(entityiterator instanceof ItemEntity)) {
							entityiterator.hurt(DamageSource.GENERIC, (float) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 1));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY()), (entity.getZ()), (int) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 1), 3, 3, 3, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75, false);
								}
							}
						}
					} else {
						if (!(entityiterator instanceof ItemEntity)) {
							entityiterator.hurt(DamageSource.GENERIC, (float) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 0));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY()), (entity.getZ()), (int) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 0), 3, 3, 3, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75, false);
								}
							}
						}
					}
				} else if (!world.getEntitiesOfClass(EnragedTNTEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
					if (entity.isUnderWater()) {
						if (!(entityiterator instanceof ItemEntity)) {
							entityiterator.hurt(DamageSource.GENERIC, (float) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 2));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY()), (entity.getZ()), (int) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 2), 3, 3, 3, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75, false);
								}
							}
						}
					} else {
						if (!(entityiterator instanceof ItemEntity)) {
							entityiterator.hurt(DamageSource.GENERIC, (float) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 1));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY()), (entity.getZ()), (int) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 1), 3, 3, 3, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75, false);
								}
							}
						}
					}
				} else if (!world.getEntitiesOfClass(EnragedTNTEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
					if (entity.isUnderWater()) {
						if (!(entityiterator instanceof ItemEntity)) {
							entityiterator.hurt(DamageSource.GENERIC, (float) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 3));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY()), (entity.getZ()), (int) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 3), 3, 3, 3, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75, false);
								}
							}
						}
					} else {
						if (!(entityiterator instanceof ItemEntity)) {
							entityiterator.hurt(DamageSource.GENERIC, (float) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 2));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY()), (entity.getZ()), (int) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 2), 3, 3, 3, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75, false);
								}
							}
						}
					}
				} else if (!world.getEntitiesOfClass(EnragedTNTEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(5 / 2d), e -> true).isEmpty()) {
					if (entity.isUnderWater()) {
						if (!(entityiterator instanceof ItemEntity)) {
							entityiterator.hurt(DamageSource.GENERIC, (float) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 4));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY()), (entity.getZ()), (int) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 4), 3, 3, 3, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75, false);
								}
							}
						}
					} else {
						if (!(entityiterator instanceof ItemEntity)) {
							entityiterator.hurt(DamageSource.GENERIC, (float) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 3));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY()), (entity.getZ()), (int) (Mth.nextDouble(RandomSource.create(), 25, 50) - 6.25 * 3), 3, 3, 3, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.75, false);
								}
							}
						}
					}
				}
			}
		}
	}
}