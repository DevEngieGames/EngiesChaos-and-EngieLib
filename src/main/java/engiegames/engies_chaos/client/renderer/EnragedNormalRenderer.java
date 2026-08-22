package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedNormalEntity;
import engiegames.engies_chaos.client.model.Modelhostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class EnragedNormalRenderer extends MobRenderer<EnragedNormalEntity, Modelhostile<EnragedNormalEntity>> {
	public EnragedNormalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhostile<EnragedNormalEntity>(context.bakeLayer(Modelhostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(EnragedNormalEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormalEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedzombie_normal.png");
	}
}