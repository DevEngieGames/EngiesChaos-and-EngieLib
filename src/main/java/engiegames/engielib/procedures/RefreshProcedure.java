package engiegames.engielib.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engielib.network.EngielibModVariables;

public class RefreshProcedure {
	public static void execute(LevelAccessor world) {
		EngielibModVariables.MapVariables.get(world).stoptimecheckduetospecial = false;
		EngielibModVariables.MapVariables.get(world).syncData(world);
		EngielibModVariables.MapVariables.get(world).onlyrunonce = false;
		EngielibModVariables.MapVariables.get(world).syncData(world);
		EngielibModVariables.MapVariables.get(world).endgamelootstart = false;
		EngielibModVariables.MapVariables.get(world).syncData(world);
	}
}