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

import engiegames.engies_chaos.procedures.TheEndDialogueForecastDisplay5Procedure;
import engiegames.engies_chaos.procedures.TheEndDialogueForecastDisplay4Procedure;
import engiegames.engies_chaos.procedures.TheEndDialogueForecastDisplay3Procedure;
import engiegames.engies_chaos.procedures.TheEndDialogueForecastDisplay2Procedure;
import engiegames.engies_chaos.procedures.TheEndDialogueForecastDisplay1Procedure;
import engiegames.engies_chaos.procedures.SuperDoomsdayDialogueForecastDisplay6Procedure;
import engiegames.engies_chaos.procedures.SuperDoomsdayDialogueForecastDisplay5Procedure;
import engiegames.engies_chaos.procedures.ForecastVersionDisplayOnProcedure;
import engiegames.engies_chaos.procedures.ForecastVersionDisplayOffProcedure;
import engiegames.engies_chaos.procedures.ForecastStatementMainDisplayProcedure;
import engiegames.engies_chaos.procedures.ForecastStatementDisplay2Procedure;
import engiegames.engies_chaos.procedures.ForecastStatementDisplay1Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplayOverlayIngameProcedure;
import engiegames.engies_chaos.procedures.EngiesWrathDialogueForecastDisplay5Procedure;
import engiegames.engies_chaos.procedures.EngiesWrathDialogueForecastDisplay4Procedure;
import engiegames.engies_chaos.procedures.EngiesWrathDialogueForecastDisplay3Procedure;
import engiegames.engies_chaos.procedures.EngiesWrathDialogueForecastDisplay2Procedure;
import engiegames.engies_chaos.procedures.EngiesWrathDialogueForecastDisplay1Procedure;
import engiegames.engies_chaos.procedures.DoomsdayDialogueForecastDisplay4Procedure;
import engiegames.engies_chaos.procedures.DoomsdayDialogueForecastDisplay3Procedure;
import engiegames.engies_chaos.procedures.DoomsdayDialogueForecastDisplay2Procedure;
import engiegames.engies_chaos.procedures.DoomsdayDialogueForecastDisplay1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ForecastOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
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
		if (ForecastDisplayOverlayIngameProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecast.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);

			if (ForecastVersionDisplayOnProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastversionnumb.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastVersionDisplayOffProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastversionnumberrored.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastStatementDisplay1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementtext.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastStatementDisplay2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementtext2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ForecastStatementMainDisplayProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatement.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (DoomsdayDialogueForecastDisplay1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastdoomsdialogue1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (DoomsdayDialogueForecastDisplay2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastdoomsdialogue2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (DoomsdayDialogueForecastDisplay3Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastdoomsdialogue3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (DoomsdayDialogueForecastDisplay4Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastdoomsdialogue4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (SuperDoomsdayDialogueForecastDisplay5Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastsuperdoomsdialogue5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (SuperDoomsdayDialogueForecastDisplay6Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastsuperdoomsdialogue6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (TheEndDialogueForecastDisplay1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecasttheenddialogue1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (TheEndDialogueForecastDisplay2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecasttheenddialogue2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (TheEndDialogueForecastDisplay3Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecasttheenddialogue3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (TheEndDialogueForecastDisplay4Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecasttheenddialogue4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (TheEndDialogueForecastDisplay5Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecasttheenddialogue5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (EngiesWrathDialogueForecastDisplay1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastengieswrathdialogue1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (EngiesWrathDialogueForecastDisplay2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastengieswrathdialogue2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (EngiesWrathDialogueForecastDisplay3Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastengieswrathdialogue3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (EngiesWrathDialogueForecastDisplay4Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastengieswrathdialogue4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (EngiesWrathDialogueForecastDisplay5Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastengieswrathdialogue5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}