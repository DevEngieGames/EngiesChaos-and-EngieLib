package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.EngieGamesDetectiveEntity;
import engiegames.engieschaos.client.model.ModelEngieGames;

import com.mojang.blaze3d.vertex.PoseStack;

public class EngieGamesDetectiveRenderer extends MobRenderer<EngieGamesDetectiveEntity, ModelEngieGames<EngieGamesDetectiveEntity>> {
	public EngieGamesDetectiveRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames<EngieGamesDetectiveEntity>(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(EngieGamesDetectiveEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieGamesDetectiveEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/engiegamesentity.png");
	}
}