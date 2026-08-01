package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.DDayLightningSpawnerEntity;
import engiegames.engies_chaos.client.model.Modelmissilebombs;

public class DDayLightningSpawnerRenderer extends MobRenderer<DDayLightningSpawnerEntity, LivingEntityRenderState, Modelmissilebombs> {
	private DDayLightningSpawnerEntity entity = null;

	public DDayLightningSpawnerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DDayLightningSpawnerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("engies_chaos:textures/entities/lightningspawner.png");
	}
}