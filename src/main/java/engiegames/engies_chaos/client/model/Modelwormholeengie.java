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

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelwormholeengie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("engies_chaos", "modelwormholeengie"), "main");
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
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelwormholeengie(ModelPart root) {
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
				PartPose.offset(0.0F, -8.0F, -0.025F));
		PartDefinition Headset = Head.addOrReplaceChild("Headset",
				CubeListBuilder.create().texOffs(0, 95).addBox(4.0053F, 0.2316F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(15, 98).addBox(4.0553F, 1.0316F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(23, 94)
						.addBox(4.0053F, -0.2684F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(12, 88).addBox(4.0053F, 0.2316F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.025F)).texOffs(15, 98)
						.addBox(-5.4947F, 1.0316F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(0, 95).addBox(-5.2947F, 0.2316F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(23, 94).mirror()
						.addBox(-4.7947F, -0.2684F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.025F)).mirror(false).texOffs(12, 88).addBox(-4.7947F, 0.2316F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.025F)).texOffs(13, 55)
						.addBox(-4.3947F, -2.0184F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 55).addBox(-4.7697F, -2.5434F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(19, 55)
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
						.addBox(0.7362F, -1.0F, -0.2882F, 0.25F, 0.25F, 0.6F, new CubeDeformation(0.0F)).texOffs(77, 71).addBox(0.9862F, -1.0F, -0.2882F, 0.025F, 2.0F, 0.65F, new CubeDeformation(0.0F)).texOffs(63, 77)
						.addBox(-0.9888F, -1.0F, -0.1382F, 1.975F, 2.0F, 0.45F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0112F, 0.6419F, -3.378F));
		PartDefinition RSign = R.addOrReplaceChild("RSign", CubeListBuilder.create(), PartPose.offset(-0.0013F, 0.0F, -0.1632F));
		PartDefinition cube_r2 = RSign.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 87).addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(-5.7F)),
				PartPose.offsetAndRotation(4.0125F, 0.05F, 5.7F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r3 = RSign.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 87).addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(-5.7F)),
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
						.addBox(-0.9888F, -1.0F, 1.2868F, 1.975F, 2.0F, 0.05F, new CubeDeformation(0.0F)).texOffs(110, 77).addBox(-4.9888F, -1.0F, 1.2868F, 1.975F, 2.0F, 0.05F, new CubeDeformation(0.0F)).texOffs(63, 77)
						.addBox(-0.9888F, -1.0F, -0.1382F, 1.975F, 2.0F, 0.45F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9888F, 0.6419F, -3.378F));
		PartDefinition LSign = L.addOrReplaceChild("LSign", CubeListBuilder.create().texOffs(63, 86).addBox(-0.7375F, -0.75F, 0.0F, 1.475F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0013F, 0.0F, -0.1632F));
		PartDefinition Body = Root.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(80, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 32).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 71)
						.addBox(-4.275F, -8.0F, -4.125F, 8.55F, 2.0F, 8.55F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-3.275F, -8.5F, 4.4F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(0.725F, -8.5F, 4.4F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.625F, -6.0F, 4.4F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-3.375F, -6.0F, 4.4F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.525F, -3.5F, 4.4F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-3.475F, -3.5F, 4.4F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.425F, -1.0F, 4.4F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-3.575F, -1.0F, 4.4F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.325F, 1.5F, 4.4F, 3.35F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-3.675F, 1.5F, 4.4F, 3.35F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.225F, 4.0F, 4.4F, 3.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-3.775F, 4.0F, 4.4F, 3.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.125F, 6.5F, 4.4F, 3.75F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-3.875F, 6.5F, 4.4F, 3.75F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.025F, 9.0F, 4.4F, 3.95F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-3.975F, 9.0F, 4.4F, 3.95F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-0.075F, 11.5F, 4.4F, 4.15F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-4.075F, 11.5F, 4.4F, 4.15F, 2.5F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 72).addBox(0.725F, -8.5F, 3.875F, 2.55F, 2.0F, 0.525F, new CubeDeformation(0.0F)).texOffs(0, 72)
						.addBox(-3.275F, -8.5F, 3.875F, 2.55F, 2.0F, 0.525F, new CubeDeformation(0.0F)).texOffs(0, 71).addBox(-3.275F, -9.0F, -3.125F, 6.55F, 1.0F, 6.55F, new CubeDeformation(0.0F)).texOffs(1, 72)
						.addBox(-4.25F, -5.5F, -3.475F, 8.5F, 1.0F, 6.725F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -18.0F, 0.0F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 74).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5685F, 2.4042F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 74).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5685F, -2.5958F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(2, 73).addBox(-0.5F, -0.725F, -3.7625F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.1409F, 3.5534F, -1.5708F, 0.7854F, 1.5708F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(2, 73).addBox(-0.5F, -0.725F, -3.7625F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.1409F, -3.2716F, -1.5708F, -0.7854F, 1.5708F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.5F, -3.5375F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, -8.3F, -0.0625F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(3, 74).addBox(-0.5F, -0.5F, -3.5375F, 1.0F, 1.45F, 7.525F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -8.3F, -0.0625F, 0.0F, 0.0F, -0.7854F));
		PartDefinition LeftArm = Root.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(96, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(4.0F, -22.0F, 0.0F));
		PartDefinition RightArm = Root.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(104, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 32).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-4.0F, -22.0F, 0.0F));
		PartDefinition LeftLeg = Root.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(80, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, -12.0F, 0.0F));
		PartDefinition RightLeg = Root.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(64, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));
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