package engiegames.engieschaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.procedures.ReturnAvaSizeProcedure;
import engiegames.engieschaos.entity.DDayAvalancheEntity;
import engiegames.engieschaos.client.model.Modelavalanche_ball;

import com.mojang.blaze3d.vertex.PoseStack;

public class DDayAvalancheRenderer extends MobRenderer<DDayAvalancheEntity, Modelavalanche_ball<DDayAvalancheEntity>> {
	public DDayAvalancheRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelavalanche_ball<DDayAvalancheEntity>(context.bakeLayer(Modelavalanche_ball.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(DDayAvalancheEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) ReturnAvaSizeProcedure.execute(entity);
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(DDayAvalancheEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/avaball.png");
	}
}