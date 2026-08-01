package engiegames.engies_chaos.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelxengiearmor extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("engies_chaos", "modelxengiearmor"), "main");
	public final ModelPart Head;
	public final ModelPart Goggles;
	public final ModelPart R;
	public final ModelPart RSign;
	public final ModelPart L;
	public final ModelPart LSign;
	public final ModelPart Muffs;
	public final ModelPart AngelHat;
	public final ModelPart Chains;
	public final ModelPart L1;
	public final ModelPart L2;
	public final ModelPart L3;
	public final ModelPart L4;
	public final ModelPart L5;
	public final ModelPart L6;
	public final ModelPart L7;
	public final ModelPart L8;
	public final ModelPart R1;
	public final ModelPart R2;
	public final ModelPart R3;
	public final ModelPart R4;
	public final ModelPart R5;
	public final ModelPart R6;
	public final ModelPart R7;
	public final ModelPart R8;
	public final ModelPart Body;
	public final ModelPart Hood;
	public final ModelPart Roughian;
	public final ModelPart RoughianBody;
	public final ModelPart RoughianLeftArm;
	public final ModelPart RoughianRightArm;
	public final ModelPart RoughianLeftLeg;
	public final ModelPart RoughianRightLeg;
	public final ModelPart Scarf;
	public final ModelPart RightScarf;
	public final ModelPart RightScarf2;
	public final ModelPart RightScarf3;
	public final ModelPart RightScarf4;
	public final ModelPart RightScarf5;
	public final ModelPart RightScarf6;
	public final ModelPart RightScarf7;
	public final ModelPart RightScarf8;
	public final ModelPart RightScarf9;
	public final ModelPart LeftScarf;
	public final ModelPart LeftScarf2;
	public final ModelPart LeftScarf3;
	public final ModelPart LeftScarf4;
	public final ModelPart LeftScarf5;
	public final ModelPart LeftScarf6;
	public final ModelPart LeftScarf7;
	public final ModelPart LeftScarf8;
	public final ModelPart LeftScarf9;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftBoot;
	public final ModelPart RightBoot;

	public Modelxengiearmor(ModelPart root) {
		super(root);
		this.Head = root.getChild("Head");
		this.Goggles = this.Head.getChild("Goggles");
		this.R = this.Goggles.getChild("R");
		this.RSign = this.R.getChild("RSign");
		this.L = this.Goggles.getChild("L");
		this.LSign = this.L.getChild("LSign");
		this.Muffs = this.Head.getChild("Muffs");
		this.AngelHat = this.Head.getChild("AngelHat");
		this.Chains = this.AngelHat.getChild("Chains");
		this.L1 = this.Chains.getChild("L1");
		this.L2 = this.L1.getChild("L2");
		this.L3 = this.L2.getChild("L3");
		this.L4 = this.L3.getChild("L4");
		this.L5 = this.L4.getChild("L5");
		this.L6 = this.L5.getChild("L6");
		this.L7 = this.L6.getChild("L7");
		this.L8 = this.L7.getChild("L8");
		this.R1 = this.Chains.getChild("R1");
		this.R2 = this.R1.getChild("R2");
		this.R3 = this.R2.getChild("R3");
		this.R4 = this.R3.getChild("R4");
		this.R5 = this.R4.getChild("R5");
		this.R6 = this.R5.getChild("R6");
		this.R7 = this.R6.getChild("R7");
		this.R8 = this.R7.getChild("R8");
		this.Body = root.getChild("Body");
		this.Hood = this.Body.getChild("Hood");
		this.Roughian = this.Body.getChild("Roughian");
		this.RoughianBody = this.Roughian.getChild("RoughianBody");
		this.RoughianLeftArm = this.Roughian.getChild("RoughianLeftArm");
		this.RoughianRightArm = this.Roughian.getChild("RoughianRightArm");
		this.RoughianLeftLeg = this.Roughian.getChild("RoughianLeftLeg");
		this.RoughianRightLeg = this.Roughian.getChild("RoughianRightLeg");
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 128).addBox(-4.025F, -1.6F, -4.025F, 8.05F, 1.525F, 8.05F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Goggles = Head.addOrReplaceChild("Goggles",
				CubeListBuilder.create().texOffs(73, 68).addBox(-4.0F, 0.6419F, -3.0662F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.025F)).texOffs(26, 49).addBox(-4.025F, 0.6419F, -2.0912F, 0.025F, 2.0F, 8.05F, new CubeDeformation(0.0F))
						.texOffs(26, 49).addBox(4.0F, 0.6419F, -2.0912F, 0.025F, 2.0F, 8.05F, new CubeDeformation(0.0F)).texOffs(26, 57).addBox(-4.025F, 0.6419F, 5.9088F, 8.05F, 2.0F, 0.05F, new CubeDeformation(0.0F)).texOffs(56, 64)
						.addBox(2.025F, 0.45F, -2.7F, 0.2F, 0.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(56, 64).addBox(-2.225F, 0.45F, -2.7F, 0.2F, 0.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-2.025F, -2.4081F, 5.9088F, 4.05F, 3.05F, 0.05F, new CubeDeformation(0.0F)).texOffs(18, 51).addBox(-2.025F, -2.4081F, -2.0912F, 4.05F, 0.05F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.6419F, -1.9338F));
		PartDefinition cube_r1 = Goggles.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-2.025F, -0.025F, -0.025F, 4.05F, 3.15F, 0.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.3831F, -2.0662F, -0.1309F, 0.0F, 0.0F));
		PartDefinition R = Goggles.addOrReplaceChild("R",
				CubeListBuilder.create().texOffs(77, 71).addBox(-0.9888F, -0.025F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.9888F, 2.0F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F))
						.texOffs(77, 71).addBox(-1.0138F, 0.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.9888F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, 0.25F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.7388F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.7388F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, 1.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.7362F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, 1.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.4862F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, 0.25F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.4862F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.9862F, 0.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(63, 76)
						.addBox(-3.9898F, -3.0F, 1.8618F, 8.0F, 8.0F, 1.0F, new CubeDeformation(-3.0F)),
				PartPose.offset(-2.0112F, 0.6419F, -3.378F));
		PartDefinition cube_r2 = R.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(-4.95F)).mirror(false),
				PartPose.offsetAndRotation(0.0112F, 1.0F, 4.7118F, -3.1416F, 0.0F, 0.0F));
		PartDefinition RSign = R.addOrReplaceChild("RSign", CubeListBuilder.create(), PartPose.offset(-0.0013F, 0.0F, -0.1632F));
		PartDefinition cube_r3 = RSign.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 86).mirror().addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(-5.7F)).mirror(false),
				PartPose.offsetAndRotation(0.0125F, 1.05F, 5.7F, 3.1416F, 0.0F, 0.0F));
		PartDefinition L = Goggles.addOrReplaceChild("L",
				CubeListBuilder.create().texOffs(77, 71).addBox(-0.9888F, -0.025F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.9888F, 2.0F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F))
						.texOffs(77, 71).addBox(-1.0138F, 0.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.9888F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, 0.25F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.7388F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.7388F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, 1.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.7362F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, 1.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.4862F, 1.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, 0.25F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.4862F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, 0.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.9862F, 0.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(110, 77)
						.addBox(-0.9888F, 0.0F, 1.2868F, 1.975F, 2.0F, 0.05F, new CubeDeformation(0.0F)).texOffs(110, 77).addBox(-4.9888F, 0.0F, 1.2868F, 1.975F, 2.0F, 0.05F, new CubeDeformation(0.0F)).texOffs(63, 76)
						.addBox(-3.9898F, -3.0F, 1.8618F, 8.0F, 8.0F, 1.0F, new CubeDeformation(-3.0F)),
				PartPose.offset(1.9888F, 0.6419F, -3.378F));
		PartDefinition cube_r4 = L.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(-4.95F)).mirror(false),
				PartPose.offsetAndRotation(0.0112F, 1.0F, 4.7118F, -3.1416F, 0.0F, 0.0F));
		PartDefinition LSign = L.addOrReplaceChild("LSign", CubeListBuilder.create(), PartPose.offset(-0.0013F, 0.0F, -0.1632F));
		PartDefinition cube_r5 = LSign.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(64, 86).mirror().addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(-5.7F)).mirror(false),
				PartPose.offsetAndRotation(0.0125F, 1.05F, 5.7F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Muffs = Head.addOrReplaceChild("Muffs",
				CubeListBuilder.create().texOffs(14, 7).addBox(4.0053F, 0.2316F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(29, 10).addBox(4.0553F, 1.0316F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(37, 6)
						.addBox(4.0053F, -0.2684F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(26, 0).addBox(4.0053F, 0.2316F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.025F)).texOffs(29, 10)
						.addBox(-5.4947F, 1.0316F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(14, 7).addBox(-5.2947F, 0.2316F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(37, 6)
						.addBox(-4.7947F, -0.2684F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(26, 0).addBox(-4.7947F, 0.2316F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.025F)).texOffs(11, 54)
						.addBox(-4.3947F, -2.0184F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 54).addBox(-4.7697F, -2.5434F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(19, 54)
						.addBox(4.2303F, -2.5434F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(16, 54).addBox(-4.7947F, -2.4184F, 0.5F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 54)
						.addBox(-4.7947F, -2.4184F, -1.0F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 54).addBox(4.5053F, -2.4184F, -1.0F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 54)
						.addBox(4.5053F, -2.4184F, 0.5F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(11, 54).addBox(4.0053F, -2.0184F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 50)
						.addBox(-4.2447F, -2.1684F, -1.0F, 8.5F, 0.4F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 48).addBox(-4.6447F, -2.5684F, -1.0F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(20, 48)
						.addBox(-4.6447F, -2.5684F, 0.5F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0053F, -6.2316F, 0.0F));
		PartDefinition AngelHat = Head.addOrReplaceChild("AngelHat",
				CubeListBuilder.create().texOffs(88, 128).addBox(-9.0F, 2.0F, -8.975F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 128).addBox(-8.0F, 1.5F, -7.975F, 16.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 131)
						.addBox(-7.0F, 1.0F, -6.975F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 131).addBox(-6.0F, 0.5F, -5.975F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 131)
						.addBox(-4.0F, -0.5F, -3.975F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 134).addBox(-2.0F, -1.5F, -1.975F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.75F, -0.025F));
		PartDefinition cube_r6 = AngelHat.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 145).addBox(-3.0F, 0.5F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(86, 134)
						.addBox(-5.0F, 1.5F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(116, 134).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 131)
						.addBox(-4.0F, 1.0F, -4.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 131).addBox(-6.0F, 2.0F, -6.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 131)
						.addBox(-7.0F, 2.5F, -7.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 128).addBox(-8.0F, 3.0F, -8.0F, 16.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 128)
						.addBox(-9.0F, 3.5F, -9.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.5F, 0.025F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r7 = AngelHat.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(102, 131).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 131).addBox(-4.0F, 0.5F, -6.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 131)
						.addBox(-5.0F, 1.0F, -7.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 128).addBox(-6.0F, 1.5F, -8.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 128)
						.addBox(-7.0F, 2.0F, -9.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.025F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r8 = AngelHat.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(102, 131).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 131).addBox(-4.0F, 0.5F, -6.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 131)
						.addBox(-5.0F, 1.0F, -7.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 128).addBox(-6.0F, 1.5F, -8.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 128)
						.addBox(-7.0F, 2.0F, -9.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.025F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Chains = AngelHat.addOrReplaceChild("Chains", CubeListBuilder.create(), PartPose.offset(0.25F, 9.0F, 0.025F));
		PartDefinition L1 = Chains.addOrReplaceChild("L1", CubeListBuilder.create().texOffs(127, 125).addBox(-0.075F, -0.075F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offset(8.625F, -6.125F, -0.025F));
		PartDefinition L2 = L1.addOrReplaceChild("L2", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.125F, 0.275F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L3 = L2.addOrReplaceChild("L3", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L4 = L3.addOrReplaceChild("L4", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L5 = L4.addOrReplaceChild("L5", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L6 = L5.addOrReplaceChild("L6", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L7 = L6.addOrReplaceChild("L7", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L8 = L7.addOrReplaceChild("L8", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r9 = L8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.15F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition R1 = Chains.addOrReplaceChild("R1", CubeListBuilder.create().texOffs(127, 125).addBox(-0.325F, -0.075F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offset(-9.125F, -6.125F, -0.025F));
		PartDefinition R2 = R1.addOrReplaceChild("R2", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(-0.125F, 0.275F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R3 = R2.addOrReplaceChild("R3", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R4 = R3.addOrReplaceChild("R4", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R5 = R4.addOrReplaceChild("R5", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R6 = R5.addOrReplaceChild("R6", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R7 = R6.addOrReplaceChild("R7", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R8 = R7.addOrReplaceChild("R8", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r10 = R8.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.0F, 0.15F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 80).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(16, 96).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Hood = Body.addOrReplaceChild("Hood", CubeListBuilder.create().texOffs(1, 69).addBox(-4.2513F, -0.1224F, -3.3532F, 8.5F, 2.0F, 6.925F, new CubeDeformation(0.0F)).texOffs(15, 74)
				.addBox(-4.2513F, 1.3026F, -1.8532F, 8.5F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-4.5263F, -1.6224F, -4.4032F, 9.05F, 2.525F, 9.05F, new CubeDeformation(0.0F)), PartPose.offset(0.0013F, -0.3776F, 1.3782F));
		PartDefinition cube_r11 = Hood.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 73).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0013F, 1.8091F, 2.726F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r12 = Hood.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(5, 71).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0013F, 1.8091F, -2.499F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r13 = Hood.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0078F, -1.7633F, 3.7968F, 1.5708F, -0.7854F, -1.5708F));
		PartDefinition cube_r14 = Hood.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0078F, -1.7633F, -3.5532F, 1.5708F, 0.7854F, -1.5708F));
		PartDefinition cube_r15 = Hood.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6672F, -1.7633F, 0.1218F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r16 = Hood.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6578F, -1.7633F, 0.1218F, 0.0F, 0.0F, -0.7854F));
		PartDefinition Roughian = Body.addOrReplaceChild("Roughian", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.0F, 6.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition RoughianBody = Roughian.addOrReplaceChild("RoughianBody",
				CubeListBuilder.create().texOffs(80, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 32).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -0.7F, -1.3F));
		PartDefinition RoughianLeftArm = Roughian.addOrReplaceChild("RoughianLeftArm", CubeListBuilder.create(), PartPose.offset(7.0F, -1.0F, -0.3F));
		PartDefinition LeftArmLayer_r1 = RoughianLeftArm.addOrReplaceChild("LeftArmLayer_r1",
				CubeListBuilder.create().texOffs(112, 48).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(96, 48).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, -0.2618F));
		PartDefinition RoughianRightArm = Roughian.addOrReplaceChild("RoughianRightArm", CubeListBuilder.create(), PartPose.offset(-7.0F, -1.0F, -0.3F));
		PartDefinition RightArmLayer_r1 = RoughianRightArm.addOrReplaceChild("RightArmLayer_r1",
				CubeListBuilder.create().texOffs(104, 32).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(104, 16).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.2618F));
		PartDefinition RoughianLeftLeg = Roughian.addOrReplaceChild("RoughianLeftLeg", CubeListBuilder.create(), PartPose.offset(3.0F, 11.0F, -1.3F));
		PartDefinition LeftLegLayer_r1 = RoughianLeftLeg.addOrReplaceChild("LeftLegLayer_r1",
				CubeListBuilder.create().texOffs(64, 48).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(80, 48).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition RoughianRightLeg = Roughian.addOrReplaceChild("RoughianRightLeg", CubeListBuilder.create(), PartPose.offset(-3.0F, 11.0F, -1.3F));
		PartDefinition RightLegLayer_r1 = RoughianRightLeg.addOrReplaceChild("RightLegLayer_r1",
				CubeListBuilder.create().texOffs(64, 32).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(64, 16).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition Scarf = Body.addOrReplaceChild("Scarf",
				CubeListBuilder.create().texOffs(5, 135).addBox(-4.275F, -1.0F, -4.125F, 8.55F, 1.0F, 8.55F, new CubeDeformation(0.0F)).texOffs(5, 135).addBox(-4.25F, -0.5F, -3.475F, 8.5F, 2.0F, 6.925F, new CubeDeformation(0.05F)).texOffs(5, 135)
						.addBox(-4.25F, 1.325F, -1.575F, 8.5F, 2.0F, 3.0F, new CubeDeformation(0.05F)).texOffs(5, 135).addBox(-4.525F, -1.6F, -4.525F, 9.05F, 2.125F, 9.05F, new CubeDeformation(0.05F)).texOffs(5, 135)
						.addBox(-3.525F, -2.6F, -3.525F, 7.05F, 0.025F, 7.05F, new CubeDeformation(0.05F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r17 = Scarf.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(5, 135).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, 2.6042F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r18 = Scarf.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(5, 135).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, -2.6208F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r19 = Scarf.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(5, 135).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0091F, -1.7409F, 3.675F, 1.5708F, -0.7854F, -1.5708F));
		PartDefinition cube_r20 = Scarf.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(5, 135).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0091F, -1.7409F, -3.675F, 1.5708F, 0.7854F, -1.5708F));
		PartDefinition cube_r21 = Scarf.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(5, 135).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-3.6659F, -1.7409F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r22 = Scarf.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(5, 135).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(3.6591F, -1.7409F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition RightScarf = Scarf.addOrReplaceChild("RightScarf", CubeListBuilder.create().texOffs(0, 4).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -1.4F, 4.5625F, 0.5236F, -0.0873F, 0.0873F));
		PartDefinition RightScarf2 = RightScarf.addOrReplaceChild("RightScarf2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, 0.0436F));
		PartDefinition RightScarf3 = RightScarf2.addOrReplaceChild("RightScarf3", CubeListBuilder.create().texOffs(0, 4).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, 0.0436F));
		PartDefinition RightScarf4 = RightScarf3.addOrReplaceChild("RightScarf4", CubeListBuilder.create().texOffs(0, 4).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0873F, 0.0F, 0.0436F));
		PartDefinition RightScarf5 = RightScarf4.addOrReplaceChild("RightScarf5", CubeListBuilder.create().texOffs(0, 4).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));
		PartDefinition RightScarf6 = RightScarf5.addOrReplaceChild("RightScarf6", CubeListBuilder.create().texOffs(0, 4).addBox(-1.775F, -0.1F, -0.1625F, 3.55F, 2.5F, 0.325F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));
		PartDefinition RightScarf7 = RightScarf6.addOrReplaceChild("RightScarf7", CubeListBuilder.create().texOffs(0, 4).addBox(-1.875F, -0.1F, -0.1625F, 3.75F, 2.5F, 0.325F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));
		PartDefinition RightScarf8 = RightScarf7.addOrReplaceChild("RightScarf8", CubeListBuilder.create().texOffs(0, 4).addBox(-1.975F, -0.1F, -0.1625F, 3.95F, 2.5F, 0.325F, new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));
		PartDefinition RightScarf9 = RightScarf8.addOrReplaceChild("RightScarf9",
				CubeListBuilder.create().texOffs(0, 4).addBox(-0.5747F, 0.9923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-0.5747F, 1.8923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));
		PartDefinition cube_r23 = RightScarf9.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.9811F, 0.4047F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4).addBox(-1.9784F, -0.4922F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r24 = RightScarf9.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 4).addBox(1.1265F, 0.4239F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4).addBox(1.1239F, -0.473F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r25 = RightScarf9.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 4).addBox(-3.5292F, 0.774F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4).addBox(-3.5043F, -0.1144F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r26 = RightScarf9.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 4).addBox(2.7168F, 0.8332F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4).addBox(2.6919F, -0.0553F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.3054F));
		PartDefinition LeftScarf = Scarf.addOrReplaceChild("LeftScarf", CubeListBuilder.create().texOffs(0, 4).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -1.4F, 4.5625F, 0.5236F, 0.0873F, -0.0873F));
		PartDefinition LeftScarf2 = LeftScarf.addOrReplaceChild("LeftScarf2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, -0.0436F));
		PartDefinition LeftScarf3 = LeftScarf2.addOrReplaceChild("LeftScarf3", CubeListBuilder.create().texOffs(0, 4).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, -0.0436F));
		PartDefinition LeftScarf4 = LeftScarf3.addOrReplaceChild("LeftScarf4", CubeListBuilder.create().texOffs(0, 4).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0873F, 0.0F, -0.0436F));
		PartDefinition LeftScarf5 = LeftScarf4.addOrReplaceChild("LeftScarf5", CubeListBuilder.create().texOffs(0, 4).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));
		PartDefinition LeftScarf6 = LeftScarf5.addOrReplaceChild("LeftScarf6", CubeListBuilder.create().texOffs(0, 4).addBox(-1.775F, -0.1F, -0.1625F, 3.55F, 2.5F, 0.325F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));
		PartDefinition LeftScarf7 = LeftScarf6.addOrReplaceChild("LeftScarf7", CubeListBuilder.create().texOffs(0, 4).addBox(-1.875F, -0.1F, -0.1625F, 3.75F, 2.5F, 0.325F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));
		PartDefinition LeftScarf8 = LeftScarf7.addOrReplaceChild("LeftScarf8", CubeListBuilder.create().texOffs(0, 4).addBox(-1.975F, -0.1F, -0.1625F, 3.95F, 2.5F, 0.325F, new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));
		PartDefinition LeftScarf9 = LeftScarf8.addOrReplaceChild("LeftScarf9",
				CubeListBuilder.create().texOffs(0, 4).addBox(-0.5748F, 0.9923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-0.5748F, 1.8923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));
		PartDefinition cube_r27 = LeftScarf9.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.9811F, 0.4047F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4).addBox(-1.9784F, -0.4922F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r28 = LeftScarf9.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(0, 4).addBox(1.1265F, 0.4239F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4).addBox(1.1239F, -0.473F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r29 = LeftScarf9.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(0, 4).addBox(-3.5292F, 0.774F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4).addBox(-3.5043F, -0.1144F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r30 = LeftScarf9.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(0, 4).addBox(2.7168F, 0.8332F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 4).addBox(2.6919F, -0.0553F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.3054F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 112).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(71, 103)
				.addBox(-1.0F, 7.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.675F)).texOffs(48, 112).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 80).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(40, 96)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)).texOffs(71, 110).addBox(-3.0F, 7.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.675F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 112).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(0, 112).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 80).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(0, 96).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
				CubeListBuilder.create().texOffs(104, 103).addBox(-1.9F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)).texOffs(88, 103).addBox(-1.9F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.2F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
				CubeListBuilder.create().texOffs(104, 112).addBox(-2.1F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)).texOffs(88, 112).addBox(-2.1F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.2F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 176);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}