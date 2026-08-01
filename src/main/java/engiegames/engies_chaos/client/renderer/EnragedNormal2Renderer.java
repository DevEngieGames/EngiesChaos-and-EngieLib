package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedNormal2Entity;
import engiegames.engies_chaos.client.model.Modelenragedzombie;

public class EnragedNormal2Renderer extends MobRenderer<EnragedNormal2Entity, Modelenragedzombie<EnragedNormal2Entity>> {
	public EnragedNormal2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedNormal2Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal2Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragednormal2.png");
	}
}