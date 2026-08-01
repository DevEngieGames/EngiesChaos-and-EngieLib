package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedTNT4Entity;
import engiegames.engies_chaos.client.model.Modelenragedzombie;

public class EnragedTNT4Renderer extends MobRenderer<EnragedTNT4Entity, Modelenragedzombie<EnragedTNT4Entity>> {
	public EnragedTNT4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedTNT4Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT4Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedboom4.png");
	}
}