package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.PunisherEntity;
import engiegames.engies_chaos.client.model.Modelpunishernew;

public class PunisherRenderer extends MobRenderer<PunisherEntity, Modelpunishernew<PunisherEntity>> {
	public PunisherRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpunishernew<PunisherEntity>(context.bakeLayer(Modelpunishernew.LAYER_LOCATION)), 5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PunisherEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/punishernew.png");
	}

	@Override
	protected boolean isShaking(PunisherEntity entity) {
		return true;
	}
}