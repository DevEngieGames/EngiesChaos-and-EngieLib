package engiegames.engielib.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engielib.network.EngielibModVariables;

public class TimeCheckProcedure {
	public static void execute(LevelAccessor world) {
		if (EngielibModVariables.MapVariables.get(world).stoptimecheckduetospecial == false) {
			EngielibModVariables.MapVariables.get(world).timebeforespecial = world.dayTime();
			EngielibModVariables.MapVariables.get(world).syncData(world);
		}
	}
}