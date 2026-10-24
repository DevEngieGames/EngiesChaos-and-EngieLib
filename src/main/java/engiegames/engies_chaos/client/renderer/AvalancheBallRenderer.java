package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.procedures.AvalancheBallScaleProcedure;
import engiegames.engies_chaos.entity.AvalancheBallEntity;
import engiegames.engies_chaos.client.model.Modelavalanche_ball;

import com.mojang.blaze3d.vertex.PoseStack;

public class AvalancheBallRenderer extends MobRenderer<AvalancheBallEntity, Modelavalanche_ball<AvalancheBallEntity>> {
	public AvalancheBallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelavalanche_ball<AvalancheBallEntity>(context.bakeLayer(Modelavalanche_ball.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(AvalancheBallEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) AvalancheBallScaleProcedure.execute(entity);
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(AvalancheBallEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/avaball.png");
	}
}