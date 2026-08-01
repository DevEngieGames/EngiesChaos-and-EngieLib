package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedSpeed5Entity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedSpeed5Renderer extends MobRenderer<EnragedSpeed5Entity, Modelenragedzombie<EnragedSpeed5Entity>> {
	public EnragedSpeed5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeed5Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed5Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedspeed5.png");
	}
}