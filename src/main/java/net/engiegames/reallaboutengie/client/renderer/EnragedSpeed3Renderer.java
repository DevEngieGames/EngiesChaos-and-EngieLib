package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedSpeed3Entity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedSpeed3Renderer extends MobRenderer<EnragedSpeed3Entity, Modelenragedzombie<EnragedSpeed3Entity>> {
	public EnragedSpeed3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeed3Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed3Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedspeed3.png");
	}
}