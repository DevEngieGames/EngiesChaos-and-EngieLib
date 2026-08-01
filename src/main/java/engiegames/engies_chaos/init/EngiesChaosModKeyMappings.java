/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import engiegames.engies_chaos.network.TrashGUIMessage;
import engiegames.engies_chaos.network.StunMessage;
import engiegames.engies_chaos.network.OpenREAAEConfigMessage;
import engiegames.engies_chaos.network.DoubleJumpMessage;
import engiegames.engies_chaos.network.DevModeGUIMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EngiesChaosModKeyMappings {
	public static final KeyMapping STUN = new KeyMapping("key.engies_chaos.stun", GLFW.GLFW_KEY_X, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new StunMessage(0, 0));
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
				PacketDistributor.sendToServer(new DoubleJumpMessage(0, 0));
				DoubleJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				DOUBLE_JUMP_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - DOUBLE_JUMP_LASTPRESS);
				PacketDistributor.sendToServer(new DoubleJumpMessage(1, dt));
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
				PacketDistributor.sendToServer(new DevModeGUIMessage(0, 0));
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
				PacketDistributor.sendToServer(new OpenREAAEConfigMessage(0, 0));
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
				PacketDistributor.sendToServer(new TrashGUIMessage(1, dt));
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

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
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