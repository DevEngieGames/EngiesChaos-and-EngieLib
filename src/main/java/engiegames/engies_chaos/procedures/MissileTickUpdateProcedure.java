package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
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

public class MissileTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "team join DDayNoCol");
			}
		}
		{
			Entity _ent = entity;
			_ent.teleportTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, _ent.getYRot(), _ent.getXRot());
		}
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (entityiterator instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.DARKNESS)) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 1, 255, false, false));
			} else if (!(entityiterator instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(MobEffects.DARKNESS))) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.GLOWING);
			}
		}
		if (entity instanceof YellowLightningEntity) {
			entity.getPersistentData().putDouble("YellowLightningTimeBeforeExplosion", (entity.getPersistentData().getDouble("YellowLightningTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("YellowLightningTimeBeforeExplosion") >= 1) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, 1, 1, 1, 1);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), ("damages @a[distance=..7] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 60)) + " 1"));
					}
				}
				entity.getPersistentData().putDouble("YellowLightningTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof BlueBurstEntity) {
			entity.getPersistentData().putDouble("BlueBurstTimeBeforeExplosion", (entity.getPersistentData().getDouble("BlueBurstTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("BlueBurstTimeBeforeExplosion") >= 3) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 5, 5, 5, 1);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), ("damages @a[distance=..21] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 60)) + " 2"));
					}
				}
				entity.getPersistentData().putDouble("BlueBurstTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof NormalEntity) {
			entity.getPersistentData().putDouble("NormalTimeBeforeExplosion", (entity.getPersistentData().getDouble("NormalTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("NormalTimeBeforeExplosion") >= 6) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 10, 10, 10, 10, 1);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), ("damages @a[distance=..70] " + Math.round(Mth.nextDouble(RandomSource.create(), 25, 40)) + " 3"));
					}
				}
				entity.getPersistentData().putDouble("NormalTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (entity instanceof MOABEntity) {
			entity.getPersistentData().putDouble("MoabTimeBeforeExplosion", (entity.getPersistentData().getDouble("MoabTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("MoabTimeBeforeExplosion") >= 16) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 15, 15, 15, 15, 1);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), ("damages @a[distance=..126] " + Math.round(Mth.nextDouble(RandomSource.create(), 60, 80)) + " 4"));
					}
				}
				entity.getPersistentData().putDouble("MoabTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
				EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}