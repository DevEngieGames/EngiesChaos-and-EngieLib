package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.EnragedSpeed3Entity;
import engiegames.engieschaos.client.model.Modelenragedzombie;

public class EnragedSpeed3Renderer extends MobRenderer<EnragedSpeed3Entity, Modelenragedzombie<EnragedSpeed3Entity>> {
	public EnragedSpeed3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeed3Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed3Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedspeed3.png");
	}
}