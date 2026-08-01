package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.RareSharkoTamedAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfools;

public class RareSharkoTamedAprilFoolsRenderer extends MobRenderer<RareSharkoTamedAprilFoolsEntity, Modelboyoaprilfools<RareSharkoTamedAprilFoolsEntity>> {
	public RareSharkoTamedAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools<RareSharkoTamedAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareSharkoTamedAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareboyoaprilfirstt.png");
	}
}