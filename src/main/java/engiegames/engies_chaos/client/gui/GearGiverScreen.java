package engiegames.engies_chaos.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import engiegames.engies_chaos.world.inventory.GearGiverMenu;
import engiegames.engies_chaos.network.GearGiverButtonMessage;
import engiegames.engies_chaos.init.EngiesChaosModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class GearGiverScreen extends AbstractContainerScreen<GearGiverMenu> implements EngiesChaosModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_x;
	Button button_empty;
	Button button_starter_kit;
	Button button_bundle;
	Button button_recipe_book;
	Button button_operator;
	Button button_developer;
	Button button_idea_giver;
	Button button_beta_tester;
	Button button_tester;
	Button button_creator;

	public GearGiverScreen(GearGiverMenu container, Inventory inventory, Component text) {
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
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("engies_chaos:textures/screens/gear_giver.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.engies_chaos.gear_giver.label_reall_about_engie_configuration"), 4, 4, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		button_x = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_x"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(0, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 217, this.topPos + 3, 30, 20).build();
		this.addRenderableWidget(button_x);
		button_empty = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_empty"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(1, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 219, this.topPos + 143, 28, 20).build();
		this.addRenderableWidget(button_empty);
		button_starter_kit = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_starter_kit"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(2, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 24, 82, 20).build();
		this.addRenderableWidget(button_starter_kit);
		button_bundle = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_bundle"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(3, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 97, this.topPos + 24, 56, 20).build();
		this.addRenderableWidget(button_bundle);
		button_recipe_book = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_recipe_book"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(4, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 165, this.topPos + 24, 82, 20).build();
		this.addRenderableWidget(button_recipe_book);
		button_operator = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_operator"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(5, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 56, 67, 20).build();
		this.addRenderableWidget(button_operator);
		button_developer = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_developer"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(6, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 88, this.topPos + 56, 72, 20).build();
		this.addRenderableWidget(button_developer);
		button_idea_giver = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_idea_giver"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(7, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 170, this.topPos + 56, 77, 20).build();
		this.addRenderableWidget(button_idea_giver);
		button_beta_tester = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_beta_tester"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(8, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 88, 82, 20).build();
		this.addRenderableWidget(button_beta_tester);
		button_tester = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_tester"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(9, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 97, this.topPos + 88, 56, 20).build();
		this.addRenderableWidget(button_tester);
		button_creator = Button.builder(Component.translatable("gui.engies_chaos.gear_giver.button_creator"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new GearGiverButtonMessage(10, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 186, this.topPos + 88, 61, 20).build();
		this.addRenderableWidget(button_creator);
	}
}