package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.AlienEngieSharkoEntity;
import net.engiegames.reallaboutengie.client.model.Modelalienengiesharko;

public class AlienEngieSharkoRenderer extends MobRenderer<AlienEngieSharkoEntity, Modelalienengiesharko<AlienEngieSharkoEntity>> {
	public AlienEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelalienengiesharko<AlienEngieSharkoEntity>(context.bakeLayer(Modelalienengiesharko.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlienEngieSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/alienengiesharko.png");
	}
}