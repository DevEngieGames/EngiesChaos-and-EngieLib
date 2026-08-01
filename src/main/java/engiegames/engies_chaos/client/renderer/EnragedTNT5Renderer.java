package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedTNT5Entity;
import engiegames.engies_chaos.client.model.Modelenragedzombie;

public class EnragedTNT5Renderer extends MobRenderer<EnragedTNT5Entity, Modelenragedzombie<EnragedTNT5Entity>> {
	public EnragedTNT5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedTNT5Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT5Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedboom5.png");
	}
}