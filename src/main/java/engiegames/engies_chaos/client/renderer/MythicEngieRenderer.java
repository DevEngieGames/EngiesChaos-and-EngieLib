package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import engiegames.engies_chaos.entity.MythicEngieEntity;

public class MythicEngieRenderer extends HumanoidMobRenderer<MythicEngieEntity, HumanoidModel<MythicEngieEntity>> {
	public MythicEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<MythicEngieEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(MythicEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/mythicengie.png");
	}
}