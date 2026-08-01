package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.YellowLightningEntity;
import engiegames.engieschaos.client.model.Modelmissilebombs;

public class YellowLightningRenderer extends MobRenderer<YellowLightningEntity, Modelmissilebombs<YellowLightningEntity>> {
	public YellowLightningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<YellowLightningEntity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(YellowLightningEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/yellowlightning.png");
	}
}