// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltony<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tony"), "main");
	private final ModelPart Tony;
	private final ModelPart Body;
	private final ModelPart tail;
	private final ModelPart base;
	private final ModelPart base2;
	private final ModelPart mid1;
	private final ModelPart mid1a;
	private final ModelPart mid2;
	private final ModelPart mid2a;
	private final ModelPart tip;
	private final ModelPart tip2;
	private final ModelPart Head;
	private final ModelPart LeftBackLeg;
	private final ModelPart LeftBackUpperLeg;
	private final ModelPart LeftBackMidLeg;
	private final ModelPart LeftBackLowerLeg;
	private final ModelPart LeftBackFoot;
	private final ModelPart RightBackLeg;
	private final ModelPart LeftBackUpperLeg2;
	private final ModelPart LeftBackMidLeg2;
	private final ModelPart LeftBackLowerLeg2;
	private final ModelPart LeftBackFoot2;
	private final ModelPart LeftFrontLeg;
	private final ModelPart LeftFrontUpperLeg;
	private final ModelPart LeftFrontMidLeg;
	private final ModelPart LeftFrontLowerLeg;
	private final ModelPart LeftFrontFoot;
	private final ModelPart RightFrontLeg;
	private final ModelPart RightFrontUpperLeg;
	private final ModelPart RightFrontMidLeg;
	private final ModelPart RightFrontLowerLeg;
	private final ModelPart RightFrontFoot;

	public Modeltony(ModelPart root) {
		this.Tony = root.getChild("Tony");
		this.Body = this.Tony.getChild("Body");
		this.tail = this.Body.getChild("tail");
		this.base = this.tail.getChild("base");
		this.base2 = this.base.getChild("base2");
		this.mid1 = this.base2.getChild("mid1");
		this.mid1a = this.mid1.getChild("mid1a");
		this.mid2 = this.mid1a.getChild("mid2");
		this.mid2a = this.mid2.getChild("mid2a");
		this.tip = this.mid2a.getChild("tip");
		this.tip2 = this.tip.getChild("tip2");
		this.Head = this.Tony.getChild("Head");
		this.LeftBackLeg = this.Tony.getChild("LeftBackLeg");
		this.LeftBackUpperLeg = this.LeftBackLeg.getChild("LeftBackUpperLeg");
		this.LeftBackMidLeg = this.LeftBackUpperLeg.getChild("LeftBackMidLeg");
		this.LeftBackLowerLeg = this.LeftBackMidLeg.getChild("LeftBackLowerLeg");
		this.LeftBackFoot = this.LeftBackLowerLeg.getChild("LeftBackFoot");
		this.RightBackLeg = this.Tony.getChild("RightBackLeg");
		this.LeftBackUpperLeg2 = this.RightBackLeg.getChild("LeftBackUpperLeg2");
		this.LeftBackMidLeg2 = this.LeftBackUpperLeg2.getChild("LeftBackMidLeg2");
		this.LeftBackLowerLeg2 = this.LeftBackMidLeg2.getChild("LeftBackLowerLeg2");
		this.LeftBackFoot2 = this.LeftBackLowerLeg2.getChild("LeftBackFoot2");
		this.LeftFrontLeg = this.Tony.getChild("LeftFrontLeg");
		this.LeftFrontUpperLeg = this.LeftFrontLeg.getChild("LeftFrontUpperLeg");
		this.LeftFrontMidLeg = this.LeftFrontUpperLeg.getChild("LeftFrontMidLeg");
		this.LeftFrontLowerLeg = this.LeftFrontMidLeg.getChild("LeftFrontLowerLeg");
		this.LeftFrontFoot = this.LeftFrontLowerLeg.getChild("LeftFrontFoot");
		this.RightFrontLeg = this.Tony.getChild("RightFrontLeg");
		this.RightFrontUpperLeg = this.RightFrontLeg.getChild("RightFrontUpperLeg");
		this.RightFrontMidLeg = this.RightFrontUpperLeg.getChild("RightFrontMidLeg");
		this.RightFrontLowerLeg = this.RightFrontMidLeg.getChild("RightFrontLowerLeg");
		this.RightFrontFoot = this.RightFrontLowerLeg.getChild("RightFrontFoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Tony = partdefinition.addOrReplaceChild("Tony", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Tony.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 28)
						.addBox(-5.0F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(33, 72)
						.addBox(-5.0F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(-0.1F, -13.0F, 2.475F, 1.5708F, 0.0F, 0.0F));

		PartDefinition BackFin_r1 = Body.addOrReplaceChild("BackFin_r1",
				CubeListBuilder.create().texOffs(107, 52).addBox(-1.0F, 0.9753F, 2.2318F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition BackFin_r2 = Body.addOrReplaceChild("BackFin_r2",
				CubeListBuilder.create().texOffs(97, 50).addBox(-1.0F, -1.9066F, 3.7227F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.25F, 25.0F, -20.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition base = tail.addOrReplaceChild("base", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -19.85F, -22.95F, -0.3491F, 0.0F, 0.0F));

		PartDefinition base2 = base.addOrReplaceChild("base2",
				CubeListBuilder.create().texOffs(107, 33)
						.addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.05F)).texOffs(112, 81)
						.addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1047F, -0.0018F, 0.0174F));

		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1",
				CubeListBuilder.create().texOffs(92, 32).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -2.9571F, 3.7604F, -0.7854F, 0.0F, 0.0F));

		PartDefinition mid1 = base2.addOrReplaceChild("mid1",
				CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0436F, 0.0F, 0.0F));

		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a",
				CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0698F, 0.0F, 0.0F));

		PartDefinition sidefin_r1 = mid1a.addOrReplaceChild("sidefin_r1",
				CubeListBuilder.create().texOffs(93, 45).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7409F, 1.8339F, 2.433F, 0.0246F, 0.5108F, -0.2081F));

		PartDefinition sidefin_r2 = mid1a.addOrReplaceChild("sidefin_r2",
				CubeListBuilder.create().texOffs(92, 40).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7409F, 1.8339F, 2.433F, 0.0246F, -0.5108F, 0.2081F));

		PartDefinition mid2 = mid1a.addOrReplaceChild("mid2",
				CubeListBuilder.create().texOffs(114, 42).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0873F, 0.0F, 0.0F));

		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a",
				CubeListBuilder.create().texOffs(114, 42).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1047F, 0.0F, 0.0F));

		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2",
				CubeListBuilder.create().texOffs(94, 16).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.5821F, 2.3033F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tip = mid2a.addOrReplaceChild("tip",
				CubeListBuilder.create().texOffs(118, 50).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tip2 = tip.addOrReplaceChild("tip2",
				CubeListBuilder.create().texOffs(116, 57).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1571F, 0.0F, 0.0F));

		PartDefinition shark_r1 = tip2.addOrReplaceChild("shark_r1",
				CubeListBuilder.create().texOffs(90, 22).addBox(-0.5F, -2.0F, -4.0F, 1.0F, 4.0F, 6.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.1187F, 2.0963F, 2.6376F, -0.7854F, 0.0F, 0.0F));

		PartDefinition shark_r2 = tip2.addOrReplaceChild("shark_r2",
				CubeListBuilder.create().texOffs(79, 25).addBox(-0.5F, -3.5F, -2.0F, 1.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.8857F, 3.7071F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Head = Tony.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(36, 39)
						.addBox(-4.1F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-4.1F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(56, 0)
						.addBox(-4.1F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(64, 55)
						.addBox(-4.1F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 52)
						.addBox(-4.1F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 68)
						.addBox(-4.1F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(0, 110)
						.addBox(-5.125F, -7.0F, -8.5F, 1.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, -5.525F));

		PartDefinition Snout_r1 = Head.addOrReplaceChild("Snout_r1",
				CubeListBuilder.create().texOffs(0, 9).addBox(-2.5F, -28.0F, -7.0F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.4F, 28.0F, -2.775F, 0.0F, 0.0F, 0.0F));

		PartDefinition Snout_r2 = Head.addOrReplaceChild("Snout_r2",
				CubeListBuilder.create().texOffs(16, 9).addBox(0.0F, 1.01F, 0.0F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, -1.01F, -9.775F, 0.0F, -0.4625F, 0.0F));

		PartDefinition Snout_r3 = Head.addOrReplaceChild("Snout_r3",
				CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, 1.01F, 0.0F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -1.01F, -9.775F, 0.0F, 0.4625F, 0.0F));

		PartDefinition Snout_r4 = Head.addOrReplaceChild("Snout_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -29.0F, -7.0F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.4F, 27.5F, -3.025F, 0.0F, 0.0F, 0.0F));

		PartDefinition Snout_r5 = Head.addOrReplaceChild("Snout_r5",
				CubeListBuilder.create().texOffs(16, 4).addBox(0.0F, 0.01F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, -1.51F, -10.025F, 0.0F, -0.4625F, 0.0F));

		PartDefinition Snout_r6 = Head.addOrReplaceChild("Snout_r6",
				CubeListBuilder.create().texOffs(0, 4).addBox(-2.0F, 0.01F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -1.51F, -10.025F, 0.0F, 0.4625F, 0.0F));

		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1",
				CubeListBuilder.create().texOffs(88, 5).addBox(-0.25F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8F, -5.0F, -3.0F, 1.0263F, -0.733F, -0.9599F));

		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2",
				CubeListBuilder.create().texOffs(88, 10).addBox(-0.25F, -2.0F, 0.0F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2F, -5.0F, -3.0F, -1.0263F, -0.733F, -2.1817F));

		PartDefinition Hood_r1 = Head.addOrReplaceChild("Hood_r1",
				CubeListBuilder.create().texOffs(124, 118).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-4.05F, -2.525F, -8.5F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Hood_r2 = Head.addOrReplaceChild("Hood_r2",
				CubeListBuilder.create().texOffs(124, 118).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(4.05F, -2.525F, -8.5F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Hood_r3 = Head.addOrReplaceChild("Hood_r3", CubeListBuilder.create().texOffs(124, 111)
				.addBox(-2.7097F, 1.7097F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).texOffs(124, 111)
				.addBox(-1.8258F, 0.8258F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).texOffs(124, 111)
				.addBox(-0.9419F, -0.0581F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).texOffs(124, 111)
				.addBox(-0.0581F, -0.9419F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).texOffs(124, 111)
				.addBox(0.8258F, -1.8258F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-3.5F, -2.65F, -8.5F, -3.1416F, 0.0F, -2.3562F));

		PartDefinition Hood_r4 = Head.addOrReplaceChild("Hood_r4",
				CubeListBuilder.create().texOffs(124, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-3.5F, -5.475F, -8.5F, -3.1416F, 0.0F, 2.3562F));

		PartDefinition Hood_r5 = Head.addOrReplaceChild("Hood_r5",
				CubeListBuilder.create().texOffs(124, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(3.5F, -5.475F, -8.5F, -3.1416F, 0.0F, 2.3562F));

		PartDefinition Hood_r6 = Head.addOrReplaceChild("Hood_r6", CubeListBuilder.create().texOffs(124, 111)
				.addBox(-1.8258F, 0.8258F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).texOffs(124, 111)
				.addBox(-0.9419F, -0.0581F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).texOffs(124, 111)
				.addBox(-0.0581F, -0.9419F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).texOffs(124, 111)
				.addBox(0.8258F, -1.8258F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).texOffs(124, 111)
				.addBox(-2.7097F, 1.7097F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(3.5F, -2.65F, -8.5F, -3.1416F, 0.0F, -2.3562F));

		PartDefinition Hood_r7 = Head.addOrReplaceChild("Hood_r7",
				CubeListBuilder.create().texOffs(124, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(1.85F, -6.025F, -8.5F, -3.1416F, 0.0F, 2.3562F));

		PartDefinition Hood_r8 = Head.addOrReplaceChild("Hood_r8",
				CubeListBuilder.create().texOffs(124, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(0.6F, -6.025F, -8.5F, -3.1416F, 0.0F, 2.3562F));

		PartDefinition Hood_r9 = Head.addOrReplaceChild("Hood_r9",
				CubeListBuilder.create().texOffs(124, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.65F, -6.025F, -8.5F, -3.1416F, 0.0F, 2.3562F));

		PartDefinition Hood_r10 = Head.addOrReplaceChild("Hood_r10",
				CubeListBuilder.create().texOffs(124, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-1.9F, -6.025F, -8.5F, -3.1416F, 0.0F, 2.3562F));

		PartDefinition Hood_r11 = Head.addOrReplaceChild("Hood_r11",
				CubeListBuilder.create().texOffs(124, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-3.15F, -6.025F, -8.5F, -3.1416F, 0.0F, 2.3562F));

		PartDefinition Hood_r12 = Head.addOrReplaceChild("Hood_r12",
				CubeListBuilder.create().texOffs(124, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(3.1F, -6.025F, -8.5F, -3.1416F, 0.0F, 2.3562F));

		PartDefinition Hood_r13 = Head.addOrReplaceChild("Hood_r13",
				CubeListBuilder.create().texOffs(124, 118).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.525F, -8.5F, 0.0F, 3.1416F, -1.5708F));

		PartDefinition Hood_r14 = Head.addOrReplaceChild("Hood_r14",
				CubeListBuilder.create().texOffs(124, 118).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, -6.575F, -8.5F, 0.0F, 3.1416F, -1.5708F));

		PartDefinition Hood_r15 = Head.addOrReplaceChild("Hood_r15",
				CubeListBuilder.create().texOffs(0, 110).addBox(-0.5F, -4.5F, -4.5F, 1.0F, 9.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -7.025F, -4.0F, 0.0F, 3.1416F, -1.5708F));

		PartDefinition Hood_r16 = Head.addOrReplaceChild("Hood_r16",
				CubeListBuilder.create().texOffs(0, 110).addBox(-0.5F, -4.5F, -4.5F, 1.0F, 9.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 2.025F, -4.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Hood_r17 = Head.addOrReplaceChild("Hood_r17",
				CubeListBuilder.create().texOffs(0, 110).addBox(-0.5F, -4.5F, -4.5F, 1.0F, 9.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -2.5F, 0.525F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Hood_r18 = Head.addOrReplaceChild("Hood_r18",
				CubeListBuilder.create().texOffs(0, 110).addBox(-0.5F, -4.5F, -4.5F, 1.0F, 9.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.425F, -2.5F, -4.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition LeftBackLeg = Tony.addOrReplaceChild("LeftBackLeg", CubeListBuilder.create(),
				PartPose.offset(2.8F, -7.0F, 5.775F));

		PartDefinition LeftBackUpperLeg = LeftBackLeg.addOrReplaceChild("LeftBackUpperLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.358F, 0.0175F));

		PartDefinition UpperLegLayer2_r1 = LeftBackUpperLeg.addOrReplaceChild("UpperLegLayer2_r1",
				CubeListBuilder.create().texOffs(69, 76)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.086F)).texOffs(99, 59)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftBackMidLeg = LeftBackUpperLeg.addOrReplaceChild("LeftBackMidLeg", CubeListBuilder.create(),
				PartPose.offset(0.01F, 3.3749F, -1.031F));

		PartDefinition MidLeg_r1 = LeftBackMidLeg.addOrReplaceChild("MidLeg_r1",
				CubeListBuilder.create().texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition LeftBackLowerLeg = LeftBackMidLeg.addOrReplaceChild("LeftBackLowerLeg", CubeListBuilder.create(),
				PartPose.offset(-0.005F, 1.535F, 2.3715F));

		PartDefinition LowerLeg_r1 = LeftBackLowerLeg.addOrReplaceChild("LowerLeg_r1",
				CubeListBuilder.create().texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LeftBackFoot = LeftBackLowerLeg.addOrReplaceChild("LeftBackFoot",
				CubeListBuilder.create().texOffs(112, 26)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 36)
						.addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));

		PartDefinition Toe_r1 = LeftBackFoot.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(124, 33)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));

		PartDefinition RightBackLeg = Tony.addOrReplaceChild("RightBackLeg", CubeListBuilder.create(),
				PartPose.offset(-3.0F, -7.0F, 5.775F));

		PartDefinition LeftBackUpperLeg2 = RightBackLeg.addOrReplaceChild("LeftBackUpperLeg2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.358F, 0.0175F));

		PartDefinition UpperLegLayer3_r1 = LeftBackUpperLeg2.addOrReplaceChild("UpperLegLayer3_r1",
				CubeListBuilder.create().texOffs(69, 76)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.086F)).texOffs(99, 59)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftBackMidLeg2 = LeftBackUpperLeg2.addOrReplaceChild("LeftBackMidLeg2",
				CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));

		PartDefinition MidLeg_r2 = LeftBackMidLeg2.addOrReplaceChild("MidLeg_r2",
				CubeListBuilder.create().texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition LeftBackLowerLeg2 = LeftBackMidLeg2.addOrReplaceChild("LeftBackLowerLeg2",
				CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));

		PartDefinition LowerLeg_r2 = LeftBackLowerLeg2.addOrReplaceChild("LowerLeg_r2",
				CubeListBuilder.create().texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LeftBackFoot2 = LeftBackLowerLeg2.addOrReplaceChild("LeftBackFoot2",
				CubeListBuilder.create().texOffs(112, 26)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 36)
						.addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));

		PartDefinition Toe_r2 = LeftBackFoot2.addOrReplaceChild("Toe_r2",
				CubeListBuilder.create().texOffs(124, 33)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));

		PartDefinition LeftFrontLeg = Tony.addOrReplaceChild("LeftFrontLeg", CubeListBuilder.create(),
				PartPose.offset(2.8F, -7.0F, -6.225F));

		PartDefinition LeftFrontUpperLeg = LeftFrontLeg.addOrReplaceChild("LeftFrontUpperLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.358F, 0.0175F));

		PartDefinition UpperLegLayer2_r2 = LeftFrontUpperLeg.addOrReplaceChild("UpperLegLayer2_r2",
				CubeListBuilder.create().texOffs(69, 76)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.086F)).texOffs(99, 59)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftFrontMidLeg = LeftFrontUpperLeg.addOrReplaceChild("LeftFrontMidLeg",
				CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));

		PartDefinition MidLeg_r3 = LeftFrontMidLeg.addOrReplaceChild("MidLeg_r3",
				CubeListBuilder.create().texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition LeftFrontLowerLeg = LeftFrontMidLeg.addOrReplaceChild("LeftFrontLowerLeg",
				CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));

		PartDefinition LowerLeg_r3 = LeftFrontLowerLeg.addOrReplaceChild("LowerLeg_r3",
				CubeListBuilder.create().texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LeftFrontFoot = LeftFrontLowerLeg.addOrReplaceChild("LeftFrontFoot",
				CubeListBuilder.create().texOffs(99, 22)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 39)
						.addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));

		PartDefinition Toe_r3 = LeftFrontFoot.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(124, 33)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));

		PartDefinition RightFrontLeg = Tony.addOrReplaceChild("RightFrontLeg", CubeListBuilder.create(),
				PartPose.offset(-3.0F, -7.0F, -6.225F));

		PartDefinition RightFrontUpperLeg = RightFrontLeg.addOrReplaceChild("RightFrontUpperLeg",
				CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));

		PartDefinition UpperLegLayer2_r3 = RightFrontUpperLeg.addOrReplaceChild("UpperLegLayer2_r3",
				CubeListBuilder.create().texOffs(69, 76)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.086F)).texOffs(99, 59)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition RightFrontMidLeg = RightFrontUpperLeg.addOrReplaceChild("RightFrontMidLeg",
				CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));

		PartDefinition MidLeg_r4 = RightFrontMidLeg.addOrReplaceChild("MidLeg_r4",
				CubeListBuilder.create().texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition RightFrontLowerLeg = RightFrontMidLeg.addOrReplaceChild("RightFrontLowerLeg",
				CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));

		PartDefinition LowerLeg_r4 = RightFrontLowerLeg.addOrReplaceChild("LowerLeg_r4",
				CubeListBuilder.create().texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));

		PartDefinition RightFrontFoot = RightFrontLowerLeg.addOrReplaceChild("RightFrontFoot",
				CubeListBuilder.create().texOffs(99, 22)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 39)
						.addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));

		PartDefinition Toe_r4 = RightFrontFoot.addOrReplaceChild("Toe_r4",
				CubeListBuilder.create().texOffs(124, 33)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Tony.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightBackLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftFrontLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftBackLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightFrontLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}