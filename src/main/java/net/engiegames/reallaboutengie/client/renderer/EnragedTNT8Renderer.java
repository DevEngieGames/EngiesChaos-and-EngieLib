package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedTNT8Entity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedTNT8Renderer extends MobRenderer<EnragedTNT8Entity, Modelenragedzombie<EnragedTNT8Entity>> {
	public EnragedTNT8Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedTNT8Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT8Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedboom8.png");
	}
}