package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationDefinition;

import net.engiegames.reallaboutengie.entity.MonstrosityEngieHalloweenEntity;
import net.engiegames.reallaboutengie.client.model.animations.hostileAnimation;
import net.engiegames.reallaboutengie.client.model.Modelmonstrositynewhalloween;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.PoseStack;

public class MonstrosityEngieHalloweenRenderer extends MobRenderer<MonstrosityEngieHalloweenEntity, Modelmonstrositynewhalloween<MonstrosityEngieHalloweenEntity>> {
	public MonstrosityEngieHalloweenRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelmonstrositynewhalloween.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(MonstrosityEngieHalloweenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(MonstrosityEngieHalloweenEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/monstrositynewhalloween.png");
	}

	private static final class AnimatedModel extends Modelmonstrositynewhalloween<MonstrosityEngieHalloweenEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<MonstrosityEngieHalloweenEntity>() {
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
			public void setupAnim(MonstrosityEngieHalloweenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, hostileAnimation.hostileidle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(MonstrosityEngieHalloweenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}