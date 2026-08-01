package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.init.AllaboutengieModGameRules;

public class EngieGamesDetectiveNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE) == true) {
			return true;
		}
		return false;
	}
}