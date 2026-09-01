package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ConfigButtonMobHPBaseMult1Procedure {
	public static void execute(LevelAccessor world) {
		EngiesChaosModVariables.MapVariables.get(world).mobbasehpmulttoggle = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
	}
}