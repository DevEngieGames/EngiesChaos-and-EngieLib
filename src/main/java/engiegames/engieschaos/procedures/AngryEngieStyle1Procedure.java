package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.AngryEngieEntity;

public class AngryEngieStyle1Procedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof AngryEngieEntity _datEntI ? _datEntI.getEntityData().get(AngryEngieEntity.DATA_style) : 0) == 1
				&& !(EngiesChaosModVariables.MapVariables.get(world).seasonautumn == true || EngiesChaosModVariables.MapVariables.get(world).seasonwinter == true)) {
			return true;
		}
		return false;
	}
}