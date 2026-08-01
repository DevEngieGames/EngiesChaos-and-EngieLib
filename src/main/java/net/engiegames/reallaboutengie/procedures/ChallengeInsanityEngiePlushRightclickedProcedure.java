package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.entity.Entity;

public class ChallengeInsanityEngiePlushRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("plushtimeuntildeathforall", 0);
	}
}