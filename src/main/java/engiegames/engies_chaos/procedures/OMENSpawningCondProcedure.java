package engiegames.engies_chaos.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class OMENSpawningCondProcedure {
	public static boolean execute() {
		if (Mth.nextDouble(RandomSource.create(), 0, 101) <= 0.01) {
			return true;
		}
		return false;
	}
}