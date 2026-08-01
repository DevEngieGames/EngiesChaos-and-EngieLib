package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EngieSharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssleep;

public class EngieSharkoSleepAprilFoolsRenderer extends MobRenderer<EngieSharkoSleepAprilFoolsEntity, Modelboyoaprilfoolssleep<EngieSharkoSleepAprilFoolsEntity>> {
	public EngieSharkoSleepAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssleep<EngieSharkoSleepAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssleep.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoSleepAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyoaprilfirsttsleep.png");
	}
}