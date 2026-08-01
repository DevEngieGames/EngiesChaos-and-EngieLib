package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import engiegames.engieschaos.entity.SuperDoomsDayEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class SuperDoomsDayRenderer extends HumanoidMobRenderer<SuperDoomsDayEntity, HumanoidModel<SuperDoomsDayEntity>> {
	public SuperDoomsDayRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<SuperDoomsDayEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	protected void scale(SuperDoomsDayEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(SuperDoomsDayEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/superdoomsdayentity.png");
	}
}