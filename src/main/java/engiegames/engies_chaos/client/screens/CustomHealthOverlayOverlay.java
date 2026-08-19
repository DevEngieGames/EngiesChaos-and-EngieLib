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

import engiegames.engies_chaos.procedures.TrueHardcoreLivesCheckProcedure;
import engiegames.engies_chaos.procedures.RiskTextNoneProcedure;
import engiegames.engies_chaos.procedures.RiskTextMediumProcedure;
import engiegames.engies_chaos.procedures.RiskTextLowProcedure;
import engiegames.engies_chaos.procedures.RiskTextHighProcedure;
import engiegames.engies_chaos.procedures.RiskTextGuaranteedProcedure;
import engiegames.engies_chaos.procedures.RiskTextExtremeProcedure;
import engiegames.engies_chaos.procedures.OverhealShowProcedure;
import engiegames.engies_chaos.procedures.Only16CharactersProcedure;
import engiegames.engies_chaos.procedures.Only16Characters2Procedure;
import engiegames.engies_chaos.procedures.NormalShowProcedure;
import engiegames.engies_chaos.procedures.LowShowProcedure;
import engiegames.engies_chaos.procedures.HealthCheckProcedure;
import engiegames.engies_chaos.procedures.DDayNoneRiskVisProcedure;
import engiegames.engies_chaos.procedures.DDayMediumRiskVisProcedure;
import engiegames.engies_chaos.procedures.DDayLowRiskVisProcedure;
import engiegames.engies_chaos.procedures.DDayHighRiskVisProcedure;
import engiegames.engies_chaos.procedures.DDayGuaranteedRiskVisProcedure;
import engiegames.engies_chaos.procedures.DDayExtremeRiskVisProcedure;
import engiegames.engies_chaos.procedures.CustomHealthOverlayDisplayOverlayIngameProcedure;
import engiegames.engies_chaos.procedures.ArmorCheckProcedure;

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
			RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/newhpoverlay.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h - 42, 0, 0, 132, 42, 132, 42);

			Minecraft.getInstance().font.draw(event.getPoseStack(),

					Only16Characters2Procedure.execute(entity), 4, h - 38, -16777216);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					Only16CharactersProcedure.execute(entity), 3, h - 39, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					HealthCheckProcedure.execute(entity), 4, h - 10, -16777216);
			if (LowShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						HealthCheckProcedure.execute(entity), 3, h - 11, -1363406);
			if (NormalShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						HealthCheckProcedure.execute(entity), 3, h - 11, -1);
			if (OverhealShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						HealthCheckProcedure.execute(entity), 3, h - 11, -13457941);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ArmorCheckProcedure.execute(entity), 70, h - 10, -16777216);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ArmorCheckProcedure.execute(entity), 69, h - 11, -1842205);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					TrueHardcoreLivesCheckProcedure.execute(world, entity), 70, h - 24, -16777216);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					TrueHardcoreLivesCheckProcedure.execute(world, entity), 69, h - 25, -11206656);
			if (DDayNoneRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextNoneProcedure.execute(), 4, h - 24, -12632257);
			if (DDayNoneRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextNoneProcedure.execute(), 3, h - 25, -1);
			if (DDayLowRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextLowProcedure.execute(), 4, h - 24, -15390208);
			if (DDayLowRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextLowProcedure.execute(), 3, h - 25, -11294720);
			if (DDayMediumRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextMediumProcedure.execute(), 4, h - 24, -14013952);
			if (DDayMediumRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextMediumProcedure.execute(), 3, h - 25, -5724160);
			if (DDayHighRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextHighProcedure.execute(), 4, h - 24, -12713984);
			if (DDayHighRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextHighProcedure.execute(), 3, h - 25, -393216);
			if (DDayExtremeRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextExtremeProcedure.execute(), 4, h - 24, -15204352);
			if (DDayExtremeRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextExtremeProcedure.execute(), 3, h - 25, -10551040);
			if (DDayGuaranteedRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextGuaranteedProcedure.execute(), 4, h - 24, -16777216);
			if (DDayGuaranteedRiskVisProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						RiskTextGuaranteedProcedure.execute(), 3, h - 25, -16777216);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}