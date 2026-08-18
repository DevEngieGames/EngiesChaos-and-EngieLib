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

import engiegames.engies_chaos.procedures.TheEndProphShowProcedure;
import engiegames.engies_chaos.procedures.SuperDoomsdayProphShowProcedure;
import engiegames.engies_chaos.procedures.ProphecyDisplayOverlayIngameProcedure;
import engiegames.engies_chaos.procedures.ProphNormalHorde7Procedure;
import engiegames.engies_chaos.procedures.ProphNormalHorde6Procedure;
import engiegames.engies_chaos.procedures.ProphNormalHorde5Procedure;
import engiegames.engies_chaos.procedures.ProphNormalHorde4Procedure;
import engiegames.engies_chaos.procedures.ProphNormalHorde3Procedure;
import engiegames.engies_chaos.procedures.ProphNormalHorde2Procedure;
import engiegames.engies_chaos.procedures.ProphNormalHorde1Procedure;
import engiegames.engies_chaos.procedures.ProphNightmareHorde7Procedure;
import engiegames.engies_chaos.procedures.ProphNightmareHorde6Procedure;
import engiegames.engies_chaos.procedures.ProphNightmareHorde5Procedure;
import engiegames.engies_chaos.procedures.ProphNightmareHorde4Procedure;
import engiegames.engies_chaos.procedures.ProphNightmareHorde3Procedure;
import engiegames.engies_chaos.procedures.ProphNightmareHorde2Procedure;
import engiegames.engies_chaos.procedures.ProphNightmareHorde1Procedure;
import engiegames.engies_chaos.procedures.ProphInsanityHorde7Procedure;
import engiegames.engies_chaos.procedures.ProphInsanityHorde6Procedure;
import engiegames.engies_chaos.procedures.ProphInsanityHorde5Procedure;
import engiegames.engies_chaos.procedures.ProphInsanityHorde4Procedure;
import engiegames.engies_chaos.procedures.ProphInsanityHorde3Procedure;
import engiegames.engies_chaos.procedures.ProphInsanityHorde2Procedure;
import engiegames.engies_chaos.procedures.ProphInsanityHorde1Procedure;
import engiegames.engies_chaos.procedures.ProphHorde4Procedure;
import engiegames.engies_chaos.procedures.ProphHorde2Procedure;
import engiegames.engies_chaos.procedures.ProphHorde1Procedure;
import engiegames.engies_chaos.procedures.ProphEngiePocHorde7Procedure;
import engiegames.engies_chaos.procedures.ProphEngiePocHorde6Procedure;
import engiegames.engies_chaos.procedures.ProphEngiePocHorde5Procedure;
import engiegames.engies_chaos.procedures.ProphEngiePocHorde4Procedure;
import engiegames.engies_chaos.procedures.ProphEngiePocHorde3Procedure;
import engiegames.engies_chaos.procedures.ProphEngiePocHorde2Procedure;
import engiegames.engies_chaos.procedures.ProphEngiePocHorde1Procedure;
import engiegames.engies_chaos.procedures.EngiesWrathProphShowProcedure;
import engiegames.engies_chaos.procedures.DoomsdayProphShowProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ProphecyOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
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
		if (ProphecyDisplayOverlayIngameProcedure.execute(world)) {
			if (DoomsdayProphShowProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/doomsdayproph.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (SuperDoomsdayProphShowProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/superdoomsdayproph.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (TheEndProphShowProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/theendproph.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (EngiesWrathProphShowProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/engiegamesproph.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphHorde1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNormalHorde1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde11.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNormalHorde2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde12.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNormalHorde3Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde13.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNormalHorde4Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde14.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNormalHorde5Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde15.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNormalHorde6Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde16.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNormalHorde7Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde17.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphHorde2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNightmareHorde1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde21.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNightmareHorde2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde22.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNightmareHorde3Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde23.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNightmareHorde4Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde24.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNightmareHorde5Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde25.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNightmareHorde6Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde26.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNightmareHorde7Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde27.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphNormalHorde3Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphInsanityHorde1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde31.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphInsanityHorde2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde32.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphInsanityHorde3Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde33.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphInsanityHorde4Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde34.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphInsanityHorde5Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde35.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphInsanityHorde6Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde36.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphInsanityHorde7Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde37.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphHorde4Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphEngiePocHorde1Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde41.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphEngiePocHorde2Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde42.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphEngiePocHorde3Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde43.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphEngiePocHorde4Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde44.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphEngiePocHorde5Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde45.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphEngiePocHorde6Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde46.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, 40, 0, 0, 528, 75, 528, 75);
			}
			if (ProphEngiePocHorde7Procedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/horde47.png"));
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