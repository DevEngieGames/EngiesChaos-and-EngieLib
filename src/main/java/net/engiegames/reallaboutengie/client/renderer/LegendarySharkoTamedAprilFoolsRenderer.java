package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.LegendarySharkoTamedAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfools;

public class LegendarySharkoTamedAprilFoolsRenderer extends MobRenderer<LegendarySharkoTamedAprilFoolsEntity, Modelboyoaprilfools<LegendarySharkoTamedAprilFoolsEntity>> {
	public LegendarySharkoTamedAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools<LegendarySharkoTamedAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LegendarySharkoTamedAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/legendaryboyoaprilfirstt.png");
	}
}