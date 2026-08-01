// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.0.2 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class hostileAnimation {
	public static final AnimationDefinition hostileidle = AnimationDefinition.Builder.withLength(10.0F).looping()
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Body",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("RightLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.5F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.degreeVec(1.25F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(10.0F, KeyframeAnimations.degreeVec(2.5F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("RightLeg",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.75F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("LeftLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.5F, -2.5F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.degreeVec(1.25F, -2.5F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(10.0F, KeyframeAnimations.degreeVec(2.5F, -2.5F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("LeftLeg",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.75F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("RightArm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.5F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.25F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(10.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.5F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("RightArm",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("LeftArm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.25F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(10.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("LeftArm",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.build();
}