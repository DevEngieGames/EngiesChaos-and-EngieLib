package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.AlbinoSharkoAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfools;

public class AlbinoSharkoAprilFoolsRenderer extends MobRenderer<AlbinoSharkoAprilFoolsEntity, Modelboyoaprilfools<AlbinoSharkoAprilFoolsEntity>> {
	public AlbinoSharkoAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools<AlbinoSharkoAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlbinoSharkoAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/albinoboyoaprilfirst.png");
	}
}