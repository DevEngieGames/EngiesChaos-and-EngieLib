package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedNormal4Entity;
import engiegames.engies_chaos.client.model.Modelenragedzombie;

public class EnragedNormal4Renderer extends MobRenderer<EnragedNormal4Entity, Modelenragedzombie<EnragedNormal4Entity>> {
	public EnragedNormal4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedNormal4Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal4Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragednormal4.png");
	}
}