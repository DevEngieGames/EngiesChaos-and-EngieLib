package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.DDayLightningSpawnerEntity;
import engiegames.engies_chaos.client.model.Modelmissilebombs;

public class DDayLightningSpawnerRenderer extends MobRenderer<DDayLightningSpawnerEntity, Modelmissilebombs<DDayLightningSpawnerEntity>> {
	public DDayLightningSpawnerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<DDayLightningSpawnerEntity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(DDayLightningSpawnerEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/lightningspawner.png");
	}
}