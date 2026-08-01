package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedSpeed2Entity;
import engiegames.engies_chaos.client.model.Modelenragedzombie;

public class EnragedSpeed2Renderer extends MobRenderer<EnragedSpeed2Entity, Modelenragedzombie<EnragedSpeed2Entity>> {
	public EnragedSpeed2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeed2Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed2Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedspeed2.png");
	}
}