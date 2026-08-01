package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class Difficulty012ReturnTrueCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 0 || AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1 || AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
			return true;
		}
		return false;
	}
}