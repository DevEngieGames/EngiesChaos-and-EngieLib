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
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.engiegames.reallaboutengie.procedures.DifficultyOverlayShow2Procedure;
import net.engiegames.reallaboutengie.procedures.Difficulty9ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty8ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty7ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty6ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty5ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty4ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty3ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty32ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty31ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty30ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty2ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty29ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty28ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty27ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty26ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty25ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty24ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty23ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty22ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty21ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty20ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty1ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty19ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty18ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty17ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty16ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty15ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty14ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty12ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty11ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty10ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty0ReturnTrueCheckProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DifficultyOverlayTextOverlay {
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
		if (DifficultyOverlayShow2Procedure.execute(entity)) {
			if (Difficulty0ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff0.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty1ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty2ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty3ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty4ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty5ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty6ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty7ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty8ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff8.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty9ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff9.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty10ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff10.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty11ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff11.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty12ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff12.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty14ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff13.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty15ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff15.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty16ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff16.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty17ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff17.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty18ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff18.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty19ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff19.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty20ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff20.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty21ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff21.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty22ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff22.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty23ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff23.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty24ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff24.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty25ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff25.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty26ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff26.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty27ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff27.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty28ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff28.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty29ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff29.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty30ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff30.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty31ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff31.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
			if (Difficulty32ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff32.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 125, 0, 0, 125, 28, 125, 28);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}