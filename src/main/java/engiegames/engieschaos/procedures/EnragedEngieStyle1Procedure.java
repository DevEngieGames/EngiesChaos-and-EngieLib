package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.EnragedEngieEntity;

public class EnragedEngieStyle1Procedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof EnragedEngieEntity _datEntI ? _datEntI.getEntityData().get(EnragedEngieEntity.DATA_style) : 0) == 1
				&& !(EngiesChaosModVariables.MapVariables.get(world).seasonautumn == true || EngiesChaosModVariables.MapVariables.get(world).seasonwinter == true)) {
			return true;
		}
		return false;
	}
}