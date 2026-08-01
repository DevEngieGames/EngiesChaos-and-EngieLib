package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModGameRules;
import net.engiegames.reallaboutengie.AllaboutengieMod;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class EngieLibNeedProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "EngieLib")).equals("EngieLib")) {
			if ((StringArgumentType.getString(arguments, "Type")).equals("DoomsdaySummon")) {
				if (AllaboutengieModVariables.MapVariables.get(world).Risk == 1) {
					AllaboutengieMod.queueServerWork(20, () -> {
						if (Math.random() <= 0.05) {
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Low. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
								}
							});
						} else if (Math.random() > 0.05) {
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Low. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
								if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
									AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Low. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							}
						}
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 2) {
					AllaboutengieMod.queueServerWork(20, () -> {
						if (Math.random() <= 0.05) {
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Medium. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
								}
							});
						} else if (Math.random() > 0.05) {
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Medium. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
													false);
									}
								});
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
								if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
									AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Medium. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							}
						}
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 3) {
					AllaboutengieMod.queueServerWork(20, () -> {
						if (Math.random() <= 0.05) {
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "High. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
								}
							});
						} else if (Math.random() > 0.05) {
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "High. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
								if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
									AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "High. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							}
						}
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 4) {
					AllaboutengieMod.queueServerWork(20, () -> {
						if (Math.random() <= 0.05) {
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Extreme. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
								}
							});
						} else if (Math.random() > 0.05) {
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Extreme. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
													false);
									}
								});
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
								if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
									AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Extreme. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
									}
								});
							}
						}
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 5) {
					AllaboutengieMod.queueServerWork(20, () -> {
						if (Math.random() <= 0.05) {
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Guaranteed. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
								}
							});
						} else if (Math.random() > 0.05) {
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(
													Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Guaranteed. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
													false);
									}
								});
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
								if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
									AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
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
				AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}