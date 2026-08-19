package engiegames.engies_chaos.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class ShadowSharkSpawningCondProcedure {
	public static boolean execute() {
		if (Mth.nextDouble(RandomSource.create(), 0, 101) <= 0.1) {
			return true;
		}
		return false;
	}
}