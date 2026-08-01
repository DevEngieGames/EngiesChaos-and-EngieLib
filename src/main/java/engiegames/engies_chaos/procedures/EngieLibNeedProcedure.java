package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class EngieLibNeedProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "EngieLib")).equals("EngieLib")) {
			if ((StringArgumentType.getString(arguments, "Type")).equals("DoomsdaySummon")) {
				if (EngiesChaosModVariables.MapVariables.get(world).Risk == 1) {
					EngiesChaosMod.queueServerWork(20, () -> {
						if (Math.random() <= 0.05) {
							EngiesChaosModVariables.MapVariables.get(world).TheEndStart = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Low. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
								}
							});
						} else if (Math.random() > 0.05) {
							if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == true) {
								if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
									EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Low. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == false) {
								if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
									EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Low. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							}
						}
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).Risk == 2) {
					EngiesChaosMod.queueServerWork(20, () -> {
						if (Math.random() <= 0.05) {
							EngiesChaosModVariables.MapVariables.get(world).TheEndStart = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Medium. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
								}
							});
						} else if (Math.random() > 0.05) {
							if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == true) {
								if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
									EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Medium. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
													false);
									}
								});
							} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == false) {
								if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
									EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Medium. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							}
						}
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).Risk == 3) {
					EngiesChaosMod.queueServerWork(20, () -> {
						if (Math.random() <= 0.05) {
							EngiesChaosModVariables.MapVariables.get(world).TheEndStart = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "High. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
								}
							});
						} else if (Math.random() > 0.05) {
							if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == true) {
								if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
									EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "High. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == false) {
								if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
									EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "High. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							}
						}
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).Risk == 4) {
					EngiesChaosMod.queueServerWork(20, () -> {
						if (Math.random() <= 0.05) {
							EngiesChaosModVariables.MapVariables.get(world).TheEndStart = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Extreme. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
								}
							});
						} else if (Math.random() > 0.05) {
							if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == true) {
								if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
									EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Extreme. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
													false);
									}
								});
							} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == false) {
								if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
									EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Extreme. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							}
						}
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).Risk == 5) {
					EngiesChaosMod.queueServerWork(20, () -> {
						if (Math.random() <= 0.05) {
							EngiesChaosModVariables.MapVariables.get(world).TheEndStart = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Guaranteed. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
								}
							});
						} else if (Math.random() > 0.05) {
							if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == true) {
								if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
									EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Guaranteed. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
													false);
									}
								});
							} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == false) {
								if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
									EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
									EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Guaranteed. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							}
						}
					});
				}
			} else if ((StringArgumentType.getString(arguments, "Type")).equals("StartChallenge")) {
				ChallengeDialogueProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "Type")).equals("StartEndgameLoot")) {
				EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}