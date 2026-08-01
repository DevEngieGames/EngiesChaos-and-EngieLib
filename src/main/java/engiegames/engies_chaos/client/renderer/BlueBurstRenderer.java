package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.BlueBurstEntity;
import engiegames.engies_chaos.client.model.Modelmissilebombs;

public class BlueBurstRenderer extends MobRenderer<BlueBurstEntity, Modelmissilebombs<BlueBurstEntity>> {
	public BlueBurstRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<BlueBurstEntity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueBurstEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/blueburst.png");
	}
}