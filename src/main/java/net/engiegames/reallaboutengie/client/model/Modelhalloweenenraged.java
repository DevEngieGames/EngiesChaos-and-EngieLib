package net.engiegames.reallaboutengie.client.model;

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

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhalloweenenraged<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("allaboutengie", "modelhalloweenenraged"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart Tail;
	public final ModelPart TailPrimary;
	public final ModelPart TailSecondary;
	public final ModelPart TailTertiary;

	public Modelhalloweenenraged(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.Tail = root.getChild("Tail");
		this.TailPrimary = this.Tail.getChild("TailPrimary");
		this.TailSecondary = this.TailPrimary.getChild("TailSecondary");
		this.TailTertiary = this.TailSecondary.getChild("TailTertiary");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(0, 23)
						.addBox(-2.15F, -4.125F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(1.15F, -4.125F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-1, 8)
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
		PartDefinition BackFin_r1 = Body.addOrReplaceChild("BackFin_r1",
				CubeListBuilder.create().texOffs(10, 9).addBox(-1.0F, 2.0F, -3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 9).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 0.5236F, 0.0F, 0.0F));
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
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(32, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(48, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(72, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 32).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(64, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition TailPrimary = Tail.addOrReplaceChild("TailPrimary", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, 0.75F));
		PartDefinition TailFin_r1 = TailPrimary.addOrReplaceChild("TailFin_r1",
				CubeListBuilder.create().texOffs(8, 5).addBox(-4.0F, 4.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 5).addBox(-4.0F, 0.0F, 0.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 1.75F, 1.0F, 1.789F, 0.0F, 0.0F));
		PartDefinition Base_r1 = TailPrimary.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(8, 5).addBox(-2.0F, -1.075F, 0.375F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.875F, 0.85F, 1.9199F, 0.0F, 0.0F));
		PartDefinition Base_r2 = TailPrimary.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(8, 5).addBox(-2.0F, 0.75F, -0.8F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition TailSecondary = TailPrimary.addOrReplaceChild("TailSecondary", CubeListBuilder.create(), PartPose.offset(0.0F, 3.25F, 7.25F));
		PartDefinition Base_r3 = TailSecondary.addOrReplaceChild("Base_r3", CubeListBuilder.create().texOffs(8, 5).addBox(-1.5F, -1.3563F, -0.6088F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, 1.0F, 1.309F, 0.0F, 0.0F));
		PartDefinition TailTertiary = TailSecondary.addOrReplaceChild("TailTertiary", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 4.5F));
		PartDefinition Base_r4 = TailTertiary.addOrReplaceChild("Base_r4",
				CubeListBuilder.create().texOffs(8, 5).addBox(-0.5F, 5.3462F, -1.8296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(8, 5).addBox(-0.5F, -2.5538F, -1.8296F, 1.0F, 8.0F, 3.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 4.25F, 1.1345F, 0.0F, 0.0F));
		PartDefinition Base_r5 = TailTertiary.addOrReplaceChild("Base_r5",
				CubeListBuilder.create().texOffs(8, 5).addBox(-0.5F, -6.1668F, 0.8821F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 5).addBox(-0.5F, -8.1668F, -2.1179F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 4.25F, -0.8727F, 0.0F, 0.0F));
		PartDefinition Base_r6 = TailTertiary.addOrReplaceChild("Base_r6", CubeListBuilder.create().texOffs(8, 5).addBox(-1.0F, -0.3449F, -0.7203F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, 0.25F, 1.4835F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 96, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}