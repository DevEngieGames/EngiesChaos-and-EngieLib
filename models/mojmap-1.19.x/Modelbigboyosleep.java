// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbigboyosleep<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bigboyosleep"), "main");
	private final ModelPart Root;
	private final ModelPart Head;
	private final ModelPart Hat;
	private final ModelPart Ear1;
	private final ModelPart Ear2;
	private final ModelPart Snout;
	private final ModelPart TobyWhiskers;
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
	private final ModelPart Fin;
	private final ModelPart Collar;
	private final ModelPart Bell;
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
	private final ModelPart RightBackLeg;
	private final ModelPart RightBackUpperLeg;
	private final ModelPart RightBackMidLeg;
	private final ModelPart RightBackLowerLeg;
	private final ModelPart RightBackFoot;
	private final ModelPart LeftBackLeg;
	private final ModelPart LeftBackUpperLeg;
	private final ModelPart LeftBackMidLeg;
	private final ModelPart LeftBackLowerLeg;
	private final ModelPart LeftBackFoot;

	public Modelbigboyosleep(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Head = this.Root.getChild("Head");
		this.Hat = this.Head.getChild("Hat");
		this.Ear1 = this.Head.getChild("Ear1");
		this.Ear2 = this.Head.getChild("Ear2");
		this.Snout = this.Head.getChild("Snout");
		this.TobyWhiskers = this.Head.getChild("TobyWhiskers");
		this.Body = this.Root.getChild("Body");
		this.tail = this.Body.getChild("tail");
		this.base = this.tail.getChild("base");
		this.base2 = this.base.getChild("base2");
		this.mid1 = this.base2.getChild("mid1");
		this.mid1a = this.mid1.getChild("mid1a");
		this.mid2 = this.mid1a.getChild("mid2");
		this.mid2a = this.mid2.getChild("mid2a");
		this.tip = this.mid2a.getChild("tip");
		this.tip2 = this.tip.getChild("tip2");
		this.Fin = this.Body.getChild("Fin");
		this.Collar = this.Body.getChild("Collar");
		this.Bell = this.Collar.getChild("Bell");
		this.RightFrontLeg = this.Root.getChild("RightFrontLeg");
		this.RightFrontUpperLeg = this.RightFrontLeg.getChild("RightFrontUpperLeg");
		this.RightFrontMidLeg = this.RightFrontUpperLeg.getChild("RightFrontMidLeg");
		this.RightFrontLowerLeg = this.RightFrontMidLeg.getChild("RightFrontLowerLeg");
		this.RightFrontFoot = this.RightFrontLowerLeg.getChild("RightFrontFoot");
		this.LeftFrontLeg = this.Root.getChild("LeftFrontLeg");
		this.LeftFrontUpperLeg = this.LeftFrontLeg.getChild("LeftFrontUpperLeg");
		this.LeftFrontMidLeg = this.LeftFrontUpperLeg.getChild("LeftFrontMidLeg");
		this.LeftFrontLowerLeg = this.LeftFrontMidLeg.getChild("LeftFrontLowerLeg");
		this.LeftFrontFoot = this.LeftFrontLowerLeg.getChild("LeftFrontFoot");
		this.RightBackLeg = this.Root.getChild("RightBackLeg");
		this.RightBackUpperLeg = this.RightBackLeg.getChild("RightBackUpperLeg");
		this.RightBackMidLeg = this.RightBackUpperLeg.getChild("RightBackMidLeg");
		this.RightBackLowerLeg = this.RightBackMidLeg.getChild("RightBackLowerLeg");
		this.RightBackFoot = this.RightBackLowerLeg.getChild("RightBackFoot");
		this.LeftBackLeg = this.Root.getChild("LeftBackLeg");
		this.LeftBackUpperLeg = this.LeftBackLeg.getChild("LeftBackUpperLeg");
		this.LeftBackMidLeg = this.LeftBackUpperLeg.getChild("LeftBackMidLeg");
		this.LeftBackLowerLeg = this.LeftBackMidLeg.getChild("LeftBackLowerLeg");
		this.LeftBackFoot = this.LeftBackLowerLeg.getChild("LeftBackFoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-8.0F, 20.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Head = Root.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(64, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(64, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(32, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(64, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, -5.525F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Hat = Head.addOrReplaceChild("Hat",
				CubeListBuilder.create().texOffs(0, 58)
						.addBox(-3.95F, 0.7926F, -6.5F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-3.45F, 0.0677F, -6.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.45F, -5.7676F, -4.0F, 0.0F, 0.0F, -1.3963F));

		PartDefinition cube_r1 = Hat.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 48).addBox(-6.0F, -0.5F, -6.0F, 11.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.05F, -0.1574F, -0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r2 = Hat.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 47).addBox(-4.0F, -2.5F, -4.0F, 10.0F, 3.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.55F, -0.6823F, 1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r3 = Hat.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 58).addBox(-5.0F, -0.5F, -6.0F, 10.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.55F, 0.5677F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r4 = Hat.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 58).addBox(-6.0F, -0.5F, -6.0F, 12.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.55F, 0.5677F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r5 = Hat.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 58).addBox(-5.0F, -0.5F, -6.0F, 10.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.55F, 0.5677F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r6 = Hat.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 58).addBox(-6.0F, -0.5F, -7.0F, 12.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.05F, 1.2926F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r7 = Hat.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 58).addBox(-6.0F, -0.5F, -7.0F, 13.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.05F, 1.2926F, -0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r8 = Hat.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 58).addBox(-6.0F, -0.5F, -7.0F, 12.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.05F, 1.2926F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Ear1 = Head.addOrReplaceChild("Ear1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.4785F, -7.2486F, -1.681F, -0.9163F, 0.4363F, 0.0F));

		PartDefinition cube_r9 = Ear1.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(36, 31).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.4875F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r10 = Ear1.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(36, 31).mirror()
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.4875F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.5215F, -7.2486F, -1.681F, -0.9163F, -0.4363F, 0.0F));

		PartDefinition cube_r11 = Ear2.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(36, 31).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.4875F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r12 = Ear2.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(36, 31).mirror()
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.4875F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Snout = Head.addOrReplaceChild("Snout",
				CubeListBuilder.create().texOffs(36, 39)
						.addBox(-4.0F, 0.01F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).texOffs(36, 43)
						.addBox(-4.0F, 1.51F, 0.25F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)),
				PartPose.offset(1.889F, -1.4981F, -10.025F));

		PartDefinition Whisker_r1 = Snout.addOrReplaceChild("Whisker_r1",
				CubeListBuilder.create().texOffs(54, 31).addBox(-2.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.014F, 0.9981F, 1.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition Whisker_r2 = Snout.addOrReplaceChild("Whisker_r2",
				CubeListBuilder.create().texOffs(54, 34).addBox(0.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.086F, 0.9981F, 0.975F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Snout_r1 = Snout.addOrReplaceChild("Snout_r1",
				CubeListBuilder.create().texOffs(58, 39).addBox(0.0F, 1.01F, 0.0F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.5F, 0.25F, 0.0F, -0.4625F, 0.0F));

		PartDefinition Snout_r2 = Snout
				.addOrReplaceChild("Snout_r2",
						CubeListBuilder.create().texOffs(58, 39).addBox(-2.0F, 1.01F, 0.0F, 2.0F, 1.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 0.25F, 0.0F, 0.4625F, 0.0F));

		PartDefinition Snout_r3 = Snout.addOrReplaceChild("Snout_r3",
				CubeListBuilder.create().texOffs(48, 39).addBox(0.0F, 0.01F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.4625F, 0.0F));

		PartDefinition Snout_r4 = Snout
				.addOrReplaceChild("Snout_r4",
						CubeListBuilder.create().texOffs(48, 39).addBox(-2.0F, 0.01F, 0.0F, 2.0F, 2.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4625F, 0.0F));

		PartDefinition TobyWhiskers = Head.addOrReplaceChild("TobyWhiskers", CubeListBuilder.create(),
				PartPose.offset(2.989F, -0.4881F, -8.0F));

		PartDefinition TobyWhisker_r1 = TobyWhiskers.addOrReplaceChild("TobyWhisker_r1",
				CubeListBuilder.create().texOffs(71, 35).addBox(-2.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition TobyWhisker_r2 = TobyWhiskers
				.addOrReplaceChild("TobyWhisker_r2",
						CubeListBuilder.create().texOffs(71, 38).addBox(0.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-5.1F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(60, 72)
						.addBox(-5.1F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.275F)),
				PartPose.offsetAndRotation(0.0F, -13.0F, 2.475F, 1.5708F, 0.0F, 0.0F));

		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.15F, 25.0F, -20.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition base = tail.addOrReplaceChild("base", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -19.85F, -22.95F, -0.3491F, 0.0F, 0.0F));

		PartDefinition base2 = base.addOrReplaceChild("base2",
				CubeListBuilder.create().texOffs(68, 16)
						.addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.05F)).texOffs(80, 44)
						.addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.2441F, 0.1654F, -0.5146F));

		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1",
				CubeListBuilder.create().texOffs(84, 16).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -2.9571F, 3.7604F, -0.7854F, 0.0F, 0.0F));

		PartDefinition mid1 = base2.addOrReplaceChild("mid1",
				CubeListBuilder.create().texOffs(68, 16).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0616F, 0.0756F, -0.2224F));

		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a",
				CubeListBuilder.create().texOffs(68, 16).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0209F, -0.0267F, -0.3918F));

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
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0021F, -0.0189F, -0.2174F));

		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a",
				CubeListBuilder.create().texOffs(69, 24).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1084F, -0.2603F, -0.028F));

		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2",
				CubeListBuilder.create().texOffs(90, 38).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.5821F, 2.3033F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tip = mid2a.addOrReplaceChild("tip",
				CubeListBuilder.create().texOffs(86, 33).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1485F, -0.4293F, -0.0808F));

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

		PartDefinition Fin = Body.addOrReplaceChild("Fin", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.0269F, -2.2898F, 2.361F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Fin.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(44, 31).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.4875F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r14 = Fin.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(44, 31).mirror()
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.4875F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Collar = Body.addOrReplaceChild("Collar", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -10.5502F, -0.4671F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Collar.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 42)
						.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.05F)).texOffs(0, 42)
						.addBox(8.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-4.5F, -1.9498F, 0.3421F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Collar.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 40).addBox(-5.0F, 0.5F, -0.5F, 10.0F, 1.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.0252F, -0.1829F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Collar.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 40).addBox(-5.0F, -0.5F, -0.5F, 10.0F, 1.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, -2.0498F, 0.3671F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bell = Collar.addOrReplaceChild("Bell",
				CubeListBuilder.create().texOffs(22, 40)
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)).texOffs(28, 40)
						.addBox(-1.0F, 0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.9752F, -0.2579F));

		PartDefinition cube_r18 = Bell.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

		PartDefinition cube_r19 = Bell.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(-1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r20 = Bell.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(22, 40).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition RightFrontLeg = Root.addOrReplaceChild("RightFrontLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.1F, -7.0F, -6.225F, 0.2616F, 0.0113F, -0.3912F));

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

		PartDefinition LeftFrontLeg = Root.addOrReplaceChild("LeftFrontLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.9F, -7.0F, -6.225F, -0.2618F, 0.0F, 0.0F));

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

		PartDefinition RightBackLeg = Root.addOrReplaceChild("RightBackLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.1F, -7.0F, 5.775F, 0.3924F, 0.0167F, -0.3021F));

		PartDefinition RightBackUpperLeg = RightBackLeg.addOrReplaceChild("RightBackUpperLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.358F, 0.0175F));

		PartDefinition UpperLegLayer_r3 = RightBackUpperLeg.addOrReplaceChild("UpperLegLayer_r3",
				CubeListBuilder.create().texOffs(0, 87)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.261F)).texOffs(36, 16)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition RightBackMidLeg = RightBackUpperLeg.addOrReplaceChild("RightBackMidLeg",
				CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));

		PartDefinition MidLeg_r3 = RightBackMidLeg.addOrReplaceChild("MidLeg_r3",
				CubeListBuilder.create().texOffs(52, 16).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition RightBackLowerLeg = RightBackMidLeg.addOrReplaceChild("RightBackLowerLeg",
				CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));

		PartDefinition LowerLeg_r3 = RightBackLowerLeg.addOrReplaceChild("LowerLeg_r3",
				CubeListBuilder.create().texOffs(36, 25).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));

		PartDefinition RightBackFoot = RightBackLowerLeg.addOrReplaceChild("RightBackFoot",
				CubeListBuilder.create().texOffs(50, 24)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(0, 6)
						.addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));

		PartDefinition Toe_r3 = RightBackFoot.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));

		PartDefinition LeftBackLeg = Root.addOrReplaceChild("LeftBackLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.9F, -7.0F, 5.775F, -0.1745F, 0.0F, 0.0F));

		PartDefinition LeftBackUpperLeg = LeftBackLeg.addOrReplaceChild("LeftBackUpperLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.358F, 0.0175F));

		PartDefinition UpperLegLayer_r4 = LeftBackUpperLeg.addOrReplaceChild("UpperLegLayer_r4",
				CubeListBuilder.create().texOffs(0, 87)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.261F)).texOffs(36, 16)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftBackMidLeg = LeftBackUpperLeg.addOrReplaceChild("LeftBackMidLeg", CubeListBuilder.create(),
				PartPose.offset(0.01F, 3.3749F, -1.031F));

		PartDefinition MidLeg_r4 = LeftBackMidLeg.addOrReplaceChild("MidLeg_r4",
				CubeListBuilder.create().texOffs(52, 16).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition LeftBackLowerLeg = LeftBackMidLeg.addOrReplaceChild("LeftBackLowerLeg", CubeListBuilder.create(),
				PartPose.offset(-0.005F, 1.535F, 2.3715F));

		PartDefinition LowerLeg_r4 = LeftBackLowerLeg.addOrReplaceChild("LowerLeg_r4",
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

		PartDefinition Toe_r4 = LeftBackFoot.addOrReplaceChild("Toe_r4",
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
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}