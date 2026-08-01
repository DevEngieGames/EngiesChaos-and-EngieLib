package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.AngryDeathSharkoEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyo;

import com.mojang.blaze3d.vertex.PoseStack;

public class AngryDeathSharkoRenderer extends MobRenderer<AngryDeathSharkoEntity, Modelboyo<AngryDeathSharkoEntity>> {
	public AngryDeathSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo<AngryDeathSharkoEntity>(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(AngryDeathSharkoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AngryDeathSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/angrydeathboyountamed.png");
	}
}