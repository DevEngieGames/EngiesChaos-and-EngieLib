package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModDamageSources;
import net.engiegames.reallaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChallengePlushChaosProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain == false) {
					entity.getPersistentData().putDouble("plushtimeuntildeathforall", (entity.getPersistentData().getDouble("plushtimeuntildeathforall") + 0.05));
					if (entity.getPersistentData().getDouble("plushtimeuntildeathforall") >= 20 && AllaboutengieModVariables.MapVariables.get(world).BYEBYE == false) {
						entity.getPersistentData().putDouble("plushtimeuntildeathforall", 0);
						world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(true, world.getServer());
						AllaboutengieModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(AllaboutengieModDamageSources.CHALLENGE_PLUSH_FAILED, 10000);
							AllaboutengieMod.queueServerWork(2, () -> {
								world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(false, world.getServer());
							});
						});
					}
					if (entity.getPersistentData().getDouble("plushtimeuntildeathforall") >= 10 && AllaboutengieModVariables.MapVariables.get(world).BYEBYE == true) {
						entity.getPersistentData().putDouble("plushtimeuntildeathforall", 0);
						world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(true, world.getServer());
						AllaboutengieModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(AllaboutengieModDamageSources.CHALLENGE_PLUSH_FAILED, 10000);
							AllaboutengieMod.queueServerWork(2, () -> {
								world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(false, world.getServer());
							});
						});
					}
				}
			}
		}
	}
}