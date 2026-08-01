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

import engiegames.engies_chaos.procedures.TesterCheckProcedure;
import engiegames.engies_chaos.procedures.Only16CharactersProcedure;
import engiegames.engies_chaos.procedures.MaxHealthCheckProcedure;
import engiegames.engies_chaos.procedures.IdeaGiverCheckProcedure;
import engiegames.engies_chaos.procedures.HealthCheckProcedure;
import engiegames.engies_chaos.procedures.HealthCheck3Procedure;
import engiegames.engies_chaos.procedures.HealthCheck2Procedure;
import engiegames.engies_chaos.procedures.DevCheckProcedure;
import engiegames.engies_chaos.procedures.CustomHealthOverlayDisplayOverlayIngameProcedure;
import engiegames.engies_chaos.procedures.ContentCreatorCheckProcedure;
import engiegames.engies_chaos.procedures.BetaTesterCheckProcedure;
import engiegames.engies_chaos.procedures.ArmorCheckProcedure;
import engiegames.engies_chaos.procedures.AbsorptionHealthCheckProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class CustomHealthOverlayOverlay {
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
		if (CustomHealthOverlayDisplayOverlayIngameProcedure.execute(entity)) {
			if (HealthCheck2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newhudnormhp.png"), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (HealthCheck3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newhudhalfandlowerhp.png"), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (DevCheckProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/devicon.png"), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (IdeaGiverCheckProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/ideagivericon.png"), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (BetaTesterCheckProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/betatestericon.png"), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (TesterCheckProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/testericon.png"), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (ContentCreatorCheckProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/contentcreatoricon.png"), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					Only16CharactersProcedure.execute(entity), 7, h - 93, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					HealthCheckProcedure.execute(entity), 31, h - 63, -55256, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					MaxHealthCheckProcedure.execute(entity), 26, h - 43, -4511704, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					AbsorptionHealthCheckProcedure.execute(entity), 26, h - 29, -17624, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ArmorCheckProcedure.execute(entity), 26, h - 16, -4473925, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}