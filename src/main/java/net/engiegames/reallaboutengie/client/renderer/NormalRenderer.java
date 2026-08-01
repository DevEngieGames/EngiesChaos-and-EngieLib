package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.NormalEntity;
import net.engiegames.reallaboutengie.client.model.Modelmissilebombs;

public class NormalRenderer extends MobRenderer<NormalEntity, Modelmissilebombs<NormalEntity>> {
	public NormalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<NormalEntity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(NormalEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/normal.png");
	}
}