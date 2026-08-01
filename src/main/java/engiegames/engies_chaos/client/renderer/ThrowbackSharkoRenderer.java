package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.ThrowbackSharkoEntity;
import engiegames.engies_chaos.client.model.Modelthrowbackboyo;

import com.mojang.blaze3d.vertex.PoseStack;

public class ThrowbackSharkoRenderer extends MobRenderer<ThrowbackSharkoEntity, Modelthrowbackboyo<ThrowbackSharkoEntity>> {
	public ThrowbackSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthrowbackboyo<ThrowbackSharkoEntity>(context.bakeLayer(Modelthrowbackboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(ThrowbackSharkoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(ThrowbackSharkoEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/boyoold.png");
	}
}