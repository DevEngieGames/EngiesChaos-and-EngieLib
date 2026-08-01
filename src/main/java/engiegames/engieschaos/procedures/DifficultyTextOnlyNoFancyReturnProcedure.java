package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

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
			return "\u00A7c" + "Mob " + "\u00A76" + "Difficulty: " + "\u00A7c" + new java.text.DecimalFormat("\u00A76##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		}
		return "\u00A74" + "Mob Difficulty: " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
	}
}