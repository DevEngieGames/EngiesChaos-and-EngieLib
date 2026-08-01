package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

public class TigerSharkoScaleTypeProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity.getDisplayName().getString()).equals("Techno")) {
			return 1.5;
		} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
			return 1.25;
		} else if (!((entity.getDisplayName().getString()).equals("Techno") || (entity.getDisplayName().getString()).equals("Tiger"))) {
			return 1;
		}
		return 1;
	}
}