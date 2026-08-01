package engiegames.engies_chaos.procedures;

import java.util.Calendar;

public class MobModelScalingProcedure {
	public static double execute() {
		if (Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 7) {
			return 0.18;
		} else if (!(Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 7)) {
			return 0.93;
		}
		return 0.93;
	}
}