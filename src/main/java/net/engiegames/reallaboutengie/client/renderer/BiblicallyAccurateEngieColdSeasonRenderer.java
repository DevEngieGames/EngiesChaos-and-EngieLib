package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationDefinition;

import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieColdSeasonEntity;
import net.engiegames.reallaboutengie.client.model.animations.hostileAnimation;
import net.engiegames.reallaboutengie.client.model.Modelcoldseason;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.PoseStack;

public class BiblicallyAccurateEngieColdSeasonRenderer extends MobRenderer<BiblicallyAccurateEngieColdSeasonEntity, Modelcoldseason<BiblicallyAccurateEngieColdSeasonEntity>> {
	public BiblicallyAccurateEngieColdSeasonRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelcoldseason.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(BiblicallyAccurateEngieColdSeasonEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(BiblicallyAccurateEngieColdSeasonEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/biblicallynewcoldseason.png");
	}

	private static final class AnimatedModel extends Modelcoldseason<BiblicallyAccurateEngieColdSeasonEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BiblicallyAccurateEngieColdSeasonEntity>() {
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
			public void setupAnim(BiblicallyAccurateEngieColdSeasonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, hostileAnimation.hostileidle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BiblicallyAccurateEngieColdSeasonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}