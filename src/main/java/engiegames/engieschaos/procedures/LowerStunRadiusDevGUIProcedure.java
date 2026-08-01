package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class LowerStunRadiusDevGUIProcedure {
	public static void execute(LevelAccessor world) {
		EngiesChaosModVariables.MapVariables.get(world).stunmobsradiusnum = EngiesChaosModVariables.MapVariables.get(world).stunmobsradiusnum - 1;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
	}
}