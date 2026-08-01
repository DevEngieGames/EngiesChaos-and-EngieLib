package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DifficultyTextOnlyNoFancyReturnProcedure {
	public static String execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 7) {
			return "\u00A74" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty > 7 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 14) {
			return "\u00A7c" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty > 14 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 22) {
			return "\u00A75" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty > 22 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 29) {
			return "\u00A7d" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 30) {
			return "\u00A7e" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 31 || EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 32) {
			return "\u00A7c" + "Mob " + "\u00A76" + "Difficulty: " + "\u00A7c" + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 33) {
			return "\u00A7f" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 34) {
			return "\u00A74" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 250000) {
			return "\u00A74" + "ERR.DISTORTED";
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 500000) {
			return "\u00A74" + "ERR.TORMENT";
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525000) {
			return "\u00A76" + "E R R . E N G I E";
		}
		return "\u00A74" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
	}
}