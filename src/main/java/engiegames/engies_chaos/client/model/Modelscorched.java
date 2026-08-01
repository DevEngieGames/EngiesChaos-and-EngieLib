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
public class Modelscorched extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("engies_chaos", "modelscorched"), "main");
	public final ModelPart bone;
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart EyeLid;
	public final ModelPart R;
	public final ModelPart L;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart RightArm;
	public final ModelPart Melee;
	public final ModelPart LeftArm;
	public final ModelPart Melee2;

	public Modelscorched(ModelPart root) {
		super(root);
		this.bone = root.getChild("bone");
		this.Body = this.bone.getChild("Body");
		this.Head = this.Body.getChild("Head");
		this.EyeLid = this.Head.getChild("EyeLid");
		this.R = this.EyeLid.getChild("R");
		this.L = this.EyeLid.getChild("L");
		this.RightLeg = this.Body.getChild("RightLeg");
		this.LeftLeg = this.Body.getChild("LeftLeg");
		this.RightArm = this.Body.getChild("RightArm");
		this.Melee = this.RightArm.getChild("Melee");
		this.LeftArm = this.Body.getChild("LeftArm");
		this.Melee2 = this.Body.getChild("Melee2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Body = bone.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -18.0F, 0.0F));
		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(0, 2)
						.addBox(1.15F, -5.125F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.15F, -5.125F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-1.0F, -7.5F, -6.025F, 7.0F, 1.0F, 12.0F, new CubeDeformation(0.025F)).texOffs(0, 64).addBox(-6.0F, -7.5F, -1.025F, 12.0F, 1.0F, 7.0F, new CubeDeformation(0.025F)).texOffs(0, 79)
						.addBox(-5.0F, -8.0F, -2.025F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.025F)).texOffs(0, 79).addBox(-2.0F, -8.0F, -5.025F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.025F)).texOffs(0, 79)
						.addBox(-3.0F, -8.5F, -4.025F, 7.0F, 1.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(0, 79).addBox(-4.0F, -8.5F, -3.025F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.025F)).texOffs(0, 79)
						.addBox(-3.0F, -9.0F, -3.025F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.025F)).texOffs(0, 64).addBox(-2.0F, -9.5F, -2.025F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(0, 64)
						.addBox(-1.0F, -10.0F, -1.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.025F)).texOffs(0, 64).addBox(-7.0F, -7.0F, -0.025F, 14.0F, 1.0F, 7.0F, new CubeDeformation(0.025F)).texOffs(0, 64)
						.addBox(0.0F, -7.0F, -7.025F, 7.0F, 1.0F, 14.0F, new CubeDeformation(0.025F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 79).addBox(-1.7F, -0.5F, -1.7F, 3.4F, 1.0F, 3.4F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(-2.4911F, -7.4423F, -2.4336F, 0.2618F, 0.0F, -0.2618F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 79).addBox(-2.3F, -0.5F, -2.3F, 4.6F, 1.0F, 4.6F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(-2.9393F, -6.753F, -2.8987F, 0.2618F, 0.0F, -0.2618F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 64).addBox(-3.2057F, -0.2947F, -3.1958F, 6.8F, 1.0F, 6.8F, new CubeDeformation(0.025F)).texOffs(0, 64).addBox(-4.417F, 0.116F, -4.3873F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(-3.1634F, -6.4084F, -3.1312F, 0.2618F, 0.0F, -0.2618F));
		PartDefinition EyeLid = Head.addOrReplaceChild("EyeLid", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition R = EyeLid.addOrReplaceChild("R", CubeListBuilder.create().texOffs(0, 6).addBox(-1.025F, -0.525F, -0.5F, 2.05F, 1.05F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -30.5F, -3.625F));
		PartDefinition L = EyeLid.addOrReplaceChild("L", CubeListBuilder.create().texOffs(0, 4).addBox(-1.025F, -0.525F, -0.5F, 2.05F, 1.05F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -30.5F, -3.625F));
		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.0F, 6.0F, 0.0F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, 6.0F, 0.0F));
		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-4.0F, -4.0F, 0.0F));
		PartDefinition Melee = RightArm.addOrReplaceChild("Melee",
				CubeListBuilder.create().texOffs(55, 79).addBox(-0.525F, -8.6064F, -1.4436F, 1.05F, 4.6F, 2.85F, new CubeDeformation(0.0F)).texOffs(49, 79).addBox(-0.525F, -16.0064F, -1.1936F, 1.05F, 5.775F, 2.35F, new CubeDeformation(0.0F))
						.texOffs(42, 64).addBox(-1.252F, -4.0084F, -3.5206F, 2.504F, 1.004F, 7.004F, new CubeDeformation(0.0F)).texOffs(56, 76).addBox(-1.251F, -4.3074F, 2.7804F, 2.502F, 1.002F, 1.002F, new CubeDeformation(0.0F)).texOffs(42, 82)
						.addBox(-1.25F, -4.7564F, 3.1314F, 2.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 84).addBox(-1.25F, -4.7564F, -4.1686F, 2.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 64)
						.addBox(-1.251F, -4.3074F, -3.8196F, 2.502F, 1.002F, 1.002F, new CubeDeformation(0.0F)).texOffs(42, 86).addBox(-0.75F, -3.0064F, -1.2686F, 1.5F, 6.0F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.25F, 8.35F, -0.025F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Melee.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(64, 71).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 2.5F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.3936F, -0.0186F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Melee.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 73).mirror().addBox(-0.526F, -1.501F, -1.501F, 1.052F, 3.002F, 3.002F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.2993F, -0.0186F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Melee.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 67).addBox(-0.526F, -0.676F, -1.001F, 1.052F, 1.677F, 1.677F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.2314F, -0.0186F, 0.7854F, 0.0F, 0.0F));
		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(4.0F, -4.0F, 0.0F));
		PartDefinition Melee2 = Body.addOrReplaceChild("Melee2",
				CubeListBuilder.create().texOffs(16, 122).addBox(-0.9693F, -6.0016F, -2.8763F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 137).addBox(-0.9693F, -20.6516F, -2.3763F, 2.0F, 12.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(0, 106).addBox(-2.5153F, 3.0024F, -7.0303F, 5.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(32, 132).addBox(-2.5173F, 2.4004F, 5.5717F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 106)
						.addBox(-2.5193F, 1.4984F, 6.2737F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 143).addBox(-2.5193F, 1.4984F, -8.3263F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 139)
						.addBox(-2.5173F, 2.4004F, -7.6283F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 122).addBox(-1.5193F, 4.9984F, -2.5263F, 3.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1187F, -0.6577F, 2.5588F, 0.0F, -1.5708F, 2.3562F));
		PartDefinition cube_r7 = Melee2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 122).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0193F, 17.7984F, -0.0263F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Melee2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 137).mirror().addBox(-0.948F, -2.998F, -3.002F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0193F, -7.0874F, -0.0263F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Melee2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 110).addBox(-0.948F, -1.798F, -2.002F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0193F, -20.6516F, -0.0263F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 74, 170);
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