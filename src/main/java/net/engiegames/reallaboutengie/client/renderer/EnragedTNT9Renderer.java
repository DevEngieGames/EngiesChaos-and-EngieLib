package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedTNT9Entity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedTNT9Renderer extends MobRenderer<EnragedTNT9Entity, Modelenragedzombie<EnragedTNT9Entity>> {
	public EnragedTNT9Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedTNT9Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT9Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedboom9.png");
	}
}