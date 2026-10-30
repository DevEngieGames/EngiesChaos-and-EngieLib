package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ChallengeInsanityEngiePlushSpecialInformationProcedure {
	public static String execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).engiepocenabled == true && EngiesChaosModVariables.MapVariables.get(world).ambiencemodeenabled == false || EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true) {
			return "DO NOT LET IT GET TOO BORED. THERE WILL BE CONSEQUENCES." + "\n" + "(Right Click interaction required.)";
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).engiepocenabled == true && EngiesChaosModVariables.MapVariables.get(world).ambiencemodeenabled == false
				|| EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true)) {
			return "Filled with boredom.";
		}
		return "meh";
	}
}