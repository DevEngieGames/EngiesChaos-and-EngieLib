package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.EnragedDeathSharkoEntity;
import engiegames.engies_chaos.client.model.Modelboyo;

import com.mojang.blaze3d.vertex.PoseStack;

public class EnragedDeathSharkoRenderer extends MobRenderer<EnragedDeathSharkoEntity, Modelboyo<EnragedDeathSharkoEntity>> {
	public EnragedDeathSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo<EnragedDeathSharkoEntity>(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(EnragedDeathSharkoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedDeathSharkoEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragedeathboyountamed.png");
	}
}