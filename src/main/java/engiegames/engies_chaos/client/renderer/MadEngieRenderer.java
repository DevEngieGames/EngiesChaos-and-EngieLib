package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.MadEngieEntity;
import engiegames.engies_chaos.client.model.ModelMadEngie;

import com.mojang.blaze3d.vertex.PoseStack;

public class MadEngieRenderer extends MobRenderer<MadEngieEntity, ModelMadEngie<MadEngieEntity>> {
	public MadEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMadEngie<MadEngieEntity>(context.bakeLayer(ModelMadEngie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(MadEngieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(MadEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/madengienew.png");
	}
}