package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.AngryEngieEntity;
import engiegames.engies_chaos.client.model.Modelhostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class AngryEngieRenderer extends MobRenderer<AngryEngieEntity, Modelhostile<AngryEngieEntity>> {
	public AngryEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhostile<AngryEngieEntity>(context.bakeLayer(Modelhostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(AngryEngieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(AngryEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/angrynew_style1.png");
	}
}