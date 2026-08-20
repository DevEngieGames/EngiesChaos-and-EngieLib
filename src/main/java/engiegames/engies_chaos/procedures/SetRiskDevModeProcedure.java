package engiegames.engies_chaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.EngiesChaosMod;

public class SetRiskDevModeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert((entity instanceof Player _entity0 && _entity0.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(0, "number", "") : "");
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosMod.LOGGER.info((entity.getDisplayName().getString() + " set the Doomsday risk % to " + new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert((entity instanceof Player _entity2 && _entity2.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "number", "") : "")));
	}
}