package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.CosmicDeathSharkoEntity;
import engiegames.engieschaos.client.model.Modelboyo;

import com.mojang.blaze3d.vertex.PoseStack;

public class CosmicDeathSharkoRenderer extends MobRenderer<CosmicDeathSharkoEntity, Modelboyo<CosmicDeathSharkoEntity>> {
	public CosmicDeathSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo<CosmicDeathSharkoEntity>(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(CosmicDeathSharkoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CosmicDeathSharkoEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/cosmicboyountamed.png");
	}
}