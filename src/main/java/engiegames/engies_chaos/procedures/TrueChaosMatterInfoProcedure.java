package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class TrueChaosMatterInfoProcedure {
	public static String execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == false) {
			if (EngiesChaosModVariables.MapVariables.get(world).truechaosenabledbydev == false) {
				return "\u00A74The only one that will be obtained. Right click to toggle True Chaos." + "\n" + "\u00A76CURRENTLY // " + "\u00A7cDISABLED";
			} else if (EngiesChaosModVariables.MapVariables.get(world).truechaosenabledbydev == true) {
				return "\u00A74The only one that will be obtained. Right click to toggle True Chaos." + "\n" + "\u00A76CURRENTLY // " + "\u00A7cDISABLED (DEVELOPER ENABLED)";
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).truechaosenabledbydev == false) {
				return "\u00A74The only one that will be obtained. Right click to toggle True Chaos." + "\n" + "\u00A76CURRENTLY // " + "\u00A7aENABLED";
			} else if (EngiesChaosModVariables.MapVariables.get(world).truechaosenabledbydev == true) {
				return "\u00A74The only one that will be obtained. Right click to toggle True Chaos." + "\n" + "\u00A76CURRENTLY // " + "\u00A7aENABLED (DEVELOPER ENABLED)";
			}
		}
		return "\u00A74The only one that will be obtained. Right click to toggle True Chaos." + "\n" + "\u00A76CURRENTLY // " + "\u00A7fUNKNOWN";
	}
}