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

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelxengiearmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("engies_chaos", "modelxengiearmor"), "main");
	public final ModelPart Head;
	public final ModelPart AngelHat;
	public final ModelPart Hat;
	public final ModelPart Chains;
	public final ModelPart L1;
	public final ModelPart L2;
	public final ModelPart L3;
	public final ModelPart L4;
	public final ModelPart L5;
	public final ModelPart L6;
	public final ModelPart L7;
	public final ModelPart L8;
	public final ModelPart R1;
	public final ModelPart R2;
	public final ModelPart R3;
	public final ModelPart R4;
	public final ModelPart R5;
	public final ModelPart R6;
	public final ModelPart R7;
	public final ModelPart R8;
	public final ModelPart Goggles;
	public final ModelPart R;
	public final ModelPart RSign;
	public final ModelPart L;
	public final ModelPart LSign;
	public final ModelPart Muffs;
	public final ModelPart Body;
	public final ModelPart Hood;
	public final ModelPart Hood2;
	public final ModelPart Roughian;
	public final ModelPart RoughianBody;
	public final ModelPart RoughianLeftArm;
	public final ModelPart RoughianRightArm;
	public final ModelPart RoughianLeftLeg;
	public final ModelPart RoughianRightLeg;
	public final ModelPart Scarf;
	public final ModelPart ScarfFront;
	public final ModelPart RightScarf2;
	public final ModelPart RightScarf3;
	public final ModelPart RightScarf4;
	public final ModelPart RightScarf5;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftBoot;
	public final ModelPart RightBoot;

	public Modelxengiearmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.AngelHat = this.Head.getChild("AngelHat");
		this.Hat = this.AngelHat.getChild("Hat");
		this.Chains = this.AngelHat.getChild("Chains");
		this.L1 = this.Chains.getChild("L1");
		this.L2 = this.L1.getChild("L2");
		this.L3 = this.L2.getChild("L3");
		this.L4 = this.L3.getChild("L4");
		this.L5 = this.L4.getChild("L5");
		this.L6 = this.L5.getChild("L6");
		this.L7 = this.L6.getChild("L7");
		this.L8 = this.L7.getChild("L8");
		this.R1 = this.Chains.getChild("R1");
		this.R2 = this.R1.getChild("R2");
		this.R3 = this.R2.getChild("R3");
		this.R4 = this.R3.getChild("R4");
		this.R5 = this.R4.getChild("R5");
		this.R6 = this.R5.getChild("R6");
		this.R7 = this.R6.getChild("R7");
		this.R8 = this.R7.getChild("R8");
		this.Goggles = this.Head.getChild("Goggles");
		this.R = this.Goggles.getChild("R");
		this.RSign = this.R.getChild("RSign");
		this.L = this.Goggles.getChild("L");
		this.LSign = this.L.getChild("LSign");
		this.Muffs = this.Head.getChild("Muffs");
		this.Body = root.getChild("Body");
		this.Hood = this.Body.getChild("Hood");
		this.Hood2 = this.Body.getChild("Hood2");
		this.Roughian = this.Body.getChild("Roughian");
		this.RoughianBody = this.Roughian.getChild("RoughianBody");
		this.RoughianLeftArm = this.Roughian.getChild("RoughianLeftArm");
		this.RoughianRightArm = this.Roughian.getChild("RoughianRightArm");
		this.RoughianLeftLeg = this.Roughian.getChild("RoughianLeftLeg");
		this.RoughianRightLeg = this.Roughian.getChild("RoughianRightLeg");
		this.Scarf = this.Body.getChild("Scarf");
		this.ScarfFront = this.Scarf.getChild("ScarfFront");
		this.RightScarf2 = this.ScarfFront.getChild("RightScarf2");
		this.RightScarf3 = this.RightScarf2.getChild("RightScarf3");
		this.RightScarf4 = this.RightScarf3.getChild("RightScarf4");
		this.RightScarf5 = this.RightScarf4.getChild("RightScarf5");
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition AngelHat = Head.addOrReplaceChild("AngelHat", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, -0.025F));
		PartDefinition Hat = AngelHat.addOrReplaceChild("Hat",
				CubeListBuilder.create().texOffs(0, 200).addBox(-8.8F, -1.1F, -2.2F, 17.6F, 1.1F, 4.4F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-7.7F, -1.1F, 2.2F, 15.4F, 1.1F, 2.2F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-7.7F, -1.1F, -4.4F, 15.4F, 1.1F, 2.2F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-6.6F, -1.1F, -5.5F, 13.2F, 1.1F, 1.1F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-6.6F, -1.1F, -6.6F, 13.2F, 1.1F, 1.1F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(2.2F, -1.1F, 6.6F, 2.2F, 1.1F, 1.1F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-2.2F, -1.1F, -8.8F, 4.4F, 1.1F, 17.6F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-4.4F, -1.1F, 6.6F, 2.2F, 1.1F, 1.1F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-6.6F, -1.1F, 4.4F, 13.2F, 1.1F, 1.1F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-6.6F, -1.1F, 5.5F, 13.2F, 1.1F, 1.1F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-4.4F, -1.1F, -7.7F, 2.2F, 1.1F, 1.1F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(2.2F, -1.1F, -7.7F, 2.2F, 1.1F, 1.1F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-7.128F, -1.9745F, -1.782F, 14.256F, 0.891F, 3.564F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-6.237F, -1.9745F, 1.782F, 12.474F, 0.891F, 1.782F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-6.237F, -1.9745F, -3.564F, 12.474F, 0.891F, 1.782F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-5.346F, -1.9745F, -4.455F, 10.692F, 0.891F, 0.891F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-5.346F, -1.9745F, -5.346F, 10.692F, 0.891F, 0.891F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(1.782F, -1.9745F, 5.346F, 1.782F, 0.891F, 0.891F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.782F, -1.9745F, -7.128F, 3.564F, 0.891F, 14.256F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-3.564F, -1.9745F, 5.346F, 1.782F, 0.891F, 0.891F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-5.346F, -1.9745F, 3.564F, 10.692F, 0.891F, 0.891F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-5.346F, -1.9745F, 4.455F, 10.692F, 0.891F, 0.891F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-3.564F, -1.9745F, -6.237F, 1.782F, 0.891F, 0.891F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(1.782F, -1.9745F, -6.237F, 1.782F, 0.891F, 0.891F, new CubeDeformation(0.0F)).texOffs(0, 260)
						.addBox(-5.7024F, -2.6796F, -1.4256F, 11.4048F, 0.7128F, 2.8512F, new CubeDeformation(0.0F)).texOffs(0, 262).addBox(-4.9896F, -2.6796F, 1.4256F, 9.9792F, 0.7128F, 1.4256F, new CubeDeformation(0.0F)).texOffs(0, 262)
						.addBox(-4.9896F, -2.6796F, -2.8512F, 9.9792F, 0.7128F, 1.4256F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-4.2768F, -2.6796F, -3.564F, 8.5536F, 0.7128F, 0.7128F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-4.2768F, -2.6796F, -4.2768F, 8.5536F, 0.7128F, 0.7128F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(1.4256F, -2.6796F, 4.2768F, 1.4256F, 0.7128F, 0.7128F, new CubeDeformation(0.0F)).texOffs(0, 252)
						.addBox(-1.4256F, -2.6796F, -5.7024F, 2.8512F, 0.7128F, 11.4048F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-2.8512F, -2.6796F, 4.2768F, 1.4256F, 0.7128F, 0.7128F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-4.2768F, -2.6796F, 2.8512F, 8.5536F, 0.7128F, 0.7128F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-4.2768F, -2.6796F, 3.564F, 8.5536F, 0.7128F, 0.7128F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-2.8512F, -2.6796F, -4.9896F, 1.4256F, 0.7128F, 0.7128F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(1.4256F, -2.6796F, -4.9896F, 1.4256F, 0.7128F, 0.7128F, new CubeDeformation(0.0F)).texOffs(0, 261)
						.addBox(-4.5619F, -3.2437F, -1.1405F, 9.1238F, 0.5702F, 2.281F, new CubeDeformation(0.0F)).texOffs(0, 262).addBox(-3.9917F, -3.2437F, 1.1405F, 7.9834F, 0.5702F, 1.1405F, new CubeDeformation(0.0F)).texOffs(0, 262)
						.addBox(-3.9917F, -3.2437F, -2.281F, 7.9834F, 0.5702F, 1.1405F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-3.4214F, -3.2437F, -2.8512F, 6.8429F, 0.5702F, 0.5702F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-3.4214F, -3.2437F, -3.4214F, 6.8429F, 0.5702F, 0.5702F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(1.1405F, -3.2437F, 3.4214F, 1.1405F, 0.5702F, 0.5702F, new CubeDeformation(0.0F)).texOffs(0, 254)
						.addBox(-1.1405F, -3.2437F, -4.5619F, 2.281F, 0.5702F, 9.1238F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(-2.281F, -3.2437F, 3.4214F, 1.1405F, 0.5702F, 0.5702F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-3.4214F, -3.2437F, 2.281F, 6.8429F, 0.5702F, 0.5702F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-3.4214F, -3.2437F, 2.8512F, 6.8429F, 0.5702F, 0.5702F, new CubeDeformation(0.0F)).texOffs(1, 263)
						.addBox(-2.281F, -3.2437F, -3.9917F, 1.1405F, 0.5702F, 0.5702F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(1.1405F, -3.2437F, -3.9917F, 1.1405F, 0.5702F, 0.5702F, new CubeDeformation(0.0F)).texOffs(0, 262)
						.addBox(-3.6495F, -3.6817F, -0.9124F, 7.2991F, 0.4562F, 1.8248F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-3.1933F, -3.6817F, 0.9124F, 6.3867F, 0.4562F, 0.9124F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-3.1933F, -3.6817F, -1.8248F, 6.3867F, 0.4562F, 0.9124F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-2.7372F, -3.6817F, -2.281F, 5.4743F, 0.4562F, 0.4562F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-2.7372F, -3.6817F, -2.7372F, 5.4743F, 0.4562F, 0.4562F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(0.9124F, -3.6817F, 2.7372F, 0.9124F, 0.4562F, 0.4562F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-0.9124F, -3.6817F, -3.6495F, 1.8248F, 0.4562F, 7.2991F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(-1.8248F, -3.6817F, 2.7372F, 0.9124F, 0.4562F, 0.4562F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-2.7372F, -3.6817F, 1.8248F, 5.4743F, 0.4562F, 0.4562F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-2.7372F, -3.6817F, 2.281F, 5.4743F, 0.4562F, 0.4562F, new CubeDeformation(0.0F)).texOffs(1, 263)
						.addBox(-1.8248F, -3.6817F, -3.1933F, 0.9124F, 0.4562F, 0.4562F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(0.9124F, -3.6817F, -3.1933F, 0.9124F, 0.4562F, 0.4562F, new CubeDeformation(0.0F)).texOffs(0, 262)
						.addBox(-2.9196F, -4.0485F, -0.7299F, 5.8393F, 0.365F, 1.4598F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-2.5547F, -4.0485F, 0.7299F, 5.1094F, 0.365F, 0.7299F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-2.5547F, -4.0485F, -1.4598F, 5.1094F, 0.365F, 0.7299F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-2.1897F, -4.0485F, -1.8248F, 4.3794F, 0.365F, 0.365F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-2.1897F, -4.0485F, -2.1897F, 4.3794F, 0.365F, 0.3649F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(0.7299F, -4.0485F, 2.1897F, 0.7299F, 0.365F, 0.365F, new CubeDeformation(0.0F)).texOffs(0, 258)
						.addBox(-0.7299F, -4.0485F, -2.9196F, 1.4598F, 0.365F, 5.8393F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(-1.4598F, -4.0485F, 2.1897F, 0.7299F, 0.365F, 0.365F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-2.1897F, -4.0485F, 1.4598F, 4.3794F, 0.365F, 0.365F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-2.1897F, -4.0485F, 1.8248F, 4.3794F, 0.365F, 0.3649F, new CubeDeformation(0.0F)).texOffs(1, 263)
						.addBox(-1.4598F, -4.0485F, -2.5547F, 0.7299F, 0.365F, 0.365F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(0.7299F, -4.0485F, -2.5547F, 0.7299F, 0.365F, 0.365F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-2.3357F, -4.342F, -0.5839F, 4.6714F, 0.292F, 1.1679F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-2.0437F, -4.342F, 0.5839F, 4.0875F, 0.292F, 0.5839F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-2.0437F, -4.342F, -1.1679F, 4.0875F, 0.292F, 0.5839F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-1.7518F, -4.342F, -1.4598F, 3.5036F, 0.292F, 0.292F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-1.7518F, -4.342F, -1.7518F, 3.5036F, 0.292F, 0.292F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(0.5839F, -4.342F, 1.7518F, 0.5839F, 0.292F, 0.292F, new CubeDeformation(0.0F)).texOffs(0, 259)
						.addBox(-0.5839F, -4.342F, -2.3357F, 1.1679F, 0.292F, 4.6714F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(-1.1679F, -4.342F, 1.7518F, 0.5839F, 0.292F, 0.292F, new CubeDeformation(0.0F)).texOffs(0, 263)
						.addBox(-1.7518F, -4.342F, 1.1679F, 3.5036F, 0.292F, 0.292F, new CubeDeformation(0.0F)).texOffs(0, 263).addBox(-1.7518F, -4.342F, 1.4598F, 3.5036F, 0.292F, 0.292F, new CubeDeformation(0.0F)).texOffs(1, 263)
						.addBox(-1.1679F, -4.342F, -2.0437F, 0.5839F, 0.292F, 0.292F, new CubeDeformation(0.0F)).texOffs(1, 263).addBox(0.5839F, -4.342F, -2.0437F, 0.5839F, 0.292F, 0.292F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.8686F, -4.5628F, -0.4671F, 3.7371F, 0.2336F, 0.9343F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-1.635F, -4.5628F, 0.4671F, 3.27F, 0.2336F, 0.4671F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.635F, -4.5628F, -0.9343F, 3.27F, 0.2336F, 0.4671F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-1.4014F, -4.5628F, -1.1679F, 2.8028F, 0.2336F, 0.2336F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.4014F, -4.5628F, -1.4014F, 2.8028F, 0.2336F, 0.2336F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(0.4671F, -4.5628F, 1.4014F, 0.4671F, 0.2336F, 0.2336F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.4671F, -4.5628F, -1.8686F, 0.9343F, 0.2336F, 3.7371F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-0.9343F, -4.5628F, 1.4014F, 0.4671F, 0.2336F, 0.2336F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.4014F, -4.5628F, 0.9343F, 2.8028F, 0.2336F, 0.2336F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-1.4014F, -4.5628F, 1.1679F, 2.8028F, 0.2336F, 0.2336F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.9343F, -4.5628F, -1.635F, 0.4671F, 0.2336F, 0.2336F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(0.4671F, -4.5628F, -1.635F, 0.4671F, 0.2336F, 0.2336F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.4949F, -4.7395F, -0.3737F, 2.9897F, 0.1869F, 0.7474F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-1.308F, -4.7395F, 0.3737F, 2.616F, 0.1869F, 0.3737F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.308F, -4.7395F, -0.7474F, 2.616F, 0.1869F, 0.3737F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-1.1211F, -4.7395F, -0.9343F, 2.2423F, 0.1869F, 0.1869F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.1211F, -4.7395F, -1.1211F, 2.2423F, 0.1869F, 0.1869F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(0.3737F, -4.7395F, 1.1211F, 0.3737F, 0.1869F, 0.1868F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.3737F, -4.7395F, -1.4949F, 0.7474F, 0.1869F, 2.9897F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-0.7474F, -4.7395F, 1.1211F, 0.3737F, 0.1869F, 0.1868F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.1211F, -4.7395F, 0.7474F, 2.2423F, 0.1869F, 0.1869F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-1.1211F, -4.7395F, 0.9343F, 2.2423F, 0.1869F, 0.1869F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.7474F, -4.7395F, -1.308F, 0.3737F, 0.1869F, 0.1868F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(0.3737F, -4.7395F, -1.308F, 0.3737F, 0.1869F, 0.1868F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.1959F, -4.8708F, -0.299F, 2.3918F, 0.1495F, 0.5979F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-1.0464F, -4.8708F, 0.299F, 2.0928F, 0.1495F, 0.299F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-1.0464F, -4.8708F, -0.5979F, 2.0928F, 0.1495F, 0.299F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-0.8969F, -4.8708F, -0.7474F, 1.7938F, 0.1495F, 0.1495F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.8969F, -4.8708F, -0.8969F, 1.7938F, 0.1495F, 0.1495F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(0.299F, -4.8708F, 0.8969F, 0.299F, 0.1495F, 0.1495F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.299F, -4.8708F, -1.1959F, 0.5979F, 0.1495F, 2.3918F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-0.5979F, -4.8708F, 0.8969F, 0.299F, 0.1495F, 0.1495F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.8969F, -4.8708F, 0.5979F, 1.7938F, 0.1495F, 0.1495F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-0.8969F, -4.8708F, 0.7474F, 1.7938F, 0.1495F, 0.1495F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.5979F, -4.8708F, -1.0464F, 0.299F, 0.1495F, 0.1495F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(0.299F, -4.8708F, -1.0464F, 0.299F, 0.1495F, 0.1495F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.9567F, -4.9808F, -0.2392F, 1.9134F, 0.1196F, 0.4784F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-0.8371F, -4.9808F, 0.2392F, 1.6742F, 0.1196F, 0.2392F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.8371F, -4.9808F, -0.4783F, 1.6742F, 0.1196F, 0.2392F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-0.7175F, -4.9808F, -0.5979F, 1.4351F, 0.1196F, 0.1196F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.7175F, -4.9808F, -0.7175F, 1.4351F, 0.1196F, 0.1196F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(0.2392F, -4.9808F, 0.7175F, 0.2392F, 0.1196F, 0.1196F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.2392F, -4.9808F, -0.9567F, 0.4784F, 0.1196F, 1.9134F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-0.4783F, -4.9808F, 0.7175F, 0.2392F, 0.1196F, 0.1196F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.7175F, -4.9808F, 0.4783F, 1.4351F, 0.1196F, 0.1196F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(-0.7175F, -4.9808F, 0.5979F, 1.4351F, 0.1196F, 0.1196F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(-0.4783F, -4.9808F, -0.8371F, 0.2392F, 0.1196F, 0.1196F, new CubeDeformation(0.0F)).texOffs(0, 200).addBox(0.2392F, -4.9808F, -0.8371F, 0.2392F, 0.1196F, 0.1196F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.025F));
		PartDefinition Chains = AngelHat.addOrReplaceChild("Chains", CubeListBuilder.create(), PartPose.offset(0.25F, 8.0F, 0.025F));
		PartDefinition L1 = Chains.addOrReplaceChild("L1",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offset(8.55F, -5.975F, -0.275F));
		PartDefinition L2 = L1.addOrReplaceChild("L2",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L3 = L2.addOrReplaceChild("L3",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L4 = L3.addOrReplaceChild("L4",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L5 = L4.addOrReplaceChild("L5",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition L6 = L5.addOrReplaceChild("L6",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L7 = L6.addOrReplaceChild("L7",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L8 = L7.addOrReplaceChild("L8",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r1 = L8.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(0.0F, 0.375F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R1 = Chains.addOrReplaceChild("R1",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offset(-9.05F, -5.975F, -0.275F));
		PartDefinition R2 = R1.addOrReplaceChild("R2",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition R3 = R2.addOrReplaceChild("R3",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition R4 = R3.addOrReplaceChild("R4",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition R5 = R4.addOrReplaceChild("R5",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R6 = R5.addOrReplaceChild("R6",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition R7 = R6.addOrReplaceChild("R7",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition R8 = R7.addOrReplaceChild("R8",
				CubeListBuilder.create().texOffs(126, 124).addBox(-0.175F, -0.225F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F)).texOffs(126, 124).addBox(-0.175F, 0.175F, -0.025F, 0.35F, 0.05F, 0.05F, new CubeDeformation(0.025F))
						.texOffs(127, 124).addBox(0.175F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)).texOffs(127, 124).addBox(-0.225F, -0.175F, -0.025F, 0.05F, 0.35F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = R8.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.75F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.375F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Goggles = Head.addOrReplaceChild("Goggles",
				CubeListBuilder.create().texOffs(73, 68).addBox(-4.0F, -0.3581F, -3.0662F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.025F)).texOffs(26, 49).addBox(-4.025F, -0.3581F, -2.0912F, 0.025F, 2.0F, 8.05F, new CubeDeformation(0.0F))
						.texOffs(26, 49).addBox(4.0F, -0.3581F, -2.0912F, 0.025F, 2.0F, 8.05F, new CubeDeformation(0.0F)).texOffs(26, 57).addBox(-4.025F, -0.3581F, 5.9088F, 8.05F, 2.0F, 0.05F, new CubeDeformation(0.0F)).texOffs(26, 57)
						.addBox(-2.025F, -2.4081F, 5.9088F, 4.05F, 2.05F, 0.05F, new CubeDeformation(0.0F)).texOffs(18, 51).addBox(-2.025F, -2.4081F, -2.0912F, 4.05F, 0.05F, 8.05F, new CubeDeformation(0.0F)).texOffs(56, 64)
						.addBox(2.025F, -0.55F, -2.7F, 0.2F, 0.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(56, 64).addBox(-2.225F, -0.55F, -2.7F, 0.2F, 0.2F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.6419F, -1.9338F));
		PartDefinition cube_r3 = Goggles.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 57).addBox(-2.025F, -0.025F, -0.025F, 4.05F, 2.15F, 0.05F, new CubeDeformation(0.0F)),
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
		PartDefinition cube_r4 = R.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(-4.95F)).mirror(false),
				PartPose.offsetAndRotation(0.0112F, 0.0F, 4.7118F, -3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r5 = R.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(63, 76).addBox(-3.999F, -4.0F, 0.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(-3.0F)),
				PartPose.offsetAndRotation(0.0112F, 0.0F, 2.8618F, 0.0F, 3.1416F, 0.0F));
		PartDefinition RSign = R.addOrReplaceChild("RSign", CubeListBuilder.create(), PartPose.offset(-0.0013F, 0.0F, -0.1632F));
		PartDefinition cube_r6 = RSign.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 86).mirror().addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(-5.7F)).mirror(false),
				PartPose.offsetAndRotation(0.0125F, 0.05F, 5.7F, 3.1416F, 0.0F, 0.0F));
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
		PartDefinition cube_r7 = L.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(-4.95F)).mirror(false),
				PartPose.offsetAndRotation(0.0112F, 0.0F, 4.7118F, -3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r8 = L.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 76).addBox(-3.999F, -4.0F, 0.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(-3.0F)),
				PartPose.offsetAndRotation(0.0112F, 0.0F, 2.8618F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LSign = L.addOrReplaceChild("LSign", CubeListBuilder.create(), PartPose.offset(-0.0013F, 0.0F, -0.1632F));
		PartDefinition cube_r9 = LSign.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(64, 86).mirror().addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(-5.7F)).mirror(false),
				PartPose.offsetAndRotation(0.0125F, 0.05F, 5.7F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Muffs = Head.addOrReplaceChild("Muffs",
				CubeListBuilder.create().texOffs(14, 7).addBox(4.0053F, 0.2316F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(29, 10).addBox(4.0553F, 1.0316F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(37, 6)
						.addBox(4.0053F, -0.2684F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(26, 0).addBox(4.0053F, 0.2316F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.025F)).texOffs(29, 10)
						.addBox(-5.4947F, 1.0316F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(14, 7).addBox(-5.2947F, 0.2316F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(37, 6)
						.addBox(-4.7947F, -0.2684F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(26, 0).addBox(-4.7947F, 0.2316F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.025F)).texOffs(11, 54)
						.addBox(-4.3947F, -2.0184F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 54).addBox(-4.7697F, -2.5434F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(19, 54)
						.addBox(4.2303F, -2.5434F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(16, 54).addBox(-4.7947F, -2.4184F, 0.5F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 54)
						.addBox(-4.7947F, -2.4184F, -1.0F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 54).addBox(4.5053F, -2.4184F, -1.0F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 54)
						.addBox(4.5053F, -2.4184F, 0.5F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(11, 54).addBox(4.0053F, -2.0184F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 50)
						.addBox(-4.2447F, -2.1684F, -1.0F, 8.5F, 0.4F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 48).addBox(-4.6447F, -2.5684F, -1.0F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(20, 48)
						.addBox(-4.6447F, -2.5684F, 0.5F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0053F, -6.2316F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 80).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(16, 96).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Hood = Body.addOrReplaceChild("Hood", CubeListBuilder.create().texOffs(1, 69).addBox(-4.2513F, -0.1224F, -3.3532F, 8.5F, 2.0F, 6.925F, new CubeDeformation(0.0F)).texOffs(15, 74)
				.addBox(-4.2513F, 1.3026F, -1.8532F, 8.5F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-4.5263F, -1.6224F, -4.4032F, 9.05F, 2.525F, 9.05F, new CubeDeformation(0.0F)), PartPose.offset(0.0013F, -0.3776F, 1.3782F));
		PartDefinition cube_r10 = Hood.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 73).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0013F, 1.8091F, 2.726F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r11 = Hood.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(5, 71).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0013F, 1.8091F, -2.499F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r12 = Hood.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0078F, -1.7633F, 3.7968F, 1.5708F, -0.7854F, -1.5708F));
		PartDefinition cube_r13 = Hood.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0078F, -1.7633F, -3.5532F, 1.5708F, 0.7854F, -1.5708F));
		PartDefinition cube_r14 = Hood.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6672F, -1.7633F, 0.1218F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r15 = Hood.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6578F, -1.7633F, 0.1218F, 0.0F, 0.0F, -0.7854F));
		PartDefinition Hood2 = Body.addOrReplaceChild("Hood2", CubeListBuilder.create().texOffs(1, 69).addBox(-4.2513F, -0.1224F, -3.3532F, 8.5F, 2.0F, 6.925F, new CubeDeformation(0.0F)).texOffs(15, 74)
				.addBox(-4.2513F, 1.3026F, -1.8532F, 8.5F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-4.5263F, -1.6224F, -4.4032F, 9.05F, 2.525F, 9.05F, new CubeDeformation(0.0F)), PartPose.offset(0.0013F, -0.3776F, 1.3782F));
		PartDefinition cube_r16 = Hood2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(12, 73).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0013F, 1.8091F, 2.726F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r17 = Hood2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(5, 71).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0013F, 1.8091F, -2.499F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r18 = Hood2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0078F, -1.7633F, 3.7968F, 1.5708F, -0.7854F, -1.5708F));
		PartDefinition cube_r19 = Hood2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0078F, -1.7633F, -3.5532F, 1.5708F, 0.7854F, -1.5708F));
		PartDefinition cube_r20 = Hood2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6672F, -1.7633F, 0.1218F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r21 = Hood2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6578F, -1.7633F, 0.1218F, 0.0F, 0.0F, -0.7854F));
		PartDefinition Roughian = Body.addOrReplaceChild("Roughian", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.0F, 6.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition RoughianBody = Roughian.addOrReplaceChild("RoughianBody",
				CubeListBuilder.create().texOffs(80, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 32).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -0.7F, -1.3F));
		PartDefinition RoughianLeftArm = Roughian.addOrReplaceChild("RoughianLeftArm", CubeListBuilder.create(), PartPose.offset(7.0F, -1.0F, -0.3F));
		PartDefinition LeftArmLayer_r1 = RoughianLeftArm.addOrReplaceChild("LeftArmLayer_r1",
				CubeListBuilder.create().texOffs(112, 48).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(96, 48).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, -0.2618F));
		PartDefinition RoughianRightArm = Roughian.addOrReplaceChild("RoughianRightArm", CubeListBuilder.create(), PartPose.offset(-7.0F, -1.0F, -0.3F));
		PartDefinition RightArmLayer_r1 = RoughianRightArm.addOrReplaceChild("RightArmLayer_r1",
				CubeListBuilder.create().texOffs(104, 32).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(104, 16).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.2618F));
		PartDefinition RoughianLeftLeg = Roughian.addOrReplaceChild("RoughianLeftLeg", CubeListBuilder.create(), PartPose.offset(3.0F, 11.0F, -1.3F));
		PartDefinition LeftLegLayer_r1 = RoughianLeftLeg.addOrReplaceChild("LeftLegLayer_r1",
				CubeListBuilder.create().texOffs(64, 48).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(80, 48).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition RoughianRightLeg = Roughian.addOrReplaceChild("RoughianRightLeg", CubeListBuilder.create(), PartPose.offset(-3.0F, 11.0F, -1.3F));
		PartDefinition RightLegLayer_r1 = RoughianRightLeg.addOrReplaceChild("RightLegLayer_r1",
				CubeListBuilder.create().texOffs(64, 32).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(64, 16).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition Scarf = Body.addOrReplaceChild(
				"Scarf", CubeListBuilder.create().texOffs(3, 133).addBox(-4.25F, -0.5F, -3.475F, 8.5F, 2.0F, 6.925F, new CubeDeformation(0.05F)).texOffs(6, 136).addBox(-4.25F, 1.325F, -1.575F, 8.5F, 2.0F, 3.0F, new CubeDeformation(0.05F))
						.texOffs(2, 130).addBox(-4.525F, -2.6F, -4.525F, 9.05F, 3.125F, 9.05F, new CubeDeformation(0.05F)).texOffs(7, 135).addBox(-3.525F, -3.6F, -3.525F, 7.05F, 1.025F, 7.05F, new CubeDeformation(0.05F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r22 = Scarf.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 135).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, 2.6042F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r23 = Scarf.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(7, 135).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, -2.6208F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r24 = Scarf.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(4, 134).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0091F, -2.7409F, 3.675F, 1.5708F, -0.7854F, -1.5708F));
		PartDefinition cube_r25 = Scarf.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(4, 134).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0091F, -2.7409F, -3.675F, 1.5708F, 0.7854F, -1.5708F));
		PartDefinition cube_r26 = Scarf.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(4, 134).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-3.6659F, -2.7409F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r27 = Scarf.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(4, 134).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(3.6591F, -2.7409F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition ScarfFront = Scarf.addOrReplaceChild("ScarfFront", CubeListBuilder.create().texOffs(0, 4).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 1.6F, -3.4375F));
		PartDefinition RightScarf2 = ScarfFront.addOrReplaceChild("RightScarf2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.025F)), PartPose.offset(0.0F, 2.5F, 0.0F));
		PartDefinition RightScarf3 = RightScarf2.addOrReplaceChild("RightScarf3", CubeListBuilder.create().texOffs(0, 4).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 2.5F, 0.0F));
		PartDefinition RightScarf4 = RightScarf3.addOrReplaceChild("RightScarf4", CubeListBuilder.create().texOffs(0, 4).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.075F)), PartPose.offset(0.0F, 2.5F, 0.0F));
		PartDefinition RightScarf5 = RightScarf4.addOrReplaceChild("RightScarf5", CubeListBuilder.create().texOffs(0, 4).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 2.5F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 112).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(71, 103)
				.addBox(-1.0F, 7.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.675F)).texOffs(48, 112).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 80).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(40, 96)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)).texOffs(71, 110).addBox(-3.0F, 7.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.675F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 112).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(0, 112).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 80).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).texOffs(0, 96).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
				CubeListBuilder.create().texOffs(104, 103).addBox(-1.9F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)).texOffs(88, 103).addBox(-1.9F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.2F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
				CubeListBuilder.create().texOffs(104, 112).addBox(-2.1F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)).texOffs(88, 112).addBox(-2.1F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.2F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 304);
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
		this.LeftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}