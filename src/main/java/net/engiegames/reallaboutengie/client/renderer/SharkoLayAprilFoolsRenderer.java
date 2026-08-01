package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.SharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssit;

public class SharkoLayAprilFoolsRenderer extends MobRenderer<SharkoLayAprilFoolsEntity, Modelboyoaprilfoolssit<SharkoLayAprilFoolsEntity>> {
	public SharkoLayAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssit<SharkoLayAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SharkoLayAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/boyoaprilfirstt.png");
	}
}