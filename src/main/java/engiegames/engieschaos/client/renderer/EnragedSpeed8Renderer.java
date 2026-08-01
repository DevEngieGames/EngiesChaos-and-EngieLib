package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.EnragedSpeed8Entity;
import engiegames.engieschaos.client.model.Modelenragedzombie;

public class EnragedSpeed8Renderer extends MobRenderer<EnragedSpeed8Entity, Modelenragedzombie<EnragedSpeed8Entity>> {
	public EnragedSpeed8Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeed8Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed8Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedspeed8.png");
	}
}