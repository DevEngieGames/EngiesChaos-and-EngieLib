package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class DifficultyToggledOnCheck2Procedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (ModList.get().isLoaded("attributefix") && EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true
				&& ((entity instanceof LivingEntity _teamEnt && _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("EngiesChaos_Dev") || entity.hasPermissions(4))) {
			return true;
		}
		return false;
	}
}