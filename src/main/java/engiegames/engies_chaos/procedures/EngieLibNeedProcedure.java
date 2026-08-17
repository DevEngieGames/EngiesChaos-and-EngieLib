package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class EngieLibNeedProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "EngieLib")).equals("EngieLib")) {
			if ((StringArgumentType.getString(arguments, "Type")).equals("StartChallenge")) {
				ChallengeDialogueProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "Type")).equals("StartEndgameLoot")) {
				EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if ((StringArgumentType.getString(arguments, "Type")).equals("DoomsdayCleanupPlayer")) {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayhappened == true || EngiesChaosModVariables.MapVariables.get(world).sddayhappened == true || EngiesChaosModVariables.MapVariables.get(world).theendhappened == true
							|| EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == true) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
						if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true && EngiesChaosModVariables.MapVariables.get(world).ddayhappened == true) {
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
					if (EngiesChaosModVariables.MapVariables.get(world).sddayhappened == true || EngiesChaosModVariables.MapVariables.get(world).theendhappened == true || EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == true) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:sdday_conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).theendhappened == true || EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == true) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_one"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
						if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true && EngiesChaosModVariables.MapVariables.get(world).theendhappened == true) {
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
					if (EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == true) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engies_own"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
						if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true) {
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
				{
					Entity _ent = entity;
					_ent.teleportTo(
							((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
									: 0),
							((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
									: 0),
							((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
									: 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
										: 0),
								((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
										: 0),
								((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
										: 0),
								_ent.getYRot(), _ent.getXRot());
				}
			}
		}
	}
}