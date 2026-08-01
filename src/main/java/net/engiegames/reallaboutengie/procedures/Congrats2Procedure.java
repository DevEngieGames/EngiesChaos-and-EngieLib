package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.engiegames.reallaboutengie.init.AllaboutengieModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Congrats2Procedure {
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
		if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mad_engie_plush_obtained"))).isDone()) {
			if (entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_plush_obtained"))).isDone()) {
				if (entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
						&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gold_angry_engie_plush_obtained"))).isDone()) {
					if (entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
							&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:diamond_angry_engie_plush_obtained"))).isDone()) {
						if (entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
								&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:netherite_angry_engie_plush_obtained"))).isDone()) {
							if (entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
									&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_plush_obtained"))).isDone()) {
								if (entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
										&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gold_enraged_engie_plush_obtained"))).isDone()) {
									if (entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel
											&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:diamond_enraged_engie_plush_obtained"))).isDone()) {
										if (entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel
												&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:netherite_enraged_engie_plush_obtained"))).isDone()) {
											if (entity instanceof ServerPlayer _plr9 && _plr9.level instanceof ServerLevel
													&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_plush_obtained"))).isDone()) {
												if (entity instanceof ServerPlayer _plr10 && _plr10.level instanceof ServerLevel
														&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gold_outraged_engie_plush_obtained"))).isDone()) {
													if (entity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel
															&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:diamond_outraged_engie_plush_obtained"))).isDone()) {
														if (entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel
																&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:netherite_outraged_engie_plush_obtained"))).isDone()) {
															if (entity instanceof ServerPlayer _plr13 && _plr13.level instanceof ServerLevel
																	&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_plush_obtained"))).isDone()) {
																if (entity instanceof ServerPlayer _plr14 && _plr14.level instanceof ServerLevel && _plr14.getAdvancements()
																		.getOrStartProgress(_plr14.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gold_monstrosity_engie_plush_obtained"))).isDone()) {
																	if (entity instanceof ServerPlayer _plr15 && _plr15.level instanceof ServerLevel && _plr15.getAdvancements()
																			.getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:diamond_monstrosity_engie_plush_obtained"))).isDone()) {
																		if (entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel && _plr16.getAdvancements()
																				.getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:netherite_monstrosity_engie_plush_obtained"))).isDone()) {
																			if (entity instanceof ServerPlayer _plr17 && _plr17.level instanceof ServerLevel && _plr17.getAdvancements()
																					.getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:wither_rose_secret_xxl"))).isDone()) {
																				if (entity instanceof ServerPlayer _plr18 && _plr18.level instanceof ServerLevel && _plr18.getAdvancements()
																						.getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:all_about_engie_plaque_obtained"))).isDone()) {
																					if (entity instanceof ServerPlayer _plr19 && _plr19.level instanceof ServerLevel && _plr19.getAdvancements()
																							.getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:items_plaque_obtained"))).isDone()) {
																						if (entity instanceof ServerPlayer _plr20 && _plr20.level instanceof ServerLevel && _plr20.getAdvancements()
																								.getOrStartProgress(_plr20.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mobs_plaque_obtained"))).isDone()) {
																							if (entity instanceof ServerPlayer _plr21 && _plr21.level instanceof ServerLevel && _plr21.getAdvancements()
																									.getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:sharkos_plaque_obtained"))).isDone()) {
																								if (entity instanceof ServerPlayer _plr22 && _plr22.level instanceof ServerLevel && _plr22.getAdvancements()
																										.getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:dimensions_plaque_obtained"))).isDone()) {
																									if (entity instanceof ServerPlayer _plr23 && _plr23.level instanceof ServerLevel
																											&& _plr23.getAdvancements()
																													.getOrStartProgress(
																															_plr23.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_zombies_plaque_obtained")))
																													.isDone()) {
																										if (entity instanceof ServerPlayer _plr24 && _plr24.level instanceof ServerLevel
																												&& _plr24.getAdvancements()
																														.getOrStartProgress(_plr24.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:extras_plaque_obtained")))
																														.isDone()) {
																											if (entity instanceof ServerPlayer _plr25 && _plr25.level instanceof ServerLevel
																													&& _plr25.getAdvancements()
																															.getOrStartProgress(
																																	_plr25.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_plaque_obtained")))
																															.isDone()) {
																												if (entity instanceof ServerPlayer _plr26 && _plr26.level instanceof ServerLevel
																														&& _plr26.getAdvancements()
																																.getOrStartProgress(
																																		_plr26.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_plush_obtained")))
																																.isDone()) {
																													if (entity instanceof ServerPlayer _plr27 && _plr27.level instanceof ServerLevel
																															&& _plr27.getAdvancements().getOrStartProgress(
																																	_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:dev_engie_plush_obtained")))
																																	.isDone()) {
																														if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_HARDCORE) == true
																																&& world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ONE_HP) == false) {
																															if (entity instanceof ServerPlayer _plr30 && _plr30.level instanceof ServerLevel
																																	&& _plr30.getAdvancements().getOrStartProgress(_plr30.server.getAdvancements()
																																			.getAdvancement(new ResourceLocation("allaboutengie:insanity_engie_plush_obtained"))).isDone()) {
																																if (entity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
																																		&& _plr31.getAdvancements()
																																				.getOrStartProgress(_plr31.server.getAdvancements()
																																						.getAdvancement(new ResourceLocation("allaboutengie:gold_insanity_engie_plush_obtained")))
																																				.isDone()) {
																																	if (entity instanceof ServerPlayer _plr32 && _plr32.level instanceof ServerLevel
																																			&& _plr32.getAdvancements()
																																					.getOrStartProgress(_plr32.server.getAdvancements()
																																							.getAdvancement(new ResourceLocation("allaboutengie:diamond_insanity_engie_plush_obtained")))
																																					.isDone()) {
																																		if (entity instanceof ServerPlayer _plr33 && _plr33.level instanceof ServerLevel
																																				&& _plr33.getAdvancements()
																																						.getOrStartProgress(_plr33.server.getAdvancements().getAdvancement(
																																								new ResourceLocation("allaboutengie:netherite_insanity_engie_plush_obtained")))
																																						.isDone()) {
																																			if (entity instanceof ServerPlayer _plr34 && _plr34.level instanceof ServerLevel
																																					&& _plr34.getAdvancements()
																																							.getOrStartProgress(_plr34.server.getAdvancements().getAdvancement(
																																									new ResourceLocation("allaboutengie:enraged_insanity_engie_plush_obtained")))
																																							.isDone()) {
																																				if (entity instanceof ServerPlayer _plr35 && _plr35.level instanceof ServerLevel
																																						&& _plr35.getAdvancements()
																																								.getOrStartProgress(_plr35.server.getAdvancements().getAdvancement(
																																										new ResourceLocation("allaboutengie:pure_insanity_engie_plush_obtained")))
																																								.isDone()) {
																																					if (!(entity instanceof ServerPlayer _plr36 && _plr36.level instanceof ServerLevel
																																							&& _plr36.getAdvancements()
																																									.getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(
																																											new ResourceLocation("allaboutengie:secret_advancements_completed")))
																																									.isDone())) {
																																						if (entity instanceof ServerPlayer _player) {
																																							Advancement _adv = _player.server.getAdvancements()
																																									.getAdvancement(new ResourceLocation("allaboutengie:secret_advancements_completed"));
																																							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
																																							if (!_ap.isDone()) {
																																								for (String criteria : _ap.getRemainingCriteria())
																																									_player.getAdvancements().award(_adv, criteria);
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