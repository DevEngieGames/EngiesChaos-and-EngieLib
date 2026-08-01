package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.LegendarySharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssit;

public class LegendarySharkoLayAprilFoolsRenderer extends MobRenderer<LegendarySharkoLayAprilFoolsEntity, Modelboyoaprilfoolssit<LegendarySharkoLayAprilFoolsEntity>> {
	public LegendarySharkoLayAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssit<LegendarySharkoLayAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LegendarySharkoLayAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/legendaryboyoaprilfirstt.png");
	}
}