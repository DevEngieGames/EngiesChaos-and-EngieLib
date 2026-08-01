package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class ChallengeModeAdvancementCheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:challenge_destroyed"))).isDone()) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).solotrophyobtained == false) {
				EngiesChaosModVariables.MapVariables.get(world).solotrophyobtained = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @s engies_chaos:challenge_insanity_engie_games_plush_solo");
					}
				}
			}
		} else if ((entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
				&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:challenge_destroyed_2"))).isDone()) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).multiplayertrophyobtained == false) {
				EngiesChaosModVariables.MapVariables.get(world).multiplayertrophyobtained = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @s engies_chaos:challenge_insanity_engie_games_plush_multiplayer");
					}
				}
			}
		}
		if ((entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel && _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:all_fully_done"))).isDone()) == true) {
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).MaxPercentGiveOptionToDoHardestMobDiff == false) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.MaxPercentGiveOptionToDoHardestMobDiff = true;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}