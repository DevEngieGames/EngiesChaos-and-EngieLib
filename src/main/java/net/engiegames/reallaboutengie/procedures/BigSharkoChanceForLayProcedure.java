package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.entity.CosmoSleepEntity;
import net.engiegames.reallaboutengie.entity.ConstellationSleepEntity;
import net.engiegames.reallaboutengie.entity.BigSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.BigRareSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.BigMythicSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.BigLegendarySharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.BigExoticSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.BigEpicSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoSleepEntity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoRareSleepEntity;
import net.engiegames.reallaboutengie.entity.BigEngieSharkoRare2SleepEntity;
import net.engiegames.reallaboutengie.entity.BigAlbinoSharkoSleepEntity;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class BigSharkoChanceForLayProcedure {
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
				if (Math.random() <= 0.0005) {
					if (entity instanceof BigSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigAlbinoSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_albino_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigRareSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEpicSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigLegendarySharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_legendary_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigMythicSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_mythic_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigExoticSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_exotic_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRareSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRare2SleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_tiger_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CosmoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ConstellationSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:constellation_lay ~ ~ ~");
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
		} else if (world instanceof Level _lvl52 && _lvl52.isDay()) {
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
					if (entity instanceof BigSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigAlbinoSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_albino_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigRareSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEpicSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigLegendarySharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_legendary_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigMythicSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_mythic_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigExoticSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_exotic_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRareSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRare2SleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_2_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CosmoSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ConstellationSleepEntity) {
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
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:constellation_lay ~ ~ ~");
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