package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EpicSharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssit;

public class EpicSharkoLayAprilFoolsRenderer extends MobRenderer<EpicSharkoLayAprilFoolsEntity, Modelboyoaprilfoolssit<EpicSharkoLayAprilFoolsEntity>> {
	public EpicSharkoLayAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssit<EpicSharkoLayAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EpicSharkoLayAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/epicboyoaprilfirstt.png");
	}
}