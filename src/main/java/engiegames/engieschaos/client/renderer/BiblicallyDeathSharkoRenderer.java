package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.BiblicallyDeathSharkoEntity;
import engiegames.engieschaos.client.model.Modelboyo;

import com.mojang.blaze3d.vertex.PoseStack;

public class BiblicallyDeathSharkoRenderer extends MobRenderer<BiblicallyDeathSharkoEntity, Modelboyo<BiblicallyDeathSharkoEntity>> {
	public BiblicallyDeathSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo<BiblicallyDeathSharkoEntity>(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(BiblicallyDeathSharkoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BiblicallyDeathSharkoEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/biblicallydeathboyountamed.png");
	}
}