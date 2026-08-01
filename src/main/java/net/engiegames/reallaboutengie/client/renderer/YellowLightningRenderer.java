package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.YellowLightningEntity;
import net.engiegames.reallaboutengie.client.model.Modelmissilebombs;

public class YellowLightningRenderer extends MobRenderer<YellowLightningEntity, Modelmissilebombs<YellowLightningEntity>> {
	public YellowLightningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<YellowLightningEntity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(YellowLightningEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/yellowlightning.png");
	}
}