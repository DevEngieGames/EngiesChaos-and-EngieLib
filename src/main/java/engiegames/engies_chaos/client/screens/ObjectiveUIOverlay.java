package engiegames.engies_chaos.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import engiegames.engies_chaos.procedures.TheEndCheckProcedure;
import engiegames.engies_chaos.procedures.SuperDoomsDayCheckProcedure;
import engiegames.engies_chaos.procedures.ObjectiveOverlayCheckProcedure;
import engiegames.engies_chaos.procedures.EngiesWrathCheckProcedure;
import engiegames.engies_chaos.procedures.DoomsDayCheckProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ObjectiveUIOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (ObjectiveOverlayCheckProcedure.execute(world, entity)) {
			if (DoomsDayCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/objectiveline1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -122, 90, 0, 0, 250, 75, 250, 75);
			}
			if (SuperDoomsDayCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/objectiveline2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -122, 90, 0, 0, 250, 75, 250, 75);
			}
			if (TheEndCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/objectiveline3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -122, 90, 0, 0, 250, 75, 250, 75);
			}
			if (EngiesWrathCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/objectiveline4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -122, 90, 0, 0, 250, 75, 250, 75);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}