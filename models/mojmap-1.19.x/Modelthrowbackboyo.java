// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelthrowbackboyo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "throwbackboyo"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart RightFrontLeg;
	private final ModelPart LeftFrontLeg;
	private final ModelPart RightBackLeg;
	private final ModelPart LeftBackLeg;

	public Modelthrowbackboyo(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.RightFrontLeg = root.getChild("RightFrontLeg");
		this.LeftFrontLeg = root.getChild("LeftFrontLeg");
		this.RightBackLeg = root.getChild("RightBackLeg");
		this.LeftBackLeg = root.getChild("LeftBackLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, -5.525F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 0).addBox(-5.0F, -8.0F, -4.0F, 10.0F, 16.0F, 8.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(-0.1F, 13.0F, -0.025F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Fin_r1 = Body.addOrReplaceChild("Fin_r1",
				CubeListBuilder.create().texOffs(40, 17).addBox(0.0F, -2.0F, -3.5F, 0.0F, 4.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.0F, 4.525F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.1F, 8.075F, 0.025F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Fin_r2 = Tail.addOrReplaceChild("Fin_r2",
				CubeListBuilder.create().texOffs(24, -5).addBox(0.0F, -5.0F, -3.5F, 0.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.625F, 9.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Fin_r3 = Tail.addOrReplaceChild("Fin_r3",
				CubeListBuilder.create().texOffs(40, 17).addBox(0.0F, -2.0F, -3.5F, 0.0F, 4.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.075F, 3.4F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Tail.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(18, 16).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.5F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition RightFrontLeg = partdefinition.addOrReplaceChild("RightFrontLeg",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.1F, 17.0F, -6.0F));

		PartDefinition LeftFrontLeg = partdefinition.addOrReplaceChild("LeftFrontLeg", CubeListBuilder.create()
				.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.9F, 17.0F, -6.0F));

		PartDefinition RightBackLeg = partdefinition.addOrReplaceChild("RightBackLeg",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-2.0F, 0.0F, -1.975F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.1F, 17.0F, 5.975F));

		PartDefinition LeftBackLeg = partdefinition.addOrReplaceChild("LeftBackLeg", CubeListBuilder.create()
				.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.9F, 17.0F, 6.0F));

		return LayerDefinition.create(meshdefinition, 69, 28);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftBackLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightFrontLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightBackLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftFrontLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}