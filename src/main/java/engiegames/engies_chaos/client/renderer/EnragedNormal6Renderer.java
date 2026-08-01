package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedNormal6Entity;
import engiegames.engies_chaos.client.model.Modelenragedzombie;

public class EnragedNormal6Renderer extends MobRenderer<EnragedNormal6Entity, Modelenragedzombie<EnragedNormal6Entity>> {
	public EnragedNormal6Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedNormal6Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal6Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragednormal6.png");
	}
}