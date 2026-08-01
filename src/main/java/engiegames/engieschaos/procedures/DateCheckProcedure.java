package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import java.util.Calendar;

import engiegames.engieschaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class DateCheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!world.isClientSide()) {
			if (Calendar.getInstance().get(Calendar.MONTH) >= 4 && Calendar.getInstance().get(Calendar.MONTH) <= 5) {
				if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
					EngiesChaosModVariables.MapVariables.get(world).Birthday = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).Birthday = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (!(Calendar.getInstance().get(Calendar.MONTH) >= 4 && Calendar.getInstance().get(Calendar.MONTH) <= 5)) {
				EngiesChaosModVariables.MapVariables.get(world).Birthday = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 2 && Calendar.getInstance().get(Calendar.MONTH) < 5) {
				EngiesChaosModVariables.MapVariables.get(world).seasonspring = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonsummer = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonautumn = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonwinter = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 5 && Calendar.getInstance().get(Calendar.MONTH) < 8) {
				EngiesChaosModVariables.MapVariables.get(world).seasonspring = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonsummer = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonautumn = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonwinter = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 8 && Calendar.getInstance().get(Calendar.MONTH) < 11) {
				EngiesChaosModVariables.MapVariables.get(world).seasonspring = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonsummer = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonautumn = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonwinter = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 11 || Calendar.getInstance().get(Calendar.MONTH) < 2) {
				EngiesChaosModVariables.MapVariables.get(world).seasonspring = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonsummer = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonautumn = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonwinter = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (Calendar.getInstance().get(Calendar.MONTH) >= 11) {
					if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
						if (EngiesChaosModVariables.decembercodeblock == false) {
							EngiesChaosModVariables.decembercodeblock = true;
						}
					} else {
						if (EngiesChaosModVariables.decembercodeblock == true) {
							EngiesChaosModVariables.decembercodeblock = false;
						}
					}
				} else {
					if (EngiesChaosModVariables.decembercodeblock == true) {
						EngiesChaosModVariables.decembercodeblock = false;
					}
				}
			}
		}
	}
}