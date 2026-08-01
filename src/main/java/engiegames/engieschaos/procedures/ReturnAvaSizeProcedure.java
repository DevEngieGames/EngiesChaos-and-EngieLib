package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.DDayAvalancheEntity;

public class ReturnAvaSizeProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity instanceof DDayAvalancheEntity _datEntI ? _datEntI.getEntityData().get(DDayAvalancheEntity.DATA_scale) : 0;
	}
}