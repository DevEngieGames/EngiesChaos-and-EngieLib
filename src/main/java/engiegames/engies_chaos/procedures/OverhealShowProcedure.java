package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class OverhealShowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + (entity instanceof Player _plr ? _plr.getAbsorptionAmount() : 0) > (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
			return true;
		}
		return false;
	}
}