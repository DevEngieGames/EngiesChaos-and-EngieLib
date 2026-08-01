package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class HeWhoGamesNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).hewhowatches == true) {
			if (Math.random() <= 0.005) {
				return true;
			} else if (EngiesChaosModVariables.MapVariables.get(world).nightmare >= 25) {
				return false;
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).hewhowatches == false) {
			return false;
		}
		return false;
	}
}