package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.procedures.ReturnAvaSizeProcedure;
import engiegames.engies_chaos.entity.DDayAvalancheEntity;
import engiegames.engies_chaos.client.model.Modelavalanche_ball;

import com.mojang.blaze3d.vertex.PoseStack;

public class DDayAvalancheRenderer extends MobRenderer<DDayAvalancheEntity, LivingEntityRenderState, Modelavalanche_ball> {
	private DDayAvalancheEntity entity = null;

	public DDayAvalancheRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelavalanche_ball(context.bakeLayer(Modelavalanche_ball.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DDayAvalancheEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("engies_chaos:textures/entities/avaball.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) ReturnAvaSizeProcedure.execute(entity);
		poseStack.scale(scale, scale, scale);
	}
}