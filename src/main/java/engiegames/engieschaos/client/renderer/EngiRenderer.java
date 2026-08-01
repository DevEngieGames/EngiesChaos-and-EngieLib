package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.EngiEntity;
import engiegames.engieschaos.client.model.ModelEngie;

import com.mojang.blaze3d.vertex.PoseStack;

public class EngiRenderer extends MobRenderer<EngiEntity, ModelEngie<EngiEntity>> {
	public EngiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngie<EngiEntity>(context.bakeLayer(ModelEngie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(EngiEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngiEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/engienew.png");
	}
}