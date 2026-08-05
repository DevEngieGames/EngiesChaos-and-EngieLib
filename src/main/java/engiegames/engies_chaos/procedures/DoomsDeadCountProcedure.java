package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DoomsDeadCountProcedure {
	public static String execute(LevelAccessor world) {
		return new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount);
	}
}