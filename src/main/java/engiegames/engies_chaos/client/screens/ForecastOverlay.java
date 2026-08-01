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

import engiegames.engies_chaos.procedures.NightcheckProcedure;
import engiegames.engies_chaos.procedures.ForecastDisplayOverlayIngameProcedure;
import engiegames.engies_chaos.procedures.ForecastDisplay9Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay8Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay7Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay6Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay5Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay4Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay3Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay2Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay1Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay17Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay16Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay15Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay14Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay13Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay12Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay11Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplay10Procedure;
import engiegames.engies_chaos.procedures.DaycheckProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class ForecastOverlay {
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
		if (ForecastDisplayOverlayIngameProcedure.execute(world)) {
			event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecast.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);

			if (DaycheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecastdaytime.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (NightcheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecastnighttime.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay15Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementtext.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay16Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementtext2.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay17Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatement.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay1Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementdooms1.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay2Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementdooms2.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay3Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementdooms3.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay4Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementdooms4single.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay5Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementdooms4multi.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay6Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementsuperdooms1.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay7Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementsuperdooms2.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay8Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementtheend1.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay9Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementtheend2.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay10Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementengieswrath1.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay11Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementengieswrath2.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay12Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementengieswrath3.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay13Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementengieswrath4single.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastDisplay14Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/newforecaststatementengieswrath4multi.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}