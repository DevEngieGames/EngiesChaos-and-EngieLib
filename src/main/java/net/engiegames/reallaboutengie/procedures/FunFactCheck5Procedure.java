package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FunFactCheck5Procedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level);
	}

	public static boolean execute(LevelAccessor world) {
		return execute(null, world);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).FunFactNumber == 5) {
			return true;
		}
		return false;
	}
}