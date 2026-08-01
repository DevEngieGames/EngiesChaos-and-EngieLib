package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModGameRules;

@Mod.EventBusSubscriber
public class OhNoProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).OHNO == false) {
				if (Math.random() >= 0.25) {
					EngiesChaosModVariables.MapVariables.get(world).Risk = 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (Math.random() >= 0.5 && Math.random() < 0.25) {
					EngiesChaosModVariables.MapVariables.get(world).Risk = 2;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (Math.random() >= 0.75 && Math.random() < 0.5) {
					EngiesChaosModVariables.MapVariables.get(world).Risk = 3;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (Math.random() >= 1 && Math.random() < 0.75) {
					EngiesChaosModVariables.MapVariables.get(world).Risk = 4;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}