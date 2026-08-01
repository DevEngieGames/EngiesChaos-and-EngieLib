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

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelddayspike extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("engies_chaos", "modelddayspike"), "main");
	public final ModelPart main;
	public final ModelPart low;
	public final ModelPart low2;
	public final ModelPart low3;
	public final ModelPart mid;
	public final ModelPart mid2;
	public final ModelPart mid3;
	public final ModelPart top;
	public final ModelPart top2;
	public final ModelPart top3;
	public final ModelPart top4;

	public Modelddayspike(ModelPart root) {
		super(root);
		this.main = root.getChild("main");
		this.low = this.main.getChild("low");
		this.low2 = this.main.getChild("low2");
		this.low3 = this.main.getChild("low3");
		this.mid = this.main.getChild("mid");
		this.mid2 = this.main.getChild("mid2");
		this.mid3 = this.main.getChild("mid3");
		this.top = this.main.getChild("top");
		this.top2 = this.main.getChild("top2");
		this.top3 = this.main.getChild("top3");
		this.top4 = this.main.getChild("top4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition low = main.addOrReplaceChild("low", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 0).addBox(-6.75F, -6.0F, -2.0F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r2 = low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 9).addBox(-1.25F, -6.0F, -0.5F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r3 = low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 18).addBox(-6.75F, -6.0F, -0.5F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r4 = low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.25F, -6.0F, -2.0F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.0F, -0.1745F, 0.0F));
		PartDefinition low2 = main.addOrReplaceChild("low2", CubeListBuilder.create(), PartPose.offset(-0.21F, -6.5833F, 0.0F));
		PartDefinition cube_r5 = low2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 27).addBox(-5.75F, -3.5F, -1.75F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.21F, 1.5833F, -0.7F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r6 = low2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 21).addBox(-1.0F, -3.5F, -0.5F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.21F, 1.5833F, 0.3F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r7 = low2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 15).addBox(-5.75F, -3.5F, -0.5F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.21F, 1.5833F, 0.3F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r8 = low2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 9).addBox(-1.0F, -3.5F, -1.75F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.21F, 1.5833F, -0.7F, 0.0F, -0.1745F, 0.0F));
		PartDefinition low3 = main.addOrReplaceChild("low3", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 0.0F));
		PartDefinition cube_r9 = low3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 32).addBox(-4.75F, -3.0F, -1.25F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r10 = low3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 27).addBox(-0.75F, -3.0F, -0.5F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r11 = low3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 32).addBox(-4.75F, -3.0F, -0.5F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r12 = low3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(18, 27).addBox(-0.75F, -3.0F, -1.25F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, 0.0F, -0.1745F, 0.0F));
		PartDefinition mid = main.addOrReplaceChild("mid", CubeListBuilder.create(), PartPose.offset(0.0F, -10.5F, 0.0F));
		PartDefinition cube_r13 = mid.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 37).addBox(-4.75F, -3.0F, -1.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r14 = mid.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -3.0F, -0.5F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r15 = mid.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 33).addBox(-4.75F, -3.0F, -0.5F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r16 = mid.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(28, 37).addBox(-0.5F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, 0.0F, -0.1745F, 0.0F));
		PartDefinition mid2 = main.addOrReplaceChild("mid2", CubeListBuilder.create(), PartPose.offset(0.0F, -13.5F, 0.0F));
		PartDefinition cube_r17 = mid2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 0).addBox(-3.75F, -3.0F, -0.75F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r18 = mid2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 19).addBox(-1.25F, -3.0F, -0.5F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r19 = mid2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 14).addBox(-3.75F, -3.0F, -0.5F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r20 = mid2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(38, 9).addBox(-1.25F, -3.0F, -0.75F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.0F, -0.1745F, 0.0F));
		PartDefinition mid3 = main.addOrReplaceChild("mid3", CubeListBuilder.create(), PartPose.offset(0.0F, -16.5F, 0.0F));
		PartDefinition cube_r21 = mid3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 42).addBox(-2.75F, -3.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r22 = mid3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(12, 42).addBox(-0.75F, -3.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r23 = mid3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(40, 37).addBox(-2.75F, -3.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r24 = mid3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 5).addBox(-0.75F, -3.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.0F, -0.1745F, 0.0F));
		PartDefinition top = main.addOrReplaceChild("top", CubeListBuilder.create(), PartPose.offset(0.0F, -19.0F, 0.0F));
		PartDefinition cube_r25 = top.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(22, 46).addBox(-2.75F, -3.0F, -0.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r26 = top.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 43).addBox(-1.25F, -3.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r27 = top.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(38, 42).addBox(-2.75F, -3.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r28 = top.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(30, 42).addBox(-1.25F, -3.0F, -0.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.0F, -0.1745F, 0.0F));
		PartDefinition top2 = main.addOrReplaceChild("top2", CubeListBuilder.create(), PartPose.offset(0.0F, -21.5F, 0.0F));
		PartDefinition cube_r29 = top2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(46, 32).addBox(-1.75F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r30 = top2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 46).addBox(-0.75F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r31 = top2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(46, 28).addBox(-1.75F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r32 = top2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(46, 24).addBox(-0.75F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.0F, -0.1745F, 0.0F));
		PartDefinition top3 = main.addOrReplaceChild("top3", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition cube_r33 = top3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 47).addBox(-1.75F, -3.0F, 0.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.4F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r34 = top3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(46, 42).addBox(-1.25F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r35 = top3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(42, 46).addBox(-1.75F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r36 = top3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(36, 46).addBox(-1.25F, -3.0F, 0.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.4F, 0.0F, -0.1745F, 0.0F));
		PartDefinition top4 = main.addOrReplaceChild("top4", CubeListBuilder.create(), PartPose.offset(0.0F, -27.0F, 0.125F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}