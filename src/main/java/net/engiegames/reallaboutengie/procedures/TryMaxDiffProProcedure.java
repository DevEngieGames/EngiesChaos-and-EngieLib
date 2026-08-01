package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class TryMaxDiffProProcedure {
	public static void execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).playersaidyestotrymaxdiff != world.players().size()) {
			AllaboutengieModVariables.MapVariables.get(world).playersaidyestotrymaxdiff = AllaboutengieModVariables.MapVariables.get(world).playersaidyestotrymaxdiff + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
		AllaboutengieMod.queueServerWork(1, () -> {
			if (AllaboutengieModVariables.MapVariables.get(world).playersaidyestotrymaxdiff == world.players().size()) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 525) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		});
	}
}