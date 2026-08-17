package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.DDayLightningSpawnerEntity;

@Mod.EventBusSubscriber
public class ThunderstormChaosProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == false && EngiesChaosModVariables.MapVariables.get(world).sddaystart == false && EngiesChaosModVariables.MapVariables.get(world).thestart == false
					&& EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == false) {
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING) == true) {
					EngiesChaosModVariables.MapVariables.get(world).extremelightningcd = EngiesChaosModVariables.MapVariables.get(world).extremelightningcd + 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).extremelightningcd >= 1.25) {
						EngiesChaosModVariables.MapVariables.get(world).extremelightningcd = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new DDayLightningSpawnerEntity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER.get(), _level);
								entityToSpawn.moveTo(
										((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), -96, 96)),
										((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY),
										((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), -96, 96)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == true) {
					EngiesChaosModVariables.MapVariables.get(world).heavylightningcd = EngiesChaosModVariables.MapVariables.get(world).heavylightningcd + 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).heavylightningcd >= 2.5) {
						EngiesChaosModVariables.MapVariables.get(world).heavylightningcd = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new DDayLightningSpawnerEntity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER.get(), _level);
								entityToSpawn.moveTo(
										((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), -96, 96)),
										((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY),
										((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), -96, 96)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		}
	}
}