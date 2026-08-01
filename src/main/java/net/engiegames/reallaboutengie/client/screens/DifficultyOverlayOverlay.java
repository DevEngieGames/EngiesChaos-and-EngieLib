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

import net.engiegames.reallaboutengie.procedures.DifficultyOverlayShowProcedure;
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
import net.engiegames.reallaboutengie.procedures.Difficulty15to29ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty14ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty13ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty12ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty11ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty10ReturnTrueCheckProcedure;
import net.engiegames.reallaboutengie.procedures.Difficulty012ReturnTrueCheckProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DifficultyOverlayOverlay {
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
		if (DifficultyOverlayShowProcedure.execute(entity)) {
			if (Difficulty012ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff012new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty3ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff3new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty4ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff4new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty5ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff5new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty6ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff6new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty7ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff7new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty8ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff8new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty9ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff9new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty10ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff10new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty11ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff11new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty12ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff12new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty13ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff13new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty14ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diff14new.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty15to29ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diffantimatternew.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty30ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diffcosmicnew.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty31ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/diffroughiannew.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
			if (Difficulty32ReturnTrueCheckProcedure.execute(world)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/difffinalnew.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w - 125, 0, 0, 0, 125, 125, 125, 125);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}