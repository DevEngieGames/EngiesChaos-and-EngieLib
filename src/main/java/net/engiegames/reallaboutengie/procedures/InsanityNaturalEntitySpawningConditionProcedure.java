package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class InsanityNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).BYEBYE == true) {
			return true;
		} else if (AllaboutengieModVariables.MapVariables.get(world).BYEBYE == false) {
			return false;
		}
		return true;
	}
}