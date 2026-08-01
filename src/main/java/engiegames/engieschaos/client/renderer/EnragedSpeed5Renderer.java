package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.EnragedSpeed5Entity;
import engiegames.engieschaos.client.model.Modelenragedzombie;

public class EnragedSpeed5Renderer extends MobRenderer<EnragedSpeed5Entity, Modelenragedzombie<EnragedSpeed5Entity>> {
	public EnragedSpeed5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeed5Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed5Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedspeed5.png");
	}
}