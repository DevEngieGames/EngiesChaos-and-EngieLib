package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.DDAYRiftEntity;
import net.engiegames.reallaboutengie.client.model.Modelddayrift;

public class DDAYRiftRenderer extends MobRenderer<DDAYRiftEntity, Modelddayrift<DDAYRiftEntity>> {
	public DDAYRiftRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelddayrift<DDAYRiftEntity>(context.bakeLayer(Modelddayrift.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DDAYRiftEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rifttexture.png");
	}
}