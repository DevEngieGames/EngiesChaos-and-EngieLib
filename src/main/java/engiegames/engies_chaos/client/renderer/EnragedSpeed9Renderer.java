package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedSpeed9Entity;
import engiegames.engies_chaos.client.model.Modelenragedzombie;

public class EnragedSpeed9Renderer extends MobRenderer<EnragedSpeed9Entity, Modelenragedzombie<EnragedSpeed9Entity>> {
	public EnragedSpeed9Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeed9Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed9Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedspeed9.png");
	}
}