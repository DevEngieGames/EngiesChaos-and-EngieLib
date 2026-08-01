package engiegames.engieschaos.client.model;

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

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltechnoarmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("engies_chaos", "modeltechnoarmor"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart Scarf;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftBoot;
	public final ModelPart RightBoot;

	public Modeltechnoarmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Scarf = this.Body.getChild("Scarf");
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(69, 84).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 84).addBox(-5.0F, -7.0F, 4.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 75)
						.addBox(4.0F, -7.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(69, 75).addBox(-5.0F, -7.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(91, 75)
						.addBox(4.0F, -8.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(91, 84).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(91, 75)
						.addBox(-5.0F, -8.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(91, 84).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 84)
						.addBox(-1.0F, -9.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 84).addBox(-1.0F, -8.0F, -5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 80)
						.addBox(-5.0F, -8.0F, -5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 82).addBox(3.0F, -8.0F, -5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 76)
						.addBox(-1.0F, -8.0F, 4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 74).addBox(-5.0F, -8.0F, 4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 78)
						.addBox(3.0F, -8.0F, 4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 84).addBox(-5.0F, -9.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 83)
						.addBox(-5.0F, -9.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(113, 83).addBox(4.0F, -9.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(113, 83)
						.addBox(-5.0F, -9.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(113, 83).addBox(4.0F, -9.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(113, 83)
						.addBox(4.0F, -9.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 95).addBox(-5.25F, -8.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 101)
						.addBox(-5.25F, -8.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 98).addBox(-5.25F, -8.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 86)
						.addBox(4.225F, -8.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 89).addBox(4.225F, -8.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 92)
						.addBox(4.225F, -8.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(113, 83).addBox(-5.0F, -9.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(114, 84)
						.addBox(3.0F, -9.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 84).addBox(3.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 84)
						.addBox(-5.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 84).addBox(-1.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(80, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(80, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.05F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Scarf = Body.addOrReplaceChild("Scarf", CubeListBuilder.create().texOffs(1, 72).addBox(-4.25F, -0.5F, -3.475F, 8.5F, 2.0F, 6.925F, new CubeDeformation(0.0F)).texOffs(15, 77)
				.addBox(-4.25F, 0.925F, -1.975F, 8.5F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 71).addBox(-4.525F, -2.0F, -4.525F, 9.05F, 2.525F, 9.05F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.5F));
		PartDefinition cube_r1 = Scarf.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 76).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, 2.6042F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Scarf.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 74).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, -2.6208F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Scarf.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 73).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0091F, -2.1409F, 3.675F, 1.5708F, -0.7854F, -1.5708F));
		PartDefinition cube_r4 = Scarf.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 73).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0091F, -2.1409F, -3.675F, 1.5708F, 0.7854F, -1.5708F));
		PartDefinition cube_r5 = Scarf.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 73).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6659F, -2.1409F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r6 = Scarf.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 73).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6591F, -2.1409F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(96, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(112, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.05F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(104, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(104, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.05F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(80, 55).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(64, 55).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.05F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(64, 23).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(64, 39).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.05F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
				CubeListBuilder.create().texOffs(102, 86).addBox(-1.9F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(86, 86).addBox(-1.9F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.1F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
				CubeListBuilder.create().texOffs(102, 95).addBox(-2.1F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(86, 95).addBox(-2.1F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.1F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}