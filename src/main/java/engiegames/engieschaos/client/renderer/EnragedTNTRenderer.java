package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.EnragedTNTEntity;
import engiegames.engieschaos.client.model.Modelenragedzombie;

public class EnragedTNTRenderer extends MobRenderer<EnragedTNTEntity, Modelenragedzombie<EnragedTNTEntity>> {
	public EnragedTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedTNTEntity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNTEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedboom.png");
	}
}