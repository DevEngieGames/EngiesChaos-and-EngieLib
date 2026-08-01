package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.procedures.MobModelScalingProcedure;
import engiegames.engies_chaos.entity.TheRealEngieGamesHalloweenEntity;
import engiegames.engies_chaos.client.model.ModelEngieSharkEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TheRealEngieGamesHalloweenRenderer extends MobRenderer<TheRealEngieGamesHalloweenEntity, LivingEntityRenderState, ModelEngieSharkEntity> {
	private TheRealEngieGamesHalloweenEntity entity = null;

	public TheRealEngieGamesHalloweenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieSharkEntity(context.bakeLayer(ModelEngieSharkEntity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TheRealEngieGamesHalloweenEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("engies_chaos:textures/entities/sharkengiehalloween.png");
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
}