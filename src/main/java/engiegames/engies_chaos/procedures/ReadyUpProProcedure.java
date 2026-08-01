package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

public class ReadyUpProProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true && (world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE)) == true
				&& (world instanceof ServerLevel _serverLevelGR1 && _serverLevelGR1.getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY)) == true
				&& (world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP)) == false) {
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).playerready == false) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tag @s add AAEChallengeReady");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tag @s remove AAEChallengeUnready");
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount = EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.playerready = true;
					_vars.syncPlayerVariables(entity);
				}
			} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).playerready == true) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @a [\"\",{\"text\":\"You have already readied up \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"}]");
					}
				}
			}
			if (world.players().size() == 1) {
				if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
						EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if ((entity instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel
							&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "EngieLib EChaos startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDiffBeforeChallenge = EngiesChaosModVariables.MapVariables.get(world).MobDifficulty;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 33;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					});
				}
			} else if (world.players().size() == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
						EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if ((entity instanceof ServerPlayer _plr12 && _plr12.level() instanceof ServerLevel
							&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "EngieLib EChaos startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDiffBeforeChallenge = EngiesChaosModVariables.MapVariables.get(world).MobDifficulty;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 33;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 2) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
						EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if ((entity instanceof ServerPlayer _plr18 && _plr18.level() instanceof ServerLevel
							&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "EngieLib EChaos startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDiffBeforeChallenge = EngiesChaosModVariables.MapVariables.get(world).MobDifficulty;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 33;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 3) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 4) {
				if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
						EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if ((entity instanceof ServerPlayer _plr24 && _plr24.level() instanceof ServerLevel
							&& _plr24.getAdvancements().getOrStartProgress(_plr24.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "EngieLib EChaos startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDiffBeforeChallenge = EngiesChaosModVariables.MapVariables.get(world).MobDifficulty;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 33;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 4) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 5) {
				if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
						EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if ((entity instanceof ServerPlayer _plr30 && _plr30.level() instanceof ServerLevel
							&& _plr30.getAdvancements().getOrStartProgress(_plr30.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "EngieLib EChaos startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDiffBeforeChallenge = EngiesChaosModVariables.MapVariables.get(world).MobDifficulty;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 33;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 5) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 6) {
				if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
						EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if ((entity instanceof ServerPlayer _plr36 && _plr36.level() instanceof ServerLevel
							&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "EngieLib EChaos startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDiffBeforeChallenge = EngiesChaosModVariables.MapVariables.get(world).MobDifficulty;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 33;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 6) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 7) {
				if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
						EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if ((entity instanceof ServerPlayer _plr42 && _plr42.level() instanceof ServerLevel
							&& _plr42.getAdvancements().getOrStartProgress(_plr42.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "EngieLib EChaos startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDiffBeforeChallenge = EngiesChaosModVariables.MapVariables.get(world).MobDifficulty;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 33;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 7) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 8) {
				if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount == 8) {
					if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
						EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if ((entity instanceof ServerPlayer _plr48 && _plr48.level() instanceof ServerLevel
							&& _plr48.getAdvancements().getOrStartProgress(_plr48.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:something_is_not_right"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "EngieLib EChaos startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDiffBeforeChallenge = EngiesChaosModVariables.MapVariables.get(world).MobDifficulty;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 33;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					});
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 8) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true && ((world instanceof ServerLevel _serverLevelGR53 && _serverLevelGR53.getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE)) == false
				|| (world instanceof ServerLevel _serverLevelGR54 && _serverLevelGR54.getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY)) == false
				|| (world instanceof ServerLevel _serverLevelGR55 && _serverLevelGR55.getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP)) == true)) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"NOT NOW, COME BACK LATER WITH THE PROPER SETTINGS.\",\"bold\":true,\"color\":\"dark_red\"}");
				}
			}
		}
	}
}