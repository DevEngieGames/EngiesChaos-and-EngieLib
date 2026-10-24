package engiegames.engies_chaos.procedures;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.Comparator;
import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModDamageSources;
import engiegames.engies_chaos.entity.YellowLightningEntity;
import engiegames.engies_chaos.entity.NormalEntity;
import engiegames.engies_chaos.entity.MOABEntity;
import engiegames.engies_chaos.entity.BlueBurstEntity;

public class MissileTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, _ent.getYRot(), _ent.getXRot());
		}
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (!(entityiterator instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.DARKNESS))) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 1, 255, false, false));
			} else if (entityiterator instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.DARKNESS)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.GLOWING);
			}
		}
		if (entity instanceof YellowLightningEntity) {
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level.getScoreboard().getPlayerTeam("YellowLightning");
				if (_pt != null) {
					if (_entityTeam instanceof Player _player)
						_entityTeam.level.getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
					else
						_entityTeam.level.getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
				}
			}
			if (entity instanceof YellowLightningEntity _datEntSetI)
				_datEntSetI.getEntityData().set(YellowLightningEntity.DATA_YellowLightningTimeBeforeExplosion,
						(int) ((entity instanceof YellowLightningEntity _datEntI ? _datEntI.getEntityData().get(YellowLightningEntity.DATA_YellowLightningTimeBeforeExplosion) : 0) - 1));
			if ((entity instanceof YellowLightningEntity _datEntI ? _datEntI.getEntityData().get(YellowLightningEntity.DATA_YellowLightningTimeBeforeExplosion) : 0) <= 0) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, 1, 1, 1, 1);
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player && (entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
							entityiterator.hurt(EngiesChaosModDamageSources.YELLOW_LIGHTNING_EXPLOSION, Math.round(Mth.nextInt(RandomSource.create(), 15, 30)));
						}
					}
				}
				if (!entity.level.isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof BlueBurstEntity) {
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level.getScoreboard().getPlayerTeam("BlueBurst");
				if (_pt != null) {
					if (_entityTeam instanceof Player _player)
						_entityTeam.level.getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
					else
						_entityTeam.level.getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
				}
			}
			if (entity instanceof BlueBurstEntity _datEntSetI)
				_datEntSetI.getEntityData().set(BlueBurstEntity.DATA_BlueBurstTimeBeforeExplosion, (int) ((entity instanceof BlueBurstEntity _datEntI ? _datEntI.getEntityData().get(BlueBurstEntity.DATA_BlueBurstTimeBeforeExplosion) : 0) - 1));
			if ((entity instanceof BlueBurstEntity _datEntI ? _datEntI.getEntityData().get(BlueBurstEntity.DATA_BlueBurstTimeBeforeExplosion) : 0) <= 0) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 5, 5, 5, 1);
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player && (entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
							entityiterator.hurt(EngiesChaosModDamageSources.YELLOW_LIGHTNING_EXPLOSION, Math.round(Mth.nextInt(RandomSource.create(), 40, 60)));
						}
					}
				}
				if (!entity.level.isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof NormalEntity) {
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level.getScoreboard().getPlayerTeam("Normal");
				if (_pt != null) {
					if (_entityTeam instanceof Player _player)
						_entityTeam.level.getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
					else
						_entityTeam.level.getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
				}
			}
			if (entity instanceof NormalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(NormalEntity.DATA_NormalTimeBeforeExplosion, (int) ((entity instanceof NormalEntity _datEntI ? _datEntI.getEntityData().get(NormalEntity.DATA_NormalTimeBeforeExplosion) : 0) - 1));
			if ((entity instanceof NormalEntity _datEntI ? _datEntI.getEntityData().get(NormalEntity.DATA_NormalTimeBeforeExplosion) : 0) <= 0) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 10, 10, 10, 10, 1);
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(70 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player && (entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
							entityiterator.hurt(EngiesChaosModDamageSources.NORMAL_EXPLOSION, Math.round(Mth.nextInt(RandomSource.create(), 25, 40)));
						}
					}
				}
				if (!entity.level.isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof MOABEntity) {
			if (entity instanceof MOABEntity _datEntSetI)
				_datEntSetI.getEntityData().set(MOABEntity.DATA_MOABTimeBeforeExplosion, (int) ((entity instanceof MOABEntity _datEntI ? _datEntI.getEntityData().get(MOABEntity.DATA_MOABTimeBeforeExplosion) : 0) - 1));
			if ((entity instanceof MOABEntity _datEntI ? _datEntI.getEntityData().get(MOABEntity.DATA_MOABTimeBeforeExplosion) : 0) <= 0) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 15, 15, 15, 15, 1);
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(126 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player && (entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
							entityiterator.hurt(EngiesChaosModDamageSources.MOAB_EXPLOSION, Math.round(Mth.nextInt(RandomSource.create(), 60, 80)));
						}
					}
				}
				if (!entity.level.isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}