package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerRespawnsChallengeProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == true) {
			if (AllaboutengieModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain == true) {
				AllaboutengieModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}