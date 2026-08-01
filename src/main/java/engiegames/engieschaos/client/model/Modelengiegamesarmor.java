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

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelengiegamesarmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("engies_chaos", "modelengiegamesarmor"), "main");
	public final ModelPart Root;
	public final ModelPart Head;
	public final ModelPart AngelHat;
	public final ModelPart Headset;
	public final ModelPart Goggles;
	public final ModelPart R;
	public final ModelPart RSign;
	public final ModelPart L;
	public final ModelPart LSign;
	public final ModelPart Body;
	public final ModelPart Scarf;
	public final ModelPart RightScarf;
	public final ModelPart RightScarf2;
	public final ModelPart RightScarf3;
	public final ModelPart RightScarf4;
	public final ModelPart RightScarf5;
	public final ModelPart RightScarf6;
	public final ModelPart RightScarf7;
	public final ModelPart RightScarf8;
	public final ModelPart RightScarf9;
	public final ModelPart LeftScarf;
	public final ModelPart LeftScarf2;
	public final ModelPart LeftScarf3;
	public final ModelPart LeftScarf4;
	public final ModelPart LeftScarf5;
	public final ModelPart LeftScarf6;
	public final ModelPart LeftScarf7;
	public final ModelPart LeftScarf8;
	public final ModelPart LeftScarf9;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelengiegamesarmor(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Head = this.Root.getChild("Head");
		this.AngelHat = this.Head.getChild("AngelHat");
		this.Headset = this.Head.getChild("Headset");
		this.Goggles = this.Head.getChild("Goggles");
		this.R = this.Goggles.getChild("R");
		this.RSign = this.R.getChild("RSign");
		this.L = this.Goggles.getChild("L");
		this.LSign = this.L.getChild("LSign");
		this.Body = this.Root.getChild("Body");
		this.Scarf = this.Body.getChild("Scarf");
		this.RightScarf = this.Scarf.getChild("RightScarf");
		this.RightScarf2 = this.RightScarf.getChild("RightScarf2");
		this.RightScarf3 = this.RightScarf2.getChild("RightScarf3");
		this.RightScarf4 = this.RightScarf3.getChild("RightScarf4");
		this.RightScarf5 = this.RightScarf4.getChild("RightScarf5");
		this.RightScarf6 = this.RightScarf5.getChild("RightScarf6");
		this.RightScarf7 = this.RightScarf6.getChild("RightScarf7");
		this.RightScarf8 = this.RightScarf7.getChild("RightScarf8");
		this.RightScarf9 = this.RightScarf8.getChild("RightScarf9");
		this.LeftScarf = this.Scarf.getChild("LeftScarf");
		this.LeftScarf2 = this.LeftScarf.getChild("LeftScarf2");
		this.LeftScarf3 = this.LeftScarf2.getChild("LeftScarf3");
		this.LeftScarf4 = this.LeftScarf3.getChild("LeftScarf4");
		this.LeftScarf5 = this.LeftScarf4.getChild("LeftScarf5");
		this.LeftScarf6 = this.LeftScarf5.getChild("LeftScarf6");
		this.LeftScarf7 = this.LeftScarf6.getChild("LeftScarf7");
		this.LeftScarf8 = this.LeftScarf7.getChild("LeftScarf8");
		this.LeftScarf9 = this.LeftScarf8.getChild("LeftScarf9");
		this.LeftArm = this.Root.getChild("LeftArm");
		this.RightArm = this.Root.getChild("RightArm");
		this.LeftLeg = this.Root.getChild("LeftLeg");
		this.RightLeg = this.Root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Head = Root.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(64, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(96, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(0, 71).addBox(-4.275F, -2.0F, -4.125F, 8.55F, 2.0F, 8.55F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition AngelHat = Head.addOrReplaceChild("AngelHat",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 1.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-6.0F, 0.5F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-5.0F, 0.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(30, 28).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 15)
						.addBox(-3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 22).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.025F, -0.525F, 0.0873F, 0.0F, 0.0F));
		PartDefinition Headset = Head.addOrReplaceChild("Headset",
				CubeListBuilder.create().texOffs(0, 95).addBox(4.0053F, 0.2316F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(15, 98).addBox(4.0553F, 1.0316F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(23, 94)
						.addBox(4.0053F, -0.2684F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(12, 88).addBox(4.0053F, 0.2316F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.025F)).texOffs(15, 98)
						.addBox(-5.4947F, 1.0316F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(0, 95).addBox(-5.2947F, 0.2316F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(23, 94).mirror()
						.addBox(-4.7947F, -0.2684F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.025F)).mirror(false).texOffs(12, 88).addBox(-4.7947F, 0.2316F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.025F)).texOffs(13, 55)
						.addBox(-4.3947F, -2.0184F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 56).addBox(-4.7697F, -2.5434F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(19, 56)
						.addBox(4.2303F, -2.5434F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(16, 55).addBox(-4.7947F, -2.4184F, 0.5F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 55)
						.addBox(-4.7947F, -2.4184F, -1.0F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 55).addBox(4.5053F, -2.4184F, -1.0F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 55)
						.addBox(4.5053F, -2.4184F, 0.5F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(13, 55).addBox(4.0053F, -2.0184F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 53)
						.addBox(-4.2447F, -2.1684F, -1.0F, 8.5F, 0.4F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 50).addBox(-4.6447F, -2.5684F, -1.0F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(20, 50)
						.addBox(-4.6447F, -2.5684F, 0.5F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0053F, -6.2316F, 0.0F));
		PartDefinition Goggles = Head.addOrReplaceChild("Goggles",
				CubeListBuilder.create().texOffs(73, 68).addBox(-4.0F, -0.3581F, -3.0662F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 118).addBox(-4.025F, -0.3581F, -2.0912F, 0.025F, 2.0F, 8.05F, new CubeDeformation(0.0F))
						.texOffs(0, 118).addBox(4.0F, -0.3581F, -2.0912F, 0.025F, 2.0F, 8.05F, new CubeDeformation(0.0F)).texOffs(0, 126).addBox(-4.025F, -0.3581F, 5.9088F, 8.05F, 2.0F, 0.05F, new CubeDeformation(0.0F)).texOffs(0, 126)
						.addBox(-2.025F, -2.4081F, 5.9088F, 4.05F, 2.05F, 0.05F, new CubeDeformation(0.0F)).texOffs(-8, 120).addBox(-2.025F, -2.4081F, -2.0912F, 4.05F, 0.05F, 8.05F, new CubeDeformation(0.0F)).texOffs(56, 64)
						.addBox(2.025F, -0.55F, -2.7F, 0.2F, 0.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(56, 64).addBox(-2.225F, -0.55F, -2.7F, 0.2F, 0.2F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.6419F, -1.9338F));
		PartDefinition cube_r1 = Goggles.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 126).addBox(-2.025F, -0.025F, -0.025F, 4.05F, 2.15F, 0.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.3831F, -2.0662F, -0.2618F, 0.0F, 0.0F));
		PartDefinition R = Goggles.addOrReplaceChild("R",
				CubeListBuilder.create().texOffs(77, 71).addBox(-0.9888F, -1.025F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.9888F, 1.0F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F))
						.texOffs(77, 71).addBox(-1.0138F, -1.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.9888F, -1.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, -0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.7388F, -1.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, 0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.7388F, 0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, 0.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.7362F, 0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, 0.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.4862F, 0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, -0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.4862F, -1.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, -1.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.9862F, -1.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0112F, 0.6419F, -3.378F));
		PartDefinition cube_r2 = R.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 90).mirror().addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(-4.95F)).mirror(false),
				PartPose.offsetAndRotation(0.0112F, 0.025F, 4.7118F, -3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r3 = R.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 78).addBox(-3.999F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F, new CubeDeformation(-3.0F)),
				PartPose.offsetAndRotation(0.0112F, 0.0F, 1.8618F, 0.0F, 3.1416F, 0.0F));
		PartDefinition RSign = R.addOrReplaceChild("RSign", CubeListBuilder.create(), PartPose.offset(-0.0013F, 0.0F, -0.1632F));
		PartDefinition cube_r4 = RSign.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 81).mirror().addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(-5.7F)).mirror(false),
				PartPose.offsetAndRotation(0.0125F, 0.05F, 5.7F, 0.0F, 3.1416F, 0.0F));
		PartDefinition L = Goggles.addOrReplaceChild("L",
				CubeListBuilder.create().texOffs(77, 71).addBox(-0.9888F, -1.025F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.9888F, 1.0F, -0.2882F, 2.0F, 0.025F, 0.65F, new CubeDeformation(0.0F))
						.texOffs(77, 71).addBox(-1.0138F, -1.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.9888F, -1.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, -0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.7388F, -1.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, 0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(-0.7388F, 0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(-0.9888F, 0.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.7362F, 0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, 0.5F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.4862F, 0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, -0.75F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.4862F, -1.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71)
						.addBox(0.7362F, -1.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.9862F, -1.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(110, 77)
						.addBox(-0.9888F, -1.0F, 1.2868F, 1.975F, 2.0F, 0.05F, new CubeDeformation(0.0F)).texOffs(110, 77).addBox(-4.9888F, -1.0F, 1.2868F, 1.975F, 2.0F, 0.05F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9888F, 0.6419F, -3.378F));
		PartDefinition cube_r5 = L.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 90).mirror().addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(-4.95F)).mirror(false),
				PartPose.offsetAndRotation(0.0112F, 0.025F, 4.7118F, -3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r6 = L.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(58, 78).addBox(-3.999F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F, new CubeDeformation(-3.0F)),
				PartPose.offsetAndRotation(0.0112F, 0.0F, 1.8618F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LSign = L.addOrReplaceChild("LSign", CubeListBuilder.create(), PartPose.offset(-0.0013F, 0.0F, -0.1632F));
		PartDefinition cube_r7 = LSign.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 81).mirror().addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(-5.7F)).mirror(false),
				PartPose.offsetAndRotation(0.0125F, 0.05F, 5.7F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Body = Root.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(80, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(80, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.35F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition Scarf = Body.addOrReplaceChild("Scarf",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.275F, -2.0F, -4.125F, 8.55F, 2.0F, 8.55F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(0.725F, -2.5F, 3.875F, 2.55F, 2.0F, 0.525F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-3.275F, -2.5F, 3.875F, 2.55F, 2.0F, 0.525F, new CubeDeformation(0.0F)).texOffs(0, 71).addBox(-3.275F, -3.0F, -3.125F, 6.55F, 1.0F, 6.55F, new CubeDeformation(0.0F)).texOffs(1, 72)
						.addBox(-4.25F, -0.5F, -3.475F, 8.5F, 2.0F, 6.725F, new CubeDeformation(0.0F)).texOffs(4, 75).addBox(-4.25F, 1.325F, -1.575F, 8.5F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Scarf.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 74).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, 2.4042F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Scarf.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 74).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, -2.5958F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r10 = Scarf.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(2, 73).addBox(-0.5F, -0.725F, -3.7625F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.1409F, 3.5534F, -1.5708F, 0.7854F, 1.5708F));
		PartDefinition cube_r11 = Scarf.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(2, 73).addBox(-0.5F, -0.725F, -3.7625F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.1409F, -3.2716F, -1.5708F, -0.7854F, 1.5708F));
		PartDefinition cube_r12 = Scarf.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.5F, -3.5375F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, -2.3F, -0.0625F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r13 = Scarf.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(3, 74).addBox(-0.5F, -0.5F, -3.5375F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -2.3F, -0.0625F, 0.0F, 0.0F, -0.7854F));
		PartDefinition RightScarf = Scarf.addOrReplaceChild("RightScarf", CubeListBuilder.create().texOffs(0, 4).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.4F, 4.5625F, 0.4363F, -0.2618F, 0.1745F));
		PartDefinition RightScarf2 = RightScarf.addOrReplaceChild("RightScarf2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf3 = RightScarf2.addOrReplaceChild("RightScarf3", CubeListBuilder.create().texOffs(0, 4).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf4 = RightScarf3.addOrReplaceChild("RightScarf4", CubeListBuilder.create().texOffs(0, 4).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf5 = RightScarf4.addOrReplaceChild("RightScarf5", CubeListBuilder.create().texOffs(0, 4).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf6 = RightScarf5.addOrReplaceChild("RightScarf6", CubeListBuilder.create().texOffs(0, 4).addBox(-1.775F, -0.1F, -0.1625F, 3.55F, 2.5F, 0.325F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf7 = RightScarf6.addOrReplaceChild("RightScarf7", CubeListBuilder.create().texOffs(0, 4).addBox(-1.875F, -0.1F, -0.1625F, 3.75F, 2.5F, 0.325F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf8 = RightScarf7.addOrReplaceChild("RightScarf8", CubeListBuilder.create().texOffs(0, 4).addBox(-1.975F, -0.1F, -0.1625F, 3.95F, 2.5F, 0.325F, new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf9 = RightScarf8.addOrReplaceChild("RightScarf9", CubeListBuilder.create().texOffs(0, 4).addBox(-2.075F, -0.1F, -0.1625F, 4.15F, 2.5F, 0.325F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition LeftScarf = Scarf.addOrReplaceChild("LeftScarf", CubeListBuilder.create().texOffs(0, 4).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.4F, 4.5625F, 0.4363F, 0.2618F, -0.0873F));
		PartDefinition LeftScarf2 = LeftScarf.addOrReplaceChild("LeftScarf2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf3 = LeftScarf2.addOrReplaceChild("LeftScarf3", CubeListBuilder.create().texOffs(0, 4).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf4 = LeftScarf3.addOrReplaceChild("LeftScarf4", CubeListBuilder.create().texOffs(0, 4).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf5 = LeftScarf4.addOrReplaceChild("LeftScarf5", CubeListBuilder.create().texOffs(0, 4).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf6 = LeftScarf5.addOrReplaceChild("LeftScarf6", CubeListBuilder.create().texOffs(0, 4).addBox(-1.775F, -0.1F, -0.1625F, 3.55F, 2.5F, 0.325F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf7 = LeftScarf6.addOrReplaceChild("LeftScarf7", CubeListBuilder.create().texOffs(0, 4).addBox(-1.875F, -0.1F, -0.1625F, 3.75F, 2.5F, 0.325F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf8 = LeftScarf7.addOrReplaceChild("LeftScarf8", CubeListBuilder.create().texOffs(0, 4).addBox(-1.975F, -0.1F, -0.1625F, 3.95F, 2.5F, 0.325F, new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf9 = LeftScarf8.addOrReplaceChild("LeftScarf9", CubeListBuilder.create().texOffs(0, 4).addBox(-2.075F, -0.1F, -0.1625F, 4.15F, 2.5F, 0.325F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftArm = Root.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(96, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(112, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.35F)),
				PartPose.offset(5.0F, -22.0F, 0.0F));
		PartDefinition RightArm = Root.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(104, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(104, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.35F)),
				PartPose.offset(-5.0F, -22.0F, 0.0F));
		PartDefinition LeftLeg = Root.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(80, 48).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(64, 48).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.35F)),
				PartPose.offset(1.9F, -12.0F, 0.0F));
		PartDefinition RightLeg = Root.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(64, 16).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(64, 32).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.35F)),
				PartPose.offset(-1.9F, -12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}