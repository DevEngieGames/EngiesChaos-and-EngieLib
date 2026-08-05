package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.DDAYRiftEntity;
import engiegames.engies_chaos.client.model.Modelddayrift;

import com.mojang.blaze3d.vertex.PoseStack;

public class DDAYRiftRenderer extends MobRenderer<DDAYRiftEntity, Modelddayrift<DDAYRiftEntity>> {
	public DDAYRiftRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelddayrift<DDAYRiftEntity>(context.bakeLayer(Modelddayrift.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(DDAYRiftEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(5f, 5f, 5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DDAYRiftEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/rifttexture.png");
	}
}