package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationDefinition;

import engiegames.engieschaos.entity.ShadowSharkEngieBlindEntity;
import engiegames.engieschaos.client.model.animations.ShadowEngieSharkEntityAnimation;
import engiegames.engieschaos.client.model.ModelShadowEngieSharkEntity;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShadowSharkEngieBlindRenderer extends MobRenderer<ShadowSharkEngieBlindEntity, ModelShadowEngieSharkEntity<ShadowSharkEngieBlindEntity>> {
	public ShadowSharkEngieBlindRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelShadowEngieSharkEntity.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ShadowSharkEngieBlindEntity, ModelShadowEngieSharkEntity<ShadowSharkEngieBlindEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/shadowsharkengieblind.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShadowSharkEngieBlindEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(ShadowSharkEngieBlindEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowSharkEngieBlindEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/shadowsharkengieblind.png");
	}

	private static final class AnimatedModel extends ModelShadowEngieSharkEntity<ShadowSharkEngieBlindEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ShadowSharkEngieBlindEntity>() {
			private static final Vector3f ANIMATION_VECTOR_CACHE = new Vector3f();

			@Override
			public ModelPart root() {
				return root;
			}

			private void animateWalk(AnimationDefinition animationDefinition, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw) {
				long accumulatedTime = (long) (limbSwing * 50.0F * ageInTicks);
				float scale = Math.min(limbSwingAmount * netHeadYaw, 1.0F);
				KeyframeAnimations.animate(this, animationDefinition, accumulatedTime, scale, ANIMATION_VECTOR_CACHE);
			}

			@Override
			public void setupAnim(ShadowSharkEngieBlindEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, ShadowEngieSharkEntityAnimation.ShadowEngieSharkIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ShadowSharkEngieBlindEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}