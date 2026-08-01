package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.entity.CosmoLayEntity;
import net.engiegames.reallaboutengie.entity.ConstellationLayEntity;
import net.engiegames.reallaboutengie.entity.BigSharkoLayEntity;
import net.engiegames.reallaboutengie.entity.BigRareSharkoLayEntity;
import net.engiegames.reallaboutengie.entity.BigMythicSharkoLayEntity;
import net.engiegames.reallaboutengie.entity.BigLegendarySharkoLayEntity;
import net.engiegames.reallaboutengie.entity.BigExoticSharkoLayEntity;
import net.engiegames.reallaboutengie.entity.BigEpicSharkoLayEntity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoRareLayEntity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoRare2LayEntity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoLayEntity;
import net.engiegames.reallaboutengie.entity.BigAlbinoSharkoLayEntity;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class BigSharkoChanceForSleepProcedure {
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
				if (Math.random() >= 0.25) {
					if (entity instanceof BigSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigAlbinoSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_albino_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigRareSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEpicSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigLegendarySharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_legendary_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigMythicSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_mythic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigExoticSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_exotic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRareLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRare2LayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_tiger_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CosmoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ConstellationLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:constellation_sleep ~ ~ ~");
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
		} else if (world instanceof Level _lvl52 && _lvl52.isDay()) {
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
					if (entity instanceof BigSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigAlbinoSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_albino_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigRareSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEpicSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigLegendarySharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_legendary_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigMythicSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_mythic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigExoticSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_exotic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRareLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRare2LayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_tiger_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CosmoLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ConstellationLayEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:constellation_sleep ~ ~ ~");
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