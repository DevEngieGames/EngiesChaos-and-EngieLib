package engiegames.engies_chaos.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.CoreShaders;
import net.minecraft.client.Minecraft;

import engiegames.engies_chaos.procedures.TrueHardcoreLivesCheckProcedure;
import engiegames.engies_chaos.procedures.TrueHardcoreLivesCheck3Procedure;
import engiegames.engies_chaos.procedures.TrueHardcoreLivesCheck2Procedure;
import engiegames.engies_chaos.procedures.TrueHardcoreCheckProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class CustomHealthOverlay2Overlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(CoreShaders.POSITION_TEX);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (TrueHardcoreCheckProcedure.execute(world, entity)) {
			if (TrueHardcoreLivesCheck2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/truehardcorelivesover1.png"), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (TrueHardcoreLivesCheck3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/truehardcorelives1andunder.png"), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					TrueHardcoreLivesCheckProcedure.execute(entity), 7, h - 118, -65536, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}