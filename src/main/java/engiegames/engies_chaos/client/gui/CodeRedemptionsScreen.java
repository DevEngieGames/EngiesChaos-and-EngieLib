package engiegames.engies_chaos.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import engiegames.engies_chaos.world.inventory.CodeRedemptionsMenu;
import engiegames.engies_chaos.procedures.StarCheckForCodeRedempProcedure;
import engiegames.engies_chaos.network.CodeRedemptionsButtonMessage;
import engiegames.engies_chaos.init.EngiesChaosModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class CodeRedemptionsScreen extends AbstractContainerScreen<CodeRedemptionsMenu> implements EngiesChaosModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox codeinput;
	Button button_x;
	Button button_empty;
	Button button_redeem;

	public CodeRedemptionsScreen(CodeRedemptionsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("codeinput"))
				codeinput.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("engies_chaos:textures/screens/code_redemptions.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		codeinput.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (codeinput.isFocused())
			return codeinput.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String codeinputValue = codeinput.getValue();
		super.resize(minecraft, width, height);
		codeinput.setValue(codeinputValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.engies_chaos.code_redemptions.label_reall_about_engie_configuration"), 4, 4, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.engies_chaos.code_redemptions.label_yearly_codes"), 3, 23, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.engies_chaos.code_redemptions.label_happynewyears"), 3, 34, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.engies_chaos.code_redemptions.label_merrychristmas"), 3, 45, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.engies_chaos.code_redemptions.label_happybirthdayengie"), 3, 56, -16777216, false);
		if (StarCheckForCodeRedempProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.engies_chaos.code_redemptions.label_for_star"), 200, 23, -16777216, false);
		if (StarCheckForCodeRedempProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.engies_chaos.code_redemptions.label_phantom"), 200, 34, -16777216, false);
		if (StarCheckForCodeRedempProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.engies_chaos.code_redemptions.label_scarlet"), 200, 45, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		codeinput = new EditBox(this.font, this.leftPos + 65, this.topPos + 69, 118, 18, Component.translatable("gui.engies_chaos.code_redemptions.codeinput"));
		codeinput.setMaxLength(8192);
		codeinput.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "codeinput", content, false);
		});
		codeinput.setHint(Component.translatable("gui.engies_chaos.code_redemptions.codeinput"));
		this.addWidget(this.codeinput);
		button_x = Button.builder(Component.translatable("gui.engies_chaos.code_redemptions.button_x"), e -> {
			int x = CodeRedemptionsScreen.this.x;
			int y = CodeRedemptionsScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CodeRedemptionsButtonMessage(0, x, y, z));
				CodeRedemptionsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 217, this.topPos + 3, 30, 20).build();
		this.addRenderableWidget(button_x);
		button_empty = Button.builder(Component.translatable("gui.engies_chaos.code_redemptions.button_empty"), e -> {
			int x = CodeRedemptionsScreen.this.x;
			int y = CodeRedemptionsScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CodeRedemptionsButtonMessage(1, x, y, z));
				CodeRedemptionsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 143, 28, 20).build();
		this.addRenderableWidget(button_empty);
		button_redeem = Button.builder(Component.translatable("gui.engies_chaos.code_redemptions.button_redeem"), e -> {
			int x = CodeRedemptionsScreen.this.x;
			int y = CodeRedemptionsScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CodeRedemptionsButtonMessage(2, x, y, z));
				CodeRedemptionsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 96, this.topPos + 89, 56, 20).build();
		this.addRenderableWidget(button_redeem);
	}
}