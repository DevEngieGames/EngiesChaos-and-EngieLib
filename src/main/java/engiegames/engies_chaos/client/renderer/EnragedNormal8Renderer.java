package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedNormal8Entity;
import engiegames.engies_chaos.client.model.Modelenragedzombie;

public class EnragedNormal8Renderer extends MobRenderer<EnragedNormal8Entity, Modelenragedzombie<EnragedNormal8Entity>> {
	public EnragedNormal8Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedNormal8Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal8Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragednormal8.png");
	}
}