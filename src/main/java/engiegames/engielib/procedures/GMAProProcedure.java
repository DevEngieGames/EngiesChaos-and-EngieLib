package engiegames.engielib.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

public class GMAProProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.hasPermissions(4) || entity.hasPermissions(3) || entity.hasPermissions(2)) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.ADVENTURE);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u00A76gmc, gms, gmsp for other modes"), false);
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to people with command level 2 and above."), false);
		}
	}
}