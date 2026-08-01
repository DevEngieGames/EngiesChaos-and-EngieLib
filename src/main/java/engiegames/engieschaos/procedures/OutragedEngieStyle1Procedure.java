package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.AngryCreatorEntity;

public class OutragedEngieStyle1Procedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof AngryCreatorEntity _datEntI ? _datEntI.getEntityData().get(AngryCreatorEntity.DATA_style) : 0) == 1
				&& !(EngiesChaosModVariables.MapVariables.get(world).seasonautumn == true || EngiesChaosModVariables.MapVariables.get(world).seasonwinter == true)) {
			return true;
		}
		return false;
	}
}