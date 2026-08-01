package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

public class ChallengeInsanityEngiePlushRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("plushtimeuntildeathforall", 0);
	}
}