package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import engiegames.engieschaos.entity.TheRealEngieGamesEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TheRealEngieGamesRenderer extends HumanoidMobRenderer<TheRealEngieGamesEntity, HumanoidModel<TheRealEngieGamesEntity>> {
	public TheRealEngieGamesRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<TheRealEngieGamesEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	protected void scale(TheRealEngieGamesEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheRealEngieGamesEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/78c5d915f6017698e3d78166f211f09508db5a56.png");
	}
}