package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.RareSharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssleep;

public class RareSharkoSleepAprilFoolsRenderer extends MobRenderer<RareSharkoSleepAprilFoolsEntity, Modelboyoaprilfoolssleep<RareSharkoSleepAprilFoolsEntity>> {
	public RareSharkoSleepAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssleep<RareSharkoSleepAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssleep.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareSharkoSleepAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareboyoaprilfirsttsleep.png");
	}
}