package engiegames.engies_chaos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;

import engiegames.engies_chaos.world.inventory.EngieTradeUIMenu;
import engiegames.engies_chaos.procedures.DenymarkdisplayconditionProcedure;
import engiegames.engies_chaos.procedures.CheckmarkdisplayconditionProcedure;
import engiegames.engies_chaos.network.EngieTradeUIButtonMessage;
import engiegames.engies_chaos.init.EngiesChaosModScreens;
import engiegames.engies_chaos.EngiesChaosMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class EngieTradeUIScreen extends AbstractContainerScreen<EngieTradeUIMenu> implements EngiesChaosModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Checkbox scythetrade;
	Checkbox bantrade;
	Button button_trade;
	Button button_swap;

	public EngieTradeUIScreen(EngieTradeUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 140;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = new ResourceLocation("engies_chaos:textures/screens/engie_trade_ui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 69 && mouseX < leftPos + 93 && mouseY > topPos + 4 && mouseY < topPos + 28) {
			this.renderTooltip(ms, Component.translatable("gui.engies_chaos.engie_trade_ui.tooltip_click_this_to_trade_for_a_scythe"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 96 && mouseX < leftPos + 120 && mouseY > topPos + 4 && mouseY < topPos + 28) {
			this.renderTooltip(ms, Component.translatable("gui.engies_chaos.engie_trade_ui.tooltip_click_this_to_trade_for_a_ban_ha"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (!customTooltipShown)
			this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (CheckmarkdisplayconditionProcedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/checkmark.png"));
			this.blit(ms, this.leftPos + 154, this.topPos + 8, 0, 0, 16, 16, 16, 16);
		}
		if (DenymarkdisplayconditionProcedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/denymark.png"));
			this.blit(ms, this.leftPos + 127, this.topPos + 8, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(PoseStack ms, int mouseX, int mouseY) {
		this.font.draw(ms, Component.translatable("gui.engies_chaos.engie_trade_ui.label_trade_ui_state_normal"), 5, -11, -1);
	}

	@Override
	public void init() {
		super.init();
		button_trade = new Button(this.leftPos + 9, this.topPos + 29, 51, 20, Component.translatable("gui.engies_chaos.engie_trade_ui.button_trade"), e -> {
			int x = EngieTradeUIScreen.this.x;
			int y = EngieTradeUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new EngieTradeUIButtonMessage(0, x, y, z));
				EngieTradeUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_trade);
		button_swap = new Button(this.leftPos + 9, this.topPos + 6, 51, 20, Component.translatable("gui.engies_chaos.engie_trade_ui.button_swap"), e -> {
			int x = EngieTradeUIScreen.this.x;
			int y = EngieTradeUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new EngieTradeUIButtonMessage(1, x, y, z));
				EngieTradeUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		this.addRenderableWidget(button_swap);
		scythetrade = new Checkbox(this.leftPos + 71, this.topPos + 6, 20, 20, Component.translatable("gui.engies_chaos.engie_trade_ui.scythetrade"), false) {
			@Override
			public void onPress() {
				super.onPress();
				if (!menuStateUpdateActive)
					menu.sendMenuStateUpdate(entity, 1, "scythetrade", this.selected(), false);
			}
		};
		this.addRenderableWidget(scythetrade);
		bantrade = new Checkbox(this.leftPos + 98, this.topPos + 6, 20, 20, Component.translatable("gui.engies_chaos.engie_trade_ui.bantrade"), false) {
			@Override
			public void onPress() {
				super.onPress();
				if (!menuStateUpdateActive)
					menu.sendMenuStateUpdate(entity, 1, "bantrade", this.selected(), false);
			}
		};
		this.addRenderableWidget(bantrade);
	}
}