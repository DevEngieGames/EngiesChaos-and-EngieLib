package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.entity.SharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.RareSharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.MythicSharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.LegendarySharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.ExoticSharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.EpicSharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRare2LayAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.AlbinoSharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class AprilFoolsSharkoChanceForSleepProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
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
				if (Math.random() > 0.0005) {
					if (entity instanceof SharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2LayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
				} else {
					{
						boolean _setval = true;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SharkoLayCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else if (world instanceof Level _lvl44 && _lvl44.isDay()) {
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
					if (entity instanceof SharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareLayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2LayAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
				} else {
					{
						boolean _setval = true;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SharkoLayCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}