package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class ChallengePlushChaosProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
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
					if (entity.getPersistentData().getDouble("plushtimeuntildeathforall") >= 40 && EngiesChaosModVariables.MapVariables.get(world).BYEBYE == false) {
						entity.getPersistentData().putDouble("plushtimeuntildeathforall", 0);
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(true, world.getServer());
						EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(1, () -> {
							entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("engies_chaos:challenge_plush_failed")))), 10000);
							EngiesChaosMod.queueServerWork(2, () -> {
								if (world instanceof ServerLevel _serverLevel)
									_serverLevel.getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(false, world.getServer());
							});
						});
					} else if (entity.getPersistentData().getDouble("plushtimeuntildeathforall") >= 20 && EngiesChaosModVariables.MapVariables.get(world).BYEBYE == true) {
						entity.getPersistentData().putDouble("plushtimeuntildeathforall", 0);
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(true, world.getServer());
						EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(1, () -> {
							entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("engies_chaos:challenge_plush_failed")))), 10000);
							EngiesChaosMod.queueServerWork(2, () -> {
								if (world instanceof ServerLevel _serverLevel)
									_serverLevel.getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(false, world.getServer());
							});
						});
					}
				}
			}
		}
	}
}