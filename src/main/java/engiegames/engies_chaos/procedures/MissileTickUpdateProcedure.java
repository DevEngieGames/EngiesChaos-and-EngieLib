package engiegames.engies_chaos.procedures;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.YellowLightningEntity;
import engiegames.engies_chaos.entity.NormalEntity;
import engiegames.engies_chaos.entity.MOABEntity;
import engiegames.engies_chaos.entity.BlueBurstEntity;
import engiegames.engies_chaos.EngiesChaosMod;

public class MissileTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof YellowLightningEntity) {
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("YellowLightning");
				if (_pt != null) {
					if (_entityTeam instanceof Player _player)
						_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
					else
						_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
				}
			}
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.DARKNESS)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.GLOWING);
				} else {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
				}
			}
			entity.getPersistentData().putDouble("YellowLightningTimeBeforeExplosion", (entity.getPersistentData().getDouble("YellowLightningTimeBeforeExplosion") + 0.05));
			{
				EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.missileyellowlightningscale = 1 + entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).missileyellowlightningscale + 0.05;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getPersistentData().getDouble("YellowLightningTimeBeforeExplosion") >= 1) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 4, 1, 1, 1, 1);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
												_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												("damageentity @e[type=minecraft:player,distance=..3.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 15, 30)) + " 1 true"));
							}
						}
					}
				}
				entity.getPersistentData().putDouble("YellowLightningTimeBeforeExplosion", 0);
				if (!entity.level().isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof BlueBurstEntity) {
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("BlueBurst");
				if (_pt != null) {
					if (_entityTeam instanceof Player _player)
						_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
					else
						_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
				}
			}
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(MobEffects.DARKNESS)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.GLOWING);
				} else {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
				}
			}
			entity.getPersistentData().putDouble("BlueBurstTimeBeforeExplosion", (entity.getPersistentData().getDouble("BlueBurstTimeBeforeExplosion") + 0.05));
			{
				EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.missileblueburstscale = 1 + entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).missileblueburstscale + 0.01666666667;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getPersistentData().getDouble("BlueBurstTimeBeforeExplosion") >= 3) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 11, 5, 5, 5, 1);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
												_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												("damageentity @e[type=minecraft:player,distance=..10.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 60)) + " 2 true"));
							}
						}
					}
				}
				entity.getPersistentData().putDouble("BlueBurstTimeBeforeExplosion", 0);
				if (!entity.level().isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof NormalEntity) {
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Normal");
				if (_pt != null) {
					if (_entityTeam instanceof Player _player)
						_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
					else
						_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
				}
			}
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(MobEffects.DARKNESS)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.GLOWING);
				} else {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
				}
			}
			entity.getPersistentData().putDouble("NormalTimeBeforeExplosion", (entity.getPersistentData().getDouble("NormalTimeBeforeExplosion") + 0.05));
			{
				EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.missilenormalscale = 1 + entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).missilenormalscale + 0.008333333333;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getPersistentData().getDouble("NormalTimeBeforeExplosion") >= 6) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 35, 10, 10, 10, 1);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
												_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												("damageentity @e[type=minecraft:player,distance=..35] " + Math.round(Mth.nextDouble(RandomSource.create(), 25, 40)) + " 3 true"));
							}
						}
					}
				}
				entity.getPersistentData().putDouble("NormalTimeBeforeExplosion", 0);
				if (!entity.level().isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof MOABEntity) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator instanceof LivingEntity _livEnt49 && _livEnt49.hasEffect(MobEffects.DARKNESS)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.GLOWING);
				} else {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
				}
			}
			entity.getPersistentData().putDouble("MoabTimeBeforeExplosion", (entity.getPersistentData().getDouble("MoabTimeBeforeExplosion") + 0.05));
			{
				EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.missilemoabscale = 1 + entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).missilemoabscale + 0.003125;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getPersistentData().getDouble("MoabTimeBeforeExplosion") >= 16) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 63, 15, 15, 15, 1);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
												_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												("run damage @e[type=minecraft:player,distance=..63] " + Math.round(Mth.nextDouble(RandomSource.create(), 60, 80)) + " 4 true"));
							}
						}
					}
				}
				entity.getPersistentData().putDouble("MoabTimeBeforeExplosion", 0);
				if (!entity.level().isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}