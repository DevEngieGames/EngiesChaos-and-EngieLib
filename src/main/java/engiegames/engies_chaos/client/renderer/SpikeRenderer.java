package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.SpikeEntity;
import engiegames.engies_chaos.client.model.Modelddayspike;

import com.mojang.blaze3d.vertex.PoseStack;

public class SpikeRenderer extends MobRenderer<SpikeEntity, Modelddayspike<SpikeEntity>> {
	public SpikeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelddayspike<SpikeEntity>(context.bakeLayer(Modelddayspike.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(SpikeEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(5f, 5f, 5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpikeEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/ddayspike.png");
	}
}