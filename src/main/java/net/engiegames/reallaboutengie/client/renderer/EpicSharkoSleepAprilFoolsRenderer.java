package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EpicSharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssleep;

public class EpicSharkoSleepAprilFoolsRenderer extends MobRenderer<EpicSharkoSleepAprilFoolsEntity, Modelboyoaprilfoolssleep<EpicSharkoSleepAprilFoolsEntity>> {
	public EpicSharkoSleepAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssleep<EpicSharkoSleepAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssleep.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EpicSharkoSleepAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/epicboyoaprilfirsttsleep.png");
	}
}