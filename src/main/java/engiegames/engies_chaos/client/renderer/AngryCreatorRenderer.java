package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.AngryCreatorEntity;
import engiegames.engies_chaos.client.model.Modelhostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class AngryCreatorRenderer extends MobRenderer<AngryCreatorEntity, Modelhostile<AngryCreatorEntity>> {
	public AngryCreatorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhostile<AngryCreatorEntity>(context.bakeLayer(Modelhostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(AngryCreatorEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(AngryCreatorEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/outragednew_style1.png");
	}
}