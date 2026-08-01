package net.engiegames.reallaboutengie.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.engiegames.reallaboutengie.procedures.MaxHealthCheckProcedure;
import net.engiegames.reallaboutengie.procedures.HealthCheckProcedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow5butabove1Procedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow50butabove45Procedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow45butabove40Procedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow40butabove35Procedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow35butabove30Procedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow30butabove25Procedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow25butabove20Procedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow20butabove15Procedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow1butabove1hpProcedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow15butabove10Procedure;
import net.engiegames.reallaboutengie.procedures.HealthBelow10butabove5Procedure;
import net.engiegames.reallaboutengie.procedures.HealthAt1hpProcedure;
import net.engiegames.reallaboutengie.procedures.CustomHealthOverlayDisplayOverlayIngameProcedure;
import net.engiegames.reallaboutengie.procedures.ArmorCheckProcedure;
import net.engiegames.reallaboutengie.procedures.AbsorptionHealthCheckProcedure;

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
			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/healthcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/healthcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -82, h - 39, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/healthcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -74, h - 39, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/healthcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -66, h - 39, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/healthcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -58, h - 39, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/healthcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h - 39, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/healthcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -42, h - 39, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/healthcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -34, h - 39, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/absorptioncover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 47, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/absorptioncover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -82, h - 47, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/absorptioncover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -74, h - 47, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/absorptioncover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -66, h - 47, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/armorcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -42, h - 47, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/armorcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h - 47, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/armorcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -58, h - 47, 0, 0, 9, 8, 9, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/armorcover.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -34, h - 47, 0, 0, 9, 8, 9, 8);

			if (HealthBelow50butabove45Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health50andbelow.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthBelow45butabove40Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health45andbelow.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthBelow40butabove35Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health40andbelow.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthBelow35butabove30Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health35andbelow.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthBelow30butabove25Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health30andbelow.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthBelow25butabove20Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health25andbelow.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthBelow20butabove15Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health20andbelow.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthBelow15butabove10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health15andbelow.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthBelow10butabove5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health10andbelow.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthBelow5butabove1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health5andbelow.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthBelow1butabove1hpProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health1andbelownon1hp.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			if (HealthAt1hpProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/health1andbelow1hp.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -90, h - 39, 0, 0, 64, 8, 64, 8);
			}
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					HealthCheckProcedure.execute(entity), w / 2 + -89, h - 39, -2143665);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.allaboutengie.custom_health_overlay.label_empty"), w / 2 + -64, h - 39, -2143665);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					MaxHealthCheckProcedure.execute(entity), w / 2 + -52, h - 39, -2143665);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					AbsorptionHealthCheckProcedure.execute(entity), w / 2 + -89, h - 47, -2125238);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ArmorCheckProcedure.execute(entity), w / 2 + -57, h - 47, -1842205);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}