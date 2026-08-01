package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModDamageSources;
import engiegames.engieschaos.EngiesChaosMod;

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
			if (EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain == false) {
					entity.getPersistentData().putDouble("plushtimeuntildeathforall", (entity.getPersistentData().getDouble("plushtimeuntildeathforall") + 0.05));
					if (entity.getPersistentData().getDouble("plushtimeuntildeathforall") >= 20 && EngiesChaosModVariables.MapVariables.get(world).BYEBYE == false) {
						entity.getPersistentData().putDouble("plushtimeuntildeathforall", 0);
						world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(true, world.getServer());
						EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(1, () -> {
							entity.hurt(EngiesChaosModDamageSources.CHALLENGE_PLUSH_FAILED, 10000);
							EngiesChaosMod.queueServerWork(2, () -> {
								world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(false, world.getServer());
							});
						});
					}
					if (entity.getPersistentData().getDouble("plushtimeuntildeathforall") >= 10 && EngiesChaosModVariables.MapVariables.get(world).BYEBYE == true) {
						entity.getPersistentData().putDouble("plushtimeuntildeathforall", 0);
						world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(true, world.getServer());
						EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(1, () -> {
							entity.hurt(EngiesChaosModDamageSources.CHALLENGE_PLUSH_FAILED, 10000);
							EngiesChaosMod.queueServerWork(2, () -> {
								world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(false, world.getServer());
							});
						});
					}
				}
			}
		}
	}
}