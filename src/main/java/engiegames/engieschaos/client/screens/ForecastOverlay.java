package engiegames.engieschaos.client.screens;

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

import engiegames.engieschaos.procedures.NightcheckProcedure;
import engiegames.engieschaos.procedures.ForecastDisplayOverlayIngameProcedure;
import engiegames.engieschaos.procedures.ForecastDisplay9Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay8Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay7Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay6Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay5Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay4Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay3Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay2Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay1Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay17Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay16Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay15Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay14Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay13Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay12Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay11Procedure;
import engiegames.engieschaos.procedures.ForecastDisplay10Procedure;
import engiegames.engieschaos.procedures.DaycheckProcedure;

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
		if (ForecastDisplayOverlayIngameProcedure.execute(world)) {
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
			if (ForecastDisplay15Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementtext.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay16Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementtext2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay17Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatement.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementdooms1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementdooms2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay3Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementdooms3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay4Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementdooms4single.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay5Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementdooms4multi.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay6Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementsuperdooms1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay7Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementsuperdooms2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay8Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementtheend1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay9Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementtheend2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay10Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementengieswrath1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay11Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementengieswrath2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay12Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementengieswrath3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay13Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementengieswrath4single.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ForecastDisplay14Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newforecaststatementengieswrath4multi.png"));
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