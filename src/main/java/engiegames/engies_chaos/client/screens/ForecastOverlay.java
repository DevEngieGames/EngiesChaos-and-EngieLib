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

import engiegames.engies_chaos.procedures.NightcheckProcedure;
import engiegames.engies_chaos.procedures.ForecastStatementDisplay2Procedure;
import engiegames.engies_chaos.procedures.ForecastStatementDisplay1Procedure;
import engiegames.engies_chaos.procedures.ForecastDisplayOverlayIngameProcedure;
import engiegames.engies_chaos.procedures.ForecastDisplay17Procedure;
import engiegames.engies_chaos.procedures.DoomsdayDialogueForecastDisplay4Procedure;
import engiegames.engies_chaos.procedures.DoomsdayDialogueForecastDisplay3Procedure;
import engiegames.engies_chaos.procedures.DoomsdayDialogueForecastDisplay2Procedure;
import engiegames.engies_chaos.procedures.DoomsdayDialogueForecastDisplay1Procedure;
import engiegames.engies_chaos.procedures.DaycheckProcedure;

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
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);

			if (DaycheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastdaytime.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (NightcheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecastnighttime.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastStatementDisplay1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementtext.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastStatementDisplay2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementtext2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay17Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatement.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (DoomsdayDialogueForecastDisplay1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementdooms1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (DoomsdayDialogueForecastDisplay2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementdooms2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (DoomsdayDialogueForecastDisplay3Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementdooms3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (DoomsdayDialogueForecastDisplay4Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementdooms4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}