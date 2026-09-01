package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ConfigButtonMobHPBaseMult2Procedure {
	public static void execute(LevelAccessor world) {
		EngiesChaosModVariables.MapVariables.get(world).mobbasehpmulttoggle = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
	}
}