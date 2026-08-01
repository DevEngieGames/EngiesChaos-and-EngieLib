package engiegames.engies_chaos.procedures;

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

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

@Mod.EventBusSubscriber
public class DDayAwardAdvancementProcedure {
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
		if (EngiesChaosModVariables.MapVariables.get(world).ddayawardadvancement1 == true) {
			EngiesChaosModVariables.MapVariables.get(world).ddayawardadvancement1 = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
				if (!(entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:rise"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:rise"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
				if (!(entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
						&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:theendofyourstory"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:theendofyourstory"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
				if (!(entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel && _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:goodbye"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:goodbye"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).ddayawardadvancement2 == true) {
			EngiesChaosModVariables.MapVariables.get(world).ddayawardadvancement2 = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayhappened == true && EngiesChaosModVariables.MapVariables.get(world).sddayhappened == false && EngiesChaosModVariables.MapVariables.get(world).theendhappened == false
						&& EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == false) {
					EngiesChaosModVariables.MapVariables.get(world).ddayhappened = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (!(entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
							&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true) {
						if (!(entity instanceof ServerPlayer _plr9 && _plr9.level instanceof ServerLevel
								&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:doomsday_1hp_challenge_win"))).isDone())) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:doomsday_1hp_challenge_win"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayhappened == false && EngiesChaosModVariables.MapVariables.get(world).sddayhappened == true && EngiesChaosModVariables.MapVariables.get(world).theendhappened == false
						&& EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == false) {
					EngiesChaosModVariables.MapVariables.get(world).sddayhappened = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (!(entity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel
							&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (!(entity instanceof ServerPlayer _plr13 && _plr13.level instanceof ServerLevel
							&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:sdday_conqueror"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:sdday_conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true) {
						if (!(entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
								&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:super_doomsday_1hp_challenge_win"))).isDone())) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:super_doomsday_1hp_challenge_win"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayhappened == false && EngiesChaosModVariables.MapVariables.get(world).sddayhappened == false && EngiesChaosModVariables.MapVariables.get(world).theendhappened == true
						&& EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == false) {
					EngiesChaosModVariables.MapVariables.get(world).theendhappened = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (!(entity instanceof ServerPlayer _plr18 && _plr18.level instanceof ServerLevel
							&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (!(entity instanceof ServerPlayer _plr20 && _plr20.level instanceof ServerLevel
							&& _plr20.getAdvancements().getOrStartProgress(_plr20.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:sdday_conqueror"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:sdday_conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (!(entity instanceof ServerPlayer _plr22 && _plr22.level instanceof ServerLevel
							&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_one"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_one"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true) {
						if (!(entity instanceof ServerPlayer _plr25 && _plr25.level instanceof ServerLevel
								&& _plr25.getAdvancements().getOrStartProgress(_plr25.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_end_1hp_challenge_win"))).isDone())) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_end_1hp_challenge_win"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayhappened == false && EngiesChaosModVariables.MapVariables.get(world).sddayhappened == false && EngiesChaosModVariables.MapVariables.get(world).theendhappened == false
						&& EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == true) {
					EngiesChaosModVariables.MapVariables.get(world).ewrathhappened = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (!(entity instanceof ServerPlayer _plr27 && _plr27.level instanceof ServerLevel
							&& _plr27.getAdvancements().getOrStartProgress(_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (!(entity instanceof ServerPlayer _plr29 && _plr29.level instanceof ServerLevel
							&& _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:sdday_conqueror"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:sdday_conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (!(entity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
							&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_one"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_one"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (!(entity instanceof ServerPlayer _plr33 && _plr33.level instanceof ServerLevel
							&& _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engies_own"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engies_own"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true) {
						if (!(entity instanceof ServerPlayer _plr36 && _plr36.level instanceof ServerLevel
								&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engies_wrath_1hp_challenge_win"))).isDone())) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engies_wrath_1hp_challenge_win"));
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