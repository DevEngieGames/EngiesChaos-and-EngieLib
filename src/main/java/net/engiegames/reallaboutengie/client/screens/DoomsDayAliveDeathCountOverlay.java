package net.engiegames.reallaboutengie.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.engiegames.reallaboutengie.procedures.DoomsDayDeadOverlayCheckProcedure;
import net.engiegames.reallaboutengie.procedures.DoomsDayDeadCheckProcedure;
import net.engiegames.reallaboutengie.procedures.DoomsDayAliveOverlayCheckProcedure;
import net.engiegames.reallaboutengie.procedures.DoomsDayAliveDeathCountDisplayOverlayIngameProcedure;
import net.engiegames.reallaboutengie.procedures.DoomsDayAliveCheckProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DoomsDayAliveDeathCountOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (DoomsDayAliveDeathCountDisplayOverlayIngameProcedure.execute(world)) {
			if (DoomsDayAliveOverlayCheckProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsDayAliveCheckProcedure.execute(entity), w / 2 + -213, h / 2 + -120, -16711936);
			if (DoomsDayDeadOverlayCheckProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsDayDeadCheckProcedure.execute(entity), w / 2 + -213, h / 2 + -120, -65536);
		}
	}
}