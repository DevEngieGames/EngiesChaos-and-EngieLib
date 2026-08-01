package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerRandomNumberForFunFactProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (Mth.nextDouble(RandomSource.create(), 1, 25) == 25) {
			if (Mth.nextDouble(RandomSource.create(), 1, 5) == 1) {
				AllaboutengieModVariables.MapVariables.get(world).FunFactNumber = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (Mth.nextDouble(RandomSource.create(), 1, 5) == 2) {
				AllaboutengieModVariables.MapVariables.get(world).FunFactNumber = 2;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (Mth.nextDouble(RandomSource.create(), 1, 5) == 3) {
				AllaboutengieModVariables.MapVariables.get(world).FunFactNumber = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (Mth.nextDouble(RandomSource.create(), 1, 5) == 4) {
				AllaboutengieModVariables.MapVariables.get(world).FunFactNumber = 4;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (Mth.nextDouble(RandomSource.create(), 1, 5) == 5) {
				AllaboutengieModVariables.MapVariables.get(world).FunFactNumber = 5;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (!(Mth.nextDouble(RandomSource.create(), 1, 25) == 25)) {
			AllaboutengieModVariables.MapVariables.get(world).FunFactNumber = 0;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
	}
}