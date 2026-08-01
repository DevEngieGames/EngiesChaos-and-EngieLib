package net.engiegames.reallaboutengie.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.engiegames.reallaboutengie.world.inventory.CustomRecipeBookMenu;
import net.engiegames.reallaboutengie.procedures.RecipepagenumbergetProcedure;
import net.engiegames.reallaboutengie.network.CustomRecipeBookButtonMessage;
import net.engiegames.reallaboutengie.init.AllaboutengieModScreens;
import net.engiegames.reallaboutengie.AllaboutengieMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CustomRecipeBookScreen extends AbstractContainerScreen<CustomRecipeBookMenu> implements AllaboutengieModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_empty3;
	Button button_empty4;
	Button button_empty5;
	Button button_swap_crafts_to_antimatter;

	public CustomRecipeBookScreen(CustomRecipeBookMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = new ResourceLocation("allaboutengie:textures/screens/custom_recipe_book.png");

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
		RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/custom_recipe_book_pageoverlay.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/recipebook.png"));
		this.blit(ms, this.leftPos + 90, this.topPos + 27, 0, 0, 32, 32, 32, 32);
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
		this.font.draw(ms, RecipepagenumbergetProcedure.execute(entity), 8, 73, -12829636);
	}

	@Override
	public void init() {
		super.init();
		button_empty = new Button(this.leftPos + -25, this.topPos + 81, 25, 20, Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(0, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty);
		button_empty1 = new Button(this.leftPos + -25, this.topPos + 61, 25, 20, Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty1"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(1, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty1);
		button_empty2 = new Button(this.leftPos + -25, this.topPos + 101, 25, 20, Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty2"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(2, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty2);
		button_empty3 = new Button(this.leftPos + -25, this.topPos + 41, 25, 20, Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty3"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(3, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty3);
		button_empty4 = new Button(this.leftPos + -25, this.topPos + 121, 25, 20, Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty4"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(4, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty4);
		button_empty5 = new Button(this.leftPos + -25, this.topPos + 21, 25, 20, Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty5"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(5, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty5);
		button_swap_crafts_to_antimatter = new Button(this.leftPos + 10, this.topPos + -20, 155, 20, Component.translatable("gui.allaboutengie.custom_recipe_book.button_swap_crafts_to_antimatter"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(6, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		this.addRenderableWidget(button_swap_crafts_to_antimatter);
	}
}