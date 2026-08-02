package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import engiegames.engies_chaos.entity.ShadowSharkEngieEntity;
import engiegames.engies_chaos.client.model.ModelShadowEngieSharkEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShadowSharkEngieRenderer extends MobRenderer<ShadowSharkEngieEntity, ModelShadowEngieSharkEntity<ShadowSharkEngieEntity>> {
	public ShadowSharkEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelShadowEngieSharkEntity<ShadowSharkEngieEntity>(context.bakeLayer(ModelShadowEngieSharkEntity.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ShadowSharkEngieEntity, ModelShadowEngieSharkEntity<ShadowSharkEngieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/shadowsharkengie.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShadowSharkEngieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(ShadowSharkEngieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowSharkEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/shadowsharkengie.png");
	}
}