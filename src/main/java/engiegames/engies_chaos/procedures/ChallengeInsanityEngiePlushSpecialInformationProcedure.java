package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class ChallengeInsanityEngiePlushSpecialInformationProcedure {
	public static String execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE) == false
				|| EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true) {
			return "DO NOT LET IT GET TOO BORED. THERE WILL BE CONSEQUENCES." + "\n" + "(Right Click interaction required.)";
		} else if (!(world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE) == false
				|| EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true)) {
			return "Filled with boredom.";
		}
		return "meh";
	}
}