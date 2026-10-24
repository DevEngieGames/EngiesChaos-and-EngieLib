package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class AAEAllCommandsProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (((StringArgumentType.getString(arguments, "MainType")).toLowerCase()).equals("dev")) {
			if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
				if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("summondoomsday") || ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("summondday")
						|| ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("ddaysummon")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned Doomsday! It will occur the next day.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 525;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.LOGGER.debug("THE DEVELOPER SUMMONED DOOMSDAY!!!!!");
				} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("cleanupdoomsday") || ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("doomsdaycleanup")
						|| ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("cleandday") || ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("ddayclean")
						|| ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("cleanupdday") || ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("ddaycleanup")) {
					DoomsdayManualCleanupProcedure.execute(world);
					EngiesChaosMod.LOGGER.debug("THE DEVELOPER CLEANED UP DOOMSDAY!!!!!");
				} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("resetpickaxeonly")) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Successfully reset the Pickaxe Only count!"), true);
					EngiesChaosMod.LOGGER.info((entity.getDisplayName().getString() + " reset the Pickaxe Only count for all players."));
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							double _setval = 0;
							entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.pickaxeonly = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					}
				} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("setlives")) {
					if (!((commandParameterEntity(arguments, "user")) == null)) {
						if (DoubleArgumentType.getDouble(arguments, "number") <= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT))) {
							{
								double _setval = DoubleArgumentType.getDouble(arguments, "number");
								(commandParameterEntity(arguments, "user")).getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.TrueHardcoreLifeCount = _setval;
									capability.syncPlayerVariables((commandParameterEntity(arguments, "user")));
								});
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Successfully set " + commandParameterEntity(arguments, "user") + "'s lives to " + DoubleArgumentType.getDouble(arguments, "number") + ".")), false);
							EngiesChaosMod.LOGGER.debug((entity + " set " + commandParameterEntity(arguments, "user") + "'s lives were set to " + DoubleArgumentType.getDouble(arguments, "number") + "."));
						} else if (DoubleArgumentType.getDouble(arguments, "number") > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT))) {
							{
								double _setval = (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT));
								(commandParameterEntity(arguments, "user")).getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.TrueHardcoreLifeCount = _setval;
									capability.syncPlayerVariables((commandParameterEntity(arguments, "user")));
								});
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7cYou went over the maximum life count so " + commandParameterEntity(arguments, "user") + "'s lives were set to "
										+ (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT)) + "!")), false);
							EngiesChaosMod.LOGGER.debug((entity + " tried setting " + commandParameterEntity(arguments, "user") + "'s lives to " + DoubleArgumentType.getDouble(arguments, "number") + " which was over the limit and were set to "
									+ (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT)) + "."));
						}
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7cYou need an player to use this command on them!"), false);
					}
				} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("forceava")) {
					AvalancheSpawnProcedure.execute(world);
				} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("forcespike")) {
					SpikeSpawnsProcedure.execute(world);
				} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("forcerift")) {
					RiftSpawnsProcedure.execute(world);
				} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("forcemissile")) {
					MissileSpawnProcedure.execute(world);
				} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("resetready")) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerready == true) {
							{
								boolean _setval = false;
								entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.playerready = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
							EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount = EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount - 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					}
				} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("forcealive")) {
					if (!((commandParameterEntity(arguments, "user")) == null)) {
						if (((commandParameterEntity(arguments, "user")).getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == false) {
							{
								boolean _setval = true;
								(commandParameterEntity(arguments, "user")).getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.DoomsdayAlive = _setval;
									capability.syncPlayerVariables((commandParameterEntity(arguments, "user")));
								});
							}
							EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount = EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount + 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount = EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount - 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						} else {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7cThat player is already alive!"), false);
						}
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7cYou need a player to use this command on them!"), false);
					}
				} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("forcedday")) {
					EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 525;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						DoomsdaySummonProcedure.execute(world);
					});
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (((StringArgumentType.getString(arguments, "MainType")).toLowerCase()).equals("admin")) {
			if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("summondoomsday") || ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("summondday")
					|| ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("ddaysummon")) {
				if (entity.hasPermissions(4)) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned Doomsday! It will occur the next day.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = Mth.nextDouble(RandomSource.create(), 50, 100);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.LOGGER.debug((entity + " summoned Doomsday."));
				}
			} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("cleanupdoomsday") || ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("doomsdaycleanup")
					|| ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("cleandday") || ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("ddayclean")
					|| ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("cleanupdday") || ((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("ddaycleanup")) {
				if (entity.hasPermissions(4)) {
					DoomsdayManualCleanupProcedure.execute(world);
					EngiesChaosMod.LOGGER.debug((entity + " ran Doomsday cleanup."));
				}
			} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("resetpickaxeonly")) {
				if (entity.hasPermissions(4)) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Successfully reset the Pickaxe Only count!"), true);
					EngiesChaosMod.LOGGER.info((entity.getDisplayName().getString() + " reset the Pickaxe Only count for all players."));
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							double _setval = 0;
							entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.pickaxeonly = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					}
				}
			} else if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("setlives")) {
				if (!((commandParameterEntity(arguments, "user")) == null)) {
					if (DoubleArgumentType.getDouble(arguments, "number") <= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT))) {
						{
							double _setval = DoubleArgumentType.getDouble(arguments, "number");
							(commandParameterEntity(arguments, "user")).getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TrueHardcoreLifeCount = _setval;
								capability.syncPlayerVariables((commandParameterEntity(arguments, "user")));
							});
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("Successfully set " + commandParameterEntity(arguments, "user") + "'s lives to " + DoubleArgumentType.getDouble(arguments, "number") + ".")), false);
						EngiesChaosMod.LOGGER.debug((entity + " set " + commandParameterEntity(arguments, "user") + "'s lives were set to " + DoubleArgumentType.getDouble(arguments, "number") + "."));
					} else if (DoubleArgumentType.getDouble(arguments, "number") > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT))) {
						{
							double _setval = (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT));
							(commandParameterEntity(arguments, "user")).getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TrueHardcoreLifeCount = _setval;
								capability.syncPlayerVariables((commandParameterEntity(arguments, "user")));
							});
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7cYou went over the maximum life count so " + commandParameterEntity(arguments, "user") + "'s lives were set to "
									+ (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT)) + "!")), false);
						EngiesChaosMod.LOGGER.debug((entity + " tried setting " + commandParameterEntity(arguments, "user") + "'s lives to " + DoubleArgumentType.getDouble(arguments, "number") + " which was over the limit and were set to "
								+ (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT)) + "."));
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cYou need a player to use this command on them!"), false);
				}
			}
		} else if (((StringArgumentType.getString(arguments, "MainType")).toLowerCase()).equals("getddayrisk") || ((StringArgumentType.getString(arguments, "MainType")).toLowerCase()).equals("getrisk")) {
			RiskCheckProcedure.execute(world, entity);
		} else if (((StringArgumentType.getString(arguments, "MainType")).toLowerCase()).equals("mod")) {
			if (((StringArgumentType.getString(arguments, "AltType")).toLowerCase()).equals("setlives")) {
				if (!((commandParameterEntity(arguments, "user")) == null)) {
					if (DoubleArgumentType.getDouble(arguments, "number") <= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT))) {
						{
							double _setval = DoubleArgumentType.getDouble(arguments, "number");
							(commandParameterEntity(arguments, "user")).getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TrueHardcoreLifeCount = _setval;
								capability.syncPlayerVariables((commandParameterEntity(arguments, "user")));
							});
						}
					} else if (DoubleArgumentType.getDouble(arguments, "number") > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT))) {
						{
							double _setval = (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT));
							(commandParameterEntity(arguments, "user")).getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TrueHardcoreLifeCount = _setval;
								capability.syncPlayerVariables((commandParameterEntity(arguments, "user")));
							});
						}
					}
				} else {
					EngiesChaosMod.LOGGER.warn("NO USER FOUND!!!");
				}
			}
		}
	}

	private static Entity commandParameterEntity(CommandContext<CommandSourceStack> arguments, String parameter) {
		try {
			return EntityArgument.getEntity(arguments, parameter);
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}
}