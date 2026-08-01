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

import engiegames.engies_chaos.procedures.THEENDProphNoneProcedure;
import engiegames.engies_chaos.procedures.THEENDProphMult4Procedure;
import engiegames.engies_chaos.procedures.THEENDProphMult3Procedure;
import engiegames.engies_chaos.procedures.THEENDProphMult2Procedure;
import engiegames.engies_chaos.procedures.THEENDProphMult1Procedure;
import engiegames.engies_chaos.procedures.SDDAYProphNoneProcedure;
import engiegames.engies_chaos.procedures.SDDAYProphMult4Procedure;
import engiegames.engies_chaos.procedures.SDDAYProphMult3Procedure;
import engiegames.engies_chaos.procedures.SDDAYProphMult2Procedure;
import engiegames.engies_chaos.procedures.SDDAYProphMult1Procedure;
import engiegames.engies_chaos.procedures.ProphecyDisplayOverlayIngameProcedure;
import engiegames.engies_chaos.procedures.ENGIEGAMESProphNoneProcedure;
import engiegames.engies_chaos.procedures.ENGIEGAMESProphMult4Procedure;
import engiegames.engies_chaos.procedures.ENGIEGAMESProphMult3Procedure;
import engiegames.engies_chaos.procedures.ENGIEGAMESProphMult2Procedure;
import engiegames.engies_chaos.procedures.ENGIEGAMESProphMult1Procedure;
import engiegames.engies_chaos.procedures.DDAYProphNoneProcedure;
import engiegames.engies_chaos.procedures.DDAYProphMult4Procedure;
import engiegames.engies_chaos.procedures.DDAYProphMult3Procedure;
import engiegames.engies_chaos.procedures.DDAYProphMult2Procedure;
import engiegames.engies_chaos.procedures.DDAYProphMult1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class ProphecyOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
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
		if (ProphecyDisplayOverlayIngameProcedure.execute(world)) {
			if (DDAYProphNoneProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/doomsdayproph.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (DDAYProphMult1Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/doomsdayprophmult1.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (DDAYProphMult2Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/doomsdayprophmult2.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (DDAYProphMult3Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/doomsdayprophmult3.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (DDAYProphMult4Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/doomsdayprophmult4.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (SDDAYProphNoneProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/superdoomsdayproph.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (SDDAYProphMult1Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/superdoomsdayprophmult1.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (SDDAYProphMult2Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/superdoomsdayprophmult2.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (SDDAYProphMult3Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/superdoomsdayprophmult3.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (SDDAYProphMult4Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/superdoomsdayprophmult4.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (THEENDProphNoneProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/theendproph.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (THEENDProphMult1Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/theendprophmult1.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (THEENDProphMult2Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/theendprophmult2.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (THEENDProphMult3Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/theendprophmult3.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (THEENDProphMult4Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/theendprophmult4.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ENGIEGAMESProphNoneProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/engiegamesproph.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ENGIEGAMESProphMult1Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/engiegamesprophmult1.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ENGIEGAMESProphMult2Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/engiegamesprophmult2.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ENGIEGAMESProphMult3Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/engiegamesprophmult3.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
			if (ENGIEGAMESProphMult4Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/engiegamesprophmult4.png"), w / 2 + -180, 40, 0, 0, 352, 50, 352, 50);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}