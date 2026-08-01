package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class PlayerDiesChallengeProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true) {
			if (entity instanceof Player) {
				if (EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain == false) {
					EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					entity.getPersistentData().putDouble("plushtimeuntildeathforall", 0);
				}
			}
		}
	}
}