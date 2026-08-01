package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerDiesChallengeProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == true) {
			if (entity instanceof Player) {
				if (AllaboutengieModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain == false) {
					AllaboutengieModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					entity.getPersistentData().putDouble("plushtimeuntildeathforall", 0);
				}
			}
		}
	}
}