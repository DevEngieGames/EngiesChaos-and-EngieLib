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
public class Modelmonstrositynewhalloween extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("engies_chaos", "modelmonstrositynewhalloween"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart BodyArm1;
	public final ModelPart BodyArm2;
	public final ModelPart BodyArm3;
	public final ModelPart BodyArm4;
	public final ModelPart BodyArm5;
	public final ModelPart BodyArm6;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;

	public Modelmonstrositynewhalloween(ModelPart root) {
		super(root);
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.BodyArm1 = this.Body.getChild("BodyArm1");
		this.BodyArm2 = this.Body.getChild("BodyArm2");
		this.BodyArm3 = this.Body.getChild("BodyArm3");
		this.BodyArm4 = this.Body.getChild("BodyArm4");
		this.BodyArm5 = this.Body.getChild("BodyArm5");
		this.BodyArm6 = this.Body.getChild("BodyArm6");
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
						.addBox(1.15F, -4.125F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-2.15F, -4.125F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-1, 8)
						.addBox(-4.275F, -2.0F, -4.525F, 8.55F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-4.65F, -8.8F, 0.5F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 32)
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
				CubeListBuilder.create().texOffs(48, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 9)
						.addBox(-4.275F, -2.0F, -4.125F, 8.55F, 2.0F, 8.55F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(0.725F, 2.5F, -2.6F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(0.625F, 5.0F, -2.6F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(0.525F, 7.5F, -2.6F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(0.425F, 10.0F, -2.6F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-3.275F, -3.0F, -3.125F, 6.55F, 1.0F, 6.55F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-4.25F, -0.5F, -3.475F, 8.5F, 2.0F, 6.725F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, 2.4042F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 9).addBox(-4.225F, -2.3375F, -2.0F, 8.45F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, -2.5958F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.725F, -3.7625F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.1409F, 3.5534F, -1.5708F, 0.7854F, 1.5708F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.725F, -3.7625F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.1409F, -3.6216F, -1.5708F, -0.7854F, 1.5708F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5F, -3.5375F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, -2.3F, -0.0625F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5F, -3.5375F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -2.3F, -0.0625F, 0.0F, 0.0F, -0.7854F));
		PartDefinition BodyArm1 = Body.addOrReplaceChild("BodyArm1",
				CubeListBuilder.create().texOffs(72, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 32).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 23)
						.addBox(-1.85F, 7.875F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-3.15F, 5.875F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.85F, 5.875F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-4.1F, 7.875F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-4.1F, 5.875F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-0.9F, 5.875F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-0.9F, 8.875F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, 2.0F, -0.6241F, 0.9699F, 1.1288F));
		PartDefinition BodyArm2 = Body.addOrReplaceChild("BodyArm2",
				CubeListBuilder.create().texOffs(72, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 32).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 23)
						.addBox(-1.85F, 7.875F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-3.15F, 5.875F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.85F, 5.875F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-4.1F, 7.875F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-4.1F, 5.875F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-0.9F, 5.875F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-0.9F, 8.875F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 7.0F, 1.0F, -1.5708F, 1.2217F, 0.0F));
		PartDefinition BodyArm3 = Body.addOrReplaceChild("BodyArm3",
				CubeListBuilder.create().texOffs(72, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 32).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 23)
						.addBox(-1.85F, 7.875F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-3.15F, 5.875F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.85F, 5.875F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-4.1F, 7.875F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-4.1F, 5.875F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-0.9F, 5.875F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-0.9F, 8.875F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 11.0F, 2.0F, -1.9736F, 1.1377F, -0.6181F));
		PartDefinition BodyArm4 = Body.addOrReplaceChild("BodyArm4",
				CubeListBuilder.create().texOffs(64, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(2.0F, 3.0F, 2.0F, -0.716F, -0.9811F, -1.0348F));
		PartDefinition EyeR_r1 = BodyArm4.addOrReplaceChild("EyeR_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.325F, 8.375F, -1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r2 = BodyArm4.addOrReplaceChild("EyeR_r2", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 9.375F, 1.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r3 = BodyArm4.addOrReplaceChild("EyeR_r3", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 6.375F, -1.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r4 = BodyArm4.addOrReplaceChild("EyeR_r4", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 6.375F, 1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r5 = BodyArm4.addOrReplaceChild("EyeR_r5", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 8.375F, 1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r6 = BodyArm4.addOrReplaceChild("EyeR_r6", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 6.375F, 0.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r7 = BodyArm4.addOrReplaceChild("EyeR_r7", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.625F, 6.375F, -1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition BodyArm5 = Body.addOrReplaceChild("BodyArm5",
				CubeListBuilder.create().texOffs(64, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(2.0F, 7.0F, 1.0F, -1.5708F, -1.2217F, 0.0F));
		PartDefinition EyeR_r8 = BodyArm5.addOrReplaceChild("EyeR_r8", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.325F, 8.375F, -1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r9 = BodyArm5.addOrReplaceChild("EyeR_r9", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 9.375F, 1.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r10 = BodyArm5.addOrReplaceChild("EyeR_r10", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 6.375F, -1.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r11 = BodyArm5.addOrReplaceChild("EyeR_r11", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 6.375F, 1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r12 = BodyArm5.addOrReplaceChild("EyeR_r12", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 8.375F, 1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r13 = BodyArm5.addOrReplaceChild("EyeR_r13", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 6.375F, 0.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r14 = BodyArm5.addOrReplaceChild("EyeR_r14", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.625F, 6.375F, -1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition BodyArm6 = Body.addOrReplaceChild("BodyArm6",
				CubeListBuilder.create().texOffs(64, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(2.0F, 11.0F, 2.0F, -1.7954F, -1.1549F, 0.3882F));
		PartDefinition EyeR_r15 = BodyArm6.addOrReplaceChild("EyeR_r15", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.325F, 8.375F, -1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r16 = BodyArm6.addOrReplaceChild("EyeR_r16", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 9.375F, 1.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r17 = BodyArm6.addOrReplaceChild("EyeR_r17", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 6.375F, -1.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r18 = BodyArm6.addOrReplaceChild("EyeR_r18", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 6.375F, 1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r19 = BodyArm6.addOrReplaceChild("EyeR_r19", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 8.375F, 1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r20 = BodyArm6.addOrReplaceChild("EyeR_r20", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 6.375F, 0.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r21 = BodyArm6.addOrReplaceChild("EyeR_r21", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.625F, 6.375F, -1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(32, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(48, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(72, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 32).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 23)
						.addBox(-1.85F, 7.875F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-3.15F, 5.875F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.85F, 5.875F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-4.1F, 7.875F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-4.1F, 5.875F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-0.9F, 5.875F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-0.9F, 8.875F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(64, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition EyeR_r22 = LeftArm.addOrReplaceChild("EyeR_r22", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.325F, 8.375F, -1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r23 = LeftArm.addOrReplaceChild("EyeR_r23", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 9.375F, 1.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r24 = LeftArm.addOrReplaceChild("EyeR_r24", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 6.375F, -1.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r25 = LeftArm.addOrReplaceChild("EyeR_r25", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 6.375F, 1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r26 = LeftArm.addOrReplaceChild("EyeR_r26", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 8.375F, 1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r27 = LeftArm.addOrReplaceChild("EyeR_r27", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 6.375F, 0.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition EyeR_r28 = LeftArm.addOrReplaceChild("EyeR_r28", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.625F, 6.375F, -1.6F, 0.0F, -1.5708F, 0.0F));
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