package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class Difficulty15to29ReturnTrueCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty <= 29) {
			return true;
		}
		return false;
	}
}