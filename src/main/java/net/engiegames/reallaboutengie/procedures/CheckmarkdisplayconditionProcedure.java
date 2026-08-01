package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class CheckmarkdisplayconditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).checkboxbothnomarked == true) {
			return true;
		} else if (AllaboutengieModVariables.MapVariables.get(world).checkboxbothnomarked == false) {
			return false;
		}
		return false;
	}
}