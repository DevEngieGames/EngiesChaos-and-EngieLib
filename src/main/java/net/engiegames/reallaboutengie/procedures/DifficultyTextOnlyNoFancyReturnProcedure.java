package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class DifficultyTextOnlyNoFancyReturnProcedure {
	public static String execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty <= 7) {
			return "\u00A74" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(AllaboutengieModVariables.MapVariables.get(world).MobDifficulty);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty > 7 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty <= 14) {
			return "\u00A7c" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(AllaboutengieModVariables.MapVariables.get(world).MobDifficulty);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty > 14 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty <= 22) {
			return "\u00A75" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(AllaboutengieModVariables.MapVariables.get(world).MobDifficulty);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty > 22 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty <= 29) {
			return "\u00A7d" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(AllaboutengieModVariables.MapVariables.get(world).MobDifficulty);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 30) {
			return "\u00A7e" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(AllaboutengieModVariables.MapVariables.get(world).MobDifficulty);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 31 || AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 32) {
			return "\u00A7c" + "Mob " + "\u00A76" + "Difficulty: " + "\u00A7c" + new java.text.DecimalFormat("\u00A76##").format(AllaboutengieModVariables.MapVariables.get(world).MobDifficulty);
		}
		return "\u00A74" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(AllaboutengieModVariables.MapVariables.get(world).MobDifficulty);
	}
}