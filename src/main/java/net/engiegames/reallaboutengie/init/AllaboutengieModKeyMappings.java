/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.engiegames.reallaboutengie.network.StunMessage;
import net.engiegames.reallaboutengie.network.DoubleJumpMessage;
import net.engiegames.reallaboutengie.AllaboutengieMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AllaboutengieModKeyMappings {
	public static final KeyMapping STUN = new KeyMapping("key.allaboutengie.stun", GLFW.GLFW_KEY_X, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new StunMessage(0, 0));
				StunMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DOUBLE_JUMP = new KeyMapping("key.allaboutengie.double_jump", GLFW.GLFW_KEY_SPACE, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new DoubleJumpMessage(0, 0));
				DoubleJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				DOUBLE_JUMP_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - DOUBLE_JUMP_LASTPRESS);
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new DoubleJumpMessage(1, dt));
				DoubleJumpMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long DOUBLE_JUMP_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(STUN);
		event.register(DOUBLE_JUMP);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				STUN.consumeClick();
				DOUBLE_JUMP.consumeClick();
			}
		}
	}
}