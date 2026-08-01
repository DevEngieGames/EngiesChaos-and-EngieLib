package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModGameRules;

@Mod.EventBusSubscriber
public class WorldCreateProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == true) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).truehardcorelifesobtained == false) {
				{
					double _setval = (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT));
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TrueHardcoreLifeCount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT));
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TrueHardcoreMaxLifeCount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.truehardcorelifesobtained = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}