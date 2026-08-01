package engiegames.engieschaos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;

import engiegames.engieschaos.world.inventory.MindscapeTradeUIMenu;
import engiegames.engieschaos.procedures.DenymarkdisplayconditionProcedure;
import engiegames.engieschaos.procedures.CheckmarkdisplayconditionProcedure;
import engiegames.engieschaos.network.MindscapeTradeUIButtonMessage;
import engiegames.engieschaos.init.EngiesChaosModScreens;
import engiegames.engieschaos.EngiesChaosMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MindscapeTradeUIScreen extends AbstractContainerScreen<MindscapeTradeUIMenu> implements EngiesChaosModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Checkbox scythetrade;
	Checkbox bantrade;
	Button button_trade;

	public MindscapeTradeUIScreen(MindscapeTradeUIMenu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = new ResourceLocation("engies_chaos:textures/screens/mindscape_trade_ui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 5 && mouseX < leftPos + 29 && mouseY > topPos + 5 && mouseY < topPos + 29) {
			this.renderTooltip(ms, Component.translatable("gui.engies_chaos.mindscape_trade_ui.tooltip_check_this_to_trade_for_a_scythe"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 36 && mouseX < leftPos + 60 && mouseY > topPos + 5 && mouseY < topPos + 29) {
			this.renderTooltip(ms, Component.translatable("gui.engies_chaos.mindscape_trade_ui.tooltip_check_this_to_trade_for_a_ban_ha"), mouseX, mouseY);
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
			this.blit(ms, this.leftPos + 107, this.topPos + 31, 0, 0, 16, 16, 16, 16);
		}
		if (DenymarkdisplayconditionProcedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/denymark.png"));
			this.blit(ms, this.leftPos + 107, this.topPos + 31, 0, 0, 16, 16, 16, 16);
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
	}

	@Override
	public void init() {
		super.init();
		button_trade = new Button(this.leftPos + 7, this.topPos + 29, 51, 20, Component.translatable("gui.engies_chaos.mindscape_trade_ui.button_trade"), e -> {
			int x = MindscapeTradeUIScreen.this.x;
			int y = MindscapeTradeUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new MindscapeTradeUIButtonMessage(0, x, y, z));
				MindscapeTradeUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_trade);
		scythetrade = new Checkbox(this.leftPos + 7, this.topPos + 7, 20, 20, Component.translatable("gui.engies_chaos.mindscape_trade_ui.scythetrade"), false) {
			@Override
			public void onPress() {
				super.onPress();
				if (!menuStateUpdateActive)
					menu.sendMenuStateUpdate(entity, 1, "scythetrade", this.selected(), false);
			}
		};
		this.addRenderableWidget(scythetrade);
		bantrade = new Checkbox(this.leftPos + 38, this.topPos + 7, 20, 20, Component.translatable("gui.engies_chaos.mindscape_trade_ui.bantrade"), false) {
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