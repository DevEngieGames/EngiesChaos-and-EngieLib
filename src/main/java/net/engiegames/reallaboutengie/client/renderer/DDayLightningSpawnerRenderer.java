package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.DDayLightningSpawnerEntity;
import net.engiegames.reallaboutengie.client.model.Modelmissilebombs;

public class DDayLightningSpawnerRenderer extends MobRenderer<DDayLightningSpawnerEntity, Modelmissilebombs<DDayLightningSpawnerEntity>> {
	public DDayLightningSpawnerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<DDayLightningSpawnerEntity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(DDayLightningSpawnerEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/lightningspawner.png");
	}
}