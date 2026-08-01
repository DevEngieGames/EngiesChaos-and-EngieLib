package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class DoomsdayDeadCountUICheckProcedure {
	public static String execute(LevelAccessor world) {
		return new java.text.DecimalFormat("##").format(AllaboutengieModVariables.MapVariables.get(world).DoomsdayDeathCount);
	}
}