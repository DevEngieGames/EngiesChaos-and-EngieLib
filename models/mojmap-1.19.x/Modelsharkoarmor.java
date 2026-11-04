// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsharkoarmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sharkoarmor"), "main");
	private final ModelPart Head;
	private final ModelPart Goggles;
	private final ModelPart R;
	private final ModelPart RSign;
	private final ModelPart L;
	private final ModelPart LSign;
	private final ModelPart Beanie;
	private final ModelPart Eyes;
	private final ModelPart SideFins;
	private final ModelPart ShortTail;
	private final ModelPart FinTop;
	private final ModelPart Teeth;
	private final ModelPart Body;
	private final ModelPart Hood;
	private final ModelPart Scarf;
	private final ModelPart RightScarf;
	private final ModelPart RightScarf2;
	private final ModelPart RightScarf3;
	private final ModelPart RightScarf4;
	private final ModelPart RightScarf5;
	private final ModelPart RightScarf6;
	private final ModelPart RightScarf7;
	private final ModelPart RightScarf8;
	private final ModelPart RightScarf9;
	private final ModelPart LeftScarf;
	private final ModelPart LeftScarf2;
	private final ModelPart LeftScarf3;
	private final ModelPart LeftScarf4;
	private final ModelPart LeftScarf5;
	private final ModelPart LeftScarf6;
	private final ModelPart LeftScarf7;
	private final ModelPart LeftScarf8;
	private final ModelPart LeftScarf9;
	private final ModelPart tail;
	private final ModelPart base;
	private final ModelPart base2;
	private final ModelPart mid1;
	private final ModelPart mid1a;
	private final ModelPart mid2;
	private final ModelPart mid2a;
	private final ModelPart tip;
	private final ModelPart tip2;
	private final ModelPart FinBack;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart LeftBoot;
	private final ModelPart RightBoot;

	public Modelsharkoarmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Goggles = this.Head.getChild("Goggles");
		this.R = this.Goggles.getChild("R");
		this.RSign = this.R.getChild("RSign");
		this.L = this.Goggles.getChild("L");
		this.LSign = this.L.getChild("LSign");
		this.Beanie = this.Head.getChild("Beanie");
		this.Eyes = this.Beanie.getChild("Eyes");
		this.SideFins = this.Beanie.getChild("SideFins");
		this.ShortTail = this.Beanie.getChild("ShortTail");
		this.FinTop = this.Beanie.getChild("FinTop");
		this.Teeth = this.Beanie.getChild("Teeth");
		this.Body = root.getChild("Body");
		this.Hood = this.Body.getChild("Hood");
		this.Scarf = this.Body.getChild("Scarf");
		this.RightScarf = this.Scarf.getChild("RightScarf");
		this.RightScarf2 = this.RightScarf.getChild("RightScarf2");
		this.RightScarf3 = this.RightScarf2.getChild("RightScarf3");
		this.RightScarf4 = this.RightScarf3.getChild("RightScarf4");
		this.RightScarf5 = this.RightScarf4.getChild("RightScarf5");
		this.RightScarf6 = this.RightScarf5.getChild("RightScarf6");
		this.RightScarf7 = this.RightScarf6.getChild("RightScarf7");
		this.RightScarf8 = this.RightScarf7.getChild("RightScarf8");
		this.RightScarf9 = this.RightScarf8.getChild("RightScarf9");
		this.LeftScarf = this.Scarf.getChild("LeftScarf");
		this.LeftScarf2 = this.LeftScarf.getChild("LeftScarf2");
		this.LeftScarf3 = this.LeftScarf2.getChild("LeftScarf3");
		this.LeftScarf4 = this.LeftScarf3.getChild("LeftScarf4");
		this.LeftScarf5 = this.LeftScarf4.getChild("LeftScarf5");
		this.LeftScarf6 = this.LeftScarf5.getChild("LeftScarf6");
		this.LeftScarf7 = this.LeftScarf6.getChild("LeftScarf7");
		this.LeftScarf8 = this.LeftScarf7.getChild("LeftScarf8");
		this.LeftScarf9 = this.LeftScarf8.getChild("LeftScarf9");
		this.tail = this.Body.getChild("tail");
		this.base = this.tail.getChild("base");
		this.base2 = this.base.getChild("base2");
		this.mid1 = this.base2.getChild("mid1");
		this.mid1a = this.mid1.getChild("mid1a");
		this.mid2 = this.mid1a.getChild("mid2");
		this.mid2a = this.mid2.getChild("mid2a");
		this.tip = this.mid2a.getChild("tip");
		this.tip2 = this.tip.getChild("tip2");
		this.FinBack = this.Body.getChild("FinBack");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftBoot = root.getChild("LeftBoot");
		this.RightBoot = root.getChild("RightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.025F, -1.6F, -4.025F, 8.05F, 1.525F, 8.05F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Goggles = Head.addOrReplaceChild("Goggles", CubeListBuilder.create().texOffs(110, 69)
				.addBox(-4.0F, 0.6419F, -3.0662F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.025F)).texOffs(1, 33)
				.addBox(-4.025F, 0.6419F, -2.0912F, 0.025F, 2.0F, 8.05F, new CubeDeformation(0.0F)).texOffs(1, 33)
				.addBox(4.0F, 0.6419F, -2.0912F, 0.025F, 2.0F, 8.05F, new CubeDeformation(0.0F)).texOffs(1, 33)
				.addBox(-4.025F, 0.6419F, 5.9088F, 8.05F, 2.0F, 0.05F, new CubeDeformation(0.0F)).texOffs(83, 72)
				.addBox(2.025F, 0.45F, -2.7F, 0.2F, 0.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(83, 72)
				.addBox(-2.225F, 0.45F, -2.7F, 0.2F, 0.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(1, 33)
				.addBox(-2.025F, -2.4081F, 5.9088F, 4.05F, 3.05F, 0.05F, new CubeDeformation(0.0F)).texOffs(1, 33)
				.addBox(-2.025F, -2.4081F, -2.0912F, 4.05F, 0.05F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.6419F, -1.9338F));

		PartDefinition cube_r1 = Goggles.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(1, 33).addBox(-2.025F, -0.025F, -0.025F, 4.05F, 3.15F, 0.05F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.3831F, -2.0662F, -0.1309F, 0.0F, 0.0F));

		PartDefinition R = Goggles.addOrReplaceChild("R", CubeListBuilder.create().texOffs(119, 69)
				.addBox(-0.9888F, -0.025F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.9888F, 2.0F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-1.0138F, 0.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.9888F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.9888F, 0.25F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.7388F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.9888F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.7388F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.9888F, 1.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.7362F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.7362F, 1.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.4862F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.7362F, 0.25F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.4862F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.7362F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.9862F, 0.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(86, 65)
				.addBox(-3.9898F, -3.0F, 1.8618F, 8.0F, 8.0F, 1.0F, new CubeDeformation(-3.0F)),
				PartPose.offset(-2.0112F, 0.6419F, -3.378F));

		PartDefinition cube_r2 = R.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(87, 75).mirror()
						.addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(-4.95F)).mirror(false),
				PartPose.offsetAndRotation(0.0112F, 1.0F, 4.7118F, -3.1416F, 0.0F, 0.0F));

		PartDefinition RSign = R.addOrReplaceChild("RSign", CubeListBuilder.create(),
				PartPose.offset(-0.0013F, 0.0F, -0.1632F));

		PartDefinition cube_r3 = RSign.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(82, 84).mirror()
						.addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(-5.7F)).mirror(false),
				PartPose.offsetAndRotation(0.0125F, 1.05F, 5.7F, 3.1416F, 0.0F, 0.0F));

		PartDefinition L = Goggles.addOrReplaceChild("L", CubeListBuilder.create().texOffs(119, 69)
				.addBox(-0.9888F, -0.025F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.9888F, 2.0F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-1.0138F, 0.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.9888F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.9888F, 0.25F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.7388F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.9888F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.7388F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(-0.9888F, 1.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.7362F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.7362F, 1.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.4862F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.7362F, 0.25F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.4862F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.7362F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 69)
				.addBox(0.9862F, 0.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(86, 65)
				.addBox(-3.9898F, -3.0F, 1.8618F, 8.0F, 8.0F, 1.0F, new CubeDeformation(-3.0F)),
				PartPose.offset(1.9888F, 0.6419F, -3.378F));

		PartDefinition cube_r4 = L.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(87, 75).mirror()
						.addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(-4.95F)).mirror(false),
				PartPose.offsetAndRotation(0.0112F, 1.0F, 4.7118F, -3.1416F, 0.0F, 0.0F));

		PartDefinition LSign = L.addOrReplaceChild("LSign", CubeListBuilder.create(),
				PartPose.offset(-0.0013F, 0.0F, -0.1632F));

		PartDefinition cube_r5 = LSign.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(82, 84).mirror()
						.addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(-5.7F)).mirror(false),
				PartPose.offsetAndRotation(0.0125F, 1.05F, 5.7F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Beanie = Head.addOrReplaceChild("Beanie",
				CubeListBuilder.create().texOffs(0, 78)
						.addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.025F)).texOffs(0, 90)
						.addBox(-4.5F, -3.0F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Eyes = Beanie.addOrReplaceChild("Eyes", CubeListBuilder.create().texOffs(0, 78)
				.addBox(-4.75F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 78).mirror()
				.addBox(2.75F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -2.25F, -3.25F));

		PartDefinition SideFins = Beanie.addOrReplaceChild("SideFins", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.5F, 0.0F));

		PartDefinition sidefin_r1 = SideFins.addOrReplaceChild("sidefin_r1",
				CubeListBuilder.create().texOffs(32, 50).mirror()
						.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.4F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition sidefin_r2 = SideFins
				.addOrReplaceChild("sidefin_r2",
						CubeListBuilder.create().texOffs(32, 50).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(5.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition ShortTail = Beanie.addOrReplaceChild("ShortTail", CubeListBuilder.create(),
				PartPose.offset(-0.0305F, -1.5315F, 5.8215F));

		PartDefinition shark_r1 = ShortTail.addOrReplaceChild("shark_r1",
				CubeListBuilder.create().texOffs(40, 55).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(0.0008F, 0.4419F, 0.5292F, -0.7854F, 0.0F, 0.0F));

		PartDefinition shark_r2 = ShortTail.addOrReplaceChild("shark_r2",
				CubeListBuilder.create().texOffs(32, 61).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -3.2704F, 1.5921F, -0.7854F, 0.0F, 0.0F));

		PartDefinition FinTop = Beanie.addOrReplaceChild("FinTop", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r6 = FinTop.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(32, 55).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.5F, -1.9543F, 0.4324F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r7 = FinTop.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(32, 55).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.475F, -1.9543F, 0.4324F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Teeth = Beanie.addOrReplaceChild("Teeth", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.0F, -4.0F));

		PartDefinition cube_r8 = Teeth.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r9 = Teeth.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r10 = Teeth.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -0.4F, 1.0F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r11 = Teeth.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -0.4F, 1.0F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r12 = Teeth.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r13 = Teeth.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(80, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(80, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hood = Body.addOrReplaceChild("Hood", CubeListBuilder.create().texOffs(1, 17)
				.addBox(-4.2513F, -0.1224F, -3.3532F, 8.5F, 2.0F, 6.925F, new CubeDeformation(0.0F)).texOffs(15, 22)
				.addBox(-4.2513F, 1.3026F, -1.8532F, 8.5F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
				.addBox(-4.5263F, -1.6224F, -4.4032F, 9.05F, 2.525F, 9.05F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0013F, -0.3776F, 1.3782F));

		PartDefinition cube_r14 = Hood.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(12, 21).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0013F, 1.8091F, 2.726F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Hood.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(5, 19).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0013F, 1.8091F, -2.499F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Hood.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(12, 18).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0078F, -1.7633F, 3.7968F, 1.5708F, -0.7854F, -1.5708F));

		PartDefinition cube_r17 = Hood.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(12, 18).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0078F, -1.7633F, -3.5532F, 1.5708F, 0.7854F, -1.5708F));

		PartDefinition cube_r18 = Hood.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(12, 18).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6672F, -1.7633F, 0.1218F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r19 = Hood.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(12, 18).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6578F, -1.7633F, 0.1218F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Scarf = Body.addOrReplaceChild("Scarf",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.275F, -1.0F, -4.125F, 8.55F, 1.0F, 8.55F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.25F, -0.5F, -3.475F, 8.5F, 2.0F, 6.925F, new CubeDeformation(0.05F)).texOffs(0, 0)
						.addBox(-4.25F, 1.325F, -1.575F, 8.5F, 2.0F, 3.0F, new CubeDeformation(0.05F)).texOffs(0, 0)
						.addBox(-4.525F, -1.6F, -4.525F, 9.05F, 2.125F, 9.05F, new CubeDeformation(0.05F)).texOffs(0, 0)
						.addBox(-3.525F, -2.6F, -3.525F, 7.05F, 0.025F, 7.05F, new CubeDeformation(0.05F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Scarf.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, 2.6042F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Scarf.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, -2.6208F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Scarf.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0091F, -1.7409F, 3.675F, 1.5708F, -0.7854F, -1.5708F));

		PartDefinition cube_r23 = Scarf.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0091F, -1.7409F, -3.675F, 1.5708F, 0.7854F, -1.5708F));

		PartDefinition cube_r24 = Scarf.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-3.6659F, -1.7409F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r25 = Scarf.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(3.6591F, -1.7409F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition RightScarf = Scarf.addOrReplaceChild("RightScarf",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -1.4F, 4.5625F, 0.5236F, -0.0873F, 0.0873F));

		PartDefinition RightScarf2 = RightScarf.addOrReplaceChild("RightScarf2",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, 0.0436F));

		PartDefinition RightScarf3 = RightScarf2.addOrReplaceChild("RightScarf3",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, 0.0436F));

		PartDefinition RightScarf4 = RightScarf3.addOrReplaceChild("RightScarf4",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F,
						new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0873F, 0.0F, 0.0436F));

		PartDefinition RightScarf5 = RightScarf4.addOrReplaceChild("RightScarf5",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition RightScarf6 = RightScarf5.addOrReplaceChild("RightScarf6",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.775F, -0.1F, -0.1625F, 3.55F, 2.5F, 0.325F,
						new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition RightScarf7 = RightScarf6.addOrReplaceChild("RightScarf7",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.875F, -0.1F, -0.1625F, 3.75F, 2.5F, 0.325F,
						new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition RightScarf8 = RightScarf7.addOrReplaceChild("RightScarf8",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.975F, -0.1F, -0.1625F, 3.95F, 2.5F, 0.325F,
						new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition RightScarf9 = RightScarf8.addOrReplaceChild("RightScarf9", CubeListBuilder.create().texOffs(0, 4)
				.addBox(-0.5747F, 0.9923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(-0.5747F, 1.8923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition cube_r26 = RightScarf9.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 4)
				.addBox(-1.9811F, 0.4047F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4)
				.addBox(-1.9784F, -0.4922F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r27 = RightScarf9.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 4)
				.addBox(1.1265F, 0.4239F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4)
				.addBox(1.1239F, -0.473F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r28 = RightScarf9.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 4)
				.addBox(-3.5292F, 0.774F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4)
				.addBox(-3.5043F, -0.1144F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r29 = RightScarf9.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 4)
				.addBox(2.7168F, 0.8332F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4)
				.addBox(2.6919F, -0.0553F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.3054F));

		PartDefinition LeftScarf = Scarf.addOrReplaceChild("LeftScarf",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -1.4F, 4.5625F, 0.5236F, 0.0873F, -0.0873F));

		PartDefinition LeftScarf2 = LeftScarf.addOrReplaceChild("LeftScarf2",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, -0.0436F));

		PartDefinition LeftScarf3 = LeftScarf2.addOrReplaceChild("LeftScarf3",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, -0.0436F));

		PartDefinition LeftScarf4 = LeftScarf3.addOrReplaceChild("LeftScarf4",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F,
						new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0873F, 0.0F, -0.0436F));

		PartDefinition LeftScarf5 = LeftScarf4.addOrReplaceChild("LeftScarf5",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition LeftScarf6 = LeftScarf5.addOrReplaceChild("LeftScarf6",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.775F, -0.1F, -0.1625F, 3.55F, 2.5F, 0.325F,
						new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition LeftScarf7 = LeftScarf6.addOrReplaceChild("LeftScarf7",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.875F, -0.1F, -0.1625F, 3.75F, 2.5F, 0.325F,
						new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition LeftScarf8 = LeftScarf7.addOrReplaceChild("LeftScarf8",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.975F, -0.1F, -0.1625F, 3.95F, 2.5F, 0.325F,
						new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition LeftScarf9 = LeftScarf8.addOrReplaceChild("LeftScarf9", CubeListBuilder.create().texOffs(0, 4)
				.addBox(-0.5748F, 0.9923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(-0.5748F, 1.8923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition cube_r30 = LeftScarf9.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 4)
				.addBox(-1.9811F, 0.4047F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4)
				.addBox(-1.9784F, -0.4922F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r31 = LeftScarf9.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 4)
				.addBox(1.1265F, 0.4239F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4)
				.addBox(1.1239F, -0.473F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r32 = LeftScarf9.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 4)
				.addBox(-3.5292F, 0.774F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4)
				.addBox(-3.5043F, -0.1144F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r33 = LeftScarf9.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 4)
				.addBox(2.7168F, 0.8332F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4)
				.addBox(2.6919F, -0.0553F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.3054F));

		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 12.565F, 1.4355F));

		PartDefinition base = tail.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, -3.1875F, 0.0F, 6.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.4363F, 0.0F));

		PartDefinition sidefin_r3 = base.addOrReplaceChild("sidefin_r3",
				CubeListBuilder.create().texOffs(28, 45).mirror()
						.addBox(-3.5F, -0.5F, -2.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, 3.9019F, 5.583F, 0.2849F, 0.274F, -0.7459F));

		PartDefinition sidefin_r4 = base.addOrReplaceChild("sidefin_r4",
				CubeListBuilder.create().texOffs(28, 45).addBox(-3.5F, -0.5F, -2.0F, 7.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 3.6161F, 5.4646F, 0.2849F, -0.274F, 0.7459F));

		PartDefinition base2 = base.addOrReplaceChild("base2",
				CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, -3.1875F, 0.0F, 6.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, -0.1745F, -0.4363F, 0.0F));

		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1",
				CubeListBuilder.create().texOffs(20, 58).addBox(-1.0F, -3.5F, -2.0F, 2.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.8732F, 5.0541F, -0.7854F, 0.0F, 0.0F));

		PartDefinition mid1 = base2.addOrReplaceChild("mid1",
				CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, -3.1875F, 0.0F, 6.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, -0.1745F, -0.4363F, 0.0F));

		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a",
				CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, -3.1875F, 0.0F, 6.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, 0.0F, -0.4363F, -0.1745F));

		PartDefinition sidefin_r5 = mid1a.addOrReplaceChild("sidefin_r5",
				CubeListBuilder.create().texOffs(32, 40).mirror()
						.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.4922F, 2.4309F, 3.2402F, 0.0246F, 0.5108F, -0.2081F));

		PartDefinition sidefin_r6 = mid1a.addOrReplaceChild("sidefin_r6",
				CubeListBuilder.create().texOffs(32, 40).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4609F, 2.4243F, 3.2223F, 0.0246F, -0.5108F, 0.2081F));

		PartDefinition mid2 = mid1a.addOrReplaceChild("mid2",
				CubeListBuilder.create().texOffs(14, 69).addBox(-2.5F, -2.6563F, 0.0F, 5.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, 0.0F, -0.4363F, -0.1745F));

		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a",
				CubeListBuilder.create().texOffs(14, 69).addBox(-2.5F, -2.6563F, 0.0F, 5.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, 0.2094F, -0.4363F, -0.2182F));

		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2",
				CubeListBuilder.create().texOffs(12, 58).addBox(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0509F, 3.0559F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tip = mid2a.addOrReplaceChild("tip",
				CubeListBuilder.create().texOffs(40, 32).addBox(-1.5F, -1.5938F, 0.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, 0.1396F, -0.4363F, 0.0F));

		PartDefinition tip2 = tip.addOrReplaceChild("tip2",
				CubeListBuilder.create().texOffs(0, 71).addBox(-1.5938F, -1.5938F, 0.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, 0.0F, -0.4363F, 0.0F));

		PartDefinition shark_r3 = tip2.addOrReplaceChild("shark_r3",
				CubeListBuilder.create().texOffs(20, 48).addBox(-0.5F, -2.5F, -2.5F, 1.0F, 5.0F, 5.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.0297F, 1.2454F, 3.3058F, -0.7854F, 0.0F, 0.0F));

		PartDefinition shark_r4 = tip2.addOrReplaceChild("shark_r4",
				CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, -4.0F, -2.5F, 1.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0313F, -2.4669F, 4.3687F, -0.7854F, 0.0F, 0.0F));

		PartDefinition FinBack = Body.addOrReplaceChild("FinBack", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.625F, 3.975F, 3.175F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r34 = FinBack.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.975F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r35 = FinBack
				.addOrReplaceChild("cube_r35",
						CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F,
								new CubeDeformation(0.01F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(96, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(112, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)).texOffs(112, 85)
						.addBox(-1.0F, 7.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.675F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(104, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(104, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)).texOffs(112, 92)
						.addBox(-3.0F, 7.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.675F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(80, 48)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(64, 48)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(64, 16)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(64, 32)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
				CubeListBuilder.create().texOffs(64, 0)
						.addBox(-1.9F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)).texOffs(48, 0)
						.addBox(-1.9F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.2F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
				CubeListBuilder.create().texOffs(64, 9)
						.addBox(-2.1F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)).texOffs(48, 9)
						.addBox(-2.1F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.2F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}