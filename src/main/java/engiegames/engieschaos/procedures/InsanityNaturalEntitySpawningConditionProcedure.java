package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class InsanityNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).BYEBYE == true) {
			return true;
		} else if (EngiesChaosModVariables.MapVariables.get(world).BYEBYE == false) {
			return false;
		}
		return true;
	}
}