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

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

public class ReadyUpProProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == false) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerready == false) {
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
								"tellraw @p [\"\",{\"text\":\"You have already readied up \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"}]");
					}
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).challengeplayerreadyupcount == world.players().size()) {
				if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
					EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if ((entityiterator instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
							&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"))).isDone()) == false) {
						if (entityiterator instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).previousdifficulty = EngiesChaosModVariables.MapVariables.get(world).MobDifficulty;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(10, () -> {
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 33;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
				ChallengeDialogueProcedure.execute(world, entity);
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY) == false || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
							"tellraw @p {\"text\":\"NOT NOW, COME BACK LATER WITH INSANITY DIFFICULTY SET TO TRUE AND ONE HP SET TO FALSE\",\"bold\":true,\"color\":\"dark_red\"}");
				}
			}
		}
	}
}