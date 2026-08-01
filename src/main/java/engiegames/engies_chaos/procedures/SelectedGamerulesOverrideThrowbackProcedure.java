package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class SelectedGamerulesOverrideThrowbackProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE)) == true
				|| (world instanceof ServerLevel _serverLevelGR1 && _serverLevelGR1.getGameRules().getBoolean(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE)) == true)
				&& (world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_THROWBACK_TOGGLE)) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).detectedothermodesenabledthrowback == false) {
				EngiesChaosModVariables.MapVariables.get(world).detectedothermodesenabledthrowback = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @a {\"text\":\"Error: Found incompatible gamerules enabled while trueThrowbackToggle = true.\",\"color\":\"dark_red\"}");
					}
				}
				EngiesChaosMod.queueServerWork(20, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @a {\"text\":\"> execute togglethrowbackincompatibilities.json\",\"color\":\"dark_green\"}");
						}
					}
					EngiesChaosMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @a {\"text\":\"executing togglethrowbackincompatibilities.json\",\"color\":\"gray\"}");
							}
						}
						EngiesChaosMod.queueServerWork(10, () -> {
							if ((world instanceof ServerLevel _serverLevelGR6 && _serverLevelGR6.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE)) == true
									&& (world instanceof ServerLevel _serverLevelGR7 && _serverLevelGR7.getGameRules().getBoolean(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE)) == true) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"tellraw @a {\"text\":\"toggled engiesChaosToggle to \\\"false\\\"\",\"color\":\"gray\"}");
									}
								}
								if (world instanceof ServerLevel _serverLevel)
									_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE).set(false, world.getServer());
								EngiesChaosMod.queueServerWork(10, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													"tellraw @a {\"text\":\"toggled enragedZombiesToggle to \\\"false\\\"\",\"color\":\"gray\"}");
										}
									}
									if (world instanceof ServerLevel _serverLevel)
										_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE).set(false, world.getServer());
									EngiesChaosMod.queueServerWork(1, () -> {
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands()
														.performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																		_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"tellraw @a {\"text\":\"successfully toggled off throwback incompatibilities\",\"color\":\"gray\"}");
											}
										}
										EngiesChaosMod.queueServerWork(20, () -> {
											{
												Entity _ent = entity;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"tellraw @a {\"text\":\"> shutdown\",\"color\":\"dark_green\"}");
												}
											}
											EngiesChaosMod.queueServerWork(1, () -> {
												{
													Entity _ent = entity;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands()
																.performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																		"tellraw @a {\"text\":\"Error: entered command doesn't exist\",\"color\":\"dark_red\"}");
													}
												}
												EngiesChaosMod.queueServerWork(20, () -> {
													{
														Entity _ent = entity;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"tellraw @a {\"text\":\"> execute console.shutdown\",\"color\":\"dark_green\"}");
														}
													}
													EngiesChaosMod.queueServerWork(1, () -> {
														{
															Entity _ent = entity;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands()
																		.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																				_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"tellraw @a {\"text\":\"Bye Bye There!\",\"color\":\"gray\"}");
															}
														}
														EngiesChaosMod.queueServerWork(1, () -> {
															EngiesChaosModVariables.MapVariables.get(world).detectedothermodesenabledthrowback = false;
															EngiesChaosModVariables.MapVariables.get(world).syncData(world);
														});
													});
												});
											});
										});
									});
								});
							} else if ((world instanceof ServerLevel _serverLevelGR24 && _serverLevelGR24.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE)) == true
									&& (world instanceof ServerLevel _serverLevelGR25 && _serverLevelGR25.getGameRules().getBoolean(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE)) == false) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"tellraw @a {\"text\":\"toggled engiesChaosToggle to \\\"false\\\"\",\"color\":\"gray\"}");
									}
								}
								if (world instanceof ServerLevel _serverLevel)
									_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE).set(false, world.getServer());
								EngiesChaosMod.queueServerWork(10, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													"tellraw @a {\"text\":\"found enragedZombiesToggle = \\\"false\\\"\",\"color\":\"gray\"}");
										}
									}
									EngiesChaosMod.queueServerWork(1, () -> {
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands()
														.performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																		_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"tellraw @a {\"text\":\"successfully toggled off throwback incompatibilities\",\"color\":\"gray\"}");
											}
										}
										EngiesChaosMod.queueServerWork(20, () -> {
											{
												Entity _ent = entity;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"tellraw @a {\"text\":\"> shutdown\",\"color\":\"dark_green\"}");
												}
											}
											EngiesChaosMod.queueServerWork(1, () -> {
												{
													Entity _ent = entity;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands()
																.performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																		"tellraw @a {\"text\":\"Error: entered command doesn't exist\",\"color\":\"dark_red\"}");
													}
												}
												EngiesChaosMod.queueServerWork(20, () -> {
													{
														Entity _ent = entity;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"tellraw @a {\"text\":\"> execute console.shutdown\",\"color\":\"dark_green\"}");
														}
													}
													EngiesChaosMod.queueServerWork(1, () -> {
														{
															Entity _ent = entity;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands()
																		.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																				_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"tellraw @a {\"text\":\"Bye Bye There!\",\"color\":\"gray\"}");
															}
														}
														EngiesChaosMod.queueServerWork(1, () -> {
															EngiesChaosModVariables.MapVariables.get(world).detectedothermodesenabledthrowback = false;
															EngiesChaosModVariables.MapVariables.get(world).syncData(world);
														});
													});
												});
											});
										});
									});
								});
							} else if ((world instanceof ServerLevel _serverLevelGR41 && _serverLevelGR41.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE)) == false
									&& (world instanceof ServerLevel _serverLevelGR42 && _serverLevelGR42.getGameRules().getBoolean(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE)) == true) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"tellraw @a {\"text\":\"found engiesChaosToggle = \\\"false\\\"\",\"color\":\"gray\"}");
									}
								}
								EngiesChaosMod.queueServerWork(10, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													"tellraw @a {\"text\":\"toggled enragedZombiesToggle to \\\"false\\\"\",\"color\":\"gray\"}");
										}
									}
									if (world instanceof ServerLevel _serverLevel)
										_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE).set(false, world.getServer());
									EngiesChaosMod.queueServerWork(1, () -> {
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands()
														.performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																		_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"tellraw @a {\"text\":\"successfully toggled off throwback incompatibilities\",\"color\":\"gray\"}");
											}
										}
										EngiesChaosMod.queueServerWork(20, () -> {
											{
												Entity _ent = entity;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"tellraw @a {\"text\":\"> shutdown\",\"color\":\"dark_green\"}");
												}
											}
											EngiesChaosMod.queueServerWork(1, () -> {
												{
													Entity _ent = entity;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands()
																.performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																		"tellraw @a {\"text\":\"Error: entered command doesn't exist\",\"color\":\"dark_red\"}");
													}
												}
												EngiesChaosMod.queueServerWork(20, () -> {
													{
														Entity _ent = entity;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"tellraw @a {\"text\":\"> execute console.shutdown\",\"color\":\"dark_green\"}");
														}
													}
													EngiesChaosMod.queueServerWork(1, () -> {
														{
															Entity _ent = entity;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands()
																		.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																				_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"tellraw @a {\"text\":\"Bye Bye There!\",\"color\":\"gray\"}");
															}
														}
														EngiesChaosMod.queueServerWork(1, () -> {
															EngiesChaosModVariables.MapVariables.get(world).detectedothermodesenabledthrowback = false;
															EngiesChaosModVariables.MapVariables.get(world).syncData(world);
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