package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.ExoticSharkoTamedAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfools;

public class ExoticSharkoTamedAprilFoolsRenderer extends MobRenderer<ExoticSharkoTamedAprilFoolsEntity, Modelboyoaprilfools<ExoticSharkoTamedAprilFoolsEntity>> {
	public ExoticSharkoTamedAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools<ExoticSharkoTamedAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ExoticSharkoTamedAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/exoticboyoaprilfirstt.png");
	}
}