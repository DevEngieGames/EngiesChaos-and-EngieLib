package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import engiegames.engies_chaos.procedures.MobModelScalingProcedure;
import engiegames.engies_chaos.entity.HeWhoGamesEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class HeWhoGamesRenderer extends HumanoidMobRenderer<HeWhoGamesEntity, HumanoidModel<HeWhoGamesEntity>> {
	public HeWhoGamesRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<HeWhoGamesEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	protected void scale(HeWhoGamesEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(HeWhoGamesEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/hewhogamesbiped.png");
	}
}