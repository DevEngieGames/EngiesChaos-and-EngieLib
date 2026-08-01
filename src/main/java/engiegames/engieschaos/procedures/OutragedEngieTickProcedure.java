package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import java.util.Calendar;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.entity.AngryCreatorEntity;

public class OutragedEngieTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).seasonautumn == true || EngiesChaosModVariables.MapVariables.get(world).seasonwinter == true) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 9 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
				if (entity instanceof AngryCreatorEntity _datEntSetL)
					_datEntSetL.getEntityData().set(AngryCreatorEntity.DATA_coldseasoned, false);
				if (entity instanceof AngryCreatorEntity _datEntSetL)
					_datEntSetL.getEntityData().set(AngryCreatorEntity.DATA_holloweened, true);
			} else if (!(Calendar.getInstance().get(Calendar.MONTH) == 9 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25)) {
				if (entity instanceof AngryCreatorEntity _datEntSetL)
					_datEntSetL.getEntityData().set(AngryCreatorEntity.DATA_coldseasoned, true);
				if (entity instanceof AngryCreatorEntity _datEntSetL)
					_datEntSetL.getEntityData().set(AngryCreatorEntity.DATA_holloweened, false);
			}
		} else {
			if (entity instanceof AngryCreatorEntity _datEntSetL)
				_datEntSetL.getEntityData().set(AngryCreatorEntity.DATA_coldseasoned, false);
		}
	}
}