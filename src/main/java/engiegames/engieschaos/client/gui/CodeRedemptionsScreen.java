package engiegames.engieschaos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import engiegames.engieschaos.world.inventory.CodeRedemptionsMenu;
import engiegames.engieschaos.procedures.StarCheckForCodeRedempProcedure;
import engiegames.engieschaos.network.CodeRedemptionsButtonMessage;
import engiegames.engieschaos.init.EngiesChaosModScreens;
import engiegames.engieschaos.EngiesChaosMod;

import com.mojang.blaze3d.vertex.PoseStack;
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

	private static final ResourceLocation texture = new ResourceLocation("engies_chaos:textures/screens/code_redemptions.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		codeinput.render(ms, mouseX, mouseY, partialTicks);
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
	protected void renderLabels(PoseStack ms, int mouseX, int mouseY) {
		this.font.draw(ms, Component.translatable("gui.engies_chaos.code_redemptions.label_reall_about_engie_configuration"), 4, 4, -16777216);
		this.font.draw(ms, Component.translatable("gui.engies_chaos.code_redemptions.label_yearly_codes"), 3, 23, -16777216);
		this.font.draw(ms, Component.translatable("gui.engies_chaos.code_redemptions.label_happynewyears"), 3, 34, -16777216);
		this.font.draw(ms, Component.translatable("gui.engies_chaos.code_redemptions.label_merrychristmas"), 3, 45, -16777216);
		this.font.draw(ms, Component.translatable("gui.engies_chaos.code_redemptions.label_happybirthdayengie"), 3, 56, -16777216);
		if (StarCheckForCodeRedempProcedure.execute(entity))
			this.font.draw(ms, Component.translatable("gui.engies_chaos.code_redemptions.label_for_star"), 200, 23, -16777216);
		if (StarCheckForCodeRedempProcedure.execute(entity))
			this.font.draw(ms, Component.translatable("gui.engies_chaos.code_redemptions.label_phantom"), 200, 34, -16777216);
		if (StarCheckForCodeRedempProcedure.execute(entity))
			this.font.draw(ms, Component.translatable("gui.engies_chaos.code_redemptions.label_scarlet"), 200, 45, -16777216);
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
		codeinput.setSuggestion(Component.translatable("gui.engies_chaos.code_redemptions.codeinput").getString());
		this.addWidget(this.codeinput);
		button_x = new Button(this.leftPos + 217, this.topPos + 3, 30, 20, Component.translatable("gui.engies_chaos.code_redemptions.button_x"), e -> {
			int x = CodeRedemptionsScreen.this.x;
			int y = CodeRedemptionsScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new CodeRedemptionsButtonMessage(0, x, y, z));
				CodeRedemptionsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_x);
		button_empty = new Button(this.leftPos + 3, this.topPos + 143, 28, 20, Component.translatable("gui.engies_chaos.code_redemptions.button_empty"), e -> {
			int x = CodeRedemptionsScreen.this.x;
			int y = CodeRedemptionsScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new CodeRedemptionsButtonMessage(1, x, y, z));
				CodeRedemptionsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty);
		button_redeem = new Button(this.leftPos + 96, this.topPos + 89, 56, 20, Component.translatable("gui.engies_chaos.code_redemptions.button_redeem"), e -> {
			int x = CodeRedemptionsScreen.this.x;
			int y = CodeRedemptionsScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new CodeRedemptionsButtonMessage(2, x, y, z));
				CodeRedemptionsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		this.addRenderableWidget(button_redeem);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		codeinput.tick();
	}
}