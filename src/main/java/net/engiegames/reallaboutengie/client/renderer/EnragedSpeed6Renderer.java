package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedSpeed6Entity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedSpeed6Renderer extends MobRenderer<EnragedSpeed6Entity, Modelenragedzombie<EnragedSpeed6Entity>> {
	public EnragedSpeed6Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeed6Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed6Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedspeed6.png");
	}
}