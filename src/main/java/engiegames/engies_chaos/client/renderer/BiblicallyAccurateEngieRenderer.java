package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.BiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.client.model.Modelhostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class BiblicallyAccurateEngieRenderer extends MobRenderer<BiblicallyAccurateEngieEntity, Modelhostile<BiblicallyAccurateEngieEntity>> {
	public BiblicallyAccurateEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhostile<BiblicallyAccurateEngieEntity>(context.bakeLayer(Modelhostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(BiblicallyAccurateEngieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(BiblicallyAccurateEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/biblicallynew_style1.png");
	}
}