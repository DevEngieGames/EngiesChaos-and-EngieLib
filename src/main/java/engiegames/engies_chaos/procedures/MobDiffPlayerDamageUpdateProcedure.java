package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.XEngieGamesEntity;

@Mod.EventBusSubscriber
public class MobDiffPlayerDamageUpdateProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525) {
				if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity1.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(525);
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 690) {
				if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity2.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(690);
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525000) {
				if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity3.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(525000);
			} else {
				if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity4.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(1);
			}
		} else if (entity instanceof XEngieGamesEntity) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525) {
				if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity6.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(525);
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 690) {
				if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity7.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(690);
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525000) {
				if (entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity8.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(525000);
			} else {
				if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity9.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(1);
			}
		}
	}
}