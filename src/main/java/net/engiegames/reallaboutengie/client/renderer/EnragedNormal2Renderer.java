package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedNormal2Entity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedNormal2Renderer extends MobRenderer<EnragedNormal2Entity, Modelenragedzombie<EnragedNormal2Entity>> {
	public EnragedNormal2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedNormal2Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal2Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednormal2.png");
	}
}