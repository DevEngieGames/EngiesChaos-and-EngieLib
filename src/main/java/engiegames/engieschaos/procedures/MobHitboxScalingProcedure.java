package engiegames.engieschaos.procedures;

import java.util.Calendar;

public class MobHitboxScalingProcedure {
	public static double execute() {
		if (Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 7) {
			return 0.25;
		} else if (!(Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 7)) {
			return 1;
		}
		return 1;
	}
}