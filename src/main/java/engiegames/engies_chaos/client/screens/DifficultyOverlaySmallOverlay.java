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

import engiegames.engies_chaos.procedures.DifficultyOverlayShow3Procedure;
import engiegames.engies_chaos.procedures.DifficultyNegativeOneReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty9ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty8ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty7ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty6ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty690ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty5ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty525ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty525000ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty500000ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty4ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty3ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty32ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty31ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty30ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty2ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty29ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty28ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty27ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty26ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty25ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty250000ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty24ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty23ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty22ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty21ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty20ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty1ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty19ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty18ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty17ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty16ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty15ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty14ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty13ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty12ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty11ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty10ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.Difficulty0ReturnTrueCheckProcedure;
import engiegames.engies_chaos.procedures.CheckForEngieGamesSwordAdvancmentProcedure;
import engiegames.engies_chaos.procedures.CheckForAntimatterEngieGamesSwordAdvancmentProcedure;
import engiegames.engies_chaos.procedures.CheckFor101PercentAdvancmentProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class DifficultyOverlaySmallOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
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
		if (DifficultyOverlayShow3Procedure.execute(world, entity)) {
			event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/difficultyoverlaybg.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);

			if (CheckForEngieGamesSwordAdvancmentProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/difficultyoverlaybgalt1.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (CheckForAntimatterEngieGamesSwordAdvancmentProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/difficultyoverlaybgalt2.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (CheckFor101PercentAdvancmentProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/difficultyoverlaybgalt3.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/difficultyoverlaybgoutline.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);

			if (DifficultyNegativeOneReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diffneg1.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty0ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff0.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty1ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff1.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty2ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff2.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty3ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff3.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty4ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff4.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty5ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff5.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty6ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff6.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty7ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff7.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty8ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff8.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty9ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff9.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty10ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff10.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty11ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff11.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty12ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff12.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty13ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff13.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty14ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff14.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty15ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff15.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty16ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff16.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty17ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff17.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty18ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff18.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty19ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff19.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty20ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff20.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty21ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff21.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty22ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff22.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty23ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff23.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty24ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff24.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty25ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff25.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty26ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff26.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty27ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff27.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty28ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff28.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty29ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff29.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty30ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff30.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty31ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff31.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty32ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff32.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty525ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff525.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty690ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff690.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty250000ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff250000.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty500000ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff500000.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
			if (Difficulty525000ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("engies_chaos:textures/screens/diff525000.png"), w - 128, 0, 0, 0, 128, 32, 128, 32);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}