package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.TheRealEngieGamesHalloweenEntity;
import net.engiegames.reallaboutengie.client.model.ModelEngieSharkEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TheRealEngieGamesHalloweenRenderer extends MobRenderer<TheRealEngieGamesHalloweenEntity, ModelEngieSharkEntity<TheRealEngieGamesHalloweenEntity>> {
	public TheRealEngieGamesHalloweenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieSharkEntity<TheRealEngieGamesHalloweenEntity>(context.bakeLayer(ModelEngieSharkEntity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(TheRealEngieGamesHalloweenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheRealEngieGamesHalloweenEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/sharkengiehalloween.png");
	}
}