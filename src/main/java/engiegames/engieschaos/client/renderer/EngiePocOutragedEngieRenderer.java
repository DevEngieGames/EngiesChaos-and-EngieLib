package engiegames.engieschaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.procedures.MobModelScalingProcedure;
import engiegames.engieschaos.entity.EngiePocOutragedEngieEntity;
import engiegames.engieschaos.client.model.Modelengiepochostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class EngiePocOutragedEngieRenderer extends MobRenderer<EngiePocOutragedEngieEntity, Modelengiepochostile<EngiePocOutragedEngieEntity>> {
	public EngiePocOutragedEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengiepochostile<EngiePocOutragedEngieEntity>(context.bakeLayer(Modelengiepochostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(EngiePocOutragedEngieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(EngiePocOutragedEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/engiepocoutragedengie.png");
	}
}