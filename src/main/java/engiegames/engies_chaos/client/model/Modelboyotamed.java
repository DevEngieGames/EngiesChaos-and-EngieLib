package engiegames.engies_chaos.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelboyotamed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("engies_chaos", "modelboyotamed"), "main");
	public final ModelPart Head;
	public final ModelPart Hat;
	public final ModelPart Ear1;
	public final ModelPart Ear2;
	public final ModelPart TobyWhiskers;
	public final ModelPart Snout;
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
	public final ModelPart Fin;
	public final ModelPart Collar;
	public final ModelPart Bell;
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
	public final ModelPart RightBackUpperLeg;
	public final ModelPart RightBackMidLeg;
	public final ModelPart RightBackLowerLeg;
	public final ModelPart RightBackFoot;
	public final ModelPart LeftBackLeg;
	public final ModelPart LeftBackUpperLeg;
	public final ModelPart LeftBackMidLeg;
	public final ModelPart LeftBackLowerLeg;
	public final ModelPart LeftBackFoot;

	public Modelboyotamed(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Hat = this.Head.getChild("Hat");
		this.Ear1 = this.Head.getChild("Ear1");
		this.Ear2 = this.Head.getChild("Ear2");
		this.TobyWhiskers = this.Head.getChild("TobyWhiskers");
		this.Snout = this.Head.getChild("Snout");
		this.Body = root.getChild("Body");
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
		this.RightBackLeg = root.getChild("RightBackLeg");
		this.RightBackUpperLeg = this.RightBackLeg.getChild("RightBackUpperLeg");
		this.RightBackMidLeg = this.RightBackUpperLeg.getChild("RightBackMidLeg");
		this.RightBackLowerLeg = this.RightBackMidLeg.getChild("RightBackLowerLeg");
		this.RightBackFoot = this.RightBackLowerLeg.getChild("RightBackFoot");
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
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(64, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(64, 0).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(32, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(64, 0).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 12.0F, -5.525F));
		PartDefinition Hat = Head
				.addOrReplaceChild(
						"Hat", CubeListBuilder.create().texOffs(0, 59).addBox(-7.0F, 0.6176F, -7.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(-6.0F, 0.1176F, -6.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(0, 65).addBox(-4.0F, -0.8824F, -4.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-2.0F, -1.8824F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -5.8426F, -4.0F));
		PartDefinition cube_r1 = Hat.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 71).addBox(-3.0F, 0.5F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-5.0F, 1.5F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-4.0F, 1.0F, -4.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(-6.0F, 2.0F, -6.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-7.0F, 2.5F, -7.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.8824F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r2 = Hat.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 65).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
				.addBox(-4.0F, 0.5F, -6.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 59).addBox(-5.0F, 1.0F, -7.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3824F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r3 = Hat.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 65).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
				.addBox(-4.0F, 0.5F, -6.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 59).addBox(-5.0F, 1.0F, -7.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3824F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Ear1 = Head.addOrReplaceChild("Ear1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4668F, -7.25F, -1.681F, -0.9163F, 0.4363F, 0.0F));
		PartDefinition cube_r4 = Ear1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 31).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.4875F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r5 = Ear1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 31).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.4875F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5332F, -7.25F, -1.681F, -0.9163F, -0.4363F, 0.0F));
		PartDefinition cube_r6 = Ear2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 31).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.4875F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r7 = Ear2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 31).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.4875F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition TobyWhiskers = Head.addOrReplaceChild("TobyWhiskers", CubeListBuilder.create(), PartPose.offset(3.0F, -0.5F, -8.0F));
		PartDefinition TobyWhisker_r1 = TobyWhiskers.addOrReplaceChild("TobyWhisker_r1", CubeListBuilder.create().texOffs(71, 35).addBox(-2.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition TobyWhisker_r2 = TobyWhiskers.addOrReplaceChild("TobyWhisker_r2", CubeListBuilder.create().texOffs(71, 38).addBox(0.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition Snout = Head.addOrReplaceChild("Snout",
				CubeListBuilder.create().texOffs(36, 39).addBox(-4.0F, 0.01F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).texOffs(36, 43).addBox(-4.0F, 1.51F, 0.25F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)),
				PartPose.offset(1.9F, -1.51F, -10.025F));
		PartDefinition Whisker_r1 = Snout.addOrReplaceChild("Whisker_r1", CubeListBuilder.create().texOffs(54, 34).addBox(0.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.05F, 1.01F, 0.975F, 0.0F, 0.2618F, 0.0F));
		PartDefinition Whisker_r2 = Snout.addOrReplaceChild("Whisker_r2", CubeListBuilder.create().texOffs(54, 31).addBox(-2.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.05F, 1.01F, 1.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition Snout_r1 = Snout.addOrReplaceChild("Snout_r1", CubeListBuilder.create().texOffs(58, 39).addBox(0.0F, 1.01F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.5F, 0.25F, 0.0F, -0.4625F, 0.0F));
		PartDefinition Snout_r2 = Snout.addOrReplaceChild("Snout_r2", CubeListBuilder.create().texOffs(58, 39).addBox(-2.0F, 1.01F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 0.25F, 0.0F, 0.4625F, 0.0F));
		PartDefinition Snout_r3 = Snout.addOrReplaceChild("Snout_r3", CubeListBuilder.create().texOffs(48, 39).addBox(0.0F, 0.01F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.4625F, 0.0F));
		PartDefinition Snout_r4 = Snout.addOrReplaceChild("Snout_r4", CubeListBuilder.create().texOffs(48, 39).addBox(-2.0F, 0.01F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4625F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16).addBox(-5.1F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(60, 72).addBox(-5.1F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.275F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 2.475F, 1.5708F, 0.0F, 0.0F));
		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.15F, 2.05F, -0.65F, -1.6581F, 0.0F, 0.0F));
		PartDefinition base = tail.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition base2 = base.addOrReplaceChild("base2",
				CubeListBuilder.create().texOffs(68, 16).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.05F)).texOffs(80, 44).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1047F, 0.0F, 0.0F));
		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1", CubeListBuilder.create().texOffs(84, 16).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -2.9571F, 3.7604F, -0.7854F, 0.0F, 0.0F));
		PartDefinition mid1 = base2.addOrReplaceChild("mid1", CubeListBuilder.create().texOffs(68, 16).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0873F, 0.0F, 0.0F));
		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a", CubeListBuilder.create().texOffs(68, 16).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1047F, 0.0F, 0.0F));
		PartDefinition sidefin_r1 = mid1a.addOrReplaceChild("sidefin_r1", CubeListBuilder.create().texOffs(84, 24).mirror().addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.7409F, 1.8339F, 2.433F, 0.0246F, 0.5108F, -0.2081F));
		PartDefinition sidefin_r2 = mid1a.addOrReplaceChild("sidefin_r2", CubeListBuilder.create().texOffs(84, 24).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7409F, 1.8339F, 2.433F, 0.0246F, -0.5108F, 0.2081F));
		PartDefinition mid2 = mid1a.addOrReplaceChild("mid2", CubeListBuilder.create().texOffs(69, 24).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0873F, 0.0F, 0.0F));
		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a", CubeListBuilder.create().texOffs(69, 24).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1047F, 0.0F, 0.0F));
		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2", CubeListBuilder.create().texOffs(90, 38).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.5821F, 2.3033F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tip = mid2a.addOrReplaceChild("tip", CubeListBuilder.create().texOffs(85, 28).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1309F, 0.0F, 0.0F));
		PartDefinition tip2 = tip.addOrReplaceChild("tip2", CubeListBuilder.create().texOffs(86, 33).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0262F, 0.0F, 0.0F));
		PartDefinition shark_r1 = tip2.addOrReplaceChild("shark_r1", CubeListBuilder.create().texOffs(61, 25).addBox(-0.5F, -2.0F, -4.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.1187F, 2.0963F, 2.6376F, -0.7854F, 0.0F, 0.0F));
		PartDefinition shark_r2 = tip2.addOrReplaceChild("shark_r2", CubeListBuilder.create().texOffs(75, 31).addBox(-0.5F, -3.5F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.8857F, 3.7071F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Fin = Body.addOrReplaceChild("Fin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1019F, -2.275F, 2.3786F, -2.618F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Fin.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 31).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.4875F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r9 = Fin.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(44, 31).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.4875F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition Collar = Body.addOrReplaceChild("Collar", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.5502F, -0.4671F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r10 = Collar.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.05F)).texOffs(0, 42).addBox(8.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-4.5F, -1.9498F, 0.3421F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r11 = Collar.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 40).addBox(-5.0F, 0.5F, -0.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.0252F, -0.1829F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r12 = Collar.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 40).addBox(-5.0F, -0.5F, -0.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, -2.0498F, 0.3671F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Bell = Collar.addOrReplaceChild("Bell",
				CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)).texOffs(28, 40).addBox(-1.0F, 0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.9752F, -0.2579F));
		PartDefinition cube_r13 = Bell.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 3.1416F));
		PartDefinition cube_r14 = Bell.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(-1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r15 = Bell.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 40).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition RightFrontLeg = partdefinition.addOrReplaceChild("RightFrontLeg", CubeListBuilder.create(), PartPose.offset(-3.1F, 17.0F, -6.225F));
		PartDefinition RightFrontUpperLeg = RightFrontLeg.addOrReplaceChild("RightFrontUpperLeg", CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));
		PartDefinition UpperLegLayer_r1 = RightFrontUpperLeg.addOrReplaceChild("UpperLegLayer_r1",
				CubeListBuilder.create().texOffs(0, 87).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.261F)).texOffs(36, 16).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));
		PartDefinition RightFrontMidLeg = RightFrontUpperLeg.addOrReplaceChild("RightFrontMidLeg", CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));
		PartDefinition MidLeg_r1 = RightFrontMidLeg.addOrReplaceChild("MidLeg_r1", CubeListBuilder.create().texOffs(52, 16).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition RightFrontLowerLeg = RightFrontMidLeg.addOrReplaceChild("RightFrontLowerLeg", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));
		PartDefinition LowerLeg_r1 = RightFrontLowerLeg.addOrReplaceChild("LowerLeg_r1", CubeListBuilder.create().texOffs(36, 25).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));
		PartDefinition RightFrontFoot = RightFrontLowerLeg.addOrReplaceChild("RightFrontFoot",
				CubeListBuilder.create().texOffs(50, 24).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(0, 6).addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6).addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));
		PartDefinition Toe_r1 = RightFrontFoot.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftFrontLeg = partdefinition.addOrReplaceChild("LeftFrontLeg", CubeListBuilder.create(), PartPose.offset(2.9F, 17.0F, -6.225F));
		PartDefinition LeftFrontUpperLeg = LeftFrontLeg.addOrReplaceChild("LeftFrontUpperLeg", CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));
		PartDefinition UpperLegLayer_r2 = LeftFrontUpperLeg.addOrReplaceChild("UpperLegLayer_r2",
				CubeListBuilder.create().texOffs(0, 87).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.261F)).texOffs(36, 16).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));
		PartDefinition LeftFrontMidLeg = LeftFrontUpperLeg.addOrReplaceChild("LeftFrontMidLeg", CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));
		PartDefinition MidLeg_r2 = LeftFrontMidLeg.addOrReplaceChild("MidLeg_r2", CubeListBuilder.create().texOffs(52, 16).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition LeftFrontLowerLeg = LeftFrontMidLeg.addOrReplaceChild("LeftFrontLowerLeg", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));
		PartDefinition LowerLeg_r2 = LeftFrontLowerLeg.addOrReplaceChild("LowerLeg_r2", CubeListBuilder.create().texOffs(36, 25).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));
		PartDefinition LeftFrontFoot = LeftFrontLowerLeg.addOrReplaceChild("LeftFrontFoot",
				CubeListBuilder.create().texOffs(50, 24).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(0, 6).addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6).addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));
		PartDefinition Toe_r2 = LeftFrontFoot.addOrReplaceChild("Toe_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));
		PartDefinition RightBackLeg = partdefinition.addOrReplaceChild("RightBackLeg", CubeListBuilder.create(), PartPose.offset(-3.1F, 17.0F, 5.775F));
		PartDefinition RightBackUpperLeg = RightBackLeg.addOrReplaceChild("RightBackUpperLeg", CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));
		PartDefinition UpperLegLayer_r3 = RightBackUpperLeg.addOrReplaceChild("UpperLegLayer_r3",
				CubeListBuilder.create().texOffs(0, 87).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.261F)).texOffs(36, 16).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));
		PartDefinition RightBackMidLeg = RightBackUpperLeg.addOrReplaceChild("RightBackMidLeg", CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));
		PartDefinition MidLeg_r3 = RightBackMidLeg.addOrReplaceChild("MidLeg_r3", CubeListBuilder.create().texOffs(52, 16).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition RightBackLowerLeg = RightBackMidLeg.addOrReplaceChild("RightBackLowerLeg", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));
		PartDefinition LowerLeg_r3 = RightBackLowerLeg.addOrReplaceChild("LowerLeg_r3", CubeListBuilder.create().texOffs(36, 25).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));
		PartDefinition RightBackFoot = RightBackLowerLeg.addOrReplaceChild("RightBackFoot",
				CubeListBuilder.create().texOffs(50, 24).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(0, 6).addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6).addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));
		PartDefinition Toe_r3 = RightBackFoot.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftBackLeg = partdefinition.addOrReplaceChild("LeftBackLeg", CubeListBuilder.create(), PartPose.offset(2.9F, 17.0F, 5.775F));
		PartDefinition LeftBackUpperLeg = LeftBackLeg.addOrReplaceChild("LeftBackUpperLeg", CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));
		PartDefinition UpperLegLayer_r4 = LeftBackUpperLeg.addOrReplaceChild("UpperLegLayer_r4",
				CubeListBuilder.create().texOffs(0, 87).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.261F)).texOffs(36, 16).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));
		PartDefinition LeftBackMidLeg = LeftBackUpperLeg.addOrReplaceChild("LeftBackMidLeg", CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));
		PartDefinition MidLeg_r4 = LeftBackMidLeg.addOrReplaceChild("MidLeg_r4", CubeListBuilder.create().texOffs(52, 16).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition LeftBackLowerLeg = LeftBackMidLeg.addOrReplaceChild("LeftBackLowerLeg", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));
		PartDefinition LowerLeg_r4 = LeftBackLowerLeg.addOrReplaceChild("LowerLeg_r4", CubeListBuilder.create().texOffs(36, 25).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));
		PartDefinition LeftBackFoot = LeftBackLowerLeg.addOrReplaceChild("LeftBackFoot",
				CubeListBuilder.create().texOffs(50, 24).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(0, 6).addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6).addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(0, 6)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));
		PartDefinition Toe_r4 = LeftBackFoot.addOrReplaceChild("Toe_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(0, 0).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightBackLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftFrontLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftBackLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightFrontLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}