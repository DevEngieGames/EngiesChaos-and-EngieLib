package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

import java.util.Calendar;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

@EventBusSubscriber
public class OhNoProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE)) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).OHNO == false) {
				if (!(Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 7
						|| Calendar.getInstance().get(Calendar.MONTH) == 4 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 31)) {
					if (Math.random() < 0.25) {
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 6.25;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (Math.random() >= 0.25 && Math.random() < 0.5) {
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 12.5;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (Math.random() >= 0.5 && Math.random() < 0.75) {
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 18.75;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (Math.random() >= 0.75) {
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 25;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 7) {
					EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 12.5;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (Calendar.getInstance().get(Calendar.MONTH) == 4 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 31) {
					if (Math.random() < 0.5) {
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 18.75;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (Math.random() >= 0.5) {
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 25;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}