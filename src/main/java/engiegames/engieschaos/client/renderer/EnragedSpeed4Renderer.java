package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.EnragedSpeed4Entity;
import engiegames.engieschaos.client.model.Modelenragedzombie;

public class EnragedSpeed4Renderer extends MobRenderer<EnragedSpeed4Entity, Modelenragedzombie<EnragedSpeed4Entity>> {
	public EnragedSpeed4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeed4Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed4Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedspeed4.png");
	}
}