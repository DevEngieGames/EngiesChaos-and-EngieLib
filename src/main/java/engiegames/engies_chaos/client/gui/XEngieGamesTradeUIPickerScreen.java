package engiegames.engies_chaos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import engiegames.engies_chaos.world.inventory.XEngieGamesTradeUIPickerMenu;
import engiegames.engies_chaos.procedures.TheEndButtonShowProcedure;
import engiegames.engies_chaos.procedures.SuperDoomsdayButtonShowProcedure;
import engiegames.engies_chaos.procedures.RoughianButtonShowProcedure;
import engiegames.engies_chaos.procedures.MindscapeButtonShowProcedure;
import engiegames.engies_chaos.procedures.EngieGamesButtonShowProcedure;
import engiegames.engies_chaos.procedures.EngieButtonShowProcedure;
import engiegames.engies_chaos.procedures.DoomsdayButtonShowProcedure;
import engiegames.engies_chaos.procedures.CosmicButtonShowProcedure;
import engiegames.engies_chaos.network.XEngieGamesTradeUIPickerButtonMessage;
import engiegames.engies_chaos.init.EngiesChaosModScreens;
import engiegames.engies_chaos.EngiesChaosMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class XEngieGamesTradeUIPickerScreen extends AbstractContainerScreen<XEngieGamesTradeUIPickerMenu> implements EngiesChaosModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_doomsday_trade_ui;
	Button button_super_doomsday_trade_ui;
	Button button_the_end_trade_ui;
	Button button_engie_trade_ui;
	Button button_mindscape_trade_ui;
	Button button_engiegames_trade_ui;
	Button button_cosmic_trade_ui;
	Button button_roughian_trade_ui;

	public XEngieGamesTradeUIPickerScreen(XEngieGamesTradeUIPickerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 160;
		this.imageHeight = 190;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = new ResourceLocation("engies_chaos:textures/screens/x_engie_games_trade_ui_picker.png");

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
		this.font.draw(ms, Component.translatable("gui.engies_chaos.x_engie_games_trade_ui_picker.label_pick_any_trade_ui"), 37, 1, -16777216);
	}

	@Override
	public void init() {
		super.init();
		button_doomsday_trade_ui = new Button(this.leftPos + 23, this.topPos + 10, 113, 20, Component.translatable("gui.engies_chaos.x_engie_games_trade_ui_picker.button_doomsday_trade_ui"), e -> {
			int x = XEngieGamesTradeUIPickerScreen.this.x;
			int y = XEngieGamesTradeUIPickerScreen.this.y;
			if (DoomsdayButtonShowProcedure.execute(world)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new XEngieGamesTradeUIPickerButtonMessage(0, x, y, z));
				XEngieGamesTradeUIPickerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_doomsday_trade_ui);
		button_super_doomsday_trade_ui = new Button(this.leftPos + 7, this.topPos + 32, 145, 20, Component.translatable("gui.engies_chaos.x_engie_games_trade_ui_picker.button_super_doomsday_trade_ui"), e -> {
			int x = XEngieGamesTradeUIPickerScreen.this.x;
			int y = XEngieGamesTradeUIPickerScreen.this.y;
			if (SuperDoomsdayButtonShowProcedure.execute(world)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new XEngieGamesTradeUIPickerButtonMessage(1, x, y, z));
				XEngieGamesTradeUIPickerButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		this.addRenderableWidget(button_super_doomsday_trade_ui);
		button_the_end_trade_ui = new Button(this.leftPos + 25, this.topPos + 54, 108, 20, Component.translatable("gui.engies_chaos.x_engie_games_trade_ui_picker.button_the_end_trade_ui"), e -> {
			int x = XEngieGamesTradeUIPickerScreen.this.x;
			int y = XEngieGamesTradeUIPickerScreen.this.y;
			if (TheEndButtonShowProcedure.execute(world)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new XEngieGamesTradeUIPickerButtonMessage(2, x, y, z));
				XEngieGamesTradeUIPickerButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		this.addRenderableWidget(button_the_end_trade_ui);
		button_engie_trade_ui = new Button(this.leftPos + 30, this.topPos + 76, 98, 20, Component.translatable("gui.engies_chaos.x_engie_games_trade_ui_picker.button_engie_trade_ui"), e -> {
			int x = XEngieGamesTradeUIPickerScreen.this.x;
			int y = XEngieGamesTradeUIPickerScreen.this.y;
			if (EngieButtonShowProcedure.execute(world)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new XEngieGamesTradeUIPickerButtonMessage(3, x, y, z));
				XEngieGamesTradeUIPickerButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		this.addRenderableWidget(button_engie_trade_ui);
		button_mindscape_trade_ui = new Button(this.leftPos + 20, this.topPos + 98, 119, 20, Component.translatable("gui.engies_chaos.x_engie_games_trade_ui_picker.button_mindscape_trade_ui"), e -> {
			int x = XEngieGamesTradeUIPickerScreen.this.x;
			int y = XEngieGamesTradeUIPickerScreen.this.y;
			if (MindscapeButtonShowProcedure.execute(world)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new XEngieGamesTradeUIPickerButtonMessage(4, x, y, z));
				XEngieGamesTradeUIPickerButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		this.addRenderableWidget(button_mindscape_trade_ui);
		button_engiegames_trade_ui = new Button(this.leftPos + 18, this.topPos + 120, 124, 20, Component.translatable("gui.engies_chaos.x_engie_games_trade_ui_picker.button_engiegames_trade_ui"), e -> {
			int x = XEngieGamesTradeUIPickerScreen.this.x;
			int y = XEngieGamesTradeUIPickerScreen.this.y;
			if (EngieGamesButtonShowProcedure.execute(world)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new XEngieGamesTradeUIPickerButtonMessage(5, x, y, z));
				XEngieGamesTradeUIPickerButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		this.addRenderableWidget(button_engiegames_trade_ui);
		button_cosmic_trade_ui = new Button(this.leftPos + 28, this.topPos + 142, 103, 20, Component.translatable("gui.engies_chaos.x_engie_games_trade_ui_picker.button_cosmic_trade_ui"), e -> {
			int x = XEngieGamesTradeUIPickerScreen.this.x;
			int y = XEngieGamesTradeUIPickerScreen.this.y;
			if (CosmicButtonShowProcedure.execute(world)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new XEngieGamesTradeUIPickerButtonMessage(6, x, y, z));
				XEngieGamesTradeUIPickerButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		this.addRenderableWidget(button_cosmic_trade_ui);
		button_roughian_trade_ui = new Button(this.leftPos + 23, this.topPos + 164, 113, 20, Component.translatable("gui.engies_chaos.x_engie_games_trade_ui_picker.button_roughian_trade_ui"), e -> {
			int x = XEngieGamesTradeUIPickerScreen.this.x;
			int y = XEngieGamesTradeUIPickerScreen.this.y;
			if (RoughianButtonShowProcedure.execute(world)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new XEngieGamesTradeUIPickerButtonMessage(7, x, y, z));
				XEngieGamesTradeUIPickerButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		this.addRenderableWidget(button_roughian_trade_ui);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		this.button_doomsday_trade_ui.visible = DoomsdayButtonShowProcedure.execute(world);
		this.button_super_doomsday_trade_ui.visible = SuperDoomsdayButtonShowProcedure.execute(world);
		this.button_the_end_trade_ui.visible = TheEndButtonShowProcedure.execute(world);
		this.button_engie_trade_ui.visible = EngieButtonShowProcedure.execute(world);
		this.button_mindscape_trade_ui.visible = MindscapeButtonShowProcedure.execute(world);
		this.button_engiegames_trade_ui.visible = EngieGamesButtonShowProcedure.execute(world);
		this.button_cosmic_trade_ui.visible = CosmicButtonShowProcedure.execute(world);
		this.button_roughian_trade_ui.visible = RoughianButtonShowProcedure.execute(world);
	}
}