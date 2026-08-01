package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedTNTEntity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedTNTRenderer extends MobRenderer<EnragedTNTEntity, Modelenragedzombie<EnragedTNTEntity>> {
	public EnragedTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedTNTEntity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNTEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedboom.png");
	}
}