package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EnragedTNT7Entity;
import net.engiegames.reallaboutengie.client.model.Modelenragedzombie;

public class EnragedTNT7Renderer extends MobRenderer<EnragedTNT7Entity, Modelenragedzombie<EnragedTNT7Entity>> {
	public EnragedTNT7Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedTNT7Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT7Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedboom7.png");
	}
}