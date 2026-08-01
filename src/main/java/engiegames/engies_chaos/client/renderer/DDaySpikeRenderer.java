package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.DDaySpikeEntity;
import engiegames.engies_chaos.client.model.Modelddayspike;

import com.mojang.blaze3d.vertex.PoseStack;

public class DDaySpikeRenderer extends MobRenderer<DDaySpikeEntity, LivingEntityRenderState, Modelddayspike> {
	private DDaySpikeEntity entity = null;

	public DDaySpikeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelddayspike(context.bakeLayer(Modelddayspike.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DDaySpikeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("engies_chaos:textures/entities/ddayspike.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(5f, 5f, 5f);
	}
}