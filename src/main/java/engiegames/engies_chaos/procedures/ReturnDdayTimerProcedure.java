package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ReturnDdayTimerProcedure {
	public static String execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds >= 10) {
				return new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes) + ":" + new java.text.DecimalFormat("##.##").format(EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds);
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds < 10) {
				return new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes) + ":0" + new java.text.DecimalFormat("##.##").format(EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds);
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds >= 10) {
				return new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes) + ":" + new java.text.DecimalFormat("##.##").format(EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds);
			} else if (EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds < 10) {
				return new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes) + ":0"
						+ new java.text.DecimalFormat("##.##").format(EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds);
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds >= 10) {
				return new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes) + ":"
						+ new java.text.DecimalFormat("##.##").format(EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds);
			} else if (EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds < 10) {
				return new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes) + ":0"
						+ new java.text.DecimalFormat("##.##").format(EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds);
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds >= 10) {
				return new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes) + ":"
						+ new java.text.DecimalFormat("##.##").format(EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds);
			} else if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds < 10) {
				return new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes) + ":0"
						+ new java.text.DecimalFormat("##.##").format(EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds);
			}
		}
		return "##:##.##";
	}
}