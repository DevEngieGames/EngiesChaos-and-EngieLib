package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class DifficultyToggleOffProcedure {
	public static void execute(LevelAccessor world) {
		EngiesChaosModVariables.MapVariables.get(world).difficultytoggle = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
	}
}