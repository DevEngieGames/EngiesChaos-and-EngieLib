package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedTNT5Entity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedTNT5Renderer extends MobRenderer<EnragedTNT5Entity, Modelenragedzombie<EnragedTNT5Entity>> {
	public EnragedTNT5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedTNT5Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT5Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedboom5.png");
	}
}