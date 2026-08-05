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

@Mod.EventBusSubscriber({Dist.CLIENT})
public class CustomHealthOverlayOverlay {
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
		if (CustomHealthOverlayDisplayOverlayIngameProcedure.execute(entity)) {
			if (HealthCheck2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newhudnormhp.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (HealthCheck3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newhudhalfandlowerhp.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (TesterCheckProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/testericon.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (BetaTesterCheckProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/betatestericon.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (ContentCreatorCheckProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/contentcreatoricon.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (IdeaGiverCheckProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/ideagivericon.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			if (DevCheckProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/devicon.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h - 127, 0, 0, 151, 127, 151, 127);
			}
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					HealthCheckProcedure.execute(entity), 32, h - 64, -55256);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ArmorCheckProcedure.execute(entity), 26, h - 15, -1842205);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					MaxHealthCheckProcedure.execute(entity), 26, h - 44, -4511704);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					AbsorptionHealthCheckProcedure.execute(entity), 26, h - 30, -17624);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					Only16CharactersProcedure.execute(entity), 7, h - 94, -1);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}