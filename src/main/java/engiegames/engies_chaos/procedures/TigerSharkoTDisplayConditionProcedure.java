package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.TigerSharkoEntity;

public class TigerSharkoTDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!((entity.getDisplayName().getString()).equals("Tiger") || (entity.getDisplayName().getString()).equals("Void") || (entity.getDisplayName().getString()).equals("Smokey") || (entity.getDisplayName().getString()).equals("Tony")
				|| (entity.getDisplayName().getString()).equals("Champ") || (entity.getDisplayName().getString()).equals("Rocky") || (entity.getDisplayName().getString()).equals("Techno"))
				&& (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof TigerSharkoEntity _datEntI ? _datEntI.getEntityData().get(TigerSharkoEntity.DATA_SharkoState) : 0) == 0) {
			return true;
		}
		return false;
	}
}