package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EngieSharkoLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssit;

public class EngieSharkoLayAprilFoolsRenderer extends MobRenderer<EngieSharkoLayAprilFoolsEntity, Modelboyoaprilfoolssit<EngieSharkoLayAprilFoolsEntity>> {
	public EngieSharkoLayAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssit<EngieSharkoLayAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoLayAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyoaprilfirstt.png");
	}
}