package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.HostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.client.model.Modelhostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class HostileBiblicallyAccurateEngieRenderer extends MobRenderer<HostileBiblicallyAccurateEngieEntity, Modelhostile<HostileBiblicallyAccurateEngieEntity>> {
	public HostileBiblicallyAccurateEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhostile<HostileBiblicallyAccurateEngieEntity>(context.bakeLayer(Modelhostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(HostileBiblicallyAccurateEngieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(HostileBiblicallyAccurateEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/hostilebiblicallynew_style1.png");
	}
}