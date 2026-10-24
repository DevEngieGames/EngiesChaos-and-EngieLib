package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ChallengeInsanityEngiePlushRightclickedProcedure {
	public static void execute(LevelAccessor world) {
		EngiesChaosModVariables.MapVariables.get(world).plushtimeuntildeathforall = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).warnonce = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
	}
}