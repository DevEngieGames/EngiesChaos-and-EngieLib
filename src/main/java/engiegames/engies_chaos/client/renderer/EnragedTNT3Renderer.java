package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedTNT3Entity;
import engiegames.engies_chaos.client.model.Modelenragedzombie;

public class EnragedTNT3Renderer extends MobRenderer<EnragedTNT3Entity, Modelenragedzombie<EnragedTNT3Entity>> {
	public EnragedTNT3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedTNT3Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT3Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedboom3.png");
	}
}