package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerJoinWorldWithIncompatibleModProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ModList.get().isLoaded("fallingtree")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cYou have FallingTree installed which is incompatible, however to make sure that it works as intented TreeMiner for RE:All About Engie has been disabled to save some time."),
						false);
			AllaboutengieModVariables.MapVariables.get(world).FallingTreeInstalled = true;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		} else {
			AllaboutengieModVariables.MapVariables.get(world).FallingTreeInstalled = false;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
		if (ModList.get().isLoaded("veinminer") || ModList.get().isLoaded("oreexcavation") || ModList.get().isLoaded("oreharvester")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cYou have a VeinMiner mod installed which is incompatible, however to make sure that it works as intented VeinMiner for RE:All About Engie has been disabled to save some time."),
						false);
			AllaboutengieModVariables.MapVariables.get(world).VeinMinerInstalled = true;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		} else {
			AllaboutengieModVariables.MapVariables.get(world).VeinMinerInstalled = false;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
	}
}