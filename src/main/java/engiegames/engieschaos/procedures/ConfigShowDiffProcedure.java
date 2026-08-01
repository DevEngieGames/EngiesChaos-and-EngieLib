package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class ConfigShowDiffProcedure {
	public static String execute(LevelAccessor world) {
		if (ModList.get().isLoaded("attributefix")) {
			return new java.text.DecimalFormat("###,###").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		}
		return "ERR.ATTRIBUTEFIXNOTINSTALLED";
	}
}