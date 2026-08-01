package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class DenymarkdisplayconditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).checkboxbothmarked == true) {
			return true;
		} else if (AllaboutengieModVariables.MapVariables.get(world).checkboxbothmarked == false) {
			return false;
		}
		return false;
	}
}