package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class DoomsDayMobsFightEachotherToggleProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
			return true;
		} else if (AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
			return true;
		}
		return false;
	}
}