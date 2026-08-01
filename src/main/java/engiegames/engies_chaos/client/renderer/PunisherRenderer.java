package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.procedures.MobModelScalingProcedure;
import engiegames.engies_chaos.entity.PunisherEntity;
import engiegames.engies_chaos.client.model.Modelpunishernew;

import com.mojang.blaze3d.vertex.PoseStack;

public class PunisherRenderer extends MobRenderer<PunisherEntity, LivingEntityRenderState, Modelpunishernew> {
	private PunisherEntity entity = null;

	public PunisherRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpunishernew(context.bakeLayer(Modelpunishernew.LAYER_LOCATION)), 5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PunisherEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("engies_chaos:textures/entities/punishernew.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	protected boolean isShaking(LivingEntityRenderState state) {
		return true;
	}
}