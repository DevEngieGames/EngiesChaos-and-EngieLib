package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.entity.TobySleepEntity;
import net.engiegames.reallaboutengie.entity.TigerSleepEntity;
import net.engiegames.reallaboutengie.entity.TechnoSleepEntity;
import net.engiegames.reallaboutengie.entity.SharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.RareSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.PBESleepEntity;
import net.engiegames.reallaboutengie.entity.MythicSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.MarshalSleepEntity;
import net.engiegames.reallaboutengie.entity.LouisSleepEntity;
import net.engiegames.reallaboutengie.entity.LegendarySharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.FinneganSleepEntity;
import net.engiegames.reallaboutengie.entity.ExoticSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.EpicSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareSleepEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRare2SleepEntity;
import net.engiegames.reallaboutengie.entity.ChampSleepEntity;
import net.engiegames.reallaboutengie.entity.CBESleepEntity;
import net.engiegames.reallaboutengie.entity.BuddySleepEntity;
import net.engiegames.reallaboutengie.entity.Bothan2netSleepEntity;
import net.engiegames.reallaboutengie.entity.AtlasSleepEntity;
import net.engiegames.reallaboutengie.entity.ApolloSleepEntity;
import net.engiegames.reallaboutengie.entity.AlbinoSharkoSleepEntity;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class SharkoChanceForLayOnSide2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoSleepCD == true) {
				entity.getPersistentData().putDouble("SharkoLayOnSideCD", (entity.getPersistentData().getDouble("SharkoLayOnSideCD") + 0.05));
				if (entity.getPersistentData().getDouble("SharkoLayOnSideCD") >= 120) {
					entity.getPersistentData().putDouble("SharkoLayOnSideCD", 0);
					{
						boolean _setval = false;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SharkoSleepCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoSleepCD == false) {
				if (Math.random() <= 0.05) {
					if (entity instanceof SharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2SleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TobySleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MarshalSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TigerSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LouisSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BuddySleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ApolloSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AtlasSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CBESleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof PBESleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof Bothan2netSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:bothan_2net_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof FinneganSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ChampSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:champ_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TechnoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:techno_lay_on_side ~ ~ ~");
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
		} else if (world instanceof Level _lvl97 && _lvl97.isDay()) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoSleepCD == true) {
				entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
				if (entity.getPersistentData().getDouble("SharkoLayCD") >= 120) {
					entity.getPersistentData().putDouble("SharkoLayOnSideCD", 0);
					{
						boolean _setval = false;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SharkoSleepCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoSleepCD == false) {
				if (Math.random() <= 0.75) {
					if (entity instanceof SharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2SleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_sharko_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TobySleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MarshalSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TigerSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LouisSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BuddySleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ApolloSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AtlasSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CBESleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_lay_on_side~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof PBESleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof Bothan2netSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:bothan_2net_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof FinneganSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ChampSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:champ_lay_on_side ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TechnoSleepEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoSleepCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoLayOnSideCD = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:techno_lay_on_side ~ ~ ~");
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