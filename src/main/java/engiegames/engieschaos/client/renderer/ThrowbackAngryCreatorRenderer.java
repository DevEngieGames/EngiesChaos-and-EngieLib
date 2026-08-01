package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import engiegames.engieschaos.entity.ThrowbackAngryCreatorEntity;

public class ThrowbackAngryCreatorRenderer extends HumanoidMobRenderer<ThrowbackAngryCreatorEntity, HumanoidModel<ThrowbackAngryCreatorEntity>> {
	public ThrowbackAngryCreatorRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<ThrowbackAngryCreatorEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(ThrowbackAngryCreatorEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/throwbackangrycreator.png");
	}
}