// Made with Blockbench 5.1.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelboyoold<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "boyoold"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart tailfin;
	private final ModelPart tailfin2;
	private final ModelPart fin;
	private final ModelPart RightFrontLeg;
	private final ModelPart LeftFrontLeg;
	private final ModelPart RightBackLeg;
	private final ModelPart LeftBackLeg;

	public Modelboyoold(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.tailfin = this.Tail.getChild("tailfin");
		this.tailfin2 = this.Tail.getChild("tailfin2");
		this.fin = this.Body.getChild("fin");
		this.RightFrontLeg = root.getChild("RightFrontLeg");
		this.LeftFrontLeg = root.getChild("LeftFrontLeg");
		this.RightBackLeg = root.getChild("RightBackLeg");
		this.LeftBackLeg = root.getChild("LeftBackLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(24, 37)
						.addBox(-7.0F, -2.9F, -10.5F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(28, 39)
						.addBox(-6.0F, -3.4F, -9.5F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(40, 26)
						.addBox(-5.0F, -3.9F, -8.5F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(44, 28)
						.addBox(-4.0F, -4.4F, -7.5F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(30, 57)
						.addBox(-3.0F, -4.9F, -6.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 53)
						.addBox(-2.0F, -5.4F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 61)
						.addBox(-1.0F, -5.9F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, -6.0F));

		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1",
				CubeListBuilder.create().texOffs(64, 13).addBox(-0.25F, -2.0F, 0.0F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -2.3F, -2.5F, -1.0263F, -0.733F, -2.1817F));

		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2",
				CubeListBuilder.create().texOffs(64, 8).addBox(-0.25F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.3F, -2.5F, 1.0263F, -0.733F, -0.9599F));

		PartDefinition Body = partdefinition
				.addOrReplaceChild("Body",
						CubeListBuilder.create().texOffs(0, 27).addBox(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 10.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail",
				CubeListBuilder.create().texOffs(0, 52)
						.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 22)
						.addBox(-0.5F, -4.0F, 8.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 46)
						.addBox(-0.5F, -2.0F, 8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 44)
						.addBox(-0.5F, -3.0F, 9.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 44)
						.addBox(-0.5F, -3.0F, 10.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 49)
						.addBox(-0.5F, -2.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 49)
						.addBox(-0.5F, 1.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 22)
						.addBox(-0.5F, 1.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 22)
						.addBox(-0.5F, 3.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 22)
						.addBox(-0.5F, -2.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 22)
						.addBox(-0.5F, -4.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.3F, -2.0F, -2.0071F, 0.0F, 0.0F));

		PartDefinition tailfin = Tail.addOrReplaceChild("tailfin",
				CubeListBuilder.create().texOffs(26, 1)
						.addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-0.5F, -2.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 4.0F));

		PartDefinition tailfin2 = Tail.addOrReplaceChild("tailfin2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 8.0F));

		PartDefinition fin = Body.addOrReplaceChild("fin",
				CubeListBuilder.create().texOffs(26, 1)
						.addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-0.5F, -2.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 2.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition RightFrontLeg = partdefinition.addOrReplaceChild("RightFrontLeg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 53)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-3.0F, 17.0F, -6.0F));

		PartDefinition LeftFrontLeg = partdefinition.addOrReplaceChild("LeftFrontLeg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 53)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(3.0F, 17.0F, -6.0F));

		PartDefinition RightBackLeg = partdefinition.addOrReplaceChild("RightBackLeg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 53)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-3.0F, 17.0F, 6.0F));

		PartDefinition LeftBackLeg = partdefinition.addOrReplaceChild("LeftBackLeg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 53)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(3.0F, 17.0F, 6.0F));

		return LayerDefinition.create(meshdefinition, 80, 64);
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