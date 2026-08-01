package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import javax.annotation.Nullable;

@EventBusSubscriber
public class Congrats2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:mad_engie_plush_obtained"))).isDone()) {
			if (entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:iron_mad_engie_plush_obtained"))).isDone()) {
				if (entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
						&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:gold_mad_engie_plush_obtained"))).isDone()) {
					if (entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
							&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:diamond_mad_engie_plush_obtained"))).isDone()) {
						if (entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel
								&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:netherite_mad_engie_plush_obtained"))).isDone()) {
							if (entity instanceof ServerPlayer _plr5 && _plr5.level() instanceof ServerLevel
									&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:angry_engie_plush_obtained"))).isDone()) {
								if (entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel
										&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:iron_angry_engie_plush_obtained"))).isDone()) {
									if (entity instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel
											&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:gold_angry_engie_plush_obtained"))).isDone()) {
										if (entity instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel
												&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:diamond_angry_engie_plush_obtained"))).isDone()) {
											if (entity instanceof ServerPlayer _plr9 && _plr9.level() instanceof ServerLevel
													&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:netherite_angry_engie_plush_obtained"))).isDone()) {
												if (entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel
														&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:enraged_engie_plush_obtained"))).isDone()) {
													if (entity instanceof ServerPlayer _plr11 && _plr11.level() instanceof ServerLevel
															&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:iron_enraged_engie_plush_obtained"))).isDone()) {
														if (entity instanceof ServerPlayer _plr12 && _plr12.level() instanceof ServerLevel
																&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:gold_enraged_engie_plush_obtained"))).isDone()) {
															if (entity instanceof ServerPlayer _plr13 && _plr13.level() instanceof ServerLevel
																	&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:diamond_enraged_engie_plush_obtained"))).isDone()) {
																if (entity instanceof ServerPlayer _plr14 && _plr14.level() instanceof ServerLevel
																		&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:netherite_enraged_engie_plush_obtained"))).isDone()) {
																	if (entity instanceof ServerPlayer _plr15 && _plr15.level() instanceof ServerLevel
																			&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:outraged_engie_plush_obtained"))).isDone()) {
																		if (entity instanceof ServerPlayer _plr16 && _plr16.level() instanceof ServerLevel
																				&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:iron_outraged_engie_plush_obtained"))).isDone()) {
																			if (entity instanceof ServerPlayer _plr17 && _plr17.level() instanceof ServerLevel && _plr17.getAdvancements()
																					.getOrStartProgress(_plr17.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:gold_outraged_engie_plush_obtained"))).isDone()) {
																				if (entity instanceof ServerPlayer _plr18 && _plr18.level() instanceof ServerLevel && _plr18.getAdvancements()
																						.getOrStartProgress(_plr18.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:diamond_outraged_engie_plush_obtained"))).isDone()) {
																					if (entity instanceof ServerPlayer _plr19 && _plr19.level() instanceof ServerLevel && _plr19.getAdvancements()
																							.getOrStartProgress(_plr19.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:netherite_outraged_engie_plush_obtained"))).isDone()) {
																						if (entity instanceof ServerPlayer _plr20 && _plr20.level() instanceof ServerLevel && _plr20.getAdvancements()
																								.getOrStartProgress(_plr20.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone()) {
																							if (entity instanceof ServerPlayer _plr21 && _plr21.level() instanceof ServerLevel
																									&& _plr21.getAdvancements()
																											.getOrStartProgress(_plr21.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:iron_biblically_accurate_engie_plush_obtained")))
																											.isDone()) {
																								if (entity instanceof ServerPlayer _plr22 && _plr22.level() instanceof ServerLevel
																										&& _plr22.getAdvancements()
																												.getOrStartProgress(
																														_plr22.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:gold_biblically_accurate_engie_plush_obtained")))
																												.isDone()) {
																									if (entity instanceof ServerPlayer _plr23 && _plr23.level() instanceof ServerLevel
																											&& _plr23.getAdvancements()
																													.getOrStartProgress(
																															_plr23.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:diamond_biblically_accurate_engie_plush_obtained")))
																													.isDone()) {
																										if (entity instanceof ServerPlayer _plr24 && _plr24.level() instanceof ServerLevel
																												&& _plr24.getAdvancements().getOrStartProgress(
																														_plr24.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:netherite_biblically_accurate_engie_plush_obtained")))
																														.isDone()) {
																											if (entity instanceof ServerPlayer _plr25 && _plr25.level() instanceof ServerLevel
																													&& _plr25.getAdvancements()
																															.getOrStartProgress(
																																	_plr25.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:monstrosity_engie_plush_obtained")))
																															.isDone()) {
																												if (entity instanceof ServerPlayer _plr26 && _plr26.level() instanceof ServerLevel
																														&& _plr26.getAdvancements()
																																.getOrStartProgress(
																																		_plr26.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:iron_monstrosity_engie_plush_obtained")))
																																.isDone()) {
																													if (entity instanceof ServerPlayer _plr27 && _plr27.level() instanceof ServerLevel
																															&& _plr27.getAdvancements().getOrStartProgress(
																																	_plr27.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:gold_monstrosity_engie_plush_obtained")))
																																	.isDone()) {
																														if (entity instanceof ServerPlayer _plr28 && _plr28.level() instanceof ServerLevel && _plr28.getAdvancements().getOrStartProgress(
																																_plr28.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:diamond_monstrosity_engie_plush_obtained")))
																																.isDone()) {
																															if (entity instanceof ServerPlayer _plr29
																																	&& _plr29
																																			.level() instanceof ServerLevel
																																	&& _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements()
																																			.get(ResourceLocation.parse("engies_chaos:netherite_monstrosity_engie_plush_obtained"))).isDone()) {
																																if (entity instanceof ServerPlayer _plr30 && _plr30.level() instanceof ServerLevel
																																		&& _plr30.getAdvancements().getOrStartProgress(
																																				_plr30.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:hostile_engie_plush_obtained")))
																																				.isDone()) {
																																	if (entity instanceof ServerPlayer _plr31
																																			&& _plr31
																																					.level() instanceof ServerLevel
																																			&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements()
																																					.get(ResourceLocation.parse("engies_chaos:iron_hostile_engie_plush_obtained"))).isDone()) {
																																		if (entity instanceof ServerPlayer _plr32 && _plr32.level() instanceof ServerLevel
																																				&& _plr32.getAdvancements()
																																						.getOrStartProgress(_plr32.server.getAdvancements()
																																								.get(ResourceLocation.parse("engies_chaos:gold_hostile_engie_plush_obtained")))
																																						.isDone()) {
																																			if (entity instanceof ServerPlayer _plr33 && _plr33.level() instanceof ServerLevel
																																					&& _plr33.getAdvancements()
																																							.getOrStartProgress(_plr33.server.getAdvancements()
																																									.get(ResourceLocation.parse("engies_chaos:diamond_hostile_engie_plush_obtained")))
																																							.isDone()) {
																																				if (entity instanceof ServerPlayer _plr34 && _plr34.level() instanceof ServerLevel
																																						&& _plr34.getAdvancements()
																																								.getOrStartProgress(_plr34.server.getAdvancements().get(
																																										ResourceLocation.parse("engies_chaos:netherite_hostile_engie_plush_obtained")))
																																								.isDone()) {
																																					if (entity instanceof ServerPlayer _plr35 && _plr35.level() instanceof ServerLevel
																																							&& _plr35.getAdvancements()
																																									.getOrStartProgress(_plr35.server.getAdvancements()
																																											.get(ResourceLocation.parse("engies_chaos:wither_rose_secret_xxl")))
																																									.isDone()) {
																																						if (entity instanceof ServerPlayer _plr36 && _plr36.level() instanceof ServerLevel
																																								&& _plr36.getAdvancements()
																																										.getOrStartProgress(_plr36.server.getAdvancements()
																																												.get(ResourceLocation.parse("engies_chaos:mindscape_secret_xxl")))
																																										.isDone()) {
																																							if (entity instanceof ServerPlayer _plr37 && _plr37.level() instanceof ServerLevel && _plr37
																																									.getAdvancements()
																																									.getOrStartProgress(_plr37.server.getAdvancements()
																																											.get(ResourceLocation.parse("engies_chaos:all_about_engie_plaque_obtained")))
																																									.isDone()) {
																																								if (entity instanceof ServerPlayer _plr38 && _plr38.level() instanceof ServerLevel
																																										&& _plr38.getAdvancements()
																																												.getOrStartProgress(_plr38.server.getAdvancements().get(
																																														ResourceLocation.parse("engies_chaos:items_plaque_obtained")))
																																												.isDone()) {
																																									if (entity instanceof ServerPlayer _plr39 && _plr39.level() instanceof ServerLevel
																																											&& _plr39.getAdvancements()
																																													.getOrStartProgress(_plr39.server.getAdvancements().get(
																																															ResourceLocation.parse("engies_chaos:mobs_plaque_obtained")))
																																													.isDone()) {
																																										if (entity instanceof ServerPlayer _plr40 && _plr40.level() instanceof ServerLevel
																																												&& _plr40.getAdvancements()
																																														.getOrStartProgress(_plr40.server.getAdvancements()
																																																.get(ResourceLocation
																																																		.parse("engies_chaos:sharkos_plaque_obtained")))
																																														.isDone()) {
																																											if (entity instanceof ServerPlayer _plr41
																																													&& _plr41.level() instanceof ServerLevel
																																													&& _plr41.getAdvancements()
																																															.getOrStartProgress(_plr41.server.getAdvancements()
																																																	.get(ResourceLocation.parse(
																																																			"engies_chaos:dimensions_plaque_obtained")))
																																															.isDone()) {
																																												if (entity instanceof ServerPlayer _plr42
																																														&& _plr42.level() instanceof ServerLevel
																																														&& _plr42.getAdvancements().getOrStartProgress(_plr42.server
																																																.getAdvancements()
																																																.get(ResourceLocation.parse(
																																																		"engies_chaos:enraged_zombies_plaque_obtained")))
																																																.isDone()) {
																																													if (entity instanceof ServerPlayer _plr43
																																															&& _plr43.level() instanceof ServerLevel
																																															&& _plr43.getAdvancements().getOrStartProgress(_plr43.server
																																																	.getAdvancements()
																																																	.get(ResourceLocation.parse(
																																																			"engies_chaos:extras_plaque_obtained")))
																																																	.isDone()) {
																																														if (entity instanceof ServerPlayer _plr44
																																																&& _plr44.level() instanceof ServerLevel
																																																&& _plr44.getAdvancements()
																																																		.getOrStartProgress(_plr44.server
																																																				.getAdvancements()
																																																				.get(ResourceLocation.parse(
																																																						"engies_chaos:engie_plaque_obtained")))
																																																		.isDone()) {
																																															if (entity instanceof ServerPlayer _plr45
																																																	&& _plr45.level() instanceof ServerLevel
																																																	&& _plr45.getAdvancements()
																																																			.getOrStartProgress(_plr45.server
																																																					.getAdvancements()
																																																					.get(ResourceLocation.parse(
																																																							"engies_chaos:engie_plush_obtained")))
																																																			.isDone()) {
																																																if (entity instanceof ServerPlayer _plr46
																																																		&& _plr46.level() instanceof ServerLevel
																																																		&& _plr46.getAdvancements()
																																																				.getOrStartProgress(_plr46.server
																																																						.getAdvancements()
																																																						.get(ResourceLocation.parse(
																																																								"engies_chaos:dev_engie_plush_obtained")))
																																																				.isDone()) {
																																																	if (!(entity instanceof ServerPlayer _plr47
																																																			&& _plr47.level() instanceof ServerLevel
																																																			&& _plr47.getAdvancements()
																																																					.getOrStartProgress(_plr47.server
																																																							.getAdvancements()
																																																							.get(ResourceLocation.parse(
																																																									"engies_chaos:secret_advancements_completed")))
																																																					.isDone())) {
																																																		if (entity instanceof ServerPlayer _player) {
																																																			AdvancementHolder _adv = _player.server
																																																					.getAdvancements()
																																																					.get(ResourceLocation.parse(
																																																							"engies_chaos:secret_advancements_completed"));
																																																			if (_adv != null) {
																																																				AdvancementProgress _ap = _player
																																																						.getAdvancements()
																																																						.getOrStartProgress(_adv);
																																																				if (!_ap.isDone()) {
																																																					for (String criteria : _ap
																																																							.getRemainingCriteria())
																																																						_player.getAdvancements()
																																																								.award(_adv, criteria);
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}