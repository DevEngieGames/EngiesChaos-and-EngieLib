package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class PlayerLeavesWorldProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((EngiesChaosModVariables.MapVariables.get(world).ddaystart || EngiesChaosModVariables.MapVariables.get(world).sddaystart || EngiesChaosModVariables.MapVariables.get(world).thestart
				|| EngiesChaosModVariables.MapVariables.get(world).engieswrathstart) == true
				&& !(world.getServer() != null ? world.getServer().isSingleplayer() : (Minecraft.getInstance().getSingleplayerServer() != null && !Minecraft.getInstance().getSingleplayerServer().isPublished()))) {
			EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount = EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount - 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount = EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if ((EngiesChaosModVariables.MapVariables.get(world).ddaystart || EngiesChaosModVariables.MapVariables.get(world).sddaystart || EngiesChaosModVariables.MapVariables.get(world).thestart
				|| EngiesChaosModVariables.MapVariables.get(world).engieswrathstart) == true
				&& (world.getServer() != null ? world.getServer().isSingleplayer() : (Minecraft.getInstance().getSingleplayerServer() != null && !Minecraft.getInstance().getSingleplayerServer().isPublished()))) {
			if (!(EngiesChaosModVariables.MapVariables.get(world).userids).equals("")) {
				EngiesChaosModVariables.MapVariables.get(world).userids = EngiesChaosModVariables.MapVariables.get(world).userids + "" + entity.getUUID() + ", ";
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).userids = entity.getUUID() + ", ";
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}