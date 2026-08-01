package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class StunRadiusGetForDevGUIProcedure {
	public static String execute(LevelAccessor world) {
		return "Radius: " + new java.text.DecimalFormat("######").format(EngiesChaosModVariables.MapVariables.get(world).stunmobsradiusnum);
	}
}