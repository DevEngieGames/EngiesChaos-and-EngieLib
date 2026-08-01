package engiegames.engies_chaos.client.model;

import org.checkerframework.common.subtyping.qual.Bottom;

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

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_lighting_bolt extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("engies_chaos", "modelcustom_lighting_bolt"), "main");
	public final ModelPart Bottom;

	public Modelcustom_lighting_bolt(ModelPart root) {
		super(root);
		this.Bottom = root.getChild("Bottom");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Bottom = partdefinition.addOrReplaceChild("Bottom", CubeListBuilder.create(), PartPose.offset(1.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = Bottom.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 4).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.4363F));
		PartDefinition cube_r2 = Bottom.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 2).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, 2.7053F, 0.0F, 3.1416F));
		PartDefinition cube_r3 = Bottom.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Bottom.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -25.0F, -1.0F, 2.0F, 25.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(24, 0).addBox(-1.0F, -25.0F, -1.0F, 2.0F, 25.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r5 = Bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 6).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.4363F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}