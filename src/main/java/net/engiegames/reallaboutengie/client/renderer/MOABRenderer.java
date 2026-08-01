package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.MOABEntity;
import net.engiegames.reallaboutengie.client.model.Modelmissilebombs;

public class MOABRenderer extends MobRenderer<MOABEntity, Modelmissilebombs<MOABEntity>> {
	public MOABRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<MOABEntity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MOABEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/moab.png");
	}
}