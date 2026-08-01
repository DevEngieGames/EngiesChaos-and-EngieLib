package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EpicSharkoTamedEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyotamed;

public class EpicSharkoTamedRenderer extends MobRenderer<EpicSharkoTamedEntity, Modelboyotamed<EpicSharkoTamedEntity>> {
	public EpicSharkoTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyotamed<EpicSharkoTamedEntity>(context.bakeLayer(Modelboyotamed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EpicSharkoTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/epicsharkonewtamed.png");
	}
}