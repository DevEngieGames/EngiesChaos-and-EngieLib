package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.LegendarySharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssleep;

public class LegendarySharkoSleepAprilFoolsRenderer extends MobRenderer<LegendarySharkoSleepAprilFoolsEntity, Modelboyoaprilfoolssleep<LegendarySharkoSleepAprilFoolsEntity>> {
	public LegendarySharkoSleepAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssleep<LegendarySharkoSleepAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssleep.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LegendarySharkoSleepAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/legendaryboyoaprilfirsttsleep.png");
	}
}