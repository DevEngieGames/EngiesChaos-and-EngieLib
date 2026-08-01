package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.MonstrosityEngieEntity;

public class MonstrosityEngieStyle2Procedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof MonstrosityEngieEntity _datEntI ? _datEntI.getEntityData().get(MonstrosityEngieEntity.DATA_style) : 0) == 2
				&& !(EngiesChaosModVariables.MapVariables.get(world).seasonautumn == true || EngiesChaosModVariables.MapVariables.get(world).seasonwinter == true)) {
			return true;
		}
		return false;
	}
}