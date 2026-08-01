package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.engiegames.reallaboutengie.entity.ThrowbackEnragedEngieEntity;

public class ThrowbackEnragedEngieRenderer extends HumanoidMobRenderer<ThrowbackEnragedEngieEntity, HumanoidModel<ThrowbackEnragedEngieEntity>> {
	public ThrowbackEnragedEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<ThrowbackEnragedEngieEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(ThrowbackEnragedEngieEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/throwbackenragedengie.png");
	}
}