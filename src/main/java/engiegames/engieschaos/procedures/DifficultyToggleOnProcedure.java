package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class DifficultyToggleOnProcedure {
	public static void execute(LevelAccessor world) {
		EngiesChaosModVariables.MapVariables.get(world).difficultytoggle = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
	}
}