package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class ToggleSpecialHealthButtonProcedure {
	public static void execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).specialhealth == false) {
			EngiesChaosModVariables.MapVariables.get(world).specialhealth = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (EngiesChaosModVariables.MapVariables.get(world).specialhealth == true) {
			EngiesChaosModVariables.MapVariables.get(world).specialhealth = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
	}
}