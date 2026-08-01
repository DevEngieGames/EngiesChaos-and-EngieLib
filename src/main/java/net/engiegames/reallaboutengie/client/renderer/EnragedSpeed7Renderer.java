package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedSpeed7Entity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedSpeed7Renderer extends MobRenderer<EnragedSpeed7Entity, Modelenragedzombie<EnragedSpeed7Entity>> {
	public EnragedSpeed7Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeed7Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed7Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedspeed7.png");
	}
}