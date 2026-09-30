package engiegames.engies_chaos.client.model;

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

// Made with Blockbench 5.2.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelddayspike<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("engies_chaos", "modelddayspike"), "main");
	public final ModelPart theentirething;

	public Modelddayspike(ModelPart root) {
		this.theentirething = root.getChild("theentirething");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition theentirething = partdefinition.addOrReplaceChild("theentirething", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0266F));
		PartDefinition cube_r1 = theentirething.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-2, 8).addBox(-3.9355F, 4.25F, -1.9069F, 14.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.75F, -1.875F, -3.1416F, -0.1745F, 3.1416F));
		PartDefinition cube_r2 = theentirething.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-1, 17).addBox(-10.5645F, 4.25F, -1.9069F, 14.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.75F, -1.875F, -3.1416F, 0.1745F, 3.1416F));
		PartDefinition cube_r3 = theentirething.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(-6, 14).addBox(-12.625F, -11.5F, -4.75F, 16.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(-3, 16).addBox(-11.625F, -18.5F, -3.75F, 15.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.5F, 2.9734F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r4 = theentirething.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(-5, 5).addBox(-3.375F, -11.5F, -4.75F, 16.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(-3, 7).addBox(-3.375F, -18.5F, -3.75F, 15.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.5F, 2.9734F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r5 = theentirething.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-5, 5).addBox(-3.5657F, 8.75F, -3.6683F, 16.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.75F, -1.875F, -3.1416F, -0.1745F, 3.1416F));
		PartDefinition cube_r6 = theentirething.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-6, 14).addBox(-12.4343F, 8.75F, -3.6683F, 16.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.75F, -1.875F, -3.1416F, 0.1745F, 3.1416F));
		PartDefinition cube_r7 = theentirething.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(-3, 16).addBox(-11.4343F, 8.75F, -2.6683F, 15.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.75F, -1.875F, -3.1416F, 0.1745F, 3.1416F));
		PartDefinition cube_r8 = theentirething.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-3, 7).addBox(-3.5657F, 8.75F, -2.6683F, 15.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.75F, -1.875F, -3.1416F, -0.1745F, 3.1416F));
		PartDefinition cube_r9 = theentirething.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 17).addBox(-8.6947F, -0.25F, -2.6455F, 12.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.75F, -1.875F, -3.1416F, 0.1745F, 3.1416F));
		PartDefinition cube_r10 = theentirething.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-2, 8).addBox(-3.3053F, -0.25F, -2.6455F, 12.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.75F, -1.875F, -3.1416F, -0.1745F, 3.1416F));
		PartDefinition cube_r11 = theentirething.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.675F, -4.75F, -1.8841F, 11.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.75F, -1.875F, -3.1416F, -0.1745F, 3.1416F));
		PartDefinition cube_r12 = theentirething.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(2, 18).addBox(-7.825F, -4.75F, -1.8841F, 11.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.75F, -1.875F, -3.1416F, 0.1745F, 3.1416F));
		PartDefinition cube_r13 = theentirething.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(3, 18).addBox(-5.9552F, -9.25F, -2.6227F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.75F, -1.875F, -3.1416F, 0.1745F, 3.1416F));
		PartDefinition cube_r14 = theentirething.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.0448F, -9.25F, -2.6227F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.75F, -1.875F, -3.1416F, -0.1745F, 3.1416F));
		PartDefinition cube_r15 = theentirething.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.4146F, -13.75F, -3.3613F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.75F, -1.875F, -3.1416F, -0.1745F, 3.1416F));
		PartDefinition cube_r16 = theentirething.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(4, 18).addBox(-5.0854F, -13.75F, -3.3613F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.75F, -1.875F, -3.1416F, 0.1745F, 3.1416F));
		PartDefinition cube_r17 = theentirething.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(5, 18).addBox(-3.2157F, -18.25F, -4.0999F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -27.75F, -1.875F, -3.1416F, 0.1745F, 3.1416F));
		PartDefinition cube_r18 = theentirething.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(-1, 9).addBox(-2.7843F, -18.25F, -4.0999F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -27.75F, -1.875F, -3.1416F, -0.1745F, 3.1416F));
		PartDefinition cube_r19 = theentirething.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.375F, -11.5F, -0.75F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -34.5F, -1.5266F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r20 = theentirething.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(5, 18).addBox(-2.625F, -11.5F, -0.75F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -34.5F, -1.5266F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r21 = theentirething.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(4, 18).addBox(-4.625F, -11.5F, -0.75F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -28.0F, -0.7766F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r22 = theentirething.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.875F, -11.5F, -0.75F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -28.0F, -0.7766F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r23 = theentirething.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.375F, -11.5F, -0.75F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.5F, -0.0266F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r24 = theentirething.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(3, 18).addBox(-5.625F, -11.5F, -0.75F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.5F, -0.0266F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r25 = theentirething.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(2, 18).addBox(-7.625F, -11.5F, -0.75F, 11.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, 0.7234F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r26 = theentirething.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.875F, -11.5F, -0.75F, 11.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, 0.7234F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r27 = theentirething.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(-2, 8).addBox(-3.375F, -11.5F, -2.25F, 12.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.5F, 1.4734F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r28 = theentirething.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 17).addBox(-8.625F, -11.5F, -2.25F, 12.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.5F, 1.4734F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r29 = theentirething.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(-2, 8).addBox(-3.875F, -11.5F, -2.25F, 14.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 2.2234F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r30 = theentirething.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(-1, 17).addBox(-10.625F, -11.5F, -2.25F, 14.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 2.2234F, 0.0F, -0.1745F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		theentirething.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}