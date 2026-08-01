package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModGameRules;
import net.engiegames.reallaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SelectedGamerulesOverrideThrowbackProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE) == true || world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES_TOGGLE) == true)
				&& world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_THROWBACK_TOGGLE) == true) {
			if (AllaboutengieModVariables.MapVariables.get(world).detectedothermodesenabledthrowback == false) {
				AllaboutengieModVariables.MapVariables.get(world).detectedothermodesenabledthrowback = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Error: Found incompatible gamerules enabled while trueThrowbackToggle = true.\",\"color\":\"dark_red\"}");
					}
				}
				AllaboutengieMod.queueServerWork(20, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"> execute togglethrowbackincompatibilities.json\",\"color\":\"dark_green\"}");
						}
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"executing togglethrowbackincompatibilities.json\",\"color\":\"gray\"}");
							}
						}
						AllaboutengieMod.queueServerWork(10, () -> {
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE) == true && world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES_TOGGLE) == true) {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"toggled allAboutEngieToggle to \\\"false\\\"\",\"color\":\"gray\"}");
									}
								}
								world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE).set(false, world.getServer());
								AllaboutengieMod.queueServerWork(10, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"toggled enragedZombiesToggle to \\\"false\\\"\",\"color\":\"gray\"}");
										}
									}
									world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.ENRAGED_ZOMBIES_TOGGLE).set(false, world.getServer());
									AllaboutengieMod.queueServerWork(1, () -> {
										{
											Entity _ent = entity;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"tellraw @a {\"text\":\"successfully toggled off throwback incompatibilities\",\"color\":\"gray\"}");
											}
										}
										AllaboutengieMod.queueServerWork(20, () -> {
											{
												Entity _ent = entity;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"tellraw @a {\"text\":\"> shutdown\",\"color\":\"dark_green\"}");
												}
											}
											AllaboutengieMod.queueServerWork(1, () -> {
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands()
																.performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																		"tellraw @a {\"text\":\"Error: entered command doesn't exist\",\"color\":\"dark_red\"}");
													}
												}
												AllaboutengieMod.queueServerWork(20, () -> {
													{
														Entity _ent = entity;
														if (!_ent.level.isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																	"tellraw @a {\"text\":\"> execute console.shutdown\",\"color\":\"dark_green\"}");
														}
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														{
															Entity _ent = entity;
															if (!_ent.level.isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																		_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																		"tellraw @a {\"text\":\"Bye Bye There!\",\"color\":\"gray\"}");
															}
														}
														AllaboutengieMod.queueServerWork(1, () -> {
															AllaboutengieModVariables.MapVariables.get(world).detectedothermodesenabledthrowback = false;
															AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														});
													});
												});
											});
										});
									});
								});
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE) == true
									&& world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES_TOGGLE) == false) {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"toggled allAboutEngieToggle to \\\"false\\\"\",\"color\":\"gray\"}");
									}
								}
								world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE).set(false, world.getServer());
								AllaboutengieMod.queueServerWork(10, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"found enragedZombiesToggle = \\\"false\\\"\",\"color\":\"gray\"}");
										}
									}
									AllaboutengieMod.queueServerWork(1, () -> {
										{
											Entity _ent = entity;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"tellraw @a {\"text\":\"successfully toggled off throwback incompatibilities\",\"color\":\"gray\"}");
											}
										}
										AllaboutengieMod.queueServerWork(20, () -> {
											{
												Entity _ent = entity;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"tellraw @a {\"text\":\"> shutdown\",\"color\":\"dark_green\"}");
												}
											}
											AllaboutengieMod.queueServerWork(1, () -> {
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands()
																.performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																		"tellraw @a {\"text\":\"Error: entered command doesn't exist\",\"color\":\"dark_red\"}");
													}
												}
												AllaboutengieMod.queueServerWork(20, () -> {
													{
														Entity _ent = entity;
														if (!_ent.level.isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																	"tellraw @a {\"text\":\"> execute console.shutdown\",\"color\":\"dark_green\"}");
														}
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														{
															Entity _ent = entity;
															if (!_ent.level.isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																		_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																		"tellraw @a {\"text\":\"Bye Bye There!\",\"color\":\"gray\"}");
															}
														}
														AllaboutengieMod.queueServerWork(1, () -> {
															AllaboutengieModVariables.MapVariables.get(world).detectedothermodesenabledthrowback = false;
															AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														});
													});
												});
											});
										});
									});
								});
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE) == false
									&& world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES_TOGGLE) == true) {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"found allAboutEngieToggle = \\\"false\\\"\",\"color\":\"gray\"}");
									}
								}
								AllaboutengieMod.queueServerWork(10, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"toggled enragedZombiesToggle to \\\"false\\\"\",\"color\":\"gray\"}");
										}
									}
									world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.ENRAGED_ZOMBIES_TOGGLE).set(false, world.getServer());
									AllaboutengieMod.queueServerWork(1, () -> {
										{
											Entity _ent = entity;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"tellraw @a {\"text\":\"successfully toggled off throwback incompatibilities\",\"color\":\"gray\"}");
											}
										}
										AllaboutengieMod.queueServerWork(20, () -> {
											{
												Entity _ent = entity;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"tellraw @a {\"text\":\"> shutdown\",\"color\":\"dark_green\"}");
												}
											}
											AllaboutengieMod.queueServerWork(1, () -> {
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands()
																.performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																		"tellraw @a {\"text\":\"Error: entered command doesn't exist\",\"color\":\"dark_red\"}");
													}
												}
												AllaboutengieMod.queueServerWork(20, () -> {
													{
														Entity _ent = entity;
														if (!_ent.level.isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																	"tellraw @a {\"text\":\"> execute console.shutdown\",\"color\":\"dark_green\"}");
														}
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														{
															Entity _ent = entity;
															if (!_ent.level.isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																		_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																		"tellraw @a {\"text\":\"Bye Bye There!\",\"color\":\"gray\"}");
															}
														}
														AllaboutengieMod.queueServerWork(1, () -> {
															AllaboutengieModVariables.MapVariables.get(world).detectedothermodesenabledthrowback = false;
															AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														});
													});
												});
											});
										});
									});
								});
							}
						});
					});
				});
			}
		}
	}
}