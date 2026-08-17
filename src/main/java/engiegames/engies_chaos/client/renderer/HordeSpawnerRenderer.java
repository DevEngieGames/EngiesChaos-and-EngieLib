package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.HordeSpawnerEntity;
import engiegames.engies_chaos.client.model.Modelmissilebombs;

public class HordeSpawnerRenderer extends MobRenderer<HordeSpawnerEntity, Modelmissilebombs<HordeSpawnerEntity>> {
	public HordeSpawnerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<HordeSpawnerEntity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(HordeSpawnerEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/lightningspawner.png");
	}
}