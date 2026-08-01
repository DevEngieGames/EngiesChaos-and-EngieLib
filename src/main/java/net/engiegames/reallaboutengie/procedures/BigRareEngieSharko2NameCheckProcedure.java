package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoRare2TamedEntity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoRare2SleepEntity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoRare2LayEntity;
import net.engiegames.reallaboutengie.AllaboutengieMod;

import java.util.Comparator;

public class BigRareEngieSharko2NameCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BigEngieSharkoRare2TamedEntity) {
			if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(30 / 2d), e -> true).isEmpty())) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player) {
							{
								Entity _ent = entity;
								_ent.teleportTo(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
										((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ), _ent.getYRot(), _ent.getXRot());
							}
						}
					}
				}
			} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(30 / 2d), e -> true).isEmpty()) {
				if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(20 / 2d), e -> true).isEmpty())) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof Player) {
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ), 1);
							}
						}
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Cosmo")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Constellation")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:constellation ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof BigEngieSharkoRare2LayEntity) {
			if (!(world instanceof Level _lvl17 && _lvl17.isDay())) {
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoLayCD == true) {
					entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
						{
							boolean _setval = false;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoLayCD == false) {
					if (Math.random() <= 0.5) {
						if (entity instanceof BigEngieSharkoRare2LayEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_tiger_sharko_sleep ~ ~ ~");
									}
								}
							});
						}
					} else {
						{
							boolean _setval = false;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else if (world instanceof Level _lvl25 && _lvl25.isDay()) {
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoLayCD == true) {
					entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
						{
							boolean _setval = false;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoLayCD == false) {
					if (Math.random() <= 0.0005) {
						if (entity instanceof BigEngieSharkoRare2LayEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_tiger_sharko_sleep ~ ~ ~");
									}
								}
							});
						}
					} else {
						{
							boolean _setval = false;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Cosmo")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo_lay ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Constellation")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:constellation_lay ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof BigEngieSharkoRare2SleepEntity) {
			if (!(world instanceof Level _lvl40 && _lvl40.isDay())) {
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoSleepCD == true) {
					entity.getPersistentData().putDouble("SharkoSleepCD", (entity.getPersistentData().getDouble("SharkoSleepCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoSleepCD") >= 240) {
						{
							boolean _setval = false;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoLayCD == false) {
					if (Math.random() <= 0.0005) {
						if (entity instanceof BigEngieSharkoRare2SleepEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_tiger_sharko_lay ~ ~ ~");
									}
								}
							});
						}
					} else {
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else if (world instanceof Level _lvl48 && _lvl48.isDay()) {
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoSleepCD == true) {
					entity.getPersistentData().putDouble("SharkoSleepCD", (entity.getPersistentData().getDouble("SharkoSleepCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoSleepCD") >= 240) {
						{
							boolean _setval = false;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoLayCD == false) {
					if (Math.random() <= 0.5) {
						if (entity instanceof BigEngieSharkoRare2SleepEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_tiger_sharko_lay ~ ~ ~");
									}
								}
							});
						}
					} else {
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Cosmo")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo_sleep ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Constellation")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:constellation_sleep ~ ~ ~");
					}
				}
			}
		}
	}
}