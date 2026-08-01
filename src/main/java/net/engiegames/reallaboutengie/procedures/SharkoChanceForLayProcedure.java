package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.entity.TonySleepEntity;
import net.engiegames.reallaboutengie.entity.TobySitEntity;
import net.engiegames.reallaboutengie.entity.TigerSitEntity;
import net.engiegames.reallaboutengie.entity.TechnoSitEntity;
import net.engiegames.reallaboutengie.entity.SharkoSitEntity;
import net.engiegames.reallaboutengie.entity.RockySleepEntity;
import net.engiegames.reallaboutengie.entity.RareSharkoSitEntity;
import net.engiegames.reallaboutengie.entity.MythicSharkoSitEntity;
import net.engiegames.reallaboutengie.entity.MarshalSitEntity;
import net.engiegames.reallaboutengie.entity.LouisSitEntity;
import net.engiegames.reallaboutengie.entity.LegendarySharkoSitEntity;
import net.engiegames.reallaboutengie.entity.FinneganSitEntity;
import net.engiegames.reallaboutengie.entity.ExoticSharkoSitEntity;
import net.engiegames.reallaboutengie.entity.EpicSharkoSitEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoSitEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareSitEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRare2SitEntity;
import net.engiegames.reallaboutengie.entity.ChampSitEntity;
import net.engiegames.reallaboutengie.entity.BuddySitEntity;
import net.engiegames.reallaboutengie.entity.Bothan2netSitEntity;
import net.engiegames.reallaboutengie.entity.AtlasSitEntity;
import net.engiegames.reallaboutengie.entity.ApolloSitEntity;
import net.engiegames.reallaboutengie.entity.AlbinoSharkoSitEntity;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class SharkoChanceForLayProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoSitCD == true) {
			entity.getPersistentData().putDouble("SharkoSitCD", (entity.getPersistentData().getDouble("SharkoSitCD") + 0.05));
			if (entity.getPersistentData().getDouble("SharkoSitCD") >= 120) {
				entity.getPersistentData().putDouble("SharkoSitCD", 0);
				{
					boolean _setval = false;
					entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SharkoSitCD = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoSitCD == false) {
			if (Math.random() <= 0.25) {
				if (entity instanceof SharkoSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AlbinoSharkoSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RareSharkoSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EpicSharkoSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LegendarySharkoSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MythicSharkoSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ExoticSharkoSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRareSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRare2SitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TobySitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MarshalSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TigerSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LouisSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BuddySitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ApolloSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AtlasSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof Bothan2netSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:bothan_2net_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof FinneganSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ChampSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:champ_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RockySleepEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rocky_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TonySleepEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tony_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TechnoSitEntity) {
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
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:techno_lay ~ ~ ~");
							}
						}
					});
				}
			} else {
				{
					boolean _setval = true;
					entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SharkoSitCD = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}