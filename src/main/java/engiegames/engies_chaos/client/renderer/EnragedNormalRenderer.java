package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedNormalEntity;
import engiegames.engies_chaos.client.model.Modelenragedzombie;

public class EnragedNormalRenderer extends MobRenderer<EnragedNormalEntity, Modelenragedzombie<EnragedNormalEntity>> {
	public EnragedNormalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedNormalEntity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormalEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragednormal.png");
	}
}