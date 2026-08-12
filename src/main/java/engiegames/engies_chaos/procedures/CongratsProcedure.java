package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CongratsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_armor_made"))).isDone()) {
			if (entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_armor_made"))).isDone()) {
				if (entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
						&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_gem_obtained"))).isDone()) {
					if (entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
							&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_tool_obtained"))).isDone()) {
						if (entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
								&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_tool_obtained"))).isDone()) {
							if (entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
									&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_armor_made"))).isDone()) {
								if (entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
										&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_tool_obtained"))).isDone()) {
									if (entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel
											&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_essence_obtained"))).isDone()) {
										if (entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel
												&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_essence_obtained"))).isDone()) {
											if (entity instanceof ServerPlayer _plr9 && _plr9.level instanceof ServerLevel
													&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mini_ban_obtain"))).isDone()) {
												if (entity instanceof ServerPlayer _plr10 && _plr10.level instanceof ServerLevel
														&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:ban_obtain"))).isDone()) {
													if (entity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel
															&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:big_ban_obtain"))).isDone()) {
														if (entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel
																&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:large_ban_obtain"))).isDone()) {
															if (entity instanceof ServerPlayer _plr13 && _plr13.level instanceof ServerLevel
																	&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:huge_ban_obtain"))).isDone()) {
																if (entity instanceof ServerPlayer _plr14 && _plr14.level instanceof ServerLevel
																		&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enormous_ban_obtain"))).isDone()) {
																	if (entity instanceof ServerPlayer _plr15 && _plr15.level instanceof ServerLevel
																			&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gigantic_ban_obtain"))).isDone()) {
																		if (entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
																				&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:massive_ban_obtain"))).isDone()) {
																			if (entity instanceof ServerPlayer _plr17 && _plr17.level instanceof ServerLevel && _plr17.getAdvancements()
																					.getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_ban_obtain"))).isDone()) {
																				if (entity instanceof ServerPlayer _plr18 && _plr18.level instanceof ServerLevel && _plr18.getAdvancements()
																						.getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_ban_obtain"))).isDone()) {
																					if (entity instanceof ServerPlayer _plr19 && _plr19.level instanceof ServerLevel && _plr19.getAdvancements()
																							.getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_essence_obtained"))).isDone()) {
																						if (entity instanceof ServerPlayer _plr20 && _plr20.level instanceof ServerLevel && _plr20.getAdvancements()
																								.getOrStartProgress(_plr20.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_armor_obtained"))).isDone()) {
																							if (entity instanceof ServerPlayer _plr21 && _plr21.level instanceof ServerLevel && _plr21.getAdvancements()
																									.getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_tools_obtained"))).isDone()) {
																								if (entity instanceof ServerPlayer _plr22 && _plr22.level instanceof ServerLevel
																										&& _plr22.getAdvancements()
																												.getOrStartProgress(
																														_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_essence_obtained")))
																												.isDone()) {
																									if (entity instanceof ServerPlayer _plr23 && _plr23.level instanceof ServerLevel
																											&& _plr23.getAdvancements()
																													.getOrStartProgress(
																															_plr23.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_essence_obtained")))
																													.isDone()) {
																										if (entity instanceof ServerPlayer _plr24 && _plr24.level instanceof ServerLevel
																												&& _plr24.getAdvancements()
																														.getOrStartProgress(
																																_plr24.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_armor_obtained")))
																														.isDone()) {
																											if (entity instanceof ServerPlayer _plr25 && _plr25.level instanceof ServerLevel
																													&& _plr25.getAdvancements().getOrStartProgress(
																															_plr25.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_armor_obtained")))
																															.isDone()) {
																												if (entity instanceof ServerPlayer _plr26 && _plr26.level instanceof ServerLevel
																														&& _plr26.getAdvancements().getOrStartProgress(
																																_plr26.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_tools_obtained")))
																																.isDone()) {
																													if (entity instanceof ServerPlayer _plr27 && _plr27.level instanceof ServerLevel
																															&& _plr27.getAdvancements().getOrStartProgress(
																																	_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_ban_obtain")))
																																	.isDone()) {
																														if (entity instanceof ServerPlayer _plr28 && _plr28.level instanceof ServerLevel && _plr28.getAdvancements().getOrStartProgress(
																																_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_tools_obtained")))
																																.isDone()) {
																															if (entity instanceof ServerPlayer _plr29 && _plr29.level instanceof ServerLevel
																																	&& _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements()
																																			.getAdvancement(new ResourceLocation("engies_chaos:doomsday_ban_scythe_obtain"))).isDone()) {
																																if (entity instanceof ServerPlayer _plr30 && _plr30.level instanceof ServerLevel
																																		&& _plr30.getAdvancements()
																																				.getOrStartProgress(_plr30.server.getAdvancements()
																																						.getAdvancement(new ResourceLocation("engies_chaos:super_doomsday_ban_scythe_obtain")))
																																				.isDone()) {
																																	if (entity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
																																			&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements()
																																					.getAdvancement(new ResourceLocation("engies_chaos:the_end_ban_scythe_obtain"))).isDone()) {
																																		if (entity instanceof ServerPlayer _plr32 && _plr32.level instanceof ServerLevel
																																				&& _plr32.getAdvancements()
																																						.getOrStartProgress(_plr32.server.getAdvancements()
																																								.getAdvancement(new ResourceLocation("engies_chaos:engies_ban_scythe_obtain")))
																																						.isDone()) {
																																			if (entity instanceof ServerPlayer _plr33 && _plr33.level instanceof ServerLevel
																																					&& _plr33.getAdvancements()
																																							.getOrStartProgress(_plr33.server.getAdvancements()
																																									.getAdvancement(new ResourceLocation("engies_chaos:mindscape_ban_scythe_obtain")))
																																							.isDone()) {
																																				if (entity instanceof ServerPlayer _plr34 && _plr34.level instanceof ServerLevel
																																						&& _plr34.getAdvancements()
																																								.getOrStartProgress(_plr34.server.getAdvancements()
																																										.getAdvancement(new ResourceLocation("engies_chaos:engie_games_sword_obtained")))
																																								.isDone()) {
																																					if (entity instanceof ServerPlayer _plr35 && _plr35.level instanceof ServerLevel
																																							&& _plr35.getAdvancements()
																																									.getOrStartProgress(_plr35.server.getAdvancements()
																																											.getAdvancement(new ResourceLocation("engies_chaos:doomsday_coin_obtained")))
																																									.isDone()) {
																																						if (entity instanceof ServerPlayer _plr36 && _plr36.level instanceof ServerLevel
																																								&& _plr36.getAdvancements()
																																										.getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(
																																												new ResourceLocation("engies_chaos:super_doomsday_coin_obtained")))
																																										.isDone()) {
																																							if (entity instanceof ServerPlayer _plr37 && _plr37.level instanceof ServerLevel
																																									&& _plr37.getAdvancements()
																																											.getOrStartProgress(_plr37.server.getAdvancements().getAdvancement(
																																													new ResourceLocation("engies_chaos:the_end_coin_obtained")))
																																											.isDone()) {
																																								if (entity instanceof ServerPlayer _plr38 && _plr38.level instanceof ServerLevel
																																										&& _plr38.getAdvancements()
																																												.getOrStartProgress(_plr38.server.getAdvancements().getAdvancement(
																																														new ResourceLocation("engies_chaos:engie_coin_obtained")))
																																												.isDone()) {
																																									if (entity instanceof ServerPlayer _plr39 && _plr39.level instanceof ServerLevel
																																											&& _plr39.getAdvancements()
																																													.getOrStartProgress(_plr39.server.getAdvancements()
																																															.getAdvancement(new ResourceLocation(
																																																	"engies_chaos:engie_games_coin_obtained")))
																																													.isDone()) {
																																										if (entity instanceof ServerPlayer _plr40 && _plr40.level instanceof ServerLevel
																																												&& _plr40.getAdvancements()
																																														.getOrStartProgress(_plr40.server.getAdvancements()
																																																.getAdvancement(new ResourceLocation(
																																																		"engies_chaos:antimatter_engie_gem_obtained")))
																																														.isDone()) {
																																											if (entity instanceof ServerPlayer _plr41
																																													&& _plr41.level instanceof ServerLevel
																																													&& _plr41.getAdvancements().getOrStartProgress(_plr41.server
																																															.getAdvancements()
																																															.getAdvancement(new ResourceLocation(
																																																	"engies_chaos:antimatter_angry_engie_essence_obtained")))
																																															.isDone()) {
																																												if (entity instanceof ServerPlayer _plr42
																																														&& _plr42.level instanceof ServerLevel
																																														&& _plr42.getAdvancements().getOrStartProgress(_plr42.server
																																																.getAdvancements()
																																																.getAdvancement(new ResourceLocation(
																																																		"engies_chaos:antimatter_enraged_engie_essence_obtained")))
																																																.isDone()) {
																																													if (entity instanceof ServerPlayer _plr43
																																															&& _plr43.level instanceof ServerLevel
																																															&& _plr43.getAdvancements().getOrStartProgress(_plr43.server
																																																	.getAdvancements()
																																																	.getAdvancement(new ResourceLocation(
																																																			"engies_chaos:antimatter_outraged_engie_essence_obtained")))
																																																	.isDone()) {
																																														if (entity instanceof ServerPlayer _plr44
																																																&& _plr44.level instanceof ServerLevel
																																																&& _plr44.getAdvancements()
																																																		.getOrStartProgress(_plr44.server
																																																				.getAdvancements()
																																																				.getAdvancement(new ResourceLocation(
																																																						"engies_chaos:antimatter_biblically_accurate_essence_obtained")))
																																																		.isDone()) {
																																															if (entity instanceof ServerPlayer _plr45
																																																	&& _plr45.level instanceof ServerLevel
																																																	&& _plr45.getAdvancements()
																																																			.getOrStartProgress(_plr45.server
																																																					.getAdvancements()
																																																					.getAdvancement(new ResourceLocation(
																																																							"engies_chaos:antimatter_monstrosity_engie_essence_obtained")))
																																																			.isDone()) {
																																																if (entity instanceof ServerPlayer _plr46
																																																		&& _plr46.level instanceof ServerLevel
																																																		&& _plr46.getAdvancements()
																																																				.getOrStartProgress(_plr46.server
																																																						.getAdvancements().getAdvancement(
																																																								new ResourceLocation(
																																																										"engies_chaos:antimatter_engie_armor_made")))
																																																				.isDone()) {
																																																	if (entity instanceof ServerPlayer _plr47
																																																			&& _plr47.level instanceof ServerLevel
																																																			&& _plr47.getAdvancements()
																																																					.getOrStartProgress(_plr47.server
																																																							.getAdvancements()
																																																							.getAdvancement(
																																																									new ResourceLocation(
																																																											"engies_chaos:antimatter_angry_engie_armor_made")))
																																																					.isDone()) {
																																																		if (entity instanceof ServerPlayer _plr48
																																																				&& _plr48.level instanceof ServerLevel
																																																				&& _plr48.getAdvancements()
																																																						.getOrStartProgress(_plr48.server
																																																								.getAdvancements()
																																																								.getAdvancement(
																																																										new ResourceLocation(
																																																												"engies_chaos:antimatter_enraged_engie_armor_made")))
																																																						.isDone()) {
																																																			if (entity instanceof ServerPlayer _plr49
																																																					&& _plr49.level instanceof ServerLevel
																																																					&& _plr49.getAdvancements()
																																																							.getOrStartProgress(
																																																									_plr49.server
																																																											.getAdvancements()
																																																											.getAdvancement(
																																																													new ResourceLocation(
																																																															"engies_chaos:antimatter_outraged_engie_armor_obtained")))
																																																							.isDone()) {
																																																				if (entity instanceof ServerPlayer _plr50
																																																						&& _plr50.level instanceof ServerLevel
																																																						&& _plr50.getAdvancements()
																																																								.getOrStartProgress(
																																																										_plr50.server
																																																												.getAdvancements()
																																																												.getAdvancement(
																																																														new ResourceLocation(
																																																																"engies_chaos:antimatter_biblically_accurate_engie_armor_obtained")))
																																																								.isDone()) {
																																																					if (entity instanceof ServerPlayer _plr51
																																																							&& _plr51.level instanceof ServerLevel
																																																							&& _plr51.getAdvancements()
																																																									.getOrStartProgress(
																																																											_plr51.server
																																																													.getAdvancements()
																																																													.getAdvancement(
																																																															new ResourceLocation(
																																																																	"engies_chaos:antimatter_monstrosity_engie_armor_obtained")))
																																																									.isDone()) {
																																																						if (entity instanceof ServerPlayer _plr52
																																																								&& _plr52.level instanceof ServerLevel
																																																								&& _plr52
																																																										.getAdvancements()
																																																										.getOrStartProgress(
																																																												_plr52.server
																																																														.getAdvancements()
																																																														.getAdvancement(
																																																																new ResourceLocation(
																																																																		"engies_chaos:antimatter_hostile_engie_armor_obtained")))
																																																										.isDone()) {
																																																							if (entity instanceof ServerPlayer _plr53
																																																									&& _plr53.level instanceof ServerLevel
																																																									&& _plr53
																																																											.getAdvancements()
																																																											.getOrStartProgress(
																																																													_plr53.server
																																																															.getAdvancements()
																																																															.getAdvancement(
																																																																	new ResourceLocation(
																																																																			"engies_chaos:antimatter_dooms_day_armor_obtained")))
																																																											.isDone()) {
																																																								if (entity instanceof ServerPlayer _plr54
																																																										&& _plr54.level instanceof ServerLevel
																																																										&& _plr54
																																																												.getAdvancements()
																																																												.getOrStartProgress(
																																																														_plr54.server
																																																																.getAdvancements()
																																																																.getAdvancement(
																																																																		new ResourceLocation(
																																																																				"engies_chaos:antimatter_super_dooms_day_tools_obtained")))
																																																												.isDone()) {
																																																									if (entity instanceof ServerPlayer _plr55
																																																											&& _plr55.level instanceof ServerLevel
																																																											&& _plr55
																																																													.getAdvancements()
																																																													.getOrStartProgress(
																																																															_plr55.server
																																																																	.getAdvancements()
																																																																	.getAdvancement(
																																																																			new ResourceLocation(
																																																																					"engies_chaos:antimatter_the_end_armor_obtained")))
																																																													.isDone()) {
																																																										if (entity instanceof ServerPlayer _plr56
																																																												&& _plr56.level instanceof ServerLevel
																																																												&& _plr56
																																																														.getAdvancements()
																																																														.getOrStartProgress(
																																																																_plr56.server
																																																																		.getAdvancements()
																																																																		.getAdvancement(
																																																																				new ResourceLocation(
																																																																						"engies_chaos:antimatter_engie_armor_obtained")))
																																																														.isDone()) {
																																																											if (entity instanceof ServerPlayer _plr57
																																																													&& _plr57.level instanceof ServerLevel
																																																													&& _plr57
																																																															.getAdvancements()
																																																															.getOrStartProgress(
																																																																	_plr57.server
																																																																			.getAdvancements()
																																																																			.getAdvancement(
																																																																					new ResourceLocation(
																																																																							"engies_chaos:antimatter_engie_games_armor_obtained")))
																																																															.isDone()) {
																																																												if (entity instanceof ServerPlayer _plr58
																																																														&& _plr58.level instanceof ServerLevel
																																																														&& _plr58
																																																																.getAdvancements()
																																																																.getOrStartProgress(
																																																																		_plr58.server
																																																																				.getAdvancements()
																																																																				.getAdvancement(
																																																																						new ResourceLocation(
																																																																								"engies_chaos:antimatter_engie_tool_obtained")))
																																																																.isDone()) {
																																																													if (entity instanceof ServerPlayer _plr59
																																																															&& _plr59.level instanceof ServerLevel
																																																															&& _plr59
																																																																	.getAdvancements()
																																																																	.getOrStartProgress(
																																																																			_plr59.server
																																																																					.getAdvancements()
																																																																					.getAdvancement(
																																																																							new ResourceLocation(
																																																																									"engies_chaos:antimatter_angry_engie_tool_obtained")))
																																																																	.isDone()) {
																																																														if (entity instanceof ServerPlayer _plr60
																																																																&& _plr60.level instanceof ServerLevel
																																																																&& _plr60
																																																																		.getAdvancements()
																																																																		.getOrStartProgress(
																																																																				_plr60.server
																																																																						.getAdvancements()
																																																																						.getAdvancement(
																																																																								new ResourceLocation(
																																																																										"engies_chaos:antimatter_enraged_engie_tool_obtained")))
																																																																		.isDone()) {
																																																															if (entity instanceof ServerPlayer _plr61
																																																																	&& _plr61.level instanceof ServerLevel
																																																																	&& _plr61
																																																																			.getAdvancements()
																																																																			.getOrStartProgress(
																																																																					_plr61.server
																																																																							.getAdvancements()
																																																																							.getAdvancement(
																																																																									new ResourceLocation(
																																																																											"engies_chaos:antimatter_outraged_tools_obtained")))
																																																																			.isDone()) {
																																																																if (entity instanceof ServerPlayer _plr62
																																																																		&& _plr62.level instanceof ServerLevel
																																																																		&& _plr62
																																																																				.getAdvancements()
																																																																				.getOrStartProgress(
																																																																						_plr62.server
																																																																								.getAdvancements()
																																																																								.getAdvancement(
																																																																										new ResourceLocation(
																																																																												"engies_chaos:antimatter_biblically_accurate_tools_obtained")))
																																																																				.isDone()) {
																																																																	if (entity instanceof ServerPlayer _plr63
																																																																			&& _plr63.level instanceof ServerLevel
																																																																			&& _plr63
																																																																					.getAdvancements()
																																																																					.getOrStartProgress(
																																																																							_plr63.server
																																																																									.getAdvancements()
																																																																									.getAdvancement(
																																																																											new ResourceLocation(
																																																																													"engies_chaos:antimatter_monstrosity_engie_tools_obtained")))
																																																																					.isDone()) {
																																																																		if (entity instanceof ServerPlayer _plr64
																																																																				&& _plr64.level instanceof ServerLevel
																																																																				&& _plr64
																																																																						.getAdvancements()
																																																																						.getOrStartProgress(
																																																																								_plr64.server
																																																																										.getAdvancements()
																																																																										.getAdvancement(
																																																																												new ResourceLocation(
																																																																														"engies_chaos:antimatter_hostile_engie_tools_obtained")))
																																																																						.isDone()) {
																																																																			if (entity instanceof ServerPlayer _plr65
																																																																					&& _plr65.level instanceof ServerLevel
																																																																					&& _plr65
																																																																							.getAdvancements()
																																																																							.getOrStartProgress(
																																																																									_plr65.server
																																																																											.getAdvancements()
																																																																											.getAdvancement(
																																																																													new ResourceLocation(
																																																																															"engies_chaos:antimatter_dooms_day_tools_obtained")))
																																																																							.isDone()) {
																																																																				if (entity instanceof ServerPlayer _plr66
																																																																						&& _plr66.level instanceof ServerLevel
																																																																						&& _plr66
																																																																								.getAdvancements()
																																																																								.getOrStartProgress(
																																																																										_plr66.server
																																																																												.getAdvancements()
																																																																												.getAdvancement(
																																																																														new ResourceLocation(
																																																																																"engies_chaos:antimatter_super_doomsday_ban_scythe_obtain")))
																																																																								.isDone()) {
																																																																					if (entity instanceof ServerPlayer _plr67
																																																																							&& _plr67.level instanceof ServerLevel
																																																																							&& _plr67
																																																																									.getAdvancements()
																																																																									.getOrStartProgress(
																																																																											_plr67.server
																																																																													.getAdvancements()
																																																																													.getAdvancement(
																																																																															new ResourceLocation(
																																																																																	"engies_chaos:antimatter_the_end_tools_obtained")))
																																																																									.isDone()) {
																																																																						if (entity instanceof ServerPlayer _plr68
																																																																								&& _plr68.level instanceof ServerLevel
																																																																								&& _plr68
																																																																										.getAdvancements()
																																																																										.getOrStartProgress(
																																																																												_plr68.server
																																																																														.getAdvancements()
																																																																														.getAdvancement(
																																																																																new ResourceLocation(
																																																																																		"engies_chaos:antimatter_engies_tools_obtained")))
																																																																										.isDone()) {
																																																																							if (entity instanceof ServerPlayer _plr69
																																																																									&& _plr69.level instanceof ServerLevel
																																																																									&& _plr69
																																																																											.getAdvancements()
																																																																											.getOrStartProgress(
																																																																													_plr69.server
																																																																															.getAdvancements()
																																																																															.getAdvancement(
																																																																																	new ResourceLocation(
																																																																																			"engies_chaos:antimatter_engie_games_tools_obtained")))
																																																																											.isDone()) {
																																																																								if (entity instanceof ServerPlayer _plr70
																																																																										&& _plr70.level instanceof ServerLevel
																																																																										&& _plr70
																																																																												.getAdvancements()
																																																																												.getOrStartProgress(
																																																																														_plr70.server
																																																																																.getAdvancements()
																																																																																.getAdvancement(
																																																																																		new ResourceLocation(
																																																																																				"engies_chaos:antimatter_mini_ban_obtain")))
																																																																												.isDone()) {
																																																																									if (entity instanceof ServerPlayer _plr71
																																																																											&& _plr71.level instanceof ServerLevel
																																																																											&& _plr71
																																																																													.getAdvancements()
																																																																													.getOrStartProgress(
																																																																															_plr71.server
																																																																																	.getAdvancements()
																																																																																	.getAdvancement(
																																																																																			new ResourceLocation(
																																																																																					"engies_chaos:antimatter_ban_obtain")))
																																																																													.isDone()) {
																																																																										if (entity instanceof ServerPlayer _plr72
																																																																												&& _plr72.level instanceof ServerLevel
																																																																												&& _plr72
																																																																														.getAdvancements()
																																																																														.getOrStartProgress(
																																																																																_plr72.server
																																																																																		.getAdvancements()
																																																																																		.getAdvancement(
																																																																																				new ResourceLocation(
																																																																																						"engies_chaos:antimatter_big_ban_obtain")))
																																																																														.isDone()) {
																																																																											if (entity instanceof ServerPlayer _plr73
																																																																													&& _plr73.level instanceof ServerLevel
																																																																													&& _plr73
																																																																															.getAdvancements()
																																																																															.getOrStartProgress(
																																																																																	_plr73.server
																																																																																			.getAdvancements()
																																																																																			.getAdvancement(
																																																																																					new ResourceLocation(
																																																																																							"engies_chaos:antimatter_large_ban_obtain")))
																																																																															.isDone()) {
																																																																												if (entity instanceof ServerPlayer _plr74
																																																																														&& _plr74.level instanceof ServerLevel
																																																																														&& _plr74
																																																																																.getAdvancements()
																																																																																.getOrStartProgress(
																																																																																		_plr74.server
																																																																																				.getAdvancements()
																																																																																				.getAdvancement(
																																																																																						new ResourceLocation(
																																																																																								"engies_chaos:antimatter_huge_ban_obtain")))
																																																																																.isDone()) {
																																																																													if (entity instanceof ServerPlayer _plr75
																																																																															&& _plr75.level instanceof ServerLevel
																																																																															&& _plr75
																																																																																	.getAdvancements()
																																																																																	.getOrStartProgress(
																																																																																			_plr75.server
																																																																																					.getAdvancements()
																																																																																					.getAdvancement(
																																																																																							new ResourceLocation(
																																																																																									"engies_chaos:antimatter_enormous_ban_obtain")))
																																																																																	.isDone()) {
																																																																														if (entity instanceof ServerPlayer _plr76
																																																																																&& _plr76.level instanceof ServerLevel
																																																																																&& _plr76
																																																																																		.getAdvancements()
																																																																																		.getOrStartProgress(
																																																																																				_plr76.server
																																																																																						.getAdvancements()
																																																																																						.getAdvancement(
																																																																																								new ResourceLocation(
																																																																																										"engies_chaos:antimatter_gigantic_ban_obtain")))
																																																																																		.isDone()) {
																																																																															if (entity instanceof ServerPlayer _plr77
																																																																																	&& _plr77.level instanceof ServerLevel
																																																																																	&& _plr77
																																																																																			.getAdvancements()
																																																																																			.getOrStartProgress(
																																																																																					_plr77.server
																																																																																							.getAdvancements()
																																																																																							.getAdvancement(
																																																																																									new ResourceLocation(
																																																																																											"engies_chaos:antimatter_massive_ban_obtain")))
																																																																																			.isDone()) {
																																																																																if (entity instanceof ServerPlayer _plr78
																																																																																		&& _plr78.level instanceof ServerLevel
																																																																																		&& _plr78
																																																																																				.getAdvancements()
																																																																																				.getOrStartProgress(
																																																																																						_plr78.server
																																																																																								.getAdvancements()
																																																																																								.getAdvancement(
																																																																																										new ResourceLocation(
																																																																																												"engies_chaos:antimatter_biblically_accurate_ban_obtain")))
																																																																																				.isDone()) {
																																																																																	if (entity instanceof ServerPlayer _plr79
																																																																																			&& _plr79.level instanceof ServerLevel
																																																																																			&& _plr79
																																																																																					.getAdvancements()
																																																																																					.getOrStartProgress(
																																																																																							_plr79.server
																																																																																									.getAdvancements()
																																																																																									.getAdvancement(
																																																																																											new ResourceLocation(
																																																																																													"engies_chaos:antimatter_monstrosity_ban_obtain")))
																																																																																					.isDone()) {
																																																																																		if (entity instanceof ServerPlayer _plr80
																																																																																				&& _plr80.level instanceof ServerLevel
																																																																																				&& _plr80
																																																																																						.getAdvancements()
																																																																																						.getOrStartProgress(
																																																																																								_plr80.server
																																																																																										.getAdvancements()
																																																																																										.getAdvancement(
																																																																																												new ResourceLocation(
																																																																																														"engies_chaos:antimatter_doomsday_ban_scythe_obtain")))
																																																																																						.isDone()) {
																																																																																			if (entity instanceof ServerPlayer _plr81
																																																																																					&& _plr81.level instanceof ServerLevel
																																																																																					&& _plr81
																																																																																							.getAdvancements()
																																																																																							.getOrStartProgress(
																																																																																									_plr81.server
																																																																																											.getAdvancements()
																																																																																											.getAdvancement(
																																																																																													new ResourceLocation(
																																																																																															"engies_chaos:antimatter_super_doomsday_ban_scythe_obtain")))
																																																																																							.isDone()) {
																																																																																				if (entity instanceof ServerPlayer _plr82
																																																																																						&& _plr82.level instanceof ServerLevel
																																																																																						&& _plr82
																																																																																								.getAdvancements()
																																																																																								.getOrStartProgress(
																																																																																										_plr82.server
																																																																																												.getAdvancements()
																																																																																												.getAdvancement(
																																																																																														new ResourceLocation(
																																																																																																"engies_chaos:antimatter_the_end_ban_scythe_obtain")))
																																																																																								.isDone()) {
																																																																																					if (entity instanceof ServerPlayer _plr83
																																																																																							&& _plr83.level instanceof ServerLevel
																																																																																							&& _plr83
																																																																																									.getAdvancements()
																																																																																									.getOrStartProgress(
																																																																																											_plr83.server
																																																																																													.getAdvancements()
																																																																																													.getAdvancement(
																																																																																															new ResourceLocation(
																																																																																																	"engies_chaos:antimatter_engies_ban_scythe_obtain")))
																																																																																									.isDone()) {
																																																																																						if (entity instanceof ServerPlayer _plr84
																																																																																								&& _plr84.level instanceof ServerLevel
																																																																																								&& _plr84
																																																																																										.getAdvancements()
																																																																																										.getOrStartProgress(
																																																																																												_plr84.server
																																																																																														.getAdvancements()
																																																																																														.getAdvancement(
																																																																																																new ResourceLocation(
																																																																																																		"engies_chaos:antimatter_engie_games_sword_obtained")))
																																																																																										.isDone()) {
																																																																																							if (entity instanceof ServerPlayer _plr85
																																																																																									&& _plr85.level instanceof ServerLevel
																																																																																									&& _plr85
																																																																																											.getAdvancements()
																																																																																											.getOrStartProgress(
																																																																																													_plr85.server
																																																																																															.getAdvancements()
																																																																																															.getAdvancement(
																																																																																																	new ResourceLocation(
																																																																																																			"engies_chaos:mindscape_ban_scythe_obtain")))
																																																																																											.isDone()) {
																																																																																								if (entity instanceof ServerPlayer _plr86
																																																																																										&& _plr86.level instanceof ServerLevel
																																																																																										&& _plr86
																																																																																												.getAdvancements()
																																																																																												.getOrStartProgress(
																																																																																														_plr86.server
																																																																																																.getAdvancements()
																																																																																																.getAdvancement(
																																																																																																		new ResourceLocation(
																																																																																																				"engies_chaos:engie_games_sword_obtained")))
																																																																																												.isDone()) {
																																																																																									if (entity instanceof ServerPlayer _plr87
																																																																																											&& _plr87.level instanceof ServerLevel
																																																																																											&& _plr87
																																																																																													.getAdvancements()
																																																																																													.getOrStartProgress(
																																																																																															_plr87.server
																																																																																																	.getAdvancements()
																																																																																																	.getAdvancement(
																																																																																																			new ResourceLocation(
																																																																																																					"engies_chaos:antimatter_doomsday_coin_obtained")))
																																																																																													.isDone()) {
																																																																																										if (entity instanceof ServerPlayer _plr88
																																																																																												&& _plr88.level instanceof ServerLevel
																																																																																												&& _plr88
																																																																																														.getAdvancements()
																																																																																														.getOrStartProgress(
																																																																																																_plr88.server
																																																																																																		.getAdvancements()
																																																																																																		.getAdvancement(
																																																																																																				new ResourceLocation(
																																																																																																						"engies_chaos:antimatter_super_doomsday_coin_obtained")))
																																																																																														.isDone()) {
																																																																																											if (entity instanceof ServerPlayer _plr89
																																																																																													&& _plr89.level instanceof ServerLevel
																																																																																													&& _plr89
																																																																																															.getAdvancements()
																																																																																															.getOrStartProgress(
																																																																																																	_plr89.server
																																																																																																			.getAdvancements()
																																																																																																			.getAdvancement(
																																																																																																					new ResourceLocation(
																																																																																																							"engies_chaos:antimatter_the_end_coin_obtained")))
																																																																																															.isDone()) {
																																																																																												if (entity instanceof ServerPlayer _plr90
																																																																																														&& _plr90.level instanceof ServerLevel
																																																																																														&& _plr90
																																																																																																.getAdvancements()
																																																																																																.getOrStartProgress(
																																																																																																		_plr90.server
																																																																																																				.getAdvancements()
																																																																																																				.getAdvancement(
																																																																																																						new ResourceLocation(
																																																																																																								"engies_chaos:antimatter_engie_coin_obtained")))
																																																																																																.isDone()) {
																																																																																													if (entity instanceof ServerPlayer _plr91
																																																																																															&& _plr91.level instanceof ServerLevel
																																																																																															&& _plr91
																																																																																																	.getAdvancements()
																																																																																																	.getOrStartProgress(
																																																																																																			_plr91.server
																																																																																																					.getAdvancements()
																																																																																																					.getAdvancement(
																																																																																																							new ResourceLocation(
																																																																																																									"engies_chaos:antimatter_engie_games_coin_obtained")))
																																																																																																	.isDone()) {
																																																																																														if (!(entity instanceof ServerPlayer _plr92
																																																																																																&& _plr92.level instanceof ServerLevel
																																																																																																&& _plr92
																																																																																																		.getAdvancements()
																																																																																																		.getOrStartProgress(
																																																																																																				_plr92.server
																																																																																																						.getAdvancements()
																																																																																																						.getAdvancement(
																																																																																																								new ResourceLocation(
																																																																																																										"engies_chaos:all_done")))
																																																																																																		.isDone())) {
																																																																																															if (entity instanceof ServerPlayer _player) {
																																																																																																Advancement _adv = _player.server
																																																																																																		.getAdvancements()
																																																																																																		.getAdvancement(
																																																																																																				new ResourceLocation(
																																																																																																						"engies_chaos:all_done"));
																																																																																																AdvancementProgress _ap = _player
																																																																																																		.getAdvancements()
																																																																																																		.getOrStartProgress(
																																																																																																				_adv);
																																																																																																if (!_ap.isDone()) {
																																																																																																	for (String criteria : _ap
																																																																																																			.getRemainingCriteria())
																																																																																																		_player.getAdvancements()
																																																																																																				.award(_adv,
																																																																																																						criteria);
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																														if (entity instanceof ServerPlayer _plr94
																																																																																																&& _plr94.level instanceof ServerLevel
																																																																																																&& _plr94
																																																																																																		.getAdvancements()
																																																																																																		.getOrStartProgress(
																																																																																																				_plr94.server
																																																																																																						.getAdvancements()
																																																																																																						.getAdvancement(
																																																																																																								new ResourceLocation(
																																																																																																										"engies_chaos:secret_advancements_completed")))
																																																																																																		.isDone()) {
																																																																																															if (!(entity instanceof ServerPlayer _plr95
																																																																																																	&& _plr95.level instanceof ServerLevel
																																																																																																	&& _plr95
																																																																																																			.getAdvancements()
																																																																																																			.getOrStartProgress(
																																																																																																					_plr95.server
																																																																																																							.getAdvancements()
																																																																																																							.getAdvancement(
																																																																																																									new ResourceLocation(
																																																																																																											"engies_chaos:all_fully_done")))
																																																																																																			.isDone())) {
																																																																																																if (entity instanceof ServerPlayer _player) {
																																																																																																	Advancement _adv = _player.server
																																																																																																			.getAdvancements()
																																																																																																			.getAdvancement(
																																																																																																					new ResourceLocation(
																																																																																																							"engies_chaos:all_fully_done"));
																																																																																																	AdvancementProgress _ap = _player
																																																																																																			.getAdvancements()
																																																																																																			.getOrStartProgress(
																																																																																																					_adv);
																																																																																																	if (!_ap.isDone()) {
																																																																																																		for (String criteria : _ap
																																																																																																				.getRemainingCriteria())
																																																																																																			_player.getAdvancements()
																																																																																																					.award(_adv,
																																																																																																							criteria);
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