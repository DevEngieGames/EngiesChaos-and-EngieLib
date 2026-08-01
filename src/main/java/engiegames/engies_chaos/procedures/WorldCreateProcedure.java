package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

@EventBusSubscriber
public class WorldCreateProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE)) == true) {
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).truehardcorelifesobtained == false) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.TrueHardcoreLifeCount = (world instanceof ServerLevel _serverLevelGR1 ? _serverLevelGR1.getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT) : 0);
					_vars.syncPlayerVariables(entity);
				}
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.TrueHardcoreMaxLifeCount = (world instanceof ServerLevel _serverLevelGR2 ? _serverLevelGR2.getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT) : 0);
					_vars.syncPlayerVariables(entity);
				}
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.truehardcorelifesobtained = true;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}