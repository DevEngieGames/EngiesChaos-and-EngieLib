package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.AprilFoolsTigerSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsRareSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsRareEngieSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsMythicSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsLegendarySharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsExoticSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsEngieSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsAlbinoSharkoEntity;

public class AprilFoolsSharkoTamedDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof AprilFoolsSharkoEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof AprilFoolsSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(AprilFoolsSharkoEntity.DATA_laying)) == false) {
			return true;
		} else if (entity instanceof AprilFoolsAlbinoSharkoEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof AprilFoolsAlbinoSharkoEntity _datEntL5 && _datEntL5.getEntityData().get(AprilFoolsAlbinoSharkoEntity.DATA_laying)) == false) {
			return true;
		} else if (entity instanceof AprilFoolsRareSharkoEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof AprilFoolsRareSharkoEntity _datEntL8 && _datEntL8.getEntityData().get(AprilFoolsRareSharkoEntity.DATA_laying)) == false) {
			return true;
		} else if (entity instanceof AprilFoolsLegendarySharkoEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof AprilFoolsLegendarySharkoEntity _datEntL11 && _datEntL11.getEntityData().get(AprilFoolsLegendarySharkoEntity.DATA_laying)) == false) {
			return true;
		} else if (entity instanceof AprilFoolsMythicSharkoEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof AprilFoolsMythicSharkoEntity _datEntL14 && _datEntL14.getEntityData().get(AprilFoolsMythicSharkoEntity.DATA_laying)) == false) {
			return true;
		} else if (entity instanceof AprilFoolsExoticSharkoEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof AprilFoolsExoticSharkoEntity _datEntL17 && _datEntL17.getEntityData().get(AprilFoolsExoticSharkoEntity.DATA_laying)) == false) {
			return true;
		} else if (entity instanceof AprilFoolsEngieSharkoEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof AprilFoolsEngieSharkoEntity _datEntL20 && _datEntL20.getEntityData().get(AprilFoolsEngieSharkoEntity.DATA_laying)) == false) {
			return true;
		} else if (entity instanceof AprilFoolsRareEngieSharkoEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof AprilFoolsRareEngieSharkoEntity _datEntL23 && _datEntL23.getEntityData().get(AprilFoolsRareEngieSharkoEntity.DATA_laying)) == false) {
			return true;
		} else if (entity instanceof AprilFoolsTigerSharkoEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof AprilFoolsTigerSharkoEntity _datEntL26 && _datEntL26.getEntityData().get(AprilFoolsTigerSharkoEntity.DATA_laying)) == false) {
			return true;
		}
		return false;
	}
}