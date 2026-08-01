package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedNormalEntity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedNormalRenderer extends MobRenderer<EnragedNormalEntity, Modelenragedzombie<EnragedNormalEntity>> {
	public EnragedNormalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedNormalEntity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormalEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednormal.png");
	}
}