package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.MythicSharkoSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssleep;

public class MythicSharkoSleepAprilFoolsRenderer extends MobRenderer<MythicSharkoSleepAprilFoolsEntity, Modelboyoaprilfoolssleep<MythicSharkoSleepAprilFoolsEntity>> {
	public MythicSharkoSleepAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssleep<MythicSharkoSleepAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssleep.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MythicSharkoSleepAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/mythicboyoaprilfirsttsleep.png");
	}
}