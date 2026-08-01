package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.procedures.YellowLightningScaleProcedure;
import engiegames.engies_chaos.entity.YellowLightningEntity;
import engiegames.engies_chaos.client.model.Modelmissilebombs;

import com.mojang.blaze3d.vertex.PoseStack;

public class YellowLightningRenderer extends MobRenderer<YellowLightningEntity, LivingEntityRenderState, Modelmissilebombs> {
	private YellowLightningEntity entity = null;

	public YellowLightningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(YellowLightningEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("engies_chaos:textures/entities/yellowlightning.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) YellowLightningScaleProcedure.execute(entity);
		poseStack.scale(scale, scale, scale);
	}
}