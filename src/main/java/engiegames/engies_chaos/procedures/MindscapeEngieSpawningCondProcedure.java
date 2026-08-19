package engiegames.engies_chaos.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class MindscapeEngieSpawningCondProcedure {
	public static boolean execute() {
		if (Mth.nextDouble(RandomSource.create(), 0, 101) <= 10) {
			return true;
		}
		return false;
	}
}