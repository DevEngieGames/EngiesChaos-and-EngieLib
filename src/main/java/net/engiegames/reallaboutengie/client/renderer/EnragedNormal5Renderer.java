package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedNormal5Entity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedNormal5Renderer extends MobRenderer<EnragedNormal5Entity, Modelenragedzombie<EnragedNormal5Entity>> {
	public EnragedNormal5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedNormal5Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal5Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednormal5.png");
	}
}