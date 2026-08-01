package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EngieSharkoRareLayAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssit;

public class EngieSharkoRareLayAprilFoolsRenderer extends MobRenderer<EngieSharkoRareLayAprilFoolsEntity, Modelboyoaprilfoolssit<EngieSharkoRareLayAprilFoolsEntity>> {
	public EngieSharkoRareLayAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssit<EngieSharkoRareLayAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRareLayAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyorare1aprilfirstt.png");
	}
}