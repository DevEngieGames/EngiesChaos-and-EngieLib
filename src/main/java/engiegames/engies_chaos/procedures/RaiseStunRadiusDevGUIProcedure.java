package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class RaiseStunRadiusDevGUIProcedure {
	public static void execute(LevelAccessor world) {
		EngiesChaosModVariables.MapVariables.get(world).stunmobsradiusnum = EngiesChaosModVariables.MapVariables.get(world).stunmobsradiusnum + 1;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
	}
}