// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelboyorockysit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "boyorockysit"), "main");
	private final ModelPart Head;
	private final ModelPart Ear1;
	private final ModelPart Ear2;
	private final ModelPart Body;
	private final ModelPart Collar;
	private final ModelPart Bell;
	private final ModelPart Fin;
	private final ModelPart tail;
	private final ModelPart base;
	private final ModelPart base2;
	private final ModelPart mid1;
	private final ModelPart mid1a;
	private final ModelPart mid2;
	private final ModelPart mid2a;
	private final ModelPart tip;
	private final ModelPart tip2;
	private final ModelPart RightFrontLeg;
	private final ModelPart RightFrontUpperLeg;
	private final ModelPart RightFrontMidLeg;
	private final ModelPart RightFrontLowerLeg;
	private final ModelPart RightFrontFoot;
	private final ModelPart LeftFrontLeg;
	private final ModelPart LeftFrontUpperLeg;
	private final ModelPart LeftFrontMidLeg;
	private final ModelPart LeftFrontLowerLeg;
	private final ModelPart LeftFrontFoot;
	private final ModelPart LeftBackLeg;
	private final ModelPart LeftBackUpperLeg;
	private final ModelPart LeftBackMidLeg;
	private final ModelPart LeftBackLowerLeg;
	private final ModelPart LeftBackFoot;

	public Modelboyorockysit(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Ear1 = this.Head.getChild("Ear1");
		this.Ear2 = this.Head.getChild("Ear2");
		this.Body = root.getChild("Body");
		this.Collar = this.Body.getChild("Collar");
		this.Bell = this.Collar.getChild("Bell");
		this.Fin = this.Body.getChild("Fin");
		this.tail = this.Body.getChild("tail");
		this.base = this.tail.getChild("base");
		this.base2 = this.base.getChild("base2");
		this.mid1 = this.base2.getChild("mid1");
		this.mid1a = this.mid1.getChild("mid1a");
		this.mid2 = this.mid1a.getChild("mid2");
		this.mid2a = this.mid2.getChild("mid2a");
		this.tip = this.mid2a.getChild("tip");
		this.tip2 = this.tip.getChild("tip2");
		this.RightFrontLeg = root.getChild("RightFrontLeg");
		this.RightFrontUpperLeg = this.RightFrontLeg.getChild("RightFrontUpperLeg");
		this.RightFrontMidLeg = this.RightFrontUpperLeg.getChild("RightFrontMidLeg");
		this.RightFrontLowerLeg = this.RightFrontMidLeg.getChild("RightFrontLowerLeg");
		this.RightFrontFoot = this.RightFrontLowerLeg.getChild("RightFrontFoot");
		this.LeftFrontLeg = root.getChild("LeftFrontLeg");
		this.LeftFrontUpperLeg = this.LeftFrontLeg.getChild("LeftFrontUpperLeg");
		this.LeftFrontMidLeg = this.LeftFrontUpperLeg.getChild("LeftFrontMidLeg");
		this.LeftFrontLowerLeg = this.LeftFrontMidLeg.getChild("LeftFrontLowerLeg");
		this.LeftFrontFoot = this.LeftFrontLowerLeg.getChild("LeftFrontFoot");
		this.LeftBackLeg = root.getChild("LeftBackLeg");
		this.LeftBackUpperLeg = this.LeftBackLeg.getChild("LeftBackUpperLeg");
		this.LeftBackMidLeg = this.LeftBackUpperLeg.getChild("LeftBackMidLeg");
		this.LeftBackLowerLeg = this.LeftBackMidLeg.getChild("LeftBackLowerLeg");
		this.LeftBackFoot = this.LeftBackLowerLeg.getChild("LeftBackFoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(64, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(64, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(32, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(64, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 12.0F, -5.525F));

		PartDefinition Ear1 = Head.addOrReplaceChild("Ear1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.4668F, -7.25F, -1.681F, -0.9163F, 0.4363F, 0.0F));

		PartDefinition cube_r1 = Ear1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(36, 31).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.4875F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = Ear1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(36, 31).mirror()
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.4875F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.5332F, -7.25F, -1.681F, -0.9163F, -0.4363F, 0.0F));

		PartDefinition cube_r3 = Ear2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(36, 31).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.4875F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r4 = Ear2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(36, 31).mirror()
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.4875F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-5.1183F, -7.0437F, -5.9279F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(60, 72)
				.addBox(-5.1183F, -7.0437F, -5.9279F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.275F)),
				PartPose.offsetAndRotation(0.0933F, 14.5539F, -0.8898F, 1.0908F, 0.0F, 0.0F));

		PartDefinition Collar = Body.addOrReplaceChild("Collar", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.0183F, -7.1189F, 0.13F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Collar.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 42)
						.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.05F)).texOffs(0, 42)
						.addBox(8.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-4.5F, -1.9498F, 0.3421F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Collar.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 40).addBox(-5.0F, 0.5F, -0.5F, 10.0F, 1.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.0252F, -0.1829F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Collar.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 40).addBox(-5.0F, -0.5F, -0.5F, 10.0F, 1.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, -2.0498F, 0.3671F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bell = Collar.addOrReplaceChild("Bell",
				CubeListBuilder.create().texOffs(22, 40)
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)).texOffs(28, 40)
						.addBox(-1.0F, 0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.9752F, -0.2579F));

		PartDefinition cube_r8 = Bell.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

		PartDefinition cube_r9 = Bell.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(-1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r10 = Bell.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(22, 40).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Fin = Body.addOrReplaceChild("Fin", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1202F, 0.6563F, 2.3758F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Fin.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(44, 31).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.4875F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r12 = Fin.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(44, 31).mirror()
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.4875F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.1317F, 5.5063F, -0.5779F, -1.5708F, 0.0F, 0.0F));

		PartDefinition base = tail.addOrReplaceChild("base", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition base2 = base.addOrReplaceChild("base2",
				CubeListBuilder.create().texOffs(68, 16)
						.addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.05F)).texOffs(80, 44)
						.addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.4538F, -0.0018F, 0.0174F));

		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1",
				CubeListBuilder.create().texOffs(84, 16).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -2.9571F, 3.7604F, -0.7854F, 0.0F, 0.0F));

		PartDefinition mid1 = base2.addOrReplaceChild("mid1",
				CubeListBuilder.create().texOffs(68, 16).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a",
				CubeListBuilder.create().texOffs(68, 16).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1484F, 0.0F, 0.0F));

		PartDefinition sidefin_r1 = mid1a.addOrReplaceChild("sidefin_r1",
				CubeListBuilder.create().texOffs(84, 24).mirror()
						.addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.7409F, 1.8339F, 2.433F, 0.0246F, 0.5108F, -0.2081F));

		PartDefinition sidefin_r2 = mid1a.addOrReplaceChild("sidefin_r2",
				CubeListBuilder.create().texOffs(84, 24).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7409F, 1.8339F, 2.433F, 0.0246F, -0.5108F, 0.2081F));

		PartDefinition mid2 = mid1a.addOrReplaceChild("mid2",
				CubeListBuilder.create().texOffs(69, 24).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0436F, 0.0F, 0.0F));

		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a",
				CubeListBuilder.create().texOffs(69, 24).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1047F, 0.0F, 0.0F));

		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2",
				CubeListBuilder.create().texOffs(90, 38).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.5821F, 2.3033F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tip = mid2a.addOrReplaceChild("tip",
				CubeListBuilder.create().texOffs(85, 28).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tip2 = tip.addOrReplaceChild("tip2",
				CubeListBuilder.create().texOffs(86, 33).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1571F, 0.0F, 0.0F));

		PartDefinition shark_r1 = tip2.addOrReplaceChild("shark_r1",
				CubeListBuilder.create().texOffs(61, 25).addBox(-0.5F, -2.0F, -4.0F, 1.0F, 4.0F, 6.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.1188F, 2.0963F, 2.6376F, -0.7854F, 0.0F, 0.0F));

		PartDefinition shark_r2 = tip2.addOrReplaceChild("shark_r2",
				CubeListBuilder.create().texOffs(75, 31).addBox(-0.5F, -3.5F, -2.0F, 1.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.8857F, 3.7071F, -0.7854F, 0.0F, 0.0F));

		PartDefinition RightFrontLeg = partdefinition.addOrReplaceChild("RightFrontLeg", CubeListBuilder.create(),
				PartPose.offset(-3.1F, 17.0F, -7.725F));

		PartDefinition RightFrontUpperLeg = RightFrontLeg.addOrReplaceChild("RightFrontUpperLeg",
				CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));

		PartDefinition UpperLegLayer_r1 = RightFrontUpperLeg.addOrReplaceChild("UpperLegLayer_r1",
				CubeListBuilder.create().texOffs(0, 87)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.261F)).texOffs(36, 16)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition RightFrontMidLeg = RightFrontUpperLeg.addOrReplaceChild("RightFrontMidLeg",
				CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));

		PartDefinition MidLeg_r1 = RightFrontMidLeg.addOrReplaceChild("MidLeg_r1",
				CubeListBuilder.create().texOffs(52, 16).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition RightFrontLowerLeg = RightFrontMidLeg.addOrReplaceChild("RightFrontLowerLeg",
				CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));

		PartDefinition LowerLeg_r1 = RightFrontLowerLeg.addOrReplaceChild("LowerLeg_r1",
				CubeListBuilder.create().texOffs(36, 25).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));

		PartDefinition RightFrontFoot = RightFrontLowerLeg.addOrReplaceChild("RightFrontFoot",
				CubeListBuilder.create().texOffs(50, 24)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(0, 6)
						.addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));

		PartDefinition Toe_r1 = RightFrontFoot.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));

		PartDefinition LeftFrontLeg = partdefinition.addOrReplaceChild("LeftFrontLeg", CubeListBuilder.create(),
				PartPose.offset(2.9F, 17.0F, -7.725F));

		PartDefinition LeftFrontUpperLeg = LeftFrontLeg.addOrReplaceChild("LeftFrontUpperLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.358F, 0.0175F));

		PartDefinition UpperLegLayer_r2 = LeftFrontUpperLeg.addOrReplaceChild("UpperLegLayer_r2",
				CubeListBuilder.create().texOffs(0, 87)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.261F)).texOffs(36, 16)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftFrontMidLeg = LeftFrontUpperLeg.addOrReplaceChild("LeftFrontMidLeg",
				CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));

		PartDefinition MidLeg_r2 = LeftFrontMidLeg.addOrReplaceChild("MidLeg_r2",
				CubeListBuilder.create().texOffs(52, 16).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition LeftFrontLowerLeg = LeftFrontMidLeg.addOrReplaceChild("LeftFrontLowerLeg",
				CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));

		PartDefinition LowerLeg_r2 = LeftFrontLowerLeg.addOrReplaceChild("LowerLeg_r2",
				CubeListBuilder.create().texOffs(36, 25).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LeftFrontFoot = LeftFrontLowerLeg.addOrReplaceChild("LeftFrontFoot",
				CubeListBuilder.create().texOffs(50, 24)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(0, 6)
						.addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));

		PartDefinition Toe_r2 = LeftFrontFoot.addOrReplaceChild("Toe_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));

		PartDefinition LeftBackLeg = partdefinition.addOrReplaceChild("LeftBackLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.9F, 17.0F, 5.775F, 0.0F, -0.4363F, 0.0F));

		PartDefinition LeftBackUpperLeg = LeftBackLeg.addOrReplaceChild("LeftBackUpperLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 4.742F, 0.0175F, -1.3526F, 0.0F, 0.0F));

		PartDefinition UpperLegLayer_r3 = LeftBackUpperLeg.addOrReplaceChild("UpperLegLayer_r3",
				CubeListBuilder.create().texOffs(0, 87)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.261F)).texOffs(36, 16)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftBackMidLeg = LeftBackUpperLeg.addOrReplaceChild("LeftBackMidLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.01F, 3.6749F, -0.456F, -0.7854F, 0.0F, 0.0F));

		PartDefinition MidLeg_r3 = LeftBackMidLeg.addOrReplaceChild("MidLeg_r3",
				CubeListBuilder.create().texOffs(52, 16).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition LeftBackLowerLeg = LeftBackMidLeg.addOrReplaceChild("LeftBackLowerLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.005F, 2.535F, 1.9715F, 1.0908F, 0.0F, 0.0F));

		PartDefinition LowerLeg_r3 = LeftBackLowerLeg.addOrReplaceChild("LowerLeg_r3",
				CubeListBuilder.create().texOffs(36, 25).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LeftBackFoot = LeftBackLowerLeg.addOrReplaceChild("LeftBackFoot",
				CubeListBuilder.create().texOffs(50, 24)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(0, 6)
						.addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));

		PartDefinition Toe_r3 = LeftBackFoot.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}