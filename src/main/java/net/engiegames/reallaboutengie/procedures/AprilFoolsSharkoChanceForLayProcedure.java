package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.entity.SharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.RareSharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.MythicSharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.LegendarySharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.ExoticSharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.EpicSharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRare2SleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.AlbinoSharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class AprilFoolsSharkoChanceForLayProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
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
				if (Math.random() < 0.0005) {
					if (entity instanceof SharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2SleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_lay_april_fools ~ ~ ~");
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
		} else if (world instanceof Level _lvl44 && _lvl44.isDay()) {
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
				if (Math.random() >= 0.25) {
					if (entity instanceof SharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareSleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2SleepAprilFoolsEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_lay_april_fools ~ ~ ~");
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
	}
}