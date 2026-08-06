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
		if ((StringArgumentType.getString(arguments, "MainType")).equals("Doomsday") || (StringArgumentType.getString(arguments, "MainType")).equals("doomsday")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Summon") || (StringArgumentType.getString(arguments, "AltType")).equals("summon")) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
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
					EngiesChaosMod.LOGGER.debug("THE DEVELOPER SUMMONED DOOMSDAY!!!!!");
				} else if (world.players().size() == 1) {
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
				} else if (world.players().size() > 1) {
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
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("GetRisk") || (StringArgumentType.getString(arguments, "AltType")).equals("getrisk")) {
				RiskCheckProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("CleanUp") || (StringArgumentType.getString(arguments, "AltType")).equals("cleanup")) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
					DoomsdayManualCleanupProcedure.execute(world);
					EngiesChaosMod.LOGGER.debug("THE DEVELOPER CLEANED UP DOOMSDAY!!!!!");
				} else if (world.players().size() == 1) {
					if (entity.hasPermissions(4)) {
						DoomsdayManualCleanupProcedure.execute(world);
						EngiesChaosMod.LOGGER.debug((entity + " ran Doomsday cleanup."));
					}
				} else if (world.players().size() > 1) {
					if (entity.hasPermissions(4)) {
						DoomsdayManualCleanupProcedure.execute(world);
						EngiesChaosMod.LOGGER.debug((entity + " ran Doomsday cleanup."));
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
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("TraderCount") || (StringArgumentType.getString(arguments, "MainType")).equals("tradercount")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Reset") || (StringArgumentType.getString(arguments, "AltType")).equals("reset")) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
					EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).numberoftheend = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
					for (int index0 = 0; index0 < 10; index0++) {
						EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = 10;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberoftheend = 10;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = 10;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = 10;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(1, () -> {
							EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberoftheend = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					}
					EngiesChaosMod.LOGGER.debug("THE DEVELOPER RESET THE TRADER COUNT!!!!!");
				} else if (world.players().size() == 1) {
					if (entity.hasPermissions(4)) {
						EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberoftheend = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
						for (int index1 = 0; index1 < 10; index1++) {
							EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberoftheend = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberoftheend = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							});
						}
						EngiesChaosMod.LOGGER.debug((entity + " reset the trader count."));
					}
				} else if (world.players().size() > 1) {
					if (entity.hasPermissions(4)) {
						EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberoftheend = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
						for (int index2 = 0; index2 < 10; index2++) {
							EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberoftheend = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberoftheend = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							});
						}
						EngiesChaosMod.LOGGER.debug((entity + " reset the trader count"));
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
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Lives") || (StringArgumentType.getString(arguments, "MainType")).equals("lives")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Set") || (StringArgumentType.getString(arguments, "AltType")).equals("set")) {
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
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Set2") || (StringArgumentType.getString(arguments, "AltType")).equals("set2")) {
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
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cYou forgot some context here silly."), false);
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