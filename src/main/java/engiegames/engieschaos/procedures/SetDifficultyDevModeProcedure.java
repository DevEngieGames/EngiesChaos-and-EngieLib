package engiegames.engieschaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModMenus;

public class SetDifficultyDevModeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert((entity instanceof Player _entity0 && _entity0.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(0, "number", "") : "");
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
	}
}