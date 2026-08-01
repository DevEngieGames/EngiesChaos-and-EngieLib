package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

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
					if (EngiesChaosModVariables.MapVariables.get(world).OHBOY == true) {
						DoomsdayManualCleanupProcedure.execute(world);
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a");
							}
						}
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 6.25;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == true) {
							if (world instanceof ServerLevel _level)
								_level.setDayTime((int) EngiesChaosModVariables.MapVariables.get(world).timebeforespecial);
							EngiesChaosMod.queueServerWork(5, () -> {
								EngiesChaosModVariables.MapVariables.get(world).timecheckstop = false;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							});
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = Mth.nextDouble(RandomSource.create(), 75, 100);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (world.players().size() == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).OHBOY == true) {
						DoomsdayManualCleanupProcedure.execute(world);
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a");
							}
						}
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 6.25;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == true) {
							if (world instanceof ServerLevel _level)
								_level.setDayTime((int) EngiesChaosModVariables.MapVariables.get(world).timebeforespecial);
							EngiesChaosMod.queueServerWork(5, () -> {
								EngiesChaosModVariables.MapVariables.get(world).timecheckstop = false;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							});
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = Mth.nextDouble(RandomSource.create(), 75, 100);
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (world.players().size() > 1) {
					if (entity instanceof Player _playerCmd17 && _playerCmd17.hasPermissions(4)) {
						if (EngiesChaosModVariables.MapVariables.get(world).OHBOY == true) {
							DoomsdayManualCleanupProcedure.execute(world);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a");
								}
							}
							EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 6.25;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) EngiesChaosModVariables.MapVariables.get(world).timebeforespecial);
								EngiesChaosMod.queueServerWork(5, () -> {
									EngiesChaosModVariables.MapVariables.get(world).timecheckstop = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = Mth.nextDouble(RandomSource.create(), 75, 100);
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("CleanUp") || (StringArgumentType.getString(arguments, "AltType")).equals("cleanup")) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
					EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (world.players().size() == 1) {
					EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (world.players().size() > 1) {
					EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("GetRisk") || (StringArgumentType.getString(arguments, "AltType")).equals("getrisk")) {
				RiskCheckProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ToggleAll") || (StringArgumentType.getString(arguments, "AltType")).equals("toggleall")) {
				if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart || EngiesChaosModVariables.MapVariables.get(world).TheEndStart
						|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart) {
					if ((world instanceof ServerLevel _serverLevelGR34 && _serverLevelGR34.getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE)) == true) {
						if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).healthreductiondday == false) {
							{
								EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
								_vars.healthreductiondday = true;
								_vars.syncPlayerVariables(entity);
							}
						} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).healthreductiondday == true) {
							{
								EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
								_vars.healthreductiondday = false;
								_vars.syncPlayerVariables(entity);
							}
						}
					}
					if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == false) {
						{
							EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
							_vars.DoomsdayAlive = true;
							_vars.syncPlayerVariables(entity);
						}
					} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
						{
							EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
							_vars.DoomsdayAlive = false;
							_vars.syncPlayerVariables(entity);
						}
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("ResetPickaxeOnly") || (StringArgumentType.getString(arguments, "MainType")).equals("resetpickaxeonly")) {
			if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
				EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount = 0;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Successfully reset pickaxe only counts."), false);
				for (int index0 = 0; index0 < 10; index0++) {
					EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd40 && _playerCmd40.hasPermissions(4)) {
					EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Successfully reset pickaxe only counts."), false);
					for (int index1 = 0; index1 < 10; index1++) {
						EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd43 && _playerCmd43.hasPermissions(4)) {
					EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Successfully reset pickaxe only counts."), false);
					for (int index2 = 0; index2 < 10; index2++) {
						EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("ResetTraderCount") || (StringArgumentType.getString(arguments, "MainType")).equals("resettradercount")) {
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
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
				for (int index3 = 0; index3 < 10; index3++) {
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
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd52 && _playerCmd52.hasPermissions(4)) {
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
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
					for (int index4 = 0; index4 < 10; index4++) {
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
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd56 && _playerCmd56.hasPermissions(4)) {
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
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
					for (int index5 = 0; index5 < 10; index5++) {
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
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("DevMode") || (StringArgumentType.getString(arguments, "MainType")).equals("devmode")) {
			if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true || entity.getPersistentData().getBoolean("EngiesChaos_BetaTester") == true || entity.getPersistentData().getBoolean("EngiesChaos_Tester") == true) {
				if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).playerdebugmode == true) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.playerdebugmode = false;
						_vars.syncPlayerVariables(entity);
					}
				} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).playerdebugmode == false) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.playerdebugmode = true;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Modifier") || (StringArgumentType.getString(arguments, "MainType")).equals("modifier")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("SuperDoomsday") || (StringArgumentType.getString(arguments, "AltType")).equals("superdoomsday")) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
					if ((world instanceof ServerLevel _serverLevelGR71 && _serverLevelGR71.getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR74 && _serverLevelGR74.getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity instanceof Player _playerCmd78 && _playerCmd78.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR79 && _serverLevelGR79.getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR82 && _serverLevelGR82.getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity instanceof Player _playerCmd86 && _playerCmd86.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR87 && _serverLevelGR87.getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR90 && _serverLevelGR90.getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ExtremeDoomsdayLightning") || (StringArgumentType.getString(arguments, "AltType")).equals("extremedoomsdaylightning")) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
					if ((world instanceof ServerLevel _serverLevelGR97 && _serverLevelGR97.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR100 && _serverLevelGR100.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity instanceof Player _playerCmd104 && _playerCmd104.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR105 && _serverLevelGR105.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR108 && _serverLevelGR108.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity instanceof Player _playerCmd112 && _playerCmd112.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR113 && _serverLevelGR113.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR116 && _serverLevelGR116.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("HeavyLightning") || (StringArgumentType.getString(arguments, "AltType")).equals("heavylightning")) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
					if ((world instanceof ServerLevel _serverLevelGR123 && _serverLevelGR123.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR126 && _serverLevelGR126.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity instanceof Player _playerCmd130 && _playerCmd130.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR131 && _serverLevelGR131.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR134 && _serverLevelGR134.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity instanceof Player _playerCmd138 && _playerCmd138.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR139 && _serverLevelGR139.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR142 && _serverLevelGR142.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ExtremeLightning") || (StringArgumentType.getString(arguments, "AltType")).equals("extremelightning")) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
					if ((world instanceof ServerLevel _serverLevelGR149 && _serverLevelGR149.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR152 && _serverLevelGR152.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity instanceof Player _playerCmd156 && _playerCmd156.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR157 && _serverLevelGR157.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR160 && _serverLevelGR160.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity instanceof Player _playerCmd164 && _playerCmd164.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR165 && _serverLevelGR165.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR168 && _serverLevelGR168.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Lives") || (StringArgumentType.getString(arguments, "MainType")).equals("lives")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Set") || (StringArgumentType.getString(arguments, "AltType")).equals("set")) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
					if (!((commandParameterEntity(arguments, "entity")) == null)) {
						if ((commandParameterEntity(arguments, "entity")) instanceof Player) {
							if (DoubleArgumentType.getDouble(arguments, "lives") > (world instanceof ServerLevel _serverLevelGR182 ? _serverLevelGR182.getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT) : 0)) {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("\u00A7cYour number was over the max life count so it was set to the maximum from the gamerule!"), false);
								{
									EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
									_vars.TrueHardcoreLifeCount = (world instanceof ServerLevel _serverLevelGR184 ? _serverLevelGR184.getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT) : 0);
									_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
								}
							} else {
								{
									EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
									_vars.TrueHardcoreLifeCount = DoubleArgumentType.getDouble(arguments, "lives");
									_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
								}
							}
							if (getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.SPECTATOR) {
								if ((commandParameterEntity(arguments, "entity")) instanceof ServerPlayer _player)
									_player.setGameMode(GameType.SURVIVAL);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7cYou need a player to set the life count to!"), false);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7cYou need a player to set the life count to!"), false);
					}
				} else if (world.players().size() == 1) {
					if (entity instanceof Player _playerCmd195 && _playerCmd195.hasPermissions(4)) {
						if (!((commandParameterEntity(arguments, "entity")) == null)) {
							if ((commandParameterEntity(arguments, "entity")) instanceof Player) {
								if (DoubleArgumentType.getDouble(arguments, "lives") > (world instanceof ServerLevel _serverLevelGR201 ? _serverLevelGR201.getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT) : 0)) {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("\u00A7cYour number was over the max life count so it was set to the maximum from the gamerule!"), false);
									{
										EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
										_vars.TrueHardcoreLifeCount = (world instanceof ServerLevel _serverLevelGR203 ? _serverLevelGR203.getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT) : 0);
										_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
									}
								} else {
									{
										EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
										_vars.TrueHardcoreLifeCount = DoubleArgumentType.getDouble(arguments, "lives");
										_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
									}
								}
								if (getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.SPECTATOR) {
									if ((commandParameterEntity(arguments, "entity")) instanceof ServerPlayer _player)
										_player.setGameMode(GameType.SURVIVAL);
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("\u00A7cYou need a player to set the life count to!"), false);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7cYou need a player to set the life count to!"), false);
						}
					}
				} else if (world.players().size() > 1) {
					if (entity instanceof Player _playerCmd214 && _playerCmd214.hasPermissions(4)) {
						if (!((commandParameterEntity(arguments, "entity")) == null)) {
							if ((commandParameterEntity(arguments, "entity")) instanceof Player) {
								if (DoubleArgumentType.getDouble(arguments, "lives") > (world instanceof ServerLevel _serverLevelGR220 ? _serverLevelGR220.getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT) : 0)) {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("\u00A7cYour number was over the max life count so it was set to the maximum from the gamerule!"), false);
									{
										EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
										_vars.TrueHardcoreLifeCount = (world instanceof ServerLevel _serverLevelGR222 ? _serverLevelGR222.getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT) : 0);
										_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
									}
								} else {
									{
										EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
										_vars.TrueHardcoreLifeCount = DoubleArgumentType.getDouble(arguments, "lives");
										_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
									}
								}
								if (getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.SPECTATOR) {
									if ((commandParameterEntity(arguments, "entity")) instanceof ServerPlayer _player)
										_player.setGameMode(GameType.SURVIVAL);
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("\u00A7cYou need a player to set the life count to!"), false);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7cYou need a player to set the life count to!"), false);
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Set2") || (StringArgumentType.getString(arguments, "AltType")).equals("set2")) {
				if (!((commandParameterEntity(arguments, "entity")) == null)) {
					if ((commandParameterEntity(arguments, "entity")) instanceof Player) {
						if (DoubleArgumentType.getDouble(arguments, "lives") > (world instanceof ServerLevel _serverLevelGR240 ? _serverLevelGR240.getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT) : 0)) {
							{
								EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
								_vars.TrueHardcoreLifeCount = (world instanceof ServerLevel _serverLevelGR241 ? _serverLevelGR241.getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT) : 0);
								_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
							}
						} else {
							{
								EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
								_vars.TrueHardcoreLifeCount = DoubleArgumentType.getDouble(arguments, "lives");
								_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
							}
						}
						if (getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.SPECTATOR) {
							if ((commandParameterEntity(arguments, "entity")) instanceof ServerPlayer _player)
								_player.setGameMode(GameType.SURVIVAL);
						}
					}
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

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}