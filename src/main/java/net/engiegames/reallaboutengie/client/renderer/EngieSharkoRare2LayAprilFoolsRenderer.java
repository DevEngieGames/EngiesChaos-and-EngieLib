package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.EngieSharkoRare2LayAprilFoolsEntity;
import net.engiegames.reallaboutengie.client.model.Modelboyoaprilfoolssit;

public class EngieSharkoRare2LayAprilFoolsRenderer extends MobRenderer<EngieSharkoRare2LayAprilFoolsEntity, Modelboyoaprilfoolssit<EngieSharkoRare2LayAprilFoolsEntity>> {
	public EngieSharkoRare2LayAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssit<EngieSharkoRare2LayAprilFoolsEntity>(context.bakeLayer(Modelboyoaprilfoolssit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2LayAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyorare2aprilfirstt.png");
	}
}