package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
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
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (entityiterator instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.DARKNESS)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.GLOWING);
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
			}
		}
		{
			Entity _ent = entity;
			_ent.teleportTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, _ent.getYRot(), _ent.getXRot());
		}
		if (entity instanceof YellowLightningEntity) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "team join YellowLightning @e[type=allaboutengie:yellow_lightning]");
				}
			}
			entity.getPersistentData().putDouble("YellowLightningTimeBeforeExplosion", (entity.getPersistentData().getDouble("YellowLightningTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("YellowLightningTimeBeforeExplosion") >= 1) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, 1, 1, 1, 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=minecraft:player,dx=1,dy=1,dz=1] run damage @s 25 1");
				entity.getPersistentData().putDouble("YellowLightningTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		} else if (entity instanceof BlueBurstEntity) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "team join BlueBurst @e[type=allaboutengie:blue_burst]");
				}
			}
			entity.getPersistentData().putDouble("BlueBurstTimeBeforeExplosion", (entity.getPersistentData().getDouble("BlueBurstTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("BlueBurstTimeBeforeExplosion") >= 3) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 5, 5, 5, 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=minecraft:player,dx=5,dy=5,dz=5] run damage @s 40 2");
				entity.getPersistentData().putDouble("BlueBurstTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		} else if (entity instanceof NormalEntity) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "team join Normal @e[type=allaboutengie:normal]");
				}
			}
			entity.getPersistentData().putDouble("NormalTimeBeforeExplosion", (entity.getPersistentData().getDouble("NormalTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("NormalTimeBeforeExplosion") >= 6) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 10, 10, 10, 10, 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=minecraft:player,dx=10,dy=10,dz=10] run damage @s 50 3");
				entity.getPersistentData().putDouble("NormalTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		} else if (entity instanceof MOABEntity) {
			entity.getPersistentData().putDouble("MoabTimeBeforeExplosion", (entity.getPersistentData().getDouble("MoabTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("MoabTimeBeforeExplosion") >= 16) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 15, 15, 15, 15, 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=minecraft:player,dx=15,dy=15,dz=15] run damage @s 75 4");
				entity.getPersistentData().putDouble("MoabTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}