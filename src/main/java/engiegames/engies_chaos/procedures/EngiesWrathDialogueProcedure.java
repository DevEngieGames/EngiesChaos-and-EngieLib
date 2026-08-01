package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class EngiesWrathDialogueProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if (!world.isClientSide()) {
				if (EngiesChaosModVariables.MapVariables.get(world).OHBOY == true && EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
					EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimenighttimerblock == false) {
						EngiesChaosModVariables.MapVariables.get(world).TimeUntilNight = EngiesChaosModVariables.MapVariables.get(world).TimeUntilNight + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).TimeUntilNight >= 43) {
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(false, world.getServer());
							if (world instanceof Level _lvl5 && _lvl5.isDay()) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
													.withSuppressedOutput(),
											"time add 100t");
							}
							if (!(world instanceof Level _lvl8 && _lvl8.isDay())) {
								EngiesChaosModVariables.MapVariables.get(world).ewrathtimenighttimerblock = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								for (int index0 = 0; index0 < 5; index0++) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
														.withSuppressedOutput(),
												"time add 100t");
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).ewrathdialoguetimeblock == false) {
						EngiesChaosModVariables.MapVariables.get(world).DialogueCooldownStart = EngiesChaosModVariables.MapVariables.get(world).DialogueCooldownStart + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).DialogueCooldownStart >= 37) {
							EngiesChaosModVariables.MapVariables.get(world).ewrathdialoguetimeblock = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ddayawardadvancement1 = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ShowObjectiveOverlay = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(200, () -> {
								EngiesChaosModVariables.MapVariables.get(world).ShowObjectiveOverlay = false;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							});
							EngiesChaosMod.queueServerWork(100, () -> {
								EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosMod.queueServerWork(120, () -> {
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								});
								EngiesChaosMod.queueServerWork(200, () -> {
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 2;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(120, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
									EngiesChaosMod.queueServerWork(200, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 3;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosMod.queueServerWork(140, () -> {
											EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										});
										EngiesChaosMod.queueServerWork(200, () -> {
											if (world.players().size() == 1) {
												EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 4;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											} else if (world.players().size() >= 2) {
												EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 5;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											}
											EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(120, () -> {
												EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											});
											EngiesChaosMod.queueServerWork(260, () -> {
												EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 10;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
												EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
												EngiesChaosMod.queueServerWork(130, () -> {
													EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
													EngiesChaosModVariables.MapVariables.get(world).syncData(world);
												});
												EngiesChaosMod.queueServerWork(260, () -> {
													EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 11;
													EngiesChaosModVariables.MapVariables.get(world).syncData(world);
													EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
													EngiesChaosModVariables.MapVariables.get(world).syncData(world);
													EngiesChaosMod.queueServerWork(130, () -> {
														EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
														EngiesChaosModVariables.MapVariables.get(world).syncData(world);
													});
													EngiesChaosMod.queueServerWork(260, () -> {
														EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 12;
														EngiesChaosModVariables.MapVariables.get(world).syncData(world);
														EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
														EngiesChaosModVariables.MapVariables.get(world).syncData(world);
														EngiesChaosMod.queueServerWork(130, () -> {
															EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
															EngiesChaosModVariables.MapVariables.get(world).syncData(world);
														});
														EngiesChaosMod.queueServerWork(260, () -> {
															if (world.players().size() == 1) {
																EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 13;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
															} else if (world.players().size() >= 2) {
																EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 14;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
															}
															EngiesChaosMod.queueServerWork(130, () -> {
																EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
															});
															EngiesChaosMod.queueServerWork(260, () -> {
																EngiesChaosMod.queueServerWork(1, () -> {
																	EngiesChaosModVariables.MapVariables.get(world).stopeeriesound = true;
																	EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	EngiesChaosModVariables.MapVariables.get(world).ddaymainsongplay = true;
																	EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																});
																EngiesChaosModVariables.MapVariables.get(world).doomsdaymainsongtimer = 14.5;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).doomsdayaltsongtimer = 191;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 525)) <= 1) {
																	EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes = 52;
																	EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	EngiesChaosMod.queueServerWork(1, () -> {
																		EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = 30;
																		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	});
																	EngiesChaosMod.queueServerWork(2, () -> {
																		EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime = 60 * EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes
																				+ EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds;
																		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	});
																	EngiesChaosMod.queueServerWork(3, () -> {
																		EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer = EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime;
																		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	});
																} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 525)) > 1) {
																	EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes = Math.round(Mth.nextDouble(RandomSource.create(), 7, 30));
																	EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	EngiesChaosMod.queueServerWork(1, () -> {
																		if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes == 30) {
																			EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextDouble(RandomSource.create(), 0, 30));
																			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																		} else if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes == 7) {
																			EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextDouble(RandomSource.create(), 42, 59));
																			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																		} else {
																			EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = Math.round(Mth.nextDouble(RandomSource.create(), 0, 59));
																			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																		}
																	});
																	EngiesChaosMod.queueServerWork(2, () -> {
																		EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime = 60 * EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes
																				+ EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds;
																		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	});
																	EngiesChaosMod.queueServerWork(3, () -> {
																		EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer = EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime;
																		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	});
																}
																EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 5, 6)) + 3;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 5, 6)) + 3;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 5, 6)) + 3;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 5, 6)) + 3;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 5, 6)) + 3;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 0;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = 0;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = 0;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = 0;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = 0;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = true;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
																EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																EngiesChaosMod.queueServerWork(262, () -> {
																	if (world instanceof ServerLevel _level)
																		_level.getServer().getCommands().performPrefixedCommand(
																				new CommandSourceStack(CommandSource.NULL, new Vec3(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0), Vec2.ZERO, _level, 4, "",
																						Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																				("effect give @a minecraft:regeneration " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime) + " 1 true"));
																	EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
																	EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	EngiesChaosModVariables.MapVariables.get(world).engieswrathstart = true;
																	EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	EngiesChaosModVariables.MapVariables.get(world).BYEBYE = true;
																	EngiesChaosModVariables.MapVariables.get(world).syncData(world);
																	if (world instanceof ServerLevel _serverLevel)
																		_serverLevel.getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(true, world.getServer());
																	if (world instanceof ServerLevel _serverLevel)
																		_serverLevel.getGameRules().getRule(GameRules.RULE_DOFIRETICK).set(false, world.getServer());
																	if (world instanceof ServerLevel _serverLevel)
																		_serverLevel.getGameRules().getRule(GameRules.RULE_FIRE_DAMAGE).set(false, world.getServer());
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						}
					}
				}
			}
		}
	}
}