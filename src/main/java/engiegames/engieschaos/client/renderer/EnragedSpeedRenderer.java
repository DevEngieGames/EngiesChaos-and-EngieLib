package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.EnragedSpeedEntity;
import engiegames.engieschaos.client.model.Modelenragedzombie;

public class EnragedSpeedRenderer extends MobRenderer<EnragedSpeedEntity, Modelenragedzombie<EnragedSpeedEntity>> {
	public EnragedSpeedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedSpeedEntity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeedEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedspeed.png");
	}
}