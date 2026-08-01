package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.MonstrosityDeathSharkoEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyo;

import com.mojang.blaze3d.vertex.PoseStack;

public class MonstrosityDeathSharkoRenderer extends MobRenderer<MonstrosityDeathSharkoEntity, Modelboyo<MonstrosityDeathSharkoEntity>> {
	public MonstrosityDeathSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo<MonstrosityDeathSharkoEntity>(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(MonstrosityDeathSharkoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MonstrosityDeathSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/monstrositydeathboyountamed.png");
	}
}