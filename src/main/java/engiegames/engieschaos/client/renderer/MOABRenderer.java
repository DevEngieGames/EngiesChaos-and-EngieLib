package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.MOABEntity;
import engiegames.engieschaos.client.model.Modelmissilebombs;

public class MOABRenderer extends MobRenderer<MOABEntity, Modelmissilebombs<MOABEntity>> {
	public MOABRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<MOABEntity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MOABEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/moab.png");
	}
}