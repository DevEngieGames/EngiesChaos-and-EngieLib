/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engieschaos.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import engiegames.engieschaos.network.TrashGUIMessage;
import engiegames.engieschaos.network.StunMessage;
import engiegames.engieschaos.network.OpenREAAEConfigMessage;
import engiegames.engieschaos.network.DoubleJumpMessage;
import engiegames.engieschaos.network.DevModeGUIMessage;
import engiegames.engieschaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EngiesChaosModKeyMappings {
	public static final KeyMapping STUN = new KeyMapping("key.engies_chaos.stun", GLFW.GLFW_KEY_X, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new StunMessage(0, 0));
				StunMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DOUBLE_JUMP = new KeyMapping("key.engies_chaos.double_jump", GLFW.GLFW_KEY_SPACE, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DoubleJumpMessage(0, 0));
				DoubleJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				DOUBLE_JUMP_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - DOUBLE_JUMP_LASTPRESS);
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DoubleJumpMessage(1, dt));
				DoubleJumpMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DEV_MODE_GUI = new KeyMapping("key.engies_chaos.dev_mode_gui", GLFW.GLFW_KEY_K, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DevModeGUIMessage(0, 0));
				DevModeGUIMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_REAAE_CONFIG = new KeyMapping("key.engies_chaos.open_reaae_config", GLFW.GLFW_KEY_O, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new OpenREAAEConfigMessage(0, 0));
				OpenREAAEConfigMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TRASH_GUI = new KeyMapping("key.engies_chaos.trash_gui", GLFW.GLFW_KEY_T, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TRASH_GUI_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - TRASH_GUI_LASTPRESS);
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new TrashGUIMessage(1, dt));
				TrashGUIMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long DOUBLE_JUMP_LASTPRESS = 0;
	private static long TRASH_GUI_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(STUN);
		event.register(DOUBLE_JUMP);
		event.register(DEV_MODE_GUI);
		event.register(OPEN_REAAE_CONFIG);
		event.register(TRASH_GUI);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				STUN.consumeClick();
				DOUBLE_JUMP.consumeClick();
				DEV_MODE_GUI.consumeClick();
				OPEN_REAAE_CONFIG.consumeClick();
				TRASH_GUI.consumeClick();
			}
		}
	}
}