package engiegames.engieschaos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import engiegames.engieschaos.world.inventory.RecipeBookVol2GUIMenu;
import engiegames.engieschaos.network.RecipeBookVol2GUIButtonMessage;
import engiegames.engieschaos.init.EngiesChaosModScreens;
import engiegames.engieschaos.EngiesChaosMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class RecipeBookVol2GUIScreen extends AbstractContainerScreen<RecipeBookVol2GUIMenu> implements EngiesChaosModScreens.ScreenAccessor {
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

	public RecipeBookVol2GUIScreen(RecipeBookVol2GUIMenu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = new ResourceLocation("engies_chaos:textures/screens/recipe_book_vol_2_gui.png");

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
		RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/recipebookvol2overlay.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/recipebookvol2.png"));
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
	}

	@Override
	public void init() {
		super.init();
		button_empty = new Button(this.leftPos + 176, this.topPos + 106, 25, 20, Component.translatable("gui.engies_chaos.recipe_book_vol_2_gui.button_empty"), e -> {
			int x = RecipeBookVol2GUIScreen.this.x;
			int y = RecipeBookVol2GUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new RecipeBookVol2GUIButtonMessage(0, x, y, z));
				RecipeBookVol2GUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty);
		button_empty1 = new Button(this.leftPos + -25, this.topPos + 106, 25, 20, Component.translatable("gui.engies_chaos.recipe_book_vol_2_gui.button_empty1"), e -> {
			int x = RecipeBookVol2GUIScreen.this.x;
			int y = RecipeBookVol2GUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new RecipeBookVol2GUIButtonMessage(1, x, y, z));
				RecipeBookVol2GUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty1);
		button_empty2 = new Button(this.leftPos + 176, this.topPos + 126, 25, 20, Component.translatable("gui.engies_chaos.recipe_book_vol_2_gui.button_empty2"), e -> {
			int x = RecipeBookVol2GUIScreen.this.x;
			int y = RecipeBookVol2GUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new RecipeBookVol2GUIButtonMessage(2, x, y, z));
				RecipeBookVol2GUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty2);
		button_empty3 = new Button(this.leftPos + -25, this.topPos + 126, 25, 20, Component.translatable("gui.engies_chaos.recipe_book_vol_2_gui.button_empty3"), e -> {
			int x = RecipeBookVol2GUIScreen.this.x;
			int y = RecipeBookVol2GUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new RecipeBookVol2GUIButtonMessage(3, x, y, z));
				RecipeBookVol2GUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty3);
		button_empty4 = new Button(this.leftPos + 176, this.topPos + 146, 25, 20, Component.translatable("gui.engies_chaos.recipe_book_vol_2_gui.button_empty4"), e -> {
			int x = RecipeBookVol2GUIScreen.this.x;
			int y = RecipeBookVol2GUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new RecipeBookVol2GUIButtonMessage(4, x, y, z));
				RecipeBookVol2GUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty4);
		button_empty5 = new Button(this.leftPos + -25, this.topPos + 146, 25, 20, Component.translatable("gui.engies_chaos.recipe_book_vol_2_gui.button_empty5"), e -> {
			int x = RecipeBookVol2GUIScreen.this.x;
			int y = RecipeBookVol2GUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new RecipeBookVol2GUIButtonMessage(5, x, y, z));
				RecipeBookVol2GUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty5);
	}
}