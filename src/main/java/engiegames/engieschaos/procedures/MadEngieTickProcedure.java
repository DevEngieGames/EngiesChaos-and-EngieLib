package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.entity.MadEngieEntity;

public class MadEngieTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).seasonautumn == true || EngiesChaosModVariables.MapVariables.get(world).seasonwinter == true) {
			if (entity instanceof MadEngieEntity _datEntSetL)
				_datEntSetL.getEntityData().set(MadEngieEntity.DATA_coldseasoned, true);
		} else {
			if (entity instanceof MadEngieEntity _datEntSetL)
				_datEntSetL.getEntityData().set(MadEngieEntity.DATA_coldseasoned, false);
		}
	}
}