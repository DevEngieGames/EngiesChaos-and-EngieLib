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

import engiegames.engies_chaos.procedures.TheEndCheckProcedure;
import engiegames.engies_chaos.procedures.SuperDoomsDayCheckProcedure;
import engiegames.engies_chaos.procedures.ReturnDdayTimerProcedure;
import engiegames.engies_chaos.procedures.EngiesWrathCheckProcedure;
import engiegames.engies_chaos.procedures.DoomsDayDeadOverlayCheckProcedure;
import engiegames.engies_chaos.procedures.DoomsDayCheckProcedure;
import engiegames.engies_chaos.procedures.DoomsDayAliveOverlayCheckProcedure;
import engiegames.engies_chaos.procedures.DoomsDayAliveDeathCountDisplayOverlayIngameProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class DoomsDayAliveDeathCountOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
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
		if (DoomsDayAliveDeathCountDisplayOverlayIngameProcedure.execute(world)) {
			event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/ddaybottomleft.png"), w - 93, h - 28, 0, 0, 93, 28, 93, 28);

			if (DoomsDayAliveOverlayCheckProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/ddaybottomleftalive.png"), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			if (DoomsDayDeadOverlayCheckProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/ddaybottomleftdead.png"), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			if (DoomsDayCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/ddaystatus.png"), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			if (SuperDoomsDayCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/sddaystatus.png"), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			if (TheEndCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/theendstatus.png"), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			if (EngiesWrathCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/engieswrathstatus.png"), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnDdayTimerProcedure.execute(world), w - 92, h - 25, -16777216, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnDdayTimerProcedure.execute(world), w - 91, h - 26, -1, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}