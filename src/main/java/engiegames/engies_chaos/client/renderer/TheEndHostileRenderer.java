package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import engiegames.engies_chaos.entity.TheEndHostileEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TheEndHostileRenderer extends HumanoidMobRenderer<TheEndHostileEntity, HumanoidModel<TheEndHostileEntity>> {
	public TheEndHostileRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<TheEndHostileEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	protected void scale(TheEndHostileEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheEndHostileEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/theendmob.png");
	}
}