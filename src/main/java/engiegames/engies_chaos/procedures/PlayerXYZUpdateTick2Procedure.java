package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class PlayerXYZUpdateTick2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
			_vars.PlayerX = entity.getX();
			_vars.syncPlayerVariables(entity);
		}
		{
			EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
			_vars.HHGLookX = entity.getX();
			_vars.syncPlayerVariables(entity);
		}
		{
			EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
			_vars.PlayerY = entity.getY();
			_vars.syncPlayerVariables(entity);
		}
		{
			EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
			_vars.HHGLookY = entity.getY() + 1.5;
			_vars.syncPlayerVariables(entity);
		}
		{
			EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
			_vars.PlayerZ = entity.getZ();
			_vars.syncPlayerVariables(entity);
		}
		{
			EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
			_vars.HHGLookZ = entity.getZ();
			_vars.syncPlayerVariables(entity);
		}
	}
}