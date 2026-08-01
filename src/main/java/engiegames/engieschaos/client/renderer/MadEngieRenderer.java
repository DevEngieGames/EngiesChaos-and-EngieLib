package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationDefinition;

import engiegames.engieschaos.entity.MadEngieEntity;
import engiegames.engieschaos.client.model.animations.hostileAnimation;
import engiegames.engieschaos.client.model.ModelMadEngie;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.PoseStack;

public class MadEngieRenderer extends MobRenderer<MadEngieEntity, ModelMadEngie<MadEngieEntity>> {
	public MadEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelMadEngie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(MadEngieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(MadEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/madengienew.png");
	}

	private static final class AnimatedModel extends ModelMadEngie<MadEngieEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<MadEngieEntity>() {
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
			public void setupAnim(MadEngieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, hostileAnimation.hostileidle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(MadEngieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}