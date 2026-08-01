package engiegames.engies_chaos.client.model;

import net.minecraft.util.Mth;
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

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpunishernew extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("engies_chaos", "modelpunishernew"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;

	public Modelpunishernew(ModelPart root) {
		super(root);
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(0, 23)
						.addBox(-2.15F, -3.925F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-2.15F, -4.825F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-2.85F, -4.825F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-2.85F, -3.925F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-2.15F, -3.1F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-2.85F, -3.1F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(1.85F, -4.825F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(1.15F, -4.825F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(1.15F, -3.925F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(1.85F, -3.925F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(1.15F, -3.1F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(1.85F, -3.1F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-1, 8)
						.addBox(-4.275F, -2.0F, -4.5F, 8.55F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-4.65F, -8.8F, 0.5F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-4.65F, -8.8F, -1.0F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-4.25F, -8.4F, -1.0F, 8.5F, 0.4F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(4.0F, -8.25F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(4.5F, -8.65F, 0.5F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(4.5F, -8.65F, -1.0F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-4.8F, -8.65F, -1.0F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-4.8F, -8.65F, 0.5F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(18, 35).addBox(4.275F, -8.775F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(18, 35)
						.addBox(-4.775F, -8.775F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(0, 32).addBox(-4.4F, -8.25F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-4.8F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.025F)).texOffs(0, 32).addBox(-4.8F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(0, 41)
						.addBox(-5.3F, -6.0F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(12, 35).addBox(-5.5F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(0, 32)
						.addBox(4.0F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.025F)).texOffs(0, 32).addBox(4.0F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(12, 35)
						.addBox(4.05F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(0, 41).addBox(4.0F, -6.0F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(48, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-1, 8).addBox(-4.275F, -1.5F, -4.5F, 8.55F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(0.725F, 2.35F, -2.6F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(0.625F, 4.85F, -2.6F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(0.525F, 7.35F, -2.6F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(0.425F, 9.85F, -2.6F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(0.725F, 2.35F, 2.3F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(0.625F, 4.85F, 2.3F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(0.525F, 7.35F, 2.3F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(0.425F, 9.85F, 2.3F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-4.275F, 2.35F, 2.3F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-4.375F, 4.85F, 2.3F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-4.475F, 7.35F, 2.3F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-4.575F, 9.85F, 2.3F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-3.275F, -3.0F, -3.125F, 6.55F, 1.0F, 6.55F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-4.25F, -0.5F, -3.475F, 8.5F, 2.0F, 6.725F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, 2.6292F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 9).addBox(-4.225F, -2.3375F, -2.0F, 8.45F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, -2.5958F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.725F, -3.7625F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.1409F, 3.6284F, -1.5708F, 0.7854F, 1.5708F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.725F, -3.7625F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.1409F, -3.6216F, -1.5708F, -0.7854F, 1.5708F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5F, -3.5375F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, -2.3F, -0.2125F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5F, -3.5375F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -2.3F, -0.2125F, 0.0F, 0.0F, -0.7854F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(32, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(48, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(72, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(64, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 2.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 96, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}