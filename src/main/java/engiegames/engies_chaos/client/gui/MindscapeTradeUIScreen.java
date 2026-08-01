package engiegames.engies_chaos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.GuiGraphics;

import engiegames.engies_chaos.world.inventory.MindscapeTradeUIMenu;
import engiegames.engies_chaos.init.EngiesChaosModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class MindscapeTradeUIScreen extends AbstractContainerScreen<MindscapeTradeUIMenu> implements EngiesChaosModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Checkbox scythetrade;
	Checkbox bantrade;

	public MindscapeTradeUIScreen(MindscapeTradeUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 115;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("engies_chaos:textures/screens/mindscape_trade_ui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 4 && mouseX < leftPos + 28 && mouseY > topPos + 5 && mouseY < topPos + 29) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.engies_chaos.mindscape_trade_ui.tooltip_check_this_to_trade_for_a_scythe"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 31 && mouseX < leftPos + 55 && mouseY > topPos + 5 && mouseY < topPos + 29) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.engies_chaos.mindscape_trade_ui.tooltip_check_this_to_trade_for_a_ban_ha"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (!customTooltipShown)
			this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		scythetrade = Checkbox.builder(Component.translatable("gui.engies_chaos.mindscape_trade_ui.scythetrade"), this.font).pos(this.leftPos + 6, this.topPos + 7).onValueChange((checkbox, value) -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 1, "scythetrade", value, false);
		}).build();
		this.addRenderableWidget(scythetrade);
		bantrade = Checkbox.builder(Component.translatable("gui.engies_chaos.mindscape_trade_ui.bantrade"), this.font).pos(this.leftPos + 33, this.topPos + 7).onValueChange((checkbox, value) -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 1, "bantrade", value, false);
		}).build();
		this.addRenderableWidget(bantrade);
	}
}