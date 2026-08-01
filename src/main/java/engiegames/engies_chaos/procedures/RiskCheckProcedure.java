package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class RiskCheckProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE)) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 5) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7f" + "While the chances are below 5%, Doomsday cannot occur! Enjoy having a break!")), false);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7f" + "The current chance of Doomsday spawning is: " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")),
							false);
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 5 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 15) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A72" + "While the chances are slim but not zero, it is unlikely the world will end anytime soon.")), false);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A72" + "The current chance of Doomsday spawning is: " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")),
							false);
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 15 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 25) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A76" + "There is a reasonable chance the world could see its end fairly soon.")), false);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A76" + "The current chance of Doomsday spawning is: " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")),
							false);
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 25 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 35) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7c" + "The world is due to end any day now.")), false);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7c" + "The current chance of Doomsday spawning is: " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")),
							false);
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 35 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 75) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A78" + "The chances of the world ending as astronomically high")), false);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A78" + "The current chance of Doomsday spawning is: " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")),
							false);
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 75) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A70" + "The chances of the world ending are right around the corner.")), false);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A70" + "The current chance of Doomsday spawning is: " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance))), false);
			}
		}
	}
}