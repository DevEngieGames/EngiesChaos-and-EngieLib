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

import engiegames.engies_chaos.procedures.TheEndCheckProcedure;
import engiegames.engies_chaos.procedures.SuperDoomsDayCheckProcedure;
import engiegames.engies_chaos.procedures.ReturnDdayTimerProcedure;
import engiegames.engies_chaos.procedures.EngiesWrathCheckProcedure;
import engiegames.engies_chaos.procedures.DoomsDeadCountSmallProcedure;
import engiegames.engies_chaos.procedures.DoomsDeadCountProcedure;
import engiegames.engies_chaos.procedures.DoomsDeadCountBigProcedure;
import engiegames.engies_chaos.procedures.DoomsDayDeadOverlayCheckProcedure;
import engiegames.engies_chaos.procedures.DoomsDayCheckProcedure;
import engiegames.engies_chaos.procedures.DoomsDayAliveOverlayCheckProcedure;
import engiegames.engies_chaos.procedures.DoomsDayAliveDeathCountDisplayOverlayIngameProcedure;
import engiegames.engies_chaos.procedures.DoomsAliveCountSmallProcedure;
import engiegames.engies_chaos.procedures.DoomsAliveCountProcedure;
import engiegames.engies_chaos.procedures.DoomsAliveCountBigProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DoomsDayAliveDeathCountOverlay {
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
		if (DoomsDayAliveDeathCountDisplayOverlayIngameProcedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/ddaybottomleft.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 93, h - 28, 0, 0, 93, 28, 93, 28);

			if (DoomsDayAliveOverlayCheckProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/ddaybottomleftalive.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			if (DoomsDayDeadOverlayCheckProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/ddaybottomleftdead.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			if (DoomsDayCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/ddaystatus.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			if (SuperDoomsDayCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/sddaystatus.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			if (TheEndCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/theendstatus.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			if (EngiesWrathCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/engieswrathstatus.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 93, h - 28, 0, 0, 93, 28, 93, 28);
			}
			RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/ddaydeadcounticon.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), 16, h - 32, 0, 0, 16, 16, 16, 16);

			RenderSystem.setShaderTexture(0, new ResourceLocation("engies_chaos:textures/screens/ddayalivecounticon.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), 16, h - 53, 0, 0, 16, 16, 16, 16);

			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnDdayTimerProcedure.execute(world), w - 90, h - 26, -16777216);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnDdayTimerProcedure.execute(world), w - 91, h - 27, -1);
			if (DoomsAliveCountSmallProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsAliveCountProcedure.execute(world), 22, h - 47, -16777216);
			if (DoomsAliveCountSmallProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsAliveCountProcedure.execute(world), 21, h - 48, -1);
			if (DoomsAliveCountBigProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsAliveCountProcedure.execute(world), 20, h - 47, -16777216);
			if (DoomsAliveCountBigProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsAliveCountProcedure.execute(world), w / 2 + -194, h / 2 + 72, -1);
			if (DoomsDeadCountSmallProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsDeadCountProcedure.execute(world), 23, h - 25, -16777216);
			if (DoomsDeadCountSmallProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsDeadCountProcedure.execute(world), 22, h - 26, -1);
			if (DoomsDeadCountBigProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsDeadCountProcedure.execute(world), 21, h - 25, -16777216);
			if (DoomsDeadCountBigProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsDeadCountProcedure.execute(world), 20, h - 26, -1);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}