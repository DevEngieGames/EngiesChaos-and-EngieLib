package engiegames.engies_chaos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import engiegames.engies_chaos.world.inventory.BiblicallyAccurateEngieBundleUIMenu;
import engiegames.engies_chaos.procedures.BiblicallyAccurateEngieBundleDisplayNameCheckProcedure;
import engiegames.engies_chaos.network.BiblicallyAccurateEngieBundleUIButtonMessage;
import engiegames.engies_chaos.init.EngiesChaosModScreens;
import engiegames.engies_chaos.EngiesChaosMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BiblicallyAccurateEngieBundleUIScreen extends AbstractContainerScreen<BiblicallyAccurateEngieBundleUIMenu> implements EngiesChaosModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox ChangeBundleName;
	Button button_set_name;

	public BiblicallyAccurateEngieBundleUIScreen(BiblicallyAccurateEngieBundleUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 340;
		this.imageHeight = 230;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("ChangeBundleName"))
				ChangeBundleName.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = new ResourceLocation("engies_chaos:textures/screens/biblically_accurate_engie_bundle_ui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		ChangeBundleName.render(ms, mouseX, mouseY, partialTicks);
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
		if (ChangeBundleName.isFocused())
			return ChangeBundleName.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String ChangeBundleNameValue = ChangeBundleName.getValue();
		super.resize(minecraft, width, height);
		ChangeBundleName.setValue(ChangeBundleNameValue);
	}

	@Override
	protected void renderLabels(PoseStack ms, int mouseX, int mouseY) {
		this.font.draw(ms, BiblicallyAccurateEngieBundleDisplayNameCheckProcedure.execute(entity), 5, 29, -12829636);
	}

	@Override
	public void init() {
		super.init();
		ChangeBundleName = new EditBox(this.font, this.leftPos + 6, this.topPos + 7, 118, 18, Component.translatable("gui.engies_chaos.biblically_accurate_engie_bundle_ui.ChangeBundleName"));
		ChangeBundleName.setMaxLength(8192);
		ChangeBundleName.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "ChangeBundleName", content, false);
		});
		ChangeBundleName.setSuggestion(Component.translatable("gui.engies_chaos.biblically_accurate_engie_bundle_ui.ChangeBundleName").getString());
		this.addWidget(this.ChangeBundleName);
		button_set_name = new Button(this.leftPos + 129, this.topPos + 6, 66, 20, Component.translatable("gui.engies_chaos.biblically_accurate_engie_bundle_ui.button_set_name"), e -> {
			int x = BiblicallyAccurateEngieBundleUIScreen.this.x;
			int y = BiblicallyAccurateEngieBundleUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new BiblicallyAccurateEngieBundleUIButtonMessage(0, x, y, z));
				BiblicallyAccurateEngieBundleUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_set_name);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		ChangeBundleName.tick();
	}
}