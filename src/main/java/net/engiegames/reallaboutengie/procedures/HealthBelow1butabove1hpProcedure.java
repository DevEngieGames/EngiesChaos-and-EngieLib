package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class HealthBelow1butabove1hpProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (Math.round(((double) (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) * 100) <= 1
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 1) {
			return true;
		}
		return false;
	}
}