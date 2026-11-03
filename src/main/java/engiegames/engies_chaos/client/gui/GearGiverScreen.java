package engiegames.engies_chaos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import engiegames.engies_chaos.world.inventory.GearGiverMenu;
import engiegames.engies_chaos.network.GearGiverButtonMessage;
import engiegames.engies_chaos.init.EngiesChaosModScreens;
import engiegames.engies_chaos.EngiesChaosMod;

import com.mojang.blaze3d.vertex.PoseStack;
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

	private static final ResourceLocation texture = new ResourceLocation("engies_chaos:textures/screens/gear_giver.png");

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
		this.font.draw(ms, Component.translatable("gui.engies_chaos.gear_giver.label_reall_about_engie_configuration"), 4, 4, -16777216);
	}

	@Override
	public void init() {
		super.init();
		button_x = new Button(this.leftPos + 216, this.topPos + 4, 30, 20, Component.translatable("gui.engies_chaos.gear_giver.button_x"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new GearGiverButtonMessage(0, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_x);
		button_empty = new Button(this.leftPos + 218, this.topPos + 142, 28, 20, Component.translatable("gui.engies_chaos.gear_giver.button_empty"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new GearGiverButtonMessage(1, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty);
		button_starter_kit = new Button(this.leftPos + 83, this.topPos + 25, 82, 20, Component.translatable("gui.engies_chaos.gear_giver.button_starter_kit"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new GearGiverButtonMessage(2, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		this.addRenderableWidget(button_starter_kit);
		button_bundle = new Button(this.leftPos + 97, this.topPos + 110, 56, 20, Component.translatable("gui.engies_chaos.gear_giver.button_bundle"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new GearGiverButtonMessage(3, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		this.addRenderableWidget(button_bundle);
		button_recipe_book = new Button(this.leftPos + 83, this.topPos + 54, 82, 20, Component.translatable("gui.engies_chaos.gear_giver.button_recipe_book"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new GearGiverButtonMessage(4, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		this.addRenderableWidget(button_recipe_book);
		button_operator = new Button(this.leftPos + 91, this.topPos + 83, 67, 20, Component.translatable("gui.engies_chaos.gear_giver.button_operator"), e -> {
			int x = GearGiverScreen.this.x;
			int y = GearGiverScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new GearGiverButtonMessage(5, x, y, z));
				GearGiverButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		this.addRenderableWidget(button_operator);
	}
}