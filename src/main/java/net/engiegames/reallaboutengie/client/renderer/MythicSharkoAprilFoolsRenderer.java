package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.MythicSharkoAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfools;

public class MythicSharkoAprilFoolsRenderer extends MobRenderer<MythicSharkoAprilFoolsEntity, Modelboyoaprilfools<MythicSharkoAprilFoolsEntity>> {
	public MythicSharkoAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools<MythicSharkoAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MythicSharkoAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/mythicboyoaprilfirst.png");
	}
}