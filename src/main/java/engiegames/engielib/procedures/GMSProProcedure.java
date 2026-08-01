package engiegames.engielib.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

public class GMSProProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerCmd0 && _playerCmd0.hasPermissions(4) || entity instanceof Player _playerCmd1 && _playerCmd1.hasPermissions(3) || entity instanceof Player _playerCmd2 && _playerCmd2.hasPermissions(2)) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SURVIVAL);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A76gmc, gmsp, gma for other modes"), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to people with command level 2 and above."), false);
		}
	}
}