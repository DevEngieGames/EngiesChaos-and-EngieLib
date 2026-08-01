package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class ReadyUpProProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == false) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerready == false) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tag @s add AAEChallengeReady");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tag @s remove AAEChallengeUnready");
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount = EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.playerready = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerready == true) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
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
					if ((entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
							&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 29;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
						EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if ((entity instanceof ServerPlayer _plr10 && _plr10.level instanceof ServerLevel
							&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 29;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 2) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
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
					if ((entity instanceof ServerPlayer _plr15 && _plr15.level instanceof ServerLevel
							&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 29;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 3) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
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
					if ((entity instanceof ServerPlayer _plr20 && _plr20.level instanceof ServerLevel
							&& _plr20.getAdvancements().getOrStartProgress(_plr20.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 29;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 4) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
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
					if ((entity instanceof ServerPlayer _plr25 && _plr25.level instanceof ServerLevel
							&& _plr25.getAdvancements().getOrStartProgress(_plr25.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 29;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 5) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
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
					if ((entity instanceof ServerPlayer _plr30 && _plr30.level instanceof ServerLevel
							&& _plr30.getAdvancements().getOrStartProgress(_plr30.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 29;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 6) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
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
					if ((entity instanceof ServerPlayer _plr35 && _plr35.level instanceof ServerLevel
							&& _plr35.getAdvancements().getOrStartProgress(_plr35.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 29;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 7) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
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
					if ((entity instanceof ServerPlayer _plr40 && _plr40.level instanceof ServerLevel
							&& _plr40.getAdvancements().getOrStartProgress(_plr40.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE startchallenge");
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 29;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount < 8) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == false || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
							"tellraw @p {\"text\":\"NOT NOW, COME BACK LATER WITH TRUE HARDCORE SET TO TRUE AND ONE HP SET TO FALSE\",\"bold\":true,\"color\":\"dark_red\"}");
				}
			}
		}
	}
}