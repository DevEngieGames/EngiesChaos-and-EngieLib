package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

import java.util.Calendar;

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
					AllaboutengieModVariables.MapVariables.get(world).Birthday = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else {
					AllaboutengieModVariables.MapVariables.get(world).Birthday = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (!(Calendar.getInstance().get(Calendar.MONTH) >= 4 && Calendar.getInstance().get(Calendar.MONTH) <= 5)) {
				AllaboutengieModVariables.MapVariables.get(world).Birthday = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 2 && Calendar.getInstance().get(Calendar.MONTH) < 5) {
				AllaboutengieModVariables.MapVariables.get(world).seasonspring = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonsummer = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonautumn = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonwinter = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 5 && Calendar.getInstance().get(Calendar.MONTH) < 8) {
				AllaboutengieModVariables.MapVariables.get(world).seasonspring = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonsummer = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonautumn = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonwinter = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 8 && Calendar.getInstance().get(Calendar.MONTH) < 11) {
				AllaboutengieModVariables.MapVariables.get(world).seasonspring = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonsummer = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonautumn = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonwinter = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 11 || Calendar.getInstance().get(Calendar.MONTH) < 2) {
				AllaboutengieModVariables.MapVariables.get(world).seasonspring = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonsummer = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonautumn = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).seasonwinter = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				if (Calendar.getInstance().get(Calendar.MONTH) >= 11) {
					if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
						if (AllaboutengieModVariables.decembercodeblock == false) {
							AllaboutengieModVariables.decembercodeblock = true;
						}
					} else {
						if (AllaboutengieModVariables.decembercodeblock == true) {
							AllaboutengieModVariables.decembercodeblock = false;
						}
					}
				} else {
					if (AllaboutengieModVariables.decembercodeblock == true) {
						AllaboutengieModVariables.decembercodeblock = false;
					}
				}
			}
		}
	}
}