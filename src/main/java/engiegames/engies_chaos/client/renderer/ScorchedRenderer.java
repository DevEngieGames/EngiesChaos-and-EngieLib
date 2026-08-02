package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.ScorchedEntity;
import engiegames.engies_chaos.client.model.Modelscorched;

import com.mojang.blaze3d.vertex.PoseStack;

public class ScorchedRenderer extends MobRenderer<ScorchedEntity, Modelscorched<ScorchedEntity>> {
	public ScorchedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelscorched<ScorchedEntity>(context.bakeLayer(Modelscorched.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(ScorchedEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScorchedEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/scorched.png");
	}
}