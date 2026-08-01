package engiegames.engieschaos.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelchampsleep<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("engies_chaos", "modelchampsleep"), "main");
	public final ModelPart Champ;
	public final ModelPart Body;
	public final ModelPart tail;
	public final ModelPart base;
	public final ModelPart base2;
	public final ModelPart mid1;
	public final ModelPart mid1a;
	public final ModelPart mid2;
	public final ModelPart mid2a;
	public final ModelPart tip;
	public final ModelPart tip2;
	public final ModelPart Collar;
	public final ModelPart Bell;
	public final ModelPart Head;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart RightFrontLeg;
	public final ModelPart RightFrontUpperLeg;
	public final ModelPart RightFrontMidLeg;
	public final ModelPart RightFrontLowerLeg;
	public final ModelPart RightFrontFoot;
	public final ModelPart LeftFrontLeg;
	public final ModelPart LeftFrontUpperLeg;
	public final ModelPart LeftFrontMidLeg;
	public final ModelPart LeftFrontLowerLeg;
	public final ModelPart LeftFrontFoot;
	public final ModelPart RightBackLeg;
	public final ModelPart LeftBackUpperLeg2;
	public final ModelPart LeftBackMidLeg2;
	public final ModelPart LeftBackLowerLeg2;
	public final ModelPart LeftBackFoot2;
	public final ModelPart LeftBackLeg;
	public final ModelPart LeftBackUpperLeg;
	public final ModelPart LeftBackMidLeg;
	public final ModelPart LeftBackLowerLeg;
	public final ModelPart LeftBackFoot;

	public Modelchampsleep(ModelPart root) {
		this.Champ = root.getChild("Champ");
		this.Body = this.Champ.getChild("Body");
		this.tail = this.Body.getChild("tail");
		this.base = this.tail.getChild("base");
		this.base2 = this.base.getChild("base2");
		this.mid1 = this.base2.getChild("mid1");
		this.mid1a = this.mid1.getChild("mid1a");
		this.mid2 = this.mid1a.getChild("mid2");
		this.mid2a = this.mid2.getChild("mid2a");
		this.tip = this.mid2a.getChild("tip");
		this.tip2 = this.tip.getChild("tip2");
		this.Collar = this.Body.getChild("Collar");
		this.Bell = this.Collar.getChild("Bell");
		this.Head = this.Champ.getChild("Head");
		this.bone = this.Head.getChild("bone");
		this.bone2 = this.Head.getChild("bone2");
		this.RightFrontLeg = this.Champ.getChild("RightFrontLeg");
		this.RightFrontUpperLeg = this.RightFrontLeg.getChild("RightFrontUpperLeg");
		this.RightFrontMidLeg = this.RightFrontUpperLeg.getChild("RightFrontMidLeg");
		this.RightFrontLowerLeg = this.RightFrontMidLeg.getChild("RightFrontLowerLeg");
		this.RightFrontFoot = this.RightFrontLowerLeg.getChild("RightFrontFoot");
		this.LeftFrontLeg = this.Champ.getChild("LeftFrontLeg");
		this.LeftFrontUpperLeg = this.LeftFrontLeg.getChild("LeftFrontUpperLeg");
		this.LeftFrontMidLeg = this.LeftFrontUpperLeg.getChild("LeftFrontMidLeg");
		this.LeftFrontLowerLeg = this.LeftFrontMidLeg.getChild("LeftFrontLowerLeg");
		this.LeftFrontFoot = this.LeftFrontLowerLeg.getChild("LeftFrontFoot");
		this.RightBackLeg = this.Champ.getChild("RightBackLeg");
		this.LeftBackUpperLeg2 = this.RightBackLeg.getChild("LeftBackUpperLeg2");
		this.LeftBackMidLeg2 = this.LeftBackUpperLeg2.getChild("LeftBackMidLeg2");
		this.LeftBackLowerLeg2 = this.LeftBackMidLeg2.getChild("LeftBackLowerLeg2");
		this.LeftBackFoot2 = this.LeftBackLowerLeg2.getChild("LeftBackFoot2");
		this.LeftBackLeg = this.Champ.getChild("LeftBackLeg");
		this.LeftBackUpperLeg = this.LeftBackLeg.getChild("LeftBackUpperLeg");
		this.LeftBackMidLeg = this.LeftBackUpperLeg.getChild("LeftBackMidLeg");
		this.LeftBackLowerLeg = this.LeftBackMidLeg.getChild("LeftBackLowerLeg");
		this.LeftBackFoot = this.LeftBackLowerLeg.getChild("LeftBackFoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Champ = partdefinition.addOrReplaceChild("Champ", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, 20.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition Body = Champ.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 28).addBox(-5.0F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(33, 72).addBox(-5.0F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(-0.1F, -13.0F, 2.475F, 1.5708F, 0.0F, 0.0F));
		PartDefinition BackFin_r1 = Body.addOrReplaceChild("BackFin_r1", CubeListBuilder.create().texOffs(107, 52).addBox(-1.0F, 0.9753F, 2.2318F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition BackFin_r2 = Body.addOrReplaceChild("BackFin_r2", CubeListBuilder.create().texOffs(97, 50).addBox(-1.0F, -1.9066F, 3.7227F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 25.0F, -20.5F, -1.5708F, 0.0F, 0.0F));
		PartDefinition base = tail.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.85F, -22.95F, -0.3491F, 0.0F, 0.0F));
		PartDefinition base2 = base.addOrReplaceChild("base2",
				CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.05F)).texOffs(112, 81).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.2441F, 0.1654F, -0.5146F));
		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1", CubeListBuilder.create().texOffs(92, 32).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -2.9571F, 3.7604F, -0.7854F, 0.0F, 0.0F));
		PartDefinition mid1 = base2.addOrReplaceChild("mid1", CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0616F, 0.0756F, -0.2224F));
		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a", CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0209F, -0.0267F, -0.3918F));
		PartDefinition sidefin_r1 = mid1a.addOrReplaceChild("sidefin_r1", CubeListBuilder.create().texOffs(93, 45).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7409F, 1.8339F, 2.433F, 0.0246F, 0.5108F, -0.2081F));
		PartDefinition sidefin_r2 = mid1a.addOrReplaceChild("sidefin_r2", CubeListBuilder.create().texOffs(92, 40).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7409F, 1.8339F, 2.433F, 0.0246F, -0.5108F, 0.2081F));
		PartDefinition mid2 = mid1a.addOrReplaceChild("mid2", CubeListBuilder.create().texOffs(114, 42).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0021F, -0.0189F, -0.2174F));
		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a", CubeListBuilder.create().texOffs(114, 42).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1084F, -0.2603F, -0.028F));
		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2", CubeListBuilder.create().texOffs(94, 16).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.5821F, 2.3033F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tip = mid2a.addOrReplaceChild("tip", CubeListBuilder.create().texOffs(118, 50).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1485F, -0.4293F, -0.0808F));
		PartDefinition tip2 = tip.addOrReplaceChild("tip2", CubeListBuilder.create().texOffs(116, 57).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1571F, 0.0F, 0.0F));
		PartDefinition shark_r1 = tip2.addOrReplaceChild("shark_r1", CubeListBuilder.create().texOffs(90, 22).addBox(-0.5F, -2.0F, -4.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.1188F, 2.0963F, 2.6376F, -0.7854F, 0.0F, 0.0F));
		PartDefinition shark_r2 = tip2.addOrReplaceChild("shark_r2", CubeListBuilder.create().texOffs(79, 25).addBox(-0.5F, -3.5F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.8857F, 3.7071F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Collar = Body.addOrReplaceChild("Collar", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -10.5502F, -0.4671F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Collar.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(124, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.05F)).texOffs(124, 113).addBox(8.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-4.5F, -1.9498F, 0.3421F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Collar.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(106, 111).addBox(-5.0F, 0.5F, -0.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.0252F, -0.1829F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Collar.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(106, 111).addBox(-5.0F, -0.5F, -0.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, -2.0498F, 0.3671F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Bell = Collar.addOrReplaceChild("Bell",
				CubeListBuilder.create().texOffs(122, 126).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)).texOffs(122, 121).addBox(-1.0F, 0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.9752F, -0.2579F));
		PartDefinition cube_r4 = Bell.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(122, 126).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 3.1416F));
		PartDefinition cube_r5 = Bell.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(122, 126).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(-1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r6 = Bell.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(122, 126).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition Head = Champ.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(36, 39).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 55).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(56, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(64, 55).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 52)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 68).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(0, 12)
						.addBox(-2.1F, -1.5F, -10.025F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).texOffs(0, 16).addBox(-2.1F, 0.0F, -9.775F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).texOffs(0, 0)
						.addBox(-5.0F, -6.0F, -9.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.05F)).texOffs(2, 0).addBox(3.5F, -6.5F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-5.5F, -6.5F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 2).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(3, 2)
						.addBox(-4.0F, -7.65F, -7.9F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(6, 4).addBox(-3.0F, -8.95F, -6.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 4)
						.addBox(-3.0F, -7.8F, -6.7F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.5F)).texOffs(9, 6).addBox(-2.0F, -8.85F, -5.3F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(9, 6)
						.addBox(-2.0F, -9.65F, -5.1F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(-1.0F, -9.55F, -3.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(12, 8)
						.addBox(-1.0F, -10.45F, -3.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 10).addBox(0.0F, -10.1F, -3.4F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, -5.525F));
		PartDefinition Snout_r1 = Head.addOrReplaceChild("Snout_r1", CubeListBuilder.create().texOffs(22, 12).addBox(0.0F, 1.01F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, -1.01F, -9.775F, 0.0F, -0.4625F, 0.0F));
		PartDefinition Snout_r2 = Head.addOrReplaceChild("Snout_r2", CubeListBuilder.create().texOffs(22, 12).addBox(-2.0F, 1.01F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -1.01F, -9.775F, 0.0F, 0.4625F, 0.0F));
		PartDefinition Snout_r3 = Head.addOrReplaceChild("Snout_r3", CubeListBuilder.create().texOffs(12, 12).addBox(0.0F, 0.01F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, -1.51F, -10.025F, 0.0F, -0.4625F, 0.0F));
		PartDefinition Snout_r4 = Head.addOrReplaceChild("Snout_r4", CubeListBuilder.create().texOffs(12, 12).addBox(-2.0F, 0.01F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -1.51F, -10.025F, 0.0F, 0.4625F, 0.0F));
		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1", CubeListBuilder.create().texOffs(88, 5).addBox(-0.25F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, -3.0F, 1.0263F, -0.733F, -0.9599F));
		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2", CubeListBuilder.create().texOffs(88, 10).addBox(-0.25F, -2.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, -3.0F, -1.0263F, -0.733F, -2.1817F));
		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -3.9429F, -4.25F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(1, 8).addBox(-3.3284F, 2.3284F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(-2.6213F, 1.6213F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(-1.9142F, 0.9142F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(-1.2071F, 0.2071F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(-0.5F, -0.5F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(0.2071F, -1.2071F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(0.9142F, -1.9142F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(1.6213F, -2.6213F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(2.3284F, -3.3284F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(-3.3284F, 2.3284F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(-2.6213F, 1.6213F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(-1.9142F, 0.9142F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(-1.2071F, 0.2071F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(-0.5F, -0.5F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(0.2071F, -1.2071F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(0.9142F, -1.9142F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(1.6213F, -2.6213F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(2.3284F, -3.3284F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone2 = Head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.9429F, -4.25F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(1, 8).addBox(-3.3284F, 2.3284F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(-2.6213F, 1.6213F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(-1.9142F, 0.9142F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(-1.2071F, 0.2071F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(-0.5F, -0.5F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(0.2071F, -1.2071F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(0.9142F, -1.9142F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(1.6213F, -2.6213F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(2.3284F, -3.3284F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(-3.3284F, 2.3284F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(-2.6213F, 1.6213F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(-1.9142F, 0.9142F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(-1.2071F, 0.2071F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(-0.5F, -0.5F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(0.2071F, -1.2071F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(0.9142F, -1.9142F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(1.6213F, -2.6213F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8).addBox(2.3284F, -3.3284F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition RightFrontLeg = Champ.addOrReplaceChild("RightFrontLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, -7.0F, -6.225F, 0.2616F, 0.0113F, -0.3912F));
		PartDefinition RightFrontUpperLeg = RightFrontLeg.addOrReplaceChild("RightFrontUpperLeg", CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));
		PartDefinition UpperLeg_r1 = RightFrontUpperLeg.addOrReplaceChild("UpperLeg_r1",
				CubeListBuilder.create().texOffs(99, 59).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.111F)).texOffs(112, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));
		PartDefinition RightFrontMidLeg = RightFrontUpperLeg.addOrReplaceChild("RightFrontMidLeg", CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));
		PartDefinition MidLeg_r1 = RightFrontMidLeg.addOrReplaceChild("MidLeg_r1",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.11F)).texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition RightFrontLowerLeg = RightFrontMidLeg.addOrReplaceChild("RightFrontLowerLeg", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));
		PartDefinition LowerLeg_r1 = RightFrontLowerLeg.addOrReplaceChild("LowerLeg_r1",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.1091F)).texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));
		PartDefinition RightFrontFoot = RightFrontLowerLeg.addOrReplaceChild("RightFrontFoot",
				CubeListBuilder.create().texOffs(99, 22).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 39).addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39).addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));
		PartDefinition Toe_r1 = RightFrontFoot.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftFrontLeg = Champ.addOrReplaceChild("LeftFrontLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, -7.0F, -6.225F, -0.2618F, 0.0F, 0.0F));
		PartDefinition LeftFrontUpperLeg = LeftFrontLeg.addOrReplaceChild("LeftFrontUpperLeg", CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));
		PartDefinition UpperLeg_r2 = LeftFrontUpperLeg.addOrReplaceChild("UpperLeg_r2",
				CubeListBuilder.create().texOffs(99, 59).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.111F)).texOffs(112, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));
		PartDefinition LeftFrontMidLeg = LeftFrontUpperLeg.addOrReplaceChild("LeftFrontMidLeg", CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));
		PartDefinition MidLeg_r2 = LeftFrontMidLeg.addOrReplaceChild("MidLeg_r2",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.11F)).texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition LeftFrontLowerLeg = LeftFrontMidLeg.addOrReplaceChild("LeftFrontLowerLeg", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));
		PartDefinition LowerLeg_r2 = LeftFrontLowerLeg.addOrReplaceChild("LowerLeg_r2",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.1091F)).texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));
		PartDefinition LeftFrontFoot = LeftFrontLowerLeg.addOrReplaceChild("LeftFrontFoot",
				CubeListBuilder.create().texOffs(99, 22).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 39).addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39).addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));
		PartDefinition Toe_r2 = LeftFrontFoot.addOrReplaceChild("Toe_r2",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));
		PartDefinition RightBackLeg = Champ.addOrReplaceChild("RightBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, -7.0F, 5.775F, 0.3924F, 0.0167F, -0.3021F));
		PartDefinition LeftBackUpperLeg2 = RightBackLeg.addOrReplaceChild("LeftBackUpperLeg2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));
		PartDefinition UpperLeg_r3 = LeftBackUpperLeg2.addOrReplaceChild("UpperLeg_r3",
				CubeListBuilder.create().texOffs(99, 59).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.111F)).texOffs(112, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));
		PartDefinition LeftBackMidLeg2 = LeftBackUpperLeg2.addOrReplaceChild("LeftBackMidLeg2", CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));
		PartDefinition MidLeg_r3 = LeftBackMidLeg2.addOrReplaceChild("MidLeg_r3",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.11F)).texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition LeftBackLowerLeg2 = LeftBackMidLeg2.addOrReplaceChild("LeftBackLowerLeg2", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));
		PartDefinition LowerLeg_r3 = LeftBackLowerLeg2.addOrReplaceChild("LowerLeg_r3",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.1091F)).texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));
		PartDefinition LeftBackFoot2 = LeftBackLowerLeg2.addOrReplaceChild("LeftBackFoot2",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 36).addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36).addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));
		PartDefinition Toe_r3 = LeftBackFoot2.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftBackLeg = Champ.addOrReplaceChild("LeftBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, -7.0F, 5.775F, -0.1745F, 0.0F, 0.0F));
		PartDefinition LeftBackUpperLeg = LeftBackLeg.addOrReplaceChild("LeftBackUpperLeg", CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));
		PartDefinition UpperLeg_r4 = LeftBackUpperLeg.addOrReplaceChild("UpperLeg_r4",
				CubeListBuilder.create().texOffs(99, 59).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.111F)).texOffs(112, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));
		PartDefinition LeftBackMidLeg = LeftBackUpperLeg.addOrReplaceChild("LeftBackMidLeg", CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));
		PartDefinition MidLeg_r4 = LeftBackMidLeg.addOrReplaceChild("MidLeg_r4",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.11F)).texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition LeftBackLowerLeg = LeftBackMidLeg.addOrReplaceChild("LeftBackLowerLeg", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));
		PartDefinition LowerLeg_r4 = LeftBackLowerLeg.addOrReplaceChild("LowerLeg_r4",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.1091F)).texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));
		PartDefinition LeftBackFoot = LeftBackLowerLeg.addOrReplaceChild("LeftBackFoot",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 36).addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36).addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));
		PartDefinition Toe_r4 = LeftBackFoot.addOrReplaceChild("Toe_r4",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Champ.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}