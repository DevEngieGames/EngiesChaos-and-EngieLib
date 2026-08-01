package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EngieSharkoRareAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfools;

public class EngieSharkoRareAprilFoolsRenderer extends MobRenderer<EngieSharkoRareAprilFoolsEntity, Modelboyoaprilfools<EngieSharkoRareAprilFoolsEntity>> {
	public EngieSharkoRareAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools<EngieSharkoRareAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRareAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyorare1aprilfirst.png");
	}
}