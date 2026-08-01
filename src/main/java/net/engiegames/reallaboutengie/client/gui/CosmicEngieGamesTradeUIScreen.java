package net.engiegames.reallaboutengie.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.engiegames.reallaboutengie.world.inventory.CosmicEngieGamesTradeUIMenu;
import net.engiegames.reallaboutengie.network.CosmicEngieGamesTradeUIButtonMessage;
import net.engiegames.reallaboutengie.init.AllaboutengieModScreens;
import net.engiegames.reallaboutengie.AllaboutengieMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CosmicEngieGamesTradeUIScreen extends AbstractContainerScreen<CosmicEngieGamesTradeUIMenu> implements AllaboutengieModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_trade;

	public CosmicEngieGamesTradeUIScreen(CosmicEngieGamesTradeUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 140;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = new ResourceLocation("allaboutengie:textures/screens/cosmic_engie_games_trade_ui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	}

	@Override
	public void init() {
		super.init();
		button_trade = new Button(this.leftPos + 8, this.topPos + 29, 51, 20, Component.translatable("gui.allaboutengie.cosmic_engie_games_trade_ui.button_trade"), e -> {
			int x = CosmicEngieGamesTradeUIScreen.this.x;
			int y = CosmicEngieGamesTradeUIScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CosmicEngieGamesTradeUIButtonMessage(0, x, y, z));
				CosmicEngieGamesTradeUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_trade);
	}
}