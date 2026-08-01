package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class Difficulty26ReturnTrueCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 26) {
			return true;
		}
		return false;
	}
}